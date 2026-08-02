package ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.presentation;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/presentation/CommonImageVO;", "vo", "Landroidx/compose/ui/e;", "modifier", "", "CommonImage", "(Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/presentation/CommonImageVO;Landroidx/compose/ui/e;LS0/k;II)V", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommonImageKt {
    public static final void CommonImage(@NotNull CommonImageVO vo, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(vo, "vo");
        C3969l u11 = interfaceC3967k.u(553795084);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? u11.n(vo) : u11.F(vo) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            DsImageAtomKt.DsImageAtom(vo.getImage(), T.i(eVar, TokensExtKt.getDp(vo.getLeftMargin()), TokensExtKt.getDp(vo.getTopMargin()), TokensExtKt.getDp(vo.getRightMargin()), TokensExtKt.getDp(vo.getBottomMargin())), u11, 0, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CommonImageKt$CommonImage$1(vo, eVar, i11, i12));
        }
    }
}
