package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.IncidentKt;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class adh extends o8 {
    public final rfe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adh(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.additional_incidents;
        TextView textView = (TextView) nq8.B(R.id.additional_incidents, root);
        if (textView != null) {
            i = R.id.containers;
            if (((Barrier) nq8.B(R.id.containers, root)) != null) {
                i = R.id.first_team_incidents_container;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.first_team_incidents_container, root);
                if (linearLayout != null) {
                    i = R.id.second_team_incidents_container;
                    LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.second_team_incidents_container, root);
                    if (linearLayout2 != null) {
                        this.d = new rfe((ConstraintLayout) root, textView, linearLayout, linearLayout2, 6);
                        context.getColor(R.color.primary_default);
                        context.getColor(R.color.secondary_default);
                        return;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.share_match_details_modal_incidents_container;
    }

    public final String j(Incident incident) {
        if (incident instanceof Incident.GoalIncident) {
            Incident.GoalIncident goalIncident = (Incident.GoalIncident) incident;
            String incidentClass = goalIncident.getIncidentClass();
            String string = Intrinsics.c(incidentClass, "penalty") ? Intrinsics.c(incident.getSport(), Sports.FOOTBALL) ? Intrinsics.c(goalIncident.getIncidentType(), IncidentKt.TYPE_PENALTY_SHOOTOUT) ? getContext().getString(R.string.football_penalty_shootout_made) : getContext().getString(R.string.football_penalty_fulltime_made) : getContext().getString(R.string.pen_start) : Intrinsics.c(incidentClass, Incident.GoalIncident.TYPE_OWN_GOAL) ? getContext().getString(R.string.own_goal) : getContext().getString(R.string.football_goal);
            string.getClass();
            return string;
        }
        if (!(incident instanceof Incident.CardIncident)) {
            return "";
        }
        String incidentClass2 = ((Incident.CardIncident) incident).getIncidentClass();
        String string2 = Intrinsics.c(incidentClass2, Incident.CardIncident.CARD_YELLOW) ? getContext().getString(R.string.yellow_card) : Intrinsics.c(incidentClass2, Incident.CardIncident.CARD_YELLOW_RED) ? getContext().getString(R.string.football_yellow_red_card_shortened) : getContext().getString(R.string.red_card);
        string2.getClass();
        return string2;
    }

    public final LinearLayout l(Incident incident, boolean z) {
        Drawable f;
        String j;
        rfe rfeVar = this.d;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.share_match_details_modal_incidents_item, (ViewGroup) (z ? rfeVar.c : rfeVar.d), false);
        int i = R.id.icon_row_end;
        ImageView imageView = (ImageView) nq8.B(R.id.icon_row_end, inflate);
        String str = null;
        if (imageView != null) {
            i = R.id.icon_row_start;
            ImageView imageView2 = (ImageView) nq8.B(R.id.icon_row_start, inflate);
            if (imageView2 != null) {
                i = R.id.incident_text;
                TextView textView = (TextView) nq8.B(R.id.incident_text, inflate);
                if (textView != null) {
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    imageView2.setVisibility(Intrinsics.c(Incident.isHome$default(incident, null, 1, null), Boolean.FALSE) ? 0 : 8);
                    Boolean isHome$default = Incident.isHome$default(incident, null, 1, null);
                    Boolean bool = Boolean.TRUE;
                    imageView.setVisibility(Intrinsics.c(isHome$default, bool) ? 0 : 8);
                    if (!Intrinsics.c(Incident.isHome$default(incident, null, 1, null), bool)) {
                        imageView = imageView2;
                    }
                    boolean z2 = incident instanceof Incident.GoalIncident;
                    qa5 qa5Var = qa5.a;
                    if (z2) {
                        String incidentClass = ((Incident.GoalIncident) incident).getIncidentClass();
                        boolean c = Intrinsics.c(incidentClass, "penalty");
                        int i2 = R.color.primary_default;
                        if (c) {
                            Context context = getContext();
                            context.getClass();
                            if (z) {
                                i2 = R.color.secondary_default;
                            }
                            Drawable drawable = context.getDrawable(R.drawable.ic_penalty_16);
                            if (drawable != null && (f = drawable.mutate()) != null) {
                                f.setTint(context.getColor(i2));
                            }
                            f = null;
                        } else if (Intrinsics.c(incidentClass, Incident.GoalIncident.TYPE_OWN_GOAL)) {
                            Context context2 = getContext();
                            context2.getClass();
                            f = qa5Var.e(context2);
                        } else {
                            Context context3 = getContext();
                            context3.getClass();
                            if (z) {
                                i2 = R.color.secondary_default;
                            }
                            Drawable drawable2 = context3.getDrawable(R.drawable.ic_goal_incidents);
                            if (drawable2 != null && (f = drawable2.mutate()) != null) {
                                f.setTint(context3.getColor(i2));
                            }
                            f = null;
                        }
                    } else {
                        if (incident instanceof Incident.CardIncident) {
                            String incidentClass2 = ((Incident.CardIncident) incident).getIncidentClass();
                            if (Intrinsics.c(incidentClass2, Incident.CardIncident.CARD_RED)) {
                                Context context4 = getContext();
                                context4.getClass();
                                f = qa5.f(qa5Var, context4, R.drawable.ic_card_red_16, null, 6);
                            } else if (Intrinsics.c(incidentClass2, Incident.CardIncident.CARD_YELLOW_RED)) {
                                Context context5 = getContext();
                                context5.getClass();
                                f = qa5.f(qa5Var, context5, R.drawable.ic_yellow_double_16, null, 6);
                            }
                        }
                        f = null;
                    }
                    imageView.setImageDrawable(f);
                    if (z2) {
                        Incident.GoalIncident goalIncident = (Incident.GoalIncident) incident;
                        Player player = goalIncident.getPlayer();
                        if (player == null || (j = tba.C(player)) == null) {
                            String playerName = goalIncident.getPlayerName();
                            if (playerName != null && !StringsKt.R(playerName)) {
                                str = playerName;
                            }
                            if (str == null) {
                                j = j(incident);
                            }
                            j = str;
                        }
                    } else if (incident instanceof Incident.CardIncident) {
                        Incident.CardIncident cardIncident = (Incident.CardIncident) incident;
                        Player player2 = cardIncident.getPlayer();
                        if (player2 == null || (j = tba.C(player2)) == null) {
                            String playerName2 = cardIncident.getPlayerName();
                            if (playerName2 != null && !StringsKt.R(playerName2)) {
                                str = playerName2;
                            }
                            if (str == null) {
                                j = j(incident);
                            }
                            j = str;
                        }
                    } else {
                        j = j(incident);
                    }
                    Map map = qz9.a;
                    Context context6 = getContext();
                    context6.getClass();
                    textView.setText(j + " " + qz9.a(context6, incident));
                    linearLayout.getClass();
                    return linearLayout;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
