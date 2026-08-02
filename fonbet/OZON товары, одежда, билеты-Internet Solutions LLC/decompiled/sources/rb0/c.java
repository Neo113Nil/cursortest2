package rb0;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import td0.f;
import ve.EnumC10311b;
import xe.C10727i;
import xe.M;
import xe.Y;
import xe.f1;
import ze.h;
import ze.l;

/* loaded from: classes3.dex */
public abstract class c<P, R> {

    /* renamed from: c, reason: collision with root package name */
    private static final long f83272c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f83273d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f83274a = k.b(a.f83276b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f83275b = k.b(b.f83277b);

    static final class a extends AbstractC7737t implements Function0<h<R>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f83276b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ze.k.a(0, 7, null);
        }
    }

    static final class b extends AbstractC7737t implements Function0<M> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f83277b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final M invoke() {
            return f.a();
        }
    }

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f83272c = kotlin.time.c.g(3, EnumC10311b.MINUTES);
    }

    public static final h a(c cVar) {
        return (h) cVar.f83274a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, kotlin.time.b bVar, @NotNull Function0 function0, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9241a c9241a;
        Object obj;
        Wc.a aVar;
        int i11;
        c<P, R> cVar2;
        Function0 function02;
        if (cVar instanceof C9241a) {
            c9241a = (C9241a) cVar;
            int i12 = c9241a.f83269i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9241a.f83269i = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = c9241a.f83267g;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9241a.f83269i;
                if (i11 != 0) {
                    s.b(obj);
                    while (!(((h) this.f83274a.getValue()).e() instanceof l.b)) {
                    }
                    c9241a.f83264d = this;
                    c9241a.f83265e = bVar;
                    c9241a.f83266f = function0;
                    c9241a.f83269i = 1;
                    if (d(str, c9241a) != aVar) {
                        cVar2 = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function02 = (Function0) c9241a.f83264d;
                    s.b(obj);
                    return obj != null ? function02.invoke() : obj;
                }
                function0 = c9241a.f83266f;
                bVar = c9241a.f83265e;
                cVar2 = (c) c9241a.f83264d;
                s.b(obj);
                long f71985a = bVar == null ? bVar.getF71985a() : f83272c;
                rb0.b bVar2 = new rb0.b(cVar2, null);
                c9241a.f83264d = function0;
                c9241a.f83265e = null;
                c9241a.f83266f = null;
                c9241a.f83269i = 2;
                obj = f1.c(Y.e(f71985a), bVar2, c9241a);
                if (obj != aVar) {
                    function02 = function0;
                    if (obj != null) {
                    }
                }
                return aVar;
            }
        }
        c9241a = new C9241a(this, cVar);
        obj = c9241a.f83267g;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9241a.f83269i;
        if (i11 != 0) {
        }
        if (bVar == null) {
        }
        rb0.b bVar22 = new rb0.b(cVar2, null);
        c9241a.f83264d = function0;
        c9241a.f83265e = null;
        c9241a.f83266f = null;
        c9241a.f83269i = 2;
        obj = f1.c(Y.e(f71985a), bVar22, c9241a);
        if (obj != aVar) {
        }
        return aVar;
    }

    @NotNull
    protected final M c() {
        return (M) this.f83275b.getValue();
    }

    protected abstract Object d(String str, @NotNull kotlin.coroutines.d dVar);

    @NotNull
    public final void e(Object obj) {
        C10727i.c(c(), null, null, new d(this, obj, null), 3);
    }
}
