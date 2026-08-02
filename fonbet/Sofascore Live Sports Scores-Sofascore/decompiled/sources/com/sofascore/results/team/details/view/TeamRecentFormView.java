package com.sofascore.results.team.details.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.a3;
import defpackage.av8;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.eqf;
import defpackage.gv9;
import defpackage.haa;
import defpackage.of3;
import defpackage.q8i;
import defpackage.s5h;
import defpackage.yqo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R;\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/sofascore/results/team/details/view/TeamRecentFormView;", "La3;", "Lgv9;", "Lwyi;", "matches", "", "setData", "(Lgv9;)V", "<set-?>", CampaignEx.JSON_KEY_AD_K, "Le1d;", "getEvents", "()Lgv9;", "setEvents", "events", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamRecentFormView extends a3 {
    public static final /* synthetic */ int l = 0;

    /* renamed from: k, reason: from kotlin metadata */
    public final e1d events;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamRecentFormView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.events = e.f(null);
    }

    private final gv9 getEvents() {
        return (gv9) ((eoh) this.events).getValue();
    }

    private final void setEvents(gv9 gv9Var) {
        ((eoh) this.events).setValue(gv9Var);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-900524539);
        int i2 = (av8Var.g(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            gv9 events = getEvents();
            if (events == null) {
                av8Var.d0(-1160768310);
                av8Var.s(false);
            } else {
                av8Var.d0(-1160768309);
                haa.f(yqo.H(-1776992491, av8Var, new s5h(17, events, this)), av8Var, 6);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new q8i(this, i, 13);
        }
    }

    public final void setData(@NotNull gv9 matches) {
        matches.getClass();
        setEvents(matches);
    }
}
