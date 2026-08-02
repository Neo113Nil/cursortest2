package e5;

import d5.C6089d;
import d5.InterfaceC6086a;
import f5.AbstractC6430h;
import g5.C6627B;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: e5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6296c<T> implements InterfaceC6086a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC6430h<T> f62003a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f62004b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f62005c;

    /* renamed from: d, reason: collision with root package name */
    private T f62006d;

    /* renamed from: e, reason: collision with root package name */
    private C6089d f62007e;

    public AbstractC6296c(@NotNull AbstractC6430h<T> tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f62003a = tracker;
        this.f62004b = new ArrayList();
        this.f62005c = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h(C6089d c6089d, Object obj) {
        ArrayList arrayList = this.f62004b;
        if (arrayList.isEmpty() || c6089d == null) {
            return;
        }
        if (obj == 0 || c(obj)) {
            c6089d.c(arrayList);
        } else {
            c6089d.b(arrayList);
        }
    }

    @Override // d5.InterfaceC6086a
    public final void a(T t2) {
        this.f62006d = t2;
        h(this.f62007e, t2);
    }

    public abstract boolean b(@NotNull C6627B c6627b);

    public abstract boolean c(T t2);

    public final boolean d(@NotNull String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        T t2 = this.f62006d;
        return t2 != null && c(t2) && this.f62005c.contains(workSpecId);
    }

    public final void e(@NotNull Iterable<C6627B> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        ArrayList arrayList = this.f62004b;
        arrayList.clear();
        ArrayList arrayList2 = this.f62005c;
        arrayList2.clear();
        for (C6627B c6627b : workSpecs) {
            if (b(c6627b)) {
                arrayList.add(c6627b);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C6627B) it.next()).f63799a);
        }
        boolean isEmpty = arrayList.isEmpty();
        AbstractC6430h<T> abstractC6430h = this.f62003a;
        if (isEmpty) {
            abstractC6430h.e(this);
        } else {
            abstractC6430h.b(this);
        }
        h(this.f62007e, this.f62006d);
    }

    public final void f() {
        ArrayList arrayList = this.f62004b;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.clear();
        this.f62003a.e(this);
    }

    public final void g(C6089d c6089d) {
        if (this.f62007e != c6089d) {
            this.f62007e = c6089d;
            h(c6089d, this.f62006d);
        }
    }
}
