package com.vk.clips.sdk.shared.item.ads;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.clips.sdk.shared.item.ads.AdsItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.av;
import xsna.bz0;
import xsna.c11;
import xsna.dm50;
import xsna.ev;
import xsna.f47;
import xsna.gvp;
import xsna.hw;
import xsna.hw0;
import xsna.ixp0;
import xsna.iz0;
import xsna.j4b0;
import xsna.kih0;
import xsna.knt0;
import xsna.mz0;
import xsna.nlh0;
import xsna.nz0;
import xsna.sz;

/* compiled from: AdsItemReducer.kt */
/* loaded from: classes17.dex */
public final class d extends dm50<c11, AdsItemPatch, nz0> {
    public final mz0 d;
    public final f47 e;
    public final knt0 f;
    public final av g;

    public d(bz0 bz0Var) {
        super(nz0.b.b);
        this.d = new mz0(bz0Var);
        this.e = new f47();
        this.f = new knt0();
        this.g = new av();
    }

    @Override // xsna.dm50
    public final nz0 c(nz0 nz0Var, AdsItemPatch adsItemPatch) {
        boolean z;
        nz0 nz0Var2 = nz0Var;
        AdsItemPatch adsItemPatch2 = adsItemPatch;
        if (adsItemPatch2 instanceof AdsItemPatch.d) {
            return nz0.b.b;
        }
        if (adsItemPatch2 instanceof AdsItemPatch.b) {
            AdsItemPatch.b bVar = (AdsItemPatch.b) adsItemPatch2;
            this.e.getClass();
            if (!(bVar instanceof AdsItemPatch.b.a)) {
                if (bVar instanceof AdsItemPatch.b.C0649b) {
                    return nz0.b.b;
                }
                throw new NoWhenBranchMatchedException();
            }
            AdsItemPatch.b.a aVar = (AdsItemPatch.b.a) bVar;
            if (!(aVar instanceof AdsItemPatch.b.a.C0647a)) {
                if (!(aVar instanceof AdsItemPatch.b.a.C0648b)) {
                    throw new NoWhenBranchMatchedException();
                }
                AdsItemPatch.b.a.C0648b c0648b = (AdsItemPatch.b.a.C0648b) aVar;
                if (nz0Var2 instanceof nz0.b) {
                    return nz0Var2;
                }
                if (nz0Var2 instanceof nz0.a) {
                    return nz0.a.a((nz0.a) nz0Var2, c0648b.b, null, null, null, false, null, false, false, 2046);
                }
                throw new NoWhenBranchMatchedException();
            }
            AdsItemPatch.b.a.C0647a c0647a = (AdsItemPatch.b.a.C0647a) aVar;
            hw0 hw0Var = c0647a.b;
            nlh0 nlh0Var = c0647a.c;
            kih0 kih0Var = c0647a.d;
            j4b0 j4b0Var = c0647a.e;
            ixp0 ixp0Var = c0647a.f;
            gvp.b bVar2 = gvp.b.a;
            boolean z2 = c0647a.g;
            boolean z3 = c0647a.h;
            hw.a.getClass();
            return new nz0.a(hw0Var, nlh0Var, kih0Var, j4b0Var, ixp0Var, bVar2, false, new ev(z2, z3, null, hw.b, hw.c), false, c0647a.i, c0647a.j);
        }
        if (adsItemPatch2 instanceof AdsItemPatch.c) {
            AdsItemPatch.c cVar = (AdsItemPatch.c) adsItemPatch2;
            if (nz0Var2 instanceof nz0.b) {
                return nz0Var2;
            }
            if (!(nz0Var2 instanceof nz0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (cVar instanceof AdsItemPatch.c.b) {
                z = true;
            } else {
                if (!(cVar instanceof AdsItemPatch.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            return nz0.a.a((nz0.a) nz0Var2, null, null, null, null, z, null, false, false, 1983);
        }
        if (adsItemPatch2 instanceof AdsItemPatch.f) {
            AdsItemPatch.f fVar = (AdsItemPatch.f) adsItemPatch2;
            this.f.getClass();
            if (nz0Var2 instanceof nz0.a) {
                if (fVar instanceof AdsItemPatch.f.h) {
                    nz0.a aVar2 = (nz0.a) nz0Var2;
                    AdsItemPatch.f.h hVar = (AdsItemPatch.f.h) fVar;
                    return nz0.a.a(aVar2, null, null, null, null, false, ev.a(aVar2.i, hVar.b, hVar.c, null, null, null, 28), false, false, 1919);
                }
                if (fVar instanceof AdsItemPatch.f.g) {
                    return nz0.a.a((nz0.a) nz0Var2, null, ((AdsItemPatch.f.g) fVar).b, null, null, false, null, false, false, 2039);
                }
                if (fVar instanceof AdsItemPatch.f.j) {
                    ((AdsItemPatch.f.j) fVar).getClass();
                    return nz0.a.a((nz0.a) nz0Var2, null, null, null, null, false, null, false, false, 2039);
                }
                if (fVar instanceof AdsItemPatch.f.C0650f) {
                    return nz0.a.a((nz0.a) nz0Var2, null, ((AdsItemPatch.f.C0650f) fVar).b, null, null, false, null, false, false, 2039);
                }
                if (fVar instanceof AdsItemPatch.f.c) {
                    nz0.a aVar3 = (nz0.a) nz0Var2;
                    AdsItemPatch.f.c cVar2 = (AdsItemPatch.f.c) fVar;
                    gvp gvpVar = aVar3.g;
                    gvp.a aVar4 = gvpVar instanceof gvp.a ? (gvp.a) gvpVar : null;
                    int i = aVar4 != null ? aVar4.a : 0;
                    int i2 = cVar2.c;
                    if (i != i2) {
                        gvpVar = new gvp.a(i2);
                    }
                    return nz0.a.a(aVar3, null, cVar2.b, null, gvpVar, false, null, false, false, 2007);
                }
                if (fVar instanceof AdsItemPatch.f.i) {
                    return nz0.a.a((nz0.a) nz0Var2, null, ((AdsItemPatch.f.i) fVar).b, null, null, false, null, false, false, 2039);
                }
                if (fVar instanceof AdsItemPatch.f.d) {
                    return nz0.a.a((nz0.a) nz0Var2, null, ((AdsItemPatch.f.d) fVar).b, null, null, false, null, false, false, 2039);
                }
                if (fVar instanceof AdsItemPatch.f.e) {
                    return nz0.a.a((nz0.a) nz0Var2, null, ((AdsItemPatch.f.e) fVar).b, null, null, false, null, false, false, 2039);
                }
                if (fVar instanceof AdsItemPatch.f.b) {
                    return nz0.a.a((nz0.a) nz0Var2, null, ((AdsItemPatch.f.b) fVar).b, null, null, false, null, false, false, 2039);
                }
                if (fVar instanceof AdsItemPatch.f.a) {
                    return nz0.a.a((nz0.a) nz0Var2, null, ((AdsItemPatch.f.a) fVar).b, null, null, false, null, false, false, 2039);
                }
                if (fVar instanceof AdsItemPatch.f.k) {
                    return nz0.a.a((nz0.a) nz0Var2, null, null, null, null, false, null, false, ((AdsItemPatch.f.k) fVar).b, 1535);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(adsItemPatch2 instanceof AdsItemPatch.a)) {
                if (adsItemPatch2 instanceof AdsItemPatch.UpdateVideoFocused) {
                    AdsItemPatch.UpdateVideoFocused updateVideoFocused = (AdsItemPatch.UpdateVideoFocused) adsItemPatch2;
                    if (nz0Var2 instanceof nz0.b) {
                        return nz0Var2;
                    }
                    if (nz0Var2 instanceof nz0.a) {
                        return nz0.a.a((nz0.a) nz0Var2, null, null, null, null, false, null, updateVideoFocused == AdsItemPatch.UpdateVideoFocused.FOCUSED, false, 1791);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (adsItemPatch2 instanceof AdsItemPatch.UpdateItemViewFocused) {
                    AdsItemPatch.UpdateItemViewFocused updateItemViewFocused = (AdsItemPatch.UpdateItemViewFocused) adsItemPatch2;
                    if (nz0Var2 instanceof nz0.b) {
                        return nz0Var2;
                    }
                    if (nz0Var2 instanceof nz0.a) {
                        return nz0.a.a((nz0.a) nz0Var2, null, null, null, null, updateItemViewFocused == AdsItemPatch.UpdateItemViewFocused.FOCUSED ? ((nz0.a) nz0Var2).h : false, null, false, false, 1983);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (!(adsItemPatch2 instanceof AdsItemPatch.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                AdsItemPatch.e eVar = (AdsItemPatch.e) adsItemPatch2;
                if (nz0Var2 instanceof nz0.b) {
                    return nz0Var2;
                }
                if (nz0Var2 instanceof nz0.a) {
                    return nz0.a.a((nz0.a) nz0Var2, null, null, eVar.b, null, false, null, false, false, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
                }
                throw new NoWhenBranchMatchedException();
            }
            AdsItemPatch.a aVar5 = (AdsItemPatch.a) adsItemPatch2;
            this.g.getClass();
            if (nz0Var2 instanceof nz0.a) {
                if (aVar5 instanceof AdsItemPatch.a.b) {
                    nz0.a aVar6 = (nz0.a) nz0Var2;
                    return nz0.a.a(aVar6, null, null, null, null, false, ev.a(aVar6.i, false, false, ((AdsItemPatch.a.b) aVar5).b, null, null, 27), false, false, 1919);
                }
                if (!(aVar5 instanceof AdsItemPatch.a.C0646a)) {
                    throw new NoWhenBranchMatchedException();
                }
                nz0.a aVar7 = (nz0.a) nz0Var2;
                AdsItemPatch.a.C0646a c0646a = (AdsItemPatch.a.C0646a) aVar5;
                return nz0.a.a(aVar7, null, null, null, null, false, ev.a(aVar7.i, false, false, null, c0646a.b, c0646a.c, 7), false, false, 1919);
            }
        }
        return nz0Var2;
    }

    @Override // xsna.dm50
    public final c11 d() {
        return new c11(e(new sz(this, 2)), e(new iz0(this, 0)));
    }

    @Override // xsna.dm50
    public final void h(nz0 nz0Var, c11 c11Var) {
        nz0 nz0Var2 = nz0Var;
        c11 c11Var2 = c11Var;
        if (nz0Var2 instanceof nz0.a) {
            f(c11Var2.a, nz0Var2);
            f(c11Var2.b, nz0Var2);
        }
    }
}
