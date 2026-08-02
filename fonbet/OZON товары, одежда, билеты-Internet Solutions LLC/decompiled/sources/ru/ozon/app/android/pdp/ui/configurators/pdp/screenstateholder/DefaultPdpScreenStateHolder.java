package ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder;

import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/screenstateholder/DefaultPdpScreenStateHolder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/screenstateholder/PdpScreenStateHolder$CacheState;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/screenstateholder/PdpScreenStateHolder$State;", "<init>", "()V", "Landroidx/lifecycle/v$b;", "state", "", "cacheState", "(Landroidx/lifecycle/v$b;)V", "", "isResumed", "()Z", "currentState", "Landroidx/lifecycle/v$b;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultPdpScreenStateHolder implements PdpScreenStateHolder$CacheState, PdpScreenStateHolder$State {

    @NotNull
    private AbstractC5434v.b currentState = AbstractC5434v.b.DESTROYED;

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.PdpScreenStateHolder$CacheState
    public void cacheState(@NotNull AbstractC5434v.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.currentState = state;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.PdpScreenStateHolder$State
    public boolean isResumed() {
        return this.currentState == AbstractC5434v.b.RESUMED;
    }
}
