package ru.ozon.app.android.search.widgets.brandList.presentation.list;

import D1.InterfaceC2801g;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2TopPartVO;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;", "item", "", "EmptyStateItem", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;LS0/k;I)V", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmptyStateItemKt {
    public static final void EmptyStateItem(EmptyStateV2TopPartVO emptyStateV2TopPartVO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1822840492);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(emptyStateV2TopPartVO) : u11.F(emptyStateV2TopPartVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else if (emptyStateV2TopPartVO != null) {
            e j11 = T.j(a0.e(e.f40358c0, 1.0f), 0.0f, UniTheme.INSTANCE.getPaddings().getPadding400(), 0.0f, 0.0f, 13);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, j11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            ImageDTO image = emptyStateV2TopPartVO.getImage();
            u11.o(123591066);
            if (image != null) {
                DsImageAtomKt.DsImageAtom(image, null, u11, 0, 2);
            }
            u11.k();
            TextDTO title = emptyStateV2TopPartVO.getTitle();
            u11.o(123594937);
            if (title != null) {
                DsTextAtomKt.DsTextAtom(title, null, u11, 0, 2);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new EmptyStateItemKt$EmptyStateItem$2(emptyStateV2TopPartVO, i11));
        }
    }
}
