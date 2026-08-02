package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.card.MaterialCardView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncident;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f16 extends g7 {
    public final Event l;
    public final g16 m;
    public final sl6 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f16(Event event, Context context, g16 g16Var) {
        super(context);
        context.getClass();
        this.l = event;
        this.m = g16Var;
        this.n = new sl6(-1);
    }

    @Override // defpackage.g7
    public final void F(List list) {
        list.getClass();
        super.F(CollectionsKt.w0(a.c(new j29(Integer.valueOf(R.drawable.hockey_shotmap), null, Integer.valueOf(R.string.hockey_pbp_footer_text), 501)), list));
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final void s() {
        super.s();
        this.n.a = -1;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 18);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (!(obj instanceof HockeyIncident)) {
            if (obj instanceof j29) {
                return 101;
            }
            a70.p("Illegal item type=".concat(obj.getClass().getName()));
            return 0;
        }
        switch (e16.a[((HockeyIncident) obj).getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                c16[] c16VarArr = c16.a;
                return 3;
            case 10:
            case 11:
                c16[] c16VarArr2 = c16.a;
                return 0;
            case 12:
                c16[] c16VarArr3 = c16.a;
                return 1;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                c16[] c16VarArr4 = c16.a;
                return 2;
            default:
                zzl.b();
                return 0;
        }
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        c16[] c16VarArr = c16.a;
        int i2 = R.id.time;
        sl6 sl6Var = this.n;
        Event event = this.l;
        g16 g16Var = this.m;
        Context context = this.b;
        if (i == 3) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.hockey_basic_commentary_item, viewGroup, false);
            MaterialCardView materialCardView = (MaterialCardView) nq8.B(R.id.card, inflate);
            if (materialCardView != null) {
                int i3 = R.id.commentary;
                TextView textView = (TextView) nq8.B(R.id.commentary, inflate);
                if (textView != null) {
                    ImageView imageView = (ImageView) nq8.B(R.id.icon, inflate);
                    if (imageView != null) {
                        i3 = R.id.secondary_text;
                        TextView textView2 = (TextView) nq8.B(R.id.secondary_text, inflate);
                        if (textView2 != null) {
                            ImageView imageView2 = (ImageView) nq8.B(R.id.team_icon, inflate);
                            if (imageView2 != null) {
                                TextView textView3 = (TextView) nq8.B(R.id.time, inflate);
                                if (textView3 != null) {
                                    return new ud9(new v82((ViewGroup) inflate, (View) materialCardView, textView, imageView, textView2, (View) imageView2, (View) textView3, 8), g16Var, event, sl6Var);
                                }
                            } else {
                                i2 = R.id.team_icon;
                            }
                        }
                    } else {
                        i2 = R.id.icon;
                    }
                }
                i2 = i3;
            } else {
                i2 = R.id.card;
            }
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            return null;
        }
        if (i == 0) {
            return new ee9(js2.a(LayoutInflater.from(context), viewGroup), g16Var, event, sl6Var);
        }
        if (i == 1) {
            return new ud9(js2.a(LayoutInflater.from(context), viewGroup), g16Var, event, sl6Var);
        }
        if (i != 2) {
            if (i != 101) {
                a70.p(ljg.j(i, "Illegal view type="));
                return null;
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) v82.g(LayoutInflater.from(context), viewGroup).b;
            constraintLayout.getClass();
            return new wh(constraintLayout);
        }
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.hockey_two_players_vertical_commentary_item, viewGroup, false);
        MaterialCardView materialCardView2 = (MaterialCardView) nq8.B(R.id.card, inflate2);
        if (materialCardView2 != null) {
            ImageView imageView3 = (ImageView) nq8.B(R.id.icon, inflate2);
            if (imageView3 != null) {
                int i4 = R.id.player_group;
                if (((Group) nq8.B(R.id.player_group, inflate2)) != null) {
                    i4 = R.id.player_icon;
                    ImageView imageView4 = (ImageView) nq8.B(R.id.player_icon, inflate2);
                    if (imageView4 != null) {
                        i4 = R.id.player_icons;
                        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.player_icons, inflate2);
                        if (frameLayout != null) {
                            i4 = R.id.player_info;
                            TextView textView4 = (TextView) nq8.B(R.id.player_info, inflate2);
                            if (textView4 != null) {
                                i4 = R.id.player_other_group;
                                Group group = (Group) nq8.B(R.id.player_other_group, inflate2);
                                if (group != null) {
                                    i4 = R.id.player_other_icon;
                                    ImageView imageView5 = (ImageView) nq8.B(R.id.player_other_icon, inflate2);
                                    if (imageView5 != null) {
                                        i4 = R.id.player_other_icons;
                                        FrameLayout frameLayout2 = (FrameLayout) nq8.B(R.id.player_other_icons, inflate2);
                                        if (frameLayout2 != null) {
                                            i4 = R.id.player_other_info;
                                            TextView textView5 = (TextView) nq8.B(R.id.player_other_info, inflate2);
                                            if (textView5 != null) {
                                                i4 = R.id.player_other_team;
                                                ImageView imageView6 = (ImageView) nq8.B(R.id.player_other_team, inflate2);
                                                if (imageView6 != null) {
                                                    i4 = R.id.player_team;
                                                    ImageView imageView7 = (ImageView) nq8.B(R.id.player_team, inflate2);
                                                    if (imageView7 != null) {
                                                        ImageView imageView8 = (ImageView) nq8.B(R.id.team_icon, inflate2);
                                                        if (imageView8 != null) {
                                                            TextView textView6 = (TextView) nq8.B(R.id.time, inflate2);
                                                            if (textView6 != null) {
                                                                i2 = R.id.title;
                                                                TextView textView7 = (TextView) nq8.B(R.id.title, inflate2);
                                                                if (textView7 != null) {
                                                                    return new qe9(new sc((LinearLayout) inflate2, materialCardView2, imageView3, imageView4, frameLayout, textView4, group, imageView5, frameLayout2, textView5, imageView6, imageView7, imageView8, textView6, textView7), g16Var, event, sl6Var);
                                                                }
                                                            }
                                                        } else {
                                                            i2 = R.id.team_icon;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = i4;
            } else {
                i2 = R.id.icon;
            }
        } else {
            i2 = R.id.card;
        }
        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
        return null;
    }
}
