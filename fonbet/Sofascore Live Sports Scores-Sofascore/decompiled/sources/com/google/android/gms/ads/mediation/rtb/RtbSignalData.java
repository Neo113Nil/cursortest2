package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class RtbSignalData {
    public final Context a;
    public final List b;
    public final Bundle c;
    public final AdSize d;

    public RtbSignalData(@NonNull Context context, @NonNull List<MediationConfiguration> list, @NonNull Bundle bundle, @Nullable AdSize adSize) {
        this.a = context;
        this.b = list;
        this.c = bundle;
        this.d = adSize;
    }

    @Nullable
    public AdSize getAdSize() {
        return this.d;
    }

    @NonNull
    public List<MediationConfiguration> getConfigurations() {
        return this.b;
    }

    @NonNull
    public Context getContext() {
        return this.a;
    }

    @NonNull
    public Bundle getNetworkExtras() {
        return this.c;
    }
}
