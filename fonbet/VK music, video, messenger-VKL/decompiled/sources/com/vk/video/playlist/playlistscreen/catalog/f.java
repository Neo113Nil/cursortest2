package com.vk.video.playlist.playlistscreen.catalog;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.defaults.CounterSize;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.d;
import com.vk.core.compose.component.group.header.f;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.a8a;
import xsna.ahn;
import xsna.arm0;
import xsna.bab0;
import xsna.gky;
import xsna.gzs;
import xsna.ikg0;
import xsna.izs;
import xsna.l5g;
import xsna.lg90;
import xsna.ne7;
import xsna.or;
import xsna.q2a;
import xsna.q630;
import xsna.qzu0;
import xsna.rrv0;
import xsna.s3q0;
import xsna.wzs;
import xsna.ylu0;
import xsna.zak0;

/* compiled from: PlaylistHeaderView.kt */
/* loaded from: classes6.dex */
public final class f extends q2a<PlaylistHeaderView$ViewState, bab0> {
    @Override // xsna.q2a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(final a8a a8aVar, final PlaylistHeaderView$ViewState playlistHeaderView$ViewState, final izs<? super bab0, s3q0> izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        String str;
        androidx.compose.runtime.a aVar3;
        int i3;
        ikg0 ikg0Var;
        com.vk.core.compose.component.group.header.a aVar4;
        ikg0 ikg0Var2;
        int i4;
        long j;
        gzs gzsVar;
        boolean z = playlistHeaderView$ViewState.f;
        androidx.compose.runtime.a M = aVar.M(-1773625043);
        if ((i & 48) == 0) {
            i2 = (M.J(playlistHeaderView$ViewState) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1773625043, i2, -1, "com.vk.video.playlist.playlistscreen.catalog.PlaylistHeaderView.BlockView.ContentImpl (PlaylistHeaderView.kt:121)");
            }
            q630 E = ahn.E(q630Var, "mvi_catalog_header_test_tag");
            b.c cVar = b.c.a;
            String str2 = playlistHeaderView$ViewState.c;
            String str3 = playlistHeaderView$ViewState.d;
            com.vk.core.compose.component.group.header.d dVar = null;
            Integer m = str3 != null ? arm0.m(10, str3) : null;
            if (m == null) {
                M.K(-1375433222);
                M.j();
                str = str2;
                aVar3 = M;
            } else {
                M.K(-1375433221);
                str = str2;
                aVar3 = M;
                dVar = d.a.a(m.intValue(), CounterAppearance.Design.Neutral, CounterMode.Tertiary, CounterSize.Medium, null, aVar3, 224688, 0);
                aVar3.j();
            }
            com.vk.core.compose.component.group.header.d dVar2 = dVar;
            androidx.compose.runtime.a aVar5 = aVar3;
            com.vk.core.compose.component.group.header.f a = f.a.a(str, null, dVar2, null, null, null, null, null, false, aVar5, 805306368, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
            androidx.compose.runtime.a aVar6 = aVar5;
            if (androidx.compose.runtime.b.d()) {
                i3 = -1;
                androidx.compose.runtime.b.f(958254720, Tensorflow.FRAME_WIDTH, -1, "com.vk.core.compose.component.group.header.GroupHeader.Middle.Companion.invoke (GroupHeader.kt:1088)");
            } else {
                i3 = -1;
            }
            Object x = aVar6.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                ikg0Var = null;
                x = new com.vk.core.compose.component.group.header.a(a, null);
                aVar6.R(x);
            } else {
                ikg0Var = null;
            }
            com.vk.core.compose.component.group.header.a aVar7 = (com.vk.core.compose.component.group.header.a) x;
            ((zak0) aVar7.a).setValue(a);
            ((zak0) aVar7.b).setValue(ikg0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (playlistHeaderView$ViewState.e) {
                aVar6.K(-1374886691);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    i4 = 0;
                    androidx.compose.runtime.b.f(-864138542, 0, i3, "com.vk.core.compose.icons.generated.VkIcons.<get-SortOutline24> (VkIcons.kt:10146)");
                } else {
                    i4 = 0;
                }
                lg90 b = or.b(aVar6, 482838996, R.drawable.vk_icon_sort_outline_24, aVar6, i4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (z) {
                    aVar6.K(-1374696878);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i4, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar6.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = l5g.c(14, ylu0Var.getIcon().j, 0.64f);
                    aVar6.j();
                } else {
                    aVar6.K(-1374562090);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i4, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar6.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var2.getIcon().j;
                    aVar6.j();
                }
                if (z) {
                    aVar6.K(-1374405199);
                    aVar6.j();
                    gzsVar = null;
                } else {
                    aVar6.K(-1374330551);
                    int i5 = ((i2 & 896) == 256 ? 1 : i4) | ((i2 & 112) != 32 ? i4 : 1);
                    Object x2 = aVar6.x();
                    if (i5 != 0 || x2 == c0012a) {
                        x2 = new gzs() { // from class: com.vk.video.playlist.playlistscreen.catalog.d
                            @Override // xsna.gzs
                            public final Object invoke() {
                                izs.this.invoke(new bab0(playlistHeaderView$ViewState.b));
                                return s3q0.a;
                            }
                        };
                        aVar6.R(x2);
                    }
                    gzsVar = (gzs) x2;
                    aVar6.j();
                }
                Object x3 = aVar6.x();
                if (x3 == c0012a) {
                    x3 = new gky(15);
                    aVar6.R(x3);
                }
                aVar4 = aVar7;
                ikg0 a2 = GroupHeader$Right.c.a(null, GroupHeader$Right.Icon.a.a(b, j, null, gzsVar, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), null, aVar6, 100663304, 172), null, null, aVar6, 13);
                aVar6 = aVar6;
                aVar6.j();
                ikg0Var2 = a2;
            } else {
                aVar4 = aVar7;
                aVar6.K(-1373965619);
                aVar6.j();
                ikg0Var2 = ikg0Var;
            }
            androidx.compose.runtime.a aVar8 = aVar6;
            com.vk.core.compose.component.group.header.g.a(aVar4, E, cVar, null, ikg0Var2, false, aVar8, 384, 104);
            aVar2 = aVar8;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: com.vk.video.playlist.playlistscreen.catalog.e
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    f.this.c(a8aVar, playlistHeaderView$ViewState, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
