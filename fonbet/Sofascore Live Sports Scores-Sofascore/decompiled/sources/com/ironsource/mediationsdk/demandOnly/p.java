package com.ironsource.mediationsdk.demandOnly;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface p {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a implements p {

        @NotNull
        private final String a;

        public a(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.p
        @NotNull
        public String value() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends a {
        public b() {
            super("");
        }
    }

    @NotNull
    String value();
}
