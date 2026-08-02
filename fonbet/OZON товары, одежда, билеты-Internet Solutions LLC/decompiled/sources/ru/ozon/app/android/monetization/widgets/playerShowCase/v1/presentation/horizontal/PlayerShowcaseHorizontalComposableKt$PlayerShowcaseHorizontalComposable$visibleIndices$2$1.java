package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.horizontal;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import v0.I;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PlayerShowcaseHorizontalComposableKt$PlayerShowcaseHorizontalComposable$visibleIndices$2$1 extends AbstractC7737t implements Function0<Set<? extends Integer>> {
    final /* synthetic */ I $listState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerShowcaseHorizontalComposableKt$PlayerShowcaseHorizontalComposable$visibleIndices$2$1(I i11) {
        super(0);
        this.$listState = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends Integer> invoke() {
        Set<? extends Integer> visibleIndices;
        visibleIndices = PlayerShowcaseHorizontalComposableKt.getVisibleIndices(this.$listState, 50.0f);
        return visibleIndices;
    }
}
