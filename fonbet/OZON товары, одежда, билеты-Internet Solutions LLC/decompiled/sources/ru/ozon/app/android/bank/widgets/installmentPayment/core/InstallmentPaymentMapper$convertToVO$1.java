package ru.ozon.app.android.bank.widgets.installmentPayment.core;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.bank.widgets.installmentPayment.presentation.InstallmentPaymentVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO$IconTitleVO;", "i", "", "a", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class InstallmentPaymentMapper$convertToVO$1 extends AbstractC7737t implements Function2<String, AtomActionDTO, InstallmentPaymentVO.IconTitleVO> {
    final /* synthetic */ Map<String, TokenizedTrackingInfo> $trackingInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstallmentPaymentMapper$convertToVO$1(Map<String, TokenizedTrackingInfo> map) {
        super(2);
        this.$trackingInfo = map;
    }

    @Override // kotlin.jvm.functions.Function2
    public final InstallmentPaymentVO.IconTitleVO invoke(String i11, AtomActionDTO a11) {
        Intrinsics.checkNotNullParameter(i11, "i");
        Intrinsics.checkNotNullParameter(a11, "a");
        return new InstallmentPaymentVO.IconTitleVO(i11, AtomActionMapperKt.toAtomAction(a11, this.$trackingInfo));
    }
}
