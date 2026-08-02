package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.image.ImageOutput;
import defpackage.ale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface ExoPlayer extends ale {
    boolean isScrubbingModeEnabled();

    void setImageOutput(@Nullable ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);
}
