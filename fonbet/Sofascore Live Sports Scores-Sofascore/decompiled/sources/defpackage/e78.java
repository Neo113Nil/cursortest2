package defpackage;

import androidx.media3.common.b;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e78 extends qgi {
    public g78 o;
    public c78 p;

    @Override // defpackage.qgi
    public final long b(j9e j9eVar) {
        byte[] bArr = j9eVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i == 6 || i == 7) {
            j9eVar.O(4);
            j9eVar.I();
        }
        int J = wnn.J(i, j9eVar);
        j9eVar.N(0);
        return J;
    }

    @Override // defpackage.qgi
    public final boolean d(j9e j9eVar, long j, y3g y3gVar) {
        byte[] bArr = j9eVar.a;
        g78 g78Var = this.o;
        if (g78Var == null) {
            g78 g78Var2 = new g78(bArr, 17, 1);
            this.o = g78Var2;
            qm8 a = g78Var2.e(Arrays.copyOfRange(bArr, 9, j9eVar.c), null).a();
            a.m = sjc.p("audio/ogg");
            y3gVar.b = new b(a);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) != 3) {
            if (b != -1) {
                return true;
            }
            c78 c78Var = this.p;
            if (c78Var != null) {
                c78Var.b = j;
                y3gVar.c = c78Var;
            }
            ((b) y3gVar.b).getClass();
            return false;
        }
        f78 P = n4o.P(j9eVar);
        g78 g78Var3 = new g78(g78Var.b, g78Var.c, g78Var.d, g78Var.e, g78Var.f, g78Var.h, g78Var.i, g78Var.k, P, (ric) g78Var.m);
        this.o = g78Var3;
        c78 c78Var2 = new c78(1);
        c78Var2.d = g78Var3;
        c78Var2.e = P;
        c78Var2.b = -1L;
        c78Var2.c = -1L;
        this.p = c78Var2;
        return true;
    }

    @Override // defpackage.qgi
    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = null;
            this.p = null;
        }
    }
}
