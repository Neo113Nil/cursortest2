package ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation;

import Sh.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "timeMs", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$2$1 extends AbstractC7737t implements Function1<Long, String> {
    public static final PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$2$1 INSTANCE = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$2$1();

    PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$2$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ String invoke(Long l11) {
        return invoke(l11.longValue());
    }

    public final String invoke(long j11) {
        if (j11 < 0) {
            j11 = 0;
        }
        return b.b(j11 / 1000, "T+", "s");
    }
}
