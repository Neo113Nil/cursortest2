package com.vk.clips.sdk.shared.item.market_ads;

import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemAction;
import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemPatch;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.aot;
import xsna.ap00;
import xsna.b5h;
import xsna.blk;
import xsna.bp00;
import xsna.cle;
import xsna.cp00;
import xsna.dp00;
import xsna.dr00;
import xsna.f4z;
import xsna.hr00;
import xsna.ir00;
import xsna.izs;
import xsna.j5g;
import xsna.jeq0;
import xsna.lp00;
import xsna.m1m;
import xsna.mj50;
import xsna.n34;
import xsna.ojh0;
import xsna.p4g;
import xsna.pq00;
import xsna.s3q0;
import xsna.su;
import xsna.ugm;
import xsna.uo00;
import xsna.wk50;
import xsna.wp00;
import xsna.xp00;
import xsna.yof;
import xsna.yt0;
import xsna.zt0;

/* compiled from: MarketAdsItemFeature.kt */
/* loaded from: classes17.dex */
public final class a extends wk50<dr00, pq00, MarketAdsItemAction, MarketAdsItemPatch> {
    public final izs<yt0, s3q0> f;
    public final yof g;
    public io.reactivex.rxjava3.disposables.c h;
    public final f4z i;
    public final f4z j;
    public final mj50<pq00, MarketAdsItemAction, MarketAdsItemPatch> k;
    public final mj50<pq00, MarketAdsItemAction, MarketAdsItemPatch> l;
    public final mj50<pq00, MarketAdsItemAction, MarketAdsItemPatch> m;

    /* compiled from: MarketAdsItemFeature.kt */
    /* renamed from: com.vk.clips.sdk.shared.item.market_ads.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0682a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketAdsItemAction.HandleItemViewFocusChanged.values().length];
            try {
                iArr[MarketAdsItemAction.HandleItemViewFocusChanged.FOCUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketAdsItemAction.HandleItemViewFocusChanged.UNFOCUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(c cVar, ojh0 ojh0Var, su suVar, ir00 ir00Var, ugm ugmVar, yof yofVar) {
        super(null, cVar);
        this.f = ugmVar;
        this.g = yofVar;
        this.h = EmptyDisposable.INSTANCE;
        f4z f4zVar = new f4z();
        this.i = f4zVar;
        f4z f4zVar2 = new f4z();
        this.j = f4zVar2;
        this.k = O(new uo00(ojh0Var, suVar, ir00Var));
        this.l = O(new m1m(f4zVar, ugmVar));
        this.m = O(new aot(f4zVar2));
    }

    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.wk50
    public final void N(pq00 pq00Var, MarketAdsItemAction marketAdsItemAction) {
        cle cleVar;
        String str;
        String str2;
        pq00 pq00Var2 = pq00Var;
        MarketAdsItemAction marketAdsItemAction2 = marketAdsItemAction;
        if (marketAdsItemAction2 instanceof MarketAdsItemAction.a) {
            this.k.a(pq00Var2, marketAdsItemAction2);
            return;
        }
        if (marketAdsItemAction2 instanceof MarketAdsItemAction.b) {
            this.l.a(pq00Var2, marketAdsItemAction2);
            return;
        }
        if (marketAdsItemAction2 instanceof MarketAdsItemAction.c) {
            this.m.a(pq00Var2, marketAdsItemAction2);
            return;
        }
        if (marketAdsItemAction2 instanceof MarketAdsItemAction.g) {
            if (pq00Var2 instanceof pq00.a) {
                hr00 hr00Var = ((pq00.a) pq00Var2).b;
                if (hr00Var.c != null) {
                    C(MarketAdsItemAction.d.b);
                    return;
                }
                cle cleVar2 = (cle) j5g.a0(hr00Var.i);
                if (cleVar2 != null && pq00Var2 != null) {
                    pq00.a aVar = (pq00.a) pq00Var2;
                    if (!U(cleVar2, aVar) && (str2 = cleVar2.h) != null) {
                        this.i.b(new xp00.d(str2, cleVar2.m));
                        W(cleVar2, aVar);
                    }
                }
            }
        } else {
            if (!(marketAdsItemAction2 instanceof MarketAdsItemAction.d)) {
                if (marketAdsItemAction2 instanceof dp00) {
                    if (pq00Var2 instanceof pq00.a) {
                        f4z f4zVar = this.i;
                        hr00 hr00Var2 = ((pq00.a) pq00Var2).b;
                        f4zVar.b(new wp00(hr00Var2.g, hr00Var2.b, hr00Var2.h));
                        return;
                    }
                    return;
                }
                if (marketAdsItemAction2 instanceof MarketAdsItemAction.f) {
                    MarketAdsItemAction.f fVar = (MarketAdsItemAction.f) marketAdsItemAction2;
                    if (pq00Var2 instanceof pq00.a) {
                        T(new MarketAdsItemPatch.d(fVar.b));
                        return;
                    }
                    return;
                }
                if (marketAdsItemAction2 instanceof MarketAdsItemAction.HandleItemViewFocusChanged) {
                    MarketAdsItemAction.HandleItemViewFocusChanged handleItemViewFocusChanged = (MarketAdsItemAction.HandleItemViewFocusChanged) marketAdsItemAction2;
                    if (pq00Var2 instanceof pq00.a) {
                        int i = C0682a.$EnumSwitchMapping$0[handleItemViewFocusChanged.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.h.dispose();
                            T(MarketAdsItemPatch.UpdateMarketAdFocused.UNFOCUSED);
                            n34.g = false;
                            return;
                        }
                        pq00.a aVar2 = (pq00.a) pq00Var2;
                        if (!aVar2.d.a) {
                            this.h.dispose();
                            this.h = a7f0.a.f(this, x.k(s3q0.a).f(1500L, TimeUnit.MILLISECONDS), new b5h(this, 26), null, 5);
                        }
                        T(MarketAdsItemPatch.UpdateMarketAdFocused.FOCUSED);
                        izs<yt0, s3q0> izsVar = this.f;
                        hr00 hr00Var3 = aVar2.b;
                        izsVar.invoke(new yt0.j(new zt0(hr00Var3.h, hr00Var3.b.k)));
                        izs<yt0, s3q0> izsVar2 = this.f;
                        hr00 hr00Var4 = aVar2.b;
                        izsVar2.invoke(new yt0.g(new zt0(hr00Var4.h, hr00Var4.b.k)));
                        n34.g = true;
                        return;
                    }
                    return;
                }
                if (marketAdsItemAction2 instanceof ap00) {
                    cle cleVar3 = ((ap00) marketAdsItemAction2).b;
                    if (pq00Var2 instanceof pq00.a) {
                        pq00.a aVar3 = (pq00.a) pq00Var2;
                        if (U(cleVar3, aVar3)) {
                            return;
                        }
                        String str3 = cleVar3.n;
                        if (str3 == null && (str3 = cleVar3.h) == null) {
                            return;
                        }
                        this.i.b(new xp00.d(str3, cleVar3.m));
                        this.f.invoke(new yt0.b(new zt0(aVar3.b.h, cleVar3.o)));
                        return;
                    }
                    return;
                }
                if (marketAdsItemAction2 instanceof bp00) {
                    cle cleVar4 = ((bp00) marketAdsItemAction2).b;
                    if (pq00Var2 instanceof pq00.a) {
                        pq00.a aVar4 = (pq00.a) pq00Var2;
                        if (U(cleVar4, aVar4) || (str = cleVar4.h) == null) {
                            return;
                        }
                        this.i.b(new xp00.d(str, cleVar4.m));
                        W(cleVar4, aVar4);
                        return;
                    }
                    return;
                }
                if (!(marketAdsItemAction2 instanceof cp00)) {
                    if (!(marketAdsItemAction2 instanceof MarketAdsItemAction.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MarketAdsItemAction.e eVar = (MarketAdsItemAction.e) marketAdsItemAction2;
                    if (pq00Var2 instanceof pq00.a) {
                        this.j.b((this.g.z() || ((pq00.a) pq00Var2).g != null) ? new lp00.b(eVar.c, eVar.b, true) : new lp00.b(eVar.c, null, false));
                        return;
                    }
                    return;
                }
                cp00 cp00Var = (cp00) marketAdsItemAction2;
                int i2 = cp00Var.b;
                int i3 = cp00Var.c;
                if (pq00Var2 instanceof pq00.a) {
                    pq00.a aVar5 = (pq00.a) pq00Var2;
                    ArrayList arrayList = aVar5.b.i;
                    List list = (List) j5g.b0(i3, p4g.p((arrayList.size() % 2) + (arrayList.size() / 2), arrayList));
                    if (list == null || (cleVar = (cle) j5g.b0(i2, list)) == null) {
                        return;
                    }
                    this.f.invoke(new yt0.d(new zt0(aVar5.b.h, cleVar.o)));
                    return;
                }
                return;
            }
            if (pq00Var2 instanceof pq00.a) {
                pq00.a aVar6 = (pq00.a) pq00Var2;
                SdkActionLink sdkActionLink = aVar6.b.c;
                if (sdkActionLink != null) {
                    String str4 = sdkActionLink.h;
                    String str5 = sdkActionLink.i;
                    if (str4 != null && str5 != null) {
                        V(str4, str5, sdkActionLink.f, aVar6, null);
                        return;
                    }
                    W(null, aVar6);
                    f4z f4zVar2 = this.i;
                    String str6 = sdkActionLink.f;
                    Integer num = sdkActionLink.j;
                    f4zVar2.b(new xp00.d(str6, num != null ? num.intValue() : 0));
                }
            }
        }
    }

    public final boolean U(cle cleVar, pq00.a aVar) {
        String str = cleVar.i;
        String str2 = cleVar.j;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }
        String str3 = cleVar.h;
        if (str3 == null) {
            str3 = "";
        }
        V(str, str2, str3, aVar, cleVar);
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    public final void V(String str, String str2, String str3, pq00.a aVar, cle cleVar) {
        boolean S = blk.S(str2);
        f4z f4zVar = this.i;
        if (!S) {
            f4zVar.b(new xp00.d(str3, 0));
            W(cleVar, aVar);
            return;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, jeq0.g(str));
        intent.setPackage(str2);
        hr00 hr00Var = aVar.b;
        SdkActionLink sdkActionLink = hr00Var.c;
        ?? r6 = hr00Var.b.k;
        String str4 = hr00Var.h;
        izs<yt0, s3q0> izsVar = this.f;
        if (cleVar != null) {
            izsVar.invoke(new yt0.e(new zt0(str4, r6)));
        } else if (sdkActionLink != null) {
            izsVar.invoke(new yt0.e(new zt0(str4, r6)));
        }
        f4zVar.b(new xp00.a(intent));
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Map] */
    public final void W(cle cleVar, pq00.a aVar) {
        hr00 hr00Var = aVar.b;
        String str = hr00Var.h;
        SdkActionLink sdkActionLink = hr00Var.c;
        izs<yt0, s3q0> izsVar = this.f;
        if (cleVar != null) {
            izsVar.invoke(new yt0.c(new zt0(str, cleVar.o)));
        } else if (sdkActionLink != null) {
            izsVar.invoke(new yt0.a(new zt0(str, hr00Var.b.k), sdkActionLink));
        }
    }
}
