package io.sentry;

import java.util.Queue;

/* loaded from: classes3.dex */
public final class h4 extends g4 implements Queue {
    private static final long serialVersionUID = 1;

    public h4(Queue queue) {
        super(queue);
    }

    public static h4 c(Queue queue) {
        return new h4(queue);
    }

    @Override // io.sentry.g4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Queue a() {
        return (Queue) super.a();
    }

    @Override // java.util.Queue
    public Object element() {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            Object element = a().element();
            if (d10 != null) {
                d10.close();
            }
            return element;
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
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            boolean equals = a().equals(obj);
            if (d10 != null) {
                d10.close();
            }
            return equals;
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
    public int hashCode() {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            int hashCode = a().hashCode();
            if (d10 != null) {
                d10.close();
            }
            return hashCode;
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

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            boolean offer = a().offer(obj);
            if (d10 != null) {
                d10.close();
            }
            return offer;
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

    @Override // java.util.Queue
    public Object peek() {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            Object peek = a().peek();
            if (d10 != null) {
                d10.close();
            }
            return peek;
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

    @Override // java.util.Queue
    public Object poll() {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            Object poll = a().poll();
            if (d10 != null) {
                d10.close();
            }
            return poll;
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

    @Override // java.util.Queue
    public Object remove() {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            Object remove = a().remove();
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
    public Object[] toArray() {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            Object[] array = a().toArray();
            if (d10 != null) {
                d10.close();
            }
            return array;
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
    public Object[] toArray(Object[] objArr) {
        InterfaceC4765j0 d10 = this.f52088b.d();
        try {
            Object[] array = a().toArray(objArr);
            if (d10 != null) {
                d10.close();
            }
            return array;
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
