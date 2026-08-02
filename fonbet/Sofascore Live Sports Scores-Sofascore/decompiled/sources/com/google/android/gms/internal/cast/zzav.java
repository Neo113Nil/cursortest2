package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.devicesuggestions.DeviceSuggestionsClient;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import defpackage.ggn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzav extends GoogleApi implements DeviceSuggestionsClient {
    static {
        new Api("DeviceSuggestions.API", new ggn(), new Api.ClientKey());
        new Logger("InternalDeviceSuggestionsClient", null);
    }
}
