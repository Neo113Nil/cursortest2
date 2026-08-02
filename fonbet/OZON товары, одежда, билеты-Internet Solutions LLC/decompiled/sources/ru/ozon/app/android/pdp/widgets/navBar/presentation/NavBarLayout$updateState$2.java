package ru.ozon.app.android.pdp.widgets.navBar.presentation;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "alpha", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class NavBarLayout$updateState$2 extends AbstractC7737t implements Function1<Float, Unit> {
    final /* synthetic */ boolean $isVisibleState;
    final /* synthetic */ Function0<Unit> $onShownSubWidget;
    final /* synthetic */ NavBarLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavBarLayout$updateState$2(NavBarLayout navBarLayout, boolean z11, Function0<Unit> function0) {
        super(1);
        this.this$0 = navBarLayout;
        this.$isVisibleState = z11;
        this.$onShownSubWidget = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke(f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7) {
        View first;
        View first2;
        this.this$0.getCenterNestedWidgetContainer().setAlpha(f7);
        if (this.$isVisibleState && f7 == 1.0f) {
            this.$onShownSubWidget.invoke();
        }
        int i11 = 0;
        if (f7 == 0.0f && !this.$isVisibleState && (first2 = ViewGroupExtKt.first(this.this$0.getCenterNestedWidgetContainer())) != null && first2.getVisibility() == 0) {
            FrameLayout centerNestedWidgetContainer = this.this$0.getCenterNestedWidgetContainer();
            int childCount = centerNestedWidgetContainer.getChildCount();
            while (i11 < childCount) {
                ViewExtKt.gone(centerNestedWidgetContainer.getChildAt(i11));
                i11++;
            }
            return;
        }
        if (f7 == 0.0f && this.$isVisibleState && (first = ViewGroupExtKt.first(this.this$0.getCenterNestedWidgetContainer())) != null) {
            if (!(first.getVisibility() == 0)) {
                FrameLayout centerNestedWidgetContainer2 = this.this$0.getCenterNestedWidgetContainer();
                int childCount2 = centerNestedWidgetContainer2.getChildCount();
                while (i11 < childCount2) {
                    ViewExtKt.show(centerNestedWidgetContainer2.getChildAt(i11));
                    i11++;
                }
            }
        }
    }
}
