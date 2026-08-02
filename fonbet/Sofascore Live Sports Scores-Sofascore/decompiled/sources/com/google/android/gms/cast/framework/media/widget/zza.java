package com.google.android.gms.cast.framework.media.widget;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zza {
    public final int a;
    public final int b;
    public final boolean c;

    public zza(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zza) && this.a == ((zza) obj).a;
    }

    public final int hashCode() {
        return Integer.valueOf(this.a).hashCode();
    }
}
