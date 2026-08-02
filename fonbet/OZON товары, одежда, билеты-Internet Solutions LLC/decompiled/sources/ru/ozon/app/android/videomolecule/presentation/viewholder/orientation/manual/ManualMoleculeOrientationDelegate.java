package ru.ozon.app.android.videomolecule.presentation.viewholder.orientation.manual;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.videomolecule.presentation.viewholder.orientation.VideoMoleculeOrientationDelegate;
import ru.ozon.app.android.videomolecule.presentation.viewholder.orientation.VideoMoleculeOrientationUtils;
import ru.ozon.app.android.videomolecule.presentation.viewholder.orientation.auto.OnVideoMoleculeOrientationChanged;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/viewholder/orientation/manual/ManualMoleculeOrientationDelegate;", "Lru/ozon/app/android/videomolecule/presentation/viewholder/orientation/VideoMoleculeOrientationDelegate;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "originalOrientation", "", "getCurrentOrientation", "forceChangeOrientation", "", "orientation", "addOrientationListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/videomolecule/presentation/viewholder/orientation/auto/OnVideoMoleculeOrientationChanged;", "enable", "disable", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ManualMoleculeOrientationDelegate extends VideoMoleculeOrientationDelegate {

    @NotNull
    private final Activity activity;
    private final int originalOrientation;

    public ManualMoleculeOrientationDelegate(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.originalOrientation = activity.getRequestedOrientation();
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
        callListeners(VideoMoleculeOrientationUtils.INSTANCE.mapToConfigurationOrientation(orientation));
    }

    public int getCurrentOrientation() {
        return this.activity.getRequestedOrientation();
    }
}
