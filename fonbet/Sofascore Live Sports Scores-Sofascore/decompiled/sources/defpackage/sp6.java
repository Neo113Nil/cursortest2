package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.u;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.view.BellButton;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sp6 extends qzh {
    public boolean t;
    public final t0 u;
    public zsk v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp6(Context context) {
        super(context);
        context.getClass();
        this.u = t0.FANTASY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [xbb] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v0, types: [sp6, w0] */
    @Override // defpackage.w0, defpackage.g7
    public final void F(List list) {
        boolean z;
        Integer round;
        list.getClass();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof fy6) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.t = z;
        ?? arrayList = new ArrayList(k13.r(list, 10));
        for (Object obj : list) {
            if (obj instanceof ey6) {
                obj = ((ey6) obj).a;
            }
            arrayList.add(obj);
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof fy6) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (next instanceof y21) {
                arrayList2.add(next);
            }
        }
        xbb b = a.b();
        Iterator it4 = arrayList2.iterator();
        int i = 0;
        int i2 = Integer.MIN_VALUE;
        while (it4.hasNext()) {
            Object next2 = it4.next();
            int i3 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            y21 y21Var = (y21) next2;
            Round roundInfo = y21Var.d().getRoundInfo();
            if (roundInfo != null && ((round = roundInfo.getRound()) == null || round.intValue() != i2)) {
                Object j0 = CollectionsKt.j0(b);
                y21 y21Var2 = j0 instanceof y21 ? (y21) j0 : null;
                if (y21Var2 != null) {
                    y21Var2.n = true;
                }
                b.add(roundInfo);
                Integer round2 = roundInfo.getRound();
                i2 = round2 != null ? round2.intValue() : Integer.MIN_VALUE;
            }
            y21Var.n = i == arrayList2.size() - 1;
            b.add(y21Var);
            i = i3;
        }
        arrayList = a.a(b);
        super.F(arrayList);
    }

    @Override // defpackage.qzh, defpackage.w0
    public final void G(t54 t54Var, int i, int i2, AdBannerView adBannerView) {
        super.G(t54Var, i, i2, adBannerView);
        if (this.t) {
            adBannerView.setBackground(null);
        } else {
            sea.v(t54Var.b, false, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        }
    }

    @Override // defpackage.w0
    public final t0 H() {
        return this.u;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewAttachedToWindow(u uVar) {
        zsk zskVar;
        p8 p8Var = (p8) uVar;
        p8Var.getClass();
        super.onViewAttachedToWindow(p8Var);
        if (!(p8Var instanceof wd6) || (zskVar = this.v) == null) {
            return;
        }
        zskVar.f.add(((v82) ((wd6) p8Var).c.k).b);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewDetachedFromWindow(u uVar) {
        zsk zskVar;
        p8 p8Var = (p8) uVar;
        p8Var.getClass();
        super.onViewDetachedFromWindow(p8Var);
        if (!(p8Var instanceof wd6) || (zskVar = this.v) == null) {
            return;
        }
        zskVar.f.remove(((v82) ((wd6) p8Var).c.k).b);
    }

    @Override // defpackage.qzh, defpackage.w0, defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof Round) {
            haf hafVar = pzh.b;
            return 23;
        }
        if (!(obj instanceof fy6)) {
            return super.v(obj);
        }
        haf hafVar2 = pzh.b;
        return 6;
    }

    @Override // defpackage.qzh, defpackage.w0, defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        haf hafVar = pzh.b;
        LayoutInflater layoutInflater = this.r;
        if (i == 23) {
            return new wh(o16.a(layoutInflater, viewGroup));
        }
        if (i != 6) {
            return super.z(viewGroup, i);
        }
        View inflate = layoutInflater.inflate(R.layout.viewholder_event_with_odds, viewGroup, false);
        int i2 = R.id.bell_button;
        BellButton bellButton = (BellButton) nq8.B(R.id.bell_button, inflate);
        if (bellButton != null) {
            i2 = R.id.event_odds;
            View B = nq8.B(R.id.event_odds, inflate);
            if (B != null) {
                v82 f = v82.f(B);
                i2 = R.id.first_team_logo;
                ImageView imageView = (ImageView) nq8.B(R.id.first_team_logo, inflate);
                if (imageView != null) {
                    i2 = R.id.first_team_name;
                    TextView textView = (TextView) nq8.B(R.id.first_team_name, inflate);
                    if (textView != null) {
                        i2 = R.id.first_team_score;
                        TextView textView2 = (TextView) nq8.B(R.id.first_team_score, inflate);
                        if (textView2 != null) {
                            i2 = R.id.info_label;
                            TextView textView3 = (TextView) nq8.B(R.id.info_label, inflate);
                            if (textView3 != null) {
                                i2 = R.id.main_text;
                                TextView textView4 = (TextView) nq8.B(R.id.main_text, inflate);
                                if (textView4 != null) {
                                    i2 = R.id.second_team_logo;
                                    ImageView imageView2 = (ImageView) nq8.B(R.id.second_team_logo, inflate);
                                    if (imageView2 != null) {
                                        i2 = R.id.second_team_name;
                                        TextView textView5 = (TextView) nq8.B(R.id.second_team_name, inflate);
                                        if (textView5 != null) {
                                            i2 = R.id.second_team_score;
                                            TextView textView6 = (TextView) nq8.B(R.id.second_team_score, inflate);
                                            if (textView6 != null) {
                                                i2 = R.id.secondary_text;
                                                TextView textView7 = (TextView) nq8.B(R.id.secondary_text, inflate);
                                                if (textView7 != null) {
                                                    i2 = R.id.slash;
                                                    TextView textView8 = (TextView) nq8.B(R.id.slash, inflate);
                                                    if (textView8 != null) {
                                                        i2 = R.id.special_status_indicator;
                                                        TextView textView9 = (TextView) nq8.B(R.id.special_status_indicator, inflate);
                                                        if (textView9 != null) {
                                                            return new wd6(new js2((ConstraintLayout) inflate, bellButton, f, imageView, textView, textView2, textView3, textView4, imageView2, textView5, textView6, textView7, textView8, textView9), qha.w(viewGroup));
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
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
