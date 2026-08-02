package ru.ozon.app.android.videomolecule.presentation.rewind;

import j3.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.ui.videomolecule.databinding.VideoMoleculeBinding;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getTotalDuration", "", "Lru/ozon/app/android/storefront/ui/videomolecule/databinding/VideoMoleculeBinding;", "videomolecule_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RewindUtilsKt {
    public static final long getTotalDuration(@NotNull VideoMoleculeBinding videoMoleculeBinding) {
        Intrinsics.checkNotNullParameter(videoMoleculeBinding, "<this>");
        y s11 = videoMoleculeBinding.videoMoleculePlayer.s();
        if (s11 != null) {
            return s11.getDuration();
        }
        return 0L;
    }
}
