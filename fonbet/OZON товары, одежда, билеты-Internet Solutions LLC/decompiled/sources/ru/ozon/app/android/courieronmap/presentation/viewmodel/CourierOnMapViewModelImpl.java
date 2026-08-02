package ru.ozon.app.android.courieronmap.presentation.viewmodel;

import Ae.C2399j;
import Ae.C2408n0;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.courieronmap.presentation.viewmodel.CourierOnMapViewModel;
import ru.ozon.app.android.courieronmap.presentation.vo.CourierOnMapVO;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import xe.B0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0004R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel;", "<init>", "()V", "Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;", "", "isArrivalTimeEmpty", "(Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;)Z", "data", "", "startRefreshInterval", "(Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;)V", "bind", "onResume", "onPause", "updateLocation", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/courieronmap/presentation/viewmodel/CourierOnMapViewModel$Action;", "action", "Landroidx/lifecycle/V;", "getAction", "()Landroidx/lifecycle/V;", "courierOnMapInfo", "Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;", "Lxe/B0;", "refreshIntervalJob", "Lxe/B0;", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierOnMapViewModelImpl extends w0 implements CourierOnMapViewModel {

    @NotNull
    private final V<CourierOnMapViewModel.Action> action = new V<>();
    private CourierOnMapVO courierOnMapInfo;
    private B0 refreshIntervalJob;

    private final boolean isArrivalTimeEmpty(CourierOnMapVO courierOnMapVO) {
        CourierOnMapVO.PinInfo courier;
        String caption = (courierOnMapVO == null || (courier = courierOnMapVO.getCourier()) == null) ? null : courier.getCaption();
        return caption == null || caption.length() == 0;
    }

    private final void startRefreshInterval(CourierOnMapVO data) {
        long refreshInterval = data.getRefreshInterval();
        B0 b02 = this.refreshIntervalJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.refreshIntervalJob = C2399j.C(new C2408n0(CoroutineUtilsKt.interval(refreshInterval, TimeUnit.MILLISECONDS), new CourierOnMapViewModelImpl$startRefreshInterval$1(this, null)), x0.a(this));
    }

    @Override // ru.ozon.app.android.courieronmap.presentation.viewmodel.CourierOnMapViewModel
    public void bind(CourierOnMapVO data) {
        if (data != null) {
            CourierOnMapVO courierOnMapVO = this.courierOnMapInfo;
            if (courierOnMapVO == null || (isArrivalTimeEmpty(courierOnMapVO) && !isArrivalTimeEmpty(data))) {
                getAction().setValue(new CourierOnMapViewModel.Action.SendAnalytics(data));
            }
            CourierOnMapVO courierOnMapVO2 = this.courierOnMapInfo;
            if (courierOnMapVO2 == null || data.getRefreshInterval() != courierOnMapVO2.getRefreshInterval()) {
                startRefreshInterval(data);
            }
            this.courierOnMapInfo = data;
            getAction().setValue(new CourierOnMapViewModel.Action.UpdateCourierInfo(data));
        }
    }

    @Override // ru.ozon.app.android.courieronmap.presentation.viewmodel.CourierOnMapViewModel
    public void onPause() {
        B0 b02 = this.refreshIntervalJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    @Override // ru.ozon.app.android.courieronmap.presentation.viewmodel.CourierOnMapViewModel
    public void onResume() {
        CourierOnMapVO courierOnMapVO = this.courierOnMapInfo;
        if (courierOnMapVO != null) {
            startRefreshInterval(courierOnMapVO);
        }
    }

    @Override // ru.ozon.app.android.courieronmap.presentation.viewmodel.CourierOnMapViewModel
    public void updateLocation() {
        CourierOnMapVO courierOnMapVO = this.courierOnMapInfo;
        if (courierOnMapVO != null) {
            getAction().setValue(new CourierOnMapViewModel.Action.UpdateCourierInfo(courierOnMapVO));
        }
    }

    @Override // ru.ozon.app.android.courieronmap.presentation.viewmodel.CourierOnMapViewModel
    @NotNull
    public V<CourierOnMapViewModel.Action> getAction() {
        return this.action;
    }
}
