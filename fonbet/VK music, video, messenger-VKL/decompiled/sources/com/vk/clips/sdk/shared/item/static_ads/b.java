package com.vk.clips.sdk.shared.item.static_ads;

import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.shared.item.static_ads.StaticAdsItemPatch;
import com.vk.clips.sdk.shared.item.static_ads.a;
import com.vk.clips.sdk.shared.item.static_ads.events.b;
import com.vk.dto.common.id.UserId;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import io.reactivex.rxjava3.core.x;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.au0;
import xsna.avk0;
import xsna.blk;
import xsna.bot;
import xsna.cu0;
import xsna.f4z;
import xsna.fxk0;
import xsna.gih0;
import xsna.gj80;
import xsna.gvk0;
import xsna.hvk0;
import xsna.ivk0;
import xsna.jeq0;
import xsna.jxk0;
import xsna.kxk0;
import xsna.mj50;
import xsna.mwk0;
import xsna.n1m;
import xsna.n34;
import xsna.nwk0;
import xsna.ojh0;
import xsna.owk0;
import xsna.pwk0;
import xsna.s3q0;
import xsna.su;
import xsna.uvk0;
import xsna.vvk0;
import xsna.wih0;
import xsna.wk50;
import xsna.xd40;
import xsna.yt0;
import xsna.zt0;

/* compiled from: StaticAdsItemFeature.kt */
/* loaded from: classes17.dex */
public final class b extends wk50<fxk0, mwk0, a, StaticAdsItemPatch> {
    public final hvk0 f;
    public final au0 g;
    public final xd40 h;
    public io.reactivex.rxjava3.disposables.c i;
    public final f4z j;
    public final f4z k;
    public final f4z l;
    public final mj50<mwk0, a, StaticAdsItemPatch> m;
    public final mj50<mwk0, a, StaticAdsItemPatch> n;
    public final mj50<mwk0, a, StaticAdsItemPatch> o;

    public b(d dVar, ojh0 ojh0Var, su suVar, kxk0 kxk0Var, hvk0 hvk0Var, cu0 cu0Var, xd40 xd40Var) {
        super(a.k.b, dVar);
        this.f = hvk0Var;
        this.g = cu0Var;
        this.h = xd40Var;
        f4z f4zVar = new f4z();
        this.j = f4zVar;
        f4z f4zVar2 = new f4z();
        this.k = f4zVar2;
        this.l = new f4z();
        this.m = O(new avk0(ojh0Var, suVar, kxk0Var, hvk0Var));
        this.n = O(new bot(f4zVar2));
        this.o = O(new n1m(f4zVar, xd40Var));
    }

    @Override // xsna.wk50
    public final void N(mwk0 mwk0Var, a aVar) {
        SdkOwner sdkOwner;
        UserId userId;
        SdkOwner sdkOwner2;
        SdkOwner sdkOwner3;
        mwk0 mwk0Var2 = mwk0Var;
        a aVar2 = aVar;
        if (aVar2 instanceof a.k) {
            T(StaticAdsItemPatch.d.b);
            return;
        }
        if (aVar2 instanceof a.InterfaceC0687a) {
            this.m.a(mwk0Var2, aVar2);
            return;
        }
        if (aVar2 instanceof a.b) {
            this.o.a(mwk0Var2, aVar2);
            return;
        }
        if (aVar2 instanceof a.c) {
            this.n.a(mwk0Var2, aVar2);
            return;
        }
        if (aVar2 instanceof a.d) {
            f4z f4zVar = this.j;
            xd40 xd40Var = this.h;
            if (mwk0Var2 instanceof mwk0.a) {
                mwk0.a aVar3 = (mwk0.a) mwk0Var2;
                SdkActionLink sdkActionLink = aVar3.b.c;
                if (sdkActionLink == null) {
                    return;
                }
                String str = sdkActionLink.h;
                String str2 = sdkActionLink.i;
                if (str != null && str2 != null && blk.S(str2)) {
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, jeq0.g(str));
                    intent.setPackage(str2);
                    jxk0 jxk0Var = aVar3.b;
                    xd40Var.invoke(new yt0.e(new zt0(jxk0Var.h, jxk0Var.b.i)));
                    f4zVar.b(new vvk0.a(intent));
                    return;
                }
                jxk0 jxk0Var2 = aVar3.b;
                xd40Var.invoke(new yt0.a(new zt0(jxk0Var2.h, jxk0Var2.b.i), sdkActionLink));
                if (sdkActionLink.e.equals("link_community_with_subscribe")) {
                    this.k.b(b.C0696b.a);
                    return;
                } else {
                    f4zVar.b(new vvk0.c(sdkActionLink.f));
                    return;
                }
            }
            return;
        }
        if (aVar2 instanceof a.g) {
            if ((mwk0Var2 instanceof mwk0.a) && (sdkOwner3 = ((mwk0.a) mwk0Var2).b.b.d) != null) {
                if (Boolean.valueOf(sdkOwner3.g).equals(Boolean.TRUE)) {
                    this.j.b(new vvk0.d(sdkOwner3));
                    return;
                } else {
                    this.l.b(new owk0(sdkOwner3));
                    return;
                }
            }
            return;
        }
        if (aVar2 instanceof a.h) {
            a.h hVar = (a.h) aVar2;
            if (mwk0Var2 instanceof mwk0.a) {
                T(new StaticAdsItemPatch.e(hVar.b));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.i) {
            if (mwk0Var2 instanceof mwk0.a) {
                jxk0 jxk0Var3 = ((mwk0.a) mwk0Var2).b;
                wih0.d.a aVar4 = jxk0Var3.b;
                SdkOwner sdkOwner4 = aVar4.d;
                if (sdkOwner4 == null) {
                    C(a.d.b);
                    return;
                } else {
                    this.h.invoke(new yt0.i(new zt0(jxk0Var3.h, aVar4.i)));
                    this.j.b(new vvk0.d(sdkOwner4));
                    return;
                }
            }
            return;
        }
        if (aVar2 instanceof a.j) {
            if ((mwk0Var2 instanceof mwk0.a) && (sdkOwner2 = ((mwk0.a) mwk0Var2).b.b.d) != null) {
                this.l.b(new pwk0(sdkOwner2));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.f) {
            a.f fVar = (a.f) aVar2;
            if (mwk0Var2 instanceof mwk0.a) {
                if (!(fVar instanceof a.f.C0693a)) {
                    if (!(fVar instanceof a.f.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    io.reactivex.rxjava3.disposables.c cVar = this.i;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    T(StaticAdsItemPatch.UpdateStaticAdFocused.UNFOCUSED);
                    n34.g = false;
                    hvk0 hvk0Var = this.f;
                    gvk0 orDefault = hvk0Var.b.getOrDefault(((mwk0.a) mwk0Var2).b.g, new gvk0());
                    hvk0Var.a.b(new SchemeStat$TypeDevNullItem(DevNullEventKey.CLIPS_STATIC_ADS_LOAD_SHOW_CONTENT.h(), null, null, Integer.valueOf((int) (orDefault.b - orDefault.a)), null, Integer.valueOf(orDefault.a == -1 ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null));
                    return;
                }
                mwk0.a aVar5 = (mwk0.a) mwk0Var2;
                if (!aVar5.d.a) {
                    io.reactivex.rxjava3.disposables.c cVar2 = this.i;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    this.i = a7f0.a.f(this, x.k(s3q0.a).f(1500L, TimeUnit.MILLISECONDS), new gj80(this, 17), null, 5);
                }
                T(StaticAdsItemPatch.UpdateStaticAdFocused.FOCUSED);
                xd40 xd40Var2 = this.h;
                jxk0 jxk0Var4 = aVar5.b;
                xd40Var2.invoke(new yt0.j(new zt0(jxk0Var4.h, jxk0Var4.b.i)));
                n34.g = true;
                hvk0 hvk0Var2 = this.f;
                String str3 = aVar5.b.g;
                long j = ((a.f.C0693a) fVar).b;
                HashMap<String, gvk0> hashMap = hvk0Var2.b;
                gvk0 gvk0Var = hashMap.get(str3);
                if (gvk0Var == null) {
                    gvk0Var = new gvk0();
                    hashMap.put(str3, gvk0Var);
                }
                gvk0Var.b = j;
                return;
            }
            return;
        }
        if (aVar2 instanceof a.l) {
            a.l lVar = (a.l) aVar2;
            if (mwk0Var2 instanceof mwk0.a) {
                if (!(lVar instanceof a.l.C0694a)) {
                    if (!(lVar instanceof a.l.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.j.b(vvk0.e.a);
                    return;
                } else {
                    SdkOwner sdkOwner5 = ((mwk0.a) mwk0Var2).b.b.d;
                    if (sdkOwner5 == null) {
                        return;
                    }
                    this.l.b(new nwk0(sdkOwner5));
                    return;
                }
            }
            return;
        }
        if (aVar2 instanceof ivk0) {
            if (mwk0Var2 instanceof mwk0.a) {
                f4z f4zVar2 = this.j;
                jxk0 jxk0Var5 = ((mwk0.a) mwk0Var2).b;
                f4zVar2.b(new uvk0(jxk0Var5.g, jxk0Var5.b, jxk0Var5.h));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.m) {
            a.m mVar = (a.m) aVar2;
            if (!(mwk0Var2 instanceof mwk0.a) || (sdkOwner = ((mwk0.a) mwk0Var2).b.b.d) == null || (userId = sdkOwner.b) == null) {
                return;
            }
            if (mVar instanceof a.m.b) {
                this.k.b(new b.c.a(userId));
                return;
            } else {
                if (!(mVar instanceof a.m.C0695a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.j.b(new vvk0.d(sdkOwner));
                return;
            }
        }
        if (!(aVar2 instanceof a.e)) {
            throw new NoWhenBranchMatchedException();
        }
        a.e eVar = (a.e) aVar2;
        if (mwk0Var2 instanceof mwk0.a) {
            if (eVar instanceof a.e.b) {
                this.g.a(gih0.i.a);
                return;
            }
            if (!(eVar instanceof a.e.C0692a)) {
                throw new NoWhenBranchMatchedException();
            }
            hvk0 hvk0Var3 = this.f;
            String str4 = ((mwk0.a) mwk0Var2).b.g;
            long j2 = ((a.e.C0692a) eVar).b;
            HashMap<String, gvk0> hashMap2 = hvk0Var3.b;
            gvk0 gvk0Var2 = hashMap2.get(str4);
            if (gvk0Var2 == null) {
                gvk0Var2 = new gvk0();
                hashMap2.put(str4, gvk0Var2);
            }
            gvk0Var2.a = j2;
        }
    }
}
