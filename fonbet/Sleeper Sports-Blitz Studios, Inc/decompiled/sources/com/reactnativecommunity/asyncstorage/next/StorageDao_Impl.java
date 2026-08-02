package com.reactnativecommunity.asyncstorage.next;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.reactnativecommunity.asyncstorage.next.StorageDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final class StorageDao_Impl implements StorageDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<Entry> __insertionAdapterOfEntry;
    private final SharedSQLiteStatement __preparedStmtOfClear;

    public StorageDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfEntry = new EntityInsertionAdapter<Entry>(__db) { // from class: com.reactnativecommunity.asyncstorage.next.StorageDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `Storage` (`key`,`value`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final Entry entity) {
                statement.bindString(1, entity.getKey());
                if (entity.getValue() == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindString(2, entity.getValue());
                }
            }
        };
        this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) { // from class: com.reactnativecommunity.asyncstorage.next.StorageDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM Storage";
            }
        };
    }

    @Override // com.reactnativecommunity.asyncstorage.next.StorageDao
    public Object setValues(final List<Entry> entries, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.reactnativecommunity.asyncstorage.next.StorageDao_Impl.3
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                StorageDao_Impl.this.__db.beginTransaction();
                try {
                    StorageDao_Impl.this.__insertionAdapterOfEntry.insert((Iterable) entries);
                    StorageDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    StorageDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$mergeValues$0(List list, Continuation continuation) {
        return StorageDao.DefaultImpls.mergeValues(this, list, continuation);
    }

    @Override // com.reactnativecommunity.asyncstorage.next.StorageDao
    public Object mergeValues(final List<Entry> entries, final Continuation<? super Unit> $completion) {
        return RoomDatabaseKt.withTransaction(this.__db, new Function1() { // from class: com.reactnativecommunity.asyncstorage.next.StorageDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object lambda$mergeValues$0;
                lambda$mergeValues$0 = StorageDao_Impl.this.lambda$mergeValues$0(entries, (Continuation) obj);
                return lambda$mergeValues$0;
            }
        }, $completion);
    }

    @Override // com.reactnativecommunity.asyncstorage.next.StorageDao
    public Object clear(final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.reactnativecommunity.asyncstorage.next.StorageDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = StorageDao_Impl.this.__preparedStmtOfClear.acquire();
                try {
                    StorageDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        StorageDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        StorageDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    StorageDao_Impl.this.__preparedStmtOfClear.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.reactnativecommunity.asyncstorage.next.StorageDao
    public Object getValues(final List<String> keys, final Continuation<? super List<Entry>> $completion) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT * FROM Storage WHERE `key` IN (");
        int size = keys.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        Iterator<String> it = keys.iterator();
        int i = 1;
        while (it.hasNext()) {
            acquire.bindString(i, it.next());
            i++;
        }
        return CoroutinesRoom.execute(this.__db, true, DBUtil.createCancellationSignal(), new Callable<List<Entry>>() { // from class: com.reactnativecommunity.asyncstorage.next.StorageDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<Entry> call() throws Exception {
                StorageDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor query = DBUtil.query(StorageDao_Impl.this.__db, acquire, false, null);
                    try {
                        int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, SDKConstants.PARAM_KEY);
                        int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "value");
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            arrayList.add(new Entry(query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2)));
                        }
                        StorageDao_Impl.this.__db.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        query.close();
                        acquire.release();
                    }
                } finally {
                    StorageDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.reactnativecommunity.asyncstorage.next.StorageDao
    public Object getKeys(final Continuation<? super List<String>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT `key` FROM Storage", 0);
        return CoroutinesRoom.execute(this.__db, true, DBUtil.createCancellationSignal(), new Callable<List<String>>() { // from class: com.reactnativecommunity.asyncstorage.next.StorageDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<String> call() throws Exception {
                StorageDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor query = DBUtil.query(StorageDao_Impl.this.__db, acquire, false, null);
                    try {
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            arrayList.add(query.getString(0));
                        }
                        StorageDao_Impl.this.__db.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        query.close();
                        acquire.release();
                    }
                } finally {
                    StorageDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.reactnativecommunity.asyncstorage.next.StorageDao
    public Object removeValues(final List<String> keys, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.reactnativecommunity.asyncstorage.next.StorageDao_Impl.7
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                StringBuilder newStringBuilder = StringUtil.newStringBuilder();
                newStringBuilder.append("DELETE FROM Storage WHERE `key` in (");
                StringUtil.appendPlaceholders(newStringBuilder, keys.size());
                newStringBuilder.append(")");
                SupportSQLiteStatement compileStatement = StorageDao_Impl.this.__db.compileStatement(newStringBuilder.toString());
                Iterator it = keys.iterator();
                int i = 1;
                while (it.hasNext()) {
                    compileStatement.bindString(i, (String) it.next());
                    i++;
                }
                StorageDao_Impl.this.__db.beginTransaction();
                try {
                    compileStatement.executeUpdateDelete();
                    StorageDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    StorageDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }
}
