package com.sofascore.results.wc26.widget;

import android.content.Context;
import android.content.Intent;
import com.sofascore.results.player.PlayerActivity;
import defpackage.fz8;
import defpackage.jle;
import defpackage.nb;
import defpackage.pzc;
import defpackage.re0;
import defpackage.rq3;
import defpackage.zxe;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/wc26/widget/LaunchPlayerSeason;", "Lnb;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LaunchPlayerSeason implements nb {
    @Override // defpackage.nb
    public final Object a(Context context, re0 re0Var, pzc pzcVar, rq3 rq3Var) {
        Intent d;
        Integer num = (Integer) pzcVar.a.get(fz8.m);
        if (num == null) {
            return Unit.a;
        }
        int intValue = num.intValue();
        int i = PlayerActivity.Z;
        d = jle.d(context, intValue, (r15 & 4) != 0 ? 0 : 16, (r15 & 8) != 0 ? null : new Integer(58210), zxe.d, false, null, (r15 & 128) != 0 ? null : null, null);
        d.setFlags(335544320);
        d.putExtra("intent_from_widget", true);
        context.startActivity(d);
        return Unit.a;
    }
}
