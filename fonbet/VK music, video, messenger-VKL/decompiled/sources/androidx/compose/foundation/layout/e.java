package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import xsna.c540;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.ejk;
import xsna.er;
import xsna.izs;
import xsna.jai;
import xsna.joy;
import xsna.k9q0;
import xsna.n34;
import xsna.ozl;
import xsna.p490;
import xsna.q630;
import xsna.qri;
import xsna.sy90;
import xsna.tra0;
import xsna.ty6;
import xsna.wzs;
import xsna.zg7;
import xsna.zo10;

/* compiled from: FlowLayout.kt */
/* loaded from: classes11.dex */
public final class e {
    public static final /* synthetic */ int a = 0;

    static {
        dt1.a.getClass();
        new ejk.c(dt1.a.k);
        new ejk.b(dt1.a.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, a.e eVar, a.n nVar, dt1.c cVar, int i, int i2, final jai jaiVar, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        q630 q630Var2;
        int i5;
        a.e eVar2;
        int i6;
        int i7;
        int i8;
        int i9;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final int i10;
        final a.e eVar3;
        final a.n nVar2;
        final dt1.c cVar2;
        final int i11;
        androidx.compose.runtime.f s;
        int i12;
        a.n nVar3;
        androidx.compose.runtime.a M = aVar.M(-1303174015);
        int i13 = i4 & 1;
        if (i13 != 0) {
            i5 = i3 | 6;
            q630Var2 = q630Var;
        } else if ((i3 & 6) == 0) {
            q630Var2 = q630Var;
            i5 = (M.J(q630Var2) ? 4 : 2) | i3;
        } else {
            q630Var2 = q630Var;
            i5 = i3;
        }
        int i14 = i4 & 2;
        if (i14 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            eVar2 = eVar;
            i5 |= M.J(eVar2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                i5 |= M.J(nVar) ? 256 : 128;
                int i15 = i5 | 3072;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i15 = i5 | 27648;
                } else if ((i3 & 24576) == 0) {
                    i8 = i;
                    i15 |= M.o(i8) ? 16384 : 8192;
                    i9 = i15 | 196608;
                    if ((i3 & 1572864) == 0) {
                        i9 |= M.y(jaiVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    if (M.t(i9 & 1, (599187 & i9) == 599186)) {
                        aVar2 = M;
                        aVar2.h();
                        q630Var3 = q630Var2;
                        i10 = i8;
                        eVar3 = eVar2;
                        nVar2 = nVar;
                        cVar2 = cVar;
                        i11 = i2;
                    } else {
                        q630 q630Var4 = i13 != 0 ? q630.a.a : q630Var2;
                        if (i14 != 0) {
                            eVar2 = a.a;
                        }
                        if (i6 != 0) {
                            nVar3 = a.c;
                            i12 = i7;
                        } else {
                            i12 = i7;
                            nVar3 = nVar;
                        }
                        dt1.a.getClass();
                        ty6.b bVar = dt1.a.k;
                        int i16 = i12 != 0 ? Integer.MAX_VALUE : i8;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1303174015, i9, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        int i17 = (i9 & 14) | 1572864 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | ((i9 << 3) & 29360128);
                        aVar2 = M;
                        a.e eVar4 = eVar2;
                        b(q630Var4, eVar4, nVar3, bVar, i16, i.b, jaiVar, aVar2, i17);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        i11 = Integer.MAX_VALUE;
                        q630Var3 = q630Var4;
                        eVar3 = eVar4;
                        nVar2 = nVar3;
                        cVar2 = bVar;
                        i10 = i16;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.cur
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                androidx.compose.foundation.layout.e.a(q630.this, eVar3, nVar2, cVar2, i10, i11, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1), i4);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i8 = i;
                i9 = i15 | 196608;
                if ((i3 & 1572864) == 0) {
                }
                if (M.t(i9 & 1, (599187 & i9) == 599186)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            int i152 = i5 | 3072;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            i8 = i;
            i9 = i152 | 196608;
            if ((i3 & 1572864) == 0) {
            }
            if (M.t(i9 & 1, (599187 & i9) == 599186)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        eVar2 = eVar;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        int i1522 = i5 | 3072;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        i8 = i;
        i9 = i1522 | 196608;
        if ((i3 & 1572864) == 0) {
        }
        if (M.t(i9 & 1, (599187 & i9) == 599186)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    @ozl
    public static final void b(final q630 q630Var, final a.e eVar, final a.n nVar, final dt1.c cVar, final int i, final i iVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        androidx.compose.runtime.a M = aVar.M(-1956591841);
        if ((i2 & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(nVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(cVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.o(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.o(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= M.J(iVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= M.y(jaiVar) ? 8388608 : 4194304;
        }
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1956591841, i3, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
            }
            int i7 = 3670016 & i3;
            boolean z2 = i7 == 1048576;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new f(iVar.a);
                M.R(x);
            }
            f fVar = (f) x;
            int i8 = i3 >> 3;
            int i9 = i8 & 65534;
            if (androidx.compose.runtime.b.d()) {
                i4 = i7;
                i5 = i3;
                androidx.compose.runtime.b.f(-2010142641, i9, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:470)");
            } else {
                i4 = i7;
                i5 = i3;
            }
            boolean J = ((((i8 & 14) ^ 6) > 4 && M.J(eVar)) || (i8 & 6) == 4) | ((((i8 & 112) ^ 48) > 32 && M.J(nVar)) || (i8 & 48) == 32) | ((((i8 & 896) ^ 384) > 256 && M.J(cVar)) || (i8 & 384) == 256) | ((((i8 & 7168) ^ 3072) > 2048 && M.o(i)) || (i8 & 3072) == 2048) | ((((57344 & i8) ^ 24576) > 16384 && M.o(Integer.MAX_VALUE)) || (i8 & 24576) == 16384) | M.J(fVar);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                i6 = i4;
                z = true;
                h hVar = new h(eVar, nVar, eVar.a(), new ejk.c(cVar), nVar.a(), i, fVar);
                M.R(hVar);
                x2 = hVar;
            } else {
                i6 = i4;
                z = true;
            }
            h hVar2 = (h) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean z3 = ((i5 & 29360128) == 8388608 ? z : false) | (i6 == 1048576 ? z : false) | ((i5 & 458752) == 131072 ? z : false);
            Object x3 = M.x();
            Object obj = x3;
            if (z3 || x3 == c0012a) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new jai(-1192950673, new zg7(jaiVar, 7), z));
                iVar.getClass();
                int i10 = FlowLayoutOverflow.a.$EnumSwitchMapping$0[iVar.a.ordinal()];
                M.R(arrayList);
                obj = arrayList;
            }
            jai b = joy.b((List) obj);
            boolean J2 = M.J(hVar2);
            Object x4 = M.x();
            if (J2 || x4 == c0012a) {
                x4 = new c540(hVar2);
                M.R(x4);
            }
            cp10 cp10Var = (cp10) x4;
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, cp10Var, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (er.f(0, M, b)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.dur
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    androidx.compose.foundation.layout.e.b(q630.this, eVar, nVar, cVar, i, iVar, jaiVar, (androidx.compose.runtime.a) obj2, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(zo10 zo10Var, h hVar, long j, izs izsVar) {
        if (p490.q(p490.o(zo10Var)) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            zo10Var.j0(zo10Var.M(Integer.MAX_VALUE));
            return;
        }
        p490.o(zo10Var);
        tra0 N = zo10Var.N(j);
        izsVar.invoke(N);
        hVar.h(N);
        hVar.d(N);
    }
}
