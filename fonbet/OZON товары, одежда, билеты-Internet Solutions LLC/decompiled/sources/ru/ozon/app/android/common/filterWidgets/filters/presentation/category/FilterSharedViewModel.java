package ru.ozon.app.android.common.filterWidgets.filters.presentation.category;

import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10727i;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", ImagesContract.URL, "", "setRefreshParam", "(Ljava/lang/String;)V", "sendRefresh", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "refreshUrl", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getRefreshUrl", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "LAe/x0;", "", "shouldResetDialogSearchRefreshFlags", "LAe/x0;", "getShouldResetDialogSearchRefreshFlags", "()LAe/x0;", "originalUrl", "Ljava/lang/String;", "getOriginalUrl", "()Ljava/lang/String;", "setOriginalUrl", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterSharedViewModel extends w0 {
    private String originalUrl;

    @NotNull
    private final SingleLiveEvent<String> refreshUrl = new SingleLiveEvent<>();

    @NotNull
    private final x0<Boolean> shouldResetDialogSearchRefreshFlags = O0.a(Boolean.FALSE);

    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @NotNull
    public final SingleLiveEvent<String> getRefreshUrl() {
        return this.refreshUrl;
    }

    @NotNull
    public final x0<Boolean> getShouldResetDialogSearchRefreshFlags() {
        return this.shouldResetDialogSearchRefreshFlags;
    }

    public final void sendRefresh(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.refreshUrl.postValue(url);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new FilterSharedViewModel$sendRefresh$1(this, null), 3);
    }

    public final void setRefreshParam(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (Intrinsics.d(url, this.originalUrl)) {
            return;
        }
        this.originalUrl = url;
    }
}
