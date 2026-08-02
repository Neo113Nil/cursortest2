package com.google.android.gms.auth.api;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public final class zbd implements Api.ApiOptions.Optional {
    public static final zbd c = new zbd(new zbc());
    public final boolean a;
    public final String b;

    public zbd(zbc zbcVar) {
        this.a = zbcVar.a.booleanValue();
        this.b = zbcVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zbd)) {
            return false;
        }
        zbd zbdVar = (zbd) obj;
        return Objects.a(null, null) && this.a == zbdVar.a && Objects.a(this.b, zbdVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
