package com.google.android.gms.internal.ads;

import defpackage.dmi;
import defpackage.fc6;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzat extends IOException {
    public final boolean a;
    public final int b;

    public zzat(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    public static zzat a(RuntimeException runtimeException, String str) {
        return new zzat(str, runtimeException, true, 1);
    }

    public static zzat b(String str) {
        return new zzat(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String concat = message != null ? message.concat(" ") : "";
        int length = concat.length();
        boolean z = this.a;
        int length2 = String.valueOf(z).length() + length + 20;
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length2 + 11 + 1);
        dmi.w(sb, concat, "{contentIsMalformed=", z, ", dataType=");
        return fc6.h(i, "}", sb);
    }
}
