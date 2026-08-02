package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.data;

import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.data.TravelPaymentV4DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.TravelPaymentV4VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/data/TravelPaymentV4Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/data/TravelPaymentV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/data/TravelPaymentV4DTO$PaymentMethod;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;", "toVO", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/data/TravelPaymentV4DTO$PaymentMethod;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$PaymentMethod;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/data/TravelPaymentV4DTO;Ll20/d;)Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPaymentV4Mapper implements Function2<TravelPaymentV4DTO, d, List<? extends TravelPaymentV4VO>> {
    private final TravelPaymentV4VO.PaymentMethod toVO(TravelPaymentV4DTO.PaymentMethod paymentMethod) {
        AtomActionDTO action;
        AtomActionDTO action2;
        AtomActionDTO action3;
        Object content = paymentMethod.getContent();
        if (content instanceof TravelPaymentV4DTO.BankCard) {
            long hashCode = (((TravelPaymentV4DTO.BankCard) paymentMethod.getContent()).getBankImage() + ((TravelPaymentV4DTO.BankCard) paymentMethod.getContent()).getNumber()).hashCode();
            String bankImage = ((TravelPaymentV4DTO.BankCard) paymentMethod.getContent()).getBankImage();
            TextDTO number = ((TravelPaymentV4DTO.BankCard) paymentMethod.getContent()).getNumber();
            ImageDTO paymentSystem = ((TravelPaymentV4DTO.BankCard) paymentMethod.getContent()).getPaymentSystem();
            String backgroundColor = ((TravelPaymentV4DTO.BankCard) paymentMethod.getContent()).getBackgroundColor();
            String borderColor = paymentMethod.getBorderColor();
            CommonControlSettings common = paymentMethod.getCommon();
            AtomAction atomAction = (common == null || (action3 = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action3, paymentMethod.getCommon().getTrackingInfo());
            BadgeDTO badge = paymentMethod.getBadge();
            CommonControlSettings common2 = paymentMethod.getCommon();
            return new TravelPaymentV4VO.BankCardMethodVO(hashCode, borderColor, common2 != null ? common2.getTestInfo() : null, atomAction, bankImage, number, paymentSystem, backgroundColor, badge);
        }
        if (!(content instanceof TravelPaymentV4DTO.CustomMethod)) {
            if (!(content instanceof TravelPaymentV4DTO.ImageBankCard)) {
                throw new IllegalStateException("Illegal type of PaymentMethod content");
            }
            long hashCode2 = ((TravelPaymentV4DTO.ImageBankCard) paymentMethod.getContent()).m1270unboximpl().hashCode();
            String m1270unboximpl = ((TravelPaymentV4DTO.ImageBankCard) paymentMethod.getContent()).m1270unboximpl();
            String borderColor2 = paymentMethod.getBorderColor();
            CommonControlSettings common3 = paymentMethod.getCommon();
            AtomAction atomAction2 = (common3 == null || (action = common3.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, paymentMethod.getCommon().getTrackingInfo());
            BadgeDTO badge2 = paymentMethod.getBadge();
            CommonControlSettings common4 = paymentMethod.getCommon();
            return new TravelPaymentV4VO.BankImageMethodVO(hashCode2, borderColor2, common4 != null ? common4.getTestInfo() : null, atomAction2, m1270unboximpl, badge2);
        }
        TextDTO title = ((TravelPaymentV4DTO.CustomMethod) paymentMethod.getContent()).getTitle();
        IconDTO icon = ((TravelPaymentV4DTO.CustomMethod) paymentMethod.getContent()).getIcon();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(title);
        sb2.append(icon);
        long hashCode3 = sb2.toString().hashCode();
        TextDTO title2 = ((TravelPaymentV4DTO.CustomMethod) paymentMethod.getContent()).getTitle();
        IconDTO icon2 = ((TravelPaymentV4DTO.CustomMethod) paymentMethod.getContent()).getIcon();
        String backgroundColor2 = ((TravelPaymentV4DTO.CustomMethod) paymentMethod.getContent()).getBackgroundColor();
        String borderColor3 = paymentMethod.getBorderColor();
        CommonControlSettings common5 = paymentMethod.getCommon();
        AtomAction atomAction3 = (common5 == null || (action2 = common5.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action2, paymentMethod.getCommon().getTrackingInfo());
        BadgeDTO badge3 = paymentMethod.getBadge();
        CommonControlSettings common6 = paymentMethod.getCommon();
        return new TravelPaymentV4VO.CustomMethodVO(hashCode3, borderColor3, common6 != null ? common6.getTestInfo() : null, atomAction3, title2, icon2, backgroundColor2, badge3);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelPaymentV4VO> invoke(@NotNull TravelPaymentV4DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<TravelPaymentV4DTO.PaymentMethod> paymentMethods = state.getPaymentMethods();
        ArrayList arrayList = new ArrayList(C7714v.z(paymentMethods, 10));
        Iterator<T> it = paymentMethods.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((TravelPaymentV4DTO.PaymentMethod) it.next()));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new TravelPaymentV4VO(hashCode, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
