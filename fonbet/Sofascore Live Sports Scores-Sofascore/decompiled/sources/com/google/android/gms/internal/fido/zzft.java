package com.google.android.gms.internal.fido;

import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzft {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public abstract int d();

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzft)) {
            return false;
        }
        zzft zzftVar = (zzft) obj;
        return g() == zzftVar.g() && h(zzftVar);
    }

    public abstract int g();

    public abstract boolean h(zzft zzftVar);

    public final int hashCode() {
        if (g() >= 32) {
            return d();
        }
        byte[] i = i();
        int i2 = i[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        for (int i3 = 1; i3 < i.length; i3++) {
            i2 |= (i[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << (i3 * 8);
        }
        return i2;
    }

    public byte[] i() {
        throw null;
    }

    public final String toString() {
        byte[] i = i();
        int length = i.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : i) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
