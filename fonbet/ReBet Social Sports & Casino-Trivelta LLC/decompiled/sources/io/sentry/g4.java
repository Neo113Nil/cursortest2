package io.sentry;

import io.sentry.util.C4843a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class g4 implements Collection, Serializable {
    private static final long serialVersionUID = 2412805092710877986L;

    /* renamed from: a, reason: collision with root package name */
    public final Collection f52087a;

    /* renamed from: b, reason: collision with root package name */
    public final C4843a f52088b;

    public g4(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.f52087a = collection;
        this.f52088b = new C4843a();
    }

    public Collection a() {
        return this.f52087a;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            boolean add = a().add(obj);
            if (d10 != null) {
                d10.close();
            }
            return add;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            boolean addAll = a().addAll(collection);
            if (d10 != null) {
                d10.close();
            }
            return addAll;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public void clear() {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            a().clear();
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            boolean contains = a().contains(obj);
            if (d10 != null) {
                d10.close();
            }
            return contains;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            boolean containsAll = a().containsAll(collection);
            if (d10 != null) {
                d10.close();
            }
            return containsAll;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            boolean isEmpty = a().isEmpty();
            if (d10 != null) {
                d10.close();
            }
            return isEmpty;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return a().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            boolean remove = a().remove(obj);
            if (d10 != null) {
                d10.close();
            }
            return remove;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            boolean removeAll = a().removeAll(collection);
            if (d10 != null) {
                d10.close();
            }
            return removeAll;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            boolean retainAll = a().retainAll(collection);
            if (d10 != null) {
                d10.close();
            }
            return retainAll;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public int size() {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            int size = a().size();
            if (d10 != null) {
                d10.close();
            }
            return size;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public String toString() {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            String obj = a().toString();
            if (d10 != null) {
                d10.close();
            }
            return obj;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
