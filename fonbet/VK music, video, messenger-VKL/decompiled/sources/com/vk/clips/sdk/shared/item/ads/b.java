package com.vk.clips.sdk.shared.item.ads;

import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.clips.sdk.models.ActionLinkSnippet;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkVideoRestriction;
import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.ads.AdsItemAction;
import com.vk.clips.sdk.shared.item.ads.AdsItemPatch;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.ui.g;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ax0;
import xsna.blk;
import xsna.bx0;
import xsna.c11;
import xsna.cvm0;
import xsna.d47;
import xsna.dgd;
import xsna.f4z;
import xsna.gnt0;
import xsna.hih0;
import xsna.hme;
import xsna.iih0;
import xsna.iw0;
import xsna.ixp0;
import xsna.ky0;
import xsna.mj50;
import xsna.msy;
import xsna.nz0;
import xsna.o1m;
import xsna.ojh0;
import xsna.skg0;
import xsna.su;
import xsna.wk50;
import xsna.wkj0;
import xsna.xw0;
import xsna.xzc;
import xsna.yof;
import xsna.yw0;

/* compiled from: AdsItemFeature.kt */
/* loaded from: classes17.dex */
public final class b extends wk50<c11, nz0, AdsItemAction, AdsItemPatch> {
    public final hih0 f;
    public final yof g;
    public final com.vk.movika.sdk.base.logic.interactor.b h;
    public final f4z i;
    public final f4z j;
    public final f4z k;
    public final mj50<nz0, AdsItemAction, AdsItemPatch> l;
    public final mj50<nz0, AdsItemAction, AdsItemPatch> m;
    public final Object n;
    public final mj50<nz0, AdsItemAction, AdsItemPatch> o;
    public final mj50<nz0, AdsItemAction, AdsItemPatch> p;
    public final mj50<nz0, AdsItemAction, AdsItemPatch> q;
    public final mj50<nz0, AdsItemAction, AdsItemPatch> r;

    /* compiled from: AdsItemFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdsItemAction.HandleVideoFocusChanged.values().length];
            try {
                iArr[AdsItemAction.HandleVideoFocusChanged.FOCUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdsItemAction.HandleVideoFocusChanged.UNFOCUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AdsItemAction.HandleOnItemViewFocusChanged.values().length];
            try {
                iArr2[AdsItemAction.HandleOnItemViewFocusChanged.FOCUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AdsItemAction.HandleOnItemViewFocusChanged.UNFOCUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public b(d dVar, iih0 iih0Var, yof yofVar, com.vk.movika.sdk.base.logic.interactor.b bVar, iw0 iw0Var, su suVar, ojh0 ojh0Var, yw0 yw0Var, hme hmeVar) {
        super(AdsItemAction.p.b, dVar);
        this.f = iih0Var;
        this.g = yofVar;
        this.h = bVar;
        f4z f4zVar = new f4z();
        this.i = f4zVar;
        f4z f4zVar2 = new f4z();
        this.j = f4zVar2;
        f4z f4zVar3 = new f4z();
        this.k = f4zVar3;
        this.l = O(new d47(f4zVar, suVar, ojh0Var, iw0Var, new ax0(0, yw0Var, yw0.class, "getMuteInClipFeed", "getMuteInClipFeed()Z", 0, 0), iih0Var));
        this.m = O(new o1m(iih0Var, f4zVar2, f4zVar3, yofVar));
        this.n = msy.a(LazyThreadSafetyMode.NONE, new g(this, 4));
        this.o = O(new skg0(iih0Var, f4zVar, f4zVar3));
        this.p = O(new gnt0(new bx0(0, yw0Var, yw0.class, "getMuteInClipFeed", "getMuteInClipFeed()Z", 0, 0), hmeVar));
        this.q = O(new wkj0(f4zVar3));
        this.r = O(new cvm0(iih0Var, f4zVar, f4zVar3));
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wk50
    public final void N(nz0 nz0Var, AdsItemAction adsItemAction) {
        SdkVideoRestriction O;
        Object cVar;
        Object obj;
        String str;
        nz0 nz0Var2 = nz0Var;
        AdsItemAction adsItemAction2 = adsItemAction;
        if (adsItemAction2 instanceof AdsItemAction.p) {
            T(AdsItemPatch.d.b);
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.a) {
            this.l.a(nz0Var2, adsItemAction2);
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.b) {
            this.m.a(nz0Var2, adsItemAction2);
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.c) {
            ((mj50) this.n.getValue()).a(nz0Var2, adsItemAction2);
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.q) {
            this.o.a(nz0Var2, adsItemAction2);
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.t) {
            this.p.a(nz0Var2, adsItemAction2);
            return;
        }
        boolean z = adsItemAction2 instanceof AdsItemAction.o;
        f4z f4zVar = this.i;
        if (z) {
            if (nz0Var2 instanceof nz0.a) {
                f4zVar.b(new xw0.o.a(((nz0.a) nz0Var2).c));
                return;
            }
            return;
        }
        boolean z2 = adsItemAction2 instanceof AdsItemAction.d;
        f4z f4zVar2 = this.k;
        if (z2) {
            if (nz0Var2 instanceof nz0.a) {
                nz0.a aVar = (nz0.a) nz0Var2;
                if (aVar.l != null) {
                    f4zVar.b(xw0.d.a);
                    return;
                }
                SdkClipVideoFile sdkClipVideoFile = aVar.b.a;
                SdkActionLink m1 = sdkClipVideoFile.m1();
                if (m1 == null) {
                    return;
                }
                ActionLinkSnippet actionLinkSnippet = m1.g;
                this.f.o2(new SdkClipViewerClick.a(sdkClipVideoFile, m1));
                if (m1.e.equals("link_community_with_subscribe")) {
                    f4zVar.b(xw0.c.a);
                    return;
                }
                String str2 = m1.f;
                if (actionLinkSnippet == null || (str = actionLinkSnippet.k) == null) {
                    cVar = new ky0.c(str2);
                } else {
                    if (blk.S(actionLinkSnippet.j)) {
                        obj = new ky0.a(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)));
                        f4zVar2.b(obj);
                        return;
                    }
                    cVar = new ky0.c(str2);
                }
                obj = cVar;
                f4zVar2.b(obj);
                return;
            }
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.g) {
            if (nz0Var2 instanceof nz0.a) {
                nz0.a aVar2 = (nz0.a) nz0Var2;
                SdkClipVideoFile sdkClipVideoFile2 = aVar2.b.a;
                if (!sdkClipVideoFile2.U()) {
                    f4zVar.b(new xw0.l.b(aVar2.c, null));
                    return;
                }
                UserId b = dgd.b(sdkClipVideoFile2);
                if (b == null) {
                    return;
                }
                f4zVar2.b(new ky0.e(b));
                return;
            }
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.i) {
            AdsItemAction.i iVar = (AdsItemAction.i) adsItemAction2;
            if (nz0Var2 instanceof nz0.a) {
                nz0.a aVar3 = (nz0.a) nz0Var2;
                SdkClipVideoFile sdkClipVideoFile3 = aVar3.b.a;
                if (!sdkClipVideoFile3.U()) {
                    f4zVar.b(new xw0.l.b(aVar3.c, iVar.b));
                    return;
                }
                UserId b2 = dgd.b(sdkClipVideoFile3);
                if (b2 == null) {
                    return;
                }
                f4zVar2.b(new ky0.e(b2));
                return;
            }
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.j) {
            AdsItemAction.j jVar = (AdsItemAction.j) adsItemAction2;
            if (nz0Var2 instanceof nz0.a) {
                T(new AdsItemPatch.e(jVar.b));
                return;
            }
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.k) {
            if (nz0Var2 instanceof nz0.a) {
                SdkClipVideoFile a2 = ((nz0.a) nz0Var2).b.a();
                xzc a3 = dgd.a(a2);
                if ((a3 instanceof xzc.c) || (a3 instanceof xzc.b)) {
                    f4zVar2.b(new ky0.d(a2));
                    return;
                } else {
                    if (!(a3 instanceof xzc.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C(AdsItemAction.d.b);
                    return;
                }
            }
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.e) {
            if ((nz0Var2 instanceof nz0.a) && ((ixp0) this.h.invoke()).b) {
                f4zVar.b(xw0.b.a);
                return;
            }
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.l) {
            if (nz0Var2 instanceof nz0.a) {
                f4zVar.b(new xw0.g(((nz0.a) nz0Var2).d));
                return;
            }
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.m) {
            if ((nz0Var2 instanceof nz0.a) && (O = ((nz0.a) nz0Var2).b.a().O()) != null) {
                f4zVar2.b(new ky0.f(O));
                return;
            }
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.n) {
            if (nz0Var2 instanceof nz0.a) {
                nz0.a aVar4 = (nz0.a) nz0Var2;
                f4zVar.b(new xw0.a(aVar4.b.a(), aVar4.d));
                return;
            }
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.h) {
            if (nz0Var2 instanceof nz0.a) {
                SdkClipVideoFile sdkClipVideoFile4 = ((nz0.a) nz0Var2).b.a;
                if (sdkClipVideoFile4.k0()) {
                    return;
                }
                f4zVar.b(new xw0.m(sdkClipVideoFile4));
                return;
            }
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.r) {
            this.q.a(nz0Var2, adsItemAction2);
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.s) {
            this.r.a(nz0Var2, adsItemAction2);
            return;
        }
        if (adsItemAction2 instanceof AdsItemAction.HandleVideoFocusChanged) {
            AdsItemAction.HandleVideoFocusChanged handleVideoFocusChanged = (AdsItemAction.HandleVideoFocusChanged) adsItemAction2;
            if (nz0Var2 instanceof nz0.a) {
                int i = a.$EnumSwitchMapping$0[handleVideoFocusChanged.ordinal()];
                if (i == 1) {
                    T(AdsItemPatch.UpdateVideoFocused.FOCUSED);
                    return;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    T(AdsItemPatch.UpdateVideoFocused.UNFOCUSED);
                    f4zVar.b(new xw0.h(((nz0.a) nz0Var2).d));
                    return;
                }
            }
            return;
        }
        if (!(adsItemAction2 instanceof AdsItemAction.HandleOnItemViewFocusChanged)) {
            if (!(adsItemAction2 instanceof AdsItemAction.f)) {
                throw new NoWhenBranchMatchedException();
            }
            if (nz0Var2 instanceof nz0.a) {
                f4zVar.b(new xw0.i(((nz0.a) nz0Var2).d));
                return;
            }
            return;
        }
        AdsItemAction.HandleOnItemViewFocusChanged handleOnItemViewFocusChanged = (AdsItemAction.HandleOnItemViewFocusChanged) adsItemAction2;
        if (nz0Var2 instanceof nz0.a) {
            int i2 = a.$EnumSwitchMapping$1[handleOnItemViewFocusChanged.ordinal()];
            if (i2 == 1) {
                T(AdsItemPatch.UpdateItemViewFocused.FOCUSED);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T(AdsItemPatch.UpdateItemViewFocused.UNFOCUSED);
            }
        }
    }
}
