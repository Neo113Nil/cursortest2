package ru.ozon.app.android.pdpvideomolecule.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0007"}, d2 = {"updateIsPlaying", "", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "isPlaying", "", "updateShouldRepeat", "shouldRepeat", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlayerStateKt {
    public static final boolean isPlaying(@NotNull VideoMolecule videoMolecule) {
        Intrinsics.checkNotNullParameter(videoMolecule, "<this>");
        return videoMolecule.getPlayerState().getIsPlaying();
    }

    public static final boolean shouldRepeat(@NotNull VideoMolecule videoMolecule) {
        Intrinsics.checkNotNullParameter(videoMolecule, "<this>");
        return videoMolecule.getPlayerState().getShouldRepeat();
    }

    public static final void updateIsPlaying(@NotNull VideoMolecule videoMolecule, boolean z11) {
        Intrinsics.checkNotNullParameter(videoMolecule, "<this>");
        videoMolecule.getPlayerState().setIsPlaying(z11);
    }

    public static final void updateShouldRepeat(@NotNull VideoMolecule videoMolecule, boolean z11) {
        Intrinsics.checkNotNullParameter(videoMolecule, "<this>");
        videoMolecule.getPlayerState().setShouldRepeat(z11);
    }
}
