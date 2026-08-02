package ru.ozon.app.android.miniapp;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.miniapp.databinding.ActivityMiniAppWebBinding;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MiniAppWebActivity$initNavBar$1$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ ActivityMiniAppWebBinding $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiniAppWebActivity$initNavBar$1$1(ActivityMiniAppWebBinding activityMiniAppWebBinding) {
        super(1);
        this.$this_with = activityMiniAppWebBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ConstraintLayout navBar = this.$this_with.navBar;
        Intrinsics.checkNotNullExpressionValue(navBar, "navBar");
        ViewExtKt.gone(navBar);
    }
}
