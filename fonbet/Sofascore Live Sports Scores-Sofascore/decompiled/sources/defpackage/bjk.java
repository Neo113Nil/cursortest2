package defpackage;

import android.content.Context;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class bjk {
    public static final long a = cn3.b(0, 0, 0, 0, 5);
    public static final /* synthetic */ int b = 0;

    public static final dk0 a(of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        if (!((Boolean) av8Var.k(f5a.a)).booleanValue()) {
            av8Var.d0(2019088453);
            av8Var.s(false);
            return null;
        }
        av8Var.d0(2019030948);
        dk0 dk0Var = (dk0) av8Var.k(sgb.a);
        av8Var.s(false);
        return dk0Var;
    }

    public static final gkh b(op3 op3Var, of3 of3Var) {
        Object obj;
        boolean c = Intrinsics.c(op3Var, mp3.f);
        av8 av8Var = (av8) of3Var;
        boolean h = av8Var.h(c);
        Object O = av8Var.O();
        if (h || O == nf3.a) {
            if (c) {
                obj = gkh.y7;
            } else {
                fn3 fn3Var = new fn3();
                fn3Var.a = a;
                fn3Var.b = new ArrayList();
                obj = fn3Var;
            }
            O = obj;
            av8Var.n0(O);
        }
        return (gkh) O;
    }

    public static final nt9 c(Object obj, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.d0(1319639034);
        if (obj instanceof nt9) {
            av8Var.d0(1530875884);
            nt9 nt9Var = (nt9) obj;
            av8Var.s(false);
            av8Var.s(false);
            return nt9Var;
        }
        av8Var.d0(1530915130);
        Context context = (Context) av8Var.k(nz.b);
        boolean g = av8Var.g(context) | av8Var.g(obj);
        Object O = av8Var.O();
        if (g || O == nf3.a) {
            ht9 ht9Var = new ht9(context);
            ht9Var.c = obj;
            O = ht9Var.a();
            av8Var.n0(O);
        }
        nt9 nt9Var2 = (nt9) O;
        av8Var.s(false);
        av8Var.s(false);
        return nt9Var2;
    }

    public static final long d(long j) {
        return (wzb.b(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (wzb.b(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static void e(String str) {
        throw new IllegalArgumentException(fc6.n("Unsupported type: ", str, ". ", lnb.o("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void f(nt9 nt9Var) {
        Object obj = nt9Var.b;
        if (obj instanceof ht9) {
            a70.p("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof a10) {
            e("ImageBitmap");
            throw null;
        }
        if (obj instanceof ImageVector) {
            e("ImageVector");
            throw null;
        }
        if (obj instanceof d7e) {
            e("Painter");
            throw null;
        }
        if (nt9Var.c != null) {
            a70.p("request.target must be null.");
        } else {
            if (((g6b) fqj.w(nt9Var, vt9.e)) == null) {
                return;
            }
            a70.p("request.lifecycle must be null.");
        }
    }
}
