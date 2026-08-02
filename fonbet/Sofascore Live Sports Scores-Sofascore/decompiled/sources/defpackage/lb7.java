package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class lb7 {
    public static final void a(ob7 ob7Var, wb7 wb7Var, Function1 function1, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        ob7Var.getClass();
        wb7Var.getClass();
        function1.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1846837176);
        int i3 = i | (av8Var.i(ob7Var) ? 4 : 2) | (av8Var.i(wb7Var) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? a.o : 1024) | (av8Var.g(xtcVar) ? 16384 : 8192);
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            Context context = (Context) av8Var.k(nz.b);
            e1d x = rfo.x(ob7Var.g, av8Var, 0);
            boolean z = ((mb7) x.getValue()).e;
            boolean i4 = av8Var.i(ob7Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i4 || O == a99Var) {
                O = new ib7(ob7Var, 0);
                av8Var.n0(O);
            }
            Function0 function02 = (Function0) O;
            FantasyCompetitionType fantasyCompetitionType = ((mb7) x.getValue()).f;
            tz9.l(z, function02, null, false, null, oea.v((fantasyCompetitionType == null ? -1 : kb7.a[fantasyCompetitionType.ordinal()]) == 1 ? R.string.fantasy_weekly_competitions : R.string.fantasy_season_long_competitions, av8Var), null, null, yqo.H(1300679851, av8Var, new zx0(2, x)), av8Var, 100663296, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
            boolean z2 = ((mb7) x.getValue()).d;
            boolean i5 = av8Var.i(ob7Var);
            Object O2 = av8Var.O();
            if (i5 || O2 == a99Var) {
                O2 = new ib7(ob7Var, 1);
                av8Var.n0(O2);
            }
            un0.f(z2, (Function0) O2, false, false, yqo.H(-732547017, av8Var, new jo6(ob7Var, 27)), av8Var, 24576, 12);
            mb7 mb7Var = (mb7) x.getValue();
            boolean i6 = av8Var.i(ob7Var) | av8Var.i(context) | av8Var.i(wb7Var) | ((i3 & 7168) == 2048);
            Object O3 = av8Var.O();
            if (i6 || O3 == a99Var) {
                i2 = i3;
                l50 l50Var = new l50(ob7Var, context, wb7Var, function0, 18);
                av8Var.n0(l50Var);
                O3 = l50Var;
            } else {
                i2 = i3;
            }
            b(mb7Var, function1, (Function1) O3, xtcVar, av8Var, (i2 >> 3) & 7280);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere(ob7Var, wb7Var, function1, function0, xtcVar, i, 7);
        }
    }

    public static final void b(mb7 mb7Var, Function1 function1, Function1 function12, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-359589968);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(mb7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            wkn.a(mb7Var.a, n9e.q(xtcVar, lz.D(R.color.surface_1, av8Var), oyn.e), null, null, yqo.H(-958204747, av8Var, new d67(function12, function1, mb7Var)), av8Var, 24576, 12);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(mb7Var, function1, function12, xtcVar, i, 15);
        }
    }
}
