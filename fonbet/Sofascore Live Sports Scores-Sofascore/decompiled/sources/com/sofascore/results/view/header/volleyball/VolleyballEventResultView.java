package com.sofascore.results.view.header.volleyball;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.Event;
import defpackage.a3;
import defpackage.av8;
import defpackage.b0a;
import defpackage.cxk;
import defpackage.dxk;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.eqf;
import defpackage.haa;
import defpackage.of3;
import defpackage.yqo;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002R/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/sofascore/results/view/header/volleyball/VolleyballEventResultView;", "La3;", "Ldxk;", "<set-?>", CampaignEx.JSON_KEY_AD_K, "Le1d;", "getData", "()Ldxk;", "setData", "(Ldxk;)V", "data", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VolleyballEventResultView extends a3 {
    public static final /* synthetic */ int l = 0;

    /* renamed from: k, reason: from kotlin metadata */
    public final e1d data;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VolleyballEventResultView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        this.data = e.f(null);
    }

    private final dxk getData() {
        return (dxk) ((eoh) this.data).getValue();
    }

    public static final Unit l(VolleyballEventResultView volleyballEventResultView, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            b0a.w(volleyballEventResultView.getData(), av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final void setData(dxk dxkVar) {
        ((eoh) this.data).setValue(dxkVar);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(781887993);
        int i2 = (av8Var.g(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            haa.f(yqo.H(1069013662, av8Var, new cxk(this)), av8Var, 6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cxk(this, i);
        }
    }

    public final void m(Event event, boolean z) {
        boolean z2;
        Boolean bool;
        Boolean bool2;
        event.getClass();
        String type = event.getStatus().getType();
        String statusDescription = event.getStatusDescription();
        String sportSlug = event.getSportSlug();
        long startTimestamp = event.getStartTimestamp();
        int id = Event.getHomeTeam$default(event, null, 1, null).getId();
        int id2 = Event.getAwayTeam$default(event, null, 1, null).getId();
        boolean z3 = false;
        if (!z || Event.getHomeTeam$default(event, null, 1, null).getDisabled()) {
            z2 = false;
        } else {
            z2 = false;
            z3 = true;
        }
        if (z && !Event.getAwayTeam$default(event, null, 1, null).getDisabled()) {
            z2 = true;
        }
        Integer display = Event.getHomeScore$default(event, null, 1, null).getDisplay();
        String valueOf = display != null ? String.valueOf(display.intValue()) : null;
        Integer display2 = Event.getAwayScore$default(event, null, 1, null).getDisplay();
        String valueOf2 = display2 != null ? String.valueOf(display2.intValue()) : null;
        String lastPeriod = event.getLastPeriod();
        Integer scoreByPeriodName = Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName(event.getLastPeriod());
        String valueOf3 = scoreByPeriodName != null ? String.valueOf(scoreByPeriodName.intValue()) : null;
        Integer scoreByPeriodName2 = Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName(event.getLastPeriod());
        String valueOf4 = scoreByPeriodName2 != null ? String.valueOf(scoreByPeriodName2.intValue()) : null;
        Integer winnerCode$default = Event.getWinnerCode$default(event, null, 1, null);
        if (winnerCode$default != null) {
            bool = Boolean.valueOf(winnerCode$default.intValue() == 1);
        } else {
            bool = null;
        }
        Integer aggregatedWinnerCode$default = Event.getAggregatedWinnerCode$default(event, null, 1, null);
        if (aggregatedWinnerCode$default != null) {
            bool2 = Boolean.valueOf(aggregatedWinnerCode$default.intValue() == 1);
        } else {
            bool2 = null;
        }
        setData(new dxk(type, statusDescription, sportSlug, startTimestamp, id, id2, z3, z2, valueOf, valueOf2, lastPeriod, valueOf3, valueOf4, bool, bool2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VolleyballEventResultView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
