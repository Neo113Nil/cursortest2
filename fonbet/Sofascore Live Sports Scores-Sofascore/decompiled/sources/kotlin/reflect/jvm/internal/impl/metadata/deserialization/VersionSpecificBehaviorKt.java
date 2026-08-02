package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class VersionSpecificBehaviorKt {
    public static final boolean isKotlin1Dot4OrLater(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return (binaryVersion.getMajor() == 1 && binaryVersion.getMinor() >= 4) || binaryVersion.getMajor() > 1;
    }

    public static final boolean isVersionRequirementTableWrittenCorrectly(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return isKotlin1Dot4OrLater(binaryVersion);
    }
}
