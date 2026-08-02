package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Z1.d;
import a1.c;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view.tools.InsuranceCarouselHeaderAdaptiveLayoutKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "logoImage", "", "InsuranceCarouselHeader", "(Landroidx/compose/ui/e;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;LS0/k;II)V", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsuranceCarouselHeaderKt {
    public static final void InsuranceCarouselHeader(e eVar, @NotNull TextDTO title, TextDTO textDTO, ImageDTO imageDTO, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        e eVar3;
        Intrinsics.checkNotNullParameter(title, "title");
        C3969l u11 = interfaceC3967k.u(1425975813);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(title) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(textDTO) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.n(imageDTO) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
            eVar3 = eVar2;
        } else {
            e eVar4 = i14 != 0 ? e.f40358c0 : eVar2;
            d dVar = (d) u11.m(K0.e());
            e e11 = a0.e(eVar4, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            InsuranceCarouselHeaderAdaptiveLayoutKt.InsuranceCarouselHeaderAdaptiveLayout(T.h(T.j(e11, 0.0f, 0.0f, 0.0f, dsSpacings.m1842getDp12D9Ej5fM(), 7), dsSpacings.m1845getDp16D9Ej5fM(), 0.0f, 2), dVar.Y0(dsSpacings.m1840getDp10D9Ej5fM()), dVar.Y0(dsSpacings.m1854getDp4D9Ej5fM()), c.c(-1537990946, new InsuranceCarouselHeaderKt$InsuranceCarouselHeader$3(imageDTO), u11), c.c(-944502275, new InsuranceCarouselHeaderKt$InsuranceCarouselHeader$4(title), u11), c.c(-351013604, new InsuranceCarouselHeaderKt$InsuranceCarouselHeader$5(textDTO), u11), u11, 224256, 0);
            eVar3 = eVar4;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InsuranceCarouselHeaderKt$InsuranceCarouselHeader$6(eVar3, title, textDTO, imageDTO, i11, i12));
        }
    }
}
