package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.Hb;
import com.ironsource.InterfaceC4158k5;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface o extends InterfaceC4158k5<String> {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements o {

        @NotNull
        private final String a;

        public a(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(@NotNull Hb<String, T> hb) {
            hb.getClass();
            return hb.a(this.a);
        }

        @Override // com.ironsource.InterfaceC4158k5
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.a;
        }
    }

    <T> T a(@NotNull Hb<String, T> hb);
}
