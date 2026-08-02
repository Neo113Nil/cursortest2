package je0;

import Ae.x0;
import Sc.s;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.K;
import we0.C10543B;
import we0.EnumC10550f;
import we0.m;
import xe.B0;
import xe.H0;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.geoproxy.data.AnalyticModule$trackCameraLocation$1", f = "AnalyticModule.kt", l = {140}, m = "invokeSuspend")
/* renamed from: je0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7407b extends kotlin.coroutines.jvm.internal.j implements Function2<we0.h, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f69951d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f69952e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ K f69953f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C7406a f69954g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ List<C10543B> f69955h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7407b(K k11, C7406a c7406a, List<C10543B> list, kotlin.coroutines.d<? super C7407b> dVar) {
        super(2, dVar);
        this.f69953f = k11;
        this.f69954g = c7406a;
        this.f69955h = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C7407b c7407b = new C7407b(this.f69953f, this.f69954g, this.f69955h, dVar);
        c7407b.f69952e = obj;
        return c7407b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(we0.h hVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7407b) create(hVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List<C10543B> list;
        B0 b02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f69951d;
        C7406a c7406a = this.f69954g;
        if (i11 == 0) {
            s.b(obj);
            we0.h hVar = (we0.h) this.f69952e;
            K k11 = this.f69953f;
            if (k11.f71785a != 2 && hVar.c() && hVar.b() == EnumC10550f.APPLICATION) {
                k11.f71785a++;
            }
            if (k11.f71785a == 2) {
                m c11 = hVar.a().c();
                c7406a.getClass();
                if (c11 != null && (list = this.f69955h) != null) {
                    Iterator<C10543B> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().b(c11)) {
                            break;
                        }
                    }
                }
                x0 x0Var = c7406a.f69943j;
                Boolean bool = Boolean.TRUE;
                this.f69951d = 1;
                if (x0Var.emit(bool, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        b02 = c7406a.f69949p;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        return Unit.f71690a;
    }
}
