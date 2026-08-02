package ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation;

import Sc.r;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h20.InterfaceC6786a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.data.CourierTipsApi;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.data.CourierTipsDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.data.SendCourierTipsResponse;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10727i;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R#\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R(\u0010,\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020+\u0018\u00010*0)0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010#R+\u0010-\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020+\u0018\u00010*0)0$8\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/data/CourierTipsApi;", "api", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/data/CourierTipsApi;)V", "", "onCleared", "()V", "", "asyncData", "setAsyncData", "(Ljava/lang/String;)V", "", "", "params", "processAsyncEvent", "(Ljava/util/Map;)V", "orderID", "", "tipID", "orderNumber", "sendCourierTips", "(Ljava/lang/String;ILjava/lang/String;)V", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/data/CourierTipsApi;", "Ljava/lang/String;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/data/CourierTipsDTO;", "_widgetUpdate", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "widgetUpdate", "Landroidx/lifecycle/P;", "getWidgetUpdate", "()Landroidx/lifecycle/P;", "LSc/r;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/data/SendCourierTipsResponse;", "_sentTipsResponse", "sentTipsResponse", "getSentTipsResponse", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CourierTipsViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final SingleLiveEvent<r<ActionV2Response<SendCourierTipsResponse>>> _sentTipsResponse;

    @NotNull
    private final SingleLiveEvent<ComposerAsyncWidgetResponse<CourierTipsDTO>> _widgetUpdate;

    @NotNull
    private final CourierTipsApi api;
    private String asyncData;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;

    @NotNull
    private final P<r<ActionV2Response<SendCourierTipsResponse>>> sentTipsResponse;

    @NotNull
    private final P<ComposerAsyncWidgetResponse<CourierTipsDTO>> widgetUpdate;

    public CourierTipsViewModel(@NotNull ComposerAsyncWidgetRepository repository, @NotNull CourierTipsApi api) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(api, "api");
        this.repository = repository;
        this.api = api;
        SingleLiveEvent<ComposerAsyncWidgetResponse<CourierTipsDTO>> singleLiveEvent = new SingleLiveEvent<>();
        this._widgetUpdate = singleLiveEvent;
        this.widgetUpdate = singleLiveEvent;
        SingleLiveEvent<r<ActionV2Response<SendCourierTipsResponse>>> singleLiveEvent2 = new SingleLiveEvent<>();
        this._sentTipsResponse = singleLiveEvent2;
        this.sentTipsResponse = singleLiveEvent2;
    }

    @NotNull
    public final P<r<ActionV2Response<SendCourierTipsResponse>>> getSentTipsResponse() {
        return this.sentTipsResponse;
    }

    @NotNull
    public final P<ComposerAsyncWidgetResponse<CourierTipsDTO>> getWidgetUpdate() {
        return this.widgetUpdate;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
    }

    public final void processAsyncEvent(@NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String str = this.asyncData;
        if (str == null) {
            return;
        }
        C10727i.c(x0.a(this), null, null, new CourierTipsViewModel$processAsyncEvent$1(this, str, params, null), 3);
    }

    public final void sendCourierTips(@NotNull String orderID, int tipID, @NotNull String orderNumber) {
        Intrinsics.checkNotNullParameter(orderID, "orderID");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        C10727i.c(x0.a(this), null, null, new CourierTipsViewModel$sendCourierTips$1(this, orderID, tipID, orderNumber, null), 3);
    }

    public final void setAsyncData(String asyncData) {
        this.asyncData = asyncData;
    }
}
