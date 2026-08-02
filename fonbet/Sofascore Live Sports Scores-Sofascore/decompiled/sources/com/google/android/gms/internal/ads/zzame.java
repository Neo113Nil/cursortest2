package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzame implements zzaho {
    public static final zzame b = new zzame(true);
    public static final zzame c = new zzame(false);
    public final boolean a;

    public zzame(boolean z) {
        this.a = z;
    }

    public final String toString() {
        boolean z = !this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 33);
        sb.append("IncorrectFragmentation{expected=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
