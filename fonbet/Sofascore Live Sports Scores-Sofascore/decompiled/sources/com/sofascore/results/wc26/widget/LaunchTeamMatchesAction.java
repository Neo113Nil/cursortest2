package com.sofascore.results.wc26.widget;

import android.content.Context;
import android.content.Intent;
import com.sofascore.results.team.TeamActivity;
import defpackage.fz8;
import defpackage.jle;
import defpackage.nb;
import defpackage.pzc;
import defpackage.re0;
import defpackage.rq3;
import defpackage.t4j;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/wc26/widget/LaunchTeamMatchesAction;", "Lnb;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LaunchTeamMatchesAction implements nb {
    @Override // defpackage.nb
    public final Object a(Context context, re0 re0Var, pzc pzcVar, rq3 rq3Var) {
        Intent e;
        Integer num = (Integer) pzcVar.a.get(fz8.n);
        if (num == null) {
            return Unit.a;
        }
        int intValue = num.intValue();
        int i = TeamActivity.Z;
        t4j t4jVar = t4j.c;
        e = jle.e(context, intValue, (r14 & 4) != 0 ? null : t4j.d, (r14 & 8) != 0 ? null : null, null, (r14 & 32) != 0 ? null : new Integer(16), null);
        e.setFlags(335544320);
        e.putExtra("intent_from_widget", true);
        context.startActivity(e);
        return Unit.a;
    }
}
