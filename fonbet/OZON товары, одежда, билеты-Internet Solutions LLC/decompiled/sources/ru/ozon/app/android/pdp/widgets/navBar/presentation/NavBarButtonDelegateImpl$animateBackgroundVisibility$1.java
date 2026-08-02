package ru.ozon.app.android.pdp.widgets.navBar.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class NavBarButtonDelegateImpl$animateBackgroundVisibility$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onInvalidate;
    final /* synthetic */ NavBarButtonDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavBarButtonDelegateImpl$animateBackgroundVisibility$1(NavBarButtonDelegateImpl navBarButtonDelegateImpl, Function0<Unit> function0) {
        super(1);
        this.this$0 = navBarButtonDelegateImpl;
        this.$onInvalidate = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        this.this$0.animationAlpha = i11;
        this.$onInvalidate.invoke();
    }
}
