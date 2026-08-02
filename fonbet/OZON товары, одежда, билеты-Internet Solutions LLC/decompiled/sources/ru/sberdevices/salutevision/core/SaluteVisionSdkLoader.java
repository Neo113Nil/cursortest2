package ru.sberdevices.salutevision.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.SaluteVisionError;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lru/sberdevices/salutevision/core/SaluteVisionSdkLoader;", "", "()V", "Companion", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SaluteVisionSdkLoader {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final String NATIVE_LIB_NAME;
    private static String error;
    private static boolean initialized;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lru/sberdevices/salutevision/core/SaluteVisionSdkLoader$Companion;", "", "()V", "NATIVE_LIB_NAME", "", "<set-?>", "error", "getError", "()Ljava/lang/String;", "", "initialized", "getInitialized", "()Z", "loadLibrary", "Lru/sberdevices/salutevision/core/SaluteVisionError;", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getError() {
            return SaluteVisionSdkLoader.error;
        }

        public final boolean getInitialized() {
            return SaluteVisionSdkLoader.initialized;
        }

        @NotNull
        public final SaluteVisionError loadLibrary() {
            if (!getInitialized()) {
                try {
                    System.loadLibrary(SaluteVisionSdkLoader.NATIVE_LIB_NAME);
                    SaluteVisionSdkLoader.initialized = true;
                } catch (Throwable th2) {
                    SaluteVisionSdkLoader.error = th2.getMessage();
                    String error = getError();
                    if (error == null) {
                        error = "";
                    }
                    return new SaluteVisionError.Initialize(error);
                }
            }
            return SaluteVisionError.None.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        NATIVE_LIB_NAME = "salutevision";
        companion.loadLibrary();
    }
}
