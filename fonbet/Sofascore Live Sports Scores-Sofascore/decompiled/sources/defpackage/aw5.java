package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.model.newNetwork.commentary.TeamShirtColors;
import com.sofascore.results.R;
import com.sofascore.results.view.graph.networkanimation.PassingNetworkAnimationView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class aw5 extends g7 {
    public final Event l;
    public final k43 m;
    public boolean n;
    public final LinkedHashSet o;
    public TeamShirtColors p;
    public TeamShirtColors q;
    public final int[] r;
    public final zv5 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw5(Context context, Event event, k43 k43Var) {
        super(context);
        context.getClass();
        this.l = event;
        this.m = k43Var;
        this.o = new LinkedHashSet();
        this.r = new int[2];
        this.s = new zv5(this);
    }

    public final boolean G(Comment comment, int i) {
        comment.getClass();
        Object a0 = CollectionsKt.a0(i + 1, this.i);
        if (a0 == null || !(a0 instanceof Comment) || !Intrinsics.c(((Comment) a0).getGroupId(), comment.getGroupId()) || comment.getGroupId() == null) {
            a0 = null;
        }
        return a0 == null;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return i == 1;
    }

    @Override // defpackage.g7, androidx.recyclerview.widget.l
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.k = recyclerView;
        recyclerView.addOnScrollListener(this.s);
    }

    @Override // defpackage.g7, androidx.recyclerview.widget.l
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.k = null;
        recyclerView.removeOnScrollListener(this.s);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewAttachedToWindow(u uVar) {
        PassingNetworkAnimationView passingNetworkAnimationView;
        p8 p8Var = (p8) uVar;
        p8Var.getClass();
        super.onViewAttachedToWindow(p8Var);
        p43 p43Var = p8Var instanceof p43 ? (p43) p8Var : null;
        if (p43Var == null || (passingNetworkAnimationView = p43Var.f) == null) {
            return;
        }
        this.o.add(passingNetworkAnimationView);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewDetachedFromWindow(u uVar) {
        PassingNetworkAnimationView passingNetworkAnimationView;
        p8 p8Var = (p8) uVar;
        p8Var.getClass();
        super.onViewDetachedFromWindow(p8Var);
        p43 p43Var = p8Var instanceof p43 ? (p43) p8Var : null;
        if (p43Var == null || (passingNetworkAnimationView = p43Var.f) == null) {
            return;
        }
        this.o.remove(passingNetworkAnimationView);
        passingNetworkAnimationView.a();
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 6);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        boolean z = obj instanceof Comment;
        if (z && j43.g.a.equals(((Comment) obj).getType())) {
            return 5;
        }
        if (z && ((Comment) obj).getFootballPassingNetworkAction() != null) {
            return 6;
        }
        if (z && this.n && ((Comment) obj).getGroupId() != null) {
            return 3;
        }
        if (z && this.n && ((Comment) obj).getGroupId() == null) {
            return 4;
        }
        if (obj instanceof z33) {
            return 1;
        }
        return obj instanceof h43 ? 7 : 2;
    }

    @Override // defpackage.g7
    public final void x(g7 g7Var, p8 p8Var, int i, List list) {
        p8Var.getClass();
        list.getClass();
        if (getItemViewType(i) == 6) {
            p43 p43Var = p8Var instanceof p43 ? (p43) p8Var : null;
            if (p43Var != null) {
                p43Var.g = this.p;
                p43Var.h = this.q;
            }
        }
        super.x(g7Var, p8Var, i, list);
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        k43 k43Var = this.m;
        Event event = this.l;
        Context context = this.b;
        switch (i) {
            case 1:
                View inflate = LayoutInflater.from(context).inflate(R.layout.commentary_drive_header_layout, viewGroup, false);
                int i2 = R.id.chevron;
                ImageView imageView = (ImageView) nq8.B(R.id.chevron, inflate);
                if (imageView != null) {
                    i2 = R.id.subtitle;
                    TextView textView = (TextView) nq8.B(R.id.subtitle, inflate);
                    if (textView != null) {
                        i2 = R.id.team_logo;
                        ImageView imageView2 = (ImageView) nq8.B(R.id.team_logo, inflate);
                        if (imageView2 != null) {
                            i2 = R.id.title;
                            TextView textView2 = (TextView) nq8.B(R.id.title, inflate);
                            if (textView2 != null) {
                                return new vh(this, new cv1((ConstraintLayout) inflate, imageView, textView, imageView2, textView2, 1));
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            case 2:
            case 6:
                return new p43(sc.a(LayoutInflater.from(context), viewGroup), event, k43Var);
            case 3:
                return new yv5(this, sc.a(LayoutInflater.from(context), viewGroup), event, k43Var, 0);
            case 4:
                return new yv5(this, sc.a(LayoutInflater.from(context), viewGroup), event, k43Var, 1);
            case 5:
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.commentary_substitution_layout, viewGroup, false);
                int i3 = R.id.commentary_holder;
                ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.commentary_holder, inflate2);
                if (constraintLayout != null) {
                    i3 = R.id.commentary_icon;
                    ImageView imageView3 = (ImageView) nq8.B(R.id.commentary_icon, inflate2);
                    if (imageView3 != null) {
                        i3 = R.id.commentary_minute;
                        TextView textView3 = (TextView) nq8.B(R.id.commentary_minute, inflate2);
                        if (textView3 != null) {
                            i3 = R.id.commentary_substitution_in_img;
                            ImageView imageView4 = (ImageView) nq8.B(R.id.commentary_substitution_in_img, inflate2);
                            if (imageView4 != null) {
                                i3 = R.id.commentary_substitution_in_name;
                                TextView textView4 = (TextView) nq8.B(R.id.commentary_substitution_in_name, inflate2);
                                if (textView4 != null) {
                                    i3 = R.id.commentary_substitution_in_span;
                                    TextView textView5 = (TextView) nq8.B(R.id.commentary_substitution_in_span, inflate2);
                                    if (textView5 != null) {
                                        i3 = R.id.commentary_substitution_out_img;
                                        ImageView imageView5 = (ImageView) nq8.B(R.id.commentary_substitution_out_img, inflate2);
                                        if (imageView5 != null) {
                                            i3 = R.id.commentary_substitution_out_name;
                                            TextView textView6 = (TextView) nq8.B(R.id.commentary_substitution_out_name, inflate2);
                                            if (textView6 != null) {
                                                i3 = R.id.commentary_substitution_out_span;
                                                TextView textView7 = (TextView) nq8.B(R.id.commentary_substitution_out_span, inflate2);
                                                if (textView7 != null) {
                                                    i3 = R.id.commentary_team_corner;
                                                    ImageView imageView6 = (ImageView) nq8.B(R.id.commentary_team_corner, inflate2);
                                                    if (imageView6 != null) {
                                                        i3 = R.id.commentary_title;
                                                        TextView textView8 = (TextView) nq8.B(R.id.commentary_title, inflate2);
                                                        if (textView8 != null) {
                                                            i3 = R.id.penalty_incident_time;
                                                            if (((LinearLayout) nq8.B(R.id.penalty_incident_time, inflate2)) != null) {
                                                                return new z02(new xz0((LinearLayout) inflate2, constraintLayout, imageView3, textView3, imageView4, textView4, textView5, imageView5, textView6, textView7, imageView6, textView8), event, k43Var);
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
                yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
                return null;
            case 7:
                return new wh(esk.b(LayoutInflater.from(context), viewGroup));
            default:
                ilg.c();
                return null;
        }
    }
}
