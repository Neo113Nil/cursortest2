package ru.ozon.app.android.travel.molecules.viewModel;

import androidx.lifecycle.J;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.freezeVisibilityWhileLoading.VisibilityFreezable;
import ru.ozon.app.android.utils.livedata.LiveDataOperatorsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\bJ)\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationIsVisibleViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/utils/freezeVisibilityWhileLoading/VisibilityFreezable;", "<init>", "()V", "", "freeze", "", "(Z)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "callback", "addObserver", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "isVisible", "onVisibilityChanged", "Landroidx/lifecycle/V;", "liveData", "Landroidx/lifecycle/V;", "isFrozen", "Z", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ButtonWithInformationIsVisibleViewModel extends w0 implements VisibilityFreezable {
    private boolean isFrozen;

    @NotNull
    private final V<Boolean> liveData = new V<>();

    public final void addObserver(@NotNull J lifecycleOwner, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LiveDataOperatorsKt.distinct(this.liveData).observe(lifecycleOwner, new ButtonWithInformationIsVisibleViewModel$sam$androidx_lifecycle_Observer$0(callback));
    }

    @Override // ru.ozon.app.android.travel.utils.freezeVisibilityWhileLoading.VisibilityFreezable
    public void freeze(boolean freeze) {
        this.isFrozen = freeze;
    }

    public final void onVisibilityChanged(boolean isVisible) {
        if (this.isFrozen) {
            return;
        }
        this.liveData.setValue(Boolean.valueOf(isVisible));
    }
}
