package ru.ozon.app.android.search.widgets.insight.presentation;

import Ae.InterfaceC2395h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/presentation/DeleteSearchInsightViewModel;", "", "LAe/h;", "Lru/ozon/app/android/search/widgets/insight/presentation/DeleteInsightResult;", "observeResultFlow", "()LAe/h;", "", "deleteWidget", "()V", "showError", "", "newWidgetId", "setWidgetId", "(Ljava/lang/Long;)V", "", "isCellSelected", "()Z", "setCellSelected", "(Z)V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface DeleteSearchInsightViewModel {
    void deleteWidget();

    @NotNull
    InterfaceC2395h<DeleteInsightResult> observeResultFlow();

    void setCellSelected(boolean z11);

    void setWidgetId(Long newWidgetId);

    void showError();
}
