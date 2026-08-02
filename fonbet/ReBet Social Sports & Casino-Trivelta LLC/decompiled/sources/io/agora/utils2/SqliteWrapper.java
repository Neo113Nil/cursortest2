package io.agora.utils2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import android.text.TextUtils;
import io.agora.base.internal.CalledByNative;
import io.agora.utils2.internal.Logging;
import java.io.File;

/* loaded from: classes3.dex */
class SqliteWrapper {
    private static final String TAG = "SQLITE";
    private final Object lock = new Object();

    /* renamed from: db, reason: collision with root package name */
    private SQLiteDatabase f49188db = null;

    public static class StorageItem {
        long actualSize;
        byte[] data;
        long expired;
        String key;

        public StorageItem() {
            this.key = null;
            this.data = null;
            this.actualSize = 0L;
            this.expired = 0L;
        }

        @CalledByNative("StorageItem")
        public long getActualSize() {
            return this.actualSize;
        }

        @CalledByNative("StorageItem")
        public byte[] getData() {
            return this.data;
        }

        @CalledByNative("StorageItem")
        public long getExpired() {
            return this.expired;
        }

        @CalledByNative("StorageItem")
        public String getKey() {
            return this.key;
        }

        public StorageItem(String str, byte[] bArr, long j10, long j11) {
            this.key = str;
            this.data = bArr;
            this.actualSize = j10;
            this.expired = j11;
        }
    }

    @CalledByNative
    public SqliteWrapper() {
    }

    private boolean executeCommandOnPath(String str, String str2) {
        if (!isDatabaseValid() || !isPathValid(str)) {
            return false;
        }
        synchronized (this.lock) {
            try {
                try {
                    this.f49188db.execSQL(str2);
                } catch (Exception unused) {
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    private boolean isDatabaseValid() {
        SQLiteDatabase sQLiteDatabase = this.f49188db;
        return (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || this.f49188db.isReadOnly()) ? false : true;
    }

    private boolean isPathValid(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'' || charAt == ';') {
                return false;
            }
        }
        return !str.toLowerCase().contains("sqlite_master");
    }

    @CalledByNative
    public void close() {
        if (isDatabaseValid()) {
            synchronized (this.lock) {
                this.f49188db.close();
                this.f49188db = null;
            }
        }
    }

    @CalledByNative
    public boolean delete(String str, String str2) {
        if (!isDatabaseValid() || !isPathValid(str) || !isPathValid(str2)) {
            return false;
        }
        synchronized (this.lock) {
            try {
                try {
                    this.f49188db.execSQL("delete from \"" + str + "\" where key = \"" + str2 + "\";");
                } catch (Exception unused) {
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @CalledByNative
    public void dispose() {
        synchronized (this.lock) {
            try {
                SQLiteDatabase sQLiteDatabase = this.f49188db;
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    this.f49188db.close();
                }
                this.f49188db = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @CalledByNative
    public boolean drop(String str) {
        return executeCommandOnPath(str, "drop table if exists \"" + str + "\";");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        io.agora.utils2.internal.Logging.w(io.agora.utils2.SqliteWrapper.TAG, "cursor close exception");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076 A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:10:0x0015, B:25:0x0021, B:13:0x002b, B:21:0x0069, B:16:0x0076, B:17:0x0078, B:23:0x006d, B:28:0x0035, B:30:0x003b, B:33:0x0042, B:35:0x0047, B:37:0x0054, B:42:0x005d), top: B:9:0x0015, inners: #0 }] */
    @CalledByNative
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String[] findAllTableNames() {
        String[] strArr;
        String[] strArr2;
        Cursor cursor;
        int count;
        String str;
        String str2;
        if (!isDatabaseValid()) {
            Logging.w(TAG, "database is invalid");
            return new String[0];
        }
        synchronized (this.lock) {
            strArr = null;
            try {
                try {
                    cursor = this.f49188db.rawQuery("select DISTINCT tbl_name from sqlite_master;", new String[0]);
                } catch (Exception unused) {
                    strArr2 = null;
                }
                if (cursor != 0) {
                    try {
                        count = cursor.getCount();
                    } catch (Exception unused2) {
                        strArr2 = null;
                        strArr = cursor;
                        Logging.w(TAG, "findAllTableNames exception");
                        String[] strArr3 = strArr2;
                        cursor = strArr;
                        strArr = strArr3;
                        if (strArr == null) {
                        }
                        return strArr;
                    }
                    if (count == 0) {
                        str = TAG;
                        str2 = "findAllTableNames table count is zero";
                    } else {
                        if (!cursor.isClosed() && cursor.moveToFirst()) {
                            strArr = new String[count];
                            for (int i10 = 0; i10 < count; i10++) {
                                strArr[i10] = cursor.getString(0);
                                if (!cursor.moveToNext()) {
                                    break;
                                }
                            }
                        }
                        if (strArr == null) {
                            strArr = new String[0];
                        }
                    }
                } else {
                    str = TAG;
                    str2 = "findAllTableNames cursor is null";
                }
                Logging.w(str, str2);
                if (strArr == null) {
                }
            } finally {
            }
        }
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3 A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:18:0x003f, B:61:0x004b, B:64:0x0054, B:23:0x0063, B:38:0x00b4, B:28:0x00c3, B:31:0x00c7, B:32:0x00cc, B:34:0x00ce, B:35:0x00d3, B:40:0x00b8, B:41:0x006f, B:43:0x007d, B:45:0x0083, B:48:0x008a, B:50:0x008e, B:51:0x0097, B:55:0x00a0), top: B:17:0x003f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @CalledByNative
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StorageItem load(String str, String str2, boolean z10) {
        byte[] bArr;
        Cursor cursor;
        byte[] bArr2;
        Cursor cursor2;
        long j10;
        long j11;
        ?? r32;
        boolean z11;
        if (!isDatabaseValid()) {
            Logging.w(TAG, "database is invalid");
            return new StorageItem();
        }
        if (TextUtils.isEmpty(str)) {
            Logging.w(TAG, "query is invalid");
            return new StorageItem();
        }
        if (TextUtils.isEmpty(str2)) {
            Logging.w(TAG, "cmd is invalid");
            return new StorageItem();
        }
        synchronized (this.lock) {
            byte[] bArr3 = null;
            try {
                try {
                    cursor2 = this.f49188db.rawQuery(str, new String[0]);
                    if (cursor2 != null) {
                        try {
                            z11 = cursor2.getCount() > 0;
                            cursor2.close();
                            cursor2 = null;
                        } catch (Exception unused) {
                            cursor = cursor2;
                            bArr = null;
                            bArr2 = bArr;
                            cursor2 = cursor;
                            j10 = 0;
                            j11 = 0;
                            r32 = bArr3;
                            if (cursor2 != null) {
                            }
                            if (j10 != 0) {
                            }
                            return new StorageItem();
                        }
                    } else {
                        z11 = false;
                    }
                } catch (Exception unused2) {
                    bArr = null;
                    cursor = null;
                }
                if (z11) {
                    cursor2 = this.f49188db.rawQuery(str2, new String[0]);
                    if (!cursor2.isClosed() && cursor2.moveToFirst() && cursor2.getCount() == 1) {
                        ?? string = cursor2.getString(0);
                        try {
                            bArr3 = cursor2.getBlob(1);
                            long j12 = cursor2.getLong(2);
                            j10 = bArr3.length > 524288 ? 524288L : bArr3.length;
                            j11 = j12;
                            r32 = string;
                            bArr2 = bArr3;
                        } catch (Exception unused3) {
                            cursor = cursor2;
                            bArr = bArr3;
                            bArr3 = string;
                            bArr2 = bArr;
                            cursor2 = cursor;
                            j10 = 0;
                            j11 = 0;
                            r32 = bArr3;
                            if (cursor2 != null) {
                            }
                            if (j10 != 0) {
                            }
                            return new StorageItem();
                        }
                        if (cursor2 != null) {
                            try {
                                cursor2.close();
                            } catch (Exception unused4) {
                                Logging.w(TAG, "cursor close exception");
                            }
                        }
                        if (j10 != 0 && bArr2.length != 0) {
                            return new StorageItem(r32, bArr2, j10, j11);
                        }
                        return new StorageItem();
                    }
                } else {
                    Logging.w(TAG, "table is not exist");
                }
                j10 = 0;
                j11 = 0;
                r32 = 0;
                bArr2 = null;
                if (cursor2 != null) {
                }
                if (j10 != 0) {
                    return new StorageItem(r32, bArr2, j10, j11);
                }
                return new StorageItem();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        io.agora.utils2.internal.Logging.w(io.agora.utils2.SqliteWrapper.TAG, "cursor close exception");
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[Catch: all -> 0x006a, TryCatch #2 {, blocks: (B:14:0x0020, B:27:0x002a, B:29:0x0030, B:32:0x0037, B:34:0x0040, B:37:0x0059, B:41:0x0057, B:23:0x0070, B:18:0x007d, B:19:0x007f, B:25:0x0074), top: B:13:0x0020, inners: #3 }] */
    @CalledByNative
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StorageItem[] loadWholeTable(String str) {
        StorageItem[] storageItemArr;
        Cursor cursor;
        String str2;
        String str3;
        if (!isDatabaseValid()) {
            str2 = TAG;
            str3 = "database is invalid";
        } else {
            if (!TextUtils.isEmpty(str)) {
                synchronized (this.lock) {
                    storageItemArr = null;
                    try {
                        cursor = this.f49188db.rawQuery(str, new String[0]);
                        if (cursor != null) {
                            try {
                                if (!cursor.isClosed() && cursor.moveToFirst()) {
                                    int count = cursor.getCount();
                                    storageItemArr = new StorageItem[count];
                                    for (int i10 = 0; i10 < count; i10++) {
                                        String string = cursor.getString(0);
                                        byte[] blob = cursor.getBlob(1);
                                        storageItemArr[i10] = new StorageItem(string, blob, blob.length > 524288 ? 524288L : blob.length, cursor.getLong(2));
                                        if (!cursor.moveToNext()) {
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                        cursor = null;
                    }
                    if (storageItemArr == null) {
                        storageItemArr = new StorageItem[0];
                    }
                }
                return storageItemArr;
            }
            str2 = TAG;
            str3 = "cmd is invalid";
        }
        Logging.w(str2, str3);
        return new StorageItem[0];
        if (storageItemArr == null) {
        }
        return storageItemArr;
    }

    @CalledByNative
    public boolean open(String str) {
        SQLiteDatabase openDatabase;
        SQLiteDatabase.OpenParams build;
        if (!isPathValid(str)) {
            return false;
        }
        synchronized (this.lock) {
            try {
                try {
                    if (Build.VERSION.SDK_INT >= 28) {
                        f.a();
                        SQLiteDatabase.OpenParams.Builder a10 = e.a();
                        a10.setOpenFlags(268435456);
                        a10.setJournalMode("off");
                        build = a10.build();
                        openDatabase = SQLiteDatabase.openDatabase(new File(str), build);
                    } else {
                        openDatabase = SQLiteDatabase.openDatabase(str, null, 268435456);
                    }
                    this.f49188db = openDatabase;
                    try {
                        this.f49188db.execSQL("PRAGMA TEMP_STORE = MEMORY;");
                        this.f49188db.execSQL("PRAGMA SYNCHRONOUS = OFF;");
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        if (this.f49188db.isOpen()) {
                            this.f49188db.close();
                        }
                        this.f49188db = null;
                        Logging.d(TAG, "Can not open database: " + str);
                        return false;
                    }
                } catch (Exception unused) {
                    SQLiteDatabase sQLiteDatabase = this.f49188db;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        this.f49188db.close();
                    }
                    this.f49188db = null;
                    Logging.d(TAG, "Can not open database: " + str);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @CalledByNative
    public long save(String str, String str2, byte[] bArr, long j10) {
        SQLiteStatement sQLiteStatement;
        long j11 = 0;
        if (!isPathValid(str) || !isPathValid(str2) || bArr == null || bArr.length == 0 || bArr.length >= 524288 || !touch(str)) {
            return 0L;
        }
        synchronized (this.lock) {
            try {
                String str3 = "replace into \"" + str + "\" (key, value, expired) values (\"" + str2 + "\", ?, " + j10 + ");";
                this.f49188db.beginTransaction();
                try {
                    sQLiteStatement = this.f49188db.compileStatement(str3);
                    try {
                        sQLiteStatement.bindBlob(1, bArr);
                        sQLiteStatement.execute();
                        j11 = bArr.length;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    sQLiteStatement = null;
                }
                this.f49188db.setTransactionSuccessful();
                this.f49188db.endTransaction();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j11;
    }

    @CalledByNative
    public boolean touch(String str) {
        return executeCommandOnPath(str, "create table if not exists \"" + str + "\" (key text primary key, value text, expired INTEGER);");
    }
}
