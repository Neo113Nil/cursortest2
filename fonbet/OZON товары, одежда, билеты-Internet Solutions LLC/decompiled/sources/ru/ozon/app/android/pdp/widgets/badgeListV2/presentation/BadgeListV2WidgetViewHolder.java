package ru.ozon.app.android.pdp.widgets.badgeListV2.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.widgets.badgeListV2.presentation.BadgeListV2ItemDecorator;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2VO;", "Landroidx/recyclerview/widget/RecyclerView;", "badgesRv", "LWZ/l;", "tokenizedAnalytics", "Ll10/i;", "container", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;LWZ/l;Ll10/i;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;LVg/d;)V", "", "onAttach", "()V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2VO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "onDetach", "Landroidx/recyclerview/widget/RecyclerView;", "LWZ/l;", "Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2Binder;", "binder", "Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2Binder;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeListV2WidgetViewHolder extends k<BadgeListV2VO> {

    @NotNull
    private final RecyclerView badgesRv;

    @NotNull
    private final BadgeListV2Binder binder;

    @NotNull
    private final l tokenizedAnalytics;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2WidgetViewHolder$Companion;", "", "<init>", "()V", "createView", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "decoratorConfig", "Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2ItemDecorator$PaddingConfig;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RecyclerView createView(@NotNull Context context, BadgeListV2ItemDecorator.PaddingConfig decoratorConfig) {
            Intrinsics.checkNotNullParameter(context, "context");
            RecyclerView recyclerView = (RecyclerView) q.f64554a.i(N.b(RecyclerView.class), context);
            if (recyclerView == null) {
                recyclerView = new RecyclerView(context);
            }
            recyclerView.setId(R$id.scrollableBadgeListRv);
            recyclerView.setBackgroundColor(a.getColor(context, R$color.layer_floor_1));
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
            if (decoratorConfig != null) {
                recyclerView.addItemDecoration(new BadgeListV2ItemDecorator(decoratorConfig));
            }
            return recyclerView;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeListV2WidgetViewHolder(@NotNull RecyclerView badgesRv, @NotNull l tokenizedAnalytics, @NotNull i container, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, @NotNull d customActionHandlersStoreFactory) {
        super(badgesRv);
        Intrinsics.checkNotNullParameter(badgesRv, "badgesRv");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.badgesRv = badgesRv;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.binder = new BadgeListV2Binder(this, widgetImagePlaceholderAdapter, container, badgesRv, customActionHandlersStoreFactory);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        Parcelable scrollState;
        RecyclerView.o layoutManager;
        BadgeListV2VO boundData = getBoundData();
        if (boundData != null && (scrollState = boundData.getScrollState()) != null && (layoutManager = this.badgesRv.getLayoutManager()) != null) {
            layoutManager.onRestoreInstanceState(scrollState);
        }
        super.onAttach();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        Parcelable onSaveInstanceState;
        BadgeListV2VO boundData;
        RecyclerView.o layoutManager = this.badgesRv.getLayoutManager();
        if (layoutManager != null && (onSaveInstanceState = layoutManager.onSaveInstanceState()) != null && (boundData = getBoundData()) != null) {
            boundData.setScrollState(onSaveInstanceState);
        }
        super.onDetach();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull jk0.q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        this.binder.onVisibleAreaChanged(info);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BadgeListV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        BaseWidgetPlaceholderBinder.bind$default(this.binder, item, info, null, null, 12, null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull BadgeListV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getTokenizedEvent());
    }
}
