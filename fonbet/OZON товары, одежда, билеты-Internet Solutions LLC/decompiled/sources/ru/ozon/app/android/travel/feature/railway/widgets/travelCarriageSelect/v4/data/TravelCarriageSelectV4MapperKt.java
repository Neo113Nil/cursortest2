package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.data;

import Kk.c;
import WZ.x;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l1.C7848y;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.data.TravelCarriageSelectV4DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.presentation.TravelCarriageSelectV4VI;
import ru.ozon.app.android.travel.molecules.dto.priceCard.PriceCardDTO;
import ru.ozon.app.android.travel.molecules.dto.shiftedPreviewIcons.ShiftedPreviewIconsDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.shiftedPreviewIcons.ShiftedPreviewIconsVO;
import ru.ozon.app.android.travel.utils.utils.DecodeBitmapUtilKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u0007\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0007\u0010\r\u001a\u001f\u0010\u0007\u001a\u00020\u000f*\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Carriage;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI;", "toVI", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Carriage;Ll20/d;Landroid/content/Context;)Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Storey;", "", "reqImageHeight", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$StoreyVI;", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Storey;I)Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$StoreyVI;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Details;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$DetailsVI;", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Details;Ll20/d;)Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$DetailsVI;", "railway_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageSelectV4MapperKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    @NotNull
    public static final TravelCarriageSelectV4VI toVI(@NotNull TravelCarriageSelectV4DTO.Carriage carriage, @NotNull d widgetInfo, @NotNull Context context) {
        ?? r12;
        Intrinsics.checkNotNullParameter(carriage, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(context, "context");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO name = carriage.getName();
        TextDTO type = carriage.getType();
        BadgeDTO typeBadge = carriage.getTypeBadge();
        TextDTO number = carriage.getNumber();
        TextDTO seatsCount = carriage.getSeatsCount();
        TextDTO seatsDetails = carriage.getSeatsDetails();
        List<TravelCarriageSelectV4DTO.Storey> storeys = carriage.getStoreys();
        if (storeys != null) {
            List<TravelCarriageSelectV4DTO.Storey> list = storeys;
            r12 = new ArrayList(C7714v.z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r12.add(toVI((TravelCarriageSelectV4DTO.Storey) it.next(), UiExtKt.toPx(50, context)));
            }
        } else {
            r12 = K.f71697a;
        }
        List<TravelCarriageSelectV4DTO.Storey> storeys2 = carriage.getStoreys();
        boolean z11 = !(storeys2 == null || storeys2.isEmpty());
        TravelCarriageSelectV4VI.DetailsVI vi2 = toVI(carriage.getDetails(), widgetInfo);
        PriceCardDTO discountPriceCard = carriage.getPriceBlock().getDiscountPriceCard();
        TravelCarriageSelectV4VI.PriceBlockVI priceBlockVI = new TravelCarriageSelectV4VI.PriceBlockVI(discountPriceCard != null ? MapperExtKt.toComposeVO(discountPriceCard) : null, MapperExtKt.toComposeVO(carriage.getPriceBlock().getOriginalPriceCard()));
        BadgeDTO bonusBadge = carriage.getBonusBadge();
        AtomAction atomAction = carriage.getCommon().toAtomAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = carriage.getCommon().getTrackingInfo();
        return new TravelCarriageSelectV4VI(hashCode, name, type, typeBadge, number, seatsCount, seatsDetails, r12, z11, vi2, priceBlockVI, bonusBadge, atomAction, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null);
    }

    private static final TravelCarriageSelectV4VI.StoreyVI toVI(TravelCarriageSelectV4DTO.Storey storey, int i11) {
        TextDTO name = storey.getName();
        OzonSpannableString text = name != null ? name.getText() : null;
        return new TravelCarriageSelectV4VI.StoreyVI(text != null ? text.hashCode() : 0, storey.getName(), storey.getImage() != null ? new C7848y(DecodeBitmapUtilKt.decodeBitmap(storey.getImage().getDarkImageUrl(), i11)) : null, storey.getImage() != null ? new C7848y(DecodeBitmapUtilKt.decodeBitmap(storey.getImage().getLightImageUrl(), i11)) : null, storey.getNoStoreysInfo());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    private static final TravelCarriageSelectV4VI.DetailsVI toVI(TravelCarriageSelectV4DTO.Details details, d dVar) {
        ?? r42;
        List<IconDTO> servicesIcon = details.getServicesIcon();
        if (servicesIcon != null) {
            List<IconDTO> list = servicesIcon;
            r42 = new ArrayList(C7714v.z(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                IconDTO iconDTO = (IconDTO) obj;
                String backgroundImage = iconDTO.getBackgroundImage();
                CommonAtomIconDTO icon = iconDTO.getIcon();
                r42.add(new TravelCarriageSelectV4VI.IconVI(c.a(backgroundImage, icon != null ? icon.getIcon() : null), iconDTO, C7714v.P(details.getServicesIcon()) == i11 && details.getEnableLastIconFade()));
                i11 = i12;
            }
        } else {
            r42 = K.f71697a;
        }
        List list2 = r42;
        List<IconDTO> servicesIcon2 = details.getServicesIcon();
        boolean z11 = !(servicesIcon2 == null || servicesIcon2.isEmpty());
        ShiftedPreviewIconsDTO shiftedPreviewIcons = details.getShiftedPreviewIcons();
        ShiftedPreviewIconsVO vo = shiftedPreviewIcons != null ? MapperExtKt.toVO(shiftedPreviewIcons) : null;
        BadgeDTO detailsBadge = details.getDetailsBadge();
        AtomAction atomAction = details.getCommon().toAtomAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = details.getCommon().getTrackingInfo();
        return new TravelCarriageSelectV4VI.DetailsVI(list2, z11, vo, detailsBadge, atomAction, trackingInfo != null ? x.d(trackingInfo, dVar) : null);
    }
}
