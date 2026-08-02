package ru.ozon.app.android.video.playerV2.utils;

import j3.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj3/y;", "Lru/ozon/app/android/video/playerV2/utils/PlayerStatusSnapshot;", "playerStatusSnapshot", "(Lj3/y;)Lru/ozon/app/android/video/playerV2/utils/PlayerStatusSnapshot;", "", "toTimelineValue", "(J)J", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerStatusSnapshotKt {
    @NotNull
    public static final PlayerStatusSnapshot playerStatusSnapshot(@NotNull y yVar) {
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        boolean n11 = yVar.n();
        boolean z13 = false;
        boolean z14 = true;
        boolean z15 = yVar.P() == 2;
        if (yVar.P() == 4) {
            z11 = false;
            z13 = true;
        } else {
            z11 = false;
        }
        if (yVar.P() == 3) {
            z12 = true;
        } else {
            z12 = true;
            z14 = z11;
        }
        if (yVar.P() != z12) {
            z12 = z11;
        }
        return new PlayerStatusSnapshot(n11, z15, z13, z14, z12, toTimelineValue(yVar.getDuration()));
    }

    public static final long toTimelineValue(long j11) {
        if (j11 == -9223372036854775807L || j11 < 0) {
            return 0L;
        }
        return j11;
    }
}
