package rc0;

import Sc.InterfaceC4008j;
import Sc.s;
import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import uc0.C10020a;
import xe.M;

@e(c = "ru.ozon.id.nativeauth.crossApp.migration.SharedStoreMigrationInterceptor$migrateTokensIfNeed$1", f = "SharedStoreMigrationInterceptor.kt", l = {48}, m = "invokeSuspend")
/* renamed from: rc0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C9244a extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f83283d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9245b f83284e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9244a(C9245b c9245b, d<? super C9244a> dVar) {
        super(2, dVar);
        this.f83284e = c9245b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new C9244a(this.f83284e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((C9244a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        ConditionVariable conditionVariable;
        AtomicBoolean atomicBoolean2;
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f83283d;
        C9245b c9245b = this.f83284e;
        try {
            if (i11 == 0) {
                s.b(obj);
                atomicBoolean2 = c9245b.f83287c;
                if (atomicBoolean2.compareAndSet(false, true)) {
                    interfaceC4008j = c9245b.f83285a;
                    C10020a c10020a = (C10020a) interfaceC4008j.getValue();
                    this.f83283d = 1;
                    if (c10020a.e(this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        } finally {
            atomicBoolean = c9245b.f83286b;
            atomicBoolean.set(true);
            conditionVariable = c9245b.f83288d;
            conditionVariable.open();
        }
    }
}
