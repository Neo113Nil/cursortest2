package com.google.android.gms.internal.measurement;

import defpackage.s6n;
import defpackage.v4n;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzabe {
    public static final v4n b = new v4n(4);
    public static final zzabe c;
    public final s6n a;

    static {
        List list = Collections.EMPTY_LIST;
        c = new zzabe(new s6n(0));
    }

    public zzabe(s6n s6nVar) {
        this.a = s6nVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzabe) && ((zzabe) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
