package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface U6 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements U6 {

        @NotNull
        private final W6 a;

        public a(@NotNull W6 w6) {
            w6.getClass();
            this.a = w6;
        }

        @Override // com.ironsource.U6
        @NotNull
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.U6
        @NotNull
        public W6 b() {
            return this.a;
        }

        @NotNull
        public final W6 c() {
            return this.a;
        }
    }

    @NotNull
    String a();

    @NotNull
    W6 b();
}
