package com.google.android.gms.fido.u2f;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.fido.zzx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public class U2fApiClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    static {
        new Api("Fido.U2F_API", new zzx(), new Api.ClientKey());
    }
}
