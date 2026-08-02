package ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main;

import Sc.InterfaceC4008j;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.adapter.EmptyStateAdapter;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/EmptyScreenWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/EmptyScreenVI;", "Landroidx/recyclerview/widget/RecyclerView;", "view", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;LWZ/l;)V", "", "showBackground", "", "bindBackground", "(Z)V", "item", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/EmptyScreenVI;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/EmptyScreenVI;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/recyclerview/widget/RecyclerView;", "LWZ/l;", "isSmallScreen", "Z", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/EmptyStateAdapter;", "adapter", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/EmptyStateAdapter;", "Landroid/graphics/drawable/GradientDrawable;", "background$delegate", "LSc/j;", "getBackground", "()Landroid/graphics/drawable/GradientDrawable;", "background", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmptyScreenWidgetViewHolder extends k<EmptyScreenVI> {

    @NotNull
    private final EmptyStateAdapter adapter;

    /* renamed from: background$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j background;
    private final boolean isSmallScreen;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final RecyclerView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int margin = ResourceExtKt.toPx(12);
    private static final int defaultTopMargin = ResourceExtKt.toPx(64);
    private static final int smallScreenTopMargin = ResourceExtKt.toPx(40);
    private static final int topPadding = ResourceExtKt.toPx(20);
    private static final int bottomPadding = ResourceExtKt.toPx(24);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/EmptyScreenWidgetViewHolder$Companion;", "", "<init>", "()V", "", "SMALL_SCREEN_WIDTH_THRESHOLD_DP", "I", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyScreenWidgetViewHolder(@NotNull RecyclerView view, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        boolean z11 = view.getContext().getResources().getConfiguration().smallestScreenWidthDp <= 360;
        this.isSmallScreen = z11;
        EmptyStateAdapter emptyStateAdapter = new EmptyStateAdapter(this, z11);
        this.adapter = emptyStateAdapter;
        this.background = LazyUtilsKt.unsafeLazy(new EmptyScreenWidgetViewHolder$background$2(this));
        view.setClipToPadding(false);
        view.setClipChildren(false);
        view.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        view.setAdapter(emptyStateAdapter);
        view.setItemAnimator(null);
    }

    private final void bindBackground(boolean showBackground) {
        RecyclerView recyclerView = this.view;
        recyclerView.setBackground(showBackground ? getBackground() : null);
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = showBackground ? margin : 0;
        marginLayoutParams.setMargins(i11, marginLayoutParams.topMargin, i11, marginLayoutParams.bottomMargin);
        recyclerView.setLayoutParams(marginLayoutParams);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), showBackground ? topPadding : 0, recyclerView.getPaddingRight(), showBackground ? bottomPadding : 0);
    }

    private final GradientDrawable getBackground() {
        return (GradientDrawable) this.background.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull EmptyScreenVI item, @NotNull d info) {
        int px;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.adapter.submitList(item.getItems());
        RecyclerView recyclerView = this.view;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (this.isSmallScreen) {
            px = smallScreenTopMargin;
        } else {
            Integer topMargin = item.getTopMargin();
            px = topMargin != null ? ResourceExtKt.toPx(topMargin.intValue()) : defaultTopMargin;
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, px, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        recyclerView.setLayoutParams(marginLayoutParams);
        bindBackground(item.getShowBackground());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull EmptyScreenVI item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((EmptyScreenWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
