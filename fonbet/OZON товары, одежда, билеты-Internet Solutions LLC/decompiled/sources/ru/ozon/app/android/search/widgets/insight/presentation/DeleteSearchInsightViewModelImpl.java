package ru.ozon.app.android.search.widgets.insight.presentation;

import Ae.C2406m0;
import Ae.E0;
import Ae.InterfaceC2395h;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/presentation/DeleteSearchInsightViewModelImpl;", "Lru/ozon/app/android/search/widgets/insight/presentation/DeleteSearchInsightViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "LAe/h;", "Lru/ozon/app/android/search/widgets/insight/presentation/DeleteInsightResult;", "observeResultFlow", "()LAe/h;", "", "deleteWidget", "showError", "", "newWidgetId", "setWidgetId", "(Ljava/lang/Long;)V", "", "isCellSelected", "Z", "()Z", "setCellSelected", "(Z)V", "widgetId", "Ljava/lang/Long;", "LAe/w0;", "sharedFlow", "LAe/w0;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeleteSearchInsightViewModelImpl extends w0 implements DeleteSearchInsightViewModel {
    private boolean isCellSelected;

    @NotNull
    private final Ae.w0<DeleteInsightResult> sharedFlow = E0.b(0, 0, null, 7);
    private Long widgetId;

    @Override // ru.ozon.app.android.search.widgets.insight.presentation.DeleteSearchInsightViewModel
    public void deleteWidget() {
        Long l11 = this.widgetId;
        if (l11 != null) {
            C10727i.c(x0.a(this), null, null, new DeleteSearchInsightViewModelImpl$deleteWidget$1$1(this, l11.longValue(), null), 3);
        }
    }

    /* renamed from: isCellSelected, reason: from getter */
    public boolean getIsCellSelected() {
        return this.isCellSelected;
    }

    @Override // ru.ozon.app.android.search.widgets.insight.presentation.DeleteSearchInsightViewModel
    @NotNull
    public InterfaceC2395h<DeleteInsightResult> observeResultFlow() {
        return new C2406m0(this.sharedFlow);
    }

    @Override // ru.ozon.app.android.search.widgets.insight.presentation.DeleteSearchInsightViewModel
    public void setCellSelected(boolean z11) {
        this.isCellSelected = z11;
    }

    @Override // ru.ozon.app.android.search.widgets.insight.presentation.DeleteSearchInsightViewModel
    public void setWidgetId(Long newWidgetId) {
        this.widgetId = newWidgetId;
    }

    @Override // ru.ozon.app.android.search.widgets.insight.presentation.DeleteSearchInsightViewModel
    public void showError() {
        Long l11 = this.widgetId;
        if (l11 != null) {
            C10727i.c(x0.a(this), null, null, new DeleteSearchInsightViewModelImpl$showError$1$1(this, l11.longValue(), null), 3);
        }
    }
}
