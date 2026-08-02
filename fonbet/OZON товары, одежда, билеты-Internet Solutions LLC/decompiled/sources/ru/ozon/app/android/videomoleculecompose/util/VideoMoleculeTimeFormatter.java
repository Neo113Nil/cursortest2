package ru.ozon.app.android.videomoleculecompose.util;

import V.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/util/VideoMoleculeTimeFormatter;", "", "<init>", "()V", "", "timeMs", "", "format", "(J)Ljava/lang/String;", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeTimeFormatter {

    @NotNull
    public static final VideoMoleculeTimeFormatter INSTANCE = new VideoMoleculeTimeFormatter();

    private VideoMoleculeTimeFormatter() {
    }

    @NotNull
    public final String format(long timeMs) {
        if (timeMs < 0) {
            timeMs = 0;
        }
        long j11 = (timeMs / 1000) + (timeMs % 1000 >= 500 ? 1L : 0L);
        long j12 = j11 / 3600;
        long j13 = (j11 % 3600) / 60;
        long j14 = j11 % 60;
        return j12 > 0 ? e.b(new Object[]{Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(j14)}, 3, "%d:%02d:%02d", "format(...)") : e.b(new Object[]{Long.valueOf(j13), Long.valueOf(j14)}, 2, "%02d:%02d", "format(...)");
    }
}
