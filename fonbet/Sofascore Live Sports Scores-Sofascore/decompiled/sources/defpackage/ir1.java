package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.BasketballEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.EventListScoreTextView;
import com.sofascore.results.view.WDLView;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class ir1 extends r7 {
    public final /* synthetic */ int f = 1;
    public final boolean g;
    public final boolean h;
    public final sl6 i;
    public final int j;
    public final View k;
    public final BellButton l;
    public final EventListScoreTextView m;
    public final List n;
    public final krk o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ir1(j22 j22Var, boolean z, sl6 sl6Var, boolean z2, int i, int i2) {
        super(r8);
        z = (i2 & 2) != 0 ? false : z;
        sl6Var = (i2 & 4) != 0 ? null : sl6Var;
        z2 = (i2 & 8) != 0 ? false : z2;
        i = (i2 & 16) != 0 ? 16 : i;
        ConstraintLayout constraintLayout = j22Var.b;
        constraintLayout.getClass();
        this.o = j22Var;
        this.g = z;
        this.i = sl6Var;
        this.h = z2;
        this.j = i;
        this.k = j22Var.c;
        this.l = (BellButton) ((nr1) j22Var.o).d;
        EventListScoreTextView eventListScoreTextView = (EventListScoreTextView) j22Var.l;
        this.m = eventListScoreTextView;
        this.n = b.j((EventListScoreTextView) j22Var.p, (EventListScoreTextView) j22Var.j, (EventListScoreTextView) j22Var.q, (EventListScoreTextView) j22Var.k, eventListScoreTextView);
    }

    @Override // defpackage.r7, defpackage.p8
    public final void b(int i, int i2, Object obj) {
        switch (this.f) {
            case 0:
                y21 y21Var = (y21) obj;
                y21Var.getClass();
                super.m(y21Var);
                q(i, i2, y21Var, false);
                break;
            default:
                y21 y21Var2 = (y21) obj;
                y21Var2.getClass();
                super.m(y21Var2);
                q(i, i2, y21Var2, false);
                break;
        }
    }

    @Override // defpackage.p8
    public final void c(int i, int i2, Object obj) {
        switch (this.f) {
            case 0:
                y21 y21Var = (y21) obj;
                y21Var.getClass();
                q(i, i2, y21Var, true);
                break;
            default:
                y21 y21Var2 = (y21) obj;
                y21Var2.getClass();
                q(i, i2, y21Var2, true);
                break;
        }
    }

    @Override // defpackage.r7
    public final BellButton g() {
        switch (this.f) {
        }
        return this.l;
    }

    @Override // defpackage.r7
    public final EventListScoreTextView i() {
        switch (this.f) {
        }
        return this.m;
    }

    @Override // defpackage.r7
    public final View j() {
        switch (this.f) {
        }
        return this.k;
    }

    @Override // defpackage.r7
    public final List k() {
        switch (this.f) {
        }
        return this.n;
    }

    @Override // defpackage.r7
    public final void m(y21 y21Var) {
        switch (this.f) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    public void o(y21 y21Var, boolean z, boolean z2) {
        List<String> streamContentGeoRestrictions;
        bcb bcbVar = (bcb) this.o;
        if (z2) {
            s9a.G(y21Var);
        } else {
            h().d.removeCallbacksAndMessages(null);
        }
        va9 va9Var = y21Var.C;
        if (!z2) {
            va9Var = null;
        }
        y21Var.e(h(), va9Var, new h84(16, this, y21Var));
        TextView textView = bcbVar.G;
        ConstraintLayout constraintLayout = bcbVar.a;
        ImageView imageView = bcbVar.E;
        ImageView imageView2 = bcbVar.n;
        f6a.g(textView, y21Var.g);
        f6a.h(bcbVar.F, y21Var.h, z, Boolean.valueOf(va9Var != null && va9Var.g));
        if (y21Var.m) {
            as9.p(bcbVar.f, Event.getHomeTeam$default(y21Var.d(), null, 1, null), ((Boolean) y21Var.N.getValue()).booleanValue());
            as9.p(bcbVar.w, Event.getAwayTeam$default(y21Var.d(), null, 1, null), ((Boolean) y21Var.N.getValue()).booleanValue());
        }
        f6a.g(bcbVar.g, y21Var.a);
        f6a.g(bcbVar.x, y21Var.b);
        ImageView imageView3 = bcbVar.q;
        imageView3.setVisibility((y21Var.d().getStreamContentId() == null || (streamContentGeoRestrictions = y21Var.d().getStreamContentGeoRestrictions()) == null || !streamContentGeoRestrictions.contains(dv3.c()) || ok3.C(y21Var.d()) || ph0.a0(new String[]{StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(y21Var.d().getStatusType())) ? 8 : 0);
        Context context = imageView3.getContext();
        boolean D = ok3.D(y21Var.d());
        int i = R.color.live;
        imageView3.setImageTintList(eq3.q(D ? R.color.live : R.color.neutral_default, context));
        ImageView imageView4 = bcbVar.p;
        imageView4.setSelected(y21Var.d().isCrowdsourcingLive());
        imageView4.setVisibility(y21Var.v ? 0 : 8);
        Integer num = y21Var.q;
        if (num != null) {
            imageView2.setImageResource(num.intValue());
            Context context2 = constraintLayout.getContext();
            Integer num2 = y21Var.s;
            imageView2.setImageTintList(ColorStateList.valueOf(context2.getColor(num2 != null ? num2.intValue() : R.color.live)));
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        Integer num3 = y21Var.r;
        if (num3 != null) {
            imageView.setImageResource(num3.intValue());
            Context context3 = constraintLayout.getContext();
            Integer num4 = y21Var.s;
            if (num4 != null) {
                i = num4.intValue();
            }
            imageView.setImageTintList(ColorStateList.valueOf(context3.getColor(i)));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        bcbVar.m.setVisibility(y21Var.t ? 0 : 8);
        bcbVar.D.setVisibility(y21Var.u ? 0 : 8);
        f6a.h(bcbVar.k, y21Var.w, z, va9Var != null ? Boolean.valueOf(va9Var.e) : null);
        f6a.h(bcbVar.B, y21Var.x, z, va9Var != null ? Boolean.valueOf(va9Var.f) : null);
        f6a.h(bcbVar.l, y21Var.y, z, va9Var != null ? Boolean.valueOf(va9Var.c) : null);
        f6a.h(bcbVar.C, y21Var.z, z, va9Var != null ? Boolean.valueOf(va9Var.d) : null);
        f6a.h(bcbVar.j, y21Var.e, z, va9Var != null ? Boolean.valueOf(va9Var.a) : null);
        f6a.h(bcbVar.A, y21Var.f, z, va9Var != null ? Boolean.valueOf(va9Var.b) : null);
        bcbVar.d.setVisibility(y21Var.A ? 0 : 8);
        bcbVar.u.setVisibility(y21Var.B ? 0 : 8);
        f6a.g(bcbVar.c, y21Var.D);
        jtg jtgVar = h().b;
        if (jtgVar != null) {
            jtgVar.a(va9Var != null && va9Var.d());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(y21 y21Var, boolean z, boolean z2) {
        jfj jfjVar;
        jfj jfjVar2;
        jfj jfjVar3;
        jfj jfjVar4;
        jtg jtgVar;
        List<String> streamContentGeoRestrictions;
        String awayTeamSeed$default;
        String homeTeamSeed$default;
        Integer F;
        j22 j22Var = (j22) this.o;
        if (z2) {
            s9a.G(y21Var);
        } else {
            h().d.removeCallbacksAndMessages(null);
        }
        va9 va9Var = y21Var.C;
        if (!z2) {
            va9Var = null;
        }
        y21Var.e(h(), va9Var, new j4(28, this, y21Var));
        f6a.g((TextView) j22Var.g, y21Var.g);
        boolean z3 = false;
        f6a.h((EventListScoreTextView) j22Var.l, y21Var.h, z, Boolean.valueOf(va9Var != null && va9Var.g));
        if (y21Var.m) {
            as9.p(j22Var.m, Event.getHomeTeam$default(y21Var.d(), null, 1, null), ((Boolean) y21Var.N.getValue()).booleanValue());
            as9.p((ImageView) j22Var.i, Event.getAwayTeam$default(y21Var.d(), null, 1, null), ((Boolean) y21Var.N.getValue()).booleanValue());
        }
        Event d = y21Var.d();
        BasketballEvent basketballEvent = d instanceof BasketballEvent ? (BasketballEvent) d : null;
        boolean z4 = this.h;
        if (basketballEvent == null || !z4 || (F = o3a.F(basketballEvent.getTournament())) == null || F.intValue() != 132) {
            basketballEvent = null;
        }
        if (basketballEvent == null || (homeTeamSeed$default = Event.getHomeTeamSeed$default(basketballEvent, null, 1, null)) == null) {
            jfjVar = y21Var.a;
        } else {
            jfj jfjVar5 = y21Var.a;
            jfjVar = jfj.a(jfjVar5, dmi.r(jfjVar5.a, " (", homeTeamSeed$default, ")"), null, 6);
        }
        if (basketballEvent == null || (awayTeamSeed$default = Event.getAwayTeamSeed$default(basketballEvent, null, 1, null)) == null) {
            jfjVar2 = y21Var.b;
        } else {
            jfj jfjVar6 = y21Var.b;
            jfjVar2 = jfj.a(jfjVar6, dmi.r(jfjVar6.a, " (", awayTeamSeed$default, ")"), null, 6);
        }
        f6a.g(j22Var.e, jfjVar);
        f6a.g(j22Var.f, jfjVar2);
        ImageView imageView = (ImageView) j22Var.h;
        imageView.setVisibility((y21Var.d().getStreamContentId() == null || (streamContentGeoRestrictions = y21Var.d().getStreamContentGeoRestrictions()) == null || !streamContentGeoRestrictions.contains(dv3.c()) || ok3.C(y21Var.d()) || ph0.a0(new String[]{StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(y21Var.d().getStatusType())) ? 8 : 0);
        imageView.setImageTintList(eq3.q(ok3.D(y21Var.d()) ? R.color.live : R.color.neutral_default, imageView.getContext()));
        ImageView imageView2 = (ImageView) j22Var.n;
        imageView2.setSelected(y21Var.d().isCrowdsourcingLive());
        imageView2.setVisibility(y21Var.v ? 0 : 8);
        if (z4) {
            hr1 hr1Var = y21Var instanceof hr1 ? (hr1) y21Var : null;
            if (hr1Var != null) {
                jfjVar3 = hr1Var.P;
                TextView textView = j22Var.d;
                jfjVar4 = y21Var.D;
                if (jfjVar4 != null) {
                    jfjVar3 = jfjVar4;
                }
                f6a.g(textView, jfjVar3);
                f6a.h((EventListScoreTextView) j22Var.q, y21Var.y, z, va9Var == null ? Boolean.valueOf(va9Var.c) : null);
                f6a.h((EventListScoreTextView) j22Var.k, y21Var.z, z, va9Var == null ? Boolean.valueOf(va9Var.d) : null);
                f6a.h((EventListScoreTextView) j22Var.p, y21Var.e, z, va9Var == null ? Boolean.valueOf(va9Var.a) : null);
                f6a.h((EventListScoreTextView) j22Var.j, y21Var.f, z, va9Var != null ? Boolean.valueOf(va9Var.b) : null);
                jtgVar = h().b;
                if (jtgVar == null) {
                    if (va9Var != null && va9Var.d()) {
                        z3 = true;
                    }
                    jtgVar.a(z3);
                    return;
                }
                return;
            }
        }
        jfjVar3 = null;
        TextView textView2 = j22Var.d;
        jfjVar4 = y21Var.D;
        if (jfjVar4 != null) {
        }
        f6a.g(textView2, jfjVar3);
        f6a.h((EventListScoreTextView) j22Var.q, y21Var.y, z, va9Var == null ? Boolean.valueOf(va9Var.c) : null);
        f6a.h((EventListScoreTextView) j22Var.k, y21Var.z, z, va9Var == null ? Boolean.valueOf(va9Var.d) : null);
        f6a.h((EventListScoreTextView) j22Var.p, y21Var.e, z, va9Var == null ? Boolean.valueOf(va9Var.a) : null);
        f6a.h((EventListScoreTextView) j22Var.j, y21Var.f, z, va9Var != null ? Boolean.valueOf(va9Var.b) : null);
        jtgVar = h().b;
        if (jtgVar == null) {
        }
    }

    public void q(int i, int i2, y21 y21Var, boolean z) {
        Team team;
        Team team2;
        int i3 = this.f;
        Object obj = this.d;
        Integer num = null;
        sl6 sl6Var = this.i;
        boolean z2 = false;
        krk krkVar = this.o;
        boolean z3 = this.g;
        switch (i3) {
            case 0:
                j22 j22Var = (j22) krkVar;
                if (z && z3) {
                    z2 = true;
                }
                p(y21Var, z2, z3);
                nr1 nr1Var = (nr1) j22Var.o;
                BellButton bellButton = (BellButton) nr1Var.d;
                WDLView wDLView = (WDLView) nr1Var.i;
                Event d = y21Var.d();
                if (sl6Var != null && (team = (Team) sl6Var.a) != null) {
                    num = Integer.valueOf(team.getId());
                }
                d(bellButton, wDLView, d, num);
                boolean l = l(i, i2, y21Var);
                ConstraintLayout constraintLayout = j22Var.b;
                constraintLayout.getClass();
                ((inb) obj).getClass();
                sea.u(constraintLayout, false, y21Var.n, l, this.j, 6, constraintLayout.getContext().getColor(R.color.surface_1), y21Var.p);
                break;
            default:
                bcb bcbVar = (bcb) krkVar;
                if (z && z3) {
                    z2 = true;
                }
                o(y21Var, z2, z3);
                nr1 nr1Var2 = bcbVar.b;
                BellButton bellButton2 = (BellButton) nr1Var2.d;
                WDLView wDLView2 = (WDLView) nr1Var2.i;
                Event d2 = y21Var.d();
                if (sl6Var != null && (team2 = (Team) sl6Var.a) != null) {
                    num = Integer.valueOf(team2.getId());
                }
                d(bellButton2, wDLView2, d2, num);
                if (this.h) {
                    boolean l2 = l(i, i2, y21Var);
                    ConstraintLayout constraintLayout2 = bcbVar.a;
                    constraintLayout2.getClass();
                    ((inb) obj).getClass();
                    sea.u(constraintLayout2, false, y21Var.n, l2, this.j, 6, constraintLayout2.getContext().getColor(R.color.surface_1), y21Var.p);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ir1(bcb bcbVar, boolean z, boolean z2, sl6 sl6Var, int i, int i2) {
        super(r8);
        z = (i2 & 2) != 0 ? false : z;
        z2 = (i2 & 4) != 0 ? true : z2;
        sl6Var = (i2 & 8) != 0 ? null : sl6Var;
        i = (i2 & 16) != 0 ? 16 : i;
        ConstraintLayout constraintLayout = bcbVar.a;
        constraintLayout.getClass();
        this.o = bcbVar;
        this.g = z;
        this.h = z2;
        this.i = sl6Var;
        this.j = i;
        this.k = bcbVar.o;
        this.l = (BellButton) bcbVar.b.d;
        EventListScoreTextView eventListScoreTextView = bcbVar.F;
        this.m = eventListScoreTextView;
        this.n = b.j(bcbVar.j, bcbVar.A, bcbVar.l, bcbVar.C, eventListScoreTextView);
    }
}
