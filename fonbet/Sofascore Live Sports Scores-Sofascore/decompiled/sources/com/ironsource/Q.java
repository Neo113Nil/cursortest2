package com.ironsource;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface Q {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface a {
        void a(@NotNull P p);

        void a(@NotNull EnumC4225o0 enumC4225o0, @NotNull String str);

        void a(@NotNull JSONObject jSONObject, @NotNull EnumC4225o0 enumC4225o0, @NotNull String str);
    }

    @Nullable
    P a(@NotNull String str);

    @NotNull
    List<P> a();
}
