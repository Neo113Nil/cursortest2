package ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/PaddingsVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PaddingsVO$Companion$default$2 extends AbstractC7737t implements Function0<PaddingsVO> {
    public static final PaddingsVO$Companion$default$2 INSTANCE = new PaddingsVO$Companion$default$2();

    PaddingsVO$Companion$default$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final PaddingsVO invoke() {
        return new PaddingsVO(UiExtKt.toPx(10), UiExtKt.toPx(12), UiExtKt.toPx(12), UiExtKt.toPx(12), UiExtKt.toPx(4), UiExtKt.toPx(8), UiExtKt.toPx(8));
    }
}
