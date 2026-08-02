package ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.orientation;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.orientation.auto.OnVideoMoleculeOrientationChanged;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/orientation/VideoMoleculeOrientationDelegate;", "", "<init>", "()V", "", "orientation", "", "notifyListeners", "(I)V", "", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/orientation/auto/OnVideoMoleculeOrientationChanged;", "listeners", "Ljava/util/Set;", "getListeners", "()Ljava/util/Set;", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class VideoMoleculeOrientationDelegate {

    @NotNull
    private final Set<OnVideoMoleculeOrientationChanged> listeners = new LinkedHashSet();

    @NotNull
    protected final Set<OnVideoMoleculeOrientationChanged> getListeners() {
        return this.listeners;
    }

    public final void notifyListeners(int orientation) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((OnVideoMoleculeOrientationChanged) it.next()).onAnyOrientationChanged(orientation);
        }
    }
}
