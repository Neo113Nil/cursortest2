package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzakh implements zzao {
    public final ArrayList a;

    public zzakh(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((zzakg) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((zzakg) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((zzakg) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        zzguk.a(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzakh.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((zzakh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.a.toString());
    }
}
