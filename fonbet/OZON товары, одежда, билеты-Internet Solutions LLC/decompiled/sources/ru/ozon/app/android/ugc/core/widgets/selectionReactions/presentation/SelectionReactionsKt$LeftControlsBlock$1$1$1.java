package ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation;

import a1.C4912a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation.SelectionReactionsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import v0.G;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class SelectionReactionsKt$LeftControlsBlock$1$1$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ SelectionReactionsVO.ReactionsBlockVO $block;
    final /* synthetic */ long $voId;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO$ReactionsControlVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation.SelectionReactionsKt$LeftControlsBlock$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<SelectionReactionsVO.ReactionsControlVO, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(SelectionReactionsVO.ReactionsControlVO it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getKey();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SelectionReactionsKt$LeftControlsBlock$1$1$1(SelectionReactionsVO.ReactionsBlockVO reactionsBlockVO, long j11, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$block = reactionsBlockVO;
        this.$voId = j11;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        List<SelectionReactionsVO.ReactionsControlVO> controls = this.$block.getControls();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        long j11 = this.$voId;
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        LazyRow.a(controls.size(), anonymousClass1 != null ? new SelectionReactionsKt$LeftControlsBlock$1$1$1$invoke$$inlined$items$default$2(anonymousClass1, controls) : null, new SelectionReactionsKt$LeftControlsBlock$1$1$1$invoke$$inlined$items$default$3(SelectionReactionsKt$LeftControlsBlock$1$1$1$invoke$$inlined$items$default$1.INSTANCE, controls), new C4912a(true, -632812321, new SelectionReactionsKt$LeftControlsBlock$1$1$1$invoke$$inlined$items$default$4(controls, j11, function1)));
    }
}
