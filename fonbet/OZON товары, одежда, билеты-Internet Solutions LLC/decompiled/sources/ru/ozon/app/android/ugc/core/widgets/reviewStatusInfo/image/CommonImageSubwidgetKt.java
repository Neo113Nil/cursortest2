package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.image;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/image/CommonImageVO;", "", "commonImageElement", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "vo", "Landroidx/compose/ui/e;", "modifier", "CommonImage", "(Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/image/CommonImageVO;Landroidx/compose/ui/e;LS0/k;II)V", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonImageSubwidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void CommonImage(CommonImageVO commonImageVO, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(1373823251);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(commonImageVO) ? 4 : 2) | i11;
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
            DsImageAtomKt.DsImageAtom(commonImageVO.getImage(), T.i(eVar, commonImageVO.getLeftMargin().m1867getDpD9Ej5fM(), commonImageVO.getTopMargin().m1867getDpD9Ej5fM(), commonImageVO.getRightMargin().m1867getDpD9Ej5fM(), commonImageVO.getBottomMargin().m1867getDpD9Ej5fM()), u11, 0, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CommonImageSubwidgetKt$CommonImage$1(commonImageVO, eVar, i11, i12));
        }
    }

    public static final void commonImageElement(@NotNull j<Object, CommonImageVO> jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        jVar.i(CommonImageSubwidgetKt$commonImageElement$1.INSTANCE, CommonImageSubwidgetKt$commonImageElement$2.INSTANCE);
        jVar.G(CommonImageSubwidgetKt$commonImageElement$3.INSTANCE);
    }
}
