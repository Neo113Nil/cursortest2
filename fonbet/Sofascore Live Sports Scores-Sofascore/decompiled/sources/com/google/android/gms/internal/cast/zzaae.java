package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaae {
    public static final zzaae e = new zzaae(new int[0], new Object[0], false);
    public final int[] a;
    public final Object[] b;
    public int c;
    public boolean d;

    public zzaae(int[] iArr, Object[] objArr, boolean z) {
        this.c = -1;
        this.a = iArr;
        this.b = objArr;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzaae)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 506991;
    }

    private zzaae() {
        this(new int[8], new Object[8], true);
    }
}
