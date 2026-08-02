package com.vk.music.ui.search.history;

import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.o;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$ActionIconParams;
import com.vk.music.ui.search.history.c;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.d370;
import xsna.dl70;
import xsna.dt1;
import xsna.egi0;
import xsna.guw;
import xsna.gzs;
import xsna.izs;
import xsna.jai;
import xsna.k9q0;
import xsna.kai;
import xsna.ku70;
import xsna.l4;
import xsna.n34;
import xsna.p2u;
import xsna.q630;
import xsna.qri;
import xsna.s3q0;
import xsna.sg50;
import xsna.spg0;
import xsna.sy90;
import xsna.wh50;
import xsna.wzs;
import xsna.z0h0;
import xsna.zuh0;

/* compiled from: SearchHistoryCellRight.kt */
/* loaded from: classes3.dex */
public final class c implements o {
    public final /* synthetic */ wh50<zuh0> a;
    public final /* synthetic */ long b;
    public final /* synthetic */ gzs<s3q0> c;
    public final /* synthetic */ sg50 d;
    public final /* synthetic */ guw e;
    public final /* synthetic */ gzs<s3q0> f;
    public final /* synthetic */ sg50 g;
    public final /* synthetic */ guw h;
    public final /* synthetic */ long i;

    /* compiled from: SearchHistoryCellRight.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchHistoryItemViewParams$ActionIconParams.IconType.values().length];
            try {
                iArr[SearchHistoryItemViewParams$ActionIconParams.IconType.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchHistoryItemViewParams$ActionIconParams.IconType.Done.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c(wh50<zuh0> wh50Var, long j, gzs<s3q0> gzsVar, sg50 sg50Var, guw guwVar, gzs<s3q0> gzsVar2, sg50 sg50Var2, guw guwVar2, long j2) {
        this.a = wh50Var;
        this.b = j;
        this.c = gzsVar;
        this.d = sg50Var;
        this.e = guwVar;
        this.f = gzsVar2;
        this.g = sg50Var2;
        this.h = guwVar2;
        this.i = j2;
    }

    @Override // com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        String f;
        aVar.K(639513751);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(639513751, i, -1, "com.vk.music.ui.search.history.moreWithPreActionCell.<no name provided>.Content (SearchHistoryCellRight.kt:194)");
        }
        final SearchHistoryItemViewParams$ActionIconParams searchHistoryItemViewParams$ActionIconParams = this.a.getValue().e;
        searchHistoryItemViewParams$ActionIconParams.getClass();
        aVar.K(-720494415);
        Integer num = searchHistoryItemViewParams$ActionIconParams.c;
        if (num == null) {
            aVar.K(-720494416);
            aVar.j();
            f = null;
        } else {
            f = l4.f(aVar, -720494415, num, aVar, 0);
        }
        aVar.j();
        if (f == null) {
            f = "";
        }
        final String str = f;
        final String N = d370.N(R.string.music_talkback_more, 0, aVar);
        final boolean z = searchHistoryItemViewParams$ActionIconParams.b;
        dt1.a.getClass();
        k a2 = j.a(androidx.compose.foundation.layout.a.g(14), dt1.a.l, aVar, 54);
        int hashCode = Long.hashCode(n34.n(aVar));
        sy90 D = aVar.D();
        q630 c = qri.c(aVar, q630Var);
        cri.h7.getClass();
        LayoutNode.a aVar2 = cri.a.b;
        if (aVar.N() == null) {
            n34.r();
            throw null;
        }
        aVar.H();
        if (aVar.L()) {
            aVar.I(aVar2);
        } else {
            aVar.f();
        }
        k9q0.w(aVar, a2, cri.a.f);
        k9q0.w(aVar, D, cri.a.e);
        k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(aVar, cri.a.h);
        k9q0.w(aVar, c, cri.a.d);
        a.C0011a.C0012a c0012a = a.C0011a.a;
        gzs<s3q0> gzsVar = this.c;
        if (gzsVar == null) {
            aVar.K(1327895813);
            Object x = aVar.x();
            if (x == c0012a) {
                x = new z0h0(1);
                aVar.R(x);
            }
            gzsVar = (gzs) x;
        } else {
            aVar.K(319929393);
        }
        aVar.j();
        Object x2 = aVar.x();
        if (x2 == c0012a) {
            x2 = new dl70(13);
            aVar.R(x2);
        }
        q630.a aVar3 = q630.a.a;
        q630 b = egi0.b(aVar3, true, (izs) x2);
        final long j = this.i;
        jai c2 = kai.c(-1436215767, new wzs() { // from class: xsna.ruh0
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1436215767, intValue, -1, "com.vk.music.ui.search.history.moreWithPreActionCell.<no name provided>.Content.<anonymous>.<anonymous> (SearchHistoryCellRight.kt:218)");
                    }
                    boolean z2 = z;
                    final long j2 = j;
                    if (!z2) {
                        j2 = l5g.c(14, j2, 0.64f);
                    }
                    SearchHistoryItemViewParams$ActionIconParams.IconType iconType = searchHistoryItemViewParams$ActionIconParams.a;
                    dtp0 d = jq2.d(400, 0, null, 6);
                    final String str2 = str;
                    ijk.a(iconType, null, d, "preActionIcon", kai.c(317680361, new yzs() { // from class: xsna.tuh0
                        @Override // xsna.yzs
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            lg90 a3;
                            SearchHistoryItemViewParams$ActionIconParams.IconType iconType2 = (SearchHistoryItemViewParams$ActionIconParams.IconType) obj3;
                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= aVar5.o(iconType2.ordinal()) ? 4 : 2;
                            }
                            if (aVar5.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(317680361, intValue2, -1, "com.vk.music.ui.search.history.moreWithPreActionCell.<no name provided>.Content.<anonymous>.<anonymous>.<anonymous> (SearchHistoryCellRight.kt:224)");
                                }
                                int i2 = c.a.$EnumSwitchMapping$0[iconType2.ordinal()];
                                if (i2 == 1) {
                                    aVar5.K(348153365);
                                    qzu0.a.getClass();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1727946654, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-AddOutline16> (VkIcons.kt:140)");
                                    }
                                    a3 = pg90.a(R.drawable.vk_icon_add_outline_16, 0, aVar5);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    aVar5.j();
                                } else {
                                    if (i2 != 2) {
                                        if (oq.h(-2092014519, aVar5)) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        return s3q0.a;
                                    }
                                    aVar5.K(348156023);
                                    qzu0.a.getClass();
                                    a3 = qzu0.u(aVar5);
                                    aVar5.j();
                                }
                                pzu0.b(a3, str2, null, j2, aVar5, 8, 4);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar5.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar4), aVar4, 28032, 2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            }
        }, aVar);
        gzs<s3q0> gzsVar2 = gzsVar;
        long j2 = this.b;
        b.a(j2, z, gzsVar2, this.d, this.e, b, c2, aVar, 1575936);
        gzs<s3q0> gzsVar3 = this.f;
        if (gzsVar3 == null) {
            aVar.K(1329332229);
            Object x3 = aVar.x();
            if (x3 == c0012a) {
                x3 = new ku70(8);
                aVar.R(x3);
            }
            gzsVar3 = (gzs) x3;
        } else {
            aVar.K(319975822);
        }
        aVar.j();
        gzs<s3q0> gzsVar4 = gzsVar3;
        Object x4 = aVar.x();
        if (x4 == c0012a) {
            x4 = new p2u(24);
            aVar.R(x4);
        }
        b.a(j2, true, gzsVar4, this.g, this.h, egi0.b(aVar3, true, (izs) x4), kai.c(-101660832, new wzs() { // from class: xsna.suh0
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-101660832, intValue, -1, "com.vk.music.ui.search.history.moreWithPreActionCell.<no name provided>.Content.<anonymous>.<anonymous> (SearchHistoryCellRight.kt:248)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-836118916, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical16> (VkSdkIcons.kt:2658)");
                    }
                    lg90 a3 = pg90.a(R.drawable.vk_icon_more_vertical_16, 0, aVar4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(a3, N, null, j, aVar4, 8, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            }
        }, aVar), aVar, 1575984);
        aVar.G();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
