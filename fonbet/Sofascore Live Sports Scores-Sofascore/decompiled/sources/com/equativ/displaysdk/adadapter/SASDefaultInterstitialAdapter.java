package com.equativ.displaysdk.adadapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.equativ.displaysdk.ad.interstitial.SASInterstitialActivity;
import com.ironsource.Wf;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.a70;
import defpackage.beg;
import defpackage.ceg;
import defpackage.ct8;
import defpackage.deg;
import defpackage.eee;
import defpackage.eeg;
import defpackage.feg;
import defpackage.gdg;
import defpackage.hdg;
import defpackage.hs4;
import defpackage.jag;
import defpackage.kbg;
import defpackage.kda;
import defpackage.lag;
import defpackage.lbg;
import defpackage.lu3;
import defpackage.mbg;
import defpackage.mcg;
import defpackage.mjg;
import defpackage.nbg;
import defpackage.nig;
import defpackage.obg;
import defpackage.pea;
import defpackage.pgg;
import defpackage.qcg;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sbg;
import defpackage.u8f;
import defpackage.uag;
import defpackage.udg;
import defpackage.vcg;
import defpackage.vdg;
import defpackage.wcg;
import defpackage.wdg;
import defpackage.xag;
import defpackage.xcg;
import defpackage.xdg;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import defpackage.zag;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006\u0012 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010%J\u0017\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010%J\u0017\u0010.\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010,J\u0019\u00100\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b0\u00101R$\u00109\u001a\u0004\u0018\u0001028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010;\u001a\u00020:8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lcom/equativ/displaysdk/adadapter/SASDefaultInterstitialAdapter;", "Lwdg;", "Lobg;", "rendererSelector", "", "isCreativeFeedbackButtonDisplayed", "Lkotlin/Function2;", "Landroid/content/Intent;", "Landroid/content/Context;", "", "startActivityLambda", "Lkotlin/Function3;", "Landroid/view/View;", "Lfeg;", "interstitialViewHolderFactory", "<init>", "(Lobg;ZLkotlin/jvm/functions/Function2;Lct8;)V", "context", "Ljag;", "ad", "Lpgg;", "remoteLoggerManager", "Lmjg;", "openMeasurementManager", "Lnig;", "customerFeedbackController", "Lqcg;", "contextInfo", "Llag;", "adAdapterCustomizationFactories", "loadAd", "(Landroid/content/Context;Ljag;Lpgg;Lmjg;Lnig;Lqcg;Llag;Lrq3;)Ljava/lang/Object;", "Lxag;", "adLifecycleController", "onAdLifecycleConfigured", "(Lxag;)V", "show", "()V", "Lsbg;", "getAdStatus", "()Lsbg;", "onDestroy", "animate", "expandAdView", "(Z)V", Wf.f, "closeAdView", "placeholderView", "unloadAd", "(Landroid/view/View;)V", "Lvdg;", CampaignEx.JSON_KEY_AD_K, "Lvdg;", "getInterstitialAdapterListener", "()Lvdg;", "setInterstitialAdapterListener", "(Lvdg;)V", "interstitialAdapterListener", "Luag;", "adInfo", "Luag;", "getAdInfo", "()Luag;", "setAdInfo", "(Luag;)V", "smart-display-sdk_prodRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SASDefaultInterstitialAdapter implements wdg {
    public final obg a;
    public uag adInfo;
    public final boolean b;
    public final Function2 c;
    public final ct8 d;
    public Context e;
    public feg f;
    public kbg g;
    public sbg h;
    public boolean i;
    public pgg j;

    /* renamed from: k, reason: from kotlin metadata */
    public vdg interstitialAdapterListener;

    public SASDefaultInterstitialAdapter(obg obgVar, boolean z, Function2 function2, ct8 ct8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new u8f(1) : obgVar, (i & 2) != 0 ? true : z, (i & 4) != 0 ? new eee((byte) 0, 23) : function2, (i & 8) != 0 ? new vcg(0) : ct8Var);
    }

    @Override // defpackage.tbg
    public void closeAdView(boolean animate) {
        feg fegVar = this.f;
        if (fegVar != null) {
            deg degVar = (deg) fegVar;
            hs4 hs4Var = z45.a;
            xw3.L(s9a.c(rob.a), null, null, new ceg(degVar, null, 1), 3);
            eeg interstitialViewHolderListener = degVar.getInterstitialViewHolderListener();
            if (interstitialViewHolderListener != null) {
                ((SASInterstitialActivity) interstitialViewHolderListener).finish();
            }
        }
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

    @Override // defpackage.wdg
    @NotNull
    /* renamed from: getAdStatus, reason: from getter */
    public sbg getH() {
        return this.h;
    }

    @Nullable
    public vdg getInterstitialAdapterListener() {
        return this.interstitialAdapterListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // defpackage.kag
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadAd(@NotNull Context context, @NotNull jag jagVar, @NotNull pgg pggVar, @NotNull mjg mjgVar, @NotNull nig nigVar, @NotNull qcg qcgVar, @Nullable lag lagVar, @NotNull rq3<? super Unit> rq3Var) {
        wcg wcgVar;
        int i;
        kbg p;
        ct8 ct8Var;
        Object d;
        SASDefaultInterstitialAdapter sASDefaultInterstitialAdapter;
        SASDefaultInterstitialAdapter sASDefaultInterstitialAdapter2 = this;
        Context context2 = context;
        if (rq3Var instanceof wcg) {
            wcgVar = (wcg) rq3Var;
            int i2 = wcgVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wcgVar.y = i2 - Integer.MIN_VALUE;
                wcg wcgVar2 = wcgVar;
                Object obj = wcgVar2.w;
                lu3 lu3Var = lu3.a;
                i = wcgVar2.y;
                if (i != 0) {
                    y6a.M(obj);
                    sASDefaultInterstitialAdapter2.e = context2;
                    sASDefaultInterstitialAdapter2.j = pggVar;
                    udg s = pea.s(jagVar);
                    sASDefaultInterstitialAdapter2.setAdInfo(kda.v(jagVar, null));
                    sASDefaultInterstitialAdapter2.i = s.b;
                    sASDefaultInterstitialAdapter2.h = sbg.b;
                    p = ((u8f) sASDefaultInterstitialAdapter2.a).p(jagVar, pggVar, mjgVar, nigVar, new nbg(mcg.INTERSTITIAL, jagVar.l != null, s.c, s.a, false, false, true, s.d, false, false, s.e ? mbg.c : mbg.a, sASDefaultInterstitialAdapter2.b ? lbg.c : lbg.a, 1584), qcgVar);
                    wcgVar2.r = sASDefaultInterstitialAdapter2;
                    wcgVar2.s = p;
                    wcgVar2.t = sASDefaultInterstitialAdapter2;
                    ct8Var = sASDefaultInterstitialAdapter2.d;
                    wcgVar2.u = ct8Var;
                    wcgVar2.v = context2;
                    wcgVar2.y = 1;
                    d = p.d(context2, wcgVar2);
                    if (d == lu3Var) {
                        return lu3Var;
                    }
                    sASDefaultInterstitialAdapter = sASDefaultInterstitialAdapter2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Context context3 = wcgVar2.v;
                    ct8 ct8Var2 = wcgVar2.u;
                    SASDefaultInterstitialAdapter sASDefaultInterstitialAdapter3 = wcgVar2.t;
                    p = (kbg) wcgVar2.s;
                    sASDefaultInterstitialAdapter = wcgVar2.r;
                    y6a.M(obj);
                    context2 = context3;
                    sASDefaultInterstitialAdapter2 = sASDefaultInterstitialAdapter3;
                    d = obj;
                    ct8Var = ct8Var2;
                }
                sASDefaultInterstitialAdapter2.f = (feg) ct8Var.invoke(context2, d, Boolean.valueOf(sASDefaultInterstitialAdapter.i));
                sASDefaultInterstitialAdapter.g = p;
                sASDefaultInterstitialAdapter.h = sbg.c;
                return Unit.a;
            }
        }
        wcgVar = new wcg(sASDefaultInterstitialAdapter2, rq3Var);
        wcg wcgVar22 = wcgVar;
        Object obj2 = wcgVar22.w;
        lu3 lu3Var2 = lu3.a;
        i = wcgVar22.y;
        if (i != 0) {
        }
        sASDefaultInterstitialAdapter2.f = (feg) ct8Var.invoke(context2, d, Boolean.valueOf(sASDefaultInterstitialAdapter.i));
        sASDefaultInterstitialAdapter.g = p;
        sASDefaultInterstitialAdapter.h = sbg.c;
        return Unit.a;
    }

    @Override // defpackage.tbg
    public void onAdClicked() {
        vdg interstitialAdapterListener = getInterstitialAdapterListener();
        if (interstitialAdapterListener != null) {
            beg begVar = (beg) interstitialAdapterListener;
            begVar.g.post(new xdg(begVar, 0));
        }
        feg fegVar = this.f;
        if (fegVar != null) {
            ((deg) fegVar).setAdWasClicked(true);
        }
    }

    @Override // defpackage.kag
    public void onAdLifecycleConfigured(@NotNull xag adLifecycleController) {
        adLifecycleController.getClass();
        zag zagVar = (zag) adLifecycleController;
        zagVar.j = this;
        zagVar.v.add(new xcg(this));
        kbg kbgVar = this.g;
        if (kbgVar != null) {
            kbgVar.onAdLifecycleConfigured(adLifecycleController);
        }
        feg fegVar = this.f;
        if (fegVar != null) {
            deg degVar = (deg) fegVar;
            degVar.g = adLifecycleController;
            zagVar.f(degVar.getContext().getResources().getConfiguration().orientation);
        }
    }

    @Override // defpackage.kag
    public void onDestroy() {
        setInterstitialAdapterListener(null);
        kbg kbgVar = this.g;
        if (kbgVar != null) {
            kbgVar.onDestroy();
        }
    }

    public void setAdInfo(@NotNull uag uagVar) {
        uagVar.getClass();
        this.adInfo = uagVar;
    }

    @Override // defpackage.wdg
    public void setInterstitialAdapterListener(@Nullable vdg vdgVar) {
        this.interstitialAdapterListener = vdgVar;
    }

    @Override // defpackage.wdg
    public void show() {
        Unit unit;
        if (this.h == sbg.d) {
            throw new hdg(gdg.h, "An interstitial ad is already being shown.");
        }
        feg fegVar = this.f;
        if (fegVar != null) {
            Context context = this.e;
            if (context != null) {
                int identityHashCode = System.identityHashCode(this);
                SASInterstitialActivity.j.put(Integer.valueOf(identityHashCode), fegVar);
                Intent intent = new Intent(context, (Class<?>) SASInterstitialActivity.class);
                intent.putExtra("InterstitialViewId", identityHashCode);
                intent.setFlags(268435456);
                this.c.invoke(intent, context);
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        throw new hdg(gdg.f, null);
    }

    @Override // defpackage.tbg
    public void unloadAd(@Nullable View placeholderView) {
        closeAdView(false);
    }

    @Override // defpackage.tbg
    public void expandAdView(boolean animate) {
    }

    public SASDefaultInterstitialAdapter(@NotNull obg obgVar, boolean z, @NotNull Function2<? super Intent, ? super Context, Unit> function2, @NotNull ct8 ct8Var) {
        obgVar.getClass();
        function2.getClass();
        ct8Var.getClass();
        this.a = obgVar;
        this.b = z;
        this.c = function2;
        this.d = ct8Var;
        this.h = sbg.a;
    }

    public SASDefaultInterstitialAdapter() {
        this(null, false, null, null, 15, null);
    }
}
