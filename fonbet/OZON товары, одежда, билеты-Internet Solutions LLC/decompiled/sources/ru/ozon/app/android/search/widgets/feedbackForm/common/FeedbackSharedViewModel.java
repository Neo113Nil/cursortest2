package ru.ozon.app.android.search.widgets.feedbackForm.common;

import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackSharedViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "hideFeedbackTile", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "_hideFeedbackTile", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "Landroidx/lifecycle/P;", "getHideFeedbackTile", "()Landroidx/lifecycle/P;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackSharedViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Unit> _hideFeedbackTile;

    @NotNull
    private final P<Unit> hideFeedbackTile;

    public FeedbackSharedViewModel() {
        SingleLiveEvent<Unit> singleLiveEvent = new SingleLiveEvent<>();
        this._hideFeedbackTile = singleLiveEvent;
        this.hideFeedbackTile = singleLiveEvent;
    }

    @NotNull
    public final P<Unit> getHideFeedbackTile() {
        return this.hideFeedbackTile;
    }

    public final void hideFeedbackTile() {
        this._hideFeedbackTile.setValue(Unit.f71690a);
    }
}
