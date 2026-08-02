package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.results.R;
import com.sofascore.results.event.mmastatistics.view.MmaStatsHeadDualView;
import com.sofascore.results.event.mmastatistics.view.MmaStatsLegsDualView;
import com.sofascore.results.event.mmastatistics.view.MmaStatsTorsoDualView;
import com.sofascore.results.redesign.dividers.SofaDivider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jnc {
    public final Context a;
    public final MmaEvent b;
    public final ViewGroup c;
    public final LayoutInflater d;
    public boolean e;
    public boolean f;
    public rrc g;
    public jrc h;
    public zqc i;
    public Map j;
    public final ym6 k;

    public jnc(Context context, MmaEvent mmaEvent, ViewGroup viewGroup) {
        context.getClass();
        this.a = context;
        this.b = mmaEvent;
        this.c = viewGroup;
        this.d = LayoutInflater.from(context);
        this.e = true;
        this.f = true;
        this.g = rrc.a;
        this.h = jrc.b;
        this.i = zqc.CAREER;
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.j = lm5Var;
        ym6 ym6Var = new ym6();
        ym6Var.c = 150L;
        ym6Var.d = new LinearInterpolator();
        this.k = ym6Var;
    }

    public final void a(zqc zqcVar, boolean z) {
        boolean z2 = this.i.a != zqcVar.a;
        this.i = zqcVar;
        if (!z2) {
            d();
            return;
        }
        long j = z ? 0L : 150L;
        ym6 ym6Var = this.k;
        ym6Var.c = j;
        ViewGroup viewGroup = this.c;
        hxj.a(viewGroup, ym6Var);
        viewGroup.removeAllViews();
        c();
    }

    public final ArrayList b() {
        List q = i5h.q(new tsk(this.c));
        ArrayList arrayList = new ArrayList();
        for (Object obj : q) {
            if (obj instanceof lrc) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        boolean z;
        boolean z2;
        Iterator it;
        LinearLayout linearLayout;
        m6 prcVar;
        m6 mmaStatsHeadDualView;
        LinearLayout linearLayout2;
        List list = (List) this.j.get(this.i);
        if (list != null) {
            Iterator it2 = list.iterator();
            boolean z3 = true;
            boolean z4 = true;
            while (it2.hasNext()) {
                trc trcVar = (trc) it2.next();
                String str = trcVar.a;
                ArrayList arrayList = trcVar.b;
                dsc dscVar = dsc.a;
                Context context = this.a;
                lrc lrcVar = new lrc(context, str, dscVar);
                if (z4) {
                    lrcVar.setMarginTop(8);
                    z4 = false;
                }
                Iterator it3 = arrayList.iterator();
                int i = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        b.q();
                        throw null;
                    }
                    src srcVar = (src) next;
                    fsf fsfVar = new fsf();
                    urc urcVar = srcVar.c;
                    String str2 = srcVar.a;
                    int ordinal = urcVar.ordinal();
                    LayoutInflater layoutInflater = this.d;
                    dd ddVar = lrcVar.e;
                    Iterator it4 = it2;
                    if (ordinal != 0) {
                        if (ordinal == z3) {
                            z = z3;
                            xxb xxbVar = new xxb(lrcVar, 3);
                            View inflate = layoutInflater.inflate(R.layout.subtitle_micro_expandable, (ViewGroup) lrcVar, false);
                            int i3 = R.id.expand_icon;
                            ImageView imageView = (ImageView) nq8.B(R.id.expand_icon, inflate);
                            if (imageView != null) {
                                TextView textView = (TextView) nq8.B(R.id.label, inflate);
                                if (textView != null) {
                                    z2 = z4;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                    up9 up9Var = new up9(imageView, textView, constraintLayout);
                                    textView.setText(context.getString(tnf.p(str2)));
                                    constraintLayout.setTag(urc.b);
                                    constraintLayout.setOnClickListener(new au7(24, up9Var, xxbVar));
                                    ((LinearLayout) ddVar.c).addView(constraintLayout);
                                    lrcVar.post(new yp8(lrcVar, 16));
                                } else {
                                    i3 = R.id.label;
                                }
                            }
                            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                            return;
                        }
                        z = z3;
                        if (ordinal == 2) {
                            z2 = z4;
                        } else if (ordinal != 3) {
                            zzl.b();
                            return;
                        }
                        if (srcVar.c != urc.d) {
                            LinearLayout linearLayout3 = new LinearLayout(context);
                            linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            Context context2 = linearLayout3.getContext();
                            context2.getClass();
                            linearLayout3.setPadding(0, ao2.s(8, context2), 0, 0);
                            fsfVar.a = linearLayout3;
                        }
                        it = srcVar.b.iterator();
                        while (it.hasNext()) {
                            yqc yqcVar = (yqc) it.next();
                            switch (yqcVar.b.ordinal()) {
                                case 0:
                                    prcVar = new prc(context);
                                    prcVar.q(this.e, this.f, this.b.getGender());
                                    prcVar.s(str2, yqcVar.a);
                                    prcVar.setStatisticsMode(this.h);
                                    prcVar.setDisplayMode(this.g);
                                    prcVar.setStatisticData(yqcVar);
                                    linearLayout2 = (LinearLayout) fsfVar.a;
                                    if (linearLayout2 == null) {
                                        linearLayout2.addView(prcVar);
                                        ViewGroup.LayoutParams layoutParams = prcVar.getLayoutParams();
                                        layoutParams.getClass();
                                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                        layoutParams2.weight = 1.0f;
                                        prcVar.setNewLayoutParams(layoutParams2);
                                    } else {
                                        ((LinearLayout) ddVar.c).addView(prcVar);
                                    }
                                case 1:
                                    prcVar = new bsc(context);
                                    prcVar.q(this.e, this.f, this.b.getGender());
                                    prcVar.s(str2, yqcVar.a);
                                    prcVar.setStatisticsMode(this.h);
                                    prcVar.setDisplayMode(this.g);
                                    prcVar.setStatisticData(yqcVar);
                                    linearLayout2 = (LinearLayout) fsfVar.a;
                                    if (linearLayout2 == null) {
                                    }
                                    break;
                                case 2:
                                    prcVar = new gsc(context, 30);
                                    prcVar.q(this.e, this.f, this.b.getGender());
                                    prcVar.s(str2, yqcVar.a);
                                    prcVar.setStatisticsMode(this.h);
                                    prcVar.setDisplayMode(this.g);
                                    prcVar.setStatisticData(yqcVar);
                                    linearLayout2 = (LinearLayout) fsfVar.a;
                                    if (linearLayout2 == null) {
                                    }
                                    break;
                                case 3:
                                    prcVar = new gsc(context, 14);
                                    prcVar.q(this.e, this.f, this.b.getGender());
                                    prcVar.s(str2, yqcVar.a);
                                    prcVar.setStatisticsMode(this.h);
                                    prcVar.setDisplayMode(this.g);
                                    prcVar.setStatisticData(yqcVar);
                                    linearLayout2 = (LinearLayout) fsfVar.a;
                                    if (linearLayout2 == null) {
                                    }
                                    break;
                                case 4:
                                    prcVar = new gsc(context, 6);
                                    prcVar.q(this.e, this.f, this.b.getGender());
                                    prcVar.s(str2, yqcVar.a);
                                    prcVar.setStatisticsMode(this.h);
                                    prcVar.setDisplayMode(this.g);
                                    prcVar.setStatisticData(yqcVar);
                                    linearLayout2 = (LinearLayout) fsfVar.a;
                                    if (linearLayout2 == null) {
                                    }
                                    break;
                                case 5:
                                    mmaStatsHeadDualView = new MmaStatsHeadDualView(context, null, 6);
                                    prcVar = mmaStatsHeadDualView;
                                    prcVar.q(this.e, this.f, this.b.getGender());
                                    prcVar.s(str2, yqcVar.a);
                                    prcVar.setStatisticsMode(this.h);
                                    prcVar.setDisplayMode(this.g);
                                    prcVar.setStatisticData(yqcVar);
                                    linearLayout2 = (LinearLayout) fsfVar.a;
                                    if (linearLayout2 == null) {
                                    }
                                    break;
                                case 6:
                                    mmaStatsHeadDualView = new MmaStatsTorsoDualView(context, null, 6);
                                    prcVar = mmaStatsHeadDualView;
                                    prcVar.q(this.e, this.f, this.b.getGender());
                                    prcVar.s(str2, yqcVar.a);
                                    prcVar.setStatisticsMode(this.h);
                                    prcVar.setDisplayMode(this.g);
                                    prcVar.setStatisticData(yqcVar);
                                    linearLayout2 = (LinearLayout) fsfVar.a;
                                    if (linearLayout2 == null) {
                                    }
                                    break;
                                case 7:
                                    mmaStatsHeadDualView = new MmaStatsLegsDualView(context, null, 6);
                                    prcVar = mmaStatsHeadDualView;
                                    prcVar.q(this.e, this.f, this.b.getGender());
                                    prcVar.s(str2, yqcVar.a);
                                    prcVar.setStatisticsMode(this.h);
                                    prcVar.setDisplayMode(this.g);
                                    prcVar.setStatisticData(yqcVar);
                                    linearLayout2 = (LinearLayout) fsfVar.a;
                                    if (linearLayout2 == null) {
                                    }
                                    break;
                                case 8:
                                    mmaStatsHeadDualView = new MmaStatsHeadDualView(context, null, 6);
                                    prcVar = mmaStatsHeadDualView;
                                    prcVar.q(this.e, this.f, this.b.getGender());
                                    prcVar.s(str2, yqcVar.a);
                                    prcVar.setStatisticsMode(this.h);
                                    prcVar.setDisplayMode(this.g);
                                    prcVar.setStatisticData(yqcVar);
                                    linearLayout2 = (LinearLayout) fsfVar.a;
                                    if (linearLayout2 == null) {
                                    }
                                    break;
                                case 9:
                                    prcVar = new mrc(context);
                                    prcVar.q(this.e, this.f, this.b.getGender());
                                    prcVar.s(str2, yqcVar.a);
                                    prcVar.setStatisticsMode(this.h);
                                    prcVar.setDisplayMode(this.g);
                                    prcVar.setStatisticData(yqcVar);
                                    linearLayout2 = (LinearLayout) fsfVar.a;
                                    if (linearLayout2 == null) {
                                    }
                                    break;
                                case 10:
                                    prcVar = new xrc(context);
                                    prcVar.q(this.e, this.f, this.b.getGender());
                                    prcVar.s(str2, yqcVar.a);
                                    prcVar.setStatisticsMode(this.h);
                                    prcVar.setDisplayMode(this.g);
                                    prcVar.setStatisticData(yqcVar);
                                    linearLayout2 = (LinearLayout) fsfVar.a;
                                    if (linearLayout2 == null) {
                                    }
                                    break;
                                case 11:
                                    prcVar = new esc(context);
                                    prcVar.q(this.e, this.f, this.b.getGender());
                                    prcVar.s(str2, yqcVar.a);
                                    prcVar.setStatisticsMode(this.h);
                                    prcVar.setDisplayMode(this.g);
                                    prcVar.setStatisticData(yqcVar);
                                    linearLayout2 = (LinearLayout) fsfVar.a;
                                    if (linearLayout2 == null) {
                                    }
                                    break;
                                default:
                                    zzl.b();
                                    return;
                            }
                        }
                        linearLayout = (LinearLayout) fsfVar.a;
                        if (linearLayout != null) {
                            ((LinearLayout) ddVar.c).addView(linearLayout);
                        }
                        if (i != arrayList.size() - 1 || ((src) arrayList.get(i2)).c == urc.b) {
                            z3 = z;
                        } else {
                            SofaDivider sofaDivider = new SofaDivider(context, null, 6);
                            Context context3 = sofaDivider.getContext();
                            context3.getClass();
                            sofaDivider.setHorizontalMarginPx(ao2.s(16, context3));
                            z3 = z;
                            sofaDivider.setDividerVisibility(z3);
                            ((LinearLayout) ddVar.c).addView(sofaDivider);
                        }
                        i = i2;
                        it2 = it4;
                        z4 = z2;
                    } else {
                        z = z3;
                    }
                    z2 = z4;
                    View inflate2 = layoutInflater.inflate(R.layout.subtitle_micro_center, (ViewGroup) lrcVar, false);
                    inflate2.getClass();
                    TextView textView2 = (TextView) inflate2;
                    textView2.setText(context.getString(tnf.p(str2)));
                    ((LinearLayout) ddVar.c).addView(textView2);
                    if (srcVar.c != urc.d) {
                    }
                    it = srcVar.b.iterator();
                    while (it.hasNext()) {
                    }
                    linearLayout = (LinearLayout) fsfVar.a;
                    if (linearLayout != null) {
                    }
                    if (i != arrayList.size() - 1) {
                    }
                    z3 = z;
                    i = i2;
                    it2 = it4;
                    z4 = z2;
                }
                Iterator it5 = it2;
                boolean z5 = z4;
                ym6 ym6Var = this.k;
                ym6Var.c = 150L;
                ViewGroup viewGroup = this.c;
                hxj.a(viewGroup, ym6Var);
                viewGroup.addView(lrcVar);
                it2 = it5;
                z4 = z5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        r1.remove(r8);
        r8.setStatisticData(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        List list = (List) this.j.get(this.i);
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                trc trcVar = (trc) obj;
                ArrayList b = b();
                if (i < 0 || i >= b.size()) {
                    return;
                }
                ArrayList U0 = CollectionsKt.U0(((lrc) b.get(i)).getFightStatisticsViews());
                Iterator it = trcVar.b.iterator();
                while (it.hasNext()) {
                    src srcVar = (src) it.next();
                    Iterator it2 = srcVar.b.iterator();
                    while (it2.hasNext()) {
                        yqc yqcVar = (yqc) it2.next();
                        Iterator it3 = U0.iterator();
                        while (it3.hasNext()) {
                            m6 m6Var = (m6) it3.next();
                            if (!Intrinsics.c(m6Var.getGroupTag(), srcVar.a) || !Intrinsics.c(m6Var.getTag(), yqcVar.a)) {
                            }
                        }
                        ogj.m("Collection contains no element matching the predicate.");
                        return;
                    }
                }
                i = i2;
            }
        }
    }
}
