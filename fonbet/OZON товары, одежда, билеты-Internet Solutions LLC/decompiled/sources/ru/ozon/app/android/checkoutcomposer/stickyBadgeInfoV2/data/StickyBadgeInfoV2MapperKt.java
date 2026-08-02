package ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.data.StickyBadgeInfoV2DTO;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.presentation.StickyBadgeInfoV2VO;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0005\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/data/StickyBadgeInfoV2DTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/presentation/StickyBadgeInfoV2VO;", "toVO", "(Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/data/StickyBadgeInfoV2DTO;Ll20/d;)Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/presentation/StickyBadgeInfoV2VO;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/data/StickyBadgeInfoV2DTO$BankImage;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/presentation/StickyBadgeInfoV2VO$BankImage;", "(Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/data/StickyBadgeInfoV2DTO$BankImage;)Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/presentation/StickyBadgeInfoV2VO$BankImage;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StickyBadgeInfoV2MapperKt {
    @NotNull
    public static final StickyBadgeInfoV2VO toVO(@NotNull StickyBadgeInfoV2DTO stickyBadgeInfoV2DTO, @NotNull d info) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(stickyBadgeInfoV2DTO, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        TextDTO startText = stickyBadgeInfoV2DTO.getStartText();
        List<StickyBadgeInfoV2DTO.BankImage> images = stickyBadgeInfoV2DTO.getImages();
        if (images != null) {
            List<StickyBadgeInfoV2DTO.BankImage> list = images;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toVO((StickyBadgeInfoV2DTO.BankImage) it.next()));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        TextDTO endText = stickyBadgeInfoV2DTO.getEndText();
        String backgroundColor = stickyBadgeInfoV2DTO.getBackgroundColor();
        CornerRadius cornerRadius = stickyBadgeInfoV2DTO.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.RADIUS_250;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        Paddings paddings = stickyBadgeInfoV2DTO.getPaddings();
        if (paddings == null) {
            CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_250;
            CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_100;
            paddings = new Paddings(layoutPadding, layoutPadding, layoutPadding2, layoutPadding2);
        }
        return new StickyBadgeInfoV2VO(hashCode, startText, arrayList2, endText, backgroundColor, cornerRadius2, paddings);
    }

    private static final StickyBadgeInfoV2VO.BankImage toVO(StickyBadgeInfoV2DTO.BankImage bankImage) {
        return new StickyBadgeInfoV2VO.BankImage(bankImage.getImageUrl(), bankImage.getTintColor());
    }
}
