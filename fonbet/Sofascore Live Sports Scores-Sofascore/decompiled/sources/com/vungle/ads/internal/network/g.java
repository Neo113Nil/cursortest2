package com.vungle.ads.internal.network;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public enum g {
    GET,
    POST;


    @NotNull
    public static final f Companion = new Object() { // from class: com.vungle.ads.internal.network.f
        @NotNull
        public final KSerializer serializer() {
            return e.a;
        }
    };
}
