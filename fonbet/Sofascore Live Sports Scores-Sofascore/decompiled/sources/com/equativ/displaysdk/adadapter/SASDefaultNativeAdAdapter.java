package com.equativ.displaysdk.adadapter;

import android.content.Context;
import android.view.View;
import defpackage.a70;
import defpackage.afg;
import defpackage.eee;
import defpackage.efg;
import defpackage.gt8;
import defpackage.jag;
import defpackage.kag;
import defpackage.kbg;
import defpackage.kda;
import defpackage.lag;
import defpackage.lu3;
import defpackage.mjg;
import defpackage.nig;
import defpackage.pgg;
import defpackage.pvd;
import defpackage.qcg;
import defpackage.rag;
import defpackage.rq3;
import defpackage.uag;
import defpackage.xag;
import defpackage.xbg;
import defpackage.y6a;
import defpackage.ycg;
import defpackage.zcg;
import defpackage.zeg;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012:\b\u0002\u0010\f\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0004\b\u0010\u0010\u0011JJ\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J#\u0010+\u001a\u00020\u001c2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010(H\u0016¢\u0006\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020%8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u0010'\"\u0004\b7\u00108R\"\u00109\u001a\u00020\u00048\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lcom/equativ/displaysdk/adadapter/SASDefaultNativeAdAdapter;", "", "Lxbg;", "Lkotlin/Function6;", "Lafg;", "Lefg;", "Lpgg;", "Lmjg;", "Lnig;", "", "Llkg;", "Lkbg;", "rendererFactory", "Lkotlin/Function2;", "Landroid/content/Context;", "defaultViewBinderHandler", "<init>", "(Lgt8;Lkotlin/jvm/functions/Function2;)V", "context", "Ljag;", "ad", "remoteLoggerManager", "openMeasurementManager", "customerFeedbackController", "Lqcg;", "contextInfo", "Llag;", "adAdapterCustomizationFactories", "", "loadAd", "(Landroid/content/Context;Ljag;Lpgg;Lmjg;Lnig;Lqcg;Llag;Lrq3;)Ljava/lang/Object;", "Lxag;", "adLifecycleController", "onAdLifecycleConfigured", "(Lxag;)V", "onDestroy", "()V", "Landroid/view/View;", "getBannerView", "()Landroid/view/View;", "", "", "info", "onRuntimeInfoChange", "(Ljava/util/Map;)V", "Luag;", "adInfo", "Luag;", "getAdInfo", "()Luag;", "setAdInfo", "(Luag;)V", "nativeAdView", "Landroid/view/View;", "getNativeAdView", "setNativeAdView", "(Landroid/view/View;)V", "nativeAdAssets", "Lafg;", "getNativeAdAssets", "()Lafg;", "setNativeAdAssets", "(Lafg;)V", "smart-display-sdk_prodRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SASDefaultNativeAdAdapter implements kag, xbg {
    public final gt8 a;
    public uag adInfo;
    public final Function2 b;
    public kbg c;
    public afg nativeAdAssets;
    public View nativeAdView;

    public /* synthetic */ SASDefaultNativeAdAdapter(gt8 gt8Var, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ycg() : gt8Var, (i & 2) != 0 ? new eee((byte) 0, 24) : function2);
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
        return getNativeAdView();
    }

    @NotNull
    public afg getNativeAdAssets() {
        afg afgVar = this.nativeAdAssets;
        if (afgVar != null) {
            return afgVar;
        }
        Intrinsics.i("nativeAdAssets");
        throw null;
    }

    @NotNull
    public View getNativeAdView() {
        View view = this.nativeAdView;
        if (view != null) {
            return view;
        }
        Intrinsics.i("nativeAdView");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.kag
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadAd(@NotNull Context context, @NotNull jag jagVar, @NotNull pgg pggVar, @NotNull mjg mjgVar, @NotNull nig nigVar, @NotNull qcg qcgVar, @Nullable lag lagVar, @NotNull rq3<? super Unit> rq3Var) {
        zcg zcgVar;
        int i;
        Object invoke;
        SASDefaultNativeAdAdapter sASDefaultNativeAdAdapter;
        SASDefaultNativeAdAdapter sASDefaultNativeAdAdapter2 = this;
        if (rq3Var instanceof zcg) {
            zcgVar = (zcg) rq3Var;
            int i2 = zcgVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zcgVar.w = i2 - Integer.MIN_VALUE;
                Object obj = zcgVar.u;
                lu3 lu3Var = lu3.a;
                i = zcgVar.w;
                if (i != 0) {
                    y6a.M(obj);
                    jagVar.getClass();
                    rag ragVar = jagVar.b;
                    rag ragVar2 = rag.NATIVE_AD;
                    if (ragVar != ragVar2) {
                        pvd.n(ragVar2, ragVar);
                        return null;
                    }
                    String str = jagVar.T;
                    String str2 = jagVar.U;
                    String str3 = jagVar.V;
                    String str4 = jagVar.W;
                    Double d = jagVar.X;
                    String str5 = jagVar.Y;
                    Integer num = jagVar.Z;
                    Integer num2 = jagVar.a0;
                    String str6 = jagVar.b0;
                    Integer num3 = jagVar.c0;
                    Integer num4 = jagVar.d0;
                    List list = jagVar.z;
                    sASDefaultNativeAdAdapter2.setAdInfo(kda.v(jagVar, null));
                    sASDefaultNativeAdAdapter2.setNativeAdAssets(new afg(str, str2, str3, str4, d, str5 != null ? new zeg(num, num2, str5) : null, str6 != null ? new zeg(num3, num4, str6) : null));
                    invoke = sASDefaultNativeAdAdapter2.a.invoke(sASDefaultNativeAdAdapter2.getNativeAdAssets(), (efg) sASDefaultNativeAdAdapter2.b.invoke(context, sASDefaultNativeAdAdapter2.getNativeAdAssets()), pggVar, mjgVar, nigVar, list);
                    zcgVar.r = invoke;
                    zcgVar.s = sASDefaultNativeAdAdapter2;
                    zcgVar.t = sASDefaultNativeAdAdapter2;
                    zcgVar.w = 1;
                    obj = ((kbg) invoke).d(context, zcgVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    sASDefaultNativeAdAdapter = sASDefaultNativeAdAdapter2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SASDefaultNativeAdAdapter sASDefaultNativeAdAdapter3 = zcgVar.t;
                    SASDefaultNativeAdAdapter sASDefaultNativeAdAdapter4 = zcgVar.s;
                    invoke = zcgVar.r;
                    y6a.M(obj);
                    sASDefaultNativeAdAdapter = sASDefaultNativeAdAdapter3;
                    sASDefaultNativeAdAdapter2 = sASDefaultNativeAdAdapter4;
                }
                sASDefaultNativeAdAdapter2.setNativeAdView((View) obj);
                sASDefaultNativeAdAdapter.c = (kbg) invoke;
                return Unit.a;
            }
        }
        zcgVar = new zcg(sASDefaultNativeAdAdapter2, rq3Var);
        Object obj2 = zcgVar.u;
        lu3 lu3Var2 = lu3.a;
        i = zcgVar.w;
        if (i != 0) {
        }
        sASDefaultNativeAdAdapter2.setNativeAdView((View) obj2);
        sASDefaultNativeAdAdapter.c = (kbg) invoke;
        return Unit.a;
    }

    @Override // defpackage.kag
    public void onAdLifecycleConfigured(@NotNull xag adLifecycleController) {
        adLifecycleController.getClass();
        kbg kbgVar = this.c;
        if (kbgVar != null) {
            kbgVar.onAdLifecycleConfigured(adLifecycleController);
        }
    }

    @Override // defpackage.kag
    public void onDestroy() {
        kbg kbgVar = this.c;
        if (kbgVar != null) {
            kbgVar.onDestroy();
        }
    }

    @Override // defpackage.xbg
    public void onRuntimeInfoChange(@NotNull Map<String, ? extends Object> info) {
        info.getClass();
    }

    public void setAdInfo(@NotNull uag uagVar) {
        uagVar.getClass();
        this.adInfo = uagVar;
    }

    public void setNativeAdAssets(@NotNull afg afgVar) {
        afgVar.getClass();
        this.nativeAdAssets = afgVar;
    }

    public void setNativeAdView(@NotNull View view) {
        view.getClass();
        this.nativeAdView = view;
    }

    public SASDefaultNativeAdAdapter(@NotNull gt8 gt8Var, @NotNull Function2<? super Context, ? super afg, efg> function2) {
        gt8Var.getClass();
        function2.getClass();
        this.a = gt8Var;
        this.b = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SASDefaultNativeAdAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
