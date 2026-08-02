package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public final class GmsLogger {
    public GmsLogger(String str, String str2) {
        int length = str.length();
        Preconditions.c(length <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
    }
}
