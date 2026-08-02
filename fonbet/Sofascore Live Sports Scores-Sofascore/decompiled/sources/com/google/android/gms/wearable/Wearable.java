package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.wearable.internal.zzah;
import com.google.android.gms.wearable.internal.zzau;
import com.google.android.gms.wearable.internal.zzdg;
import com.google.android.gms.wearable.internal.zzgz;
import com.google.android.gms.wearable.internal.zzhq;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class Wearable {
    public static final Api a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class WearableOptions implements Api.ApiOptions.Optional {
        public static final WearableOptions a;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static class Builder {
        }

        static {
            new Builder();
            a = new WearableOptions();
        }

        public final boolean equals(Object obj) {
            return obj instanceof WearableOptions;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{WearableOptions.class});
        }
    }

    static {
        new zzdg();
        new zzah();
        new zzgz();
        new zzhq();
        new zzau();
        a = new Api("Wearable.API", new b(), new Api.ClientKey());
    }

    private Wearable() {
    }
}
