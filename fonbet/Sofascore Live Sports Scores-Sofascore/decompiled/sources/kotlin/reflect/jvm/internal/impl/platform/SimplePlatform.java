package kotlin.reflect.jvm.internal.impl.platform;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class SimplePlatform {

    @NotNull
    private final String platformName;

    @NotNull
    private final TargetPlatformVersion targetPlatformVersion;

    @NotNull
    public String getTargetName() {
        return getTargetPlatformVersion().getDescription();
    }

    @NotNull
    public TargetPlatformVersion getTargetPlatformVersion() {
        return this.targetPlatformVersion;
    }

    @NotNull
    public String toString() {
        String targetName = getTargetName();
        int length = targetName.length();
        String str = this.platformName;
        if (length <= 0) {
            return str;
        }
        return str + " (" + targetName + ')';
    }
}
