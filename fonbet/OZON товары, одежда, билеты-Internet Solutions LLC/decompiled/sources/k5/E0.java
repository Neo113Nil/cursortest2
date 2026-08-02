package k5;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import k5.F0;
import k5.InterfaceC7518g2;

/* loaded from: classes8.dex */
final class E0 extends InterfaceC7518g2.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ F0 f70533a;

    E0(F0 f02) {
        this.f70533a = f02;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"MissingPermission"})
    public final void run() {
        G0 g02;
        InterfaceC7587y0 interfaceC7587y0;
        long j11;
        F0 f02 = this.f70533a;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            F0.a w11 = f02.w();
            if (w11 != null) {
                long j12 = w11.f70542b;
                j11 = F0.f70535i;
                if (currentTimeMillis > j12 + j11) {
                }
                int i11 = F0.f70536j;
            }
            if (f02.A() && f02.D()) {
                interfaceC7587y0 = f02.f70539g;
                ArrayList<InterfaceC7496b0> a11 = ((b3) interfaceC7587y0).a();
                long currentTimeMillis2 = System.currentTimeMillis();
                F0.a aVar = new F0.a();
                aVar.f70541a = a11;
                aVar.f70542b = currentTimeMillis2;
                f02.F(aVar);
            }
            int i112 = F0.f70536j;
        } catch (Throwable th2) {
            try {
                g02 = f02.f70540h;
                g02.b(f02.x(), new P2(th2.getMessage(), th2));
            } catch (Throwable th3) {
                f02.getClass();
                throw th3;
            }
        }
    }
}
