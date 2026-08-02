package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pc8 extends eo1 {
    public Iterator a;
    public volatile boolean b;
    public boolean c;
    public final /* synthetic */ int d;
    public final ed8 e;

    public pc8(ed8 ed8Var, Iterator it, int i) {
        this.d = i;
        this.a = it;
        this.e = ed8Var;
    }

    @Override // defpackage.zif
    public final int c(int i) {
        return 1;
    }

    @Override // defpackage.iki
    public final void cancel() {
        this.b = true;
    }

    @Override // defpackage.ohh
    public final void clear() {
        this.a = null;
    }

    @Override // defpackage.ohh
    public final boolean isEmpty() {
        Iterator it = this.a;
        return it == null || !it.hasNext();
    }

    @Override // defpackage.ohh
    public final Object poll() {
        Iterator it = this.a;
        if (it == null) {
            return null;
        }
        if (!this.c) {
            this.c = true;
        } else if (!it.hasNext()) {
            return null;
        }
        Object next = this.a.next();
        rha.x(next, "Iterator.next() returned a null value");
        return next;
    }

    @Override // defpackage.iki
    public final void request(long j) {
        if (pki.c(j) && wkn.n(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                switch (this.d) {
                    case 0:
                        Iterator it = this.a;
                        ai3 ai3Var = (ai3) this.e;
                        while (!this.b) {
                            try {
                                Object next = it.next();
                                if (this.b) {
                                    break;
                                } else if (next == null) {
                                    ai3Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    break;
                                } else {
                                    ai3Var.e(next);
                                    if (this.b) {
                                        break;
                                    } else {
                                        try {
                                            if (!it.hasNext()) {
                                                if (!this.b) {
                                                    ai3Var.onComplete();
                                                    break;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            td4.w0(th);
                                            ai3Var.onError(th);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                td4.w0(th2);
                                ai3Var.onError(th2);
                            }
                        }
                        break;
                    default:
                        Iterator it2 = this.a;
                        ed8 ed8Var = this.e;
                        while (!this.b) {
                            try {
                                Object next2 = it2.next();
                                if (this.b) {
                                    break;
                                } else if (next2 == null) {
                                    ed8Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    break;
                                } else {
                                    ed8Var.onNext(next2);
                                    if (this.b) {
                                        break;
                                    } else {
                                        try {
                                            if (!it2.hasNext()) {
                                                if (!this.b) {
                                                    ed8Var.onComplete();
                                                    break;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            td4.w0(th3);
                                            ed8Var.onError(th3);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                td4.w0(th4);
                                ed8Var.onError(th4);
                                return;
                            }
                        }
                        break;
                }
            }
            switch (this.d) {
                case 0:
                    Iterator it3 = this.a;
                    ai3 ai3Var2 = (ai3) this.e;
                    do {
                        long j2 = 0;
                        while (true) {
                            if (j2 == j) {
                                j = get();
                                if (j2 == j) {
                                    j = addAndGet(-j2);
                                }
                            } else if (this.b) {
                                break;
                            } else {
                                try {
                                    Object next3 = it3.next();
                                    if (this.b) {
                                        break;
                                    } else if (next3 == null) {
                                        ai3Var2.onError(new NullPointerException("Iterator.next() returned a null value"));
                                        break;
                                    } else {
                                        boolean e = ai3Var2.e(next3);
                                        if (this.b) {
                                            break;
                                        } else {
                                            try {
                                                if (!it3.hasNext()) {
                                                    if (!this.b) {
                                                        ai3Var2.onComplete();
                                                        break;
                                                    }
                                                } else if (e) {
                                                    j2++;
                                                }
                                            } catch (Throwable th5) {
                                                td4.w0(th5);
                                                ai3Var2.onError(th5);
                                                return;
                                            }
                                        }
                                    }
                                } catch (Throwable th6) {
                                    td4.w0(th6);
                                    ai3Var2.onError(th6);
                                    return;
                                }
                            }
                        }
                    } while (j != 0);
                    break;
                default:
                    Iterator it4 = this.a;
                    ed8 ed8Var2 = this.e;
                    do {
                        long j3 = 0;
                        while (true) {
                            if (j3 == j) {
                                j = get();
                                if (j3 == j) {
                                    j = addAndGet(-j3);
                                }
                            } else if (this.b) {
                                break;
                            } else {
                                try {
                                    Object next4 = it4.next();
                                    if (this.b) {
                                        break;
                                    } else if (next4 == null) {
                                        ed8Var2.onError(new NullPointerException("Iterator.next() returned a null value"));
                                        break;
                                    } else {
                                        ed8Var2.onNext(next4);
                                        if (this.b) {
                                            break;
                                        } else {
                                            try {
                                                if (!it4.hasNext()) {
                                                    if (!this.b) {
                                                        ed8Var2.onComplete();
                                                        break;
                                                    }
                                                } else {
                                                    j3++;
                                                }
                                            } catch (Throwable th7) {
                                                td4.w0(th7);
                                                ed8Var2.onError(th7);
                                                return;
                                            }
                                        }
                                    }
                                } catch (Throwable th8) {
                                    td4.w0(th8);
                                    ed8Var2.onError(th8);
                                    return;
                                }
                            }
                        }
                    } while (j != 0);
                    break;
            }
        }
    }
}
