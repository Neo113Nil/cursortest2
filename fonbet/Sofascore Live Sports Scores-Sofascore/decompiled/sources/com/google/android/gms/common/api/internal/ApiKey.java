package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public final class ApiKey<O extends Api.ApiOptions> {
    public final int a;
    public final Api b;
    public final Api.ApiOptions c;
    public final String d;

    public ApiKey(Api api, Api.ApiOptions apiOptions, String str) {
        this.b = api;
        this.c = apiOptions;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{api, apiOptions, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return Objects.a(this.b, apiKey.b) && Objects.a(this.c, apiKey.c) && Objects.a(this.d, apiKey.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
