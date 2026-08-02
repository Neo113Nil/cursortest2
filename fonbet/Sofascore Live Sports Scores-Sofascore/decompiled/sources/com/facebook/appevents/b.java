package com.facebook.appevents;

import com.facebook.internal.k0;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b implements Serializable {
    public final String a;
    public final String b;

    public b(String str, String str2) {
        this.a = str2;
        this.b = k0.A(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new a(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            String str = bVar.b;
            String str2 = this.b;
            if ((str == null ? str2 == null : str.equals(str2)) && bVar.a.equals(this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return this.a.hashCode() ^ (str != null ? str.hashCode() : 0);
    }
}
