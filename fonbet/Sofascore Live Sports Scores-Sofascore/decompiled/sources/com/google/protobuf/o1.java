package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o1 extends AbstractSet {
    public final Set a;
    public final /* synthetic */ Internal.MapAdapter b;

    public o1(Internal.MapAdapter mapAdapter, Set set) {
        this.b = mapAdapter;
        this.a = set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new n1(this.b, this.a.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
