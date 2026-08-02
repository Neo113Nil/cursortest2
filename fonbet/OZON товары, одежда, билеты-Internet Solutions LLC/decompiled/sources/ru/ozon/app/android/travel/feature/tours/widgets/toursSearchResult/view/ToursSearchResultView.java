package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.adapter.ToursSearchResultDecoration;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateView;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView$g;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$u;", "viewPool", "", "setupHotelsRV", "(Landroidx/recyclerview/widget/RecyclerView$g;Landroidx/recyclerview/widget/RecyclerView$u;)V", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateView;", "getEmptyStateView", "()Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateView;", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "ds", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "hotelsRV", "Landroidx/recyclerview/widget/RecyclerView;", "emptyStateESV", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateView;", "Companion", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultView extends FrameLayout {

    @NotNull
    private final DesignSystemDimensProvider ds;

    @NotNull
    private final EmptyStateView emptyStateESV;

    @NotNull
    private final RecyclerView hotelsRV;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultView$Companion;", "", "<init>", "()V", "LOCATOR_EMPTY_VIEW", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursSearchResultView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.ds = dimens$default;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setPadding(0, dimens$default.getMargin8(), 0, 0);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.addItemDecoration(new ToursSearchResultDecoration(context));
        RecyclerViewExtensionsKt.addParentTouchesInterceptor(recyclerView, true);
        this.hotelsRV = recyclerView;
        EmptyStateView emptyStateView = new EmptyStateView(context, null, 0, 0, 14, null);
        emptyStateView.setId(View.generateViewId());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        emptyStateView.setPadding(dimens$default.getMargin16(), dimens$default.getMargin32(), dimens$default.getMargin16(), dimens$default.getMargin16());
        emptyStateView.setLayoutParams(layoutParams);
        emptyStateView.setVisibility(8);
        emptyStateView.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        emptyStateView.setContentDescription("toursSearchResultEmptyStateView");
        this.emptyStateESV = emptyStateView;
        addView(recyclerView);
        addView(emptyStateView);
    }

    @NotNull
    /* renamed from: getEmptyStateView, reason: from getter */
    public final EmptyStateView getEmptyStateESV() {
        return this.emptyStateESV;
    }

    @NotNull
    /* renamed from: getRecyclerView, reason: from getter */
    public final RecyclerView getHotelsRV() {
        return this.hotelsRV;
    }

    public final void setupHotelsRV(@NotNull RecyclerView.g<?> adapter, @NotNull RecyclerView.u viewPool) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(viewPool, "viewPool");
        this.hotelsRV.setAdapter(adapter);
        this.hotelsRV.setRecycledViewPool(viewPool);
    }
}
