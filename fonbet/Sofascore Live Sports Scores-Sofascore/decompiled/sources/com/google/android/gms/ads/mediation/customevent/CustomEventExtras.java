package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes2.dex */
public final class CustomEventExtras {
    public final HashMap a = new HashMap();

    @Nullable
    public Object getExtra(@NonNull String str) {
        return this.a.get(str);
    }

    public void setExtra(@NonNull String str, @NonNull Object obj) {
        this.a.put(str, obj);
    }
}
