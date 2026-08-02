package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class r6 implements Collection, Serializable {
    private static final long serialVersionUID = 2412805092710877986L;

    /* renamed from: a, reason: collision with root package name */
    public final g f16993a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.a f16994b = new io.sentry.util.a();

    public r6(g gVar) {
        this.f16993a = gVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        r a7 = this.f16994b.a();
        try {
            boolean add = ((s6) this).f16993a.add(obj);
            a7.close();
            return add;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        r a7 = this.f16994b.a();
        try {
            boolean addAll = ((s6) this).f16993a.addAll(collection);
            a7.close();
            return addAll;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        r a7 = this.f16994b.a();
        try {
            ((s6) this).f16993a.clear();
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        r a7 = this.f16994b.a();
        try {
            boolean contains = ((s6) this).f16993a.contains(obj);
            a7.close();
            return contains;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        r a7 = this.f16994b.a();
        try {
            boolean containsAll = ((s6) this).f16993a.containsAll(collection);
            a7.close();
            return containsAll;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        r a7 = this.f16994b.a();
        try {
            boolean isEmpty = ((s6) this).f16993a.isEmpty();
            a7.close();
            return isEmpty;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return ((s6) this).f16993a.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        r a7 = this.f16994b.a();
        try {
            boolean remove = ((s6) this).f16993a.remove(obj);
            a7.close();
            return remove;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        r a7 = this.f16994b.a();
        try {
            boolean removeAll = ((s6) this).f16993a.removeAll(collection);
            a7.close();
            return removeAll;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        r a7 = this.f16994b.a();
        try {
            boolean retainAll = ((s6) this).f16993a.retainAll(collection);
            a7.close();
            return retainAll;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final int size() {
        r a7 = this.f16994b.a();
        try {
            int size = ((s6) this).f16993a.size();
            a7.close();
            return size;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final String toString() {
        r a7 = this.f16994b.a();
        try {
            String obj = ((s6) this).f16993a.toString();
            a7.close();
            return obj;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
