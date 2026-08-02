package com.fyber.inneractive.sdk.cache.session;

import java.util.PriorityQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k extends PriorityQueue {
    public final int a;

    public k(int i) {
        super(1, new l());
        this.a = i;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(g gVar) {
        boolean add = super.add((k) gVar);
        if (size() > this.a) {
            poll();
        }
        return add;
    }
}
