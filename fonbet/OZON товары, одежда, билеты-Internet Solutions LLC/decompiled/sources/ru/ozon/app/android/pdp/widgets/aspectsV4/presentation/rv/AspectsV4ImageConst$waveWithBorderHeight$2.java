package ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsV4ImageConst$waveWithBorderHeight$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ boolean $isSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsV4ImageConst$waveWithBorderHeight$2(boolean z11) {
        super(0);
        this.$isSelect = z11;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.$isSelect ? Dimens.INSTANCE.getDP_10() : Dimens.INSTANCE.getDP_7());
    }
}
