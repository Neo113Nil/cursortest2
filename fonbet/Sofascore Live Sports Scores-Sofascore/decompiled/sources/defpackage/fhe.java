package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class fhe {
    public final ArrayList a;
    public int b;
    public boolean c;
    public ihe d;

    @NotNull
    private volatile /* synthetic */ Object interceptors$delegate;

    public fhe(ihe... iheVarArr) {
        u6h.b();
        this.a = b.l(Arrays.copyOf(iheVarArr, iheVarArr.length));
        this.interceptors$delegate = null;
    }

    public final Object a(Object obj, Object obj2, sq3 sq3Var) {
        int size;
        CoroutineContext context = sq3Var.getContext();
        if (((List) this.interceptors$delegate) == null) {
            int i = this.b;
            if (i == 0) {
                this.interceptors$delegate = km5.a;
                this.c = false;
                this.d = null;
            } else {
                ArrayList arrayList = this.a;
                if (i == 1 && (size = arrayList.size() - 1) >= 0) {
                    int i2 = 0;
                    while (true) {
                        Object obj3 = arrayList.get(i2);
                        ufe ufeVar = obj3 instanceof ufe ? (ufe) obj3 : null;
                        if (ufeVar != null && !ufeVar.c.isEmpty()) {
                            List list = ufeVar.c;
                            ufeVar.d = true;
                            this.interceptors$delegate = list;
                            this.c = false;
                            this.d = ufeVar.a;
                            break;
                        }
                        if (i2 == size) {
                            break;
                        }
                        i2++;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        Object obj4 = arrayList.get(i3);
                        ufe ufeVar2 = obj4 instanceof ufe ? (ufe) obj4 : null;
                        if (ufeVar2 != null) {
                            List list2 = ufeVar2.c;
                            arrayList2.ensureCapacity(list2.size() + arrayList2.size());
                            int size3 = list2.size();
                            for (int i4 = 0; i4 < size3; i4++) {
                                arrayList2.add(list2.get(i4));
                            }
                        }
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                this.interceptors$delegate = arrayList2;
                this.c = false;
                this.d = null;
            }
        }
        this.c = true;
        List list3 = (List) this.interceptors$delegate;
        list3.getClass();
        boolean d = d();
        obj.getClass();
        obj2.getClass();
        context.getClass();
        return ((hhe.a || d) ? new kl4(obj, list3, obj2, context) : new goi(obj2, obj, list3)).a(obj2, sq3Var);
    }

    public final ufe b(ihe iheVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == iheVar) {
                ufe ufeVar = new ufe(iheVar, lhe.e);
                arrayList.set(i, ufeVar);
                return ufeVar;
            }
            if (obj instanceof ufe) {
                ufe ufeVar2 = (ufe) obj;
                if (ufeVar2.a == iheVar) {
                    return ufeVar2;
                }
            }
        }
        return null;
    }

    public final int c(ihe iheVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == iheVar || ((obj instanceof ufe) && ((ufe) obj).a == iheVar)) {
                return i;
            }
        }
        return -1;
    }

    public abstract boolean d();

    public final boolean e(ihe iheVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == iheVar) {
                return true;
            }
            if ((obj instanceof ufe) && ((ufe) obj).a == iheVar) {
                return true;
            }
        }
        return false;
    }

    public final void f(ihe iheVar, ct8 ct8Var) {
        iheVar.getClass();
        ufe b = b(iheVar);
        if (b == null) {
            throw new v3("Phase " + iheVar + " was not registered for this pipeline", 3);
        }
        List list = (List) this.interceptors$delegate;
        if (!this.a.isEmpty() && list != null && !this.c && i5k.g(list)) {
            if (Intrinsics.c(this.d, iheVar)) {
                list.add(ct8Var);
            } else if (iheVar == CollectionsKt.h0(this.a) || c(iheVar) == this.a.size() - 1) {
                ufe b2 = b(iheVar);
                b2.getClass();
                if (b2.d) {
                    b2.c = new ArrayList(b2.c);
                    b2.d = false;
                }
                b2.c.add(ct8Var);
                list.add(ct8Var);
            }
            this.b++;
            return;
        }
        if (b.d) {
            b.c = new ArrayList(b.c);
            b.d = false;
        }
        b.c.add(ct8Var);
        this.b++;
        this.interceptors$delegate = null;
        this.c = false;
        this.d = null;
    }
}
