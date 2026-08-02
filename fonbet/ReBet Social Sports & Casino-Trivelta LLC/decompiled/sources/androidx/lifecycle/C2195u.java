package androidx.lifecycle;

import androidx.lifecycle.AbstractC2185j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import t.C6374a;
import t.C6375b;

/* renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2195u extends AbstractC2185j {

    /* renamed from: k, reason: collision with root package name */
    public static final a f20413k = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20414b;

    /* renamed from: c, reason: collision with root package name */
    public C6374a f20415c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC2185j.b f20416d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f20417e;

    /* renamed from: f, reason: collision with root package name */
    public int f20418f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20419g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20420h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f20421i;

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.coroutines.flow.y f20422j;

    /* renamed from: androidx.lifecycle.u$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC2185j.b a(AbstractC2185j.b state1, AbstractC2185j.b bVar) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        public a() {
        }
    }

    /* renamed from: androidx.lifecycle.u$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC2185j.b f20423a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC2191p f20424b;

        public b(r rVar, AbstractC2185j.b initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNull(rVar);
            this.f20424b = C2199y.f(rVar);
            this.f20423a = initialState;
        }

        public final void a(InterfaceC2193s interfaceC2193s, AbstractC2185j.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            AbstractC2185j.b c10 = event.c();
            this.f20423a = C2195u.f20413k.a(this.f20423a, c10);
            InterfaceC2191p interfaceC2191p = this.f20424b;
            Intrinsics.checkNotNull(interfaceC2193s);
            interfaceC2191p.k(interfaceC2193s, event);
            this.f20423a = c10;
        }

        public final AbstractC2185j.b b() {
            return this.f20423a;
        }
    }

    public C2195u(InterfaceC2193s interfaceC2193s, boolean z10) {
        this.f20414b = z10;
        this.f20415c = new C6374a();
        AbstractC2185j.b bVar = AbstractC2185j.b.f20391b;
        this.f20416d = bVar;
        this.f20421i = new ArrayList();
        this.f20417e = new WeakReference(interfaceC2193s);
        this.f20422j = kotlinx.coroutines.flow.N.a(bVar);
    }

    @Override // androidx.lifecycle.AbstractC2185j
    public void a(r observer) {
        InterfaceC2193s interfaceC2193s;
        Intrinsics.checkNotNullParameter(observer, "observer");
        g("addObserver");
        AbstractC2185j.b bVar = this.f20416d;
        AbstractC2185j.b bVar2 = AbstractC2185j.b.f20390a;
        if (bVar != bVar2) {
            bVar2 = AbstractC2185j.b.f20391b;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f20415c.g(observer, bVar3)) == null && (interfaceC2193s = (InterfaceC2193s) this.f20417e.get()) != null) {
            boolean z10 = this.f20418f != 0 || this.f20419g;
            AbstractC2185j.b f10 = f(observer);
            this.f20418f++;
            while (bVar3.b().compareTo(f10) < 0 && this.f20415c.contains(observer)) {
                m(bVar3.b());
                AbstractC2185j.a b10 = AbstractC2185j.a.Companion.b(bVar3.b());
                if (b10 == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(interfaceC2193s, b10);
                l();
                f10 = f(observer);
            }
            if (!z10) {
                o();
            }
            this.f20418f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC2185j
    public AbstractC2185j.b b() {
        return this.f20416d;
    }

    @Override // androidx.lifecycle.AbstractC2185j
    public void d(r observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        g("removeObserver");
        this.f20415c.h(observer);
    }

    public final void e(InterfaceC2193s interfaceC2193s) {
        Iterator descendingIterator = this.f20415c.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(descendingIterator, "descendingIterator(...)");
        while (descendingIterator.hasNext() && !this.f20420h) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            Intrinsics.checkNotNull(entry);
            r rVar = (r) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f20416d) > 0 && !this.f20420h && this.f20415c.contains(rVar)) {
                AbstractC2185j.a a10 = AbstractC2185j.a.Companion.a(bVar.b());
                if (a10 == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                m(a10.c());
                bVar.a(interfaceC2193s, a10);
                l();
            }
        }
    }

    public final AbstractC2185j.b f(r rVar) {
        b bVar;
        Map.Entry i10 = this.f20415c.i(rVar);
        AbstractC2185j.b bVar2 = null;
        AbstractC2185j.b b10 = (i10 == null || (bVar = (b) i10.getValue()) == null) ? null : bVar.b();
        if (!this.f20421i.isEmpty()) {
            bVar2 = (AbstractC2185j.b) this.f20421i.get(r0.size() - 1);
        }
        a aVar = f20413k;
        return aVar.a(aVar.a(this.f20416d, b10), bVar2);
    }

    public final void g(String str) {
        if (!this.f20414b || AbstractC2197w.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    public final void h(InterfaceC2193s interfaceC2193s) {
        C6375b.d c10 = this.f20415c.c();
        Intrinsics.checkNotNullExpressionValue(c10, "iteratorWithAdditions(...)");
        while (c10.hasNext() && !this.f20420h) {
            Map.Entry entry = (Map.Entry) c10.next();
            r rVar = (r) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f20416d) < 0 && !this.f20420h && this.f20415c.contains(rVar)) {
                m(bVar.b());
                AbstractC2185j.a b10 = AbstractC2185j.a.Companion.b(bVar.b());
                if (b10 == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(interfaceC2193s, b10);
                l();
            }
        }
    }

    public void i(AbstractC2185j.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        g("handleLifecycleEvent");
        k(event.c());
    }

    public final boolean j() {
        if (this.f20415c.size() == 0) {
            return true;
        }
        Map.Entry a10 = this.f20415c.a();
        Intrinsics.checkNotNull(a10);
        AbstractC2185j.b b10 = ((b) a10.getValue()).b();
        Map.Entry e10 = this.f20415c.e();
        Intrinsics.checkNotNull(e10);
        AbstractC2185j.b b11 = ((b) e10.getValue()).b();
        return b10 == b11 && this.f20416d == b11;
    }

    public final void k(AbstractC2185j.b bVar) {
        if (this.f20416d == bVar) {
            return;
        }
        AbstractC2196v.a((InterfaceC2193s) this.f20417e.get(), this.f20416d, bVar);
        this.f20416d = bVar;
        if (this.f20419g || this.f20418f != 0) {
            this.f20420h = true;
            return;
        }
        this.f20419g = true;
        o();
        this.f20419g = false;
        if (this.f20416d == AbstractC2185j.b.f20390a) {
            this.f20415c = new C6374a();
        }
    }

    public final void l() {
        this.f20421i.remove(r0.size() - 1);
    }

    public final void m(AbstractC2185j.b bVar) {
        this.f20421i.add(bVar);
    }

    public void n(AbstractC2185j.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        g("setCurrentState");
        k(state);
    }

    public final void o() {
        InterfaceC2193s interfaceC2193s = (InterfaceC2193s) this.f20417e.get();
        if (interfaceC2193s == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!j()) {
            this.f20420h = false;
            AbstractC2185j.b bVar = this.f20416d;
            Map.Entry a10 = this.f20415c.a();
            Intrinsics.checkNotNull(a10);
            if (bVar.compareTo(((b) a10.getValue()).b()) < 0) {
                e(interfaceC2193s);
            }
            Map.Entry e10 = this.f20415c.e();
            if (!this.f20420h && e10 != null && this.f20416d.compareTo(((b) e10.getValue()).b()) > 0) {
                h(interfaceC2193s);
            }
        }
        this.f20420h = false;
        this.f20422j.setValue(b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2195u(InterfaceC2193s provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
