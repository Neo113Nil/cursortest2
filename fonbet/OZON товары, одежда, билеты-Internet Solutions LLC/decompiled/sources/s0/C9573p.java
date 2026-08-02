package s0;

import B0.C0;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.J;
import m0.B0;
import m0.C8006o;
import m0.InterfaceC7976A;
import m0.InterfaceC8002m;
import r0.C9112M;

/* renamed from: s0.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9573p {

    /* renamed from: a, reason: collision with root package name */
    private static final float f98088a = 400;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f98089b = 0;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C9112M.a aVar, float f7, C8006o c8006o, InterfaceC7976A interfaceC7976A, Function1 function1, kotlin.coroutines.jvm.internal.c cVar) {
        C9569l c9569l;
        int i11;
        J j11;
        if (cVar instanceof C9569l) {
            c9569l = (C9569l) cVar;
            int i12 = c9569l.f98073h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9569l.f98073h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9569l.f98072g;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9569l.f98073h;
                if (i11 != 0) {
                    s.b(obj);
                    J j12 = new J();
                    boolean z11 = ((Number) c8006o.o()).floatValue() == 0.0f;
                    C9570m c9570m = new C9570m(f7, j12, aVar, function1);
                    c9569l.f98070e = c8006o;
                    c9569l.f98071f = j12;
                    c9569l.f98069d = f7;
                    c9569l.f98073h = 1;
                    if (B0.e(c8006o, interfaceC7976A, !z11, c9570m, c9569l) == aVar2) {
                        return aVar2;
                    }
                    j11 = j12;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f7 = c9569l.f98069d;
                    j11 = c9569l.f98071f;
                    c8006o = c9569l.f98070e;
                    s.b(obj);
                }
                return new C9558a(new Float(f7 - j11.f71784a), c8006o);
            }
        }
        c9569l = new C9569l(cVar);
        Object obj2 = c9569l.f98072g;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9569l.f98073h;
        if (i11 != 0) {
        }
        return new C9558a(new Float(f7 - j11.f71784a), c8006o);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C9112M.a aVar, float f7, float f11, C8006o c8006o, InterfaceC8002m interfaceC8002m, Function1 function1, kotlin.coroutines.jvm.internal.c cVar) {
        C9571n c9571n;
        int i11;
        J j11;
        C8006o c8006o2;
        float f12;
        if (cVar instanceof C9571n) {
            c9571n = (C9571n) cVar;
            int i12 = c9571n.f98083i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9571n.f98083i = i12 - LinearLayoutManager.INVALID_OFFSET;
                C9571n c9571n2 = c9571n;
                Object obj = c9571n2.f98082h;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9571n2.f98083i;
                if (i11 != 0) {
                    s.b(obj);
                    J j12 = new J();
                    float floatValue = ((Number) c8006o.o()).floatValue();
                    Float f13 = new Float(f7);
                    boolean z11 = ((Number) c8006o.o()).floatValue() == 0.0f;
                    C9572o c9572o = new C9572o(f11, j12, aVar, function1);
                    c9571n2.f98080f = c8006o;
                    c9571n2.f98081g = j12;
                    c9571n2.f98078d = f7;
                    c9571n2.f98079e = floatValue;
                    c9571n2.f98083i = 1;
                    if (B0.f(c8006o, f13, interfaceC8002m, !z11, c9572o, c9571n2) == aVar2) {
                        return aVar2;
                    }
                    j11 = j12;
                    c8006o2 = c8006o;
                    f12 = floatValue;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f12 = c9571n2.f98079e;
                    f7 = c9571n2.f98078d;
                    j11 = c9571n2.f98081g;
                    c8006o2 = c9571n2.f98080f;
                    s.b(obj);
                }
                float floatValue2 = ((Number) c8006o2.o()).floatValue();
                if (f12 != 0.0f) {
                    f12 = 0.0f;
                } else if (f12 <= 0.0f ? floatValue2 >= f12 : floatValue2 <= f12) {
                    f12 = floatValue2;
                }
                return new C9558a(new Float(f7 - j11.f71784a), C0.b(c8006o2, 0.0f, f12, 29));
            }
        }
        c9571n = new C9571n(cVar);
        C9571n c9571n22 = c9571n;
        Object obj2 = c9571n22.f98082h;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9571n22.f98083i;
        if (i11 != 0) {
        }
        float floatValue22 = ((Number) c8006o2.o()).floatValue();
        if (f12 != 0.0f) {
        }
        return new C9558a(new Float(f7 - j11.f71784a), C0.b(c8006o2, 0.0f, f12, 29));
    }

    public static final float c(float f7, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return (f11 <= 0.0f ? f7 >= f11 : f7 <= f11) ? f7 : f11;
    }

    public static final float d() {
        return f98088a;
    }
}
