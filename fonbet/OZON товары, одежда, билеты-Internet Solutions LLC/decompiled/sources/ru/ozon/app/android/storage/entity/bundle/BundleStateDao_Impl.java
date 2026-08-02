package ru.ozon.app.android.storage.entity.bundle;

import J4.A;
import J4.l;
import J4.s;
import J4.w;
import L4.b;
import L4.d;
import O4.f;
import android.database.Cursor;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class BundleStateDao_Impl implements BundleStateDao {
    private final s __db;
    private final l<BundleState> __insertionAdapterOfBundleState;
    private final A __preparedStmtOfDeleteAllForScreenExceptPassedRecord;

    public BundleStateDao_Impl(@NonNull s sVar) {
        this.__db = sVar;
        this.__insertionAdapterOfBundleState = new l<BundleState>(sVar) { // from class: ru.ozon.app.android.storage.entity.bundle.BundleStateDao_Impl.1
            @Override // J4.A
            @NonNull
            protected String createQuery() {
                return "INSERT OR ABORT INTO `bundle_state` (`id`,`guid`,`bundle`,`blobSize`,`screenGuid`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // J4.l
            public void bind(@NonNull f fVar, @NonNull BundleState bundleState) {
                fVar.m0(1, bundleState.getId());
                fVar.e0(2, bundleState.getGuid());
                fVar.q0(3, bundleState.getBundle());
                fVar.m0(4, bundleState.getBlobSize());
                fVar.e0(5, bundleState.getScreenGuid());
            }
        };
        this.__preparedStmtOfDeleteAllForScreenExceptPassedRecord = new A(sVar) { // from class: ru.ozon.app.android.storage.entity.bundle.BundleStateDao_Impl.2
            @Override // J4.A
            @NonNull
            public String createQuery() {
                return "DELETE FROM bundle_state where guid != ? AND screenGuid == ?";
            }
        };
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // ru.ozon.app.android.storage.entity.bundle.BundleStateDao
    public void deleteAllForScreenExceptPassedRecord(String str, String str2) {
        this.__db.assertNotSuspendingTransaction();
        f acquire = this.__preparedStmtOfDeleteAllForScreenExceptPassedRecord.acquire();
        acquire.e0(1, str2);
        acquire.e0(2, str);
        try {
            this.__db.beginTransaction();
            try {
                acquire.C();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDeleteAllForScreenExceptPassedRecord.release(acquire);
        }
    }

    @Override // ru.ozon.app.android.storage.entity.bundle.BundleStateDao
    public void deleteByIds(List<Long> list) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM bundle_state where id in (");
        d.a(list.size(), sb2);
        sb2.append(")");
        f compileStatement = this.__db.compileStatement(sb2.toString());
        Iterator<Long> it = list.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            compileStatement.m0(i11, it.next().longValue());
            i11++;
        }
        this.__db.beginTransaction();
        try {
            compileStatement.C();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // ru.ozon.app.android.storage.entity.bundle.BundleStateDao
    public List<ShortInfoAboutBundleState> getAllShortDesc() {
        w j11 = w.j(0, "SELECT id,blobSize FROM bundle_state ORDER BY id DESC");
        this.__db.assertNotSuspendingTransaction();
        Cursor b11 = b.b(this.__db, j11, false);
        try {
            ArrayList arrayList = new ArrayList(b11.getCount());
            while (b11.moveToNext()) {
                arrayList.add(new ShortInfoAboutBundleState(b11.getLong(0), b11.getInt(1)));
            }
            return arrayList;
        } finally {
            b11.close();
            j11.release();
        }
    }

    @Override // ru.ozon.app.android.storage.entity.bundle.BundleStateDao
    public List<byte[]> getBlobsByGuid(String str) {
        w j11 = w.j(1, "SELECT bundle FROM bundle_state where guid == ? ORDER BY id");
        j11.e0(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor b11 = b.b(this.__db, j11, false);
        try {
            ArrayList arrayList = new ArrayList(b11.getCount());
            while (b11.moveToNext()) {
                arrayList.add(b11.getBlob(0));
            }
            return arrayList;
        } finally {
            b11.close();
            j11.release();
        }
    }

    @Override // ru.ozon.app.android.storage.entity.bundle.BundleStateDao
    public void insertRecords(List<BundleState> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfBundleState.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
