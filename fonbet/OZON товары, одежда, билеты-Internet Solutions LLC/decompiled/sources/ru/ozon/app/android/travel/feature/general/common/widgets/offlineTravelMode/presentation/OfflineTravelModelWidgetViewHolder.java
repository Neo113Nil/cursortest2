package ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation;

import Lm0.a;
import android.view.View;
import androidx.lifecycle.K;
import d20.AbstractC6065b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorage;
import ru.ozon.app.android.travel.data.storage.offline.SaveOfflineHashFailedException;
import ru.ozon.app.android.travel.data.storage.offline.SaveOfflineStateFailedException;
import xe.C10727i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineTravelModelWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineTravelModeVI;", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineTravelModelViewModel;", "viewModel", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelStorage;", "offlineTravelStorage", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineTravelModelViewModel;Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelStorage;)V", "item", "", "downloadData", "(Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineTravelModeVI;)V", "observe", "()V", "onWidgetCreated", "bind", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineTravelModelViewModel;", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelStorage;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfflineTravelModelWidgetViewHolder extends AbstractC6065b<OfflineTravelModeVI> {
    private final View metricView;

    @NotNull
    private final OfflineTravelStorage offlineTravelStorage;

    @NotNull
    private final OfflineTravelModelViewModel viewModel;

    public OfflineTravelModelWidgetViewHolder(@NotNull OfflineTravelModelViewModel viewModel, @NotNull OfflineTravelStorage offlineTravelStorage) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(offlineTravelStorage, "offlineTravelStorage");
        this.viewModel = viewModel;
        this.offlineTravelStorage = offlineTravelStorage;
    }

    private final void downloadData(OfflineTravelModeVI item) {
        try {
            C10727i.c(K.a(this), null, null, new OfflineTravelModelWidgetViewHolder$downloadData$1$1(this, item, null), 3);
        } catch (CancellationException e11) {
            throw e11;
        } catch (SaveOfflineHashFailedException e12) {
            LoggerExtKt.sendNonFatal$default(e12, e12.getMessage(), null, null, 12, null);
        } catch (SaveOfflineStateFailedException e13) {
            LoggerExtKt.sendNonFatal$default(e13, e13.getMessage(), null, null, 12, null);
        } catch (Throwable th2) {
            a.f17149a.e(th2);
        }
    }

    private final void observe() {
        try {
            C10727i.c(K.a(this), null, null, new OfflineTravelModelWidgetViewHolder$observe$1$1(this, null), 3);
        } catch (CancellationException e11) {
            throw e11;
        } catch (SaveOfflineHashFailedException e12) {
            LoggerExtKt.sendNonFatal$default(e12, e12.getMessage(), null, null, 12, null);
        } catch (SaveOfflineStateFailedException e13) {
            LoggerExtKt.sendNonFatal$default(e13, e13.getMessage(), null, null, 12, null);
        } catch (Throwable th2) {
            a.f17149a.e(th2);
        }
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        observe();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull OfflineTravelModeVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        downloadData(item);
    }
}
