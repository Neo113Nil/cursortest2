package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.FootballEvent;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.results.R;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.EventListScoreTextView;
import com.sofascore.results.view.WDLView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class nj8 extends r7 {
    public final /* synthetic */ int f = 0;
    public final boolean g;
    public final sl6 h;
    public final int i;
    public final View j;
    public final BellButton k;
    public final EventListScoreTextView l;
    public final List m;
    public final krk n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nj8(pvk pvkVar, boolean z, sl6 sl6Var, int i, int i2) {
        super(r7);
        z = (i2 & 2) != 0 ? false : z;
        sl6Var = (i2 & 4) != 0 ? null : sl6Var;
        i = (i2 & 8) != 0 ? 16 : i;
        ConstraintLayout constraintLayout = pvkVar.a;
        constraintLayout.getClass();
        this.n = pvkVar;
        this.g = z;
        this.h = sl6Var;
        this.i = i;
        this.j = pvkVar.j;
        this.k = (BellButton) pvkVar.b.d;
        EventListScoreTextView eventListScoreTextView = pvkVar.s;
        this.l = eventListScoreTextView;
        this.m = b.j(pvkVar.h, pvkVar.q, pvkVar.i, pvkVar.r, eventListScoreTextView);
    }

    public static void s(TextView textView, Integer num) {
        textView.setVisibility((num != null ? num.intValue() : 0) > 0 ? 0 : 8);
        if (num == null || num.intValue() <= 0) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_card_red_16, 0, 0, 0);
            textView.setText(num.intValue() > 1 ? String.format(dla.d(), "×%d", Arrays.copyOf(new Object[]{num}, 1)) : null);
        }
    }

    @Override // defpackage.r7, defpackage.p8
    public final void b(int i, int i2, Object obj) {
        switch (this.f) {
            case 0:
                mj8 mj8Var = (mj8) obj;
                mj8Var.getClass();
                m(mj8Var);
                q(i, i2, mj8Var, false);
                break;
            default:
                n5j n5jVar = (n5j) obj;
                n5jVar.getClass();
                m(n5jVar);
                r(i, i2, n5jVar, false);
                break;
        }
    }

    @Override // defpackage.p8
    public final void c(int i, int i2, Object obj) {
        switch (this.f) {
            case 0:
                mj8 mj8Var = (mj8) obj;
                mj8Var.getClass();
                q(i, i2, mj8Var, true);
                break;
            default:
                n5j n5jVar = (n5j) obj;
                n5jVar.getClass();
                r(i, i2, n5jVar, true);
                break;
        }
    }

    @Override // defpackage.r7
    public final BellButton g() {
        switch (this.f) {
        }
        return this.k;
    }

    @Override // defpackage.r7
    public final EventListScoreTextView i() {
        switch (this.f) {
        }
        return this.l;
    }

    @Override // defpackage.r7
    public final View j() {
        switch (this.f) {
        }
        return this.j;
    }

    @Override // defpackage.r7
    public final List k() {
        switch (this.f) {
        }
        return this.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(mj8 mj8Var, boolean z, boolean z2) {
        boolean z3;
        jtg jtgVar;
        Integer valueOf;
        ImageView imageView;
        List<String> streamContentGeoRestrictions;
        pvk pvkVar = (pvk) this.n;
        if (z2) {
            s9a.G(mj8Var);
        } else {
            h().d.removeCallbacksAndMessages(null);
        }
        va9 va9Var = mj8Var.C;
        FootballEvent footballEvent = mj8Var.O;
        if (!z2) {
            va9Var = null;
        }
        mj8Var.e(h(), va9Var, new ij8(1, this, mj8Var));
        TextView textView = pvkVar.t;
        TextView textView2 = pvkVar.o;
        TextView textView3 = pvkVar.f;
        ImageView imageView2 = pvkVar.n;
        f6a.g(textView, mj8Var.g);
        f6a.h(pvkVar.s, mj8Var.h, z, Boolean.valueOf(va9Var != null && va9Var.g));
        boolean z4 = mj8Var.m;
        ImageView imageView3 = pvkVar.e;
        if (z4) {
            as9.p(imageView3, Event.getHomeTeam$default(footballEvent, null, 1, null), ((Boolean) mj8Var.N.getValue()).booleanValue());
            as9.p(imageView2, Event.getAwayTeam$default(footballEvent, null, 1, null), ((Boolean) mj8Var.N.getValue()).booleanValue());
        } else {
            imageView3.setVisibility(8);
            imageView2.setVisibility(8);
        }
        f6a.g(textView3, mj8Var.a);
        f6a.g(textView2, mj8Var.b);
        f6a.g(pvkVar.c, mj8Var.D);
        ImageView imageView4 = pvkVar.l;
        imageView4.setVisibility((footballEvent.getStreamContentId() == null || (streamContentGeoRestrictions = footballEvent.getStreamContentGeoRestrictions()) == null || !streamContentGeoRestrictions.contains(dv3.c()) || ok3.C(footballEvent) || ph0.a0(new String[]{StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(footballEvent.getStatusType())) ? 8 : 0);
        imageView4.setImageTintList(eq3.q(ok3.D(footballEvent) ? R.color.live : R.color.neutral_default, imageView4.getContext()));
        s(pvkVar.g, mj8Var.P);
        s(pvkVar.p, mj8Var.Q);
        ImageView imageView5 = pvkVar.k;
        if (footballEvent.getCrowdsourcingDataDisplayEnabled()) {
            long longValue = xe6.c().b().longValue();
            long startTimestamp = footballEvent.getStartTimestamp();
            wd5 wd5Var = xd5.b;
            if (longValue > startTimestamp - xd5.k(wkn.R(72, be5.HOURS), be5.SECONDS)) {
                z3 = true;
                imageView5.setSelected(z3);
                imageView5.setVisibility(!mj8Var.v ? 0 : 8);
                f6a.h(pvkVar.i, mj8Var.y, z, va9Var == null ? Boolean.valueOf(va9Var.c) : null);
                f6a.h(pvkVar.r, mj8Var.z, z, va9Var == null ? Boolean.valueOf(va9Var.d) : null);
                f6a.h(pvkVar.h, mj8Var.e, z, va9Var == null ? Boolean.valueOf(va9Var.a) : null);
                f6a.h(pvkVar.q, mj8Var.f, z, va9Var == null ? Boolean.valueOf(va9Var.b) : null);
                pvkVar.d.setVisibility(!mj8Var.A ? 0 : 8);
                pvkVar.m.setVisibility(!mj8Var.B ? 0 : 8);
                jtgVar = h().b;
                if (jtgVar != null) {
                    jtgVar.a(va9Var != null && va9Var.d());
                }
                Boolean isVarInProgress$default = FootballEvent.isVarInProgress$default(footballEvent, true, null, 2, null);
                Boolean bool = Boolean.TRUE;
                boolean c = Intrinsics.c(isVarInProgress$default, bool);
                boolean c2 = Intrinsics.c(FootballEvent.isVarInProgress$default(footballEvent, false, null, 2, null), bool);
                valueOf = !c ? Integer.valueOf(textView3.getId()) : c2 ? Integer.valueOf(textView2.getId()) : null;
                Integer valueOf2 = !c2 ? Integer.valueOf(textView2.getId()) : c ? Integer.valueOf(textView3.getId()) : null;
                imageView = pvkVar.u;
                if (valueOf != null || valueOf2 == null) {
                    imageView.clearAnimation();
                    imageView.setVisibility(8);
                }
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    return;
                }
                tl3 tl3Var = (tl3) layoutParams;
                tl3Var.i = valueOf.intValue();
                tl3Var.l = valueOf2.intValue();
                imageView.setLayoutParams(tl3Var);
                imageView.setVisibility(0);
                if (imageView.getAnimation() == null) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    alphaAnimation.setDuration(1000L);
                    alphaAnimation.setRepeatCount(-1);
                    alphaAnimation.setRepeatMode(2);
                    alphaAnimation.setInterpolator(new DecelerateInterpolator());
                    imageView.startAnimation(alphaAnimation);
                    return;
                }
                return;
            }
        }
        z3 = false;
        imageView5.setSelected(z3);
        imageView5.setVisibility(!mj8Var.v ? 0 : 8);
        f6a.h(pvkVar.i, mj8Var.y, z, va9Var == null ? Boolean.valueOf(va9Var.c) : null);
        f6a.h(pvkVar.r, mj8Var.z, z, va9Var == null ? Boolean.valueOf(va9Var.d) : null);
        f6a.h(pvkVar.h, mj8Var.e, z, va9Var == null ? Boolean.valueOf(va9Var.a) : null);
        f6a.h(pvkVar.q, mj8Var.f, z, va9Var == null ? Boolean.valueOf(va9Var.b) : null);
        pvkVar.d.setVisibility(!mj8Var.A ? 0 : 8);
        pvkVar.m.setVisibility(!mj8Var.B ? 0 : 8);
        jtgVar = h().b;
        if (jtgVar != null) {
        }
        Boolean isVarInProgress$default2 = FootballEvent.isVarInProgress$default(footballEvent, true, null, 2, null);
        Boolean bool2 = Boolean.TRUE;
        boolean c3 = Intrinsics.c(isVarInProgress$default2, bool2);
        boolean c22 = Intrinsics.c(FootballEvent.isVarInProgress$default(footballEvent, false, null, 2, null), bool2);
        if (!c3) {
        }
        if (!c22) {
        }
        imageView = pvkVar.u;
        if (valueOf != null) {
        }
        imageView.clearAnimation();
        imageView.setVisibility(8);
    }

    public void p(n5j n5jVar, boolean z, boolean z2) {
        List<String> streamContentGeoRestrictions;
        qvk qvkVar = (qvk) this.n;
        if (z2) {
            s9a.G(n5jVar);
        } else {
            h().d.removeCallbacksAndMessages(null);
        }
        va9 va9Var = n5jVar.C;
        TennisEvent tennisEvent = n5jVar.O;
        if (!z2) {
            va9Var = null;
        }
        n5jVar.e(h(), va9Var, new deh(23, this, n5jVar));
        TextView textView = qvkVar.t;
        ImageView imageView = qvkVar.d;
        ImageView imageView2 = qvkVar.m;
        f6a.g(textView, n5jVar.g);
        f6a.h(qvkVar.s, n5jVar.h, z, Boolean.valueOf(va9Var != null && va9Var.g));
        if (n5jVar.m) {
            as9.p(imageView, Event.getHomeTeam$default(tennisEvent, null, 1, null), ((Boolean) n5jVar.N.getValue()).booleanValue());
            as9.p(imageView2, Event.getAwayTeam$default(tennisEvent, null, 1, null), ((Boolean) n5jVar.N.getValue()).booleanValue());
        } else {
            aik.Q(imageView).a();
            aik.Q(imageView2).a();
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
        f6a.g(qvkVar.e, n5jVar.a);
        f6a.g(qvkVar.n, n5jVar.b);
        f6a.g(qvkVar.c, n5jVar.D);
        ImageView imageView3 = qvkVar.l;
        imageView3.setVisibility((tennisEvent.getStreamContentId() == null || (streamContentGeoRestrictions = tennisEvent.getStreamContentGeoRestrictions()) == null || !streamContentGeoRestrictions.contains(dv3.c()) || ok3.C(tennisEvent) || ph0.a0(new String[]{StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(tennisEvent.getStatusType())) ? 8 : 0);
        imageView3.setImageTintList(eq3.q(ok3.D(tennisEvent) ? R.color.live : R.color.neutral_default, imageView3.getContext()));
        ImageView imageView4 = qvkVar.k;
        imageView4.setSelected(tennisEvent.isCrowdsourcingLive());
        imageView4.setVisibility(n5jVar.v ? 0 : 8);
        qvkVar.i.setVisibility(n5jVar.t ? 0 : 8);
        qvkVar.r.setVisibility(n5jVar.u ? 0 : 8);
        f6a.h(qvkVar.g, n5jVar.w, z, va9Var != null ? Boolean.valueOf(va9Var.e) : null);
        f6a.h(qvkVar.p, n5jVar.x, z, va9Var != null ? Boolean.valueOf(va9Var.f) : null);
        f6a.h(qvkVar.h, n5jVar.y, z, va9Var != null ? Boolean.valueOf(va9Var.c) : null);
        f6a.h(qvkVar.q, n5jVar.z, z, va9Var != null ? Boolean.valueOf(va9Var.d) : null);
        f6a.h(qvkVar.f, n5jVar.e, z, va9Var != null ? Boolean.valueOf(va9Var.a) : null);
        f6a.h(qvkVar.o, n5jVar.f, z, va9Var != null ? Boolean.valueOf(va9Var.b) : null);
        jtg jtgVar = h().b;
        if (jtgVar != null) {
            jtgVar.a(va9Var != null && va9Var.d());
        }
    }

    public void q(int i, int i2, mj8 mj8Var, boolean z) {
        Team team;
        pvk pvkVar = (pvk) this.n;
        boolean z2 = this.g;
        o(mj8Var, z && z2, z2);
        nr1 nr1Var = pvkVar.b;
        BellButton bellButton = (BellButton) nr1Var.d;
        WDLView wDLView = (WDLView) nr1Var.i;
        FootballEvent footballEvent = mj8Var.O;
        sl6 sl6Var = this.h;
        d(bellButton, wDLView, footballEvent, (sl6Var == null || (team = (Team) sl6Var.a) == null) ? null : Integer.valueOf(team.getId()));
        boolean l = l(i, i2, mj8Var);
        ConstraintLayout constraintLayout = pvkVar.a;
        constraintLayout.getClass();
        ((inb) this.d).getClass();
        sea.u(constraintLayout, false, mj8Var.n, l, this.i, 6, constraintLayout.getContext().getColor(R.color.surface_1), mj8Var.p);
    }

    public void r(int i, int i2, n5j n5jVar, boolean z) {
        Team team;
        qvk qvkVar = (qvk) this.n;
        boolean z2 = this.g;
        p(n5jVar, z && z2, z2);
        nr1 nr1Var = qvkVar.b;
        BellButton bellButton = (BellButton) nr1Var.d;
        WDLView wDLView = (WDLView) nr1Var.i;
        TennisEvent tennisEvent = n5jVar.O;
        sl6 sl6Var = this.h;
        d(bellButton, wDLView, tennisEvent, (sl6Var == null || (team = (Team) sl6Var.a) == null) ? null : Integer.valueOf(team.getId()));
        boolean l = l(i, i2, n5jVar);
        ConstraintLayout constraintLayout = qvkVar.a;
        constraintLayout.getClass();
        ((inb) this.d).getClass();
        sea.u(constraintLayout, false, n5jVar.n, l, this.i, 6, constraintLayout.getContext().getColor(R.color.surface_1), n5jVar.p);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nj8(qvk qvkVar, boolean z, sl6 sl6Var, int i, int i2) {
        super(r6);
        z = (i2 & 2) != 0 ? false : z;
        sl6Var = (i2 & 4) != 0 ? null : sl6Var;
        i = (i2 & 8) != 0 ? 16 : i;
        ConstraintLayout constraintLayout = qvkVar.a;
        constraintLayout.getClass();
        this.n = qvkVar;
        this.g = z;
        this.h = sl6Var;
        this.i = i;
        this.j = qvkVar.j;
        this.k = (BellButton) qvkVar.b.d;
        EventListScoreTextView eventListScoreTextView = qvkVar.s;
        this.l = eventListScoreTextView;
        this.m = b.j(qvkVar.f, qvkVar.o, qvkVar.h, qvkVar.q, eventListScoreTextView);
    }
}
