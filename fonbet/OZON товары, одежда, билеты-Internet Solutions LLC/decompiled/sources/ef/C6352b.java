package ef;

import We.B;
import We.G;
import We.K;
import We.L;
import We.M;
import cf.C5822c;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.F;
import sf.z;

/* renamed from: ef.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6352b implements B {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f62217a;

    public C6352b(boolean z11) {
        this.f62217a = z11;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) throws IOException {
        L.a aVar;
        L c11;
        boolean z11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C6357g c6357g = (C6357g) chain;
        C5822c d11 = c6357g.d();
        Intrinsics.f(d11);
        G f7 = c6357g.f();
        K a11 = f7.a();
        long currentTimeMillis = System.currentTimeMillis();
        d11.u(f7);
        boolean z12 = true;
        if (!C6356f.a(f7.h()) || a11 == null) {
            d11.o();
            aVar = null;
        } else {
            if ("100-continue".equalsIgnoreCase(f7.d("Expect"))) {
                d11.f();
                aVar = d11.q(true);
                d11.s();
                z11 = false;
            } else {
                z11 = true;
                aVar = null;
            }
            if (aVar != null) {
                d11.o();
                if (!d11.h().s()) {
                    d11.n();
                }
            } else if (a11.isDuplex()) {
                d11.f();
                a11.writeTo(z.c(d11.c(f7, true)));
            } else {
                F c12 = z.c(d11.c(f7, false));
                a11.writeTo(c12);
                c12.close();
            }
            z12 = z11;
        }
        if (a11 == null || !a11.isDuplex()) {
            d11.e();
        }
        if (aVar == null) {
            aVar = d11.q(false);
            Intrinsics.f(aVar);
            if (z12) {
                d11.s();
                z12 = false;
            }
        }
        aVar.r(f7);
        aVar.h(d11.h().o());
        aVar.s(currentTimeMillis);
        aVar.p(System.currentTimeMillis());
        L c13 = aVar.c();
        int m11 = c13.m();
        if (m11 == 100) {
            L.a q11 = d11.q(false);
            Intrinsics.f(q11);
            if (z12) {
                d11.s();
            }
            q11.r(f7);
            q11.h(d11.h().o());
            q11.s(currentTimeMillis);
            q11.p(System.currentTimeMillis());
            c13 = q11.c();
            m11 = c13.m();
        }
        d11.r(c13);
        if (this.f62217a && m11 == 101) {
            L.a aVar2 = new L.a(c13);
            aVar2.b(Ye.b.f34902c);
            c11 = aVar2.c();
        } else {
            L.a aVar3 = new L.a(c13);
            aVar3.b(d11.p(c13));
            c11 = aVar3.c();
        }
        if ("close".equalsIgnoreCase(c11.L().d("Connection")) || "close".equalsIgnoreCase(L.q(c11, "Connection"))) {
            d11.n();
        }
        if (m11 == 204 || m11 == 205) {
            M c14 = c11.c();
            if ((c14 != null ? c14.contentLength() : -1L) > 0) {
                StringBuilder f11 = P4.f.f(m11, "HTTP ", " had non-zero Content-Length: ");
                M c15 = c11.c();
                f11.append(c15 != null ? Long.valueOf(c15.contentLength()) : null);
                throw new ProtocolException(f11.toString());
            }
        }
        return c11;
    }
}
