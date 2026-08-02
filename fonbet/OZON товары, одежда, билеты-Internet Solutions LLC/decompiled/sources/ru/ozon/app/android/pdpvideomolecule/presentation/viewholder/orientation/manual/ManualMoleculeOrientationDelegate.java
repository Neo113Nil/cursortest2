package ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.orientation.manual;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.orientation.VideoMoleculeOrientationDelegate;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.orientation.auto.OnVideoMoleculeOrientationChanged;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/orientation/manual/ManualMoleculeOrientationDelegate;", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/orientation/VideoMoleculeOrientationDelegate;", "Landroid/app/Activity;", "activity", "", "originalOrientation", "<init>", "(Landroid/app/Activity;I)V", "getCurrentOrientation", "()I", "orientation", "", "forceChangeOrientation", "(I)V", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/orientation/auto/OnVideoMoleculeOrientationChanged;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOrientationListener", "(Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/orientation/auto/OnVideoMoleculeOrientationChanged;)V", "enable", "()V", "disable", "Landroid/app/Activity;", "I", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ManualMoleculeOrientationDelegate extends VideoMoleculeOrientationDelegate {

    @NotNull
    private final Activity activity;
    private final int originalOrientation;

    public /* synthetic */ ManualMoleculeOrientationDelegate(Activity activity, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, (i12 & 2) != 0 ? 1 : i11);
    }

    public void addOrientationListener(@NotNull OnVideoMoleculeOrientationChanged listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getListeners().add(listener);
    }

    public void disable() {
        this.activity.setRequestedOrientation(this.originalOrientation);
    }

    public void enable() {
    }

    public void forceChangeOrientation(int orientation) {
        if (this.activity.getRequestedOrientation() == orientation) {
            return;
        }
        this.activity.setRequestedOrientation(orientation);
    }

    public int getCurrentOrientation() {
        return this.activity.getRequestedOrientation();
    }

    public ManualMoleculeOrientationDelegate(@NotNull Activity activity, int i11) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.originalOrientation = i11;
    }
}
