package wd;

import je.K0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9842h;
import td.i0;

/* renamed from: wd.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C10520f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC10523i f104292a;

    public C10520f(AbstractC10523i abstractC10523i) {
        this.f104292a = abstractC10523i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z11;
        K0 k02 = (K0) obj;
        Intrinsics.f(k02);
        if (!je.S.a(k02)) {
            InterfaceC9842h p11 = k02.H0().p();
            if ((p11 instanceof i0) && !Intrinsics.d(((i0) p11).d(), this.f104292a)) {
                z11 = true;
                return Boolean.valueOf(z11);
            }
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }
}
