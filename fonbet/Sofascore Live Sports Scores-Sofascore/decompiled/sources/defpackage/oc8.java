package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class oc8 extends eo1 {
    public final Object[] a;
    public int b;
    public volatile boolean c;
    public final /* synthetic */ int d;
    public final ed8 e;

    public oc8(ed8 ed8Var, Object[] objArr, int i) {
        this.d = i;
        this.a = objArr;
        this.e = ed8Var;
    }

    @Override // defpackage.zif
    public final int c(int i) {
        return 1;
    }

    @Override // defpackage.iki
    public final void cancel() {
        this.c = true;
    }

    @Override // defpackage.ohh
    public final void clear() {
        this.b = this.a.length;
    }

    @Override // defpackage.ohh
    public final boolean isEmpty() {
        return this.b == this.a.length;
    }

    @Override // defpackage.ohh
    public final Object poll() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i == objArr.length) {
            return null;
        }
        this.b = i + 1;
        Object obj = objArr[i];
        rha.x(obj, "array element is null");
        return obj;
    }

    @Override // defpackage.iki
    public final void request(long j) {
        if (pki.c(j) && wkn.n(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                switch (this.d) {
                    case 0:
                        Object[] objArr = this.a;
                        int length = objArr.length;
                        ai3 ai3Var = (ai3) this.e;
                        int i = this.b;
                        while (true) {
                            boolean z = this.c;
                            if (i == length) {
                                if (!z) {
                                    ai3Var.onComplete();
                                    break;
                                }
                            } else if (z) {
                                break;
                            } else {
                                Object obj = objArr[i];
                                if (obj == null) {
                                    ai3Var.onError(new NullPointerException(lnb.k(i, "The element at index ", " is null")));
                                    break;
                                } else {
                                    ai3Var.e(obj);
                                    i++;
                                }
                            }
                        }
                        break;
                    default:
                        Object[] objArr2 = this.a;
                        int length2 = objArr2.length;
                        ed8 ed8Var = this.e;
                        int i2 = this.b;
                        while (true) {
                            boolean z2 = this.c;
                            if (i2 == length2) {
                                if (!z2) {
                                    ed8Var.onComplete();
                                    break;
                                }
                            } else if (z2) {
                                break;
                            } else {
                                Object obj2 = objArr2[i2];
                                if (obj2 == null) {
                                    ed8Var.onError(new NullPointerException(lnb.k(i2, "The element at index ", " is null")));
                                    break;
                                } else {
                                    ed8Var.onNext(obj2);
                                    i2++;
                                }
                            }
                        }
                        break;
                }
            }
            switch (this.d) {
                case 0:
                    Object[] objArr3 = this.a;
                    int length3 = objArr3.length;
                    int i3 = this.b;
                    ai3 ai3Var2 = (ai3) this.e;
                    do {
                        long j2 = 0;
                        while (true) {
                            if (j2 == j || i3 == length3) {
                                if (i3 != length3) {
                                    j = get();
                                    if (j2 == j) {
                                        this.b = i3;
                                        j = addAndGet(-j2);
                                    }
                                } else if (!this.c) {
                                    ai3Var2.onComplete();
                                    break;
                                }
                            } else if (this.c) {
                                break;
                            } else {
                                Object obj3 = objArr3[i3];
                                if (obj3 == null) {
                                    ai3Var2.onError(new NullPointerException(lnb.k(i3, "The element at index ", " is null")));
                                    break;
                                } else {
                                    if (ai3Var2.e(obj3)) {
                                        j2++;
                                    }
                                    i3++;
                                }
                            }
                        }
                    } while (j != 0);
                    break;
                default:
                    Object[] objArr4 = this.a;
                    int length4 = objArr4.length;
                    int i4 = this.b;
                    ed8 ed8Var2 = this.e;
                    do {
                        long j3 = 0;
                        while (true) {
                            if (j3 == j || i4 == length4) {
                                if (i4 != length4) {
                                    j = get();
                                    if (j3 == j) {
                                        this.b = i4;
                                        j = addAndGet(-j3);
                                    }
                                } else if (!this.c) {
                                    ed8Var2.onComplete();
                                    break;
                                }
                            } else if (this.c) {
                                break;
                            } else {
                                Object obj4 = objArr4[i4];
                                if (obj4 == null) {
                                    ed8Var2.onError(new NullPointerException(lnb.k(i4, "The element at index ", " is null")));
                                    break;
                                } else {
                                    ed8Var2.onNext(obj4);
                                    j3++;
                                    i4++;
                                }
                            }
                        }
                    } while (j != 0);
                    break;
            }
        }
    }
}
