package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vf3 implements k55 {
    public final /* synthetic */ int a;
    public volatile boolean b;
    public Object c;

    public /* synthetic */ vf3(int i) {
        this.a = i;
    }

    public final boolean a(k55 k55Var) {
        boolean z = false;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    synchronized (this) {
                        try {
                            if (!this.b) {
                                zz0 zz0Var = (zz0) this.c;
                                if (zz0Var == null) {
                                    zz0Var = new zz0(7, z);
                                    int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                                    zz0Var.b = numberOfLeadingZeros - 1;
                                    zz0Var.d = (int) (0.75f * numberOfLeadingZeros);
                                    zz0Var.e = new Object[numberOfLeadingZeros];
                                    this.c = zz0Var;
                                }
                                zz0Var.a(k55Var);
                                return true;
                            }
                        } finally {
                        }
                    }
                }
                k55Var.d();
                return false;
            default:
                if (!this.b) {
                    synchronized (this) {
                        try {
                            if (!this.b) {
                                LinkedList linkedList = (LinkedList) this.c;
                                if (linkedList == null) {
                                    linkedList = new LinkedList();
                                    this.c = linkedList;
                                }
                                linkedList.add(k55Var);
                                return true;
                            }
                        } finally {
                        }
                    }
                }
                k55Var.d();
                return false;
        }
    }

    public final boolean b(k55 k55Var) {
        Object obj;
        switch (this.a) {
            case 0:
                rha.x(k55Var, "disposables is null");
                if (!this.b) {
                    synchronized (this) {
                        try {
                            if (!this.b) {
                                zz0 zz0Var = (zz0) this.c;
                                if (zz0Var != null) {
                                    Object[] objArr = (Object[]) zz0Var.e;
                                    int i = zz0Var.b;
                                    int hashCode = k55Var.hashCode() * (-1640531527);
                                    int i2 = (hashCode ^ (hashCode >>> 16)) & i;
                                    Object obj2 = objArr[i2];
                                    if (obj2 != null) {
                                        if (obj2.equals(k55Var)) {
                                            zz0Var.X(i2, i, objArr);
                                        } else {
                                            do {
                                                i2 = (i2 + 1) & i;
                                                obj = objArr[i2];
                                                if (obj == null) {
                                                }
                                            } while (!obj.equals(k55Var));
                                            zz0Var.X(i2, i, objArr);
                                        }
                                        return true;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
                return false;
            default:
                if (!this.b) {
                    synchronized (this) {
                        try {
                            if (!this.b) {
                                LinkedList linkedList = (LinkedList) this.c;
                                if (linkedList != null && linkedList.remove(k55Var)) {
                                    return true;
                                }
                            }
                        } finally {
                        }
                    }
                }
                return false;
        }
    }

    public final boolean c(k55 k55Var) {
        switch (this.a) {
            case 0:
                if (b(k55Var)) {
                    k55Var.d();
                    break;
                }
                break;
            default:
                if (b(k55Var)) {
                    ((csg) k55Var).d();
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.k55
    public final void d() {
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                if (this.b) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.b) {
                            this.b = true;
                            zz0 zz0Var = (zz0) this.c;
                            this.c = null;
                            if (zz0Var != null) {
                                for (Object obj : (Object[]) zz0Var.e) {
                                    if (obj instanceof k55) {
                                        try {
                                            ((k55) obj).d();
                                        } catch (Throwable th) {
                                            td4.w0(th);
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(th);
                                        }
                                    }
                                }
                                if (arrayList != null) {
                                    if (arrayList.size() != 1) {
                                        throw new yf3(arrayList);
                                    }
                                    throw be6.c((Throwable) arrayList.get(0));
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
            default:
                if (this.b) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.b) {
                            this.b = true;
                            LinkedList linkedList = (LinkedList) this.c;
                            this.c = null;
                            if (linkedList != null) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((k55) it.next()).d();
                                    } catch (Throwable th2) {
                                        td4.w0(th2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(th2);
                                    }
                                }
                                if (arrayList != null) {
                                    if (arrayList.size() != 1) {
                                        throw new yf3(arrayList);
                                    }
                                    throw be6.c((Throwable) arrayList.get(0));
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
