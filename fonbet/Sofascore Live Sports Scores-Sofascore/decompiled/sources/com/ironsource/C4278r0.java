package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4278r0 {

    @NotNull
    private final HashMap<String, Q0> a = new HashMap<>();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.r0$a */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    @NotNull
    public final Q0 a(@NotNull String str, @NotNull List<? extends NetworkSettings> list, int i) {
        str.getClass();
        list.getClass();
        Q0 q0 = this.a.get(str);
        if (q0 != null) {
            return q0;
        }
        Q0 q02 = new Q0(list, i);
        this.a.put(str, q02);
        return q02;
    }
}
