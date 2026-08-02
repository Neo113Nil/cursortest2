package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zao {
    public final SparseIntArray a;
    public final GoogleApiAvailabilityLight b;

    public zao(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.a = new SparseIntArray();
        Preconditions.i(googleApiAvailabilityLight);
        this.b = googleApiAvailabilityLight;
    }

    public final int a(Context context, Api.Client client) {
        int i;
        Preconditions.i(context);
        Preconditions.i(client);
        int i2 = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        SparseIntArray sparseIntArray = this.a;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(minApkVersion, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = this.a;
        synchronized (sparseIntArray2) {
            int i3 = 0;
            while (true) {
                try {
                    if (i3 >= sparseIntArray2.size()) {
                        i2 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray2.keyAt(i3);
                    if (keyAt > minApkVersion && sparseIntArray2.get(keyAt) == 0) {
                        break;
                    }
                    i3++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i2 == -1) {
                i2 = this.b.b(context, minApkVersion);
            }
            sparseIntArray2.put(minApkVersion, i2);
        }
        return i2;
    }

    public zao() {
        this(GoogleApiAvailability.e);
    }
}
