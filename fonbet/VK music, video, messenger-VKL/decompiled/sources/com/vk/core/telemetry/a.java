package com.vk.core.telemetry;

import xsna.es80;
import xsna.evk;
import xsna.ljp0;
import xsna.mjp0;
import xsna.ohk0;
import xsna.qjp0;

/* compiled from: SpanContext.kt */
/* loaded from: classes17.dex */
public interface a extends qjp0 {
    ohk0 a(String str);

    ohk0 b(Long l, String str);

    void c(String str, ohk0 ohk0Var);

    void d(String str);

    void e(es80 es80Var);

    ohk0 f(String str);

    void g(String str);

    mjp0 i();

    /* compiled from: SpanContext.kt */
    /* renamed from: com.vk.core.telemetry.a$a, reason: collision with other inner class name */
    public static final class C0777a {
        public static final /* synthetic */ C0777a a = new C0777a();
        private static final a STUB = new C0778a();

        public final a getSTUB() {
            return STUB;
        }

        /* compiled from: SpanContext.kt */
        /* renamed from: com.vk.core.telemetry.a$a$a, reason: collision with other inner class name */
        public static final class C0778a implements a {
            @Override // com.vk.core.telemetry.a
            public final ohk0 a(String str) {
                return null;
            }

            @Override // com.vk.core.telemetry.a
            public final ohk0 b(Long l, String str) {
                return null;
            }

            @Override // com.vk.core.telemetry.a
            public final ohk0 f(String str) {
                return null;
            }

            @Override // xsna.qjp0
            public final ohk0 h(ljp0 ljp0Var) {
                return null;
            }

            @Override // com.vk.core.telemetry.a
            public final mjp0 i() {
                return new C0779a();
            }

            @Override // com.vk.core.telemetry.a
            public final void d(String str) {
            }

            @Override // com.vk.core.telemetry.a
            public final void e(es80 es80Var) {
            }

            @Override // com.vk.core.telemetry.a
            public final void g(String str) {
            }

            @Override // com.vk.core.telemetry.a
            public final void c(String str, ohk0 ohk0Var) {
            }

            /* compiled from: SpanContext.kt */
            /* renamed from: com.vk.core.telemetry.a$a$a$a, reason: collision with other inner class name */
            public static final class C0779a implements mjp0 {
                @Override // xsna.mjp0
                public final void e(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
                }

                @Override // xsna.mjp0
                public final void g(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
                }

                @Override // xsna.mjp0
                public final void h(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
                }

                @Override // xsna.mjp0
                public final void f(androidx.media3.datasource.a aVar, evk evkVar, boolean z, int i) {
                }
            }
        }
    }
}
