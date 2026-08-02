package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i1 extends AbstractList {
    public final List a;
    public final h1 b;

    public i1(List list, h1 h1Var) {
        this.a = list;
        this.b = h1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h1 h1Var = this.b;
        Object obj = this.a.get(i);
        ((com.fyber.inneractive.sdk.bidder.j) h1Var).getClass();
        com.fyber.inneractive.sdk.bidder.o0 a = com.fyber.inneractive.sdk.bidder.o0.a(((Integer) obj).intValue());
        return a == null ? com.fyber.inneractive.sdk.bidder.o0.UNRECOGNIZED : a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
