package ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsV4ImageConst$waveWithBorderWidth$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ boolean $isSelect;
    final /* synthetic */ AspectsV4ImageConst this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsV4ImageConst$waveWithBorderWidth$2(boolean z11, AspectsV4ImageConst aspectsV4ImageConst) {
        super(0);
        this.$isSelect = z11;
        this.this$0 = aspectsV4ImageConst;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        float f7;
        float f11;
        if (this.$isSelect) {
            f11 = this.this$0.get_waveWithBorderWidth();
            f7 = f11 - (this.this$0.getImageRadius() / 2);
        } else {
            f7 = this.this$0.get_waveWithBorderWidth();
        }
        return Integer.valueOf((int) f7);
    }
}
