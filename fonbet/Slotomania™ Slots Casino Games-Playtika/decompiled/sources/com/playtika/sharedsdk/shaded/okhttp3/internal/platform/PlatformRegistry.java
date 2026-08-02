package com.playtika.sharedsdk.shaded.okhttp3.internal.platform;

import java.security.Security;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlatformRegistry.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/internal/platform/PlatformRegistry;", "", "<init>", "()V", "isConscryptPreferred", "", "()Z", "isOpenJSSEPreferred", "isBouncyCastlePreferred", "findPlatform", "Lcom/playtika/sharedsdk/shaded/okhttp3/internal/platform/Platform;", "isAndroid", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlatformRegistry {
    public static final PlatformRegistry INSTANCE = new PlatformRegistry();

    public final boolean isAndroid() {
        return false;
    }

    private PlatformRegistry() {
    }

    private final boolean isConscryptPreferred() {
        return Intrinsics.areEqual("Conscrypt", Security.getProviders()[0].getName());
    }

    private final boolean isOpenJSSEPreferred() {
        return Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName());
    }

    private final boolean isBouncyCastlePreferred() {
        return Intrinsics.areEqual("BC", Security.getProviders()[0].getName());
    }

    public final Platform findPlatform() {
        OpenJSSEPlatform buildIfSupported;
        BouncyCastlePlatform buildIfSupported2;
        ConscryptPlatform buildIfSupported3;
        if (isConscryptPreferred() && (buildIfSupported3 = ConscryptPlatform.INSTANCE.buildIfSupported()) != null) {
            return buildIfSupported3;
        }
        if (isBouncyCastlePreferred() && (buildIfSupported2 = BouncyCastlePlatform.INSTANCE.buildIfSupported()) != null) {
            return buildIfSupported2;
        }
        if (isOpenJSSEPreferred() && (buildIfSupported = OpenJSSEPlatform.INSTANCE.buildIfSupported()) != null) {
            return buildIfSupported;
        }
        Jdk9Platform buildIfSupported4 = Jdk9Platform.INSTANCE.buildIfSupported();
        if (buildIfSupported4 != null) {
            return buildIfSupported4;
        }
        Platform buildIfSupported5 = Jdk8WithJettyBootPlatform.INSTANCE.buildIfSupported();
        return buildIfSupported5 != null ? buildIfSupported5 : new Platform();
    }
}
