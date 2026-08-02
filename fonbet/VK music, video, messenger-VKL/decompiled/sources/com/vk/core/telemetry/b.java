package com.vk.core.telemetry;

import one.video.player.OneVideoPlayer;

/* compiled from: TelemetryCollector.kt */
/* loaded from: classes17.dex */
public interface b {
    void a(String str, String str2);

    void b(OneVideoPlayer oneVideoPlayer);

    void c(OneVideoPlayer oneVideoPlayer);

    void onAdEnd(String str);

    /* compiled from: TelemetryCollector.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final b STUB = new C0780a();

        public final b getSTUB() {
            return STUB;
        }

        /* compiled from: TelemetryCollector.kt */
        /* renamed from: com.vk.core.telemetry.b$a$a, reason: collision with other inner class name */
        public static final class C0780a implements b {
            @Override // com.vk.core.telemetry.b
            public final void b(OneVideoPlayer oneVideoPlayer) {
            }

            @Override // com.vk.core.telemetry.b
            public final void c(OneVideoPlayer oneVideoPlayer) {
            }

            @Override // com.vk.core.telemetry.b
            public final void onAdEnd(String str) {
            }

            @Override // com.vk.core.telemetry.b
            public final void a(String str, String str2) {
            }
        }
    }
}
