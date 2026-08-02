package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import Ni.b;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.G;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.databinding.FragmentDialogSearchCoordinatorBinding;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.view.DialogSearchBarView;
import ru.ozon.app.android.search.dialogsearchscreen.utils.TopFilterStyleExtKt;
import ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.CollapsingCoordinatorImpl;
import ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.CollapsingCoordinatorImpl$appBarOutlineProvider$2;
import ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.CollapsingCoordinatorImpl$searchBarOutlineProvider$2;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.core.UniColors;
import v10.C10183a;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\b\u0007*\u0002Y_\b\u0001\u0018\u0000 d2\u00020\u0001:\u0001dB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\nJ\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\nJ\u0019\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\nJ\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\nJ\u001f\u0010(\u001a\u00020\b2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%H\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010.J\u0011\u0010/\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b/\u0010,J\u000f\u00100\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u0010.J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\nJ\r\u00102\u001a\u00020\b¢\u0006\u0004\b2\u0010\nJ\u000f\u00103\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010\nJ\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\nJ\u0015\u00109\u001a\u0004\u0018\u00010\r*\u000208H\u0003¢\u0006\u0004\b9\u0010:R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010;R\"\u0010<\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010.\"\u0004\b?\u0010!R\"\u0010@\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u0010R\"\u0010E\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010\u001eR\u0016\u0010J\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010KR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u0017\u0010Q\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bQ\u0010A\u001a\u0004\bR\u0010CR\u0018\u0010S\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001b\u0010c\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010[\u001a\u0004\ba\u0010b¨\u0006e"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/CollapsingCoordinatorImpl;", "", "Lru/ozon/app/android/search/databinding/FragmentDialogSearchCoordinatorBinding;", "binding", "", "isRedesignedSearchBar", "<init>", "(Lru/ozon/app/android/search/databinding/FragmentDialogSearchCoordinatorBinding;Z)V", "", "configAppBar", "()V", "subscribeSearchBarHeightChanges", "subscribeTapTagsHeightChanges", "", "searchDialogHeight", "setCollapsingToolbarMinHeight", "(I)V", "newMaxLines", "setSearchMaxLines", "updateTapTagsTopMargin", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "getTapTagsHeightListener", "()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onSearchBarHeightUpdated", "hideFilters", "setDefaultUI", "restoreCollapsingUi", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchScrollingState;", "state", "restoreCollapsingState", "(Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchScrollingState;)V", "shouldRound", "roundAppBar", "(Z)V", "roundSearchBarWithoutClipping", "onScrollUp", "onTopReached", "", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagVO;", "list", "onTapTagsUpdated", "(Ljava/util/List;)V", "Landroid/view/View;", "getTagList", "()Landroid/view/View;", "hasTagList", "()Z", "getDefaultView", "hasDefaultView", "onClear", "resetScrollAfterRefresh", "updateLastFloorTopMargin", "Landroid/graphics/drawable/LayerDrawable;", "createRoundedLayerDrawable", "()Landroid/graphics/drawable/LayerDrawable;", "updateTagButtonsColorByState", "Lru/ozon/uni/core/UniColors;", "getColorInt", "(Lru/ozon/uni/core/UniColors;)Ljava/lang/Integer;", "Lru/ozon/app/android/search/databinding/FragmentDialogSearchCoordinatorBinding;", "startScrolling", "Z", "getStartScrolling", "setStartScrolling", "prevOffset", "I", "getPrevOffset", "()I", "setPrevOffset", "collapsingState", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchScrollingState;", "getCollapsingState", "()Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchScrollingState;", "setCollapsingState", "initialTagListBackgroundColor", "Ljava/lang/Integer;", "grayColor", "Landroid/graphics/drawable/GradientDrawable;", "roundedTapTagsDrawable", "Landroid/graphics/drawable/GradientDrawable;", "bottomDrawable", "defaultTapTagsBottomPadding", "getDefaultTapTagsBottomPadding", "searchBarHeightOnGlobalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "tapTagsHeightOnGlobalLayoutListener", "Lcom/google/android/material/appbar/AppBarLayout$f;", "offsetChangeListener", "Lcom/google/android/material/appbar/AppBarLayout$f;", "ru/ozon/app/android/search/dialogsearchscreen/withTopFilters/CollapsingCoordinatorImpl$appBarOutlineProvider$2$1", "appBarOutlineProvider$delegate", "LSc/j;", "getAppBarOutlineProvider", "()Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/CollapsingCoordinatorImpl$appBarOutlineProvider$2$1;", "appBarOutlineProvider", "ru/ozon/app/android/search/dialogsearchscreen/withTopFilters/CollapsingCoordinatorImpl$searchBarOutlineProvider$2$1", "searchBarOutlineProvider$delegate", "getSearchBarOutlineProvider", "()Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/CollapsingCoordinatorImpl$searchBarOutlineProvider$2$1;", "searchBarOutlineProvider", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CollapsingCoordinatorImpl {
    private static final int tagListDefaultBottomPadding;
    private static final int tagListDefaultTopPadding;
    private static final int tagListScrollUpBottomPadding;
    private static final int tagListScrollUpTopPadding;
    private static final int tapTagsDefaultBottomPadding;

    /* renamed from: appBarOutlineProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j appBarOutlineProvider;
    private FragmentDialogSearchCoordinatorBinding binding;

    @NotNull
    private final GradientDrawable bottomDrawable;

    @NotNull
    private DialogSearchScrollingState collapsingState = DialogSearchScrollingState.DEFAULT;
    private final int defaultTapTagsBottomPadding;
    private final Integer grayColor;
    private final Integer initialTagListBackgroundColor;

    @NotNull
    private final AppBarLayout.f offsetChangeListener;
    private int prevOffset;

    @NotNull
    private final GradientDrawable roundedTapTagsDrawable;
    private ViewTreeObserver.OnGlobalLayoutListener searchBarHeightOnGlobalLayoutListener;

    /* renamed from: searchBarOutlineProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j searchBarOutlineProvider;
    private boolean startScrolling;
    private ViewTreeObserver.OnGlobalLayoutListener tapTagsHeightOnGlobalLayoutListener;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final InterfaceC4008j<Float> radius$delegate = LazyUtilsKt.unsafeLazy(CollapsingCoordinatorImpl$Companion$radius$2.INSTANCE);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/CollapsingCoordinatorImpl$Companion;", "", "<init>", "()V", "", "radius$delegate", "LSc/j;", "getRadius", "()F", "radius", "", "ONE_LINE", "I", "MIN_OFFSET", "F", "tagListScrollUpTopPadding", "tagListDefaultTopPadding", "tapTagsDefaultBottomPadding", "tapTagsScrollUpBottomPadding", "tagListDefaultBottomPadding", "tagListScrollUpBottomPadding", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float getRadius() {
            return ((Number) CollapsingCoordinatorImpl.radius$delegate.getValue()).floatValue();
        }

        private Companion() {
        }
    }

    static {
        int px = ResourceExtKt.toPx(4);
        tagListScrollUpTopPadding = px;
        int px2 = ResourceExtKt.toPx(8);
        tagListDefaultTopPadding = px2;
        tapTagsDefaultBottomPadding = px2;
        tagListDefaultBottomPadding = px;
        tagListScrollUpBottomPadding = ResourceExtKt.toPx(16);
    }

    public CollapsingCoordinatorImpl(FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding, boolean z11) {
        this.binding = fragmentDialogSearchCoordinatorBinding;
        Integer colorInt = getColorInt(UniColors.LAYER_FLOOR_0);
        this.initialTagListBackgroundColor = colorInt;
        Integer colorInt2 = getColorInt(UniColors.LAYER_FLOOR_1);
        this.grayColor = colorInt2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        Companion companion = INSTANCE;
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, companion.getRadius(), companion.getRadius(), companion.getRadius(), companion.getRadius()});
        if (colorInt2 != null) {
            gradientDrawable.setColor(colorInt2.intValue());
        }
        this.roundedTapTagsDrawable = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        if (colorInt != null) {
            gradientDrawable2.setColor(colorInt.intValue());
        }
        this.bottomDrawable = gradientDrawable2;
        this.defaultTapTagsBottomPadding = z11 ? DialogSearchBarView.INSTANCE.getRedesignedBottomTapTagsPadding() : tapTagsDefaultBottomPadding;
        this.searchBarHeightOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: eI.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CollapsingCoordinatorImpl.this.onSearchBarHeightUpdated();
            }
        };
        this.tapTagsHeightOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: eI.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CollapsingCoordinatorImpl.tapTagsHeightOnGlobalLayoutListener$lambda$4(CollapsingCoordinatorImpl.this);
            }
        };
        this.offsetChangeListener = new AppBarLayout.f() { // from class: eI.c
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                CollapsingCoordinatorImpl.offsetChangeListener$lambda$6(CollapsingCoordinatorImpl.this, appBarLayout, i11);
            }
        };
        this.appBarOutlineProvider = LazyUtilsKt.unsafeLazy(CollapsingCoordinatorImpl$appBarOutlineProvider$2.INSTANCE);
        this.searchBarOutlineProvider = LazyUtilsKt.unsafeLazy(CollapsingCoordinatorImpl$searchBarOutlineProvider$2.INSTANCE);
    }

    private final LayerDrawable createRoundedLayerDrawable() {
        return new LayerDrawable(new GradientDrawable[]{this.bottomDrawable, this.roundedTapTagsDrawable});
    }

    private final CollapsingCoordinatorImpl$appBarOutlineProvider$2.AnonymousClass1 getAppBarOutlineProvider() {
        return (CollapsingCoordinatorImpl$appBarOutlineProvider$2.AnonymousClass1) this.appBarOutlineProvider.getValue();
    }

    private final Integer getColorInt(UniColors uniColors) {
        FrameLayout constraintLayout;
        Context context;
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding == null || (constraintLayout = fragmentDialogSearchCoordinatorBinding.getConstraintLayout()) == null || (context = constraintLayout.getContext()) == null) {
            return null;
        }
        return Integer.valueOf(ResourceExtKt.color(context, uniColors.getResId()));
    }

    private final CollapsingCoordinatorImpl$searchBarOutlineProvider$2.AnonymousClass1 getSearchBarOutlineProvider() {
        return (CollapsingCoordinatorImpl$searchBarOutlineProvider$2.AnonymousClass1) this.searchBarOutlineProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void offsetChangeListener$lambda$6(CollapsingCoordinatorImpl collapsingCoordinatorImpl, AppBarLayout appBarLayout, int i11) {
        Intrinsics.checkNotNullParameter(appBarLayout, "<unused var>");
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = collapsingCoordinatorImpl.binding;
        if (fragmentDialogSearchCoordinatorBinding != null) {
            boolean z11 = false;
            if (i11 == 0) {
                collapsingCoordinatorImpl.prevOffset = 0;
                return;
            }
            int height = fragmentDialogSearchCoordinatorBinding.tapTags.getHeight();
            int abs = Math.abs(i11);
            RecyclerView tapTags = fragmentDialogSearchCoordinatorBinding.tapTags;
            Intrinsics.checkNotNullExpressionValue(tapTags, "tapTags");
            if (tapTags.getVisibility() == 0 && height > 0 && collapsingCoordinatorImpl.startScrolling) {
                collapsingCoordinatorImpl.roundSearchBarWithoutClipping(((float) abs) >= ((float) height) - INSTANCE.getRadius());
            }
            int i12 = collapsingCoordinatorImpl.prevOffset;
            if (i11 == i12) {
                return;
            }
            boolean z12 = abs < Math.abs(i12);
            int abs2 = Math.abs(i11 - collapsingCoordinatorImpl.prevOffset);
            collapsingCoordinatorImpl.prevOffset = i11;
            if (collapsingCoordinatorImpl.hasDefaultView()) {
                return;
            }
            if (z12 && collapsingCoordinatorImpl.startScrolling && abs2 > 1.0f) {
                collapsingCoordinatorImpl.onScrollUp();
            }
            if (fragmentDialogSearchCoordinatorBinding.collapsingToolbar.getHeight() == 0) {
                return;
            }
            int height2 = fragmentDialogSearchCoordinatorBinding.collapsingToolbar.getHeight() - fragmentDialogSearchCoordinatorBinding.collapsingToolbar.getMinimumHeight();
            DialogSearchScrollingState dialogSearchScrollingState = abs == height2 ? DialogSearchScrollingState.COLLAPSED : (abs >= height2 || collapsingCoordinatorImpl.startScrolling) ? DialogSearchScrollingState.EXPANDED : DialogSearchScrollingState.DEFAULT;
            collapsingCoordinatorImpl.collapsingState = dialogSearchScrollingState;
            if (dialogSearchScrollingState == DialogSearchScrollingState.DEFAULT || dialogSearchScrollingState == DialogSearchScrollingState.COLLAPSED) {
                if (abs >= height2 && height2 > 0) {
                    z11 = true;
                }
                collapsingCoordinatorImpl.roundAppBar(z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapTagsHeightOnGlobalLayoutListener$lambda$4(CollapsingCoordinatorImpl collapsingCoordinatorImpl) {
        collapsingCoordinatorImpl.updateLastFloorTopMargin();
        collapsingCoordinatorImpl.updateTagButtonsColorByState();
    }

    private final void updateLastFloorTopMargin() {
        int i11;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding != null) {
            RecyclerView tapTags = fragmentDialogSearchCoordinatorBinding.tapTags;
            Intrinsics.checkNotNullExpressionValue(tapTags, "tapTags");
            if (tapTags.getVisibility() == 0) {
                RecyclerView tapTags2 = fragmentDialogSearchCoordinatorBinding.tapTags;
                Intrinsics.checkNotNullExpressionValue(tapTags2, "tapTags");
                i11 = DialogSearchExtKt.getViewHeightWithMargins(tapTags2);
            } else {
                RecyclerView tapTags3 = fragmentDialogSearchCoordinatorBinding.tapTags;
                Intrinsics.checkNotNullExpressionValue(tapTags3, "tapTags");
                ViewGroup.LayoutParams layoutParams = tapTags3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                i11 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
            }
            View tagList = getTagList();
            if (tagList != null) {
                ViewGroup.LayoutParams layoutParams2 = tagList.getLayoutParams();
                marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) != i11) {
                    ViewGroup.LayoutParams layoutParams3 = tagList.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams3.topMargin = i11;
                    tagList.setLayoutParams(marginLayoutParams3);
                    return;
                }
                return;
            }
            View defaultView = getDefaultView();
            if (defaultView != null) {
                View dialogCellSeparator = fragmentDialogSearchCoordinatorBinding.dialogCellSeparator;
                Intrinsics.checkNotNullExpressionValue(dialogCellSeparator, "dialogCellSeparator");
                if (dialogCellSeparator.getVisibility() == 0) {
                    View dialogCellSeparator2 = fragmentDialogSearchCoordinatorBinding.dialogCellSeparator;
                    Intrinsics.checkNotNullExpressionValue(dialogCellSeparator2, "dialogCellSeparator");
                    ViewGroup.LayoutParams layoutParams4 = dialogCellSeparator2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if ((marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0) != i11) {
                        View dialogCellSeparator3 = fragmentDialogSearchCoordinatorBinding.dialogCellSeparator;
                        Intrinsics.checkNotNullExpressionValue(dialogCellSeparator3, "dialogCellSeparator");
                        ViewGroup.LayoutParams layoutParams5 = dialogCellSeparator3.getLayoutParams();
                        if (layoutParams5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                        marginLayoutParams5.topMargin = i11;
                        dialogCellSeparator3.setLayoutParams(marginLayoutParams5);
                    }
                }
                View dialogCellSeparator4 = fragmentDialogSearchCoordinatorBinding.dialogCellSeparator;
                Intrinsics.checkNotNullExpressionValue(dialogCellSeparator4, "dialogCellSeparator");
                View ifNotGone = ViewExtKt.getIfNotGone(dialogCellSeparator4);
                int height = i11 + (ifNotGone != null ? ifNotGone.getHeight() : 0);
                ViewGroup.LayoutParams layoutParams6 = defaultView.getLayoutParams();
                marginLayoutParams = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) != height) {
                    ViewGroup.LayoutParams layoutParams7 = defaultView.getLayoutParams();
                    if (layoutParams7 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams7;
                    marginLayoutParams6.topMargin = height;
                    defaultView.setLayoutParams(marginLayoutParams6);
                }
            }
        }
    }

    private final void updateTagButtonsColorByState() {
        View tagList = getTagList();
        ViewGroup viewGroup = tagList instanceof ViewGroup ? (ViewGroup) tagList : null;
        if (viewGroup == null) {
            return;
        }
        Iterable<View> children = ViewGroupExtKt.children(viewGroup);
        ArrayList arrayList = new ArrayList();
        for (View view : children) {
            if (view instanceof ViewGroup) {
                arrayList.add(view);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7714v.p(ViewGroupExtKt.children((ViewGroup) it.next()), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof TagButtonView) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            TopFilterStyleExtKt.updateStyleByScrollingState((TagButtonView) it3.next(), this.collapsingState);
        }
    }

    public void configAppBar() {
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding != null) {
            fragmentDialogSearchCoordinatorBinding.appBarLayout.setOutlineProvider(getAppBarOutlineProvider());
            fragmentDialogSearchCoordinatorBinding.appBarLayout.d(this.offsetChangeListener);
            fragmentDialogSearchCoordinatorBinding.dialogSearchBarContainer.setOutlineProvider(getSearchBarOutlineProvider());
        }
    }

    @NotNull
    public final DialogSearchScrollingState getCollapsingState() {
        return this.collapsingState;
    }

    public View getDefaultView() {
        CollapsingToolbarLayout collapsingToolbarLayout;
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding == null || (collapsingToolbarLayout = fragmentDialogSearchCoordinatorBinding.collapsingToolbar) == null) {
            return null;
        }
        return collapsingToolbarLayout.findViewById(R$id.dialogDefaultView);
    }

    public final int getPrevOffset() {
        return this.prevOffset;
    }

    public View getTagList() {
        CollapsingToolbarLayout collapsingToolbarLayout;
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding == null || (collapsingToolbarLayout = fragmentDialogSearchCoordinatorBinding.collapsingToolbar) == null) {
            return null;
        }
        return collapsingToolbarLayout.findViewById(ru.ozon.app.android.common.ui.taglist.R$id.tagListRv);
    }

    /* renamed from: getTapTagsHeightListener, reason: from getter */
    public ViewTreeObserver.OnGlobalLayoutListener getTapTagsHeightOnGlobalLayoutListener() {
        return this.tapTagsHeightOnGlobalLayoutListener;
    }

    public boolean hasDefaultView() {
        return getDefaultView() != null;
    }

    public boolean hasTagList() {
        return getTagList() != null;
    }

    public void hideFilters() {
        DialogSearchBarView dialogSearchBarView;
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding == null || (dialogSearchBarView = fragmentDialogSearchCoordinatorBinding.dialogSearchBarView) == null) {
            return;
        }
        dialogSearchBarView.hideFilters();
    }

    public void onClear() {
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding != null) {
            fragmentDialogSearchCoordinatorBinding.dialogSearchBarContainer.getViewTreeObserver().removeOnGlobalLayoutListener(this.searchBarHeightOnGlobalLayoutListener);
            fragmentDialogSearchCoordinatorBinding.tapTags.getViewTreeObserver().removeOnGlobalLayoutListener(this.tapTagsHeightOnGlobalLayoutListener);
            fragmentDialogSearchCoordinatorBinding.appBarLayout.q(this.offsetChangeListener);
            this.searchBarHeightOnGlobalLayoutListener = null;
            this.tapTagsHeightOnGlobalLayoutListener = null;
        }
        this.binding = null;
    }

    public void onScrollUp() {
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding;
        if (hasDefaultView() || (fragmentDialogSearchCoordinatorBinding = this.binding) == null) {
            return;
        }
        roundAppBar(true);
        roundSearchBarWithoutClipping(false);
        RecyclerView recyclerView = fragmentDialogSearchCoordinatorBinding.tapTags;
        recyclerView.setBackground(null);
        ViewExtKt.updatePadding$default(recyclerView, 0, 0, 0, 0, 7, null);
        View tagList = getTagList();
        if (tagList != null) {
            Integer num = this.grayColor;
            if (num != null) {
                tagList.setBackgroundColor(num.intValue());
            }
            ViewExtKt.updatePadding$default(tagList, 0, tagListScrollUpTopPadding, 0, tagListScrollUpBottomPadding, 5, null);
            int paddingBottom = 0 - fragmentDialogSearchCoordinatorBinding.tapTags.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = tagList.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin += paddingBottom;
            tagList.setLayoutParams(marginLayoutParams);
        }
        this.collapsingState = DialogSearchScrollingState.EXPANDED;
    }

    public void onSearchBarHeightUpdated() {
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding != null) {
            FrameLayout dialogSearchBarContainer = fragmentDialogSearchCoordinatorBinding.dialogSearchBarContainer;
            Intrinsics.checkNotNullExpressionValue(dialogSearchBarContainer, "dialogSearchBarContainer");
            int viewHeightWithMargins = DialogSearchExtKt.getViewHeightWithMargins(dialogSearchBarContainer);
            setCollapsingToolbarMinHeight(viewHeightWithMargins);
            updateTapTagsTopMargin(viewHeightWithMargins);
        }
    }

    public void onTapTagsUpdated(List<DialogSearchBarVO.TapTagVO> list) {
        RecyclerView recyclerView;
        List<DialogSearchBarVO.TapTagVO> list2 = list;
        boolean z11 = list2 == null || list2.isEmpty();
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding != null) {
            RecyclerView tapTags = fragmentDialogSearchCoordinatorBinding.tapTags;
            Intrinsics.checkNotNullExpressionValue(tapTags, "tapTags");
            b.b(tapTags, Boolean.valueOf(!z11));
            View dialogCellSeparator = fragmentDialogSearchCoordinatorBinding.dialogCellSeparator;
            Intrinsics.checkNotNullExpressionValue(dialogCellSeparator, "dialogCellSeparator");
            b.b(dialogCellSeparator, Boolean.valueOf(!z11));
            if (getDefaultView() == null) {
                roundSearchBarWithoutClipping(z11);
                roundAppBar(z11 || this.startScrolling);
                FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding2 = this.binding;
                if (fragmentDialogSearchCoordinatorBinding2 == null || (recyclerView = fragmentDialogSearchCoordinatorBinding2.tapTags) == null) {
                    return;
                }
                recyclerView.setBackground(this.startScrolling == z11 ? createRoundedLayerDrawable() : null);
            }
        }
    }

    public void onTopReached() {
        this.startScrolling = false;
        this.collapsingState = DialogSearchScrollingState.DEFAULT;
        setDefaultUI();
    }

    public final void resetScrollAfterRefresh() {
        final AppBarLayout appBarLayout;
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding == null || (appBarLayout = fragmentDialogSearchCoordinatorBinding.appBarLayout) == null) {
            return;
        }
        G.a(appBarLayout, new Runnable() { // from class: ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.CollapsingCoordinatorImpl$resetScrollAfterRefresh$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding2;
                FragmentContainerView fragmentContainerView;
                fragmentDialogSearchCoordinatorBinding2 = this.binding;
                RecyclerView i11 = (fragmentDialogSearchCoordinatorBinding2 == null || (fragmentContainerView = fragmentDialogSearchCoordinatorBinding2.composerContainer) == null) ? null : C10183a.i(fragmentContainerView);
                if (i11 != null) {
                    i11.stopScroll();
                }
                if (i11 != null) {
                    i11.scrollToPosition(0);
                }
                this.onTopReached();
            }
        });
    }

    public void restoreCollapsingState(DialogSearchScrollingState state) {
        if (state != null) {
            this.collapsingState = state;
        }
        this.startScrolling = this.collapsingState != DialogSearchScrollingState.DEFAULT;
    }

    public void restoreCollapsingUi() {
        if (this.collapsingState == DialogSearchScrollingState.DEFAULT) {
            setDefaultUI();
        } else {
            onScrollUp();
        }
    }

    public void roundAppBar(boolean shouldRound) {
        AppBarLayout appBarLayout;
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding == null || (appBarLayout = fragmentDialogSearchCoordinatorBinding.appBarLayout) == null) {
            return;
        }
        appBarLayout.setClipToOutline(shouldRound);
        appBarLayout.setClipChildren(shouldRound);
    }

    public void roundSearchBarWithoutClipping(boolean shouldRound) {
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding != null) {
            if (shouldRound && !this.startScrolling) {
                fragmentDialogSearchCoordinatorBinding.dialogSearchBarContainer.setBackground(this.roundedTapTagsDrawable);
                Integer num = this.initialTagListBackgroundColor;
                if (num != null) {
                    fragmentDialogSearchCoordinatorBinding.collapsingToolbar.setBackgroundColor(num.intValue());
                    return;
                }
                return;
            }
            Integer num2 = this.grayColor;
            if (num2 != null) {
                int intValue = num2.intValue();
                fragmentDialogSearchCoordinatorBinding.dialogSearchBarContainer.setBackgroundColor(intValue);
                fragmentDialogSearchCoordinatorBinding.collapsingToolbar.setBackgroundColor(intValue);
            }
        }
    }

    public void setCollapsingToolbarMinHeight(int searchDialogHeight) {
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding == null || fragmentDialogSearchCoordinatorBinding.collapsingToolbar.getMinimumHeight() == searchDialogHeight) {
            return;
        }
        fragmentDialogSearchCoordinatorBinding.collapsingToolbar.setMinimumHeight(searchDialogHeight);
    }

    public void setDefaultUI() {
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding != null) {
            RecyclerView tapTags = fragmentDialogSearchCoordinatorBinding.tapTags;
            Intrinsics.checkNotNullExpressionValue(tapTags, "tapTags");
            boolean z11 = tapTags.getVisibility() == 8;
            roundAppBar(z11 || hasDefaultView());
            roundSearchBarWithoutClipping(z11 && !hasDefaultView());
            Integer valueOf = Integer.valueOf(this.defaultTapTagsBottomPadding - fragmentDialogSearchCoordinatorBinding.tapTags.getPaddingBottom());
            if (z11) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : 0;
            RecyclerView recyclerView = fragmentDialogSearchCoordinatorBinding.tapTags;
            recyclerView.setBackground(getDefaultView() == null ? createRoundedLayerDrawable() : null);
            ViewExtKt.updatePadding$default(recyclerView, 0, 0, 0, this.defaultTapTagsBottomPadding, 7, null);
            View tagList = getTagList();
            if (tagList != null) {
                Integer num = this.initialTagListBackgroundColor;
                if (num != null) {
                    tagList.setBackgroundColor(num.intValue());
                }
                ViewExtKt.updatePadding$default(tagList, 0, tagListDefaultTopPadding, 0, tagListDefaultBottomPadding, 5, null);
            }
            if (tagList == null) {
                tagList = getDefaultView();
            }
            if (tagList != null) {
                ViewGroup.LayoutParams layoutParams = tagList.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin += intValue;
                tagList.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public void setSearchMaxLines(int newMaxLines) {
        DialogSearchBarView dialogSearchBarView;
        AppCompatEditText searchInput;
        DialogSearchBarView dialogSearchBarView2;
        DialogSearchBarView dialogSearchBarView3;
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding == null || (dialogSearchBarView = fragmentDialogSearchCoordinatorBinding.dialogSearchBarView) == null || (searchInput = dialogSearchBarView.getSearchInput()) == null) {
            return;
        }
        if (newMaxLines == 1) {
            searchInput.setInputType(1);
            searchInput.setSingleLine(true);
            searchInput.setMaxLines(1);
            FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding2 = this.binding;
            if (fragmentDialogSearchCoordinatorBinding2 == null || (dialogSearchBarView3 = fragmentDialogSearchCoordinatorBinding2.dialogSearchBarView) == null) {
                return;
            }
            dialogSearchBarView3.changeVisibilityGradientForEndInput(true);
            return;
        }
        searchInput.setInputType(131072);
        searchInput.setSingleLine(false);
        searchInput.setMaxLines(newMaxLines);
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding3 = this.binding;
        if (fragmentDialogSearchCoordinatorBinding3 == null || (dialogSearchBarView2 = fragmentDialogSearchCoordinatorBinding3.dialogSearchBarView) == null) {
            return;
        }
        dialogSearchBarView2.changeVisibilityGradientForEndInput(false);
    }

    public final void setStartScrolling(boolean z11) {
        this.startScrolling = z11;
    }

    public void subscribeSearchBarHeightChanges() {
        FrameLayout frameLayout;
        ViewTreeObserver viewTreeObserver;
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding == null || (frameLayout = fragmentDialogSearchCoordinatorBinding.dialogSearchBarContainer) == null || (viewTreeObserver = frameLayout.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.searchBarHeightOnGlobalLayoutListener);
    }

    public void subscribeTapTagsHeightChanges() {
        RecyclerView recyclerView;
        ViewTreeObserver viewTreeObserver;
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding == null || (recyclerView = fragmentDialogSearchCoordinatorBinding.tapTags) == null || (viewTreeObserver = recyclerView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.tapTagsHeightOnGlobalLayoutListener);
    }

    public void updateTapTagsTopMargin(int searchDialogHeight) {
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this.binding;
        if (fragmentDialogSearchCoordinatorBinding != null) {
            RecyclerView tapTags = fragmentDialogSearchCoordinatorBinding.tapTags;
            Intrinsics.checkNotNullExpressionValue(tapTags, "tapTags");
            ViewGroup.LayoutParams layoutParams = tapTags.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) != searchDialogHeight) {
                RecyclerView tapTags2 = fragmentDialogSearchCoordinatorBinding.tapTags;
                Intrinsics.checkNotNullExpressionValue(tapTags2, "tapTags");
                ViewGroup.LayoutParams layoutParams2 = tapTags2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = searchDialogHeight;
                tapTags2.setLayoutParams(marginLayoutParams2);
            }
        }
    }
}
