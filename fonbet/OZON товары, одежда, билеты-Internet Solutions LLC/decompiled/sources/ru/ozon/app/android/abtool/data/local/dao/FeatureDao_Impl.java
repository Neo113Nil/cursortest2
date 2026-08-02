package ru.ozon.app.android.abtool.data.local.dao;

import Ij.C3261b;
import J4.A;
import J4.k;
import J4.l;
import J4.s;
import J4.u;
import J4.w;
import L4.a;
import L4.b;
import O4.f;
import android.database.Cursor;
import android.os.CancellationSignal;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl;
import ru.ozon.app.android.abtool.data.local.entity.FeatureEntity;
import ru.ozon.app.android.abtool.data.local.entity.UpdateStrategyConverter;
import ru.ozon.app.android.abtool.data.local.entity.ValueTypeConverter;
import ru.ozon.app.android.abtool.data.model.UpdateStrategy;

/* loaded from: classes6.dex */
public final class FeatureDao_Impl extends FeatureDao {
    private final s __db;
    private final k<FeatureEntity> __deletionAdapterOfFeatureEntity;
    private final l<FeatureEntity> __insertionAdapterOfFeatureEntity;
    private final A __preparedStmtOfResetLocal;
    private final A __preparedStmtOfUpdateLocalValue;
    private final k<FeatureEntity> __updateAdapterOfFeatureEntity;
    private final ValueTypeConverter __valueTypeConverter = new ValueTypeConverter();
    private final UpdateStrategyConverter __updateStrategyConverter = new UpdateStrategyConverter();

    public FeatureDao_Impl(s sVar) {
        this.__db = sVar;
        this.__insertionAdapterOfFeatureEntity = new l<FeatureEntity>(sVar) { // from class: ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl.1
            @Override // J4.A
            public String createQuery() {
                return "INSERT OR IGNORE INTO `feature_entity` (`id`,`service_name`,`displayed_name`,`name`,`value_type`,`value`,`localValue`,`update_strategy`,`override_value`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            @Override // J4.l
            public void bind(f fVar, FeatureEntity featureEntity) {
                if (featureEntity.getId() == null) {
                    fVar.C0(1);
                } else {
                    fVar.e0(1, featureEntity.getId());
                }
                if (featureEntity.getServiceName() == null) {
                    fVar.C0(2);
                } else {
                    fVar.e0(2, featureEntity.getServiceName());
                }
                if (featureEntity.getDisplayedName() == null) {
                    fVar.C0(3);
                } else {
                    fVar.e0(3, featureEntity.getDisplayedName());
                }
                if (featureEntity.getName() == null) {
                    fVar.C0(4);
                } else {
                    fVar.e0(4, featureEntity.getName());
                }
                String from = FeatureDao_Impl.this.__valueTypeConverter.from(featureEntity.getValueType());
                if (from == null) {
                    fVar.C0(5);
                } else {
                    fVar.e0(5, from);
                }
                if (featureEntity.getValue() == null) {
                    fVar.C0(6);
                } else {
                    fVar.e0(6, featureEntity.getValue());
                }
                if (featureEntity.getLocalValue() == null) {
                    fVar.C0(7);
                } else {
                    fVar.e0(7, featureEntity.getLocalValue());
                }
                fVar.m0(8, FeatureDao_Impl.this.__updateStrategyConverter.from(featureEntity.getUpdateStrategy()));
                if (featureEntity.getOverrideValue() == null) {
                    fVar.C0(9);
                } else {
                    fVar.e0(9, featureEntity.getOverrideValue());
                }
            }
        };
        this.__deletionAdapterOfFeatureEntity = new k<FeatureEntity>(sVar) { // from class: ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl.2
            @Override // J4.A
            public String createQuery() {
                return "DELETE FROM `feature_entity` WHERE `id` = ?";
            }

            @Override // J4.k
            public void bind(f fVar, FeatureEntity featureEntity) {
                if (featureEntity.getId() == null) {
                    fVar.C0(1);
                } else {
                    fVar.e0(1, featureEntity.getId());
                }
            }
        };
        this.__updateAdapterOfFeatureEntity = new k<FeatureEntity>(sVar) { // from class: ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl.3
            @Override // J4.A
            public String createQuery() {
                return "UPDATE OR ABORT `feature_entity` SET `id` = ?,`service_name` = ?,`displayed_name` = ?,`name` = ?,`value_type` = ?,`value` = ?,`localValue` = ?,`update_strategy` = ?,`override_value` = ? WHERE `id` = ?";
            }

            @Override // J4.k
            public void bind(f fVar, FeatureEntity featureEntity) {
                if (featureEntity.getId() == null) {
                    fVar.C0(1);
                } else {
                    fVar.e0(1, featureEntity.getId());
                }
                if (featureEntity.getServiceName() == null) {
                    fVar.C0(2);
                } else {
                    fVar.e0(2, featureEntity.getServiceName());
                }
                if (featureEntity.getDisplayedName() == null) {
                    fVar.C0(3);
                } else {
                    fVar.e0(3, featureEntity.getDisplayedName());
                }
                if (featureEntity.getName() == null) {
                    fVar.C0(4);
                } else {
                    fVar.e0(4, featureEntity.getName());
                }
                String from = FeatureDao_Impl.this.__valueTypeConverter.from(featureEntity.getValueType());
                if (from == null) {
                    fVar.C0(5);
                } else {
                    fVar.e0(5, from);
                }
                if (featureEntity.getValue() == null) {
                    fVar.C0(6);
                } else {
                    fVar.e0(6, featureEntity.getValue());
                }
                if (featureEntity.getLocalValue() == null) {
                    fVar.C0(7);
                } else {
                    fVar.e0(7, featureEntity.getLocalValue());
                }
                fVar.m0(8, FeatureDao_Impl.this.__updateStrategyConverter.from(featureEntity.getUpdateStrategy()));
                if (featureEntity.getOverrideValue() == null) {
                    fVar.C0(9);
                } else {
                    fVar.e0(9, featureEntity.getOverrideValue());
                }
                if (featureEntity.getId() == null) {
                    fVar.C0(10);
                } else {
                    fVar.e0(10, featureEntity.getId());
                }
            }
        };
        this.__preparedStmtOfUpdateLocalValue = new A(sVar) { // from class: ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl.4
            @Override // J4.A
            public String createQuery() {
                return "UPDATE feature_entity SET localValue=? WHERE id = ?";
            }
        };
        this.__preparedStmtOfResetLocal = new A(sVar) { // from class: ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl.5
            @Override // J4.A
            public String createQuery() {
                return "UPDATE feature_entity SET localValue=null WHERE id = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$insertFeatures$2(List list, Map map, d dVar) {
        return super.insertFeatures(list, map, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$upsert$0(FeatureEntity featureEntity, d dVar) {
        return super.upsert((FeatureDao_Impl) featureEntity, (d<? super Unit>) dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.FeatureDao
    public Object deleteIds(final Collection<String> collection, d<? super Unit> dVar) {
        return J4.f.c(this.__db, new Callable<Unit>() { // from class: ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl.17
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                StringBuilder e11 = C3261b.e("DELETE FROM feature_entity WHERE id in (");
                L4.d.a(collection.size(), e11);
                e11.append(")");
                f compileStatement = FeatureDao_Impl.this.__db.compileStatement(e11.toString());
                int i11 = 1;
                for (String str : collection) {
                    if (str == null) {
                        compileStatement.C0(i11);
                    } else {
                        compileStatement.e0(i11, str);
                    }
                    i11++;
                }
                FeatureDao_Impl.this.__db.beginTransaction();
                try {
                    compileStatement.C();
                    FeatureDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    FeatureDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.FeatureDao
    public Object getAll(d<? super List<FeatureEntity>> dVar) {
        final w j11 = w.j(0, "SELECT * FROM feature_entity");
        return J4.f.b(this.__db, new CancellationSignal(), new Callable<List<FeatureEntity>>() { // from class: ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl.13
            @Override // java.util.concurrent.Callable
            public List<FeatureEntity> call() throws Exception {
                Cursor b11 = b.b(FeatureDao_Impl.this.__db, j11, false);
                try {
                    int b12 = a.b(b11, "id");
                    int b13 = a.b(b11, "service_name");
                    int b14 = a.b(b11, "displayed_name");
                    int b15 = a.b(b11, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int b16 = a.b(b11, "value_type");
                    int b17 = a.b(b11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    int b18 = a.b(b11, "localValue");
                    int b19 = a.b(b11, "update_strategy");
                    int b21 = a.b(b11, "override_value");
                    ArrayList arrayList = new ArrayList(b11.getCount());
                    while (b11.moveToNext()) {
                        arrayList.add(new FeatureEntity(b11.isNull(b12) ? null : b11.getString(b12), b11.isNull(b13) ? null : b11.getString(b13), b11.isNull(b14) ? null : b11.getString(b14), b11.isNull(b15) ? null : b11.getString(b15), FeatureDao_Impl.this.__valueTypeConverter.toValueType(b11.isNull(b16) ? null : b11.getString(b16)), b11.isNull(b17) ? null : b11.getString(b17), b11.isNull(b18) ? null : b11.getString(b18), FeatureDao_Impl.this.__updateStrategyConverter.to(b11.getInt(b19)), b11.isNull(b21) ? null : b11.getString(b21)));
                    }
                    return arrayList;
                } finally {
                    b11.close();
                    j11.release();
                }
            }
        }, dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.FeatureDao
    public FeatureEntity getFeatureByIdAndStrategySync(String str, UpdateStrategy[] updateStrategyArr) {
        StringBuilder e11 = C3261b.e("SELECT * FROM feature_entity WHERE id = ? and update_strategy in (");
        int length = updateStrategyArr.length;
        L4.d.a(length, e11);
        e11.append(")");
        w j11 = w.j(length + 1, e11.toString());
        if (str == null) {
            j11.C0(1);
        } else {
            j11.e0(1, str);
        }
        int i11 = 2;
        for (UpdateStrategy updateStrategy : updateStrategyArr) {
            j11.m0(i11, this.__updateStrategyConverter.from(updateStrategy));
            i11++;
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor b11 = b.b(this.__db, j11, false);
        try {
            int b12 = a.b(b11, "id");
            int b13 = a.b(b11, "service_name");
            int b14 = a.b(b11, "displayed_name");
            int b15 = a.b(b11, AppMeasurementSdk.ConditionalUserProperty.NAME);
            int b16 = a.b(b11, "value_type");
            int b17 = a.b(b11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            int b18 = a.b(b11, "localValue");
            int b19 = a.b(b11, "update_strategy");
            int b21 = a.b(b11, "override_value");
            return b11.moveToFirst() ? new FeatureEntity(b11.isNull(b12) ? null : b11.getString(b12), b11.isNull(b13) ? null : b11.getString(b13), b11.isNull(b14) ? null : b11.getString(b14), b11.isNull(b15) ? null : b11.getString(b15), this.__valueTypeConverter.toValueType(b11.isNull(b16) ? null : b11.getString(b16)), b11.isNull(b17) ? null : b11.getString(b17), b11.isNull(b18) ? null : b11.getString(b18), this.__updateStrategyConverter.to(b11.getInt(b19)), b11.isNull(b21) ? null : b11.getString(b21)) : null;
        } finally {
            b11.close();
            j11.release();
        }
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.FeatureDao
    public Object getFeaturesByQuery(String str, d<? super List<FeatureEntity>> dVar) {
        final w j11 = w.j(3, "SELECT * FROM feature_entity WHERE feature_entity.service_name like ? OR feature_entity.name like ? OR feature_entity.displayed_name like ?");
        if (str == null) {
            j11.C0(1);
        } else {
            j11.e0(1, str);
        }
        if (str == null) {
            j11.C0(2);
        } else {
            j11.e0(2, str);
        }
        if (str == null) {
            j11.C0(3);
        } else {
            j11.e0(3, str);
        }
        return J4.f.b(this.__db, new CancellationSignal(), new Callable<List<FeatureEntity>>() { // from class: ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl.14
            @Override // java.util.concurrent.Callable
            public List<FeatureEntity> call() throws Exception {
                Cursor b11 = b.b(FeatureDao_Impl.this.__db, j11, false);
                try {
                    int b12 = a.b(b11, "id");
                    int b13 = a.b(b11, "service_name");
                    int b14 = a.b(b11, "displayed_name");
                    int b15 = a.b(b11, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int b16 = a.b(b11, "value_type");
                    int b17 = a.b(b11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    int b18 = a.b(b11, "localValue");
                    int b19 = a.b(b11, "update_strategy");
                    int b21 = a.b(b11, "override_value");
                    ArrayList arrayList = new ArrayList(b11.getCount());
                    while (b11.moveToNext()) {
                        arrayList.add(new FeatureEntity(b11.isNull(b12) ? null : b11.getString(b12), b11.isNull(b13) ? null : b11.getString(b13), b11.isNull(b14) ? null : b11.getString(b14), b11.isNull(b15) ? null : b11.getString(b15), FeatureDao_Impl.this.__valueTypeConverter.toValueType(b11.isNull(b16) ? null : b11.getString(b16)), b11.isNull(b17) ? null : b11.getString(b17), b11.isNull(b18) ? null : b11.getString(b18), FeatureDao_Impl.this.__updateStrategyConverter.to(b11.getInt(b19)), b11.isNull(b21) ? null : b11.getString(b21)));
                    }
                    return arrayList;
                } finally {
                    b11.close();
                    j11.release();
                }
            }
        }, dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.FeatureDao
    public Object getFetched(d<? super List<FeatureEntity>> dVar) {
        final w j11 = w.j(0, "SELECT * FROM feature_entity WHERE feature_entity.update_strategy =1");
        return J4.f.b(this.__db, new CancellationSignal(), new Callable<List<FeatureEntity>>() { // from class: ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl.15
            @Override // java.util.concurrent.Callable
            public List<FeatureEntity> call() throws Exception {
                Cursor b11 = b.b(FeatureDao_Impl.this.__db, j11, false);
                try {
                    int b12 = a.b(b11, "id");
                    int b13 = a.b(b11, "service_name");
                    int b14 = a.b(b11, "displayed_name");
                    int b15 = a.b(b11, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int b16 = a.b(b11, "value_type");
                    int b17 = a.b(b11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    int b18 = a.b(b11, "localValue");
                    int b19 = a.b(b11, "update_strategy");
                    int b21 = a.b(b11, "override_value");
                    ArrayList arrayList = new ArrayList(b11.getCount());
                    while (b11.moveToNext()) {
                        arrayList.add(new FeatureEntity(b11.isNull(b12) ? null : b11.getString(b12), b11.isNull(b13) ? null : b11.getString(b13), b11.isNull(b14) ? null : b11.getString(b14), b11.isNull(b15) ? null : b11.getString(b15), FeatureDao_Impl.this.__valueTypeConverter.toValueType(b11.isNull(b16) ? null : b11.getString(b16)), b11.isNull(b17) ? null : b11.getString(b17), b11.isNull(b18) ? null : b11.getString(b18), FeatureDao_Impl.this.__updateStrategyConverter.to(b11.getInt(b19)), b11.isNull(b21) ? null : b11.getString(b21)));
                    }
                    return arrayList;
                } finally {
                    b11.close();
                    j11.release();
                }
            }
        }, dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.BaseDao
    public /* bridge */ /* synthetic */ Object insert(FeatureEntity featureEntity, d dVar) {
        return insert2(featureEntity, (d<? super Long>) dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.FeatureDao
    public Object insertFeatures(final List<FeatureEntity> list, final Map<String, FeatureEntity> map, d<? super Unit> dVar) {
        return u.a(this.__db, new Function1() { // from class: Qj.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object lambda$insertFeatures$2;
                lambda$insertFeatures$2 = FeatureDao_Impl.this.lambda$insertFeatures$2(list, map, (d) obj);
                return lambda$insertFeatures$2;
            }
        }, dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.FeatureDao
    public Object resetLocal(final String str, d<? super Unit> dVar) {
        return J4.f.c(this.__db, new Callable<Unit>() { // from class: ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl.12
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                f acquire = FeatureDao_Impl.this.__preparedStmtOfResetLocal.acquire();
                String str2 = str;
                if (str2 == null) {
                    acquire.C0(1);
                } else {
                    acquire.e0(1, str2);
                }
                FeatureDao_Impl.this.__db.beginTransaction();
                try {
                    acquire.C();
                    FeatureDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    FeatureDao_Impl.this.__db.endTransaction();
                    FeatureDao_Impl.this.__preparedStmtOfResetLocal.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.BaseDao
    public /* bridge */ /* synthetic */ Object update(FeatureEntity featureEntity, d dVar) {
        return update2(featureEntity, (d<? super Unit>) dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.FeatureDao
    public Object updateLocalValue(final String str, final String str2, d<? super Unit> dVar) {
        return J4.f.c(this.__db, new Callable<Unit>() { // from class: ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl.11
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                f acquire = FeatureDao_Impl.this.__preparedStmtOfUpdateLocalValue.acquire();
                String str3 = str2;
                if (str3 == null) {
                    acquire.C0(1);
                } else {
                    acquire.e0(1, str3);
                }
                String str4 = str;
                if (str4 == null) {
                    acquire.C0(2);
                } else {
                    acquire.e0(2, str4);
                }
                FeatureDao_Impl.this.__db.beginTransaction();
                try {
                    acquire.C();
                    FeatureDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    FeatureDao_Impl.this.__db.endTransaction();
                    FeatureDao_Impl.this.__preparedStmtOfUpdateLocalValue.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.BaseDao
    public /* bridge */ /* synthetic */ Object upsert(FeatureEntity featureEntity, d dVar) {
        return upsert2(featureEntity, (d<? super Unit>) dVar);
    }

    /* renamed from: insert, reason: avoid collision after fix types in other method */
    public Object insert2(final FeatureEntity featureEntity, d<? super Long> dVar) {
        return J4.f.c(this.__db, new Callable<Long>() { // from class: ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                FeatureDao_Impl.this.__db.beginTransaction();
                try {
                    long insertAndReturnId = FeatureDao_Impl.this.__insertionAdapterOfFeatureEntity.insertAndReturnId(featureEntity);
                    FeatureDao_Impl.this.__db.setTransactionSuccessful();
                    return Long.valueOf(insertAndReturnId);
                } finally {
                    FeatureDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    /* renamed from: update, reason: avoid collision after fix types in other method */
    public Object update2(final FeatureEntity featureEntity, d<? super Unit> dVar) {
        return J4.f.c(this.__db, new Callable<Unit>() { // from class: ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl.9
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                FeatureDao_Impl.this.__db.beginTransaction();
                try {
                    FeatureDao_Impl.this.__updateAdapterOfFeatureEntity.handle(featureEntity);
                    FeatureDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    FeatureDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    /* renamed from: upsert, reason: avoid collision after fix types in other method */
    public Object upsert2(final FeatureEntity featureEntity, d<? super Unit> dVar) {
        return u.a(this.__db, new Function1() { // from class: Qj.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object lambda$upsert$0;
                lambda$upsert$0 = FeatureDao_Impl.this.lambda$upsert$0(featureEntity, (d) obj);
                return lambda$upsert$0;
            }
        }, dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.BaseDao
    public Object insert(final List<? extends FeatureEntity> list, d<? super List<Long>> dVar) {
        return J4.f.c(this.__db, new Callable<List<Long>>() { // from class: ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl.7
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                FeatureDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = FeatureDao_Impl.this.__insertionAdapterOfFeatureEntity.insertAndReturnIdsList(list);
                    FeatureDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    FeatureDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // ru.ozon.app.android.abtool.data.local.dao.BaseDao
    public Object update(final List<? extends FeatureEntity> list, d<? super Unit> dVar) {
        return J4.f.c(this.__db, new Callable<Unit>() { // from class: ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl.10
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                FeatureDao_Impl.this.__db.beginTransaction();
                try {
                    FeatureDao_Impl.this.__updateAdapterOfFeatureEntity.handleMultiple(list);
                    FeatureDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    FeatureDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }
}
