package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.data;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.data.TravelPaymentV3DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation.TravelPaymentV3VO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u0003j\u0002`\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "index", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO$PaymentMethodDTO;", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO;", "mapPaymentsMethodsToVO", "(ILru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO$PaymentMethodDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO$TravelPaymentDefaultVO;", "mapPaymentDefaultDTO", "(ILru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO$PaymentMethodDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO$TravelPaymentDefaultVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO$TravelPaymentCardVO;", "mapPaymentCardDTO", "(ILru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO$PaymentMethodDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO$TravelPaymentCardVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO$TravelPaymentImageVO;", "mapPaymentImageDTO", "(ILru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO$PaymentMethodDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO$TravelPaymentImageVO;", "", "isSelected", "getBackgroundStrokeColor", "(Z)I", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO;Ll20/d;)Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPaymentV3Mapper implements Function2<TravelPaymentV3DTO, d, List<? extends TravelPaymentV3VO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TravelPaymentV3DTO.StyleType.values().length];
            try {
                iArr[TravelPaymentV3DTO.StyleType.STYLE_TYPE_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TravelPaymentV3DTO.StyleType.STYLE_TYPE_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TravelPaymentV3DTO.StyleType.STYLE_TYPE_IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final int getBackgroundStrokeColor(boolean isSelected) {
        return isSelected ? R$attr.bgActionPrimary : R$attr.graphicNeutral;
    }

    private final TravelPaymentV3VO.PaymentMethodItemVO.TravelPaymentCardVO mapPaymentCardDTO(int index, TravelPaymentV3DTO.PaymentMethodDTO item) {
        TextAtom title = item.getTitle();
        Icon icon = item.getIcon();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(index);
        sb2.append(title);
        sb2.append(icon);
        return new TravelPaymentV3VO.PaymentMethodItemVO.TravelPaymentCardVO(sb2.toString().hashCode(), item.getTitle(), item.getIcon(), item.getIconRight(), item.getBackgroundColor(), AtomActionMapperKt.toAtomAction(item.getAction(), item.getTrackingInfo()), getBackgroundStrokeColor(item.isSelected()));
    }

    private final TravelPaymentV3VO.PaymentMethodItemVO.TravelPaymentDefaultVO mapPaymentDefaultDTO(int index, TravelPaymentV3DTO.PaymentMethodDTO item) {
        TextAtom title = item.getTitle();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(index);
        sb2.append(title);
        return new TravelPaymentV3VO.PaymentMethodItemVO.TravelPaymentDefaultVO(sb2.toString().hashCode(), item.getTitle(), item.getIcon(), item.getBackgroundColor(), AtomActionMapperKt.toAtomAction(item.getAction(), item.getTrackingInfo()), getBackgroundStrokeColor(item.isSelected()));
    }

    private final TravelPaymentV3VO.PaymentMethodItemVO.TravelPaymentImageVO mapPaymentImageDTO(int index, TravelPaymentV3DTO.PaymentMethodDTO item) {
        String backgroundImage = item.getBackgroundImage();
        return new TravelPaymentV3VO.PaymentMethodItemVO.TravelPaymentImageVO((index + backgroundImage).hashCode(), item.getBackgroundImage(), AtomActionMapperKt.toAtomAction(item.getAction(), item.getTrackingInfo()), getBackgroundStrokeColor(item.isSelected()));
    }

    private final TravelPaymentV3VO.PaymentMethodItemVO mapPaymentsMethodsToVO(int index, TravelPaymentV3DTO.PaymentMethodDTO item) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[item.getType().ordinal()];
        if (i11 == 1) {
            return mapPaymentDefaultDTO(index, item);
        }
        if (i11 == 2) {
            return mapPaymentCardDTO(index, item);
        }
        if (i11 == 3) {
            return mapPaymentImageDTO(index, item);
        }
        throw new o();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelPaymentV3VO> invoke(@NotNull TravelPaymentV3DTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Iterator<TravelPaymentV3DTO.PaymentMethodDTO> it = dto.getPaymentMethods().iterator();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (it.next().isSelected()) {
                break;
            }
            i12++;
        }
        Integer valueOf = i12 > -1 ? Integer.valueOf(i12) : null;
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = dto.getTitle();
        List<TravelPaymentV3DTO.PaymentMethodDTO> paymentMethods = dto.getPaymentMethods();
        ArrayList arrayList = new ArrayList(C7714v.z(paymentMethods, 10));
        for (Object obj : paymentMethods) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(mapPaymentsMethodsToVO(i11, (TravelPaymentV3DTO.PaymentMethodDTO) obj));
            i11 = i13;
        }
        return C7714v.a0(new TravelPaymentV3VO(hashCode, title, arrayList, dto.getAnnotation(), dto.getOptionsTitle(), dto.getPaymentOptions(), dto.getConfirmButton(), valueOf, dto.getMilesButton()));
    }
}
