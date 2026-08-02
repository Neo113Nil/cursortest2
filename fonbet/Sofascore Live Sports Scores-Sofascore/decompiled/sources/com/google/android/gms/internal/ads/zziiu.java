package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zziiu extends zziir implements Set {
    public final Set b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziiu(Set set) {
        super(set);
        set.getClass();
        this.b = set;
    }

    @Override // com.google.android.gms.internal.ads.zziir, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.a.contains((Map.Entry) obj);
    }

    @Override // com.google.android.gms.internal.ads.zziir, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new zziit(this.b.iterator());
    }
}
