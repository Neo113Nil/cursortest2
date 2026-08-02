package defpackage;

import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ssa implements spg, mpg {
    public final tpg a;
    public final mpg b;
    public final y0d c;

    public ssa(spg spgVar, Map map, mpg mpgVar) {
        ida idaVar = new ida(spgVar, 10);
        ff5 ff5Var = upg.a;
        this.a = new tpg(map, idaVar);
        this.b = mpgVar;
        y0d y0dVar = rrg.a;
        this.c = new y0d();
    }

    @Override // defpackage.spg
    public final rpg a(String str, Function0 function0) {
        return this.a.a(str, function0);
    }

    @Override // defpackage.mpg
    public final void b(Object obj, tc3 tc3Var, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-858296452);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(tc3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(this) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            this.b.b(obj, tc3Var, av8Var, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            boolean i3 = av8Var.i(this) | av8Var.i(obj);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new uf8(18, this, obj);
                av8Var.n0(O);
            }
            hz8.d(obj, (Function1) O, av8Var);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(this, obj, tc3Var, i, 7);
        }
    }

    @Override // defpackage.mpg
    public final void c(Object obj) {
        this.b.c(obj);
    }

    @Override // defpackage.spg
    public final boolean d(Object obj) {
        return this.a.d(obj);
    }

    @Override // defpackage.spg
    public final Map e() {
        y0d y0dVar = this.c;
        Object[] objArr = y0dVar.b;
        long[] jArr = y0dVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.b.c(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.a.e();
    }

    @Override // defpackage.spg
    public final Object f(String str) {
        return this.a.f(str);
    }
}
