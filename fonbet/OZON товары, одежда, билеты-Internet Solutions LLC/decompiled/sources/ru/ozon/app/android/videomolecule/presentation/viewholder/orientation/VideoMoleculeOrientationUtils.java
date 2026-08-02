package ru.ozon.app.android.videomolecule.presentation.viewholder.orientation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/viewholder/orientation/VideoMoleculeOrientationUtils;", "", "<init>", "()V", "mapToConfigurationOrientation", "", "requestedOrientation", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeOrientationUtils {

    @NotNull
    public static final VideoMoleculeOrientationUtils INSTANCE = new VideoMoleculeOrientationUtils();

    private VideoMoleculeOrientationUtils() {
    }

    public final int mapToConfigurationOrientation(int requestedOrientation) {
        return 1 == requestedOrientation ? 1 : 2;
    }
}
