package ru.ozon.app.android.ordertracking.v4.presentation.mapper;

import Tc.b;
import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.csma.orderTracking.data.AddressDTO;
import ru.ozon.app.android.csma.orderTracking.data.DescriptionDTO;
import ru.ozon.app.android.csma.orderTracking.data.ImageDTO;
import ru.ozon.app.android.csma.orderTracking.data.MarqueeAddressDTO;
import ru.ozon.app.android.csma.orderTracking.data.OrderTrackingV4DTO;
import ru.ozon.app.android.csma.orderTracking.data.PaddingDTO;
import ru.ozon.app.android.csma.orderTracking.data.SideButtonDTO;
import ru.ozon.app.android.csma.orderTracking.data.SubtitleDTO;
import ru.ozon.app.android.csma.orderTracking.data.TileDTO;
import ru.ozon.app.android.csma.orderTracking.data.TitleDTO;
import ru.ozon.app.android.csma.orderTracking.data.UpdateAction;
import ru.ozon.app.android.ordertracking.v4.presentation.model.AllOrdersVO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.BarcodeVO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.DescriptionVO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.ImageVO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.OrderTrackingV4VO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.OrderVO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.PaddingVO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.SubtitleVO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.TitleVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 @2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001@B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000b\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u000b\u001a\u00020\u001a*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u000b\u0010\u001bJ\u0013\u0010\u000b\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u000b\u0010\u001eJ\u0013\u0010!\u001a\u00020 *\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010!\u001a\u00020$*\u00020#H\u0002¢\u0006\u0004\b!\u0010%J\u0013\u0010\u000b\u001a\u00020'*\u00020&H\u0002¢\u0006\u0004\b\u000b\u0010(J\u0013\u0010\u000b\u001a\u00020**\u00020)H\u0002¢\u0006\u0004\b\u000b\u0010+J\u0013\u0010\u000b\u001a\u00020-*\u00020,H\u0002¢\u0006\u0004\b\u000b\u0010.J\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010/\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000b\u00100J\u0013\u00103\u001a\u000202*\u000201H\u0002¢\u0006\u0004\b3\u00104J\u001b\u00107\u001a\u000205*\u0002052\u0006\u00106\u001a\u000201H\u0002¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u000205*\u0002052\u0006\u00106\u001a\u000201H\u0002¢\u0006\u0004\b9\u00108J\u001b\u00107\u001a\u000201*\u0002012\u0006\u00106\u001a\u000201H\u0002¢\u0006\u0004\b7\u0010:J\u001b\u00109\u001a\u000201*\u0002012\u0006\u00106\u001a\u000201H\u0002¢\u0006\u0004\b9\u0010:J&\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010;\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u000e¢\u0006\u0004\b?\u00100¨\u0006A"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/mapper/OrderTrackingV4Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/csma/orderTracking/data/OrderTrackingV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingV4VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/csma/orderTracking/data/PaddingDTO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/PaddingVO;", "toVO", "(Lru/ozon/app/android/csma/orderTracking/data/PaddingDTO;)Lru/ozon/app/android/ordertracking/v4/presentation/model/PaddingVO;", "Lru/ozon/app/android/csma/orderTracking/data/SideButtonDTO;", "", "widgetId", "Lru/ozon/app/android/ordertracking/v4/presentation/model/BarcodeVO;", "(Lru/ozon/app/android/csma/orderTracking/data/SideButtonDTO;J)Lru/ozon/app/android/ordertracking/v4/presentation/model/BarcodeVO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/AllOrdersVO;", "toAllOrdersVO", "(Lru/ozon/app/android/csma/orderTracking/data/SideButtonDTO;J)Lru/ozon/app/android/ordertracking/v4/presentation/model/AllOrdersVO;", "Lru/ozon/app/android/csma/orderTracking/data/TileDTO;", "", "index", "", "isFullWidth", "Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderVO;", "(Lru/ozon/app/android/csma/orderTracking/data/TileDTO;JILjava/lang/Boolean;)Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderVO;", "Lru/ozon/app/android/csma/orderTracking/data/TitleDTO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/TitleVO;", "(Lru/ozon/app/android/csma/orderTracking/data/TitleDTO;)Lru/ozon/app/android/ordertracking/v4/presentation/model/TitleVO;", "Lru/ozon/app/android/csma/orderTracking/data/SubtitleDTO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$SubtitleTextVO;", "toVo", "(Lru/ozon/app/android/csma/orderTracking/data/SubtitleDTO;)Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$SubtitleTextVO;", "Lru/ozon/app/android/csma/orderTracking/data/AddressDTO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$AddressVO;", "(Lru/ozon/app/android/csma/orderTracking/data/AddressDTO;)Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$AddressVO;", "Lru/ozon/app/android/csma/orderTracking/data/MarqueeAddressDTO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$MarqueeAddressVO;", "(Lru/ozon/app/android/csma/orderTracking/data/MarqueeAddressDTO;)Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$MarqueeAddressVO;", "Lru/ozon/app/android/csma/orderTracking/data/DescriptionDTO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/DescriptionVO;", "(Lru/ozon/app/android/csma/orderTracking/data/DescriptionDTO;)Lru/ozon/app/android/ordertracking/v4/presentation/model/DescriptionVO;", "Lru/ozon/app/android/csma/orderTracking/data/ImageDTO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/ImageVO;", "(Lru/ozon/app/android/csma/orderTracking/data/ImageDTO;)Lru/ozon/app/android/ordertracking/v4/presentation/model/ImageVO;", "id", "(Lru/ozon/app/android/csma/orderTracking/data/OrderTrackingV4DTO;J)Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingV4VO;", "", "Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "toUpdateAction", "(Ljava/lang/String;)Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", "appendEnd", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "appendStart", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/csma/orderTracking/data/OrderTrackingV4DTO;Ll20/d;)Ljava/util/List;", "mapByStateOnly", "Companion", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTrackingV4Mapper implements Function2<OrderTrackingV4DTO, d, List<? extends OrderTrackingV4VO>> {
    private final OzonSpannableString appendEnd(OzonSpannableString ozonSpannableString, String str) {
        StringBuilder sb2 = new StringBuilder(ozonSpannableString);
        sb2.append(str);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return OzonSpannableStringKt.toOzonSpannableString(sb2);
    }

    private final OzonSpannableString appendStart(OzonSpannableString ozonSpannableString, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append((CharSequence) ozonSpannableString);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return OzonSpannableStringKt.toOzonSpannableString(sb2);
    }

    private final AllOrdersVO toAllOrdersVO(SideButtonDTO sideButtonDTO, long j11) {
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(sideButtonDTO.getAction(), sideButtonDTO.getTrackingInfo());
        return new AllOrdersVO(j11, sideButtonDTO.getIcon(), sideButtonDTO.getText(), atomAction);
    }

    private final UpdateAction toUpdateAction(String str) {
        return h.t(str, "OnMain", true) ? new UpdateAction.UpdateActionMain(str) : new UpdateAction.UpdateActionLK(str);
    }

    private final PaddingVO toVO(PaddingDTO paddingDTO) {
        Integer left;
        Integer bottom;
        Integer right;
        Integer top;
        return new PaddingVO((paddingDTO == null || (top = paddingDTO.getTop()) == null) ? Paddings.PADDING_300.getPx() : top.intValue(), (paddingDTO == null || (right = paddingDTO.getRight()) == null) ? Paddings.PADDING_500.getPx() : right.intValue(), (paddingDTO == null || (bottom = paddingDTO.getBottom()) == null) ? Paddings.NONE.getPx() : bottom.intValue(), (paddingDTO == null || (left = paddingDTO.getLeft()) == null) ? Paddings.NONE.getPx() : left.intValue());
    }

    private final SubtitleVO.SubtitleTextVO toVo(SubtitleDTO subtitleDTO) {
        int intValue;
        String text = subtitleDTO.getText();
        String color = subtitleDTO.getColor();
        Integer breakPosition = subtitleDTO.getBreakPosition();
        Integer num = null;
        if (breakPosition != null && (intValue = breakPosition.intValue()) < subtitleDTO.getText().length()) {
            num = Integer.valueOf(Math.abs(intValue));
        }
        return new SubtitleVO.SubtitleTextVO(text, color, num);
    }

    @NotNull
    public final OrderTrackingV4VO mapByStateOnly(@NotNull OrderTrackingV4DTO state, long id2) {
        Intrinsics.checkNotNullParameter(state, "state");
        return toVO(state, id2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderTrackingV4VO> invoke(@NotNull OrderTrackingV4DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final String appendEnd(String str, String str2) {
        String str3 = str + str2;
        Intrinsics.checkNotNullExpressionValue(str3, "toString(...)");
        return str3;
    }

    private final String appendStart(String str, String str2) {
        String str3 = str2 + str;
        Intrinsics.checkNotNullExpressionValue(str3, "toString(...)");
        return str3;
    }

    private final SubtitleVO.AddressVO toVo(AddressDTO addressDTO) {
        TextDTO copy$default = TextDTO.copy$default(addressDTO.getDeliveryVariantName(), appendEnd(addressDTO.getDeliveryVariantName().getText(), ": "), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
        TextDTO street = addressDTO.getStreet();
        TextDTO house = addressDTO.getHouse();
        TextDTO textDTO = null;
        if (house != null && !h.K(house.getText())) {
            textDTO = TextDTO.copy$default(house, appendStart(house.getText(), ", "), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
        }
        return new SubtitleVO.AddressVO(copy$default, street, textDTO, null, 8, null);
    }

    private final BarcodeVO toVO(SideButtonDTO sideButtonDTO, long j11) {
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(sideButtonDTO.getAction(), sideButtonDTO.getTrackingInfo());
        IconDTO icon = sideButtonDTO.getIcon();
        Map<String, TokenizedTrackingInfo> trackingInfo = sideButtonDTO.getTrackingInfo();
        return new BarcodeVO(j11, icon, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final OrderVO toVO(TileDTO tileDTO, long j11, int i11, Boolean bool) {
        SubtitleVO vo;
        long j12 = j11 + i11 + 1;
        ImageVO vo2 = toVO(tileDTO.getImage());
        BadgeDTO badge = tileDTO.getBadge();
        TitleVO vo3 = toVO(tileDTO.getTitle());
        SubtitleDTO subtitle = tileDTO.getSubtitle();
        if (subtitle == null || (vo = toVo(subtitle)) == null) {
            AddressDTO address = tileDTO.getAddress();
            if (address != null) {
                vo = toVo(address);
            } else {
                MarqueeAddressDTO marqueeAddress = tileDTO.getMarqueeAddress();
                vo = marqueeAddress != null ? toVO(marqueeAddress) : null;
            }
        }
        SubtitleVO subtitleVO = vo;
        DescriptionDTO description = tileDTO.getDescription();
        DescriptionVO vo4 = description != null ? toVO(description) : null;
        ButtonDTO button = tileDTO.getButton();
        BadgeDTO actionBadge = tileDTO.getActionBadge();
        Map<String, TokenizedTrackingInfo> trackingInfo = tileDTO.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        Boolean isAdult = tileDTO.getImage().isAdult();
        boolean booleanValue = isAdult != null ? isAdult.booleanValue() : false;
        AtomActionDTO action = tileDTO.getAction();
        return new OrderVO(j12, vo2, badge, vo3, subtitleVO, vo4, button, actionBadge, action != null ? AtomActionMapperKt.toAtomAction(action, tileDTO.getTrackingInfo()) : null, tokenizedEvent$default, booleanValue, false, bool != null ? bool.booleanValue() : false, 2048, null);
    }

    private final TitleVO toVO(TitleDTO titleDTO) {
        DateTime dateTime;
        String text = titleDTO.getText();
        String color = titleDTO.getColor();
        IconDTO icon = titleDTO.getIcon();
        Integer timeLeft = titleDTO.getTimeLeft();
        if (timeLeft != null) {
            dateTime = new DateTime().m(timeLeft.intValue());
        } else {
            dateTime = null;
        }
        return new TitleVO(text, color, icon, dateTime);
    }

    private final SubtitleVO.MarqueeAddressVO toVO(MarqueeAddressDTO marqueeAddressDTO) {
        String appendEnd = appendEnd(marqueeAddressDTO.getDeliveryVariantNameText(), ": ");
        String streetText = marqueeAddressDTO.getStreetText();
        String houseText = marqueeAddressDTO.getHouseText();
        String str = null;
        if (houseText != null) {
            if (h.K(houseText)) {
                houseText = null;
            }
            if (houseText != null) {
                str = appendStart(houseText, ", ");
            }
        }
        return new SubtitleVO.MarqueeAddressVO(appendEnd, streetText, str, marqueeAddressDTO.getTextColor(), marqueeAddressDTO.getAnimationParams());
    }

    private final DescriptionVO toVO(DescriptionDTO descriptionDTO) {
        return new DescriptionVO(descriptionDTO.getText(), descriptionDTO.getColor());
    }

    private final ImageVO toVO(ImageDTO imageDTO) {
        return new ImageVO(imageDTO.getImage(), imageDTO.isOpacity());
    }

    private final OrderTrackingV4VO toVO(OrderTrackingV4DTO orderTrackingV4DTO, long j11) {
        AllOrdersVO allOrdersVO;
        BarcodeVO vo;
        List<TileDTO> list = orderTrackingV4DTO.getList();
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TileDTO tileDTO = (TileDTO) obj;
            boolean z11 = true;
            if (orderTrackingV4DTO.getList().size() != 1 || orderTrackingV4DTO.getRightSideButton() != null) {
                z11 = false;
            }
            arrayList.add(toVO(tileDTO, j11, i11, Boolean.valueOf(z11)));
            i11 = i12;
        }
        b builder = C7714v.B();
        SideButtonDTO sideButton = orderTrackingV4DTO.getSideButton();
        if (sideButton != null && (vo = toVO(sideButton, j11)) != null) {
            builder.add(vo);
        }
        builder.addAll(arrayList);
        SideButtonDTO rightSideButton = orderTrackingV4DTO.getRightSideButton();
        if (rightSideButton != null && (allOrdersVO = toAllOrdersVO(rightSideButton, orderTrackingV4DTO.getList().size() + j11)) != null) {
            builder.add(allOrdersVO);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new OrderTrackingV4VO(j11, toVO(orderTrackingV4DTO.getPadding()), orderTrackingV4DTO.getBackgroundColor(), builder.B(), toUpdateAction(orderTrackingV4DTO.getActionName()), null);
    }
}
