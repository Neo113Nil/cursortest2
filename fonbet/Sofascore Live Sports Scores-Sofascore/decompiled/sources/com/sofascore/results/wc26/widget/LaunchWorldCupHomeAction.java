package com.sofascore.results.wc26.widget;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.main.MainActivity;
import defpackage.a5f;
import defpackage.a99;
import defpackage.f8h;
import defpackage.fn0;
import defpackage.j58;
import defpackage.nb;
import defpackage.pzc;
import defpackage.re0;
import defpackage.rq3;
import defpackage.uic;
import defpackage.yea;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/wc26/widget/LaunchWorldCupHomeAction;", "Lnb;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LaunchWorldCupHomeAction implements nb {
    @Override // defpackage.nb
    public final Object a(Context context, re0 re0Var, pzc pzcVar, rq3 rq3Var) {
        Context context2;
        Intent s;
        context.getClass();
        yea yeaVar = j58.a;
        if (!fn0.B("should_show_world_cup")) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences = a5f.d(applicationContext);
                    uic.j = sharedPreferences;
                }
                sharedPreferences.getClass();
            }
            if (!sharedPreferences.getBoolean("DEV_MODE_SHOW_WORLD_CUP", false)) {
                context2 = context;
                s = a99.x(LeagueActivity.h0, context2, new Integer(16), null, null, null, null, false, false, null, null, null, null, null, 8184);
                s.setFlags(872415232);
                context2.startActivity(s);
                return Unit.a;
            }
        }
        context2 = context;
        boolean z = MainActivity.n0;
        s = f8h.s(context2, null);
        s.putExtra("open_action", "select_world_cup");
        s.setFlags(872415232);
        context2.startActivity(s);
        return Unit.a;
    }
}
