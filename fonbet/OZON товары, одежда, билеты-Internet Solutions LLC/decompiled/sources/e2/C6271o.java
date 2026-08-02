package e2;

import B1.U;
import B90.RunnableC2599a;
import S0.V0;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: e2.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6271o implements InterfaceC6270n, V0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6267k f61841a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f61842b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c1.y f61843c = new c1.y(new b());

    /* renamed from: d, reason: collision with root package name */
    private boolean f61844d = true;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<Unit, Unit> f61845e = new c();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList f61846f = new ArrayList();

    /* renamed from: e2.o$a */
    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<U> f61847b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C6271o f61848c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C6253A f61849d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends U> list, C6271o c6271o, C6253A c6253a) {
            super(0);
            this.f61847b = list;
            this.f61848c = c6271o;
            this.f61849d = c6253a;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            List<U> list = this.f61847b;
            int size = list.size();
            int i11 = 0;
            while (true) {
                C6271o c6271o = this.f61848c;
                if (i11 >= size) {
                    c6271o.i().a(this.f61849d);
                    return Unit.f71690a;
                }
                Object m11 = list.get(i11).m();
                C6266j c6266j = m11 instanceof C6266j ? (C6266j) m11 : null;
                if (c6266j != null) {
                    C6260d b11 = c6266j.b();
                    c6266j.a().invoke(new C6259c(b11.a(), c6271o.i().b(b11)));
                }
                c6271o.f61846f.add(c6266j);
                i11++;
            }
        }
    }

    /* renamed from: e2.o$b */
    static final class b extends AbstractC7737t implements Function1<Function0<? extends Unit>, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function0<? extends Unit> function0) {
            Function0<? extends Unit> function02 = function0;
            if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
                function02.invoke();
            } else {
                C6271o c6271o = C6271o.this;
                Handler handler = c6271o.f61842b;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    c6271o.f61842b = handler;
                }
                handler.post(new RunnableC2599a(function02, 6));
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: e2.o$c */
    static final class c extends AbstractC7737t implements Function1<Unit, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Unit unit) {
            C6271o.this.j();
            return Unit.f71690a;
        }
    }

    public C6271o(@NotNull C6267k c6267k) {
        this.f61841a = c6267k;
    }

    @Override // e2.InterfaceC6270n
    public final void a(@NotNull C6253A c6253a, @NotNull List<? extends U> list) {
        this.f61846f.clear();
        this.f61843c.k(Unit.f71690a, this.f61845e, new a(list, this, c6253a));
        this.f61844d = false;
    }

    @Override // S0.V0
    public final void b() {
        this.f61843c.l();
    }

    @Override // e2.InterfaceC6270n
    public final boolean c(@NotNull List<? extends U> list) {
        if (this.f61844d) {
            return true;
        }
        int size = list.size();
        ArrayList arrayList = this.f61846f;
        if (size != arrayList.size()) {
            return true;
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Object m11 = list.get(i11).m();
            if (!Intrinsics.d(m11 instanceof C6266j ? (C6266j) m11 : null, arrayList.get(i11))) {
                return true;
            }
        }
        return false;
    }

    @Override // S0.V0
    public final void d() {
    }

    @Override // S0.V0
    public final void e() {
        c1.y yVar = this.f61843c;
        yVar.m();
        yVar.h();
    }

    @NotNull
    public final C6267k i() {
        return this.f61841a;
    }

    public final void j() {
        this.f61844d = true;
    }
}
