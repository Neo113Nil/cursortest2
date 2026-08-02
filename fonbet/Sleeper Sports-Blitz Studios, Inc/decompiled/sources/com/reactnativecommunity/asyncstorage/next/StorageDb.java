package com.reactnativecommunity.asyncstorage.next;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.reactnativecommunity.asyncstorage.ReactDatabaseSupplier;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StorageSupplier.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/reactnativecommunity/asyncstorage/next/StorageDb;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "storage", "Lcom/reactnativecommunity/asyncstorage/next/StorageDao;", "Companion", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class StorageDb extends RoomDatabase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static StorageDb instance;

    public abstract StorageDao storage();

    /* compiled from: StorageSupplier.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/reactnativecommunity/asyncstorage/next/StorageDb$Companion;", "", "<init>", "()V", "instance", "Lcom/reactnativecommunity/asyncstorage/next/StorageDb;", "getDatabase", "context", "Landroid/content/Context;", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StorageDb getDatabase(Context context) {
            StorageDb storageDb;
            Intrinsics.checkNotNullParameter(context, "context");
            StorageDb storageDb2 = StorageDb.instance;
            if (storageDb2 != null) {
                return storageDb2;
            }
            synchronized (this) {
                File databasePath = context.getDatabasePath(ReactDatabaseSupplier.DATABASE_NAME);
                RoomDatabase.Builder databaseBuilder = Room.databaseBuilder(context, StorageDb.class, "AsyncStorage");
                if (databasePath.exists()) {
                    Intrinsics.checkNotNull(databasePath);
                    databaseBuilder.createFromFile(databasePath).addMigrations(MIGRATION_TO_NEXT.INSTANCE);
                }
                RoomDatabase build = databaseBuilder.build();
                Companion companion = StorageDb.INSTANCE;
                StorageDb.instance = (StorageDb) build;
                storageDb = StorageDb.instance;
                Intrinsics.checkNotNull(storageDb);
            }
            return storageDb;
        }
    }
}
