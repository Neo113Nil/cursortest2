package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.horizontal;

import S0.A1;
import a1.C4912a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.di.PlayerShowcaseComponent;
import v0.G;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class PlayerShowcaseHorizontalComposableKt$PlayerShowcaseHorizontalComposable$1$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ PlayerShowcaseComponent $component;
    final /* synthetic */ PlayerShowcaseHorizontalVI $item;
    final /* synthetic */ A1<Set<Integer>> $visibleIndices$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlayerShowcaseHorizontalComposableKt$PlayerShowcaseHorizontalComposable$1$1(PlayerShowcaseHorizontalVI playerShowcaseHorizontalVI, PlayerShowcaseComponent playerShowcaseComponent, A1<? extends Set<Integer>> a12) {
        super(1);
        this.$item = playerShowcaseHorizontalVI;
        this.$component = playerShowcaseComponent;
        this.$visibleIndices$delegate = a12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        List<String> videoUrls = this.$item.getVideoUrls();
        LazyRow.a(videoUrls.size(), null, new PlayerShowcaseHorizontalComposableKt$PlayerShowcaseHorizontalComposable$1$1$invoke$$inlined$itemsIndexed$default$2(videoUrls), new C4912a(true, -1091073711, new PlayerShowcaseHorizontalComposableKt$PlayerShowcaseHorizontalComposable$1$1$invoke$$inlined$itemsIndexed$default$3(videoUrls, this.$item, this.$component, this.$visibleIndices$delegate)));
    }
}
