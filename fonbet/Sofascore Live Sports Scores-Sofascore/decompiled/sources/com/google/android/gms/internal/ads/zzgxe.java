package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgxe extends zzgxb implements Queue {
    @Override // com.google.android.gms.internal.ads.zzgxb
    public /* bridge */ /* synthetic */ Collection d() {
        throw null;
    }

    public abstract LinkedList e();

    @Override // java.util.Queue
    public final Object element() {
        return e().element();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return e().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return e().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return e().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return e().remove();
    }
}
