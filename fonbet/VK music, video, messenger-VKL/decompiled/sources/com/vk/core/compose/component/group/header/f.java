package com.vk.core.compose.component.group.header;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.k;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import xsna.alb0;
import xsna.cri;
import xsna.dt1;
import xsna.esx0;
import xsna.fku;
import xsna.frv0;
import xsna.ht1;
import xsna.in20;
import xsna.izs;
import xsna.j8k;
import xsna.jgz;
import xsna.k9q0;
import xsna.kai;
import xsna.n34;
import xsna.oq;
import xsna.pt6;
import xsna.q630;
import xsna.qri;
import xsna.rrv0;
import xsna.sag;
import xsna.sy90;
import xsna.tpg0;
import xsna.wh50;
import xsna.ylu0;
import xsna.yqv0;
import xsna.zak0;
import xsna.zju;
import xsna.zzs;

/* compiled from: GroupHeader.kt */
/* loaded from: classes17.dex */
public final class f {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;

    /* compiled from: GroupHeader.kt */
    public static final class a {
        public static f a(String str, e eVar, d dVar, com.vk.core.compose.component.group.header.c cVar, c cVar2, zju zjuVar, com.vk.core.compose.component.semantics.a aVar, b bVar, boolean z, androidx.compose.runtime.a aVar2, int i, int i2) {
            e eVar2 = (i2 & 2) != 0 ? null : eVar;
            d dVar2 = (i2 & 4) != 0 ? null : dVar;
            com.vk.core.compose.component.group.header.c cVar3 = (i2 & 8) != 0 ? null : cVar;
            c cVar4 = (i2 & 16) != 0 ? null : cVar2;
            zju zjuVar2 = (i2 & 32) != 0 ? null : zjuVar;
            com.vk.core.compose.component.semantics.a aVar3 = (i2 & 64) != 0 ? null : aVar;
            b bVar2 = (i2 & 128) != 0 ? b.a.a : bVar;
            boolean z2 = (i2 & 256) != 0 ? false : z;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1408749644, i, -1, "com.vk.core.compose.component.group.header.GroupHeader.Title.Companion.invoke (GroupHeader.kt:428)");
            }
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                f fVar = new f(str, eVar2, dVar2, cVar3, cVar4, zjuVar2, aVar3, bVar2, z2);
                aVar2.R(fVar);
                x = fVar;
            }
            f fVar2 = (f) x;
            ((zak0) fVar2.a).setValue(str);
            ((zak0) fVar2.b).setValue(eVar2);
            ((zak0) fVar2.c).setValue(dVar2);
            ((zak0) fVar2.d).setValue(cVar3);
            ((zak0) fVar2.e).setValue(cVar4);
            ((zak0) fVar2.f).setValue(zjuVar2);
            ((zak0) fVar2.g).setValue(aVar3);
            ((zak0) fVar2.h).setValue(bVar2);
            ((zak0) fVar2.i).setValue(Boolean.valueOf(z2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return fVar2;
        }
    }

    /* compiled from: GroupHeader.kt */
    public interface b {

        /* compiled from: GroupHeader.kt */
        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1401624911;
            }

            public final String toString() {
                return "OneLine";
            }
        }
    }

    /* compiled from: GroupHeader.kt */
    public static final class c {
        public final wh50 a = k.b("2.3K донов");
        public final wh50 b = k.b(null);

        public final void a(int i, androidx.compose.runtime.a aVar, com.vk.core.compose.component.group.header.b bVar, b bVar2) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-899406096);
            if ((i & 6) == 0) {
                i2 = (M.J(bVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(bVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(q630.a.a) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= M.J(this) ? 2048 : 1024;
            }
            if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-899406096, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Title.TitleSecondary.Content (GroupHeader.kt:384)");
                }
                if (oq.h(2077236626, M)) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new fku(this, bVar, bVar2, i);
            }
        }
    }

    public f(String str, e eVar, d dVar, com.vk.core.compose.component.group.header.c cVar, c cVar2, zju zjuVar, SemanticsConfiguration semanticsConfiguration, b bVar, boolean z) {
        this.a = k.b(str);
        this.b = k.b(eVar);
        this.c = k.b(dVar);
        this.d = k.b(cVar);
        this.e = k.b(cVar2);
        this.f = k.b(zjuVar);
        this.g = k.b(semanticsConfiguration);
        this.h = k.b(bVar);
        this.i = k.b(Boolean.valueOf(z));
    }

    public final void a(com.vk.core.compose.component.group.header.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1607484940);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1607484940, i3, -1, "com.vk.core.compose.component.group.header.GroupHeader.Title.Content (GroupHeader.kt:143)");
            }
            q630 b2 = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.g).getValue());
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f = jgz.s().a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.n), dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            b(bVar, M, ((i3 << 3) & 112) | 6 | ((i3 >> 3) & 896));
            M.K(1386114016);
            e eVar = (e) ((zak0) this.b).getValue();
            wh50 wh50Var = this.h;
            if (eVar == null) {
                M.K(19887887);
            } else {
                M.K(19887888);
                eVar.a((i3 & 896) | 54 | ((i3 << 12) & 57344), M, bVar, (b) ((zak0) wh50Var).getValue());
            }
            M.j();
            M.j();
            d dVar = (d) ((zak0) this.c).getValue();
            if (dVar == null) {
                M.K(19989629);
            } else {
                M.K(19989630);
                dVar.a(new esx0(ht1.a), (b) ((zak0) wh50Var).getValue(), bVar, M, (i3 & 896) | 6 | ((i3 << 12) & 57344));
            }
            M.j();
            M.K(13354762);
            M.j();
            c cVar = (c) ((zak0) this.e).getValue();
            if (cVar == null) {
                M.K(20281463);
            } else {
                M.K(20281464);
                cVar.a((i3 & 14) | 384, M, bVar, (b) ((zak0) wh50Var).getValue());
            }
            M.j();
            com.vk.core.compose.component.group.header.c cVar2 = (com.vk.core.compose.component.group.header.c) ((zak0) this.d).getValue();
            if (cVar2 == null) {
                M.K(20385871);
            } else {
                M.K(20385872);
                cVar2.a(((i3 << 12) & 57344) | (i3 & 896) | 54, M, bVar, (b) ((zak0) wh50Var).getValue());
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j8k(this, bVar, q630Var, i, 2);
        }
    }

    public final void b(final com.vk.core.compose.component.group.header.b bVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1190508573);
        if ((i & 6) == 0) {
            i2 = (M.J(tpg0.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1190508573, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Title.TextContent (GroupHeader.kt:166)");
            }
            zju zjuVar = (zju) ((zak0) this.f).getValue();
            if (zjuVar == null) {
                M.K(1399179005);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new com.vk.movika.sdk.base.logic.interactor.f(29);
                    M.R(x);
                }
                c(bVar, (izs) x, M, ((i2 << 3) & 7168) | (i2 & 14) | 384 | (i2 & 112));
                M.j();
            } else {
                M.K(1399253002);
                zjuVar.a(6, M, kai.c(-2033524209, new zzs() { // from class: xsna.dku
                    @Override // xsna.zzs
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        izs izsVar = (izs) obj;
                        ((Boolean) obj2).getClass();
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        if ((intValue & 6) == 0) {
                            intValue |= aVar2.y(izsVar) ? 4 : 2;
                        }
                        if (aVar2.t(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-2033524209, intValue, -1, "com.vk.core.compose.component.group.header.GroupHeader.Title.TextContent.<anonymous> (GroupHeader.kt:172)");
                            }
                            com.vk.core.compose.component.group.header.f.this.c(bVar, izsVar, aVar2, (intValue << 6) & 896);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, M));
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sag(this, bVar, i, 2);
        }
    }

    public final void c(com.vk.core.compose.component.group.header.b bVar, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        long j;
        androidx.compose.runtime.a M = aVar.M(-1130075913);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1130075913, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Title.TitleText (GroupHeader.kt:178)");
            }
            M.K(((Boolean) ((zak0) this.i).getValue()).booleanValue() ? 623777949 : -2137718824);
            M.j();
            M.K(-2137143800);
            q630 c2 = tpg0Var.c(q630.a.a);
            String str = (String) ((zak0) this.a).getValue();
            int i4 = (i2 >> 3) & 14;
            jgz.s().getClass();
            M.K(-825244973);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-825244973, i4, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeGroupHeaderDefaults.titleTextColor (MilkshakeGroupHeaderDefaults.kt:39)");
            }
            if (bVar instanceof b.a) {
                M.K(1508534846);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getText().m;
                M.j();
            } else if (bVar instanceof b.C0749b) {
                M.K(1508536670);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getText().m;
                M.j();
            } else if (bVar instanceof b.c) {
                M.K(1508538526);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var3.getText().m;
                M.j();
            } else {
                if (!(bVar instanceof b.d)) {
                    throw alb0.c(1508533042, M);
                }
                M.K(1508540352);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var4.getText().p;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            frv0 b2 = jgz.s().b(bVar, M, i4);
            in20 s = jgz.s();
            s.getClass();
            M.K(-1763232049);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1763232049, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeGroupHeaderDefaults.titleLinesNumber (MilkshakeGroupHeaderDefaults.kt:55)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            yqv0.c(str, c2, j, null, null, 0, 0, null, 2, false, 0, Integer.MAX_VALUE, izsVar, b2, M, 100663296, i2 & 896, 1784);
            aVar2 = M;
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new pt6(i, 2, this, bVar, izsVar);
        }
    }
}
