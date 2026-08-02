package x1;

import D1.AbstractC2810k0;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.H;

/* loaded from: classes8.dex */
public final class G implements D {

    /* renamed from: a, reason: collision with root package name */
    public Function1<? super MotionEvent, Boolean> f104820a;

    /* renamed from: b, reason: collision with root package name */
    private K f104821b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f104822c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f104823d = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a Dispatching;
        public static final a NotDispatching;
        public static final a Unknown;

        static {
            a aVar = new a("Unknown", 0);
            Unknown = aVar;
            a aVar2 = new a("Dispatching", 1);
            Dispatching = aVar2;
            a aVar3 = new a("NotDispatching", 2);
            NotDispatching = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static final class b extends C {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private a f104824b = a.Unknown;

        static final class a extends AbstractC7737t implements Function1<MotionEvent, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f104826b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(G g10) {
                super(1);
                this.f104826b = g10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                Function1<? super MotionEvent, Boolean> function1 = this.f104826b.f104820a;
                if (function1 != null) {
                    ((H.a) function1).invoke(motionEvent2);
                    return Unit.f71690a;
                }
                Intrinsics.n("onTouchEvent");
                throw null;
            }
        }

        /* renamed from: x1.G$b$b, reason: collision with other inner class name */
        static final class C2270b extends AbstractC7737t implements Function1<MotionEvent, Unit> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ G f104828c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2270b(G g10) {
                super(1);
                this.f104828c = g10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                int actionMasked = motionEvent2.getActionMasked();
                G g10 = this.f104828c;
                if (actionMasked == 0) {
                    Function1<? super MotionEvent, Boolean> function1 = g10.f104820a;
                    if (function1 == null) {
                        Intrinsics.n("onTouchEvent");
                        throw null;
                    }
                    b.this.f104824b = ((Boolean) ((H.a) function1).invoke(motionEvent2)).booleanValue() ? a.Dispatching : a.NotDispatching;
                } else {
                    Function1<? super MotionEvent, Boolean> function12 = g10.f104820a;
                    if (function12 == null) {
                        Intrinsics.n("onTouchEvent");
                        throw null;
                    }
                    ((H.a) function12).invoke(motionEvent2);
                }
                return Unit.f71690a;
            }
        }

        static final class c extends AbstractC7737t implements Function1<MotionEvent, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f104829b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(G g10) {
                super(1);
                this.f104829b = g10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                Function1<? super MotionEvent, Boolean> function1 = this.f104829b.f104820a;
                if (function1 != null) {
                    ((H.a) function1).invoke(motionEvent2);
                    return Unit.f71690a;
                }
                Intrinsics.n("onTouchEvent");
                throw null;
            }
        }

        b() {
        }

        private final void e(C10638m c10638m) {
            List<x> b11 = c10638m.b();
            int size = b11.size();
            int i11 = 0;
            while (true) {
                G g10 = G.this;
                if (i11 >= size) {
                    B1.B a11 = a();
                    if (a11 == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    I.b(c10638m, ((AbstractC2810k0) a11).y(0L), new C2270b(g10));
                    if (this.f104824b == a.Dispatching) {
                        int size2 = b11.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            b11.get(i12).a();
                        }
                        C10633h c11 = c10638m.c();
                        if (c11 == null) {
                            return;
                        }
                        c11.e(!g10.a());
                        return;
                    }
                    return;
                }
                if (b11.get(i11).n()) {
                    if (this.f104824b == a.Dispatching) {
                        B1.B a12 = a();
                        if (a12 == null) {
                            throw new IllegalStateException("layoutCoordinates not set");
                        }
                        I.a(c10638m, ((AbstractC2810k0) a12).y(0L), new a(g10));
                    }
                    this.f104824b = a.NotDispatching;
                    return;
                }
                i11++;
            }
        }

        public final void f() {
            if (this.f104824b == a.Dispatching) {
                long uptimeMillis = SystemClock.uptimeMillis();
                G g10 = G.this;
                c cVar = new c(g10);
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                obtain.setSource(0);
                cVar.invoke(obtain);
                obtain.recycle();
                this.f104824b = a.Unknown;
                g10.b(false);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void g(@NotNull C10638m c10638m, @NotNull EnumC10640o enumC10640o) {
            boolean z11;
            List<x> b11 = c10638m.b();
            G g10 = G.this;
            if (!g10.a()) {
                int size = b11.size();
                for (int i11 = 0; i11 < size; i11++) {
                    x xVar = b11.get(i11);
                    if (!C10639n.a(xVar) && !C10639n.c(xVar)) {
                    }
                }
                z11 = false;
                if (this.f104824b != a.NotDispatching) {
                    if (enumC10640o == EnumC10640o.Initial && z11) {
                        e(c10638m);
                    }
                    if (enumC10640o == EnumC10640o.Final && !z11) {
                        e(c10638m);
                    }
                }
                if (enumC10640o != EnumC10640o.Final) {
                    int size2 = b11.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        if (!C10639n.c(b11.get(i12))) {
                            return;
                        }
                    }
                    this.f104824b = a.Unknown;
                    g10.b(false);
                    return;
                }
                return;
            }
            z11 = true;
            if (this.f104824b != a.NotDispatching) {
            }
            if (enumC10640o != EnumC10640o.Final) {
            }
        }
    }

    public final boolean a() {
        return this.f104822c;
    }

    public final void b(boolean z11) {
        this.f104822c = z11;
    }

    public final void c(K k11) {
        K k12 = this.f104821b;
        if (k12 != null) {
            k12.a(null);
        }
        this.f104821b = k11;
        k11.a(this);
    }

    @Override // x1.D
    @NotNull
    public final b q1() {
        return this.f104823d;
    }
}
