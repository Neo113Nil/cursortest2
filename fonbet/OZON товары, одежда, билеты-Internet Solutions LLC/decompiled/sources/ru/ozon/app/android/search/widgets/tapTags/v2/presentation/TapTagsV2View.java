package ru.ozon.app.android.search.widgets.tapTags.v2.presentation;

import android.content.Context;
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
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.views.searchShimmer.SearchShimmer;
import ru.ozon.app.android.search.widgets.utils.SelectUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColorsSelect;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2View;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "", "hasBottomCorners", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;ZLandroid/util/AttributeSet;II)V", "", "addViews", "()V", "maxLines", "setMaxLines", "(I)V", "setRedesign", "Landroidx/recyclerview/widget/RecyclerView;", "tapTags", "Landroidx/recyclerview/widget/RecyclerView;", "getTapTags", "()Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "islandSeparator", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "getIslandSeparator", "()Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "Lru/ozon/app/android/search/views/searchShimmer/SearchShimmer;", "shimmer", "Lru/ozon/app/android/search/views/searchShimmer/SearchShimmer;", "getShimmer", "()Lru/ozon/app/android/search/views/searchShimmer/SearchShimmer;", "layoutManagerMaxLines", "Ljava/lang/Integer;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TapTagsV2View extends LinearLayout {

    @NotNull
    private final IslandSeparatorView islandSeparator;
    private Integer layoutManagerMaxLines;

    @NotNull
    private final SearchShimmer shimmer;

    @NotNull
    private final RecyclerView tapTags;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int HORIZONTAL_PADDING = UiExtKt.toPx(16);
    private static final int REDESIGNED_HORIZONTAL_RV_PADDING = UiExtKt.toPx(5);
    private static final int dp28 = UiExtKt.toPx(32);
    private static final int ITEM_PADDING = UiExtKt.toPx(4);
    private static final int REDESIGNED_HORIZONTAL_ITEM_PADDING = UiExtKt.toPx(3);
    private static final int REDESIGNED_BOTTOM_PADDING = UiExtKt.toPx(2);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2View$Companion;", "", "<init>", "()V", "DEFAULT_ELEVATION", "", "HORIZONTAL_PADDING", "", "REDESIGNED_HORIZONTAL_RV_PADDING", "dp28", "ITEM_PADDING", "getITEM_PADDING", "()I", "REDESIGNED_HORIZONTAL_ITEM_PADDING", "getREDESIGNED_HORIZONTAL_ITEM_PADDING", "REDESIGNED_BOTTOM_PADDING", "getREDESIGNED_BOTTOM_PADDING", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getITEM_PADDING() {
            return TapTagsV2View.ITEM_PADDING;
        }

        public final int getREDESIGNED_BOTTOM_PADDING() {
            return TapTagsV2View.REDESIGNED_BOTTOM_PADDING;
        }

        public final int getREDESIGNED_HORIZONTAL_ITEM_PADDING() {
            return TapTagsV2View.REDESIGNED_HORIZONTAL_ITEM_PADDING;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TapTagsV2View(Context context, boolean z11, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? true : z11, (i13 & 4) != 0 ? null : attributeSet, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? 0 : i12);
    }

    private final void addViews() {
        addView(this.tapTags);
        addView(this.islandSeparator);
        addView(this.shimmer);
    }

    @NotNull
    public final IslandSeparatorView getIslandSeparator() {
        return this.islandSeparator;
    }

    @NotNull
    public final RecyclerView getTapTags() {
        return this.tapTags;
    }

    public final void setMaxLines(final int maxLines) {
        Integer num = this.layoutManagerMaxLines;
        if (num != null && maxLines == num.intValue()) {
            return;
        }
        RecyclerView recyclerView = this.tapTags;
        final Context context = getContext();
        recyclerView.setLayoutManager(new FlexboxLayoutManager(context) { // from class: ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2View$setMaxLines$1
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
        RecyclerView recyclerView = this.tapTags;
        int i11 = REDESIGNED_HORIZONTAL_RV_PADDING;
        ViewExtKt.updatePadding$default(recyclerView, i11, 0, i11, 0, 10, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapTagsV2View(@NotNull Context context, boolean z11, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.tapTagsV2);
        FlexboxLayout.a aVar = new FlexboxLayout.a(-1, -2);
        int i13 = HORIZONTAL_PADDING;
        int i14 = ITEM_PADDING;
        ViewExtKt.updatePadding$default(recyclerView, i13 - i14, 0, i13 - i14, 0, 10, null);
        recyclerView.setLayoutParams(aVar);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new FlexboxLayoutManager(context));
        recyclerView.setItemAnimator(null);
        this.tapTags = recyclerView;
        IslandSeparatorView islandSeparatorView = new IslandSeparatorView(context, null, 0, 6, null);
        islandSeparatorView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = -dp28;
        islandSeparatorView.setLayoutParams(layoutParams);
        islandSeparatorView.setViewState(new IslandSeparatorView.ViewState(true, z11, 0, SelectUtilsKt.isSelect(context) ? ResourceExtKt.color(context, UniColorsSelect.LAYER_FLOOR_0_SELECT.getResId()) : ThemeExtKt.themeColor(context, R$attr.layerFloor0), 4, null));
        islandSeparatorView.setElevation(1.0f);
        islandSeparatorView.setOutlineProvider(null);
        this.islandSeparator = islandSeparatorView;
        SearchShimmer searchShimmer = new SearchShimmer(context, null, 0, 6, null);
        searchShimmer.setVisibility(8);
        searchShimmer.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.shimmer = searchShimmer;
        setElevation(1.0f);
        setOutlineProvider(null);
        setOrientation(1);
        addViews();
        setBackgroundColor(0);
    }
}
