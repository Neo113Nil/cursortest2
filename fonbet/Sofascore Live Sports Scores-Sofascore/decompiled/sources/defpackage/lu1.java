package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lu1 extends g7 {
    public final LayoutInflater l;
    public zu1 m;
    public zsk n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu1(Context context) {
        super(context);
        context.getClass();
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.l = from;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewAttachedToWindow(u uVar) {
        zsk zskVar;
        p8 p8Var = (p8) uVar;
        p8Var.getClass();
        super.onViewAttachedToWindow(p8Var);
        if (!(p8Var instanceof ku1) || (zskVar = this.n) == null) {
            return;
        }
        LinearLayout linearLayout = ((ku1) p8Var).c.b;
        linearLayout.getClass();
        zskVar.f.add(linearLayout);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewDetachedFromWindow(u uVar) {
        zsk zskVar;
        p8 p8Var = (p8) uVar;
        p8Var.getClass();
        super.onViewDetachedFromWindow(p8Var);
        if (!(p8Var instanceof ku1) || (zskVar = this.n) == null) {
            return;
        }
        LinearLayout linearLayout = ((ku1) p8Var).c.b;
        linearLayout.getClass();
        zskVar.f.remove(linearLayout);
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 1);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        iu1 iu1Var = (iu1) obj;
        iu1Var.getClass();
        if (iu1Var instanceof fu1) {
            return 0;
        }
        if (iu1Var instanceof gu1) {
            return 1;
        }
        if (iu1Var instanceof hu1) {
            return 2;
        }
        zzl.b();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.l;
        if (i != 0) {
            int i2 = R.id.bet_boost_provider_logo;
            if (i == 1) {
                View inflate = layoutInflater.inflate(R.layout.bet_boost_header, viewGroup, false);
                ImageView imageView = (ImageView) nq8.B(R.id.bet_boost_provider_logo, inflate);
                if (imageView != null) {
                    i2 = R.id.provided_by_text;
                    if (((TextView) nq8.B(R.id.provided_by_text, inflate)) != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        linearLayout.getClass();
                        r71 r71Var = new r71(1, linearLayout);
                        as9.k(imageView, 1);
                        aba.y(imageView, 0, 3);
                        z8e.a0(imageView, 1000L, new yj1(r71Var, 3));
                        return r71Var;
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            }
            if (i != 2) {
                ilg.c();
                return null;
            }
            View inflate2 = layoutInflater.inflate(R.layout.bet_boost_offer_cta, viewGroup, false);
            ImageView imageView2 = (ImageView) nq8.B(R.id.bet_boost_provider_logo, inflate2);
            if (imageView2 != null) {
                i2 = R.id.offer_text;
                TextView textView = (TextView) nq8.B(R.id.offer_text, inflate2);
                if (textView != null) {
                    i2 = R.id.offer_title;
                    if (((TextView) nq8.B(R.id.offer_title, inflate2)) != null) {
                        i2 = R.id.register_btn;
                        TextView textView2 = (TextView) nq8.B(R.id.register_btn, inflate2);
                        if (textView2 != null) {
                            return new ku1(new pu1((LinearLayout) inflate2, imageView2, textView, textView2, 0));
                        }
                    }
                }
            }
            yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
            return null;
        }
        View inflate3 = layoutInflater.inflate(R.layout.bet_boost_event_item, viewGroup, false);
        int i3 = R.id.barrier;
        if (((Barrier) nq8.B(R.id.barrier, inflate3)) != null) {
            i3 = R.id.barrier_view;
            View B = nq8.B(R.id.barrier_view, inflate3);
            if (B != null) {
                i3 = R.id.barrier_view2;
                View B2 = nq8.B(R.id.barrier_view2, inflate3);
                if (B2 != null) {
                    i3 = R.id.bet_boost_body;
                    ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.bet_boost_body, inflate3);
                    if (constraintLayout != null) {
                        i3 = R.id.bet_boosts_container;
                        LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.bet_boosts_container, inflate3);
                        if (linearLayout2 != null) {
                            i3 = R.id.chevron;
                            if (((ImageView) nq8.B(R.id.chevron, inflate3)) != null) {
                                i3 = R.id.event_header_layout;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) nq8.B(R.id.event_header_layout, inflate3);
                                if (constraintLayout2 != null) {
                                    i3 = R.id.first_team_logo;
                                    ImageView imageView3 = (ImageView) nq8.B(R.id.first_team_logo, inflate3);
                                    if (imageView3 != null) {
                                        i3 = R.id.first_team_name;
                                        TextView textView3 = (TextView) nq8.B(R.id.first_team_name, inflate3);
                                        if (textView3 != null) {
                                            i3 = R.id.new_odds;
                                            TextView textView4 = (TextView) nq8.B(R.id.new_odds, inflate3);
                                            if (textView4 != null) {
                                                i3 = R.id.old_odds;
                                                TextView textView5 = (TextView) nq8.B(R.id.old_odds, inflate3);
                                                if (textView5 != null) {
                                                    i3 = R.id.profile_start_time;
                                                    TextView textView6 = (TextView) nq8.B(R.id.profile_start_time, inflate3);
                                                    if (textView6 != null) {
                                                        i3 = R.id.second_team_logo;
                                                        ImageView imageView4 = (ImageView) nq8.B(R.id.second_team_logo, inflate3);
                                                        if (imageView4 != null) {
                                                            i3 = R.id.second_team_name;
                                                            TextView textView7 = (TextView) nq8.B(R.id.second_team_name, inflate3);
                                                            if (textView7 != null) {
                                                                return new vh(this, new zl((LinearLayout) inflate3, B, B2, constraintLayout, linearLayout2, constraintLayout2, imageView3, textView3, textView4, textView5, textView6, imageView4, textView7));
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
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i3)));
        return null;
    }
}
