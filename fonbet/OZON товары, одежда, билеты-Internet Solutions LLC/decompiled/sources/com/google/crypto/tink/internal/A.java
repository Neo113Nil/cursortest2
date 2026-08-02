package com.google.crypto.tink.internal;

import j8.C7306a;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class A<P> {

    /* renamed from: b, reason: collision with root package name */
    private static final C7306a f59209b = C7306a.b(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f59210a;

    /* loaded from: classes9.dex */
    final class a implements Iterable<P> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f59211a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f59212b;

        a(List list, List list2) {
            this.f59211a = list;
            this.f59212b = list2;
        }

        @Override // java.lang.Iterable
        public final Iterator<P> iterator() {
            return new c(this.f59211a.iterator(), this.f59212b.iterator());
        }
    }

    public static class b<P> {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f59213a = new HashMap();

        public final A<P> a() {
            return new A<>(this.f59213a);
        }

        public final void b(C7306a c7306a, Object obj) throws GeneralSecurityException {
            List list;
            if (c7306a.c() != 0 && c7306a.c() != 5) {
                throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
            }
            HashMap hashMap = this.f59213a;
            if (hashMap.containsKey(c7306a)) {
                list = (List) hashMap.get(c7306a);
            } else {
                ArrayList arrayList = new ArrayList();
                hashMap.put(c7306a, arrayList);
                list = arrayList;
            }
            list.add(obj);
        }
    }

    /* loaded from: classes9.dex */
    private static class c<P> implements Iterator<P> {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator<P> f59214a;

        /* renamed from: b, reason: collision with root package name */
        private final Iterator<P> f59215b;

        c(Iterator it, Iterator it2) {
            this.f59214a = it;
            this.f59215b = it2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f59214a.hasNext() || this.f59215b.hasNext();
        }

        @Override // java.util.Iterator
        public final P next() {
            Iterator<P> it = this.f59214a;
            return it.hasNext() ? it.next() : this.f59215b.next();
        }
    }

    A(HashMap hashMap) {
        this.f59210a = hashMap;
    }

    public final Iterable<P> a(byte[] bArr) {
        HashMap hashMap = this.f59210a;
        List list = (List) hashMap.get(f59209b);
        List list2 = bArr.length >= 5 ? (List) hashMap.get(C7306a.a(5, bArr)) : null;
        return (list == null && list2 == null) ? new ArrayList() : list == null ? list2 : list2 == null ? list : new a(list2, list);
    }
}
