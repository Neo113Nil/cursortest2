package ru.ozon.app.android.search.widgets.tapTags.v3.presentation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.navigationblocks.presentation.DrawableExtKt;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.views.searchShimmer.SearchShimmer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007J\u0006\u0010\u001f\u001a\u00020\u001dJ\b\u0010 \u001a\u00020\u001dH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3View;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bottomCornerRadius", "", "horizontalPadding", "redesignedHorizontalPadding", "itemPadding", "layoutManagerMaxLines", "Ljava/lang/Integer;", "roundedBottomBackground", "Landroid/graphics/drawable/GradientDrawable;", "tapTagsRV", "Landroidx/recyclerview/widget/RecyclerView;", "getTapTagsRV", "()Landroidx/recyclerview/widget/RecyclerView;", "shimmer", "Lru/ozon/app/android/search/views/searchShimmer/SearchShimmer;", "getShimmer", "()Lru/ozon/app/android/search/views/searchShimmer/SearchShimmer;", "setMaxLines", "", "maxLines", "setRedesign", "addViews", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TapTagsV3View extends LinearLayout {
    private final float bottomCornerRadius;
    private final int horizontalPadding;
    private final int itemPadding;
    private Integer layoutManagerMaxLines;
    private final int redesignedHorizontalPadding;

    @NotNull
    private final GradientDrawable roundedBottomBackground;

    @NotNull
    private final SearchShimmer shimmer;

    @NotNull
    private final RecyclerView tapTagsRV;
    public static final int $stable = 8;

    public /* synthetic */ TapTagsV3View(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void addViews() {
        addView(this.tapTagsRV);
        addView(this.shimmer);
    }

    @NotNull
    public final SearchShimmer getShimmer() {
        return this.shimmer;
    }

    @NotNull
    public final RecyclerView getTapTagsRV() {
        return this.tapTagsRV;
    }

    public final void setMaxLines(final int maxLines) {
        Integer num = this.layoutManagerMaxLines;
        if (num != null && maxLines == num.intValue()) {
            return;
        }
        RecyclerView recyclerView = this.tapTagsRV;
        final Context context = getContext();
        recyclerView.setLayoutManager(new FlexboxLayoutManager(context) { // from class: ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3View$setMaxLines$1
            @Override // com.google.android.flexbox.FlexboxLayoutManager, com.google.android.flexbox.a
            public List<c> getFlexLinesInternal() {
                List<c> flexLinesInternal = super.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                int i11 = maxLines;
                if (size > i11) {
                    flexLinesInternal.subList(i11, size).clear();
                }
                return flexLinesInternal;
            }
        });
    }

    public final void setRedesign() {
        RecyclerView recyclerView = this.tapTagsRV;
        int i11 = this.redesignedHorizontalPadding;
        ViewExtKt.updatePadding$default(recyclerView, i11, 0, i11, 0, 10, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapTagsV3View(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(16);
        this.bottomCornerRadius = pxF;
        int px = UiExtKt.toPx(16);
        this.horizontalPadding = px;
        this.redesignedHorizontalPadding = UiExtKt.toPx(5);
        int px2 = UiExtKt.toPx(8);
        this.itemPadding = px2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.layerFloor1)));
        gradientDrawable.setCornerRadii(DrawableExtKt.createCornerRadii$default(0.0f, 0.0f, pxF, pxF, 3, null));
        this.roundedBottomBackground = gradientDrawable;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.tapTagsV3);
        recyclerView.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        recyclerView.setBackground(gradientDrawable);
        recyclerView.setLayoutParams(new FlexboxLayout.a(-1, -2));
        ViewExtKt.updatePadding$default(recyclerView, px - px2, 0, px - px2, px2, 2, null);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new FlexboxLayoutManager(context));
        recyclerView.setItemAnimator(null);
        this.tapTagsRV = recyclerView;
        SearchShimmer searchShimmer = new SearchShimmer(context, null, 0, 6, null);
        searchShimmer.setVisibility(8);
        searchShimmer.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.shimmer = searchShimmer;
        setElevation(1.0f);
        setOutlineProvider(null);
        setOrientation(1);
        setBackgroundColor(getResources().getColor(R.color.transparent, context.getTheme()));
        addViews();
    }
}
