package v;

import androidx.camera.core.impl.InterfaceC5104l0;
import v.X;

/* renamed from: v.x0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C10148x0 implements I.a, InterfaceC5104l0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f101404a;

    public /* synthetic */ C10148x0(Object obj) {
        this.f101404a = obj;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0.a
    public void a(InterfaceC5104l0 interfaceC5104l0) {
        d2 d2Var = (d2) this.f101404a;
        d2Var.getClass();
        try {
            androidx.camera.core.p e11 = interfaceC5104l0.e();
            if (e11 != null) {
                d2Var.f101236b.b(e11);
            }
        } catch (IllegalStateException e12) {
            C.S.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e12.getMessage());
        }
    }

    @Override // I.a, qc.o
    public com.google.common.util.concurrent.m apply(Object obj) {
        return X.h.d((X.h) this.f101404a);
    }
}
