package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.TeamLinkedRound;
import com.sofascore.model.mvvm.model.TeamLinksEventTeam;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.league.LeagueActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class nxi {
    public static final void a(TeamLinkedRound teamLinkedRound, Context context) {
        if (teamLinkedRound instanceof TeamLinkedRound.TournamentTeamLinkedRound) {
            TeamLinkedRound.TournamentTeamLinkedRound tournamentTeamLinkedRound = (TeamLinkedRound.TournamentTeamLinkedRound) teamLinkedRound;
            a99.A(LeagueActivity.h0, context, Integer.valueOf(tournamentTeamLinkedRound.getUniqueTournament().getId()), null, Integer.valueOf(tournamentTeamLinkedRound.getSeason().getId()), Intrinsics.c(tournamentTeamLinkedRound.getType(), "knockout") ? y4b.f : null, tournamentTeamLinkedRound.getCupTreeId(), null, 3920);
        } else if (teamLinkedRound instanceof TeamLinkedRound.EventTeamLinkedRound) {
            wxf wxfVar = EventActivity.h0;
            wxf.B(context, ((TeamLinkedRound.EventTeamLinkedRound) teamLinkedRound).getEvent().getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        } else {
            if (teamLinkedRound.equals(TeamLinkedRound.UnknownTeamLinkedRound.INSTANCE)) {
                return;
            }
            zzl.b();
        }
    }

    public static final void b(List list, Context context, View view, m0j m0jVar) {
        ConstraintLayout constraintLayout;
        String name;
        String name2;
        list.getClass();
        context.getClass();
        view.getClass();
        m0jVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((TeamLinkedRound) obj) instanceof TeamLinkedRound.UnknownTeamLinkedRound)) {
                arrayList.add(obj);
            }
        }
        final int i = 1;
        if (arrayList.size() <= 1) {
            TeamLinkedRound teamLinkedRound = (TeamLinkedRound) CollectionsKt.firstOrNull(arrayList);
            if (teamLinkedRound != null) {
                a(teamLinkedRound, context);
                return;
            }
            return;
        }
        vt vtVar = new vt(context, 16);
        Context context2 = m0jVar.a;
        e92 i2 = e92.i(m0jVar.a());
        m0jVar.f = i2;
        ((LinearLayout) i2.c).setElevation(m0jVar.c);
        e92 e92Var = m0jVar.f;
        if (e92Var == null) {
            Intrinsics.i("binding");
            throw null;
        }
        ((LinearLayout) e92Var.c).setBackgroundResource(R.drawable.menu_background_surface);
        e92 e92Var2 = m0jVar.f;
        if (e92Var2 == null) {
            Intrinsics.i("binding");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) e92Var2.c;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = ao2.s(200, context2);
        linearLayout.setLayoutParams(layoutParams);
        e92 e92Var3 = m0jVar.f;
        if (e92Var3 == null) {
            Intrinsics.i("binding");
            throw null;
        }
        m0jVar.d = new PopupWindow((FrameLayout) e92Var3.b, -2, -2);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(((TeamLinkedRound) next) instanceof TeamLinkedRound.UnknownTeamLinkedRound)) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            TeamLinkedRound teamLinkedRound2 = (TeamLinkedRound) it2.next();
            final mth mthVar = new mth(i, vtVar, teamLinkedRound2, m0jVar);
            LayoutInflater from = LayoutInflater.from(context2);
            e92 e92Var4 = m0jVar.f;
            if (e92Var4 == null) {
                Intrinsics.i("binding");
                throw null;
            }
            LinearLayout linearLayout2 = (LinearLayout) e92Var4.c;
            final int i3 = 0;
            if (teamLinkedRound2 instanceof TeamLinkedRound.TournamentTeamLinkedRound) {
                nfc b = nfc.b(from, linearLayout2);
                ImageView imageView = b.b;
                constraintLayout = b.a;
                TextView textView = b.c;
                TeamLinkedRound.TournamentTeamLinkedRound tournamentTeamLinkedRound = (TeamLinkedRound.TournamentTeamLinkedRound) teamLinkedRound2;
                String x = tba.x(tournamentTeamLinkedRound.getUniqueTournament());
                Regex regex = yid.a;
                if (x == null) {
                    x = "-";
                }
                textView.setText(x);
                imageView.setVisibility(0);
                as9.q(imageView, Integer.valueOf(tournamentTeamLinkedRound.getUniqueTournament().getId()), -1, null);
                constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: l0j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i4 = i3;
                        mth mthVar2 = mthVar;
                        switch (i4) {
                            case 0:
                                mthVar2.invoke();
                                break;
                            default:
                                mthVar2.invoke();
                                break;
                        }
                    }
                });
            } else {
                if (teamLinkedRound2 instanceof TeamLinkedRound.EventTeamLinkedRound) {
                    View inflate = from.inflate(R.layout.menu_panel_event_item, (ViewGroup) linearLayout2, false);
                    int i4 = R.id.item_logo_one;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.item_logo_one, inflate);
                    if (imageView2 != null) {
                        i4 = R.id.item_logo_two;
                        ImageView imageView3 = (ImageView) nq8.B(R.id.item_logo_two, inflate);
                        if (imageView3 != null) {
                            i4 = R.id.item_text;
                            TextView textView2 = (TextView) nq8.B(R.id.item_text, inflate);
                            if (textView2 != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                TeamLinkedRound.EventTeamLinkedRound eventTeamLinkedRound = (TeamLinkedRound.EventTeamLinkedRound) teamLinkedRound2;
                                TeamLinksEventTeam homeTeam = eventTeamLinkedRound.getHomeTeam();
                                FieldTranslations fieldTranslations = homeTeam.getFieldTranslations();
                                if (fieldTranslations == null || (name = tba.r(fieldTranslations)) == null) {
                                    name = homeTeam.getName();
                                }
                                TeamLinksEventTeam awayTeam = eventTeamLinkedRound.getAwayTeam();
                                FieldTranslations fieldTranslations2 = awayTeam.getFieldTranslations();
                                if (fieldTranslations2 == null || (name2 = tba.r(fieldTranslations2)) == null) {
                                    name2 = awayTeam.getName();
                                }
                                textView2.setText(context2.getString(R.string.toolbar_subtitle_template, name, name2));
                                as9.o(imageView2, eventTeamLinkedRound.getHomeTeam().getId());
                                as9.o(imageView3, eventTeamLinkedRound.getAwayTeam().getId());
                                constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: l0j
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i42 = i;
                                        mth mthVar2 = mthVar;
                                        switch (i42) {
                                            case 0:
                                                mthVar2.invoke();
                                                break;
                                            default:
                                                mthVar2.invoke();
                                                break;
                                        }
                                    }
                                });
                                constraintLayout = constraintLayout2;
                            }
                        }
                    }
                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                    return;
                }
                if (!Intrinsics.c(teamLinkedRound2, TeamLinkedRound.UnknownTeamLinkedRound.INSTANCE)) {
                    zzl.b();
                    return;
                }
                constraintLayout = null;
            }
            if (constraintLayout != null) {
                e92 e92Var5 = m0jVar.f;
                if (e92Var5 == null) {
                    Intrinsics.i("binding");
                    throw null;
                }
                ((LinearLayout) e92Var5.c).addView(constraintLayout);
            }
        }
        PopupWindow popupWindow = m0jVar.d;
        if (popupWindow != null) {
            m0jVar.b(view, popupWindow);
        }
    }
}
