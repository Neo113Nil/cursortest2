package com.vk.core.telemetry;

import com.vk.core.telemetry.a;
import com.vk.core.telemetry.b;
import com.vk.di.component.DiScopedComponent;
import okhttp3.Interceptor;
import xsna.pwj0;

/* compiled from: VideoOpenTelemetryComponent.kt */
/* loaded from: classes17.dex */
public interface VideoOpenTelemetryComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoOpenTelemetryComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoOpenTelemetryComponent STUB = new VideoOpenTelemetryComponent() { // from class: com.vk.core.telemetry.VideoOpenTelemetryComponent$Companion$STUB$1
            public final a a = a.C0777a.a.getSTUB();
            public final b b = b.a.a.getSTUB();

            @Override // com.vk.core.telemetry.VideoOpenTelemetryComponent
            public final Interceptor Nc() {
                return null;
            }

            @Override // com.vk.core.telemetry.VideoOpenTelemetryComponent
            public final boolean Ya() {
                return false;
            }

            @Override // com.vk.core.telemetry.VideoOpenTelemetryComponent
            public final a i() {
                return this.a;
            }

            @Override // com.vk.core.telemetry.VideoOpenTelemetryComponent
            public final b x6() {
                return this.b;
            }
        };

        public final VideoOpenTelemetryComponent getSTUB() {
            return STUB;
        }
    }

    Interceptor Nc();

    boolean Ya();

    a i();

    b x6();
}
