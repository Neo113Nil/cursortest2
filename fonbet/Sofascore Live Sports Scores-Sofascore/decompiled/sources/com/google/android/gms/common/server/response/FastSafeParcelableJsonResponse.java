package com.google.android.gms.common.server.response;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @KeepForSdk
    public FastSafeParcelableJsonResponse() {
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Object c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field field : a().values()) {
            if (d(field)) {
                if (!fastJsonResponse.d(field) || !Objects.a(b(field), fastJsonResponse.b(field))) {
                    return false;
                }
            } else if (fastJsonResponse.d(field)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean f() {
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field field : a().values()) {
            if (d(field)) {
                Object b = b(field);
                Preconditions.i(b);
                i = (i * 31) + b.hashCode();
            }
        }
        return i;
    }
}
