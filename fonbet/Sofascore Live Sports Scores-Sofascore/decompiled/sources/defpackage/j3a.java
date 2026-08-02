package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j3a implements joa, Serializable {
    public final Object a;

    public j3a(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.joa
    public final Object getValue() {
        return this.a;
    }

    @Override // defpackage.joa
    public final boolean isInitialized() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
