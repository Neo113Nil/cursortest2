package com.vk.clips.sdk.shared.item.static_ads;

import com.vk.clips.sdk.shared.item.static_ads.StaticAdsItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.cvk0;
import xsna.dm50;
import xsna.dv;
import xsna.fxk0;
import xsna.gib0;
import xsna.gwk0;
import xsna.hw;
import xsna.jxk0;
import xsna.lwk0;
import xsna.mwk0;
import xsna.r9c0;

/* compiled from: StaticAdsItemReducer.kt */
/* loaded from: classes17.dex */
public final class d extends dm50<fxk0, StaticAdsItemPatch, mwk0> {
    public final lwk0 d;
    public final cvk0 e;

    public d(gwk0 gwk0Var) {
        super(mwk0.b.b);
        this.d = new lwk0(gwk0Var);
        this.e = new cvk0();
    }

    @Override // xsna.dm50
    public final mwk0 c(mwk0 mwk0Var, StaticAdsItemPatch staticAdsItemPatch) {
        boolean z;
        mwk0 mwk0Var2 = mwk0Var;
        StaticAdsItemPatch staticAdsItemPatch2 = staticAdsItemPatch;
        if (staticAdsItemPatch2 instanceof StaticAdsItemPatch.d) {
            return mwk0.b.b;
        }
        if (staticAdsItemPatch2 instanceof StaticAdsItemPatch.b) {
            StaticAdsItemPatch.b bVar = (StaticAdsItemPatch.b) staticAdsItemPatch2;
            this.e.getClass();
            if (!(bVar instanceof StaticAdsItemPatch.b.a)) {
                if (bVar instanceof StaticAdsItemPatch.b.C0686b) {
                    return mwk0.b.b;
                }
                throw new NoWhenBranchMatchedException();
            }
            StaticAdsItemPatch.b.a aVar = (StaticAdsItemPatch.b.a) bVar;
            if (aVar instanceof StaticAdsItemPatch.b.a.C0684a) {
                StaticAdsItemPatch.b.a.C0684a c0684a = (StaticAdsItemPatch.b.a.C0684a) aVar;
                jxk0 jxk0Var = c0684a.b;
                hw.a.getClass();
                return new mwk0.a(jxk0Var, false, new dv(false, hw.b, hw.c), c0684a.c, false);
            }
            if (!(aVar instanceof StaticAdsItemPatch.b.a.C0685b)) {
                throw new NoWhenBranchMatchedException();
            }
            StaticAdsItemPatch.b.a.C0685b c0685b = (StaticAdsItemPatch.b.a.C0685b) aVar;
            if (mwk0Var2 instanceof mwk0.b) {
                return mwk0Var2;
            }
            if (mwk0Var2 instanceof mwk0.a) {
                return mwk0.a.a((mwk0.a) mwk0Var2, c0685b.b, false, null, null, false, 30);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (staticAdsItemPatch2 instanceof StaticAdsItemPatch.c) {
            StaticAdsItemPatch.c cVar = (StaticAdsItemPatch.c) staticAdsItemPatch2;
            if (mwk0Var2 instanceof mwk0.b) {
                return mwk0Var2;
            }
            if (!(mwk0Var2 instanceof mwk0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (cVar instanceof StaticAdsItemPatch.c.b) {
                z = true;
            } else {
                if (!(cVar instanceof StaticAdsItemPatch.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            return mwk0.a.a((mwk0.a) mwk0Var2, null, z, null, null, false, 29);
        }
        if (staticAdsItemPatch2 instanceof StaticAdsItemPatch.a) {
            StaticAdsItemPatch.a aVar2 = (StaticAdsItemPatch.a) staticAdsItemPatch2;
            if (mwk0Var2 instanceof mwk0.a) {
                if (aVar2 instanceof StaticAdsItemPatch.a.b) {
                    mwk0.a aVar3 = (mwk0.a) mwk0Var2;
                    StaticAdsItemPatch.a.b bVar2 = (StaticAdsItemPatch.a.b) aVar2;
                    return mwk0.a.a(aVar3, null, false, dv.a(aVar3.d, bVar2.b, bVar2.c, 1), null, false, 27);
                }
                if (!(aVar2 instanceof StaticAdsItemPatch.a.C0683a)) {
                    throw new NoWhenBranchMatchedException();
                }
                mwk0.a aVar4 = (mwk0.a) mwk0Var2;
                return mwk0.a.a(aVar4, null, false, dv.a(aVar4.d, null, null, 6), null, false, 27);
            }
        } else if (staticAdsItemPatch2 instanceof StaticAdsItemPatch.UpdateStaticAdFocused) {
            StaticAdsItemPatch.UpdateStaticAdFocused updateStaticAdFocused = (StaticAdsItemPatch.UpdateStaticAdFocused) staticAdsItemPatch2;
            if (mwk0Var2 instanceof mwk0.a) {
                boolean z2 = updateStaticAdFocused == StaticAdsItemPatch.UpdateStaticAdFocused.FOCUSED;
                return mwk0.a.a((mwk0.a) mwk0Var2, null, z2 ? ((mwk0.a) mwk0Var2).c : false, null, null, z2, 13);
            }
        } else {
            if (!(staticAdsItemPatch2 instanceof StaticAdsItemPatch.e)) {
                throw new NoWhenBranchMatchedException();
            }
            StaticAdsItemPatch.e eVar = (StaticAdsItemPatch.e) staticAdsItemPatch2;
            if (mwk0Var2 instanceof mwk0.a) {
                return mwk0.a.a((mwk0.a) mwk0Var2, null, false, null, eVar.b, false, 23);
            }
        }
        return mwk0Var2;
    }

    @Override // xsna.dm50
    public final fxk0 d() {
        return new fxk0(e(new r9c0(this, 11)), e(new gib0(this, 10)));
    }

    @Override // xsna.dm50
    public final void h(mwk0 mwk0Var, fxk0 fxk0Var) {
        mwk0 mwk0Var2 = mwk0Var;
        fxk0 fxk0Var2 = fxk0Var;
        if (mwk0Var2 instanceof mwk0.a) {
            f(fxk0Var2.a, mwk0Var2);
            f(fxk0Var2.b, mwk0Var2);
        }
    }
}
