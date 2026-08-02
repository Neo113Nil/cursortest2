package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.ApiException;
import defpackage.fn0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzmk extends RuntimeException {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzmk(int i, String str, ApiException apiException) {
        super(r5, apiException);
        String valueOf;
        if (str != null) {
            StringBuilder sb = new StringBuilder(fn0.a(i, 2) + str.length());
            sb.append(i);
            sb.append(": ");
            sb.append(str);
            valueOf = sb.toString();
        } else {
            valueOf = String.valueOf(i);
        }
        this.a = i;
    }
}
