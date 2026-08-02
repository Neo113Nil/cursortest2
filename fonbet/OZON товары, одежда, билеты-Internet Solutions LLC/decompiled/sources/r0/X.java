package r0;

import fd.InterfaceC6512o;
import java.util.List;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import x1.C10638m;
import x1.C10639n;
import x1.EnumC10640o;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", l = {59, 61}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class X extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    float f82527d;

    /* renamed from: e, reason: collision with root package name */
    float f82528e;

    /* renamed from: f, reason: collision with root package name */
    float f82529f;

    /* renamed from: g, reason: collision with root package name */
    long f82530g;

    /* renamed from: h, reason: collision with root package name */
    int f82531h;

    /* renamed from: i, reason: collision with root package name */
    int f82532i;

    /* renamed from: j, reason: collision with root package name */
    int f82533j;

    /* renamed from: k, reason: collision with root package name */
    private /* synthetic */ Object f82534k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ InterfaceC6512o<C7459e, C7459e, Float, Float, Unit> f82535l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X(InterfaceC6512o interfaceC6512o, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f82535l = interfaceC6512o;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        X x11 = new X(this.f82535l, dVar);
        x11.f82534k = obj;
        return x11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
        return ((X) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x014f, code lost:
    
        if (k1.C7459e.d(r1, 0) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
    
        if (r8 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0099 -> B:6:0x009c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC10628c interfaceC10628c;
        float b11;
        int i11;
        int i12;
        long j11;
        float f7;
        float f11;
        float f12;
        InterfaceC10628c interfaceC10628c2;
        float f13;
        float f14;
        long j12;
        int i13;
        float f15;
        Object i02;
        boolean z11;
        InterfaceC10628c interfaceC10628c3;
        boolean z12;
        long j13;
        Wc.a aVar;
        int i14;
        boolean z13;
        long j14;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i15 = this.f82533j;
        boolean z14 = false;
        boolean z15 = true;
        float f16 = 1.0f;
        float f17 = 0.0f;
        if (i15 == 0) {
            Sc.s.b(obj);
            interfaceC10628c = (InterfaceC10628c) this.f82534k;
            b11 = interfaceC10628c.b().b();
            this.f82534k = interfaceC10628c;
            this.f82527d = 0.0f;
            this.f82528e = 1.0f;
            this.f82530g = 0L;
            this.f82531h = 0;
            this.f82529f = b11;
            this.f82532i = 0;
            this.f82533j = 1;
            if (C9115P.d(interfaceC10628c, null, this, 2) != aVar2) {
                i11 = 0;
                i12 = 0;
                j11 = 0;
                f7 = 1.0f;
                f11 = 0.0f;
            }
            return aVar2;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f82532i;
            f12 = this.f82529f;
            i13 = this.f82531h;
            j12 = this.f82530g;
            f14 = this.f82528e;
            f13 = this.f82527d;
            interfaceC10628c2 = (InterfaceC10628c) this.f82534k;
            Sc.s.b(obj);
            f15 = 1.0f;
            i02 = obj;
            C10638m c10638m = (C10638m) i02;
            float f18 = f17;
            List<x1.x> b12 = c10638m.b();
            int size = b12.size();
            ?? r72 = z14;
            while (true) {
                if (r72 >= size) {
                    z11 = z14;
                    break;
                }
                if (b12.get(r72).n()) {
                    z11 = z15;
                    break;
                }
                r72++;
            }
            if (z11) {
                interfaceC10628c3 = interfaceC10628c2;
                z12 = z11;
                j13 = 0;
                aVar = aVar2;
            } else {
                float c11 = Y.c(c10638m, z15);
                float c12 = Y.c(c10638m, z14);
                float f19 = (c11 == f18 || c12 == f18) ? f15 : c11 / c12;
                float d11 = Y.d(c10638m);
                interfaceC10628c3 = interfaceC10628c2;
                long b13 = Y.b(c10638m, z15);
                z12 = z11;
                if (C7459e.d(b13, 9205357640488583168L)) {
                    aVar = aVar2;
                    i14 = i11;
                    j14 = 0;
                    z13 = false;
                } else {
                    aVar = aVar2;
                    i14 = i11;
                    z13 = false;
                    j14 = C7459e.j(b13, Y.b(c10638m, false));
                }
                if (i13 == 0) {
                    f14 *= f19;
                    f13 += d11;
                    j12 = C7459e.k(j12, j14);
                    float c13 = Y.c(c10638m, z13);
                    float abs = Math.abs(1 - f14) * c13;
                    float abs2 = Math.abs(((3.1415927f * f13) * c13) / 180.0f);
                    float e11 = C7459e.e(j12);
                    if (abs > f12 || abs2 > f12 || e11 > f12) {
                        i13 = 1;
                        i14 = 0;
                    }
                }
                if (i13 != 0) {
                    long b14 = Y.b(c10638m, false);
                    if (i14 != 0) {
                        d11 = f18;
                    }
                    if (d11 == f18 && f19 == f15) {
                        j13 = 0;
                    } else {
                        j13 = 0;
                    }
                    this.f82535l.invoke(C7459e.a(b14), C7459e.a(j14), new Float(f19), new Float(d11));
                    List<x1.x> b15 = c10638m.b();
                    int size2 = b15.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        x1.x xVar = b15.get(i16);
                        if (C10639n.i(xVar)) {
                            xVar.a();
                        }
                    }
                } else {
                    j13 = 0;
                }
                i11 = i14;
            }
            if (!z12) {
                List<x1.x> b16 = c10638m.b();
                int size3 = b16.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    if (b16.get(i17).g()) {
                        aVar2 = aVar;
                        f16 = f15;
                        f17 = f18;
                        z14 = false;
                        z15 = true;
                        interfaceC10628c2 = interfaceC10628c3;
                        this.f82534k = interfaceC10628c2;
                        this.f82527d = f13;
                        this.f82528e = f14;
                        this.f82530g = j12;
                        this.f82531h = i13;
                        this.f82529f = f12;
                        this.f82532i = i11;
                        f15 = f16;
                        this.f82533j = 2;
                        i02 = interfaceC10628c2.i0(EnumC10640o.Main, this);
                    }
                }
            }
            return Unit.f71690a;
        }
        i11 = this.f82532i;
        b11 = this.f82529f;
        i12 = this.f82531h;
        j11 = this.f82530g;
        f7 = this.f82528e;
        f11 = this.f82527d;
        interfaceC10628c = (InterfaceC10628c) this.f82534k;
        Sc.s.b(obj);
        int i18 = i12;
        f12 = b11;
        interfaceC10628c2 = interfaceC10628c;
        f13 = f11;
        f14 = f7;
        j12 = j11;
        i13 = i18;
        this.f82534k = interfaceC10628c2;
        this.f82527d = f13;
        this.f82528e = f14;
        this.f82530g = j12;
        this.f82531h = i13;
        this.f82529f = f12;
        this.f82532i = i11;
        f15 = f16;
        this.f82533j = 2;
        i02 = interfaceC10628c2.i0(EnumC10640o.Main, this);
    }
}
