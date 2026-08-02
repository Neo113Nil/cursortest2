package im0;

import hm0.C6971a;
import hm0.b;
import java.util.Iterator;
import java.util.List;
import jm0.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class c<T> implements i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final km0.d<T> f66509a;

    /* renamed from: b, reason: collision with root package name */
    private final int f66510b;

    /* renamed from: c, reason: collision with root package name */
    private final jm0.b f66511c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f66512d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C6971a<T> f66513e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f66514f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f66515g;

    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c<T> f66516b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<T> cVar) {
            super(0);
            this.f66516b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f66516b.g();
            return Unit.f71690a;
        }
    }

    public c(@NotNull km0.d<T> downStream, int i11, jm0.b bVar) {
        Intrinsics.checkNotNullParameter(downStream, "downStream");
        this.f66509a = downStream;
        this.f66510b = i11;
        this.f66511c = bVar;
        Object obj = new Object();
        this.f66512d = obj;
        this.f66513e = new C6971a<>(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        hm0.b c11;
        while (true) {
            synchronized (this.f66512d) {
                c11 = this.f66513e.c();
                if (c11 == null) {
                    this.f66515g = false;
                    return;
                }
            }
            if (c11 instanceof b.c) {
                this.f66509a.onNext(((b.c) c11).a());
            } else if (c11 instanceof b.C1076b) {
                this.f66509a.onError(((b.C1076b) c11).a());
            } else if (c11.equals(b.a.f65634a)) {
                this.f66509a.onComplete();
            }
        }
    }

    public final void b() {
        synchronized (this.f66512d) {
            if (this.f66514f) {
                return;
            }
            this.f66514f = true;
            this.f66513e.b(b.a.f65634a);
            Unit unit = Unit.f71690a;
        }
    }

    public final void c() {
        synchronized (this.f66512d) {
            if (this.f66515g) {
                return;
            }
            this.f66515g = true;
            Unit unit = Unit.f71690a;
            jm0.b bVar = this.f66511c;
            if (bVar != null) {
                bVar.a(new a(this));
            } else {
                g();
            }
        }
    }

    public final void d(T t2) {
        synchronized (this.f66512d) {
            try {
                if (this.f66514f) {
                    return;
                }
                if (this.f66513e.d() >= this.f66510b) {
                    h(this.f66513e, new b.c<>(t2));
                } else {
                    this.f66513e.b(new b.c(t2));
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // jm0.i
    public final void dispose() {
        synchronized (this.f66512d) {
            this.f66514f = true;
            this.f66513e.a();
            Unit unit = Unit.f71690a;
        }
    }

    public final void e(@NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        synchronized (this.f66512d) {
            try {
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    d(it.next());
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        synchronized (this.f66512d) {
            if (this.f66514f) {
                return;
            }
            this.f66514f = true;
            this.f66513e.a();
            this.f66513e.b(new b.C1076b(e11));
            Unit unit = Unit.f71690a;
        }
    }

    public abstract void h(@NotNull C6971a<T> c6971a, @NotNull b.c<T> cVar);
}
