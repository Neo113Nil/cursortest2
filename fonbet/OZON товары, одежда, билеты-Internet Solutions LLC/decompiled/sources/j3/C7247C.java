package j3;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j3.C, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7247C implements Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<C7249E> f68930a;

    C7247C(kotlin.jvm.internal.M<C7249E> m11) {
        this.f68930a = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        C7249E c7249e = this.f68930a.f71787a;
        if (c7249e != null) {
            c7249e.q().set(true);
            return Unit.f71690a;
        }
        Intrinsics.n(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw null;
    }
}
