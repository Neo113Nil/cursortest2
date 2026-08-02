package com.equativ.displaysdk.adadapter;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.equativ.displaysdk.adadapter.SASMediationInterstitialAdapterWrapper;
import com.equativ.displaysdk.mediation.SASMediationInterstitialAdapter;
import com.ironsource.Wf;
import com.mbridge.msdk.setting.i;
import defpackage.a70;
import defpackage.adg;
import defpackage.beg;
import defpackage.bf3;
import defpackage.blg;
import defpackage.fc6;
import defpackage.g62;
import defpackage.gdg;
import defpackage.gje;
import defpackage.hdg;
import defpackage.jag;
import defpackage.kda;
import defpackage.lag;
import defpackage.lu3;
import defpackage.mjg;
import defpackage.ml4;
import defpackage.neg;
import defpackage.nig;
import defpackage.ogg;
import defpackage.pea;
import defpackage.pgg;
import defpackage.qcg;
import defpackage.qeg;
import defpackage.qgg;
import defpackage.reg;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sbg;
import defpackage.teg;
import defpackage.uag;
import defpackage.ueg;
import defpackage.vdg;
import defpackage.w9g;
import defpackage.wdg;
import defpackage.wo0;
import defpackage.xag;
import defpackage.xdg;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yag;
import defpackage.z45;
import defpackage.zag;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJJ\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\nJ\u0017\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\nJ\u0017\u0010(\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010&J\u0019\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\nJ!\u00101\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00100\u001a\u00020#H\u0016¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u0010\nJ\u000f\u00106\u001a\u00020\bH\u0016¢\u0006\u0004\b6\u0010\nJ\u000f\u00107\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u0010\nR\"\u00109\u001a\u0002088\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010F\u001a\u0004\u0018\u00010?8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/equativ/displaysdk/adadapter/SASMediationInterstitialAdapterWrapper;", "Lwdg;", "Lreg;", "Lkotlin/Function0;", "Lcom/equativ/displaysdk/mediation/SASMediationInterstitialAdapter;", "mediationAdapterFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "show", "()V", "Lsbg;", "getAdStatus", "()Lsbg;", "Landroid/content/Context;", "context", "Ljag;", "ad", "Lpgg;", "remoteLoggerManager", "Lmjg;", "openMeasurementManager", "Lnig;", "customerFeedbackController", "Lqcg;", "contextInfo", "Llag;", "adAdapterCustomizationFactories", "loadAd", "(Landroid/content/Context;Ljag;Lpgg;Lmjg;Lnig;Lqcg;Llag;Lrq3;)Ljava/lang/Object;", "Lxag;", "adLifecycleController", "onAdLifecycleConfigured", "(Lxag;)V", "onDestroy", "", "animate", "expandAdView", "(Z)V", Wf.f, "closeAdView", "Landroid/view/View;", "placeholderView", "unloadAd", "(Landroid/view/View;)V", "onMediationAdLoaded", "", "errorMessage", "isNoFill", "onMediationAdFailedToLoad", "(Ljava/lang/String;Z)V", "onMediationAdFailedToShow", "(Ljava/lang/String;)V", "onMediationAdClicked", "onMediationAdShown", "onMediationAdDismissed", "Luag;", "adInfo", "Luag;", "getAdInfo", "()Luag;", "setAdInfo", "(Luag;)V", "Lvdg;", i.a, "Lvdg;", "getInterstitialAdapterListener", "()Lvdg;", "setInterstitialAdapterListener", "(Lvdg;)V", "interstitialAdapterListener", "smart-display-sdk_prodRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SASMediationInterstitialAdapterWrapper implements wdg, reg {
    public final Function0 a;
    public uag adInfo;
    public sbg b;
    public SASMediationInterstitialAdapter c;
    public neg d;
    public xag e;
    public adg f;
    public adg g;
    public final g62 h;

    /* renamed from: i, reason: from kotlin metadata */
    public vdg interstitialAdapterListener;
    public pgg j;

    public SASMediationInterstitialAdapterWrapper(@Nullable Function0<? extends SASMediationInterstitialAdapter> function0) {
        this.a = function0;
        this.b = sbg.a;
        this.h = ml4.g(0, 7, null);
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
        return this.b;
    }

    @Nullable
    public vdg getInterstitialAdapterListener() {
        return this.interstitialAdapterListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.kag
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadAd(@NotNull Context context, @NotNull jag jagVar, @NotNull pgg pggVar, @NotNull mjg mjgVar, @NotNull nig nigVar, @NotNull qcg qcgVar, @Nullable lag lagVar, @NotNull rq3<? super Unit> rq3Var) {
        teg tegVar;
        int i;
        SASMediationInterstitialAdapter sASMediationInterstitialAdapter;
        Exception exc;
        if (rq3Var instanceof teg) {
            tegVar = (teg) rq3Var;
            int i2 = tegVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tegVar.u = i2 - Integer.MIN_VALUE;
                Object obj = tegVar.s;
                lu3 lu3Var = lu3.a;
                i = tegVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    pea.s(jagVar);
                    this.b = sbg.b;
                    String str = jagVar.O;
                    if (str == null) {
                        throw new wo0("Invalid mediation ad: missing mediation adapter class name.");
                    }
                    String str2 = jagVar.R;
                    if (str2 == null) {
                        throw new wo0("Invalid mediation ad: missing server side parameters string.");
                    }
                    this.d = new neg(str, jagVar.P, jagVar.Q, str2);
                    Function0 function0 = this.a;
                    if (function0 == null || (sASMediationInterstitialAdapter = (SASMediationInterstitialAdapter) function0.invoke()) == null) {
                        String str3 = jagVar.d;
                        try {
                            Class<?> cls = Class.forName(str);
                            if (!SASMediationInterstitialAdapter.class.isAssignableFrom(cls)) {
                                throw new qeg("A " + cls + " was received but a subclass of " + SASMediationInterstitialAdapter.class + " was expected.");
                            }
                            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                            newInstance.getClass();
                            sASMediationInterstitialAdapter = (SASMediationInterstitialAdapter) newInstance;
                        } catch (ClassNotFoundException unused) {
                            neg negVar = this.d;
                            if (negVar != null) {
                                throw new qeg(bf3.k("The ad whose insertion id is ", str3, " wants to use the mediation adapter class '", negVar.a, "', but this class can not be found. Please be sure your SDK is up-to-date and the Equativ mediation adapters are embedded in your application."));
                            }
                            Intrinsics.i("mediationAd");
                            throw null;
                        }
                    }
                    sASMediationInterstitialAdapter.setAdapterListener(this);
                    this.j = pggVar;
                    ((qgg) pggVar).k(new ogg(sASMediationInterstitialAdapter.getSdkName(), sASMediationInterstitialAdapter.getSdkVersion(), sASMediationInterstitialAdapter.getAdapterVersion(), str));
                    setAdInfo(kda.v(jagVar, sASMediationInterstitialAdapter.getSdkName()));
                    neg negVar2 = this.d;
                    if (negVar2 == null) {
                        Intrinsics.i("mediationAd");
                        throw null;
                    }
                    sASMediationInterstitialAdapter.loadAd(context, negVar2.d, null);
                    this.c = sASMediationInterstitialAdapter;
                    tegVar.r = this;
                    tegVar.u = 1;
                    obj = this.h.f(tegVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = tegVar.r;
                    y6a.M(obj);
                }
                exc = (Exception) obj;
                if (exc == null) {
                    throw exc;
                }
                this.h.r(null);
                this.b = sbg.c;
                return Unit.a;
            }
        }
        tegVar = new teg(this, rq3Var);
        Object obj2 = tegVar.s;
        lu3 lu3Var2 = lu3.a;
        i = tegVar.u;
        if (i != 0) {
        }
        exc = (Exception) obj2;
        if (exc == null) {
        }
    }

    @Override // defpackage.kag
    public void onAdLifecycleConfigured(@NotNull xag adLifecycleController) {
        adLifecycleController.getClass();
        this.e = adLifecycleController;
        zag zagVar = (zag) adLifecycleController;
        zagVar.getClass();
        zagVar.j = this;
        adg adgVar = this.f;
        if (adgVar != null) {
            adgVar.a();
        }
        ((zag) adLifecycleController).l();
        adg adgVar2 = this.g;
        if (adgVar2 != null) {
            adgVar2.a();
        }
    }

    @Override // defpackage.kag
    public void onDestroy() {
        try {
            this.h.r(null);
        } catch (Exception unused) {
        }
        xag xagVar = this.e;
        if (xagVar != null) {
            ((zag) xagVar).m(true);
        }
        this.b = sbg.a;
        SASMediationInterstitialAdapter sASMediationInterstitialAdapter = this.c;
        if (sASMediationInterstitialAdapter != null) {
            sASMediationInterstitialAdapter.onDestroy();
        }
    }

    public void onMediationAdClicked() {
        if (this.b == sbg.d) {
            xag xagVar = this.e;
            if (xagVar != null) {
                zag zagVar = (zag) xagVar;
                xw3.L(zagVar.k, null, null, new yag(zagVar, null, 3), 3);
            }
            vdg interstitialAdapterListener = getInterstitialAdapterListener();
            if (interstitialAdapterListener != null) {
                beg begVar = (beg) interstitialAdapterListener;
                begVar.g.post(new xdg(begVar, 0));
            }
        }
    }

    public void onMediationAdDismissed() {
        xag xagVar = this.e;
        if (xagVar != null) {
            ((zag) xagVar).d();
        }
        xag xagVar2 = this.e;
        if (xagVar2 != null) {
            ((zag) xagVar2).j(new blg(false, 0.0d, new Rect()));
        }
        vdg interstitialAdapterListener = getInterstitialAdapterListener();
        if (interstitialAdapterListener != null) {
            beg begVar = (beg) interstitialAdapterListener;
            begVar.g.post(new xdg(begVar, 4));
            wdg wdgVar = begVar.d;
            if (wdgVar != null) {
                wdgVar.onDestroy();
            }
            begVar.d = null;
        }
        this.b = sbg.a;
    }

    public void onMediationAdFailedToLoad(@Nullable String errorMessage, boolean isNoFill) {
        Object qegVar;
        rq3 rq3Var = null;
        if (isNoFill) {
            neg negVar = this.d;
            if (negVar == null) {
                Intrinsics.i("mediationAd");
                throw null;
            }
            qegVar = new ueg(fc6.n("Mediation SDK named \"", negVar.c, "\" failed to load due to NoFill: ", errorMessage));
        } else {
            neg negVar2 = this.d;
            if (negVar2 == null) {
                Intrinsics.i("mediationAd");
                throw null;
            }
            qegVar = new qeg(fc6.n("Mediation SDK named \"", negVar2.c, "\" failed to load: ", errorMessage));
        }
        xw3.L(s9a.c(z45.a), null, null, new gje(this, qegVar, rq3Var, 25), 3);
    }

    public void onMediationAdFailedToShow(@Nullable String errorMessage) {
        vdg interstitialAdapterListener = getInterstitialAdapterListener();
        if (interstitialAdapterListener != null) {
            ((beg) interstitialAdapterListener).c(new hdg(gdg.h, errorMessage));
        }
    }

    public void onMediationAdLoaded() {
        xw3.L(s9a.c(z45.a), null, null, new w9g(this, null, 3), 3);
    }

    public void onMediationAdShown() {
        if (this.b == sbg.c) {
            this.b = sbg.d;
            xag xagVar = this.e;
            if (xagVar != null) {
                ((zag) xagVar).e();
            }
            pgg pggVar = this.j;
            if (pggVar != null) {
                ((qgg) pggVar).g();
            }
            final int i = 0;
            adg adgVar = new adg(new Function0(this) { // from class: seg
                public final /* synthetic */ SASMediationInterstitialAdapterWrapper b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = i;
                    boolean z = false;
                    SASMediationInterstitialAdapterWrapper sASMediationInterstitialAdapterWrapper = this.b;
                    switch (i2) {
                        case 0:
                            xag xagVar2 = sASMediationInterstitialAdapterWrapper.e;
                            if (xagVar2 != null) {
                                ((zag) xagVar2).h();
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        default:
                            xag xagVar3 = sASMediationInterstitialAdapterWrapper.e;
                            if (xagVar3 != null) {
                                ((zag) xagVar3).j(new blg(true, 1.0d, new Rect()));
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            });
            adgVar.a();
            this.f = adgVar;
            final int i2 = 1;
            adg adgVar2 = new adg(new Function0(this) { // from class: seg
                public final /* synthetic */ SASMediationInterstitialAdapterWrapper b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i2;
                    boolean z = false;
                    SASMediationInterstitialAdapterWrapper sASMediationInterstitialAdapterWrapper = this.b;
                    switch (i22) {
                        case 0:
                            xag xagVar2 = sASMediationInterstitialAdapterWrapper.e;
                            if (xagVar2 != null) {
                                ((zag) xagVar2).h();
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        default:
                            xag xagVar3 = sASMediationInterstitialAdapterWrapper.e;
                            if (xagVar3 != null) {
                                ((zag) xagVar3).j(new blg(true, 1.0d, new Rect()));
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            });
            adgVar2.a();
            this.g = adgVar2;
            vdg interstitialAdapterListener = getInterstitialAdapterListener();
            if (interstitialAdapterListener != null) {
                beg begVar = (beg) interstitialAdapterListener;
                begVar.g.post(new xdg(begVar, 5));
            }
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
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            throw new hdg(gdg.h, "No interstitial ad loaded");
        }
        if (ordinal == 1) {
            throw new hdg(gdg.h, "An interstitial ad is currently being loaded");
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                throw new hdg(gdg.h, "An interstitial ad is already being shown");
            }
            zzl.b();
        } else {
            SASMediationInterstitialAdapter sASMediationInterstitialAdapter = this.c;
            if (sASMediationInterstitialAdapter != null) {
                sASMediationInterstitialAdapter.show();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SASMediationInterstitialAdapterWrapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.tbg
    public void onAdClicked() {
    }

    public /* synthetic */ SASMediationInterstitialAdapterWrapper(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }

    @Override // defpackage.tbg
    public void closeAdView(boolean animate) {
    }

    @Override // defpackage.tbg
    public void expandAdView(boolean animate) {
    }

    @Override // defpackage.tbg
    public void unloadAd(@Nullable View placeholderView) {
    }
}
