package com.equativ.displaysdk.adadapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.a70;
import defpackage.agg;
import defpackage.e6g;
import defpackage.gfg;
import defpackage.hs4;
import defpackage.jag;
import defpackage.k50;
import defpackage.kbg;
import defpackage.kda;
import defpackage.lag;
import defpackage.lbg;
import defpackage.lu3;
import defpackage.mbg;
import defpackage.mcg;
import defpackage.mig;
import defpackage.mjg;
import defpackage.mqi;
import defpackage.nbg;
import defpackage.nig;
import defpackage.obg;
import defpackage.pgg;
import defpackage.pig;
import defpackage.qcg;
import defpackage.r69;
import defpackage.rag;
import defpackage.rob;
import defpackage.rq3;
import defpackage.u8f;
import defpackage.uag;
import defpackage.vfg;
import defpackage.wfg;
import defpackage.wo0;
import defpackage.xag;
import defpackage.xbg;
import defpackage.y6a;
import defpackage.yeg;
import defpackage.yfg;
import defpackage.ypa;
import defpackage.z45;
import defpackage.zag;
import defpackage.zfg;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 72\u00020\u00012\u00020\u0002:\u000289B1\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJJ\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J#\u0010(\u001a\u00020\u001a2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001aH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001aH\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/equativ/displaysdk/adadapter/SASParallaxBannerAdapter;", "Lxbg;", "Lmig;", "Lobg;", "rendererSelector", "", "isCreativeFeedbackButtonDisplayed", "Lkotlin/Function1;", "Landroid/content/Context;", "Lyeg;", "muteControllerFactory", "<init>", "(Lobg;ZLkotlin/jvm/functions/Function1;)V", "context", "Ljag;", "ad", "Lpgg;", "remoteLoggerManager", "Lmjg;", "openMeasurementManager", "Lnig;", "customerFeedbackController", "Lqcg;", "contextInfo", "Llag;", "adAdapterCustomizationFactories", "", "loadAd", "(Landroid/content/Context;Ljag;Lpgg;Lmjg;Lnig;Lqcg;Llag;Lrq3;)Ljava/lang/Object;", "Landroid/view/View;", "getBannerView", "()Landroid/view/View;", "Lxag;", "adLifecycleController", "onAdLifecycleConfigured", "(Lxag;)V", "", "", "", "info", "onRuntimeInfoChange", "(Ljava/util/Map;)V", "onDestroy", "()V", "onCustomerFeedbackDialogShow", "shouldCloseAd", "onCustomerFeedbackDialogDismissed", "(Z)V", "Luag;", "adInfo", "Luag;", "getAdInfo", "()Luag;", "setAdInfo", "(Luag;)V", "RuntimeInfo", "f32", "yfg", "smart-display-sdk_prodRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SASParallaxBannerAdapter implements xbg, mig {

    @NotNull
    public static final String PARALLAX_MARGINS = "parallaxMargins";

    @NotNull
    public static final yfg RuntimeInfo = new yfg();
    public final obg a;
    public uag adInfo;
    public final boolean b;
    public final Function1 c;
    public wfg d;
    public View e;
    public RelativeLayout f;
    public FrameLayout g;
    public nig h;
    public yeg i;
    public kbg j;
    public xag k;
    public final mqi l;
    public agg m;
    public agg n;

    public SASParallaxBannerAdapter(@NotNull obg obgVar, boolean z, @NotNull Function1<? super Context, ? extends yeg> function1) {
        obgVar.getClass();
        function1.getClass();
        this.a = obgVar;
        this.b = z;
        this.c = function1;
        this.l = ypa.b(new e6g(this, 3));
        this.m = new agg(0, 0, 0, 0);
        this.n = new agg(0, 0, 0, 0);
    }

    public static final ViewTreeObserver.OnPreDrawListener access$getOnPreDrawListener(SASParallaxBannerAdapter sASParallaxBannerAdapter) {
        return (ViewTreeObserver.OnPreDrawListener) sASParallaxBannerAdapter.l.getValue();
    }

    @Override // defpackage.kag
    @NotNull
    public uag getAdInfo() {
        uag uagVar = this.adInfo;
        if (uagVar != null) {
            return uagVar;
        }
        Intrinsics.i("adInfo");
        throw null;
    }

    @Override // defpackage.xbg
    @NotNull
    public View getBannerView() {
        RelativeLayout relativeLayout = this.f;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.i("parallaxBannerView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x01cc, code lost:
    
        if (defpackage.xw3.R(r0, r1, r10) != r11) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // defpackage.kag
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadAd(@NotNull Context context, @NotNull jag jagVar, @NotNull pgg pggVar, @NotNull mjg mjgVar, @NotNull nig nigVar, @NotNull qcg qcgVar, @Nullable lag lagVar, @NotNull rq3<? super Unit> rq3Var) {
        zfg zfgVar;
        int i;
        Integer num;
        int intValue;
        Map map;
        agg aggVar;
        agg aggVar2;
        kbg p;
        SASParallaxBannerAdapter sASParallaxBannerAdapter;
        Context context2;
        SASParallaxBannerAdapter sASParallaxBannerAdapter2;
        SASParallaxBannerAdapter sASParallaxBannerAdapter3 = this;
        nig nigVar2 = nigVar;
        if (rq3Var instanceof zfg) {
            zfgVar = (zfg) rq3Var;
            int i2 = zfgVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zfgVar.z = i2 - Integer.MIN_VALUE;
                zfg zfgVar2 = zfgVar;
                Object obj = zfgVar2.x;
                lu3 lu3Var = lu3.a;
                i = zfgVar2.z;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    Resources resources = context.getResources();
                    resources.getClass();
                    jagVar.getClass();
                    rag ragVar = jagVar.b;
                    rag ragVar2 = rag.BANNER;
                    if (ragVar != ragVar2) {
                        throw new wo0(ragVar2 + " format is expected but " + ragVar + " ad format was received");
                    }
                    Integer num2 = jagVar.M;
                    if (num2 == null) {
                        throw new wo0("Invalid parallax ad: missing `parallaxMode`");
                    }
                    vfg vfgVar = num2.intValue() == 1 ? vfg.b : vfg.a;
                    String str = jagVar.H;
                    if (str != null) {
                        try {
                            num = Integer.valueOf(Color.parseColor("#".concat(str)));
                        } catch (Exception unused) {
                            num = null;
                        }
                        if (num != null) {
                            intValue = num.intValue();
                            int i3 = intValue;
                            map = jagVar.N;
                            if (map == null) {
                                Object obj2 = map.get("left");
                                int applyDimension = (obj2 instanceof Integer ? (Integer) obj2 : null) != null ? (int) TypedValue.applyDimension(1, r6.intValue(), resources.getDisplayMetrics()) : 0;
                                Object obj3 = map.get(PlayerKt.E_SPORTS_TOP);
                                int applyDimension2 = (obj3 instanceof Integer ? (Integer) obj3 : null) != null ? (int) TypedValue.applyDimension(1, r7.intValue(), resources.getDisplayMetrics()) : 0;
                                Object obj4 = map.get("right");
                                int applyDimension3 = (obj4 instanceof Integer ? (Integer) obj4 : null) != null ? (int) TypedValue.applyDimension(1, r8.intValue(), resources.getDisplayMetrics()) : 0;
                                Object obj5 = map.get("bottom");
                                aggVar = new agg(applyDimension, applyDimension2, applyDimension3, (obj5 instanceof Integer ? (Integer) obj5 : null) != null ? (int) TypedValue.applyDimension(1, r4.intValue(), resources.getDisplayMetrics()) : 0);
                            } else {
                                aggVar = null;
                            }
                            aggVar2 = aggVar;
                            sASParallaxBannerAdapter3.d = new wfg(vfgVar, i3, jagVar.I, jagVar.J, aggVar);
                            if (aggVar2 != null) {
                                sASParallaxBannerAdapter3.n = aggVar2;
                            }
                            sASParallaxBannerAdapter3.setAdInfo(kda.v(jagVar, null));
                            sASParallaxBannerAdapter3.h = nigVar2;
                            ((pig) nigVar2).o = sASParallaxBannerAdapter3;
                            p = ((u8f) sASParallaxBannerAdapter3.a).p(jagVar, pggVar, mjgVar, null, new nbg(mcg.INLINE, jagVar.l == null, 0, 0, false, false, false, false, true, true, mbg.b, lbg.a, 268), qcgVar);
                            zfgVar2.r = sASParallaxBannerAdapter3;
                            zfgVar2.s = context;
                            zfgVar2.t = nigVar2;
                            zfgVar2.u = p;
                            zfgVar2.v = sASParallaxBannerAdapter3;
                            zfgVar2.w = sASParallaxBannerAdapter3;
                            zfgVar2.z = 1;
                            obj = p.d(context, zfgVar2);
                            if (obj != lu3Var) {
                                sASParallaxBannerAdapter = sASParallaxBannerAdapter3;
                                context2 = context;
                                sASParallaxBannerAdapter2 = sASParallaxBannerAdapter;
                            }
                            return lu3Var;
                        }
                    }
                    intValue = -16777216;
                    int i32 = intValue;
                    map = jagVar.N;
                    if (map == null) {
                    }
                    aggVar2 = aggVar;
                    sASParallaxBannerAdapter3.d = new wfg(vfgVar, i32, jagVar.I, jagVar.J, aggVar);
                    if (aggVar2 != null) {
                    }
                    sASParallaxBannerAdapter3.setAdInfo(kda.v(jagVar, null));
                    sASParallaxBannerAdapter3.h = nigVar2;
                    ((pig) nigVar2).o = sASParallaxBannerAdapter3;
                    p = ((u8f) sASParallaxBannerAdapter3.a).p(jagVar, pggVar, mjgVar, null, new nbg(mcg.INLINE, jagVar.l == null, 0, 0, false, false, false, false, true, true, mbg.b, lbg.a, 268), qcgVar);
                    zfgVar2.r = sASParallaxBannerAdapter3;
                    zfgVar2.s = context;
                    zfgVar2.t = nigVar2;
                    zfgVar2.u = p;
                    zfgVar2.v = sASParallaxBannerAdapter3;
                    zfgVar2.w = sASParallaxBannerAdapter3;
                    zfgVar2.z = 1;
                    obj = p.d(context, zfgVar2);
                    if (obj != lu3Var) {
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SASParallaxBannerAdapter sASParallaxBannerAdapter4 = zfgVar2.w;
                SASParallaxBannerAdapter sASParallaxBannerAdapter5 = zfgVar2.v;
                p = (kbg) zfgVar2.u;
                nig nigVar3 = zfgVar2.t;
                context2 = zfgVar2.s;
                sASParallaxBannerAdapter = zfgVar2.r;
                y6a.M(obj);
                sASParallaxBannerAdapter2 = sASParallaxBannerAdapter4;
                sASParallaxBannerAdapter3 = sASParallaxBannerAdapter5;
                nigVar2 = nigVar3;
                sASParallaxBannerAdapter3.e = (View) obj;
                sASParallaxBannerAdapter2.j = p;
                hs4 hs4Var = z45.a;
                r69 r69Var = rob.a;
                k50 k50Var = new k50(sASParallaxBannerAdapter, context2, nigVar2, rq3Var2, 20);
                zfgVar2.r = null;
                zfgVar2.s = null;
                zfgVar2.t = null;
                zfgVar2.u = null;
                zfgVar2.v = null;
                zfgVar2.w = null;
                zfgVar2.z = 2;
            }
        }
        zfgVar = new zfg(sASParallaxBannerAdapter3, rq3Var);
        zfg zfgVar22 = zfgVar;
        Object obj6 = zfgVar22.x;
        lu3 lu3Var2 = lu3.a;
        i = zfgVar22.z;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        sASParallaxBannerAdapter3.e = (View) obj6;
        sASParallaxBannerAdapter2.j = p;
        hs4 hs4Var2 = z45.a;
        r69 r69Var2 = rob.a;
        k50 k50Var2 = new k50(sASParallaxBannerAdapter, context2, nigVar2, rq3Var22, 20);
        zfgVar22.r = null;
        zfgVar22.s = null;
        zfgVar22.t = null;
        zfgVar22.u = null;
        zfgVar22.v = null;
        zfgVar22.w = null;
        zfgVar22.z = 2;
    }

    @Override // defpackage.kag
    public void onAdLifecycleConfigured(@NotNull xag adLifecycleController) {
        adLifecycleController.getClass();
        kbg kbgVar = this.j;
        if (kbgVar != null) {
            kbgVar.onAdLifecycleConfigured(adLifecycleController);
        }
        this.k = adLifecycleController;
    }

    @Override // defpackage.mig
    public void onCustomerFeedbackDialogDismissed(boolean shouldCloseAd) {
        xag xagVar;
        if (!shouldCloseAd || (xagVar = this.k) == null) {
            return;
        }
        nig nigVar = this.h;
        if (nigVar != null) {
            ((zag) xagVar).n((View) ((pig) nigVar).n.getValue());
        } else {
            Intrinsics.i("customerFeedbackController");
            throw null;
        }
    }

    @Override // defpackage.kag
    public void onDestroy() {
        RelativeLayout relativeLayout = this.f;
        if (relativeLayout == null) {
            Intrinsics.i("parallaxBannerView");
            throw null;
        }
        relativeLayout.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) this.l.getValue());
        kbg kbgVar = this.j;
        if (kbgVar != null) {
            kbgVar.onDestroy();
        }
    }

    @Override // defpackage.xbg
    public void onRuntimeInfoChange(@NotNull Map<String, ? extends Object> info) {
        info.getClass();
        Object obj = info.get(PARALLAX_MARGINS);
        agg aggVar = obj instanceof agg ? (agg) obj : null;
        if (aggVar != null) {
            agg aggVar2 = this.n;
            aggVar2.getClass();
            this.m = new agg(aggVar.a + aggVar2.a, aggVar.b + aggVar2.b, aggVar.c + aggVar2.c, aggVar.d + aggVar2.d);
        }
    }

    public void setAdInfo(@NotNull uag uagVar) {
        uagVar.getClass();
        this.adInfo = uagVar;
    }

    @Override // defpackage.mig
    public void onCustomerFeedbackDialogShow() {
    }

    public SASParallaxBannerAdapter() {
        this(null, false, null, 7, null);
    }

    public SASParallaxBannerAdapter(obg obgVar, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new u8f(1) : obgVar, (i & 2) != 0 ? true : z, (i & 4) != 0 ? new gfg(3) : function1);
    }
}
