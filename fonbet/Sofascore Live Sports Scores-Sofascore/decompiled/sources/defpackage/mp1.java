package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.facebook.c0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Timer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mp1 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ boolean s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp1(boolean z, zag zagVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 4;
        this.s = z;
        this.t = zagVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                mp1 mp1Var = new mp1((ykj) obj2, rq3Var, 0);
                mp1Var.s = ((Boolean) obj).booleanValue();
                return mp1Var;
            case 1:
                return new mp1((tr3) obj2, this.s, rq3Var, 1);
            case 2:
                mp1 mp1Var2 = new mp1((FantasyCompetitionActivity) obj2, rq3Var, 2);
                mp1Var2.s = ((Boolean) obj).booleanValue();
                return mp1Var2;
            case 3:
                mp1 mp1Var3 = new mp1((FantasyCompetitionFixturesFragment) obj2, rq3Var, 3);
                mp1Var3.s = ((Boolean) obj).booleanValue();
                return mp1Var3;
            case 4:
                return new mp1(this.s, (zag) obj2, rq3Var);
            case 5:
                return new mp1((hcg) obj2, this.s, rq3Var, 5);
            case 6:
                return new mp1((idg) obj2, this.s, rq3Var, 6);
            case 7:
                return new mp1((xeg) obj2, this.s, rq3Var, 7);
            case 8:
                mp1 mp1Var4 = new mp1((Context) obj2, rq3Var, 8);
                mp1Var4.s = ((Boolean) obj).booleanValue();
                return mp1Var4;
            case 9:
                mp1 mp1Var5 = new mp1((UpgradeSofascoreActivity) obj2, rq3Var, 9);
                mp1Var5.s = ((Boolean) obj).booleanValue();
                return mp1Var5;
            case 10:
                mp1 mp1Var6 = new mp1((a0) obj2, rq3Var, 10);
                mp1Var6.s = ((Boolean) obj).booleanValue();
                return mp1Var6;
            case 11:
                mp1 mp1Var7 = new mp1((b0) obj2, rq3Var, 11);
                mp1Var7.s = ((Boolean) obj).booleanValue();
                return mp1Var7;
            case 12:
                mp1 mp1Var8 = new mp1((k) obj2, rq3Var, 12);
                mp1Var8.s = ((Boolean) obj).booleanValue();
                return mp1Var8;
            case 13:
                mp1 mp1Var9 = new mp1((c40) obj2, rq3Var, 13);
                mp1Var9.s = ((Boolean) obj).booleanValue();
                return mp1Var9;
            case 14:
                return new mp1((j) obj2, this.s, rq3Var, 14);
            default:
                mp1 mp1Var10 = new mp1((e) obj2, rq3Var, 15);
                mp1Var10.s = ((Boolean) obj).booleanValue();
                return mp1Var10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((mp1) create(bool, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((mp1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((mp1) create(bool2, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((mp1) create(bool3, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((mp1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((mp1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((mp1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((mp1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((mp1) create(bool4, (rq3) obj2)).invokeSuspend(Unit.a);
            case 9:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((mp1) create(bool5, (rq3) obj2)).invokeSuspend(Unit.a);
            case 10:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((mp1) create(bool6, (rq3) obj2)).invokeSuspend(Unit.a);
            case 11:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((mp1) create(bool7, (rq3) obj2)).invokeSuspend(Unit.a);
            case 12:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                return ((mp1) create(bool8, (rq3) obj2)).invokeSuspend(Unit.a);
            case 13:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                return ((mp1) create(bool9, (rq3) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((mp1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                return ((mp1) create(bool10, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object value;
        Timer timer;
        p03 p03Var;
        int i = this.r;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (!this.s) {
                    ((ykj) obj2).a();
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                tr3 tr3Var = (tr3) obj2;
                fdi fdiVar = tr3Var.n;
                boolean z = this.s;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, value instanceof f38 ? f38.a((f38) value, false, 0, 0, Boolean.valueOf(z), 31) : value));
                Object value2 = tr3Var.n.getValue();
                f38 f38Var = value2 instanceof f38 ? (f38) value2 : null;
                if (Intrinsics.c(f38Var != null ? Boolean.valueOf(f38Var.a) : null, Boolean.FALSE) && z) {
                    tr3Var.x(false);
                }
                break;
            case 2:
                boolean z2 = this.s;
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                int i2 = FantasyCompetitionActivity.R;
                z8e.s(((FantasyCompetitionActivity) obj2).R().c, z2);
                break;
            case 3:
                boolean z3 = this.s;
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                krk krkVar = ((FantasyCompetitionFixturesFragment) obj2).l;
                if (z3) {
                    krkVar.getClass();
                    tgj.E(((r68) krkVar).d, 0L, null, 15);
                } else {
                    krkVar.getClass();
                    tgj.G(((r68) krkVar).d, 0L, 3);
                }
                break;
            case 4:
                zag zagVar = (zag) obj2;
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                if (this.s && (p03Var = zagVar.p) != null) {
                    Timer timer2 = (Timer) p03Var.e;
                    if (timer2 != null) {
                        timer2.cancel();
                        p03Var.e = null;
                    }
                    hkg.T().post(new kac(p03Var, 16));
                }
                jhg jhgVar = zagVar.q;
                if (jhgVar != null && (timer = jhgVar.d) != null) {
                    timer.cancel();
                    jhgVar.d = null;
                }
                break;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                ez0 ez0Var = ((hcg) obj2).b;
                TextView textView = (TextView) ez0Var.e;
                boolean z4 = this.s;
                textView.setVisibility(z4 ? 8 : 0);
                ((ImageView) ez0Var.d).setVisibility(z4 ? 0 : 8);
                break;
            case 6:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                idg idgVar = (idg) obj2;
                ks8 ks8Var = idgVar.b;
                DisplayMetrics displayMetrics = idgVar.getContext().getResources().getDisplayMetrics();
                boolean z5 = this.s;
                gig gigVar = gig.SMALL;
                int applyDimension = (int) TypedValue.applyDimension(1, z5 ? 44.0f : 30.0f, displayMetrics);
                ViewGroup.LayoutParams layoutParams = ks8Var.c.getLayoutParams();
                layoutParams.width = applyDimension;
                layoutParams.height = applyDimension;
                ks8Var.c.setLayoutParams(layoutParams);
                ks8Var.e.setVisibility(z5 ? 8 : 0);
                ks8Var.d.setVisibility(z5 ? 0 : 8);
                break;
            case 7:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                ks8 ks8Var2 = ((xeg) obj2).b;
                ImageView imageView = ks8Var2.d;
                boolean z6 = this.s;
                imageView.setVisibility(z6 ? 0 : 8);
                ks8Var2.e.setVisibility(z6 ? 8 : 0);
                break;
            case 8:
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                i3e.a((Context) obj2, RescheduleReceiver.class, this.s);
                break;
            case 9:
                UpgradeSofascoreActivity upgradeSofascoreActivity = (UpgradeSofascoreActivity) obj2;
                boolean z7 = this.s;
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                if (z7) {
                    int i3 = UpgradeSofascoreActivity.M;
                    bli bliVar = upgradeSofascoreActivity.Q().g;
                    LinkedHashMap linkedHashMap = bli.s;
                    bliVar.l(upgradeSofascoreActivity, s5k.d);
                }
                break;
            case 10:
                lu3 lu3Var11 = lu3.a;
                y6a.M(obj);
                ((a0) obj2).a.m(null, Boolean.valueOf(this.s));
                break;
            case 11:
                lu3 lu3Var12 = lu3.a;
                y6a.M(obj);
                boolean z8 = this.s;
                fdi fdiVar2 = ((b0) obj2).w;
                Boolean valueOf = Boolean.valueOf(z8);
                fdiVar2.getClass();
                fdiVar2.m(null, valueOf);
                break;
            case 12:
                lu3 lu3Var13 = lu3.a;
                y6a.M(obj);
                boolean z9 = this.s;
                ((k) obj2).g.g("mraidbridge.setIsViewable(" + z9 + ')');
                break;
            case 13:
                lu3 lu3Var14 = lu3.a;
                y6a.M(obj);
                boolean z10 = this.s;
                c0 c0Var = (c0) ((c40) obj2).f;
                c0Var.getClass();
                c0Var.b("mraidbridge.setIsViewable(" + z10 + ')');
                break;
            case 14:
                lu3 lu3Var15 = lu3.a;
                y6a.M(obj);
                ((j) obj2).b(this.s);
                break;
            default:
                lu3 lu3Var16 = lu3.a;
                y6a.M(obj);
                boolean z11 = this.s;
                e eVar = (e) obj2;
                String str = eVar.l;
                h hVar = eVar.B;
                if (z11) {
                    Integer num = new Integer(eVar.E);
                    List list = hVar.f;
                    if (list != null) {
                        hVar.k.a(list, null, num, str);
                    }
                } else {
                    Integer num2 = new Integer(eVar.E);
                    List list2 = hVar.e;
                    if (list2 != null) {
                        hVar.k.a(list2, null, num2, str);
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mp1(Object obj, boolean z, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.s = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mp1(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
    }
}
