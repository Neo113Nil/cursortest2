package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApi;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zabq extends zaad {
    public final GoogleApi c;

    public zabq(GoogleApi googleApi) {
        this.c = googleApi;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper c() {
        return this.c.g;
    }
}
