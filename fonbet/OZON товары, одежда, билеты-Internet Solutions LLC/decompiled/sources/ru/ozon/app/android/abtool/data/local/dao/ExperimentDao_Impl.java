package ru.ozon.app.android.abtool.data.local.dao;

import J4.k;
import J4.l;
import J4.s;
import J4.u;
import J4.w;
import L4.a;
import L4.b;
import O4.f;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.abtool.data.local.dao.ExperimentDao_Impl;
import ru.ozon.app.android.abtool.data.local.entity.ExperimentEntity;

/* loaded from: classes6.dex */
public final class ExperimentDao_Impl extends ExperimentDao {
    private final s __db;
    private final k<ExperimentEntity> __deletionAdapterOfExperimentEntity;
    private final l<ExperimentEntity> __insertionAdapterOfExperimentEntity;
    private final k<ExperimentEntity> __updateAdapterOfExperimentEntity;

    public ExperimentDao_Impl(s sVar) {
        this.__db = sVar;
        this.__insertionAdapterOfExperimentEntity = new l<ExperimentEntity>(sVar) { // from class: ru.ozon.app.android.abtool.data.local.dao.ExperimentDao_Impl.1
            @Override // J4.A
            public String createQuery() {
                return "INSERT OR IGNORE INTO `experiment_entity` (`id`,`variantId`,`alias`) VALUES (?,?,?)";
            }

            @Override // J4.l
            public void bind(f fVar, ExperimentEntity experimentEntity) {
                fVar.m0(1, experimentEntity.getId());
                fVar.m0(2, experimentEntity.getVariantId());
                if (experimentEntity.getAlias() == null) {
                    fVar.C0(3);
                } else {
                    fVar.e0(3, experimentEntity.getAlias());
                }
            }
        };
        this.__deletionAdapterOfExperimentEntity = new k<ExperimentEntity>(sVar) { // from class: ru.ozon.app.android.abtool.data.local.dao.ExperimentDao_Impl.2
            @Override // J4.A
            public String createQuery() {
                return "DELETE FROM `experiment_entity` WHERE `id` = ?";
            }

            @Override // J4.k
            public void bind(f fVar, ExperimentEntity experimentEntity) {
                fVar.m0(1, experimentEntity.getId());
            }
        };
        this.__updateAdapterOfExperimentEntity = new k<ExperimentEntity>(sVar) { // from class: ru.ozon.app.android.abtool.data.local.dao.ExperimentDao_Impl.3
            @Override // J4.A
            public String createQuery() {
                return "UPDATE OR ABORT `experiment_entity` SET `id` = ?,`variantId` = ?,`alias` = ? WHERE `id` = ?";
            }

            @Override // J4.k
            public void bind(f fVar, ExperimentEntity experimentEntity) {
                fVar.m0(1, experimentEntity.getId());
                fVar.m0(2, experimentEntity.getVariantId());
                if (experimentEntity.getAlias() == null) {
                    fVar.C0(3);
                } else {
                    fVar.e0(3, experimentEntity.getAlias());
                }
                fVar.m0(4, experimentEntity.getId());
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$upsert$1(List list, d dVar) {
        return super.upsert(list, (d<? super Unit>) dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.ExperimentDao
    public List<ExperimentEntity> getExperiments() {
        w j11 = w.j(0, "SELECT * FROM experiment_entity");
        this.__db.assertNotSuspendingTransaction();
        Cursor b11 = b.b(this.__db, j11, false);
        try {
            int b12 = a.b(b11, "id");
            int b13 = a.b(b11, "variantId");
            int b14 = a.b(b11, "alias");
            ArrayList arrayList = new ArrayList(b11.getCount());
            while (b11.moveToNext()) {
                arrayList.add(new ExperimentEntity(b11.getInt(b12), b11.getInt(b13), b11.isNull(b14) ? null : b11.getString(b14)));
            }
            return arrayList;
        } finally {
            b11.close();
            j11.release();
        }
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.BaseDao
    public /* bridge */ /* synthetic */ Object insert(ExperimentEntity experimentEntity, d dVar) {
        return insert2(experimentEntity, (d<? super Long>) dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.BaseDao
    public /* bridge */ /* synthetic */ Object update(ExperimentEntity experimentEntity, d dVar) {
        return update2(experimentEntity, (d<? super Unit>) dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.BaseDao
    public Object upsert(final List<? extends ExperimentEntity> list, d<? super Unit> dVar) {
        return u.a(this.__db, new Function1() { // from class: Qj.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object lambda$upsert$1;
                lambda$upsert$1 = ExperimentDao_Impl.this.lambda$upsert$1(list, (d) obj);
                return lambda$upsert$1;
            }
        }, dVar);
    }

    /* renamed from: insert, reason: avoid collision after fix types in other method */
    public Object insert2(final ExperimentEntity experimentEntity, d<? super Long> dVar) {
        return J4.f.c(this.__db, new Callable<Long>() { // from class: ru.ozon.app.android.abtool.data.local.dao.ExperimentDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                ExperimentDao_Impl.this.__db.beginTransaction();
                try {
                    long insertAndReturnId = ExperimentDao_Impl.this.__insertionAdapterOfExperimentEntity.insertAndReturnId(experimentEntity);
                    ExperimentDao_Impl.this.__db.setTransactionSuccessful();
                    return Long.valueOf(insertAndReturnId);
                } finally {
                    ExperimentDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    /* renamed from: update, reason: avoid collision after fix types in other method */
    public Object update2(final ExperimentEntity experimentEntity, d<? super Unit> dVar) {
        return J4.f.c(this.__db, new Callable<Unit>() { // from class: ru.ozon.app.android.abtool.data.local.dao.ExperimentDao_Impl.7
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ExperimentDao_Impl.this.__db.beginTransaction();
                try {
                    ExperimentDao_Impl.this.__updateAdapterOfExperimentEntity.handle(experimentEntity);
                    ExperimentDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    ExperimentDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.BaseDao
    public Object insert(final List<? extends ExperimentEntity> list, d<? super List<Long>> dVar) {
        return J4.f.c(this.__db, new Callable<List<Long>>() { // from class: ru.ozon.app.android.abtool.data.local.dao.ExperimentDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                ExperimentDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = ExperimentDao_Impl.this.__insertionAdapterOfExperimentEntity.insertAndReturnIdsList(list);
                    ExperimentDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    ExperimentDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.BaseDao
    public Object update(final List<? extends ExperimentEntity> list, d<? super Unit> dVar) {
        return J4.f.c(this.__db, new Callable<Unit>() { // from class: ru.ozon.app.android.abtool.data.local.dao.ExperimentDao_Impl.8
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ExperimentDao_Impl.this.__db.beginTransaction();
                try {
                    ExperimentDao_Impl.this.__updateAdapterOfExperimentEntity.handleMultiple(list);
                    ExperimentDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    ExperimentDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }
}
