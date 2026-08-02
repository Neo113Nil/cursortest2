package com.google.android.gms.appset;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.appset.zzr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class AppSet {
    private AppSet() {
    }

    @NonNull
    public static AppSetIdClient getClient(@NonNull Context context) {
        return new zzr(context);
    }
}
