package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.presentation;

import Tg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.presentation.EntryBannerVI;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class EntryBannerComposableKt$EntryBannerComposable$3$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<b, Unit> $onAtomAction;
    final /* synthetic */ EntryBannerVI.Content $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EntryBannerComposableKt$EntryBannerComposable$3$1(EntryBannerVI.Content content, Function1<? super b, Unit> function1) {
        super(0);
        this.$state = content;
        this.$onAtomAction = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomAction clickAction = this.$state.getClickAction();
        if (clickAction != null) {
            this.$onAtomAction.invoke(clickAction);
        }
    }
}
