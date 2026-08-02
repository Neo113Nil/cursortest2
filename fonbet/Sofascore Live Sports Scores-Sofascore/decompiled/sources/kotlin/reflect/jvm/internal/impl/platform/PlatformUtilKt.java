package kotlin.reflect.jvm.internal.impl.platform;

import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class PlatformUtilKt {
    @NotNull
    public static final String getPresentableDescription(@NotNull TargetPlatform targetPlatform) {
        targetPlatform.getClass();
        return CollectionsKt.f0(targetPlatform.getComponentPlatforms(), "/", null, null, null, 62);
    }
}
