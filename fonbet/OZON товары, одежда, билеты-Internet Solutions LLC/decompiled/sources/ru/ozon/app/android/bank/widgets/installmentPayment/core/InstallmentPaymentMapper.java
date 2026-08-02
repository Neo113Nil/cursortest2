package ru.ozon.app.android.bank.widgets.installmentPayment.core;

import E30.g;
import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.bank.widgets.installmentPayment.data.InstallmentPaymentDTO;
import ru.ozon.app.android.bank.widgets.installmentPayment.presentation.InstallmentPaymentVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u0004\u0018\u00010\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0014J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0003j\u0002`\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPayment/core/InstallmentPaymentMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO;", "Ll20/d;", "", "Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO$IconTitleDTO;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO$IconTitleVO;", "convertToVO", "(Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO$IconTitleDTO;Ljava/util/Map;)Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO$IconTitleVO;", "Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO$PaymentDTO;", "", "Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO$PaymentVO;", "(Ljava/util/List;)Ljava/util/List;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO;Ll20/d;)Ljava/util/List;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InstallmentPaymentMapper implements Function2<InstallmentPaymentDTO, d, List<? extends InstallmentPaymentVO>> {
    private final InstallmentPaymentVO.IconTitleVO convertToVO(InstallmentPaymentDTO.IconTitleDTO iconTitleDTO, Map<String, TokenizedTrackingInfo> map) {
        return (InstallmentPaymentVO.IconTitleVO) g.a(new InstallmentPaymentMapper$convertToVO$1(map), iconTitleDTO != null ? iconTitleDTO.getIcon() : null, iconTitleDTO != null ? iconTitleDTO.getAction() : null);
    }

    private final List<InstallmentPaymentVO.PaymentVO> convertToVO(List<InstallmentPaymentDTO.PaymentDTO> list) {
        ArrayList arrayList = new ArrayList();
        for (InstallmentPaymentDTO.PaymentDTO paymentDTO : list) {
            arrayList.add(new InstallmentPaymentVO.PaymentVO(paymentDTO.getAmount(), paymentDTO.getDate(), paymentDTO.getBackgroundColor()));
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InstallmentPaymentVO> invoke(@NotNull InstallmentPaymentDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = dto.hashCode();
        TextAtom title = dto.getTitle();
        TextAtom subtitle = dto.getSubtitle();
        List<InstallmentPaymentVO.PaymentVO> convertToVO = convertToVO(dto.getPayments());
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        TextAtom titleGrace = dto.getTitleGrace();
        TextAtom subtitleGrace = dto.getSubtitleGrace();
        List<InstallmentPaymentDTO.PaymentDTO> paymentsGrace = dto.getPaymentsGrace();
        List<InstallmentPaymentVO.PaymentVO> convertToVO2 = paymentsGrace != null ? convertToVO(paymentsGrace) : null;
        ButtonV3Atom.SmallBorderlessButtonWithIcon paymentsSwitch = dto.getPaymentsSwitch();
        ButtonV3Atom.SmallBorderlessButtonWithIcon paymentsGraceSwitch = dto.getPaymentsGraceSwitch();
        InstallmentPaymentDTO.IconTitleDTO iconTitle = dto.getIconTitle();
        return C7714v.a0(new InstallmentPaymentVO(hashCode, title, subtitle, convertToVO, tokenizedEvent$default, titleGrace, subtitleGrace, convertToVO2, paymentsSwitch, paymentsGraceSwitch, iconTitle != null ? convertToVO(iconTitle, dto.getTrackingInfo()) : null));
    }
}
