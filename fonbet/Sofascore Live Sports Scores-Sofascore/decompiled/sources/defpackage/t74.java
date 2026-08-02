package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class t74 {
    static {
        ypa.b(new g14(20));
    }

    public static final void a(goa goaVar, gj5 gj5Var, long j, int i, int i2, double d, boolean z, Function0 function0, of3 of3Var, int i3) {
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(824972965);
        int i4 = i3 | (av8Var.g(goaVar) ? 4 : 2) | (av8Var.g(gj5Var) ? 32 : 16) | (av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.e(i) ? a.o : 1024) | (av8Var.e(i2) ? 16384 : 8192) | (av8Var.c(d) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.h(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.i(function0) ? 8388608 : 4194304);
        if (av8Var.T(i4 & 1, (4793491 & i4) != 4793490)) {
            ff5 ff5Var = dh3.h;
            kx4 kx4Var = (kx4) av8Var.k(ff5Var);
            boolean d2 = av8Var.d(kx4Var.j());
            Object O = av8Var.O();
            if (d2 || O == nf3.a) {
                O = new nx4(kx4Var.j(), 1.0f);
                av8Var.n0(O);
            }
            tol.b(ff5Var.a((kx4) O), yqo.H(-354550939, av8Var, new s74(goaVar, gj5Var, j, function0, i, i2, d, z)), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s74(goaVar, gj5Var, j, i, i2, d, z, function0, i3);
        }
    }
}
