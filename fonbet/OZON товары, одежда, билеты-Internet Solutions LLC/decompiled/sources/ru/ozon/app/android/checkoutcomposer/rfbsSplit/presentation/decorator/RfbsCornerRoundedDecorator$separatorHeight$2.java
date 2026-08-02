package ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.decorator;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RfbsCornerRoundedDecorator$separatorHeight$2 extends AbstractC7737t implements Function0<Integer> {
    public static final RfbsCornerRoundedDecorator$separatorHeight$2 INSTANCE = new RfbsCornerRoundedDecorator$separatorHeight$2();

    RfbsCornerRoundedDecorator$separatorHeight$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf((int) IslandSeparatorView.INSTANCE.getCORNER_HEIGHT_PX());
    }
}
