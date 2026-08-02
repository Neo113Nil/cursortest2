package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final Feature a;

    public UnsupportedApiCallException(Feature feature) {
        this.a = feature;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
