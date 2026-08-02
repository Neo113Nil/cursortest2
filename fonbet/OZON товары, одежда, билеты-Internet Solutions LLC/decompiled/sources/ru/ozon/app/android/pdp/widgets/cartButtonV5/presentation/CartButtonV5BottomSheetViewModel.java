package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5BottomSheetViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Landroidx/fragment/app/m;", "fr", "", "onClose", "(Landroidx/fragment/app/m;)V", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "", "_isCloseBottomSheet", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Landroidx/lifecycle/P;", "isCloseBottomSheet", "Landroidx/lifecycle/P;", "()Landroidx/lifecycle/P;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonV5BottomSheetViewModel extends w0 {

    @NotNull
    private final BroadcastSingleLiveEvent<Boolean> _isCloseBottomSheet;

    @NotNull
    private final P<Boolean> isCloseBottomSheet;

    public CartButtonV5BottomSheetViewModel() {
        BroadcastSingleLiveEvent<Boolean> broadcastSingleLiveEvent = new BroadcastSingleLiveEvent<>();
        this._isCloseBottomSheet = broadcastSingleLiveEvent;
        this.isCloseBottomSheet = broadcastSingleLiveEvent;
    }

    @NotNull
    public final P<Boolean> isCloseBottomSheet() {
        return this.isCloseBottomSheet;
    }

    public final void onClose(@NotNull ComponentCallbacksC5392m fr) {
        Intrinsics.checkNotNullParameter(fr, "fr");
        this._isCloseBottomSheet.setValue(Boolean.valueOf(fr instanceof BottomSheetComposerFragment));
    }
}
