package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes9.dex */
final class C extends AbstractC5858b<Object> {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Iterator f59011c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ O7.i f59012d;

    C(Iterator it, O7.i iVar) {
        this.f59011c = it;
        this.f59012d = iVar;
    }

    @Override // com.google.common.collect.AbstractC5858b
    protected final Object a() {
        Object next;
        do {
            Iterator it = this.f59011c;
            if (!it.hasNext()) {
                b();
                return null;
            }
            next = it.next();
        } while (!this.f59012d.apply(next));
        return next;
    }
}
