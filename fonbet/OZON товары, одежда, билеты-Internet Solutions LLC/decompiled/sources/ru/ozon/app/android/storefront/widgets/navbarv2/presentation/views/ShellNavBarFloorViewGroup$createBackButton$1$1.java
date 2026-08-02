package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ShellNavBarFloorViewGroup$createBackButton$1$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ IconButtonV3View $this_apply;
    final /* synthetic */ Function0<Unit> $trackClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShellNavBarFloorViewGroup$createBackButton$1$1(Function0<Unit> function0, IconButtonV3View iconButtonV3View) {
        super(1);
        this.$trackClick = function0;
        this.$this_apply = iconButtonV3View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function0<Unit> function0 = this.$trackClick;
        if (function0 != null) {
            function0.invoke();
        }
        Context context = this.$this_apply.getContext();
        g gVar = context instanceof g ? (g) context : null;
        if (gVar != null) {
            gVar.onSupportNavigateUp();
        }
    }
}
