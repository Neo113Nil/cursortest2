package ru.ozon.app.android.search.widgets.insight.presentation;

import Hj.C3143a;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/presentation/InsightWidgetView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bottomLayerColor", "islandView", "Lru/ozon/app/android/search/widgets/insight/presentation/InsightIslandView;", "getIslandView", "()Lru/ozon/app/android/search/widgets/insight/presentation/InsightIslandView;", "setNotRoundedBg", "", "bgColor", "setIsland", "islandColor", "radius", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InsightWidgetView extends FrameLayout {
    private final int bottomLayerColor;

    @NotNull
    private final InsightIslandView islandView;

    public /* synthetic */ InsightWidgetView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final InsightIslandView getIslandView() {
        return this.islandView;
    }

    public final void setIsland(int islandColor, final int radius) {
        this.islandView.setBackgroundColor(islandColor);
        this.islandView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.search.widgets.insight.presentation.InsightWidgetView$setIsland$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), UiExtKt.toPxF(radius));
            }
        });
    }

    public final void setNotRoundedBg(int bgColor) {
        setBackgroundColor(bgColor);
        this.islandView.setOutlineProvider(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightWidgetView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int color = ResourceExtKt.color(context, R$color.layer_floor_0);
        this.bottomLayerColor = color;
        InsightIslandView insightIslandView = new InsightIslandView(context, null, 0, 0, 14, null);
        insightIslandView.setId(R$id.searchInsightIsland);
        insightIslandView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.islandView = insightIslandView;
        addView(insightIslandView);
        setBackgroundColor(color);
    }
}
