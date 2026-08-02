package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class VersionInfo {
    public final int a;
    public final int b;
    public final int c;

    public VersionInfo(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public int getMajorVersion() {
        return this.a;
    }

    public int getMicroVersion() {
        return this.c;
    }

    public int getMinorVersion() {
        return this.b;
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        return this.a + "." + this.b + "." + this.c;
    }
}
