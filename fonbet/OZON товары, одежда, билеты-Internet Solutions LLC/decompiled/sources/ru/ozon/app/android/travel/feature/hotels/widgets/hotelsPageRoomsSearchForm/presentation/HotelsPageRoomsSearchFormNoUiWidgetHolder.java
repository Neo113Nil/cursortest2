package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.presentation;

import T00.m;
import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/presentation/HotelsPageRoomsSearchFormNoUiWidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/presentation/HotelsPageRoomsSearchFormVI;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/presentation/HotelsPageRoomsSearchFormWidgetViewModel;", "widgetViewModel", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/presentation/HotelsPageRoomsSearchFormWidgetViewModel;)V", "removeWidget", "()V", "onWidgetCreated", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/presentation/HotelsPageRoomsSearchFormVI;)V", "onWidgetDestroyed", "", "provideTraceWidgetName", "()Ljava/lang/String;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "onAsyncWidgetSkipped", "Ll10/i;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/presentation/HotelsPageRoomsSearchFormWidgetViewModel;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageRoomsSearchFormNoUiWidgetHolder extends AbstractC6065b<HotelsPageRoomsSearchFormVI> implements AsyncWidgetCallbacks<Unit>, AsyncWidgetTraceNameProvider {

    @NotNull
    private final i container;
    private final View metricView;

    @NotNull
    private final HotelsPageRoomsSearchFormWidgetViewModel widgetViewModel;

    public HotelsPageRoomsSearchFormNoUiWidgetHolder(@NotNull i container, @NotNull HotelsPageRoomsSearchFormWidgetViewModel widgetViewModel) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        this.container = container;
        this.widgetViewModel = widgetViewModel;
    }

    private final void removeWidget() {
        HotelsPageRoomsSearchFormVI boundData = getBoundData();
        if (boundData != null) {
            this.container.M().m(boundData.getId());
        }
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<Unit> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        removeWidget();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        LoggerExtKt.sendLog$default("[hotelsPageRoomsSearchForm] async fetching failed with message: " + throwable.getMessage(), null, 2, null);
        removeWidget();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        removeWidget();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.widgetViewModel.observeEvents(this, this, this);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.widgetViewModel.onCleared();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider
    public String provideTraceWidgetName() {
        b i11;
        d b11;
        m c11;
        l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull HotelsPageRoomsSearchFormVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.widgetViewModel.fetchWidget(item.getAsyncData());
    }
}
