package defpackage;

import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.features.moments.widgets.compose.BlazeComposeWidgetMomentsStateHandler;
import com.blaze.blazesdk.features.stories.widgets.compose.BlazeComposeWidgetStoriesStateHandler;
import com.blaze.blazesdk.features.videos.widgets.compose.BlazeComposeWidgetVideosStateHandler;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.results.R;
import defpackage.lrl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class tmm {
    public static final void a(lrl.c cVar, BlazeComposeWidgetStoriesStateHandler blazeComposeWidgetStoriesStateHandler, BlazeComposeWidgetMomentsStateHandler blazeComposeWidgetMomentsStateHandler, BlazeComposeWidgetVideosStateHandler blazeComposeWidgetVideosStateHandler, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        blazeComposeWidgetStoriesStateHandler.getClass();
        blazeComposeWidgetMomentsStateHandler.getClass();
        blazeComposeWidgetVideosStateHandler.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1466916372);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(blazeComposeWidgetStoriesStateHandler) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(blazeComposeWidgetMomentsStateHandler) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(blazeComposeWidgetVideosStateHandler) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && av8Var.D()) {
            av8Var.W();
        } else {
            xtc u0 = hkg.u0(xtcVar.z(bkh.c), hkg.o0(av8Var), false, 14);
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, u0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            b(oea.v(R.string.blaze_search_section_stories, av8Var), cVar.b, yqo.H(767137067, av8Var, new nhm(blazeComposeWidgetStoriesStateHandler)), av8Var, 384);
            b(oea.v(R.string.blaze_search_section_moments, av8Var), cVar.c, yqo.H(-1717957868, av8Var, new ijm(blazeComposeWidgetMomentsStateHandler)), av8Var, 384);
            b(oea.v(R.string.blaze_search_section_videos, av8Var), cVar.d, yqo.H(-40934541, av8Var, new flm(blazeComposeWidgetVideosStateHandler)), av8Var, 384);
            w1l.s(utc.a, 16.0f, av8Var, true);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(cVar, blazeComposeWidgetStoriesStateHandler, blazeComposeWidgetMomentsStateHandler, blazeComposeWidgetVideosStateHandler, xtcVar, i, 20);
        }
    }

    public static final void b(String str, boolean z, tc3 tc3Var, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(56997925);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            fz8.e(z, null, uo5.e(null, 3).a(uo5.d(null, null, 15)), uo5.f(null, 3).a(uo5.l(null, null, 15)), null, yqo.H(-310037939, av8Var, new lfm(str, tc3Var)), av8Var, ((i2 >> 3) & 14) | 200064, 18);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(str, z, (dt8) tc3Var, i, 21);
        }
    }
}
