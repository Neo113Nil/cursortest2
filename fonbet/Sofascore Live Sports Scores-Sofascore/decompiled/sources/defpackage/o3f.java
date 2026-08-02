package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o3f implements m3f, Serializable {
    @Override // defpackage.m3f
    public final boolean apply(Object obj) {
        return Object.class.equals(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o3f) {
            return Object.class.equals(Object.class);
        }
        return false;
    }

    public final int hashCode() {
        return Object.class.hashCode();
    }

    public final String toString() {
        return "Predicates.equalTo(" + Object.class + ")";
    }
}
