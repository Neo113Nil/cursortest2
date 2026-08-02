package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qg9 implements Closeable {
    public final kof a;
    public final x52 b;
    public final vk4 c;
    public int d;
    public boolean e;

    public qg9(kof kofVar) {
        this.a = kofVar;
        x52 x52Var = new x52();
        this.b = x52Var;
        this.c = new vk4(x52Var);
        this.d = 16384;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.a.close();
    }

    public final void e(int i, int i2, byte b, byte b2) {
        Logger logger = sg9.a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(og9.a(false, i, i2, b, b2));
        }
        int i3 = this.d;
        if (i2 > i3) {
            Locale locale = Locale.US;
            a70.p(dmi.k(i3, i2, "FRAME_SIZE_ERROR length > ", ": "));
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            Locale locale2 = Locale.US;
            a70.p(ljg.j(i, "reserved bit set: "));
            return;
        }
        kof kofVar = this.a;
        kofVar.writeByte((i2 >>> 16) & 255);
        kofVar.writeByte((i2 >>> 8) & 255);
        kofVar.writeByte(i2 & 255);
        kofVar.writeByte(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        kofVar.writeByte(b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        kofVar.n(i & Integer.MAX_VALUE);
    }

    public final void f(int i, List list, boolean z) {
        int i2;
        int i3;
        if (this.e) {
            is8.e("closed");
            return;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            x79 x79Var = (x79) list.get(i4);
            gc2 u = x79Var.a.u();
            gc2 gc2Var = x79Var.b;
            Integer num = (Integer) dg9.c.get(u);
            if (num != null) {
                int intValue = num.intValue();
                i3 = intValue + 1;
                if (i3 >= 2 && i3 <= 7) {
                    x79[] x79VarArr = dg9.b;
                    if (x79VarArr[intValue].b.equals(gc2Var)) {
                        i2 = i3;
                    } else if (x79VarArr[i3].b.equals(gc2Var)) {
                        i3 = intValue + 2;
                        i2 = i3;
                    }
                }
                i2 = i3;
                i3 = -1;
            } else {
                i2 = -1;
                i3 = -1;
            }
            vk4 vk4Var = this.c;
            if (i3 == -1) {
                int i5 = vk4Var.b + 1;
                while (true) {
                    x79[] x79VarArr2 = (x79[]) vk4Var.e;
                    if (i5 >= x79VarArr2.length) {
                        break;
                    }
                    if (x79VarArr2[i5].a.equals(u)) {
                        if (((x79[]) vk4Var.e)[i5].b.equals(gc2Var)) {
                            i3 = (i5 - vk4Var.b) + dg9.b.length;
                            break;
                        } else if (i2 == -1) {
                            i2 = (i5 - vk4Var.b) + dg9.b.length;
                        }
                    }
                    i5++;
                }
            }
            if (i3 != -1) {
                vk4Var.d(i3, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 128);
            } else if (i2 == -1) {
                ((x52) vk4Var.d).Y0(64);
                vk4Var.c(u);
                vk4Var.c(gc2Var);
                vk4Var.b(x79Var);
            } else {
                gc2 gc2Var2 = dg9.a;
                u.getClass();
                gc2Var2.getClass();
                if (!u.q(gc2Var2, 0, gc2Var2.h()) || x79.h.equals(u)) {
                    vk4Var.d(i2, 63, 64);
                    vk4Var.c(gc2Var);
                    vk4Var.b(x79Var);
                } else {
                    vk4Var.d(i2, 15, 0);
                    vk4Var.c(gc2Var);
                }
            }
        }
        x52 x52Var = this.b;
        long j = x52Var.b;
        int min = (int) Math.min(this.d, j);
        long j2 = min;
        byte b = j == j2 ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        e(i, min, (byte) 1, b);
        kof kofVar = this.a;
        kofVar.W(x52Var, j2);
        if (j > j2) {
            long j3 = j - j2;
            while (j3 > 0) {
                int min2 = (int) Math.min(this.d, j3);
                long j4 = min2;
                j3 -= j4;
                e(i, min2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                kofVar.W(x52Var, j4);
            }
        }
    }
}
