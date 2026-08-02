package com.google.android.gms.common;

import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
/* loaded from: classes3.dex */
public class zzy {
    public static final zzy c = new zzy(null, null, true);
    public final boolean a;
    public final Throwable b;

    public zzy(Exception exc, String str, boolean z) {
        this.a = z;
        this.b = exc;
    }

    public static zzy b(String str) {
        return new zzy(null, str, false);
    }

    public static zzy c(String str, Exception exc) {
        return new zzy(exc, str, false);
    }

    public void a() {
    }
}
