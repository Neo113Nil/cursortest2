package ru.ozon.uni.android.flashbar.main;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.flashbar.model.Action;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "flashbar", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class Flashbar$rebind$1$1$1 extends AbstractC7737t implements Function1<Flashbar, Unit> {
    final /* synthetic */ Action $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Flashbar$rebind$1$1$1(Action action) {
        super(1);
        this.$it = action;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Flashbar flashbar) {
        invoke2(flashbar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Flashbar flashbar) {
        Intrinsics.checkNotNullParameter(flashbar, "flashbar");
        this.$it.getAction().invoke();
        if (this.$it.getCloseAfterActionRequired()) {
            flashbar.dismiss();
        }
    }
}
