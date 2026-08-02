package com.ironsource;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import xsna.drm0;

/* renamed from: com.ironsource.cd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4264cd {
    private final String a;

    public C4264cd(String str) {
        this.a = str;
    }

    public final String a() {
        String str = this.a;
        return str.substring(0, drm0.O(0, 6, str, DomExceptionUtils.SEPARATOR));
    }
}
