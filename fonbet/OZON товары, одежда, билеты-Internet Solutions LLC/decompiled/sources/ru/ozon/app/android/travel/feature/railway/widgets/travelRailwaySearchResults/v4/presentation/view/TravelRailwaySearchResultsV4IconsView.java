package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0014J\u0014\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4IconsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp10", "", "dp32", "visibleIconCount", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setIcons", "icons", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getOrCreateImageView", "Lru/ozon/uni/android/atom/icon/IconView;", "index", "railway_prodGoogleAllVendorsRelease", "iconView"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV4IconsView extends FrameLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {N.g(new C(TravelRailwaySearchResultsV4IconsView.class, "iconView", "<v#0>", 0))};
    public static final int $stable = 8;
    private int dp10;
    private int dp32;
    private int visibleIconCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelRailwaySearchResultsV4IconsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp10 = ResourceExtKt.toPx(10, context);
        this.dp32 = ResourceExtKt.toPx(32, context);
        getOrCreateImageView(0);
    }

    private final IconView getOrCreateImageView(int index) {
        if (index < getChildCount()) {
            View childAt = getChildAt(index);
            Intrinsics.g(childAt, "null cannot be cast to non-null type ru.ozon.uni.android.atom.icon.IconView");
            return (IconView) childAt;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return getOrCreateImageView$lambda$3(new PreCreationViewPoolDelegate(context, N.b(IconView.class), new TravelRailwaySearchResultsV4IconsView$getOrCreateImageView$$inlined$preCreationViewPool$default$1(this), new TravelRailwaySearchResultsV4IconsView$getOrCreateImageView$$inlined$preCreationViewPool$default$2(this)));
    }

    private static final IconView getOrCreateImageView$lambda$3(PreCreationViewPoolDelegate<IconView> preCreationViewPoolDelegate) {
        return preCreationViewPoolDelegate.getValue(null, $$delegatedProperties[0]);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + ((this.visibleIconCount - 1) * this.dp10) + this.dp32);
    }

    public final void setIcons(@NotNull List<IconDTO> icons) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.visibleIconCount = icons.size();
        int childCount = getChildCount();
        int i11 = 0;
        for (Object obj : icons) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            IconView orCreateImageView = getOrCreateImageView(i11);
            orCreateImageView.setVisibility(0);
            orCreateImageView.setTranslationY(i11 * this.dp10);
            IconHolderKt.bind$default(orCreateImageView, (IconDTO) obj, null, 2, null);
            i11 = i12;
        }
        int i13 = this.visibleIconCount;
        if (i13 < childCount) {
            while (i13 < childCount) {
                getChildAt(i13).setVisibility(8);
                i13++;
            }
        }
        requestLayout();
    }
}
