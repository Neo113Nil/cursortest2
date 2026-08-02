package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation;

import Sc.o;
import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.unsorted.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.data.DeliveryWidgetV2DTO;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$MethodDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$MethodVO;", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$MethodDTO;)Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$MethodVO;", "", "convertProgressOrDefault", "(Ljava/lang/Float;)F", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV2Mapper implements Function2<DeliveryWidgetV2DTO, d, List<? extends DeliveryWidgetV2VO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeliveryWidgetV2DTO.MethodDTO.values().length];
            try {
                iArr[DeliveryWidgetV2DTO.MethodDTO.GROSS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeliveryWidgetV2DTO.MethodDTO.NON_GROSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeliveryWidgetV2DTO.MethodDTO.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final float convertProgressOrDefault(Float f7) {
        if (f7 != null) {
            return f7.floatValue() * 100;
        }
        return 0.0f;
    }

    private final DeliveryWidgetV2VO.MethodVO toVO(DeliveryWidgetV2DTO.MethodDTO methodDTO) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[methodDTO.ordinal()];
        if (i11 == 1) {
            return DeliveryWidgetV2VO.MethodVO.GROSS;
        }
        if (i11 == 2) {
            return DeliveryWidgetV2VO.MethodVO.NON_GROSS;
        }
        if (i11 == 3) {
            return DeliveryWidgetV2VO.MethodVO.UNDEFINED;
        }
        throw new o();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryWidgetV2VO> invoke(@NotNull DeliveryWidgetV2DTO state, @NotNull d widgetInfo) {
        Object hiddenStateVOWidget;
        long j11;
        t tVar;
        AtomAction atomAction;
        t tVar2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        DeliveryWidgetV2DTO.StateDTO state2 = state.getState();
        if (state2 instanceof DeliveryWidgetV2DTO.StateDTO.OzonDTO) {
            long id2 = ExtentionsKt.getId(widgetInfo);
            long lifetime = (long) state.getLifetime();
            DeliveryWidgetV2DTO.StateDTO.OzonDTO ozonDTO = (DeliveryWidgetV2DTO.StateDTO.OzonDTO) state2;
            TextDTO title = ozonDTO.getTitle();
            TextDTO subtitle = ozonDTO.getSubtitle();
            DeliveryWidgetV2VO.MethodVO vo = toVO(ozonDTO.getMethod());
            Icon infoIcon = ozonDTO.getInfoIcon();
            String statusIcon = ozonDTO.getStatusIcon();
            String statusCircleColor = ozonDTO.getStatusCircleColor();
            String statusIconColor = ozonDTO.getStatusIconColor();
            DeliveryWidgetV2VO.ProgressVO progressVO = new DeliveryWidgetV2VO.ProgressVO(convertProgressOrDefault(ozonDTO.getProgress().getProgress()), ozonDTO.getProgress().getRingProgressColor(), ozonDTO.getProgress().getRingBackgroundColor());
            String a11 = widgetInfo.c().a();
            String str = a11 != null ? a11 : "";
            AtomAction atomAction2 = AtomActionMapperKt.toAtomAction(ozonDTO.getOnWidgetClickAction(), state.getTrackingInfo());
            Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
            if (trackingInfo != null) {
                atomAction = atomAction2;
                tVar2 = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(ExtentionsKt.getId(widgetInfo)), null, 2, null);
            } else {
                atomAction = atomAction2;
                tVar2 = null;
            }
            hiddenStateVOWidget = new DeliveryWidgetV2VO.OzonDeliveryVOWidget(vo, title, subtitle, infoIcon, statusIcon, statusCircleColor, statusIconColor, progressVO, str, atomAction, id2, lifetime, widgetInfo, tVar2);
        } else if (state2 instanceof DeliveryWidgetV2DTO.StateDTO.SellerDTO) {
            long id3 = ExtentionsKt.getId(widgetInfo);
            DeliveryWidgetV2DTO.StateDTO.SellerDTO sellerDTO = (DeliveryWidgetV2DTO.StateDTO.SellerDTO) state2;
            long sellerId = sellerDTO.getSellerId();
            long lifetime2 = (long) state.getLifetime();
            TextDTO title2 = sellerDTO.getTitle();
            TextDTO subtitle2 = sellerDTO.getSubtitle();
            DeliveryWidgetV2VO.ProgressVO progressVO2 = new DeliveryWidgetV2VO.ProgressVO(convertProgressOrDefault(sellerDTO.getProgress().getProgress()), sellerDTO.getProgress().getRingProgressColor(), sellerDTO.getProgress().getRingBackgroundColor());
            String statusIcon2 = sellerDTO.getStatusIcon();
            String statusCircleColor2 = sellerDTO.getStatusCircleColor();
            String statusIconColor2 = sellerDTO.getStatusIconColor();
            Icon infoIcon2 = sellerDTO.getInfoIcon();
            String a12 = widgetInfo.c().a();
            String str2 = a12 != null ? a12 : "";
            AtomAction atomAction3 = AtomActionMapperKt.toAtomAction(sellerDTO.getOnWidgetClickAction(), state.getTrackingInfo());
            AtomActionDTO forceAction = sellerDTO.getForceAction();
            AtomAction atomAction4 = forceAction != null ? AtomActionMapperKt.toAtomAction(forceAction, state.getTrackingInfo()) : null;
            List<Long> availableDeliverySchemas = state.getAvailableDeliverySchemas();
            Map<String, TokenizedTrackingInfo> trackingInfo2 = state.getTrackingInfo();
            if (trackingInfo2 != null) {
                j11 = sellerId;
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(ExtentionsKt.getId(widgetInfo)), null, 2, null);
            } else {
                j11 = sellerId;
                tVar = null;
            }
            hiddenStateVOWidget = new DeliveryWidgetV2VO.SellerVOWidget(j11, title2, subtitle2, progressVO2, statusIcon2, statusIconColor2, statusCircleColor2, infoIcon2, str2, atomAction3, atomAction4, id3, lifetime2, widgetInfo, tVar, availableDeliverySchemas);
        } else {
            hiddenStateVOWidget = new DeliveryWidgetV2VO.HiddenStateVOWidget(ExtentionsKt.getId(widgetInfo), (long) state.getLifetime(), widgetInfo, state.getAvailableDeliverySchemas());
        }
        return C7714v.a0(hiddenStateVOWidget);
    }
}
