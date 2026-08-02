package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public enum e6 {
    LOW(0.8f, 50000, 10),
    MEDIUM(1.0f, 75000, 30),
    HIGH(1.0f, 100000, 50);

    public final int bitRate;
    public final int screenshotQuality;
    public final float sizeScale;

    e6(float f6, int i5, int i10) {
        this.sizeScale = f6;
        this.bitRate = i5;
        this.screenshotQuality = i10;
    }

    @NotNull
    public String serializedName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
