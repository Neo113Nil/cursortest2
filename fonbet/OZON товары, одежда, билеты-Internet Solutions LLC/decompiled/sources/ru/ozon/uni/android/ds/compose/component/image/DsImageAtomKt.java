package ru.ozon.uni.android.ds.compose.component.image;

import B1.InterfaceC2547p;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"&\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/atoms/data/image/ImageDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "", "DsImageAtom", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Landroidx/compose/ui/e;LS0/k;II)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "Lru/ozon/uni/android/ds/compose/modifier/AtomLocator;", "imageLocator", "Lkotlin/jvm/functions/Function1;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsImageAtomKt {

    @NotNull
    private static final Function1<TestInfo, Locator> imageLocator = DsImageAtomKt$imageLocator$1.INSTANCE;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsImageAtom(@NotNull ImageDTO dto, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        ImageVO vo;
        C3969l c3969l;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(-1789492726);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i13 & 19) == 18 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                vo = ImageVoKt.toVO(dto, u11, i13 & 14);
                if (vo.getIsFixed()) {
                    viewAnalytics = a0.m(viewAnalytics, vo.getWidth());
                }
                e testTag = AtomLocatorKt.testTag(viewAnalytics, imageLocator.invoke(dto.getTestInfo()));
                PikazonImagePainter a11 = f.a(vo.getImage(), vo.getContentScale(), null, null, u11, 0, 12);
                c3969l = u11;
                long backgroundColor = vo.getBackgroundColor();
                boolean hasParanja = vo.getHasParanja();
                float aspectRatio = vo.getAspectRatio();
                e eVar5 = eVar4;
                float cornerRadius = vo.getCornerRadius();
                InterfaceC2547p contentScale = vo.getContentScale();
                float startPadding = vo.getStartPadding();
                float topPadding = vo.getTopPadding();
                float endPadding = vo.getEndPadding();
                float bottomPadding = vo.getBottomPadding();
                eVar3 = eVar5;
                DsImageKt.m1720DsImageA8mMYrQ(a11, testTag, hasParanja, aspectRatio, backgroundColor, contentScale, cornerRadius, startPadding, topPadding, endPadding, bottomPadding, c3969l, 0, 0, 0);
            } else {
                u11.j();
                eVar3 = eVar2;
                c3969l = u11;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new DsImageAtomKt$DsImageAtom$2(dto, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 19) == 18) {
        }
        if (i14 == 0) {
        }
        e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
        vo = ImageVoKt.toVO(dto, u11, i13 & 14);
        if (vo.getIsFixed()) {
        }
        e testTag2 = AtomLocatorKt.testTag(viewAnalytics2, imageLocator.invoke(dto.getTestInfo()));
        PikazonImagePainter a112 = f.a(vo.getImage(), vo.getContentScale(), null, null, u11, 0, 12);
        c3969l = u11;
        long backgroundColor2 = vo.getBackgroundColor();
        boolean hasParanja2 = vo.getHasParanja();
        float aspectRatio2 = vo.getAspectRatio();
        e eVar52 = eVar4;
        float cornerRadius2 = vo.getCornerRadius();
        InterfaceC2547p contentScale2 = vo.getContentScale();
        float startPadding2 = vo.getStartPadding();
        float topPadding2 = vo.getTopPadding();
        float endPadding2 = vo.getEndPadding();
        float bottomPadding2 = vo.getBottomPadding();
        eVar3 = eVar52;
        DsImageKt.m1720DsImageA8mMYrQ(a112, testTag2, hasParanja2, aspectRatio2, backgroundColor2, contentScale2, cornerRadius2, startPadding2, topPadding2, endPadding2, bottomPadding2, c3969l, 0, 0, 0);
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
