package com.amplitude.api;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class DatabaseHelper extends SQLiteOpenHelper {
    private static final String CREATE_EVENTS_TABLE = "CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);";
    private static final String CREATE_IDENTIFYS_TABLE = "CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);";
    private static final String CREATE_IDENTIFY_INTERCEPTOR_TABLE = "CREATE TABLE IF NOT EXISTS identify_interceptor (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);";
    private static final String CREATE_LONG_STORE_TABLE = "CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);";
    private static final String CREATE_STORE_TABLE = "CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);";
    private static final String EVENT_FIELD = "event";
    protected static final String EVENT_TABLE_NAME = "events";
    protected static final String IDENTIFY_INTERCEPTOR_TABLE_NAME = "identify_interceptor";
    protected static final String IDENTIFY_TABLE_NAME = "identifys";
    private static final String ID_FIELD = "id";
    private static final String KEY_FIELD = "key";
    protected static final String LONG_STORE_TABLE_NAME = "long_store";
    protected static final String STORE_TABLE_NAME = "store";
    private static final String TAG = "com.amplitude.api.DatabaseHelper";
    private static final String VALUE_FIELD = "value";
    static final Map<String, DatabaseHelper> instances = new HashMap();
    private static final AmplitudeLog logger = AmplitudeLog.getLogger();
    private boolean callResetListenerOnDatabaseReset;
    private DatabaseResetListener databaseResetListener;
    File file;
    private String instanceName;

    @Deprecated
    static DatabaseHelper getDatabaseHelper(Context context) {
        return getDatabaseHelper(context, null);
    }

    static synchronized DatabaseHelper getDatabaseHelper(Context context, String str) {
        DatabaseHelper databaseHelper;
        synchronized (DatabaseHelper.class) {
            String normalizeInstanceName = Utils.normalizeInstanceName(str);
            Map<String, DatabaseHelper> map = instances;
            databaseHelper = map.get(normalizeInstanceName);
            if (databaseHelper == null) {
                databaseHelper = new DatabaseHelper(context.getApplicationContext(), normalizeInstanceName);
                map.put(normalizeInstanceName, databaseHelper);
            }
        }
        return databaseHelper;
    }

    private static String getDatabaseName(String str) {
        if (Utils.isEmptyString(str) || str.equals(Constants.DEFAULT_INSTANCE)) {
            return "com.amplitude.api";
        }
        return "com.amplitude.api_" + str;
    }

    protected DatabaseHelper(Context context) {
        this(context, null);
    }

    protected DatabaseHelper(Context context, String str) {
        super(context, getDatabaseName(str), (SQLiteDatabase.CursorFactory) null, 4);
        this.callResetListenerOnDatabaseReset = true;
        this.file = context.getDatabasePath(getDatabaseName(str));
        this.instanceName = Utils.normalizeInstanceName(str);
    }

    void setDatabaseResetListener(DatabaseResetListener databaseResetListener) {
        this.databaseResetListener = databaseResetListener;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(CREATE_STORE_TABLE);
        sQLiteDatabase.execSQL(CREATE_LONG_STORE_TABLE);
        sQLiteDatabase.execSQL(CREATE_EVENTS_TABLE);
        sQLiteDatabase.execSQL(CREATE_IDENTIFYS_TABLE);
        sQLiteDatabase.execSQL(CREATE_IDENTIFY_INTERCEPTOR_TABLE);
        DatabaseResetListener databaseResetListener = this.databaseResetListener;
        if (databaseResetListener == null || !this.callResetListenerOnDatabaseReset) {
            return;
        }
        try {
            this.callResetListenerOnDatabaseReset = false;
            databaseResetListener.onDatabaseReset(sQLiteDatabase);
        } catch (SQLiteException e) {
            logger.e(TAG, String.format("databaseReset callback failed during onCreate", new Object[0]), e);
        } finally {
            this.callResetListenerOnDatabaseReset = true;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            logger.e(TAG, "onUpgrade() with invalid oldVersion and newVersion");
            resetDatabase(sQLiteDatabase);
            return;
        }
        if (i2 <= 1) {
            return;
        }
        if (i == 1) {
            sQLiteDatabase.execSQL(CREATE_STORE_TABLE);
            if (i2 <= 2) {
                return;
            }
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    logger.e(TAG, "onUpgrade() with unknown oldVersion " + i);
                    resetDatabase(sQLiteDatabase);
                    return;
                }
                return;
            }
            sQLiteDatabase.execSQL(CREATE_IDENTIFY_INTERCEPTOR_TABLE);
        }
        sQLiteDatabase.execSQL(CREATE_IDENTIFYS_TABLE);
        sQLiteDatabase.execSQL(CREATE_LONG_STORE_TABLE);
        if (i2 <= 3) {
            return;
        }
        sQLiteDatabase.execSQL(CREATE_IDENTIFY_INTERCEPTOR_TABLE);
    }

    private void resetDatabase(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS long_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS identifys");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS identify_interceptor");
        onCreate(sQLiteDatabase);
    }

    synchronized long insertOrReplaceKeyValue(String str, String str2) {
        long insertOrReplaceKeyValueToTable;
        if (str2 == null) {
            insertOrReplaceKeyValueToTable = deleteKeyFromTable(STORE_TABLE_NAME, str);
        } else {
            insertOrReplaceKeyValueToTable = insertOrReplaceKeyValueToTable(STORE_TABLE_NAME, str, str2);
        }
        return insertOrReplaceKeyValueToTable;
    }

    synchronized long insertOrReplaceKeyLongValue(String str, Long l) {
        long insertOrReplaceKeyValueToTable;
        if (l == null) {
            insertOrReplaceKeyValueToTable = deleteKeyFromTable(LONG_STORE_TABLE_NAME, str);
        } else {
            insertOrReplaceKeyValueToTable = insertOrReplaceKeyValueToTable(LONG_STORE_TABLE_NAME, str, l);
        }
        return insertOrReplaceKeyValueToTable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r0.isOpen() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0033, code lost:
    
        if (r0.isOpen() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    synchronized long insertOrReplaceKeyValueToTable(String str, String str2, Object obj) {
        long j;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = getWritableDatabase();
                j = insertOrReplaceKeyValueToTable(sQLiteDatabase, str, str2, obj);
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    close();
                }
            } catch (SQLiteException e) {
                logger.e(TAG, String.format("insertOrReplaceKeyValue in %s failed", str), e);
                delete();
                if (sQLiteDatabase != null) {
                }
                j = -1;
                return j;
            } catch (StackOverflowError e2) {
                logger.e(TAG, String.format("insertOrReplaceKeyValue in %s failed", str), e2);
                delete();
                if (sQLiteDatabase != null) {
                }
                j = -1;
                return j;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                close();
            }
            throw th;
        }
        return j;
    }

    synchronized long insertOrReplaceKeyValueToTable(SQLiteDatabase sQLiteDatabase, String str, String str2, Object obj) throws SQLiteException, StackOverflowError {
        long insertKeyValueContentValuesIntoTable;
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str2);
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            contentValues.put("value", (String) obj);
        }
        insertKeyValueContentValuesIntoTable = insertKeyValueContentValuesIntoTable(sQLiteDatabase, str, contentValues);
        if (insertKeyValueContentValuesIntoTable == -1) {
            logger.w(TAG, "Insert failed");
        }
        return insertKeyValueContentValuesIntoTable;
    }

    synchronized long insertKeyValueContentValuesIntoTable(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws SQLiteException, StackOverflowError {
        return sQLiteDatabase.insertWithOnConflict(str, null, contentValues, 5);
    }

    synchronized long deleteKeyFromTable(String str, String str2) {
        long j;
        try {
            try {
                try {
                    j = getWritableDatabase().delete(str, "key=?", new String[]{str2});
                } catch (StackOverflowError e) {
                    logger.e(TAG, String.format("deleteKey from %s failed", str), e);
                    delete();
                    close();
                    j = -1;
                    return j;
                }
            } catch (SQLiteException e2) {
                logger.e(TAG, String.format("deleteKey from %s failed", str), e2);
                delete();
                close();
                j = -1;
                return j;
            }
        } finally {
            close();
        }
        return j;
    }

    synchronized long addEvent(String str) {
        return addEventToTable(EVENT_TABLE_NAME, str);
    }

    synchronized long addIdentify(String str) {
        return addEventToTable(IDENTIFY_TABLE_NAME, str);
    }

    synchronized long addIdentifyInterceptor(String str) {
        return addEventToTable(IDENTIFY_INTERCEPTOR_TABLE_NAME, str);
    }

    private synchronized long addEventToTable(String str, String str2) {
        long j;
        long j2 = -1;
        try {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("event", str2);
                j = insertEventContentValuesIntoTable(writableDatabase, str, contentValues);
                if (j == -1) {
                    try {
                        logger.w(TAG, String.format("Insert into %s failed", str));
                    } catch (SQLiteException e) {
                        e = e;
                        j2 = j;
                        logger.e(TAG, String.format("addEvent to %s failed", str), e);
                        delete();
                        close();
                        j = j2;
                        return j;
                    } catch (StackOverflowError e2) {
                        e = e2;
                        j2 = j;
                        logger.e(TAG, String.format("addEvent to %s failed", str), e);
                        delete();
                        close();
                        j = j2;
                        return j;
                    }
                }
            } finally {
                close();
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (StackOverflowError e4) {
            e = e4;
        }
        return j;
    }

    synchronized long insertEventContentValuesIntoTable(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws SQLiteException, StackOverflowError {
        return sQLiteDatabase.insert(str, null, contentValues);
    }

    synchronized String getValue(String str) {
        return (String) getValueFromTable(STORE_TABLE_NAME, str);
    }

    synchronized Long getLongValue(String str) {
        return (Long) getValueFromTable(LONG_STORE_TABLE_NAME, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r13 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        if (r13 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r13 != null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #10 {, blocks: (B:18:0x0072, B:22:0x006f, B:53:0x00b8, B:54:0x00bb, B:55:0x00be), top: B:3:0x0002 }] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected synchronized Object getValueFromTable(String str, String str2) {
        String str3;
        Throwable th;
        StackOverflowError stackOverflowError;
        Cursor cursor;
        RuntimeException runtimeException;
        IllegalStateException illegalStateException;
        SQLiteException sQLiteException;
        Object obj;
        ?? r1 = 0;
        obj = null;
        obj = null;
        obj = null;
        obj = null;
        obj = null;
        obj = null;
        obj = null;
        obj = null;
        obj = null;
        try {
            try {
                str3 = str;
            } catch (Throwable th2) {
                th = th2;
                r1 = str;
                if (r1 != 0) {
                    r1.close();
                }
                close();
                throw th;
            }
            try {
                cursor = queryDb(getReadableDatabase(), str3, new String[]{"key", "value"}, "key = ?", new String[]{str2}, null, null, null, null);
                try {
                    if (cursor.moveToFirst()) {
                        obj = str3.equals(STORE_TABLE_NAME) ? cursor.getString(1) : Long.valueOf(cursor.getLong(1));
                    }
                } catch (SQLiteException e) {
                    sQLiteException = e;
                    logger.e(TAG, String.format("getValue from %s failed", str3), sQLiteException);
                    delete();
                } catch (IllegalStateException e2) {
                    illegalStateException = e2;
                    handleIfCursorRowTooLargeException(illegalStateException);
                } catch (RuntimeException e3) {
                    runtimeException = e3;
                    convertIfCursorWindowException(runtimeException);
                    if (cursor != null) {
                        cursor.close();
                    }
                    close();
                    return obj;
                } catch (StackOverflowError e4) {
                    stackOverflowError = e4;
                    logger.e(TAG, String.format("getValue from %s failed", str3), stackOverflowError);
                    delete();
                    if (cursor != null) {
                        cursor.close();
                    }
                    close();
                    return obj;
                }
            } catch (SQLiteException e5) {
                e = e5;
                sQLiteException = e;
                cursor = null;
                logger.e(TAG, String.format("getValue from %s failed", str3), sQLiteException);
                delete();
            } catch (IllegalStateException e6) {
                e = e6;
                illegalStateException = e;
                cursor = null;
                handleIfCursorRowTooLargeException(illegalStateException);
            } catch (RuntimeException e7) {
                e = e7;
                runtimeException = e;
                cursor = null;
                convertIfCursorWindowException(runtimeException);
                if (cursor != null) {
                }
                close();
                return obj;
            } catch (StackOverflowError e8) {
                e = e8;
                stackOverflowError = e;
                cursor = null;
                logger.e(TAG, String.format("getValue from %s failed", str3), stackOverflowError);
                delete();
                if (cursor != null) {
                }
                close();
                return obj;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                if (r1 != 0) {
                }
                close();
                throw th;
            }
        } catch (SQLiteException e9) {
            e = e9;
            str3 = str;
        } catch (IllegalStateException e10) {
            e = e10;
        } catch (RuntimeException e11) {
            e = e11;
        } catch (StackOverflowError e12) {
            e = e12;
            str3 = str;
        } catch (Throwable th4) {
            th = th4;
        }
        return obj;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    synchronized List<JSONObject> getEvents(long j, long j2) throws JSONException {
        try {
            return getEventsFromTable(EVENT_TABLE_NAME, j, j2);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    synchronized List<JSONObject> getIdentifys(long j, long j2) throws JSONException {
        try {
            return getEventsFromTable(IDENTIFY_TABLE_NAME, j, j2);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    synchronized List<JSONObject> getIdentifyInterceptors(long j, long j2) throws JSONException {
        try {
            return getEventsFromTable(IDENTIFY_INTERCEPTOR_TABLE_NAME, j, j2);
        } catch (Throwable th) {
            throw th;
        }
    }

    protected synchronized List<JSONObject> getEventsFromTable(String str, long j, long j2) throws JSONException {
        try {
            try {
            } catch (CursorWindowAllocationException unused) {
                return getEventsRowByRowFromTable(str, j, j2);
            }
        } catch (Throwable th) {
            th = th;
            while (true) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return getEventsBatchFromTable(str, j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:
    
        if (r8 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        if (r8 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<JSONObject> getEventsBatchFromTable(String str, long j, long j2) throws JSONException {
        DatabaseHelper databaseHelper;
        DatabaseHelper databaseHelper2;
        String str2;
        String str3;
        LinkedList linkedList = new LinkedList();
        Cursor cursor = null;
        try {
            try {
                try {
                    try {
                        try {
                            SQLiteDatabase readableDatabase = getReadableDatabase();
                            String[] strArr = {"id", "event"};
                            if (j >= 0) {
                                str2 = "id <= " + j;
                            } else {
                                str2 = null;
                            }
                            if (j2 >= 0) {
                                str3 = "" + j2;
                            } else {
                                str3 = null;
                            }
                            databaseHelper = this;
                            cursor = databaseHelper.queryDb(readableDatabase, str, strArr, str2, null, null, null, "id ASC", str3);
                            while (cursor.moveToNext()) {
                                long j3 = cursor.getLong(0);
                                String string = cursor.getString(1);
                                if (!Utils.isEmptyString(string)) {
                                    JSONObject jSONObject = new JSONObject(string);
                                    jSONObject.put("event_id", j3);
                                    linkedList.add(jSONObject);
                                }
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            close();
                            return linkedList;
                        } catch (Throwable th) {
                            th = th;
                            databaseHelper = this;
                            if (cursor != null) {
                                cursor.close();
                            }
                            databaseHelper.close();
                            throw th;
                        }
                    } catch (IllegalStateException e) {
                        databaseHelper2 = this;
                        databaseHelper2.handleIfCursorRowTooLargeException(e);
                    }
                } catch (SQLiteException e2) {
                    databaseHelper2 = this;
                    logger.e(TAG, String.format("getEvents from %s failed", str), e2);
                    databaseHelper2.delete();
                }
            } catch (RuntimeException e3) {
                convertIfCursorWindowException(e3);
                if (cursor != null) {
                    cursor.close();
                }
                close();
                return linkedList;
            } catch (StackOverflowError e4) {
                databaseHelper2 = this;
                logger.e(TAG, String.format("getEvents from %s failed", str), e4);
                databaseHelper2.delete();
                if (cursor != null) {
                    cursor.close();
                }
                databaseHelper2.close();
                return linkedList;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r13 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
    
        if (r13 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0073, code lost:
    
        if (r13 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7 A[Catch: all -> 0x00cf, TryCatch #5 {all -> 0x00cf, blocks: (B:17:0x00a8, B:18:0x00b1, B:20:0x00b7, B:23:0x00c7), top: B:16:0x00a8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<JSONObject> getEventsRowByRowFromTable(String str, long j, long j2) throws JSONException {
        Iterator it;
        String str2;
        String str3;
        LinkedList linkedList = new LinkedList();
        Cursor cursor = null;
        try {
            try {
                try {
                    try {
                        SQLiteDatabase readableDatabase = getReadableDatabase();
                        String[] strArr = {"id"};
                        if (j >= 0) {
                            str2 = "id <= " + j;
                        } else {
                            str2 = null;
                        }
                        if (j2 >= 0) {
                            str3 = "" + j2;
                        } else {
                            str3 = null;
                        }
                        cursor = queryDb(readableDatabase, str, strArr, str2, null, null, null, "id ASC", str3);
                        while (cursor.moveToNext()) {
                            linkedList.add(Long.valueOf(cursor.getLong(0)));
                        }
                    } catch (SQLiteException e) {
                        logger.e(TAG, String.format("getEvents from %s failed", str), e);
                        delete();
                    }
                } catch (StackOverflowError e2) {
                    logger.e(TAG, String.format("getEvents from %s failed", str), e2);
                    delete();
                    if (cursor != null) {
                        cursor.close();
                    }
                    close();
                    try {
                        LinkedList linkedList2 = new LinkedList();
                        it = linkedList.iterator();
                        while (it.hasNext()) {
                            JSONObject eventFromTable = getEventFromTable(str, ((Long) it.next()).longValue());
                            if (eventFromTable != null) {
                                linkedList2.add(eventFromTable);
                            }
                        }
                        return linkedList2;
                    } finally {
                        close();
                    }
                }
            } catch (IllegalStateException e3) {
                handleIfCursorRowTooLargeException(e3);
            } catch (RuntimeException e4) {
                convertIfCursorWindowException(e4);
                if (cursor != null) {
                    cursor.close();
                }
                close();
                LinkedList linkedList22 = new LinkedList();
                it = linkedList.iterator();
                while (it.hasNext()) {
                }
                return linkedList22;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cd, code lost:
    
        if (r1 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r1 != null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6 A[Catch: all -> 0x0093, TRY_ENTER, TryCatch #9 {, blocks: (B:30:0x008f, B:49:0x0050, B:53:0x00d6, B:54:0x00d9), top: B:4:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[Catch: all -> 0x0093, SYNTHETIC, TryCatch #9 {, blocks: (B:30:0x008f, B:49:0x0050, B:53:0x00d6, B:54:0x00d9), top: B:4:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected synchronized JSONObject getEventFromTable(String str, long j) throws JSONException {
        String str2;
        Throwable th;
        StackOverflowError stackOverflowError;
        JSONObject jSONObject;
        RuntimeException runtimeException;
        IllegalStateException illegalStateException;
        SQLiteException sQLiteException;
        JSONObject jSONObject2;
        Cursor cursor = null;
        jSONObject2 = null;
        jSONObject2 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        Cursor cursor2 = null;
        try {
            try {
                str2 = str;
                try {
                    Cursor queryDb = queryDb(getReadableDatabase(), str2, new String[]{"event"}, "id = " + j, null, null, null, null, null);
                    try {
                        try {
                            if (queryDb.moveToFirst()) {
                                String string = queryDb.getString(0);
                                if (!Utils.isEmptyString(string)) {
                                    jSONObject = new JSONObject(string);
                                    try {
                                        jSONObject.put("event_id", j);
                                        jSONObject2 = jSONObject;
                                    } catch (SQLiteException e) {
                                        sQLiteException = e;
                                        cursor2 = queryDb;
                                        logger.e(TAG, String.format("getEvent from %s failed", str2), sQLiteException);
                                        delete();
                                    } catch (IllegalStateException e2) {
                                        illegalStateException = e2;
                                        cursor2 = queryDb;
                                        handleIfCursorRowTooLargeException(illegalStateException);
                                    } catch (RuntimeException e3) {
                                        runtimeException = e3;
                                        cursor2 = queryDb;
                                        convertIfCursorWindowException(runtimeException);
                                        if (cursor2 != null) {
                                        }
                                        jSONObject2 = jSONObject;
                                        return jSONObject2;
                                    } catch (StackOverflowError e4) {
                                        stackOverflowError = e4;
                                        cursor2 = queryDb;
                                        logger.e(TAG, String.format("getEvent from %s failed", str2), stackOverflowError);
                                        delete();
                                        if (cursor2 != null) {
                                        }
                                        jSONObject2 = jSONObject;
                                        return jSONObject2;
                                    }
                                }
                            }
                            if (queryDb != null) {
                                queryDb.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = queryDb;
                            if (cursor != null) {
                            }
                        }
                    } catch (SQLiteException e5) {
                        sQLiteException = e5;
                        jSONObject = null;
                    } catch (IllegalStateException e6) {
                        illegalStateException = e6;
                        jSONObject = null;
                    } catch (RuntimeException e7) {
                        runtimeException = e7;
                        jSONObject = null;
                    } catch (StackOverflowError e8) {
                        stackOverflowError = e8;
                        jSONObject = null;
                    }
                } catch (SQLiteException e9) {
                    e = e9;
                    sQLiteException = e;
                    jSONObject = null;
                    logger.e(TAG, String.format("getEvent from %s failed", str2), sQLiteException);
                    delete();
                } catch (IllegalStateException e10) {
                    e = e10;
                    illegalStateException = e;
                    jSONObject = null;
                    handleIfCursorRowTooLargeException(illegalStateException);
                } catch (RuntimeException e11) {
                    e = e11;
                    runtimeException = e;
                    jSONObject = null;
                    convertIfCursorWindowException(runtimeException);
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    jSONObject2 = jSONObject;
                    return jSONObject2;
                } catch (StackOverflowError e12) {
                    e = e12;
                    stackOverflowError = e;
                    jSONObject = null;
                    logger.e(TAG, String.format("getEvent from %s failed", str2), stackOverflowError);
                    delete();
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    jSONObject2 = jSONObject;
                    return jSONObject2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                if (cursor != null) {
                    cursor.close();
                    throw th;
                }
                throw th;
            }
        } catch (SQLiteException e13) {
            e = e13;
            str2 = str;
        } catch (IllegalStateException e14) {
            e = e14;
        } catch (RuntimeException e15) {
            e = e15;
        } catch (StackOverflowError e16) {
            e = e16;
            str2 = str;
        } catch (Throwable th4) {
            th = th4;
            th = th;
            if (cursor != null) {
            }
        }
        return jSONObject2;
    }

    synchronized long getEventCount() {
        return getEventCountFromTable(EVENT_TABLE_NAME);
    }

    synchronized long getIdentifyCount() {
        return getEventCountFromTable(IDENTIFY_TABLE_NAME);
    }

    synchronized long getTotalEventCount() {
        return getEventCount() + getIdentifyCount();
    }

    synchronized long getIdentifyInterceptorCount() {
        return getEventCountFromTable(IDENTIFY_INTERCEPTOR_TABLE_NAME);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r1 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r1 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized long getEventCountFromTable(String str) {
        long j;
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                try {
                    sQLiteStatement = getReadableDatabase().compileStatement("SELECT COUNT(*) FROM " + str);
                    j = sQLiteStatement.simpleQueryForLong();
                    if (sQLiteStatement != null) {
                        sQLiteStatement.close();
                    }
                    close();
                } catch (StackOverflowError e) {
                    logger.e(TAG, String.format("getNumberRows for %s failed", str), e);
                    delete();
                }
            } catch (SQLiteException e2) {
                logger.e(TAG, String.format("getNumberRows for %s failed", str), e2);
                delete();
            }
        } catch (Throwable th) {
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            close();
            throw th;
        }
        return j;
    }

    synchronized long getNthEventId(long j) {
        return getNthEventIdFromTable(EVENT_TABLE_NAME, j);
    }

    synchronized long getNthIdentifyId(long j) {
        return getNthEventIdFromTable(IDENTIFY_TABLE_NAME, j);
    }

    synchronized long getLastIdentifyInterceptorId() {
        return getNthEventIdFromTable(IDENTIFY_INTERCEPTOR_TABLE_NAME, 1L, "DESC");
    }

    private synchronized long getNthEventIdFromTable(String str, long j) {
        return getNthEventIdFromTable(str, j, "ASC");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (0 == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized long getNthEventIdFromTable(String str, long j, String str2) {
        long j2;
        j2 = -1;
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                try {
                    sQLiteStatement = getReadableDatabase().compileStatement("SELECT id FROM " + str + " ORDER BY id " + str2 + " LIMIT 1 OFFSET " + (j - 1));
                    try {
                        j2 = sQLiteStatement.simpleQueryForLong();
                    } catch (SQLiteDoneException e) {
                        logger.w(TAG, e);
                    }
                } catch (StackOverflowError e2) {
                    logger.e(TAG, String.format("getNthEventId from %s failed", str), e2);
                    delete();
                    if (0 != 0) {
                    }
                    return j2;
                }
            } catch (SQLiteException e3) {
                logger.e(TAG, String.format("getNthEventId from %s failed", str), e3);
                delete();
            }
        } finally {
            if (0 != 0) {
                sQLiteStatement.close();
            }
            close();
        }
        return j2;
    }

    synchronized void removeEvents(long j) {
        removeEventsFromTable(EVENT_TABLE_NAME, j);
    }

    synchronized void removeIdentifys(long j) {
        removeEventsFromTable(IDENTIFY_TABLE_NAME, j);
    }

    synchronized void removeIdentifyInterceptors(long j) {
        removeEventsFromTable(IDENTIFY_INTERCEPTOR_TABLE_NAME, j);
    }

    private synchronized void removeEventsFromTable(String str, long j) {
        try {
            try {
                getWritableDatabase().delete(str, "id <= " + j, null);
            } catch (SQLiteException e) {
                logger.e(TAG, String.format("removeEvents from %s failed", str), e);
                delete();
            } catch (StackOverflowError e2) {
                logger.e(TAG, String.format("removeEvents from %s failed", str), e2);
                delete();
            }
        } finally {
            close();
        }
    }

    synchronized void removeEvent(long j) {
        removeEventFromTable(EVENT_TABLE_NAME, j);
    }

    synchronized void removeIdentify(long j) {
        removeEventFromTable(IDENTIFY_TABLE_NAME, j);
    }

    synchronized void removeIdentifyIntercept(long j) {
        removeEventFromTable(IDENTIFY_INTERCEPTOR_TABLE_NAME, j);
    }

    private synchronized void removeEventFromTable(String str, long j) {
        try {
            try {
                getWritableDatabase().delete(str, "id = " + j, null);
            } catch (SQLiteException e) {
                logger.e(TAG, String.format("removeEvent from %s failed", str), e);
                delete();
            } catch (StackOverflowError e2) {
                logger.e(TAG, String.format("removeEvent from %s failed", str), e2);
                delete();
            }
        } finally {
            close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
    
        if (r1.isOpen() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c9, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e5, code lost:
    
        if (r1.isOpen() != false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void delete() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                close();
                this.file.delete();
            } catch (SecurityException e) {
                logger.e(TAG, "delete failed", e);
                if (this.databaseResetListener == null || !this.callResetListenerOnDatabaseReset) {
                    return;
                }
                this.callResetListenerOnDatabaseReset = false;
                try {
                    try {
                        sQLiteDatabase = getWritableDatabase();
                        this.databaseResetListener.onDatabaseReset(sQLiteDatabase);
                        this.callResetListenerOnDatabaseReset = true;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            return;
                        }
                    } catch (SQLiteException e2) {
                        logger.e(TAG, String.format("databaseReset callback failed during delete", new Object[0]), e2);
                        this.callResetListenerOnDatabaseReset = true;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    this.callResetListenerOnDatabaseReset = true;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        close();
                    }
                    throw th;
                }
            }
            if (this.databaseResetListener == null || !this.callResetListenerOnDatabaseReset) {
                return;
            }
            this.callResetListenerOnDatabaseReset = false;
            try {
                try {
                    sQLiteDatabase = getWritableDatabase();
                    this.databaseResetListener.onDatabaseReset(sQLiteDatabase);
                    this.callResetListenerOnDatabaseReset = true;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        return;
                    }
                } catch (SQLiteException e3) {
                    logger.e(TAG, String.format("databaseReset callback failed during delete", new Object[0]), e3);
                    this.callResetListenerOnDatabaseReset = true;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        return;
                    }
                }
                close();
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Throwable th3) {
            if (this.databaseResetListener != null && this.callResetListenerOnDatabaseReset) {
                this.callResetListenerOnDatabaseReset = false;
                try {
                    try {
                        sQLiteDatabase = getWritableDatabase();
                        this.databaseResetListener.onDatabaseReset(sQLiteDatabase);
                        this.callResetListenerOnDatabaseReset = true;
                        if (sQLiteDatabase != null) {
                        }
                    } catch (SQLiteException e4) {
                        logger.e(TAG, String.format("databaseReset callback failed during delete", new Object[0]), e4);
                        this.callResetListenerOnDatabaseReset = true;
                        if (sQLiteDatabase != null) {
                        }
                        throw th3;
                    }
                } finally {
                    this.callResetListenerOnDatabaseReset = true;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        close();
                    }
                }
            }
            throw th3;
        }
    }

    boolean dbFileExists() {
        return this.file.exists();
    }

    Cursor queryDb(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    private void handleIfCursorRowTooLargeException(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (Utils.isEmptyString(message)) {
            throw illegalStateException;
        }
        if (!message.contains("Couldn't read")) {
            throw illegalStateException;
        }
        if (message.contains("CursorWindow")) {
            delete();
            return;
        }
        throw illegalStateException;
    }

    private static void convertIfCursorWindowException(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (Utils.isEmptyString(message)) {
            throw runtimeException;
        }
        if (message.startsWith("Cursor window allocation of") || message.startsWith("Could not allocate CursorWindow")) {
            throw new CursorWindowAllocationException(message);
        }
        throw runtimeException;
    }
}
