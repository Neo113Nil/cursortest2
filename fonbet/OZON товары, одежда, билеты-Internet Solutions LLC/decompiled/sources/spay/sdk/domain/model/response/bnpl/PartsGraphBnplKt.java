package spay.sdk.domain.model.response.bnpl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toGraphBnpl", "Lspay/sdk/domain/model/response/bnpl/GraphBnpl;", "Lspay/sdk/domain/model/response/bnpl/PartsGraphBnpl;", "SPaySDK_baseRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PartsGraphBnplKt {
    @NotNull
    public static final GraphBnpl toGraphBnpl(@NotNull PartsGraphBnpl partsGraphBnpl) {
        Intrinsics.checkNotNullParameter(partsGraphBnpl, "<this>");
        return new GraphBnpl(partsGraphBnpl.getHeader(), partsGraphBnpl.getContent(), String.valueOf(partsGraphBnpl.getSixPartPay().get(0).getCount()), partsGraphBnpl.getText(), partsGraphBnpl.getSixPartPay().get(0).getPayments());
    }
}
