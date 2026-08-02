package ru.ozon.uni.android.controls.button;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.util.locator.StaticLocatorInitializer;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class InputSelectButtonView$locatorInitializers$5 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ InputSelectButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputSelectButtonView$locatorInitializers$5(InputSelectButtonView inputSelectButtonView) {
        super(1);
        this.this$0 = inputSelectButtonView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        StaticLocatorInitializer.INSTANCE.setStaticLocator$uni_release(view, "secondaryIcon", this.this$0.getLocatorTag());
    }
}
