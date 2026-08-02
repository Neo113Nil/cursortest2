package org.chromium.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.chromium.base.ApplicationStatus;

/* loaded from: classes6.dex */
public final class k<E> implements Iterable<E> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f78542a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f78543b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f78544c;

    private class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private int f78545a;

        /* renamed from: b, reason: collision with root package name */
        private int f78546b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f78547c;

        a() {
            k.b(k.this);
            this.f78545a = k.this.f78542a.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i11;
            k kVar = k.this;
            int i12 = this.f78546b;
            while (true) {
                i11 = this.f78545a;
                if (i12 >= i11 || kVar.f78542a.get(i12) != null) {
                    break;
                }
                i12++;
            }
            if (i12 < i11) {
                return true;
            }
            if (this.f78547c) {
                return false;
            }
            this.f78547c = true;
            k.a(kVar);
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            int i11;
            ArrayList arrayList;
            k kVar = k.this;
            while (true) {
                int i12 = this.f78546b;
                i11 = this.f78545a;
                arrayList = kVar.f78542a;
                if (i12 >= i11 || arrayList.get(i12) != null) {
                    break;
                }
                this.f78546b++;
            }
            int i13 = this.f78546b;
            if (i13 < i11) {
                this.f78546b = i13 + 1;
                return (E) arrayList.get(i13);
            }
            if (!this.f78547c) {
                this.f78547c = true;
                k.a(kVar);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static void a(k kVar) {
        int i11 = kVar.f78543b - 1;
        kVar.f78543b = i11;
        if (i11 <= 0 && kVar.f78544c) {
            kVar.f78544c = false;
            ArrayList arrayList = kVar.f78542a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
        }
    }

    static void b(k kVar) {
        kVar.f78543b++;
    }

    public final void c(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f78542a;
            if (arrayList.contains(obj)) {
                return;
            }
            arrayList.add(obj);
        }
    }

    public final void e(ApplicationStatus.b bVar) {
        ArrayList arrayList = this.f78542a;
        int indexOf = arrayList.indexOf(bVar);
        if (indexOf == -1) {
            return;
        }
        if (this.f78543b == 0) {
            arrayList.remove(indexOf);
        } else {
            this.f78544c = true;
            arrayList.set(indexOf, null);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a();
    }
}
