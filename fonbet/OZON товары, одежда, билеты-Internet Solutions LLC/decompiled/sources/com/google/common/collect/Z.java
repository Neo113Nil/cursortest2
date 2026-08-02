package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes9.dex */
final class Z extends AbstractC5858b<Object> {

    /* renamed from: c, reason: collision with root package name */
    final Iterator<Object> f59055c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ a0 f59056d;

    Z(a0 a0Var) {
        this.f59056d = a0Var;
        this.f59055c = a0Var.f59059a.iterator();
    }

    @Override // com.google.common.collect.AbstractC5858b
    protected final Object a() {
        Object next;
        do {
            Iterator<Object> it = this.f59055c;
            if (!it.hasNext()) {
                b();
                return null;
            }
            next = it.next();
        } while (!this.f59056d.f59060b.contains(next));
        return next;
    }
}
