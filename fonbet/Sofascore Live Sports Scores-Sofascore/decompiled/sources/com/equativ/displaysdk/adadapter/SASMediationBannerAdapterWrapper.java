package com.equativ.displaysdk.adadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.equativ.displaysdk.mediation.SASMediationBannerAdapter;
import com.mbridge.msdk.foundation.controller.a;
import defpackage.a70;
import defpackage.adg;
import defpackage.bf3;
import defpackage.e6g;
import defpackage.fc6;
import defpackage.g62;
import defpackage.gje;
import defpackage.jag;
import defpackage.kda;
import defpackage.lag;
import defpackage.lu3;
import defpackage.mjg;
import defpackage.ml4;
import defpackage.neg;
import defpackage.nig;
import defpackage.oea;
import defpackage.oeg;
import defpackage.ogg;
import defpackage.peg;
import defpackage.pgg;
import defpackage.qcg;
import defpackage.qeg;
import defpackage.qgg;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.uag;
import defpackage.ueg;
import defpackage.w9g;
import defpackage.wo0;
import defpackage.xag;
import defpackage.xbg;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yag;
import defpackage.z45;
import defpackage.zag;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010%\u001a\u00020\u00172\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u001aH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u001aH\u0016¢\u0006\u0004\b,\u0010+J+\u00101\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u001a2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b1\u00102J!\u00106\u001a\u00020\u00172\b\u00103\u001a\u0004\u0018\u00010\"2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0017H\u0016¢\u0006\u0004\b8\u0010(J\u000f\u00109\u001a\u00020\u0017H\u0016¢\u0006\u0004\b9\u0010(J\u000f\u0010:\u001a\u00020\u0017H\u0016¢\u0006\u0004\b:\u0010(R\"\u0010<\u001a\u00020;8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010H\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/equativ/displaysdk/adadapter/SASMediationBannerAdapterWrapper;", "Lxbg;", "Loeg;", "Landroid/view/View$OnAttachStateChangeListener;", "Lkotlin/Function0;", "Lcom/equativ/displaysdk/mediation/SASMediationBannerAdapter;", "mediationAdapterFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Ljag;", "ad", "Lpgg;", "remoteLoggerManager", "Lmjg;", "openMeasurementManager", "Lnig;", "customerFeedbackController", "Lqcg;", "contextInfo", "Llag;", "adAdapterCustomizationFactories", "", "loadAd", "(Landroid/content/Context;Ljag;Lpgg;Lmjg;Lnig;Lqcg;Llag;Lrq3;)Ljava/lang/Object;", "Landroid/view/View;", "getBannerView", "()Landroid/view/View;", "Lxag;", "adLifecycleController", "onAdLifecycleConfigured", "(Lxag;)V", "", "", "", "info", "onRuntimeInfoChange", "(Ljava/util/Map;)V", "onDestroy", "()V", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "mediatedView", "", "width", "height", "onMediationAdLoaded", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V", "errorMessage", "", "isNoFill", "onMediationAdFailedToLoad", "(Ljava/lang/String;Z)V", "onMediationAdClicked", "onMediationAdExpanded", "onMediationAdCollapsed", "Luag;", "adInfo", "Luag;", "getAdInfo", "()Luag;", "setAdInfo", "(Luag;)V", a.q, "Lcom/equativ/displaysdk/mediation/SASMediationBannerAdapter;", "getMediationBannerAdapter", "()Lcom/equativ/displaysdk/mediation/SASMediationBannerAdapter;", "setMediationBannerAdapter", "(Lcom/equativ/displaysdk/mediation/SASMediationBannerAdapter;)V", "mediationBannerAdapter", "smart-display-sdk_prodRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SASMediationBannerAdapterWrapper implements xbg, oeg, View.OnAttachStateChangeListener {
    public final Function0 a;
    public uag adInfo;
    public neg b;

    /* renamed from: c, reason: from kotlin metadata */
    public SASMediationBannerAdapter mediationBannerAdapter;
    public FrameLayout d;
    public xag e;
    public adg f;
    public final g62 g;

    public SASMediationBannerAdapterWrapper(@Nullable Function0<? extends SASMediationBannerAdapter> function0) {
        this.a = function0;
        this.g = ml4.g(0, 7, null);
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
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.i("rootLayout");
        throw null;
    }

    @Nullable
    public final SASMediationBannerAdapter getMediationBannerAdapter() {
        return this.mediationBannerAdapter;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.kag
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadAd(@NotNull Context context, @NotNull jag jagVar, @NotNull pgg pggVar, @NotNull mjg mjgVar, @NotNull nig nigVar, @NotNull qcg qcgVar, @Nullable lag lagVar, @NotNull rq3<? super Unit> rq3Var) {
        peg pegVar;
        int i;
        SASMediationBannerAdapter sASMediationBannerAdapter;
        Exception exc;
        if (rq3Var instanceof peg) {
            pegVar = (peg) rq3Var;
            int i2 = pegVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pegVar.u = i2 - Integer.MIN_VALUE;
                Object obj = pegVar.s;
                lu3 lu3Var = lu3.a;
                i = pegVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    oea.k(jagVar);
                    String str = jagVar.O;
                    if (str == null) {
                        throw new wo0("Invalid mediation ad: missing mediation adapter class name.");
                    }
                    String str2 = jagVar.R;
                    if (str2 == null) {
                        throw new wo0("Invalid mediation ad: missing server side parameters string.");
                    }
                    this.b = new neg(str, jagVar.P, jagVar.Q, str2);
                    FrameLayout frameLayout = new FrameLayout(context);
                    this.d = frameLayout;
                    frameLayout.addOnAttachStateChangeListener(this);
                    neg negVar = this.b;
                    if (negVar == null) {
                        Intrinsics.i("mediationAd");
                        throw null;
                    }
                    String str3 = negVar.a;
                    Function0 function0 = this.a;
                    if (function0 == null || (sASMediationBannerAdapter = (SASMediationBannerAdapter) function0.invoke()) == null) {
                        String str4 = jagVar.d;
                        try {
                            Class<?> cls = Class.forName(str3);
                            if (!SASMediationBannerAdapter.class.isAssignableFrom(cls)) {
                                throw new qeg("A " + cls + " was received but a subclass of " + SASMediationBannerAdapter.class + " was expected.");
                            }
                            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                            newInstance.getClass();
                            sASMediationBannerAdapter = (SASMediationBannerAdapter) newInstance;
                        } catch (ClassNotFoundException unused) {
                            neg negVar2 = this.b;
                            if (negVar2 != null) {
                                throw new qeg(bf3.k("The ad whose insertion id is ", str4, " wants to use the mediation adapter class '", negVar2.a, "', but this class can not be found. Please be sure your SDK is up-to-date and the Equativ mediation adapters are embedded in your application."));
                            }
                            Intrinsics.i("mediationAd");
                            throw null;
                        }
                    }
                    sASMediationBannerAdapter.setAdapterListener(this);
                    this.mediationBannerAdapter = sASMediationBannerAdapter;
                    ((qgg) pggVar).k(new ogg(sASMediationBannerAdapter.getSdkName(), sASMediationBannerAdapter.getSdkVersion(), sASMediationBannerAdapter.getAdapterVersion(), str3));
                    setAdInfo(kda.v(jagVar, sASMediationBannerAdapter.getSdkName()));
                    neg negVar3 = this.b;
                    if (negVar3 == null) {
                        Intrinsics.i("mediationAd");
                        throw null;
                    }
                    sASMediationBannerAdapter.loadAd(context, negVar3.d, null);
                    pegVar.r = this;
                    pegVar.u = 1;
                    obj = this.g.f(pegVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = pegVar.r;
                    y6a.M(obj);
                }
                exc = (Exception) obj;
                if (exc == null) {
                    throw exc;
                }
                this.g.r(null);
                return Unit.a;
            }
        }
        pegVar = new peg(this, rq3Var);
        Object obj2 = pegVar.s;
        lu3 lu3Var2 = lu3.a;
        i = pegVar.u;
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
        adg adgVar = this.f;
        if (adgVar != null) {
            adgVar.a();
        }
    }

    @Override // defpackage.kag
    public void onDestroy() {
        try {
            this.g.r(null);
        } catch (Exception unused) {
        }
        SASMediationBannerAdapter sASMediationBannerAdapter = this.mediationBannerAdapter;
        if (sASMediationBannerAdapter != null) {
            sASMediationBannerAdapter.onDestroy();
        }
    }

    public void onMediationAdClicked() {
        xag xagVar = this.e;
        if (xagVar != null) {
            zag zagVar = (zag) xagVar;
            xw3.L(zagVar.k, null, null, new yag(zagVar, null, 3), 3);
        }
    }

    public void onMediationAdCollapsed() {
        xag xagVar = this.e;
        if (xagVar != null) {
            ((zag) xagVar).d();
        }
    }

    public void onMediationAdExpanded() {
        xag xagVar = this.e;
        if (xagVar != null) {
            ((zag) xagVar).e();
        }
    }

    public void onMediationAdFailedToLoad(@Nullable String errorMessage, boolean isNoFill) {
        Object qegVar;
        rq3 rq3Var = null;
        if (isNoFill) {
            neg negVar = this.b;
            if (negVar == null) {
                Intrinsics.i("mediationAd");
                throw null;
            }
            qegVar = new ueg(fc6.n("Mediation SDK named \"", negVar.c, "\" failed to load due to NoFill: ", errorMessage));
        } else {
            neg negVar2 = this.b;
            if (negVar2 == null) {
                Intrinsics.i("mediationAd");
                throw null;
            }
            qegVar = new qeg(fc6.n("Mediation SDK named \"", negVar2.c, "\" failed to load: ", errorMessage));
        }
        xw3.L(s9a.c(z45.a), null, null, new gje(this, qegVar, rq3Var, 24), 3);
    }

    public void onMediationAdLoaded(@NotNull View mediatedView, @Nullable Integer width, @Nullable Integer height) {
        mediatedView.getClass();
        FrameLayout frameLayout = this.d;
        rq3 rq3Var = null;
        if (frameLayout == null) {
            Intrinsics.i("rootLayout");
            throw null;
        }
        frameLayout.addView(mediatedView, new ViewGroup.LayoutParams(-1, -1));
        if (width != null && width.intValue() > 0 && height != null && height.intValue() > 0) {
            double intValue = width.intValue() / height.intValue();
            uag adInfo = getAdInfo();
            setAdInfo(new uag(adInfo.a, Double.valueOf(intValue), adInfo.c, adInfo.d, adInfo.e, adInfo.f));
        }
        xw3.L(s9a.c(z45.a), null, null, new w9g(this, rq3Var, 2), 3);
    }

    @Override // defpackage.xbg
    public void onRuntimeInfoChange(@NotNull Map<String, ? extends Object> info) {
        info.getClass();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View v) {
        v.getClass();
        adg adgVar = new adg(new e6g(this, 1));
        adgVar.a();
        this.f = adgVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View v) {
        v.getClass();
    }

    public void setAdInfo(@NotNull uag uagVar) {
        uagVar.getClass();
        this.adInfo = uagVar;
    }

    public final void setMediationBannerAdapter(@Nullable SASMediationBannerAdapter sASMediationBannerAdapter) {
        this.mediationBannerAdapter = sASMediationBannerAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SASMediationBannerAdapterWrapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SASMediationBannerAdapterWrapper(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }
}
