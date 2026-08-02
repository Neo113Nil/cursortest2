package defpackage;

import android.content.Context;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.results.R;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class j34 {
    public static final int a(CrowdsourcingIncidentType crowdsourcingIncidentType) {
        crowdsourcingIncidentType.getClass();
        if (crowdsourcingIncidentType == CrowdsourcingIncidentType.Goal.REGULAR) {
            return R.drawable.ic_ball_football;
        }
        if (crowdsourcingIncidentType == CrowdsourcingIncidentType.Goal.PENALTY) {
            return R.drawable.ic_penalty_shot;
        }
        if (crowdsourcingIncidentType == CrowdsourcingIncidentType.Goal.OWN_GOAL) {
            return R.drawable.ic_autogoal;
        }
        if (crowdsourcingIncidentType == CrowdsourcingIncidentType.Card.RED) {
            return R.drawable.ic_card_red;
        }
        if (crowdsourcingIncidentType == CrowdsourcingIncidentType.Card.SECOND_YELLOW) {
            return R.drawable.ic_yellow_double_16;
        }
        if (crowdsourcingIncidentType == CrowdsourcingIncidentType.Card.YELLOW) {
            return R.drawable.ic_card_yellow;
        }
        zzl.b();
        return 0;
    }

    public static final int b(SuggestStatus suggestStatus) {
        suggestStatus.getClass();
        int i = i34.a[suggestStatus.ordinal()];
        if (i == 1 || i == 2) {
            return R.drawable.ic_confirmed;
        }
        if (i == 3) {
            return R.drawable.ic_minimize;
        }
        if (i == 4) {
            return R.drawable.ic_close;
        }
        if (i == 5) {
            return R.drawable.ic_done;
        }
        zzl.b();
        return 0;
    }

    public static final fdi c(z88 z88Var, iz2 iz2Var, Object obj) {
        fdi a = gdi.a(obj);
        xw3.L(iz2Var, null, null, new hy1(z88Var, a, null, 25), 3);
        return a;
    }

    public static final List d(l64 l64Var, boolean z) {
        int ordinal = l64Var.ordinal();
        return ordinal != 1 ? ordinal != 2 ? b.j(SuggestStatus.SUBMITTED, SuggestStatus.PENDING, SuggestStatus.APPROVED) : km5.a : z ? b.j(SuggestStatus.DECLINED, SuggestStatus.IGNORED, SuggestStatus.APPROVED) : b.j(SuggestStatus.SUBMITTED, SuggestStatus.PENDING, SuggestStatus.APPROVED);
    }

    public static final String e(CrowdsourcingIncidentType crowdsourcingIncidentType, Context context) {
        String string;
        crowdsourcingIncidentType.getClass();
        context.getClass();
        if (crowdsourcingIncidentType == CrowdsourcingIncidentType.Goal.REGULAR) {
            string = context.getString(R.string.football_goal);
        } else if (crowdsourcingIncidentType == CrowdsourcingIncidentType.Goal.PENALTY) {
            string = context.getString(R.string.football_shot_situation_penalty);
        } else if (crowdsourcingIncidentType == CrowdsourcingIncidentType.Goal.OWN_GOAL) {
            string = context.getString(R.string.own_goal);
        } else if (crowdsourcingIncidentType == CrowdsourcingIncidentType.Card.RED) {
            string = context.getString(R.string.football_red_card_shortened);
        } else if (crowdsourcingIncidentType == CrowdsourcingIncidentType.Card.SECOND_YELLOW) {
            string = context.getString(R.string.football_yellow_red_card_short);
        } else {
            if (crowdsourcingIncidentType != CrowdsourcingIncidentType.Card.YELLOW) {
                zzl.b();
                return null;
            }
            string = context.getString(R.string.football_yellow_card_shortened);
        }
        string.getClass();
        return string;
    }

    public static final long f(SuggestStatus suggestStatus, of3 of3Var) {
        suggestStatus.getClass();
        int i = i34.a[suggestStatus.ordinal()];
        if (i == 1) {
            av8 av8Var = (av8) of3Var;
            return ljg.f(av8Var, 1567793928, R.color.n_lv_3, av8Var, false);
        }
        if (i == 2) {
            av8 av8Var2 = (av8) of3Var;
            return ljg.f(av8Var2, 1567795211, R.color.success, av8Var2, false);
        }
        if (i == 3) {
            av8 av8Var3 = (av8) of3Var;
            return ljg.f(av8Var3, 1567796552, R.color.n_lv_3, av8Var3, false);
        }
        if (i == 4) {
            av8 av8Var4 = (av8) of3Var;
            return ljg.f(av8Var4, 1567797833, R.color.error, av8Var4, false);
        }
        if (i != 5) {
            throw dmi.h((av8) of3Var, 1567791449, false);
        }
        av8 av8Var5 = (av8) of3Var;
        return ljg.f(av8Var5, 1567792680, R.color.n_lv_3, av8Var5, false);
    }
}
