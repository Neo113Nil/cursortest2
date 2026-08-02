package spay.sdk;

import R2.InterfaceC3917k;
import Sc.s;
import Ve.AbstractC4255g;
import Ve.C4571qq;
import Ve.C4593rk;
import Ve.Fn;
import Ve.Nh;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class c extends j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f98847a;

    public c(kotlin.coroutines.d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new c(dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c((kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f98847a;
        if (i11 == 0) {
            s.b(obj);
            Nh securePreferences$SPaySDK_baseRelease = SPaySdkApp.INSTANCE.getInstance().getSecurePreferences$SPaySDK_baseRelease();
            this.f98847a = 1;
            Object a11 = W2.j.a((InterfaceC3917k) AbstractC4255g.f31066c.getValue(((C4571qq) ((C4593rk) securePreferences$SPaySDK_baseRelease).f31982c.getValue()).f31921a, AbstractC4255g.f31064a[0]), new Fn(2, null), this);
            if (a11 != obj2) {
                a11 = Unit.f71690a;
            }
            if (a11 != obj2) {
                a11 = Unit.f71690a;
            }
            if (a11 == obj2) {
                return obj2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
