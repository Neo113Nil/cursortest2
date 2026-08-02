package com.vk.clips.sdk.shared.item.clip;

import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.feed.model.DataLoadState;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.dm50;
import xsna.e47;
import xsna.epx;
import xsna.fc60;
import xsna.g2d;
import xsna.g60;
import xsna.gvp;
import xsna.hw;
import xsna.ioa0;
import xsna.iw;
import xsna.j4b0;
import xsna.jnt0;
import xsna.kih0;
import xsna.m0d;
import xsna.m2d;
import xsna.mfj0;
import xsna.n2d;
import xsna.nlh0;
import xsna.ny;
import xsna.o16;
import xsna.o2d;
import xsna.p2d;
import xsna.q2d;
import xsna.qzb0;
import xsna.rpp0;
import xsna.sws;
import xsna.t16;
import xsna.t80;
import xsna.tm0;
import xsna.tws;
import xsna.u2d;
import xsna.umc;
import xsna.uu;
import xsna.v5e;
import xsna.wws;
import xsna.y0r;
import xsna.y6d;
import xsna.yof;
import xsna.z2d;
import xsna.z7g;
import xsna.za;

/* compiled from: ClipItemReducer.kt */
/* loaded from: classes17.dex */
public final class b extends dm50<y6d, ClipItemPatch, z2d> {
    public final v5e d;
    public final u2d e;
    public final e47 f;
    public final jnt0 g;
    public final tws h;

    public b(yof yofVar, v5e v5eVar, g2d g2dVar) {
        super(z2d.b.b);
        this.d = v5eVar;
        this.e = new u2d(g2dVar);
        this.f = new e47(yofVar, v5eVar);
        this.g = new jnt0();
        this.h = new tws();
    }

    public static z2d j(z2d z2dVar) {
        if (z2dVar instanceof z2d.b) {
            return z2dVar;
        }
        if (!(z2dVar instanceof z2d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        z2d.a aVar = (z2d.a) z2dVar;
        t16 t16Var = aVar.z;
        o16 o16Var = t16Var.f;
        if (o16Var == null || !o16Var.f) {
            return z2d.a.a(aVar, null, null, null, null, false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, t16.a(t16Var, false, null, o16Var != null ? new o16(o16Var.a, o16Var.b, o16Var.c, o16Var.d, o16Var.e, true) : null, 95), null, null, 503316479);
        }
        return aVar;
    }

    public static z2d k(z2d z2dVar) {
        if (z2dVar instanceof z2d.b) {
            return z2dVar;
        }
        if (!(z2dVar instanceof z2d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        z2d.a aVar = (z2d.a) z2dVar;
        t16 t16Var = aVar.z;
        return (t16Var.a && t16Var.b && t16Var.f != null) ? z2d.a.a(aVar, null, null, null, null, false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, t16.a(t16Var, false, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, 503316479) : aVar;
    }

    public static z2d l(z2d z2dVar, o2d o2dVar) {
        if (z2dVar instanceof z2d.b) {
            return z2dVar;
        }
        if (!(z2dVar instanceof z2d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        z2d.a aVar = (z2d.a) z2dVar;
        o16 o16Var = aVar.z.f;
        String str = o16Var != null ? o16Var.a : null;
        String str2 = o2dVar.b;
        String str3 = o2dVar.d;
        String str4 = o2dVar.c;
        String str5 = o2dVar.e;
        return (epx.f(str, str2) && epx.f(o16Var.d, str5) && epx.f(o16Var.b, str4) && epx.f(o16Var.c, str3)) ? aVar : z2d.a.a(aVar, null, null, null, null, false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, t16.a(aVar.z, false, null, new o16(o2dVar.b, str4, str3, str5, o2dVar.f, false), 95), null, null, 503316479);
    }

    public static z2d m(z2d z2dVar) {
        if (z2dVar instanceof z2d.a) {
            z2d.a aVar = (z2d.a) z2dVar;
            return !aVar.h.a ? z2d.a.a(aVar, null, null, new fc60(true), null, false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, null, null, null, 536870783) : aVar;
        }
        if (z2dVar instanceof z2d.b) {
            return z2dVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static z2d n(z2d z2dVar, ClipItemPatch.g gVar) {
        if (z2dVar instanceof z2d.a) {
            return z2d.a.a((z2d.a) z2dVar, null, null, null, null, false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, null, null, gVar.b, 268435455);
        }
        if (z2dVar instanceof z2d.b) {
            return z2dVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static z2d o(z2d z2dVar) {
        if (z2dVar instanceof z2d.a) {
            z2d.a aVar = (z2d.a) z2dVar;
            mfj0 mfj0Var = aVar.g;
            return !mfj0Var.b ? z2d.a.a(aVar, null, mfj0.a(mfj0Var, false, false, null, 13), null, null, false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, null, null, null, 536870847) : aVar;
        }
        if (z2dVar instanceof z2d.b) {
            return z2dVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static z2d p(z2d z2dVar, q2d q2dVar) {
        if (z2dVar instanceof z2d.a) {
            z2d.a aVar = (z2d.a) z2dVar;
            return !epx.f(aVar.g.d, q2dVar.b) ? z2d.a.a(aVar, null, mfj0.a(aVar.g, false, false, q2dVar.b, 7), null, null, false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, null, null, null, 536870847) : aVar;
        }
        if (z2dVar instanceof z2d.b) {
            return z2dVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static z2d q(z2d z2dVar, ClipItemPatch.i iVar) {
        if (!(z2dVar instanceof z2d.a)) {
            if (z2dVar instanceof z2d.b) {
                return z2dVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        z2d.a aVar = (z2d.a) z2dVar;
        rpp0 rpp0Var = aVar.A;
        boolean z = rpp0Var.a;
        boolean z2 = iVar.b;
        boolean z3 = iVar.d;
        boolean z4 = iVar.c;
        return (z == z2 && rpp0Var.b == z4 && rpp0Var.c == z3) ? aVar : z2d.a.a(aVar, null, null, null, null, false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, null, new rpp0(z2, z4, z3), null, 469762047);
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    @Override // xsna.dm50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z2d c(z2d z2dVar, ClipItemPatch clipItemPatch) {
        z2d.a aVar;
        DataLoadState dataLoadState;
        boolean z;
        boolean z2;
        t16 t16Var;
        boolean z3;
        boolean z4;
        z7g z7gVar;
        z7g z7gVar2;
        z2d z2dVar2 = z2dVar;
        ClipItemPatch clipItemPatch2 = clipItemPatch;
        if (clipItemPatch2 instanceof ClipItemPatch.e) {
            return z2d.b.b;
        }
        if (clipItemPatch2 instanceof ClipItemPatch.b) {
            ClipItemPatch.b bVar = (ClipItemPatch.b) clipItemPatch2;
            e47 e47Var = this.f;
            e47Var.getClass();
            if (!(bVar instanceof ClipItemPatch.b.a)) {
                if (bVar instanceof ClipItemPatch.b.C0661b) {
                    return z2d.b.b;
                }
                throw new NoWhenBranchMatchedException();
            }
            ClipItemPatch.b.a aVar2 = (ClipItemPatch.b.a) bVar;
            v5e v5eVar = e47Var.b;
            if (!(aVar2 instanceof ClipItemPatch.b.a.C0659a)) {
                if (!(aVar2 instanceof ClipItemPatch.b.a.C0660b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ClipItemPatch.b.a.C0660b c0660b = (ClipItemPatch.b.a.C0660b) aVar2;
                if (z2dVar2 instanceof z2d.b) {
                    return z2dVar2;
                }
                if (!(z2dVar2 instanceof z2d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                m0d m0dVar = c0660b.b;
                SdkClipVideoFile sdkClipVideoFile = m0dVar.a;
                t80 t80Var = m0dVar.j;
                z2d.a aVar3 = (z2d.a) z2dVar2;
                t80 a = v5eVar.a(sdkClipVideoFile.a1(), t80Var, aVar3.x);
                if (!epx.f(t80Var, a)) {
                    m0dVar = m0d.a(c0660b.b, a);
                }
                m0d m0dVar2 = m0dVar;
                return !epx.f(aVar3.b, m0dVar2) ? z2d.a.a(aVar3, m0dVar2, null, null, null, false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, null, null, null, 536870910) : aVar3;
            }
            ClipItemPatch.b.a.C0659a c0659a = (ClipItemPatch.b.a.C0659a) aVar2;
            m0d m0dVar3 = c0659a.b;
            SdkClipVideoFile sdkClipVideoFile2 = m0dVar3.a;
            t80 t80Var2 = m0dVar3.j;
            t80 a2 = v5eVar.a(sdkClipVideoFile2.a1(), t80Var2, c0659a.s);
            if (!epx.f(t80Var2, a2)) {
                m0dVar3 = m0d.a(c0659a.b, a2);
            }
            m0d m0dVar4 = m0dVar3;
            if (e47Var.a.P().a()) {
                SdkActionLink m1 = sdkClipVideoFile2.m1();
                if (epx.f(m1 != null ? m1.e : null, "video")) {
                    z4 = true;
                    nlh0 nlh0Var = c0659a.c;
                    kih0 kih0Var = c0659a.d;
                    y0r y0rVar = c0659a.e;
                    int i = c0659a.f;
                    umc umcVar = new umc(true, false, false);
                    mfj0 mfj0Var = new mfj0(false, false, false, null);
                    fc60 fc60Var = new fc60(false);
                    boolean z5 = c0659a.g;
                    j4b0 j4b0Var = c0659a.h;
                    boolean z6 = c0659a.i;
                    boolean z7 = c0659a.j;
                    uu uuVar = c0659a.k;
                    if (z4) {
                        iw.a.getClass();
                        z7gVar = iw.b;
                    } else {
                        hw.a.getClass();
                        z7gVar = hw.b;
                    }
                    z7g z7gVar3 = z7gVar;
                    if (z4) {
                        iw.a.getClass();
                        z7gVar2 = iw.c;
                    } else {
                        hw.a.getClass();
                        z7gVar2 = hw.c;
                    }
                    return new z2d.a(m0dVar4, nlh0Var, kih0Var, y0rVar, i, mfj0Var, fc60Var, umcVar, z5, false, false, false, j4b0Var, new ny(z6, z7, uuVar, z7gVar3, z7gVar2), false, c0659a.m, gvp.b.a, EmptyList.b, c0659a.n, new wws(sws.b.a, false), c0659a.o, false, false, c0659a.p, c0659a.q, rpp0.d, c0659a.r, ioa0.a.a);
                }
            }
            z4 = false;
            nlh0 nlh0Var2 = c0659a.c;
            kih0 kih0Var2 = c0659a.d;
            y0r y0rVar2 = c0659a.e;
            int i2 = c0659a.f;
            umc umcVar2 = new umc(true, false, false);
            mfj0 mfj0Var2 = new mfj0(false, false, false, null);
            fc60 fc60Var2 = new fc60(false);
            boolean z52 = c0659a.g;
            j4b0 j4b0Var2 = c0659a.h;
            boolean z62 = c0659a.i;
            boolean z72 = c0659a.j;
            uu uuVar2 = c0659a.k;
            if (z4) {
            }
            z7g z7gVar32 = z7gVar;
            if (z4) {
            }
            return new z2d.a(m0dVar4, nlh0Var2, kih0Var2, y0rVar2, i2, mfj0Var2, fc60Var2, umcVar2, z52, false, false, false, j4b0Var2, new ny(z62, z72, uuVar2, z7gVar32, z7gVar2), false, c0659a.m, gvp.b.a, EmptyList.b, c0659a.n, new wws(sws.b.a, false), c0659a.o, false, false, c0659a.p, c0659a.q, rpp0.d, c0659a.r, ioa0.a.a);
        }
        if (clipItemPatch2 instanceof ClipItemPatch.c) {
            ClipItemPatch.c cVar = (ClipItemPatch.c) clipItemPatch2;
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (cVar instanceof ClipItemPatch.c.b) {
                z3 = true;
            } else {
                if (!(cVar instanceof ClipItemPatch.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z3 = false;
            }
            z2d.a aVar4 = (z2d.a) z2dVar2;
            return aVar4.m != z3 ? z2d.a.a(aVar4, null, null, null, null, false, false, false, z3, null, null, false, null, null, null, null, null, false, false, null, null, null, null, 536866815) : aVar4;
        }
        if (clipItemPatch2 instanceof ClipItemPatch.t) {
            ClipItemPatch.t tVar = (ClipItemPatch.t) clipItemPatch2;
            this.g.getClass();
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (tVar instanceof ClipItemPatch.t.f) {
                return z2d.a.a((z2d.a) z2dVar2, null, null, null, null, false, false, false, false, ((ClipItemPatch.t.f) tVar).b, null, false, null, null, null, null, null, false, false, null, null, null, null, 536862719);
            }
            if (tVar instanceof ClipItemPatch.t.i) {
                ((ClipItemPatch.t.i) tVar).getClass();
                return z2d.a.a((z2d.a) z2dVar2, null, null, null, null, false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, null, null, null, 536862719);
            }
            if (tVar instanceof ClipItemPatch.t.e) {
                return z2d.a.a((z2d.a) z2dVar2, null, null, null, null, false, false, false, false, ((ClipItemPatch.t.e) tVar).b, null, false, null, null, null, null, null, false, false, null, null, null, null, 536862719);
            }
            if (tVar instanceof ClipItemPatch.t.b) {
                z2d.a aVar5 = (z2d.a) z2dVar2;
                ClipItemPatch.t.b bVar2 = (ClipItemPatch.t.b) tVar;
                gvp gvpVar = aVar5.r;
                gvp.a aVar6 = gvpVar instanceof gvp.a ? (gvp.a) gvpVar : null;
                int i3 = aVar6 != null ? aVar6.a : 0;
                j4b0 j4b0Var3 = aVar5.n;
                j4b0 j4b0Var4 = bVar2.b;
                int i4 = bVar2.c;
                return (epx.f(j4b0Var3, j4b0Var4) && i3 == i4) ? aVar5 : z2d.a.a(aVar5, null, null, null, null, false, false, false, false, bVar2.b, null, false, null, new gvp.a(i4), null, null, null, false, false, null, null, null, null, 536731647);
            }
            if (tVar instanceof ClipItemPatch.t.h) {
                return z2d.a.a((z2d.a) z2dVar2, null, null, null, null, false, false, false, false, ((ClipItemPatch.t.h) tVar).b, null, false, null, null, null, null, null, false, false, null, null, null, null, 536862719);
            }
            if (tVar instanceof ClipItemPatch.t.c) {
                return z2d.a.a((z2d.a) z2dVar2, null, null, null, null, false, false, false, false, ((ClipItemPatch.t.c) tVar).b, null, false, null, null, null, null, null, false, false, null, null, null, null, 536862719);
            }
            if (tVar instanceof ClipItemPatch.t.k) {
                return z2d.a.a((z2d.a) z2dVar2, null, null, null, null, ((ClipItemPatch.t.k) tVar).b, false, false, false, null, null, false, null, null, null, null, null, false, false, null, null, null, null, 536870399);
            }
            if (!(tVar instanceof ClipItemPatch.t.g)) {
                if (tVar instanceof ClipItemPatch.t.d) {
                    return z2d.a.a((z2d.a) z2dVar2, null, null, null, null, false, false, false, false, ((ClipItemPatch.t.d) tVar).b, null, false, null, null, null, null, null, false, false, null, null, null, null, 536862719);
                }
                if (tVar instanceof ClipItemPatch.t.a) {
                    return z2d.a.a((z2d.a) z2dVar2, null, null, null, null, false, false, false, false, ((ClipItemPatch.t.a) tVar).b, null, false, null, null, null, null, null, false, false, null, null, null, null, 536862719);
                }
                if (tVar instanceof ClipItemPatch.t.j) {
                    return z2d.a.a((z2d.a) z2dVar2, null, null, null, null, false, false, false, false, null, null, false, null, null, ((ClipItemPatch.t.j) tVar).b, null, null, false, false, null, null, null, null, 536608767);
                }
                throw new NoWhenBranchMatchedException();
            }
            z2d.a aVar7 = (z2d.a) z2dVar2;
            t16 t16Var2 = aVar7.z;
            mfj0 mfj0Var3 = aVar7.g;
            umc umcVar3 = aVar7.i;
            ClipItemPatch.t.g gVar = (ClipItemPatch.t.g) tVar;
            boolean z8 = gVar.e;
            boolean z9 = gVar.h;
            qzb0 qzb0Var = gVar.d;
            DataLoadState dataLoadState2 = t16Var2.c;
            boolean z10 = t16Var2.b;
            DataLoadState dataLoadState3 = DataLoadState.DATA_TRIED_TO_LOAD;
            if (dataLoadState2 != dataLoadState3) {
                boolean z11 = gVar.f;
                if (z11) {
                    dataLoadState = DataLoadState.POSITION_REACHED;
                } else if (!z11) {
                    dataLoadState = DataLoadState.POSITION_NOT_REACHED;
                }
                boolean z12 = umcVar3.b;
                boolean z13 = umcVar3.a;
                boolean z14 = !z12 ? z13 : !z8;
                ny nyVar = aVar7.o;
                z = nyVar.a;
                z2 = gVar.b;
                boolean z15 = gVar.g;
                if (z != z2 && nyVar.b == gVar.c && epx.f(aVar7.y, qzb0Var) && umcVar3.b == z8 && z13 == z14 && mfj0Var3.a == z9 && (z10 == z15 || dataLoadState != dataLoadState3)) {
                    t16Var = t16Var2;
                    if (t16Var.c == dataLoadState) {
                        return aVar7;
                    }
                } else {
                    t16Var = t16Var2;
                }
                return z2d.a.a(aVar7, null, mfj0.a(mfj0Var3, z9, gVar.i, null, 10), null, new umc(z14, z8, true), false, false, false, false, null, ny.a(aVar7.o, gVar.b, gVar.c, null, null, null, 28), false, null, null, null, null, null, false, false, qzb0Var, t16.a(t16Var, z10 ? z15 : true, dataLoadState, null, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), null, null, 486522559);
            }
            dataLoadState = dataLoadState3;
            boolean z122 = umcVar3.b;
            boolean z132 = umcVar3.a;
            if (!z122) {
            }
            ny nyVar2 = aVar7.o;
            z = nyVar2.a;
            z2 = gVar.b;
            boolean z152 = gVar.g;
            if (z != z2) {
            }
            t16Var = t16Var2;
            return z2d.a.a(aVar7, null, mfj0.a(mfj0Var3, z9, gVar.i, null, 10), null, new umc(z14, z8, true), false, false, false, false, null, ny.a(aVar7.o, gVar.b, gVar.c, null, null, null, 28), false, null, null, null, null, null, false, false, qzb0Var, t16.a(t16Var, z10 ? z152 : true, dataLoadState, null, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), null, null, 486522559);
        }
        boolean z16 = true;
        if (clipItemPatch2 instanceof ClipItemPatch.n) {
            ClipItemPatch.n nVar = (ClipItemPatch.n) clipItemPatch2;
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z17 = nVar.b;
            boolean z18 = !z17;
            z2d.a aVar8 = (z2d.a) z2dVar2;
            umc umcVar4 = aVar8.i;
            if (umcVar4.a != z18) {
                return z2d.a.a(aVar8, null, null, null, new umc(z18, z17 ? true : umcVar4.b, false), false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, null, null, null, 536870655);
            }
            return aVar8;
        }
        if (clipItemPatch2 instanceof ClipItemPatch.ActionButton) {
            ClipItemPatch.ActionButton actionButton = (ClipItemPatch.ActionButton) clipItemPatch2;
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (actionButton instanceof ClipItemPatch.ActionButton.b) {
                z2d.a aVar9 = (z2d.a) z2dVar2;
                ClipItemPatch.ActionButton.b bVar3 = (ClipItemPatch.ActionButton.b) actionButton;
                return !epx.f(aVar9.o.c, bVar3.b) ? z2d.a.a(aVar9, null, null, null, null, false, false, false, false, null, ny.a(aVar9.o, false, false, bVar3.b, null, null, 27), false, null, null, null, null, null, false, false, null, null, null, null, 536854527) : aVar9;
            }
            if (actionButton instanceof ClipItemPatch.ActionButton.a) {
                z2d.a aVar10 = (z2d.a) z2dVar2;
                ny nyVar3 = aVar10.o;
                ClipItemPatch.ActionButton.a aVar11 = (ClipItemPatch.ActionButton.a) actionButton;
                return (epx.f(nyVar3.d, aVar11.b) && epx.f(nyVar3.e, aVar11.c)) ? aVar10 : z2d.a.a(aVar10, null, null, null, null, false, false, false, false, null, ny.a(aVar10.o, false, false, null, aVar11.b, aVar11.c, 7), false, null, null, null, null, null, false, false, null, null, null, null, 536854527);
            }
            if (actionButton != ClipItemPatch.ActionButton.Show.INACTIVE) {
                if (actionButton != ClipItemPatch.ActionButton.Show.ACTIVE) {
                    throw new NoWhenBranchMatchedException();
                }
                z2d.a aVar12 = (z2d.a) z2dVar2;
                SdkActionLink m12 = aVar12.b.a.m1();
                boolean f = epx.f(m12 != null ? m12.e : null, "clips_trend");
                qzb0.a aVar13 = aVar12.y.a;
                boolean z19 = (aVar13.a || !f) && !aVar13.b;
                ny nyVar4 = aVar12.o;
                return ((nyVar4.a || !z19) && nyVar4.b) ? aVar12 : z2d.a.a(aVar12, null, null, null, null, false, false, false, false, null, ny.a(nyVar4, z19, true, null, null, null, 28), false, null, null, null, null, null, false, false, null, null, null, null, 536854527);
            }
            z2d.a aVar14 = (z2d.a) z2dVar2;
            SdkActionLink m13 = aVar14.b.a.m1();
            boolean f2 = epx.f(m13 != null ? m13.e : null, "clips_trend");
            qzb0.a aVar15 = aVar14.y.a;
            if ((!aVar15.a && f2) || aVar15.b) {
                z16 = false;
            }
            ny nyVar5 = aVar14.o;
            return (nyVar5.a || !z16) ? aVar14 : z2d.a.a(aVar14, null, null, null, null, false, false, false, false, null, ny.a(nyVar5, true, false, null, null, null, 30), false, null, null, null, null, null, false, false, null, null, null, null, 536854527);
        }
        if (clipItemPatch2 instanceof ClipItemPatch.o) {
            ClipItemPatch.o oVar = (ClipItemPatch.o) clipItemPatch2;
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z2d.a aVar16 = (z2d.a) z2dVar2;
            boolean z20 = aVar16.p;
            boolean z21 = oVar.b;
            return z20 != z21 ? z2d.a.a(aVar16, null, null, null, null, false, false, false, false, null, null, z21, null, null, null, null, null, false, false, null, null, null, null, 536838143) : aVar16;
        }
        if (clipItemPatch2 instanceof ClipItemPatch.s) {
            ClipItemPatch.s sVar = (ClipItemPatch.s) clipItemPatch2;
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z2d.a aVar17 = (z2d.a) z2dVar2;
            return !epx.f(aVar17.q, sVar.b) ? z2d.a.a(aVar17, null, null, null, null, false, false, false, false, null, null, false, sVar.b, null, null, null, null, false, false, null, null, null, null, 536805375) : aVar17;
        }
        if (clipItemPatch2 instanceof ClipItemPatch.r) {
            ClipItemPatch.r rVar = (ClipItemPatch.r) clipItemPatch2;
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z2d.a aVar18 = (z2d.a) z2dVar2;
            boolean z22 = aVar18.k;
            boolean z23 = rVar.b;
            return z22 != z23 ? z2d.a.a(aVar18, null, null, null, null, false, z23, false, false, null, null, false, null, null, null, null, null, false, false, null, null, null, null, 536869887) : aVar18;
        }
        if (clipItemPatch2 instanceof ClipItemPatch.q) {
            ClipItemPatch.q qVar = (ClipItemPatch.q) clipItemPatch2;
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z2d.a aVar19 = (z2d.a) z2dVar2;
            boolean z24 = aVar19.l;
            boolean z25 = qVar.b;
            return z24 != z25 ? z2d.a.a(aVar19, null, null, null, null, false, false, z25, false, null, null, false, null, null, null, null, null, false, false, null, null, null, null, 536868863) : aVar19;
        }
        if (clipItemPatch2 instanceof ClipItemPatch.l) {
            ClipItemPatch.l lVar = (ClipItemPatch.l) clipItemPatch2;
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z2d.a aVar20 = (z2d.a) z2dVar2;
            boolean z26 = aVar20.j;
            boolean z27 = lVar.b;
            return z26 != z27 ? z2d.a.a(aVar20, null, null, null, null, z27, false, false, false, null, null, false, null, null, null, null, null, false, false, null, null, null, null, 536870399) : aVar20;
        }
        if (clipItemPatch2 instanceof ClipItemPatch.d) {
            ClipItemPatch.d dVar = (ClipItemPatch.d) clipItemPatch2;
            this.h.getClass();
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (dVar instanceof ClipItemPatch.d.b) {
                aVar = (z2d.a) z2dVar2;
                wws wwsVar = aVar.u;
                SdkVideoFile sdkVideoFile = ((ClipItemPatch.d.b) dVar).b;
                sws swsVar = wwsVar.a;
                boolean z28 = true;
                if ((swsVar instanceof sws.a) && ((sws.a) swsVar).a.equals(sdkVideoFile)) {
                    z28 = false;
                }
                sws.a aVar21 = new sws.a(sdkVideoFile);
                if (z28) {
                    return z2d.a.a(aVar, null, null, null, null, false, false, false, false, null, null, false, null, null, null, new wws(aVar21, wwsVar.b), null, false, false, null, null, null, null, 535822335);
                }
            } else {
                if (!(dVar instanceof ClipItemPatch.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = (z2d.a) z2dVar2;
                wws wwsVar2 = aVar.u;
                boolean z29 = wwsVar2.b;
                boolean z30 = ((ClipItemPatch.d.a) dVar).b;
                if (z29 != z30) {
                    return z2d.a.a(aVar, null, null, null, null, false, false, false, false, null, null, false, null, null, null, new wws(wwsVar2.a, z30), null, false, false, null, null, null, null, 535822335);
                }
            }
            return aVar;
        }
        if (clipItemPatch2 instanceof ClipItemPatch.UpdateSnapFocused) {
            ClipItemPatch.UpdateSnapFocused updateSnapFocused = (ClipItemPatch.UpdateSnapFocused) clipItemPatch2;
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (updateSnapFocused != ClipItemPatch.UpdateSnapFocused.FOCUSED) {
                z16 = false;
            }
            z2d.a aVar22 = (z2d.a) z2dVar2;
            return aVar22.w != z16 ? z2d.a.a(aVar22, null, null, null, null, false, false, false, false, null, null, false, null, null, null, null, null, z16, false, null, null, null, null, 532676607) : aVar22;
        }
        if (clipItemPatch2 instanceof ClipItemPatch.UpdateItemViewFocused) {
            ClipItemPatch.UpdateItemViewFocused updateItemViewFocused = (ClipItemPatch.UpdateItemViewFocused) clipItemPatch2;
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ClipItemPatch.UpdateItemViewFocused updateItemViewFocused2 = ClipItemPatch.UpdateItemViewFocused.FOCUSED;
            boolean z31 = updateItemViewFocused == updateItemViewFocused2;
            boolean z32 = z31 ? ((z2d.a) z2dVar2).m : false;
            z2d.a aVar23 = (z2d.a) z2dVar2;
            if (aVar23.x == z31 && aVar23.m == z32) {
                return aVar23;
            }
            m0d m0dVar5 = aVar23.b;
            if (updateItemViewFocused != updateItemViewFocused2) {
                z16 = false;
            }
            SdkClipVideoFile sdkClipVideoFile3 = m0dVar5.a;
            t80 t80Var3 = m0dVar5.j;
            t80 a3 = this.d.a(sdkClipVideoFile3.a1(), t80Var3, z16);
            if (!epx.f(t80Var3, a3)) {
                m0dVar5 = m0d.a(m0dVar5, a3);
            }
            return z2d.a.a(aVar23, m0dVar5, null, null, null, false, false, false, z32, null, null, false, null, null, null, null, null, false, z31, null, null, null, null, 528478206);
        }
        if (clipItemPatch2 instanceof ClipItemPatch.k) {
            ClipItemPatch.k kVar = (ClipItemPatch.k) clipItemPatch2;
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z2d.a aVar24 = (z2d.a) z2dVar2;
            return !epx.f(aVar24.v, kVar.b) ? z2d.a.a(aVar24, null, null, null, null, false, false, false, false, null, null, false, null, null, null, null, kVar.b, false, false, null, null, null, null, 534773759) : aVar24;
        }
        if (clipItemPatch2 instanceof ClipItemPatch.j) {
            ClipItemPatch.j jVar = (ClipItemPatch.j) clipItemPatch2;
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z2d.a aVar25 = (z2d.a) z2dVar2;
            return !epx.f(aVar25.z, jVar.b) ? z2d.a.a(aVar25, null, null, null, null, false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, jVar.b, null, null, 503316479) : aVar25;
        }
        if (clipItemPatch2 instanceof ClipItemPatch.f) {
            ClipItemPatch.f fVar = (ClipItemPatch.f) clipItemPatch2;
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z33 = fVar.b;
            boolean z34 = fVar.c;
            boolean z35 = !z33;
            z2d.a aVar26 = (z2d.a) z2dVar2;
            umc umcVar5 = aVar26.i;
            return (umcVar5.a == z35 && umcVar5.b == z34) ? aVar26 : z2d.a.a(aVar26, null, null, null, new umc(z35, z34, false), false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, null, null, null, 536870655);
        }
        if (clipItemPatch2 instanceof n2d) {
            return k(z2dVar2);
        }
        if (clipItemPatch2 instanceof m2d) {
            return j(z2dVar2);
        }
        if (clipItemPatch2 instanceof o2d) {
            return l(z2dVar2, (o2d) clipItemPatch2);
        }
        if (clipItemPatch2 instanceof p2d) {
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            if (!(z2dVar2 instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z2d.a aVar27 = (z2d.a) z2dVar2;
            t16 t16Var3 = aVar27.z;
            DataLoadState dataLoadState4 = t16Var3.c;
            DataLoadState dataLoadState5 = DataLoadState.DATA_TRIED_TO_LOAD;
            return dataLoadState4 != dataLoadState5 ? z2d.a.a(aVar27, null, null, null, null, false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, t16.a(t16Var3, false, dataLoadState5, null, 123), null, null, 503316479) : aVar27;
        }
        if (clipItemPatch2 instanceof ClipItemPatch.i) {
            return q(z2dVar2, (ClipItemPatch.i) clipItemPatch2);
        }
        if (clipItemPatch2 instanceof ClipItemPatch.p) {
            return o(z2dVar2);
        }
        if (clipItemPatch2 instanceof ClipItemPatch.m) {
            return m(z2dVar2);
        }
        if (!(clipItemPatch2 instanceof ClipItemPatch.h)) {
            if (clipItemPatch2 instanceof ClipItemPatch.g) {
                return n(z2dVar2, (ClipItemPatch.g) clipItemPatch2);
            }
            if (clipItemPatch2 instanceof ClipItemPatch.a) {
                return i(z2dVar2, (ClipItemPatch.a) clipItemPatch2);
            }
            if (clipItemPatch2 instanceof q2d) {
                return p(z2dVar2, (q2d) clipItemPatch2);
            }
            throw new NoWhenBranchMatchedException();
        }
        ClipItemPatch.h hVar = (ClipItemPatch.h) clipItemPatch2;
        if (!(z2dVar2 instanceof z2d.a)) {
            if (z2dVar2 instanceof z2d.b) {
                return z2dVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        z2d.a aVar28 = (z2d.a) z2dVar2;
        m0d m0dVar6 = aVar28.b;
        Boolean Q = m0dVar6.a.Q();
        boolean z36 = hVar.b;
        if (!epx.f(Q, Boolean.valueOf(z36))) {
            m0dVar6.a.xa(z36);
            m0dVar6.b().xa(z36);
        }
        return aVar28;
    }

    @Override // xsna.dm50
    public final y6d d() {
        return new y6d(e(new za(this, 29)), e(new tm0(this, 23)), e(new g60(this, 25)));
    }

    @Override // xsna.dm50
    public final void h(z2d z2dVar, y6d y6dVar) {
        z2d z2dVar2 = z2dVar;
        y6d y6dVar2 = y6dVar;
        f(y6dVar2.c, z2dVar2);
        if (z2dVar2 instanceof z2d.a) {
            f(y6dVar2.a, z2dVar2);
            f(y6dVar2.b, z2dVar2);
        }
    }

    public final z2d i(z2d z2dVar, ClipItemPatch.a aVar) {
        boolean z = aVar instanceof ClipItemPatch.a.b;
        v5e v5eVar = this.d;
        if (z) {
            String str = ((ClipItemPatch.a.b) aVar).b;
            ConcurrentHashMap<String, t80> concurrentHashMap = v5eVar.a;
            t80 t80Var = concurrentHashMap.get(str);
            if (t80Var != null && !t80Var.c()) {
                t80 b = t80Var.b();
                if (!b.equals(t80Var)) {
                    concurrentHashMap.put(str, b);
                }
                t80Var = b;
            }
            if (z2dVar instanceof z2d.a) {
                z2d.a aVar2 = (z2d.a) z2dVar;
                return !epx.f(aVar2.b.j, t80Var) ? z2d.a.a(aVar2, m0d.a(aVar2.b, t80Var), null, null, null, false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, null, null, null, 536870910) : aVar2;
            }
            if (z2dVar instanceof z2d.b) {
                return z2dVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(aVar instanceof ClipItemPatch.a.C0658a)) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = ((ClipItemPatch.a.C0658a) aVar).b;
        ConcurrentHashMap<String, t80> concurrentHashMap2 = v5eVar.a;
        t80 t80Var2 = concurrentHashMap2.get(str2);
        if (t80Var2 != null && !t80Var2.c()) {
            t80 b2 = t80Var2.b();
            if (!b2.equals(t80Var2)) {
                concurrentHashMap2.put(str2, b2);
            }
            t80Var2 = b2;
        }
        if (z2dVar instanceof z2d.a) {
            z2d.a aVar3 = (z2d.a) z2dVar;
            return !epx.f(aVar3.b.j, t80Var2) ? z2d.a.a(aVar3, m0d.a(aVar3.b, t80Var2), null, null, null, false, false, false, false, null, null, false, null, null, null, null, null, false, false, null, null, null, null, 536870910) : aVar3;
        }
        if (z2dVar instanceof z2d.b) {
            return z2dVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
