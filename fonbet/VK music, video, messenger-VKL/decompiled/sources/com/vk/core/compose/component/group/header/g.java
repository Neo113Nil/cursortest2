package com.vk.core.compose.component.group.header;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.group.header.b;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.aku;
import xsna.cku;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.ijv0;
import xsna.ja8;
import xsna.jgz;
import xsna.k9q0;
import xsna.kqu0;
import xsna.kr;
import xsna.n34;
import xsna.o19;
import xsna.pco;
import xsna.q630;
import xsna.qri;
import xsna.ra8;
import xsna.s200;
import xsna.sy90;
import xsna.szw;
import xsna.txj0;
import xsna.ur;
import xsna.viu0;
import xsna.wzs;
import xsna.xpy;
import xsna.zak0;

/* compiled from: VkGroupHeader.kt */
/* loaded from: classes17.dex */
public final class g {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final a aVar, q630 q630Var, b bVar, aku akuVar, GroupHeader$Right groupHeader$Right, boolean z, androidx.compose.runtime.a aVar2, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        b bVar2;
        int i5;
        int i6;
        GroupHeader$Right groupHeader$Right2;
        int i7;
        boolean z2;
        int i8;
        final aku akuVar2;
        final q630 q630Var3;
        final b bVar3;
        final GroupHeader$Right groupHeader$Right3;
        final boolean z3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar2.M(-1837332799);
        if ((i & 6) == 0) {
            i3 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= M.J(bVar2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= M.J(akuVar) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        groupHeader$Right2 = groupHeader$Right;
                        i3 |= M.J(groupHeader$Right2) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((196608 & i) == 0) {
                            z2 = z;
                            i3 |= M.l(z2) ? 131072 : 65536;
                            i8 = i3 | 1572864;
                            if (M.t(i8 & 1, (i8 & 599187) == 599186)) {
                                M.h();
                                akuVar2 = akuVar;
                                q630Var3 = q630Var2;
                                bVar3 = bVar2;
                                groupHeader$Right3 = groupHeader$Right2;
                                z3 = z2;
                            } else {
                                q630.a aVar3 = q630.a.a;
                                if (i9 != 0) {
                                    q630Var2 = aVar3;
                                }
                                bVar3 = i4 != 0 ? b.C0749b.a : bVar2;
                                aku akuVar3 = i5 != 0 ? null : akuVar;
                                if (i6 != 0) {
                                    groupHeader$Right2 = null;
                                }
                                boolean z4 = i7 != 0 ? false : z2;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1837332799, i8, -1, "com.vk.core.compose.component.group.header.VkGroupHeader (VkGroupHeader.kt:48)");
                                }
                                int i10 = i8 >> 3;
                                dt1.a.getClass();
                                cp10 d = ja8.d(dt1.a.b, false);
                                int hashCode = Long.hashCode(n34.n(M));
                                sy90 D = M.D();
                                q630 c = qri.c(M, q630Var2);
                                cri.h7.getClass();
                                LayoutNode.a aVar4 = cri.a.b;
                                if (M.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                M.H();
                                if (M.L()) {
                                    M.I(aVar4);
                                } else {
                                    M.f();
                                }
                                cri.a.c cVar = cri.a.f;
                                k9q0.w(M, d, cVar);
                                cri.a.e eVar = cri.a.e;
                                k9q0.w(M, D, eVar);
                                Integer valueOf = Integer.valueOf(hashCode);
                                cri.a.b bVar4 = cri.a.g;
                                k9q0.w(M, valueOf, bVar4);
                                cri.a.C2678a c2678a = cri.a.h;
                                k9q0.t(M, c2678a);
                                cri.a.d dVar = cri.a.d;
                                k9q0.w(M, c, dVar);
                                SeparatorAppearance separatorAppearance = SeparatorAppearance.Primary;
                                jgz.s().getClass();
                                SeparatorDpi separatorDpi = SeparatorDpi.At2x;
                                jgz.s().getClass();
                                float f = kqu0.s;
                                q630 q630Var4 = q630Var2;
                                GroupHeader$Right groupHeader$Right4 = groupHeader$Right2;
                                ijv0.a(separatorDpi, separatorAppearance, true, o19.a(ra8.a.b(txj0.f(aVar3, 1.0f), dt1.a.c), z4 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new pco(f), M, Tensorflow.FRAME_WIDTH, 0);
                                q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jgz.s().f, 1, txj0.f(aVar3, 1.0f)));
                                jgz.s().getClass();
                                q630 H = s200.H(F, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                a.l lVar = androidx.compose.foundation.layout.a.a;
                                jgz.s().getClass();
                                k a = j.a(androidx.compose.foundation.layout.a.g(kqu0.v), dt1.a.l, M, 48);
                                int hashCode2 = Long.hashCode(n34.n(M));
                                sy90 D2 = M.D();
                                q630 c2 = qri.c(M, H);
                                if (M.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                M.H();
                                if (M.L()) {
                                    M.I(aVar4);
                                } else {
                                    M.f();
                                }
                                k9q0.w(M, a, cVar);
                                k9q0.w(M, D2, eVar);
                                ur.d(hashCode2, M, bVar4, M, c2678a);
                                k9q0.w(M, c2, dVar);
                                if (akuVar3 == null) {
                                    M.K(1691665541);
                                } else {
                                    M.K(-83977476);
                                    akuVar3.a(((i8 >> 6) & 112) | 6, M);
                                }
                                M.j();
                                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                    szw.a("invalid weight; must be greater than zero");
                                }
                                aVar.a(bVar3, new xpy(1.0f, true), M, ((i8 >> 6) & 14) | ((i8 >> 12) & 896) | ((i8 << 9) & 7168));
                                if (groupHeader$Right4 == null) {
                                    M.K(1691863507);
                                } else {
                                    M.K(1691863508);
                                    groupHeader$Right4.a(bVar3, M, (i10 & 112) | 6);
                                }
                                M.j();
                                if (kr.f(M)) {
                                    androidx.compose.runtime.b.e();
                                }
                                groupHeader$Right3 = groupHeader$Right4;
                                akuVar2 = akuVar3;
                                z3 = z4;
                                q630Var3 = q630Var4;
                            }
                            s = M.s();
                            if (s == null) {
                                s.d = new wzs() { // from class: xsna.gxu0
                                    @Override // xsna.wzs
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        com.vk.core.compose.component.group.header.g.a(com.vk.core.compose.component.group.header.a.this, q630Var3, bVar3, akuVar2, groupHeader$Right3, z3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                        return s3q0.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        z2 = z;
                        i8 = i3 | 1572864;
                        if (M.t(i8 & 1, (i8 & 599187) == 599186)) {
                        }
                        s = M.s();
                        if (s == null) {
                        }
                    }
                    groupHeader$Right2 = groupHeader$Right;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    z2 = z;
                    i8 = i3 | 1572864;
                    if (M.t(i8 & 1, (i8 & 599187) == 599186)) {
                    }
                    s = M.s();
                    if (s == null) {
                    }
                }
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                groupHeader$Right2 = groupHeader$Right;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                z2 = z;
                i8 = i3 | 1572864;
                if (M.t(i8 & 1, (i8 & 599187) == 599186)) {
                }
                s = M.s();
                if (s == null) {
                }
            }
            bVar2 = bVar;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            groupHeader$Right2 = groupHeader$Right;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            z2 = z;
            i8 = i3 | 1572864;
            if (M.t(i8 & 1, (i8 & 599187) == 599186)) {
            }
            s = M.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        bVar2 = bVar;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        groupHeader$Right2 = groupHeader$Right;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        z2 = z;
        i8 = i3 | 1572864;
        if (M.t(i8 & 1, (i8 & 599187) == 599186)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f fVar, q630 q630Var, b bVar, cku ckuVar, aku akuVar, GroupHeader$Right groupHeader$Right, boolean z, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        b bVar2;
        int i5;
        cku ckuVar2;
        int i6;
        int i7;
        GroupHeader$Right groupHeader$Right2;
        int i8;
        aku akuVar2;
        boolean z2;
        q630 q630Var3;
        b bVar3;
        cku ckuVar3;
        androidx.compose.runtime.f s;
        int i9;
        q630 q630Var4;
        int i10;
        aku akuVar3;
        androidx.compose.runtime.a M = aVar.M(-66486097);
        if ((i & 6) == 0) {
            i3 = (M.J(fVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= M.J(bVar2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    ckuVar2 = ckuVar;
                    i3 |= M.J(ckuVar2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= M.J(akuVar) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((196608 & i) == 0) {
                            groupHeader$Right2 = groupHeader$Right;
                            i3 |= M.J(groupHeader$Right2) ? 131072 : 65536;
                            i8 = i2 & 64;
                            if (i8 == 0) {
                                i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                i3 |= M.l(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                            }
                            if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                                M.h();
                                akuVar2 = akuVar;
                                z2 = z;
                                q630Var3 = q630Var2;
                                bVar3 = bVar2;
                                ckuVar3 = ckuVar2;
                            } else {
                                if (i11 != 0) {
                                    q630Var4 = q630.a.a;
                                    i9 = i6;
                                } else {
                                    i9 = i6;
                                    q630Var4 = q630Var2;
                                }
                                b bVar4 = i4 != 0 ? b.C0749b.a : bVar2;
                                ckuVar3 = i5 != 0 ? null : ckuVar2;
                                if (i9 != 0) {
                                    i10 = i7;
                                    akuVar3 = null;
                                } else {
                                    i10 = i7;
                                    akuVar3 = akuVar;
                                }
                                if (i10 != 0) {
                                    groupHeader$Right2 = null;
                                }
                                boolean z3 = i8 != 0 ? false : z;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-66486097, i3, -1, "com.vk.core.compose.component.group.header.VkGroupHeader (VkGroupHeader.kt:100)");
                                }
                                int i12 = (i3 & 14) | 384 | ((i3 >> 6) & 112);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(958254720, i12, -1, "com.vk.core.compose.component.group.header.GroupHeader.Middle.Companion.invoke (GroupHeader.kt:1088)");
                                }
                                Object x = M.x();
                                if (x == a.C0011a.a) {
                                    x = new a(fVar, ckuVar3);
                                    M.R(x);
                                }
                                a aVar2 = (a) x;
                                ((zak0) aVar2.a).setValue(fVar);
                                ((zak0) aVar2.b).setValue(ckuVar3);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                int i13 = i3 & 1008;
                                int i14 = i3 >> 3;
                                a(aVar2, q630Var4, bVar4, akuVar3, groupHeader$Right2, z3, M, i13 | (i14 & 7168) | (57344 & i14) | (i14 & 458752), 64);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                q630Var3 = q630Var4;
                                bVar3 = bVar4;
                                akuVar2 = akuVar3;
                                z2 = z3;
                            }
                            GroupHeader$Right groupHeader$Right3 = groupHeader$Right2;
                            s = M.s();
                            if (s == null) {
                                s.d = new viu0(fVar, q630Var3, bVar3, ckuVar3, akuVar2, groupHeader$Right3, z2, i, i2);
                                return;
                            }
                            return;
                        }
                        groupHeader$Right2 = groupHeader$Right;
                        i8 = i2 & 64;
                        if (i8 == 0) {
                        }
                        if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                        }
                        GroupHeader$Right groupHeader$Right32 = groupHeader$Right2;
                        s = M.s();
                        if (s == null) {
                        }
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    groupHeader$Right2 = groupHeader$Right;
                    i8 = i2 & 64;
                    if (i8 == 0) {
                    }
                    if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                    }
                    GroupHeader$Right groupHeader$Right322 = groupHeader$Right2;
                    s = M.s();
                    if (s == null) {
                    }
                }
                ckuVar2 = ckuVar;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                groupHeader$Right2 = groupHeader$Right;
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                }
                GroupHeader$Right groupHeader$Right3222 = groupHeader$Right2;
                s = M.s();
                if (s == null) {
                }
            }
            bVar2 = bVar;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            ckuVar2 = ckuVar;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            groupHeader$Right2 = groupHeader$Right;
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
            }
            GroupHeader$Right groupHeader$Right32222 = groupHeader$Right2;
            s = M.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        bVar2 = bVar;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        ckuVar2 = ckuVar;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        groupHeader$Right2 = groupHeader$Right;
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
        }
        GroupHeader$Right groupHeader$Right322222 = groupHeader$Right2;
        s = M.s();
        if (s == null) {
        }
    }
}
