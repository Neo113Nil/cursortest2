package androidx.compose.runtime;

import B.B;
import H.d;
import H.h;
import H.i;
import H.l;
import H.m;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a extends l implements i {

    /* renamed from: b, reason: collision with root package name */
    public final B f17541b;

    /* renamed from: c, reason: collision with root package name */
    public C0346a f17542c;

    /* renamed from: androidx.compose.runtime.a$a, reason: collision with other inner class name */
    public static final class C0346a extends m {

        /* renamed from: c, reason: collision with root package name */
        public Object f17543c;

        public C0346a(Object obj) {
            this.f17543c = obj;
        }

        @Override // H.m
        public m a() {
            return new C0346a(this.f17543c);
        }

        public final Object f() {
            return this.f17543c;
        }

        public final void g(Object obj) {
            this.f17543c = obj;
        }
    }

    public a(Object obj, B b10) {
        this.f17541b = b10;
        C0346a c0346a = new C0346a(obj);
        if (d.f4267d.b()) {
            C0346a c0346a2 = new C0346a(obj);
            c0346a2.e(1);
            c0346a.d(c0346a2);
        }
        this.f17542c = c0346a;
    }

    @Override // H.k
    public void b(m mVar) {
        Intrinsics.checkNotNull(mVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f17542c = (C0346a) mVar;
    }

    @Override // H.k
    public m c() {
        return this.f17542c;
    }

    public B d() {
        return this.f17541b;
    }

    @Override // B.G
    public Object getValue() {
        return ((C0346a) h.l(this.f17542c, this)).f();
    }

    @Override // B.s
    public void setValue(Object obj) {
        d a10;
        C0346a c0346a = (C0346a) h.c(this.f17542c);
        if (d().a(c0346a.f(), obj)) {
            return;
        }
        C0346a c0346a2 = this.f17542c;
        h.f();
        synchronized (h.e()) {
            a10 = d.f4267d.a();
            ((C0346a) h.i(c0346a2, this, a10, c0346a)).g(obj);
            Unit unit = Unit.INSTANCE;
        }
        h.h(a10, this);
    }

    public String toString() {
        return "MutableState(value=" + ((C0346a) h.c(this.f17542c)).f() + ")@" + hashCode();
    }
}
