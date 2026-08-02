package io.sentry;

import java.util.Queue;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s6 extends r6 implements Queue {
    private static final long serialVersionUID = 1;

    @Override // java.util.Queue
    public final Object element() {
        r a7 = this.f16994b.a();
        try {
            Object element = this.f16993a.element();
            a7.close();
            return element;
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
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        r a7 = this.f16994b.a();
        try {
            boolean equals = this.f16993a.equals(obj);
            a7.close();
            return equals;
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
    public final int hashCode() {
        r a7 = this.f16994b.a();
        try {
            int hashCode = this.f16993a.hashCode();
            a7.close();
            return hashCode;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        r a7 = this.f16994b.a();
        try {
            boolean offer = this.f16993a.offer(obj);
            a7.close();
            return offer;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final Object peek() {
        r a7 = this.f16994b.a();
        try {
            Object peek = this.f16993a.peek();
            a7.close();
            return peek;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final Object poll() {
        r a7 = this.f16994b.a();
        try {
            Object poll = this.f16993a.poll();
            a7.close();
            return poll;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final Object remove() {
        r a7 = this.f16994b.a();
        try {
            Object remove = this.f16993a.remove();
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
    public final Object[] toArray() {
        r a7 = this.f16994b.a();
        try {
            Object[] array = this.f16993a.toArray();
            a7.close();
            return array;
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
    public final Object[] toArray(Object[] objArr) {
        r a7 = this.f16994b.a();
        try {
            Object[] array = this.f16993a.toArray(objArr);
            a7.close();
            return array;
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
