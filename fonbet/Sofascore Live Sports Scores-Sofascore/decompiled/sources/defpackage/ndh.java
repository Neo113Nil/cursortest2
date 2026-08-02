package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.IShareContent;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.sharemodal.shared.ShareStandingsPageFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ndh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShareStandingsPageFragment b;

    public /* synthetic */ ndh(ShareStandingsPageFragment shareStandingsPageFragment, int i) {
        this.a = i;
        this.b = shareStandingsPageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String w;
        String str;
        int i = this.a;
        int i2 = R.id.background;
        String str2 = null;
        String string = null;
        ShareStandingsPageFragment shareStandingsPageFragment = this.b;
        switch (i) {
            case 0:
                Fragment requireParentFragment = shareStandingsPageFragment.requireParentFragment();
                requireParentFragment.getClass();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                List list = (List) shareStandingsPageFragment.u.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof ebi) {
                        arrayList.add(obj);
                    }
                }
                break;
            case 4:
                Context requireContext = shareStandingsPageFragment.requireContext();
                requireContext.getClass();
                hch hchVar = ((mdh) shareStandingsPageFragment.s.getValue()).e;
                IShareContent iShareContent = hchVar != null ? hchVar.a : null;
                if (iShareContent instanceof Event) {
                    str2 = ((Event) iShareContent).getSportSlug();
                } else if (iShareContent instanceof Tournament) {
                    str2 = ((Tournament) iShareContent).getSportSlug();
                } else if (iShareContent instanceof Team) {
                    str2 = ((Team) iShareContent).getSportSlug();
                }
                break;
            case 5:
                break;
            case 6:
                otk otkVar = shareStandingsPageFragment.s;
                ebi ebiVar = (ebi) shareStandingsPageFragment.v.getValue();
                if (ebiVar != null) {
                    String str3 = ebiVar.c;
                    Tournament tournament = ebiVar.b;
                    LayoutInflater layoutInflater = shareStandingsPageFragment.getLayoutInflater();
                    krk krkVar = shareStandingsPageFragment.l;
                    krkVar.getClass();
                    View inflate = layoutInflater.inflate(R.layout.share_match_standings_header, (ViewGroup) ((bdh) krkVar).c, false);
                    TextView textView = (TextView) nq8.B(R.id.additional_text, inflate);
                    if (textView != null) {
                        if (((ConstraintLayout) nq8.B(R.id.background, inflate)) != null) {
                            i2 = R.id.divider;
                            if (nq8.B(R.id.divider, inflate) != null) {
                                i2 = R.id.subtitle;
                                TextView textView2 = (TextView) nq8.B(R.id.subtitle, inflate);
                                if (textView2 != null) {
                                    i2 = R.id.title;
                                    TextView textView3 = (TextView) nq8.B(R.id.title, inflate);
                                    if (textView3 != null) {
                                        i2 = R.id.tournament_logo;
                                        ImageView imageView = (ImageView) nq8.B(R.id.tournament_logo, inflate);
                                        if (imageView != null) {
                                            FrameLayout frameLayout = (FrameLayout) inflate;
                                            as9.q(imageView, o3a.F(tournament), tournament.getId(), null);
                                            UniqueTournament uniqueTournament = tournament.getUniqueTournament();
                                            if (uniqueTournament == null || (w = tba.x(uniqueTournament)) == null) {
                                                w = tba.w(tournament);
                                            }
                                            StringBuilder q = fc6.q(w);
                                            hch hchVar2 = ((mdh) otkVar.getValue()).e;
                                            if (hchVar2 != null && (str = hchVar2.c) != null) {
                                                q.append(" ".concat(str));
                                            }
                                            textView3.setText(q.toString());
                                            if (Intrinsics.c(w, str3)) {
                                                textView2.setVisibility(8);
                                            } else {
                                                textView2.setText(str3);
                                            }
                                            hch hchVar3 = ((mdh) otkVar.getValue()).e;
                                            tsi tsiVar = hchVar3 != null ? hchVar3.b : null;
                                            if (tsiVar == rv8.c) {
                                                string = shareStandingsPageFragment.getString(R.string.standings_home_performance);
                                            } else if (tsiVar == rv8.d) {
                                                string = shareStandingsPageFragment.getString(R.string.standings_away_performance);
                                            }
                                            if (string != null) {
                                                textView.setVisibility(0);
                                                textView.setText(string);
                                            } else {
                                                textView.setVisibility(8);
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        i2 = R.id.additional_text;
                    }
                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                    break;
                }
                break;
            default:
                LayoutInflater layoutInflater2 = shareStandingsPageFragment.getLayoutInflater();
                krk krkVar2 = shareStandingsPageFragment.l;
                krkVar2.getClass();
                View inflate2 = layoutInflater2.inflate(R.layout.share_match_standings_footer, (ViewGroup) ((bdh) krkVar2).c, false);
                if (((ConstraintLayout) nq8.B(R.id.background, inflate2)) != null) {
                    i2 = R.id.live_indicator;
                    TextView textView4 = (TextView) nq8.B(R.id.live_indicator, inflate2);
                    if (textView4 != null) {
                        i2 = R.id.time;
                        TextView textView5 = (TextView) nq8.B(R.id.time, inflate2);
                        if (textView5 != null) {
                            FrameLayout frameLayout2 = (FrameLayout) inflate2;
                            Context requireContext2 = shareStandingsPageFragment.requireContext();
                            requireContext2.getClass();
                            textView5.setText(rik.j(requireContext2, System.currentTimeMillis() / 1000, bi4.PATTERN_DMY, " "));
                            ebi ebiVar2 = (ebi) shareStandingsPageFragment.v.getValue();
                            if (!Intrinsics.c(ebiVar2 != null ? Boolean.valueOf(ebiVar2.d) : null, Boolean.TRUE)) {
                                textView4.setVisibility(8);
                            }
                            break;
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
                break;
        }
        return null;
    }
}
