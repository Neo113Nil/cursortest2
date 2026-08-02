package com.vk.story.archive.impl.presentation;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.alert.Alert$DismissReason;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.bm3;
import xsna.cri;
import xsna.d370;
import xsna.de1;
import xsna.dt1;
import xsna.e420;
import xsna.fj3;
import xsna.fnj;
import xsna.frv0;
import xsna.gzs;
import xsna.iah0;
import xsna.izs;
import xsna.kai;
import xsna.kld0;
import xsna.l4k0;
import xsna.l5g;
import xsna.lg90;
import xsna.ltl0;
import xsna.m4k0;
import xsna.muv0;
import xsna.oi40;
import xsna.p7u0;
import xsna.pg90;
import xsna.q630;
import xsna.quz;
import xsna.rgl0;
import xsna.rrv0;
import xsna.s200;
import xsna.s3q0;
import xsna.stg0;
import xsna.tcu;
import xsna.txj0;
import xsna.u210;
import xsna.wh50;
import xsna.wuv0;
import xsna.wzs;
import xsna.ylu0;
import xsna.yqv0;
import xsna.z4d0;
import xsna.z6u;
import xsna.zq;

/* compiled from: StoryArchiveTopBar.kt */
/* loaded from: classes6.dex */
public final class a {
    public static final void a(fj3 fj3Var, int i, StoryArchiveFragment.b bVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i2) {
        boolean z;
        a.C0011a.C0012a c0012a;
        TopBar$Before.d dVar;
        int i3;
        TopBar$Before.e eVar;
        int i4;
        androidx.compose.runtime.a aVar2;
        TopBar$Middle.Text a;
        boolean z2;
        androidx.compose.runtime.a aVar3;
        com.vk.core.compose.component.topbar.a a2;
        androidx.compose.runtime.a M = aVar.M(780277033);
        int i5 = i2 | (M.J(fj3Var) ? 4 : 2) | (M.o(i) ? 32 : 16) | (M.J(bVar) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i5 & 1, (i5 & 1171) != 1170)) {
            if (b.d()) {
                b.f(780277033, i5, -1, "com.vk.story.archive.impl.presentation.ArchiveTopBar (StoryArchiveTopBar.kt:77)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            boolean z3 = fj3Var.b;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z3) {
                M.K(870380916);
                String N = d370.N(R.string.accessibility_cancel, 0, M);
                Object x = M.x();
                if (x == c0012a2) {
                    x = new rgl0(3);
                    M.R(x);
                }
                com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
                boolean z4 = (i5 & 896) == 256;
                Object x2 = M.x();
                if (z4 || x2 == c0012a2) {
                    x2 = new kld0(bVar, 9);
                    M.R(x2);
                }
                z = z3;
                c0012a = c0012a2;
                TopBar$Before.d a4 = TopBar$Before.d.a.a(N, (gzs) x2, null, a3, M, 24576, 4);
                M.j();
                dVar = a4;
            } else {
                z = z3;
                c0012a = c0012a2;
                M.K(870699813);
                M.j();
                dVar = null;
            }
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                M.K(870767269);
                M.j();
                i3 = 3;
                eVar = null;
            } else {
                M.K(870802392);
                boolean z5 = (i5 & 896) == 256;
                Object x3 = M.x();
                if (z5 || x3 == c0012a) {
                    x3 = new u210(bVar, 29);
                    M.R(x3);
                }
                gzs gzsVar2 = (gzs) x3;
                String N2 = d370.N(R.string.accessibility_back, 0, M);
                Object x4 = M.x();
                if (x4 == c0012a) {
                    x4 = new e420(24);
                    M.R(x4);
                }
                i3 = 3;
                TopBar$Before.e a5 = e.a.a(gzsVar2, N2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 196608, 12);
                M = M;
                M.j();
                eVar = a5;
            }
            if (z) {
                M.K(871168192);
                androidx.compose.runtime.a aVar4 = M;
                i4 = 23;
                TopBar$Middle.Text.Title a6 = TopBar$Middle.Text.Title.b.a(d370.O(R.string.story_archive_selected_placeholder, new Object[]{Integer.valueOf(i)}, M), null, null, null, null, aVar4, 196608, 30);
                aVar2 = aVar4;
                Object x5 = aVar2.x();
                if (x5 == c0012a) {
                    x5 = new z6u(23);
                    aVar2.R(x5);
                }
                a = TopBar$Middle.Text.b.a(a6, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, i3), aVar2, 6);
                aVar2.j();
            } else {
                i4 = 23;
                M.K(871483400);
                androidx.compose.runtime.a aVar5 = M;
                TopBar$Middle.Text.Title a7 = TopBar$Middle.Text.Title.b.a(d370.N(R.string.story_archive, 0, M), null, null, null, null, aVar5, 196608, 30);
                aVar2 = aVar5;
                Object x6 = aVar2.x();
                if (x6 == c0012a) {
                    x6 = new l4k0(2);
                    aVar2.R(x6);
                }
                a = TopBar$Middle.Text.b.a(a7, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x6, i3), aVar2, 6);
                aVar2.j();
            }
            TopBar$Middle.Text text = a;
            if (z) {
                aVar2.K(871823594);
                lg90 a8 = pg90.a(R.drawable.vk_icon_narrative_outline_28, 0, aVar2);
                String N3 = d370.N(R.string.story_archive_add_to_highlights, 0, aVar2);
                z2 = (i5 & 896) == 256;
                Object x7 = aVar2.x();
                if (z2 || x7 == c0012a) {
                    x7 = new z4d0(bVar, 12);
                    aVar2.R(x7);
                }
                gzs gzsVar3 = (gzs) x7;
                Object x8 = aVar2.x();
                if (x8 == c0012a) {
                    x8 = new m4k0(i3);
                    aVar2.R(x8);
                }
                a.C0011a.C0012a c0012a3 = c0012a;
                androidx.compose.runtime.a aVar6 = aVar2;
                d.c.C0760d a9 = d.c.C0760d.a.a(a8, N3, gzsVar3, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x8, i3), aVar6, 1572872, 24);
                lg90 a10 = pg90.a(R.drawable.vk_icon_delete_outline_28, 0, aVar6);
                String N4 = d370.N(R.string.story_archive_delete, 0, aVar6);
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar6.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                l5g l5gVar = new l5g(ylu0Var.getIcon().h);
                Object x9 = aVar6.x();
                if (x9 == c0012a3) {
                    x9 = new tcu(29);
                    aVar6.R(x9);
                }
                aVar3 = aVar6;
                a2 = d.a.a(a9, d.b.a.C0757a.a(a10, N4, gzsVar, null, l5gVar, com.vk.core.compose.component.semantics.b.a(null, (izs) x9, i3), aVar6, 12582920 | ((i5 >> 3) & 896), 72), null, null, aVar3, 24576, 12);
                aVar3.j();
            } else {
                a.C0011a.C0012a c0012a4 = c0012a;
                aVar2.K(872811719);
                lg90 a11 = pg90.a(R.drawable.vk_icon_add_24, 0, aVar2);
                String N5 = d370.N(R.string.story_archive_publish, 0, aVar2);
                z2 = (i5 & 896) == 256;
                Object x10 = aVar2.x();
                if (z2 || x10 == c0012a4) {
                    x10 = new stg0(bVar, 9);
                    aVar2.R(x10);
                }
                androidx.compose.runtime.a aVar7 = aVar2;
                d.c.C0760d a12 = d.c.C0760d.a.a(a11, N5, (gzs) x10, null, null, null, aVar7, 1572872, 56);
                aVar3 = aVar7;
                Object x11 = aVar3.x();
                if (x11 == c0012a4) {
                    x11 = new quz(i4);
                    aVar3.R(x11);
                }
                a2 = d.a.a(a12, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x11, i3), aVar3, 24576, 6);
                aVar3.j();
            }
            TopBar$Before.d dVar2 = dVar;
            androidx.compose.runtime.a aVar8 = aVar3;
            muv0.h(text, null, null, null, eVar, dVar2, a2, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar8, 0, 0, 8078);
            M = aVar8;
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new de1(fj3Var, i, bVar, gzsVar, i2);
        }
    }

    public static final void b(izs<? super Alert$DismissReason, s3q0> izsVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1044092452);
        int i2 = i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (b.d()) {
                b.f(1044092452, i2, -1, "com.vk.story.archive.impl.presentation.DeleteAlert (StoryArchiveTopBar.kt:183)");
            }
            String N = d370.N(R.string.story_archive_delete_confirm_message, 0, M);
            String N2 = d370.N(R.string.delete, 0, M);
            String N3 = d370.N(R.string.cancel, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new oi40(20);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new ltl0(1);
                M.R(x2);
            }
            p7u0.e(N, "", N2, izsVar, gzsVar, null, N3, null, null, a, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, gzsVar2, M, 3120 | ((i2 << 9) & 57344), 384, 2464);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new bm3(i, 2, izsVar, gzsVar, gzsVar2);
        }
    }

    public static final void c(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2106052969);
        int i2 = (M.l(z) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(2106052969, i2, -1, "com.vk.story.archive.impl.presentation.PrivacyText (StoryArchiveTopBar.kt:160)");
            }
            String a = z ? zq.a(M, 541833536, R.string.story_archive_privacy_community_description, M, 0) : zq.a(M, 541927466, R.string.story_archive_privacy_description, M, 0);
            if (b.d()) {
                b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (b.d()) {
                b.e();
            }
            frv0 frv0Var = wuv0Var.i0;
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (b.d()) {
                b.e();
            }
            aVar2 = M;
            yqv0.c(a, s200.E(txj0.f(q630.a.a, 1.0f), 16, 24), ylu0Var.getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, aVar2, 48, 0, 8120);
            if (b.d()) {
                b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(z, i) { // from class: xsna.rxl0
                public final /* synthetic */ boolean b;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    com.vk.story.archive.impl.presentation.a.c(this.b, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final fj3 fj3Var, final int i, final boolean z, final StoryArchiveFragment.b bVar, androidx.compose.runtime.a aVar, final int i2) {
        final StoryArchiveFragment.b bVar2;
        final boolean z2;
        final int i3;
        final fj3 fj3Var2;
        androidx.compose.runtime.a M = aVar.M(1187779090);
        int i4 = (M.J(fj3Var) ? 4 : 2) | i2 | (M.o(i) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.J(bVar) ? 2048 : 1024);
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (b.d()) {
                b.f(1187779090, i4, -1, "com.vk.story.archive.impl.presentation.StoryArchiveTopBar (StoryArchiveTopBar.kt:38)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = k.b(Boolean.FALSE);
                M.R(x);
            }
            final wh50 wh50Var = (wh50) x;
            wzs wzsVar = new wzs() { // from class: xsna.pxl0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1521388599, intValue, -1, "com.vk.story.archive.impl.presentation.StoryArchiveTopBar.<anonymous> (StoryArchiveTopBar.kt:41)");
                        }
                        q630 E = ahn.E(txj0.f(q630.a.a, 1.0f), "toolbar");
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, E);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, a, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c, cri.a.d);
                        StoryArchiveFragment.b bVar3 = StoryArchiveFragment.b.this;
                        boolean J = aVar2.J(bVar3);
                        Object x2 = aVar2.x();
                        wh50 wh50Var2 = wh50Var;
                        Object obj3 = a.C0011a.a;
                        if (J || x2 == obj3) {
                            x2 = new com.vk.movika.sdk.base.flow.binding.l(20, bVar3, wh50Var2);
                            aVar2.R(x2);
                        }
                        fj3 fj3Var3 = fj3Var;
                        com.vk.story.archive.impl.presentation.a.a(fj3Var3, i, bVar3, (gzs) x2, aVar2, 0);
                        if (fj3Var3.a) {
                            aVar2.K(-46235845);
                            com.vk.story.archive.impl.presentation.a.c(z, aVar2, 0);
                        } else {
                            aVar2.K(-48322207);
                        }
                        aVar2.j();
                        aVar2.G();
                        if (((Boolean) wh50Var2.getValue()).booleanValue()) {
                            aVar2.K(-1101535078);
                            Object x3 = aVar2.x();
                            if (x3 == obj3) {
                                x3 = new y26(2, wh50Var2);
                                aVar2.R(x3);
                            }
                            izs izsVar = (izs) x3;
                            boolean J2 = aVar2.J(bVar3);
                            Object x4 = aVar2.x();
                            if (J2 || x4 == obj3) {
                                x4 = new dp0(21, bVar3, wh50Var2);
                                aVar2.R(x4);
                            }
                            gzs gzsVar = (gzs) x4;
                            Object x5 = aVar2.x();
                            if (x5 == obj3) {
                                x5 = new a36(2, wh50Var2);
                                aVar2.R(x5);
                            }
                            com.vk.story.archive.impl.presentation.a.b(izsVar, gzsVar, (gzs) x5, aVar2, 390);
                        } else {
                            aVar2.K(-1103739829);
                        }
                        aVar2.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            };
            bVar2 = bVar;
            fj3Var2 = fj3Var;
            i3 = i;
            z2 = z;
            rrv0.d(null, null, null, null, kai.c(1521388599, wzsVar, M), M, 24576, 15);
            if (b.d()) {
                b.e();
            }
        } else {
            bVar2 = bVar;
            z2 = z;
            i3 = i;
            fj3Var2 = fj3Var;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs(i3, z2, bVar2, i2) { // from class: xsna.qxl0
                public final /* synthetic */ int c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ StoryArchiveFragment.b e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    com.vk.story.archive.impl.presentation.a.d(fj3.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
