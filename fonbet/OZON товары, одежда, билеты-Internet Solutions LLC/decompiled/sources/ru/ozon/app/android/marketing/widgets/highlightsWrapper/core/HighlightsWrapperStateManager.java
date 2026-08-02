package ru.ozon.app.android.marketing.widgets.highlightsWrapper.core;

import Ae.B0;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperAsyncState;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;", "", "", "widgetAsyncData", "LAe/B0;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState;", "listenState", "(Ljava/lang/String;)LAe/B0;", "asyncData", "requestWidgetState", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface HighlightsWrapperStateManager {
    @NotNull
    B0<HighlightsWrapperAsyncState> listenState(String widgetAsyncData);

    Object requestWidgetState(@NotNull String str, @NotNull d<? super HighlightsWrapperAsyncState> dVar);
}
