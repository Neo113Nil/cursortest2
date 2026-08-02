package gh;

import ch.AbstractC2927d;
import ch.InterfaceC2925b;
import gh.AbstractC4388i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: gh.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4383d {

    @NotNull
    private volatile /* synthetic */ Object _interceptors;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2925b f47436a;

    /* renamed from: b, reason: collision with root package name */
    public final List f47437b;

    /* renamed from: c, reason: collision with root package name */
    public int f47438c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f47439d;

    /* renamed from: e, reason: collision with root package name */
    public C4387h f47440e;

    public AbstractC4383d(C4387h... phases) {
        Intrinsics.checkNotNullParameter(phases, "phases");
        this.f47436a = AbstractC2927d.a(true);
        this.f47437b = CollectionsKt.mutableListOf(Arrays.copyOf(phases, phases.length));
        this._interceptors = null;
    }

    public final List b() {
        int lastIndex;
        int i10 = this.f47438c;
        if (i10 == 0) {
            m(CollectionsKt.emptyList());
            return CollectionsKt.emptyList();
        }
        List list = this.f47437b;
        int i11 = 0;
        if (i10 == 1 && (lastIndex = CollectionsKt.getLastIndex(list)) >= 0) {
            int i12 = 0;
            while (true) {
                Object obj = list.get(i12);
                C4382c c4382c = obj instanceof C4382c ? (C4382c) obj : null;
                if (c4382c != null && !c4382c.h()) {
                    List i13 = c4382c.i();
                    p(c4382c);
                    return i13;
                }
                if (i12 == lastIndex) {
                    break;
                }
                i12++;
            }
        }
        ArrayList arrayList = new ArrayList();
        int lastIndex2 = CollectionsKt.getLastIndex(list);
        if (lastIndex2 >= 0) {
            while (true) {
                Object obj2 = list.get(i11);
                C4382c c4382c2 = obj2 instanceof C4382c ? (C4382c) obj2 : null;
                if (c4382c2 != null) {
                    c4382c2.b(arrayList);
                }
                if (i11 == lastIndex2) {
                    break;
                }
                i11++;
            }
        }
        m(arrayList);
        return arrayList;
    }

    public final AbstractC4384e c(Object obj, Object obj2, CoroutineContext coroutineContext) {
        return AbstractC4385f.a(obj, q(), obj2, coroutineContext, g());
    }

    public final Object d(Object obj, Object obj2, Continuation continuation) {
        return c(obj, obj2, continuation.getContext()).a(obj2, continuation);
    }

    public final C4382c e(C4387h c4387h) {
        List list = this.f47437b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == c4387h) {
                C4382c c4382c = new C4382c(c4387h, AbstractC4388i.c.f47446a);
                list.set(i10, c4382c);
                return c4382c;
            }
            if (obj instanceof C4382c) {
                C4382c c4382c2 = (C4382c) obj;
                if (c4382c2.e() == c4387h) {
                    return c4382c2;
                }
            }
        }
        return null;
    }

    public final int f(C4387h c4387h) {
        List list = this.f47437b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == c4387h || ((obj instanceof C4382c) && ((C4382c) obj).e() == c4387h)) {
                return i10;
            }
        }
        return -1;
    }

    public abstract boolean g();

    public final List h() {
        return (List) this._interceptors;
    }

    public final boolean i(C4387h c4387h) {
        List list = this.f47437b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == c4387h) {
                return true;
            }
            if ((obj instanceof C4382c) && ((C4382c) obj).e() == c4387h) {
                return true;
            }
        }
        return false;
    }

    public final void j(C4387h reference, C4387h phase) {
        AbstractC4388i f10;
        C4387h a10;
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(phase, "phase");
        if (i(phase)) {
            return;
        }
        int f11 = f(reference);
        if (f11 == -1) {
            throw new C4381b("Phase " + reference + " was not registered for this pipeline");
        }
        int i10 = f11 + 1;
        int lastIndex = CollectionsKt.getLastIndex(this.f47437b);
        if (i10 <= lastIndex) {
            while (true) {
                Object obj = this.f47437b.get(i10);
                C4382c c4382c = obj instanceof C4382c ? (C4382c) obj : null;
                if (c4382c != null && (f10 = c4382c.f()) != null) {
                    AbstractC4388i.a aVar = f10 instanceof AbstractC4388i.a ? (AbstractC4388i.a) f10 : null;
                    if (aVar != null && (a10 = aVar.a()) != null && Intrinsics.areEqual(a10, reference)) {
                        f11 = i10;
                    }
                    if (i10 == lastIndex) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    break;
                }
            }
        }
        this.f47437b.add(f11 + 1, new C4382c(phase, new AbstractC4388i.a(reference)));
    }

    public final void k(C4387h reference, C4387h phase) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(phase, "phase");
        if (i(phase)) {
            return;
        }
        int f10 = f(reference);
        if (f10 != -1) {
            this.f47437b.add(f10, new C4382c(phase, new AbstractC4388i.b(reference)));
            return;
        }
        throw new C4381b("Phase " + reference + " was not registered for this pipeline");
    }

    public final void l(C4387h phase, Function3 block) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(block, "block");
        C4382c e10 = e(phase);
        if (e10 == null) {
            throw new C4381b("Phase " + phase + " was not registered for this pipeline");
        }
        if (r(phase, block)) {
            this.f47438c++;
            return;
        }
        e10.a(block);
        this.f47438c++;
        n();
        a();
    }

    public final void m(List list) {
        o(list);
        this.f47439d = false;
        this.f47440e = null;
    }

    public final void n() {
        o(null);
        this.f47439d = false;
        this.f47440e = null;
    }

    public final void o(List list) {
        this._interceptors = list;
    }

    public final void p(C4382c c4382c) {
        o(c4382c.i());
        this.f47439d = false;
        this.f47440e = c4382c.e();
    }

    public final List q() {
        if (h() == null) {
            b();
        }
        this.f47439d = true;
        List h10 = h();
        Intrinsics.checkNotNull(h10);
        return h10;
    }

    public final boolean r(C4387h c4387h, Function3 function3) {
        List h10 = h();
        if (this.f47437b.isEmpty() || h10 == null || this.f47439d || !TypeIntrinsics.isMutableList(h10)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f47440e, c4387h)) {
            h10.add(function3);
            return true;
        }
        if (!Intrinsics.areEqual(c4387h, CollectionsKt.last(this.f47437b)) && f(c4387h) != CollectionsKt.getLastIndex(this.f47437b)) {
            return false;
        }
        C4382c e10 = e(c4387h);
        Intrinsics.checkNotNull(e10);
        e10.a(function3);
        h10.add(function3);
        return true;
    }

    public void a() {
    }
}
