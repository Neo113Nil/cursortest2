package ru.ozon.app.android.tabbar.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationConfig;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class OzonBottomNavigationView$islandView$1 extends AbstractC7737t implements Function0<IslandSeparatorView> {
    final /* synthetic */ OzonBottomNavigationView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonBottomNavigationView$islandView$1(OzonBottomNavigationView ozonBottomNavigationView) {
        super(0);
        this.this$0 = ozonBottomNavigationView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IslandSeparatorView invoke() {
        Context context = this.this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IslandSeparatorView islandSeparatorView = new IslandSeparatorView(context, null, 0, 6, null);
        islandSeparatorView.setId(View.generateViewId());
        islandSeparatorView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        Context context2 = islandSeparatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        islandSeparatorView.setViewState(new IslandSeparatorView.ViewState(false, false, 1, ThemeExtKt.themeColor(context2, BottomNavigationConfig.TEENS.getBackgroundColor()), 1, null));
        this.this$0.addView(islandSeparatorView);
        return islandSeparatorView;
    }
}
