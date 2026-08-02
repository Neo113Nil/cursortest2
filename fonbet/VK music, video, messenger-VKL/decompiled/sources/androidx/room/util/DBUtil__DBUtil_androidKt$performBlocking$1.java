package androidx.room.util;

import androidx.room.RoomDatabase;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.hyg0;
import xsna.izs;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: DBUtil.android.kt */
@b6l(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", l = {247}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DBUtil__DBUtil_androidKt$performBlocking$1 extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ izs<hyg0, Object> $block;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performBlocking$1(RoomDatabase roomDatabase, spj spjVar, izs izsVar, boolean z, boolean z2) {
        super(2, spjVar);
        this.$db = roomDatabase;
        this.$inTransaction = z;
        this.$isReadOnly = z2;
        this.$block = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new DBUtil__DBUtil_androidKt$performBlocking$1(this.$db, spjVar, this.$block, this.$inTransaction, this.$isReadOnly);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((DBUtil__DBUtil_androidKt$performBlocking$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
            return obj;
        }
        a.a(obj);
        boolean z = !(this.$db.o() && this.$db.p()) && this.$inTransaction;
        RoomDatabase roomDatabase = this.$db;
        boolean z2 = this.$isReadOnly;
        DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1(roomDatabase, null, this.$block, z, z2);
        this.label = 1;
        Object x = roomDatabase.x(z2, dBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1, this);
        return x == coroutineSingletons ? coroutineSingletons : x;
    }
}
