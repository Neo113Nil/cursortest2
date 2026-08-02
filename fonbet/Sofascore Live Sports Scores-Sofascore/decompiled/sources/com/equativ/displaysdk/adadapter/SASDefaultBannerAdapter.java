package com.equativ.displaysdk.adadapter;

import android.content.Context;
import android.view.View;
import defpackage.a70;
import defpackage.gdg;
import defpackage.hdg;
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
import defpackage.oea;
import defpackage.pgg;
import defpackage.qcg;
import defpackage.rq3;
import defpackage.u8f;
import defpackage.uag;
import defpackage.ucg;
import defpackage.vbg;
import defpackage.wbg;
import defpackage.xag;
import defpackage.xbg;
import defpackage.y6a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JJ\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J#\u0010&\u001a\u00020\u00162\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"H\u0016¢\u0006\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/equativ/displaysdk/adadapter/SASDefaultBannerAdapter;", "Lxbg;", "Lobg;", "rendererSelector", "", "isCreativeFeedbackButtonDisplayed", "<init>", "(Lobg;Z)V", "Landroid/content/Context;", "context", "Ljag;", "ad", "Lpgg;", "remoteLoggerManager", "Lmjg;", "openMeasurementManager", "Lnig;", "customerFeedbackController", "Lqcg;", "contextInfo", "Llag;", "adAdapterCustomizationFactories", "", "loadAd", "(Landroid/content/Context;Ljag;Lpgg;Lmjg;Lnig;Lqcg;Llag;Lrq3;)Ljava/lang/Object;", "Lxag;", "adLifecycleController", "onAdLifecycleConfigured", "(Lxag;)V", "onDestroy", "()V", "Landroid/view/View;", "getBannerView", "()Landroid/view/View;", "", "", "", "info", "onRuntimeInfoChange", "(Ljava/util/Map;)V", "Luag;", "adInfo", "Luag;", "getAdInfo", "()Luag;", "setAdInfo", "(Luag;)V", "smart-display-sdk_prodRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SASDefaultBannerAdapter implements xbg {
    public final obg a;
    public uag adInfo;
    public final boolean b;
    public View c;
    public kbg d;

    public SASDefaultBannerAdapter(obg obgVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new u8f(1) : obgVar, (i & 2) != 0 ? true : z);
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
        View view = this.c;
        if (view != null) {
            return view;
        }
        throw new hdg(gdg.d, "No ad is currently rendered for the selected adapter, this should not happen");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // defpackage.kag
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadAd(@NotNull Context context, @NotNull jag jagVar, @NotNull pgg pggVar, @NotNull mjg mjgVar, @NotNull nig nigVar, @NotNull qcg qcgVar, @Nullable lag lagVar, @NotNull rq3<? super Unit> rq3Var) {
        ucg ucgVar;
        int i;
        nbg nbgVar;
        kbg p;
        SASDefaultBannerAdapter sASDefaultBannerAdapter;
        SASDefaultBannerAdapter sASDefaultBannerAdapter2 = this;
        if (rq3Var instanceof ucg) {
            ucgVar = (ucg) rq3Var;
            int i2 = ucgVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ucgVar.w = i2 - Integer.MIN_VALUE;
                ucg ucgVar2 = ucgVar;
                Object obj = ucgVar2.u;
                lu3 lu3Var = lu3.a;
                i = ucgVar2.w;
                if (i != 0) {
                    y6a.M(obj);
                    wbg k = oea.k(jagVar);
                    String str = jagVar.l;
                    Boolean bool = jagVar.F;
                    sASDefaultBannerAdapter2.setAdInfo(kda.v(jagVar, null));
                    vbg vbgVar = k.a;
                    vbg vbgVar2 = vbg.c;
                    boolean z = sASDefaultBannerAdapter2.b;
                    if (vbgVar == vbgVar2) {
                        nbgVar = new nbg(mcg.INLINE, str != null, 0, 0, false, false, true, false, true, true, mbg.c, z ? lbg.b : lbg.a, 268);
                    } else {
                        mcg mcgVar = mcg.INLINE;
                        boolean z2 = str != null;
                        Boolean bool2 = Boolean.TRUE;
                        nbgVar = new nbg(mcgVar, z2, 0, 0, !Intrinsics.c(bool, bool2), !Intrinsics.c(bool, bool2), Intrinsics.c(bool, bool2), false, Intrinsics.c(bool, bool2), Intrinsics.c(bool, bool2), mbg.b, z ? lbg.b : lbg.a, 268);
                    }
                    p = ((u8f) sASDefaultBannerAdapter2.a).p(jagVar, pggVar, mjgVar, nigVar, nbgVar, qcgVar);
                    ucgVar2.r = sASDefaultBannerAdapter2;
                    ucgVar2.s = p;
                    ucgVar2.t = sASDefaultBannerAdapter2;
                    ucgVar2.w = 1;
                    obj = p.d(context, ucgVar2);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    sASDefaultBannerAdapter = sASDefaultBannerAdapter2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sASDefaultBannerAdapter2 = ucgVar2.t;
                    p = (kbg) ucgVar2.s;
                    sASDefaultBannerAdapter = ucgVar2.r;
                    y6a.M(obj);
                }
                sASDefaultBannerAdapter2.c = (View) obj;
                sASDefaultBannerAdapter.d = p;
                return Unit.a;
            }
        }
        ucgVar = new ucg(sASDefaultBannerAdapter2, rq3Var);
        ucg ucgVar22 = ucgVar;
        Object obj2 = ucgVar22.u;
        lu3 lu3Var2 = lu3.a;
        i = ucgVar22.w;
        if (i != 0) {
        }
        sASDefaultBannerAdapter2.c = (View) obj2;
        sASDefaultBannerAdapter.d = p;
        return Unit.a;
    }

    @Override // defpackage.kag
    public void onAdLifecycleConfigured(@NotNull xag adLifecycleController) {
        adLifecycleController.getClass();
        kbg kbgVar = this.d;
        if (kbgVar != null) {
            kbgVar.onAdLifecycleConfigured(adLifecycleController);
        }
    }

    @Override // defpackage.kag
    public void onDestroy() {
        kbg kbgVar = this.d;
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

    public SASDefaultBannerAdapter(@NotNull obg obgVar, boolean z) {
        obgVar.getClass();
        this.a = obgVar;
        this.b = z;
    }

    public SASDefaultBannerAdapter() {
        this(null, false, 3, null);
    }
}
