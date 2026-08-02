package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n1 implements Iterator {
    public final Iterator a;
    public final /* synthetic */ Internal.MapAdapter b;

    public n1(Internal.MapAdapter mapAdapter, Iterator it) {
        this.b = mapAdapter;
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return new m1(this.b, (Map.Entry) this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
