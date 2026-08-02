package ru.ozon.app.android.travel.molecules.utils.travelPriceDetailInformation;

import androidx.lifecycle.J;
import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.freezeVisibilityWhileLoading.VisibilityFreezable;
import ru.ozon.app.android.utils.livedata.LiveDataOperatorsKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObservableImpl;", "Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObserver;", "Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObservable;", "Lru/ozon/app/android/travel/utils/freezeVisibilityWhileLoading/VisibilityFreezable;", "<init>", "()V", "", "isVisible", "", "onVisibilityChanged", "(Z)V", "Landroidx/lifecycle/J;", "lcOwner", "Lkotlin/Function1;", "callBack", "observe", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "freeze", "Landroidx/lifecycle/V;", "isWidgetVisibleLiveData", "Landroidx/lifecycle/V;", "isFrozen", "Z", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WidgetVisibilityObservableImpl implements WidgetVisibilityObserver, WidgetVisibilityObservable, VisibilityFreezable {
    private boolean isFrozen;

    @NotNull
    private final V<Boolean> isWidgetVisibleLiveData = new V<>();

    @Override // ru.ozon.app.android.travel.utils.freezeVisibilityWhileLoading.VisibilityFreezable
    public void freeze(boolean freeze) {
        this.isFrozen = freeze;
    }

    @Override // ru.ozon.app.android.travel.molecules.utils.travelPriceDetailInformation.WidgetVisibilityObservable
    public void observe(@NotNull J lcOwner, @NotNull Function1<? super Boolean, Unit> callBack) {
        Intrinsics.checkNotNullParameter(lcOwner, "lcOwner");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        LiveDataOperatorsKt.distinct(this.isWidgetVisibleLiveData).observe(lcOwner, new WidgetVisibilityObservableImpl$sam$androidx_lifecycle_Observer$0(callBack));
    }

    @Override // ru.ozon.app.android.travel.molecules.utils.travelPriceDetailInformation.WidgetVisibilityObserver
    public void onVisibilityChanged(boolean isVisible) {
        if (this.isFrozen) {
            return;
        }
        this.isWidgetVisibleLiveData.setValue(Boolean.valueOf(isVisible));
    }
}
