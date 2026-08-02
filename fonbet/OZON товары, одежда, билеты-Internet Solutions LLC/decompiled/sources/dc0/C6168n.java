package dc0;

import Sc.InterfaceC4008j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.account.CookieCleaner$clear$2", f = "CookieCleaner.kt", l = {22}, m = "invokeSuspend")
/* renamed from: dc0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6168n extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    String f61566d;

    /* renamed from: e, reason: collision with root package name */
    int f61567e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C6170p f61568f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f61569g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f61570h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f61571i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6168n(C6170p c6170p, boolean z11, boolean z12, boolean z13, kotlin.coroutines.d<? super C6168n> dVar) {
        super(2, dVar);
        this.f61568f = c6170p;
        this.f61569g = z11;
        this.f61570h = z12;
        this.f61571i = z13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C6168n(this.f61568f, this.f61569g, this.f61570h, this.f61571i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6168n) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        InterfaceC4008j interfaceC4008j2;
        String str;
        InterfaceC4008j interfaceC4008j3;
        InterfaceC4008j interfaceC4008j4;
        InterfaceC4008j interfaceC4008j5;
        InterfaceC4008j interfaceC4008j6;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f61567e;
        C6170p c6170p = this.f61568f;
        if (i11 == 0) {
            Sc.s.b(obj);
            interfaceC4008j = c6170p.f61574a;
            String f7 = C6171q.f("abt_data", ((C6144H) interfaceC4008j.getValue()).i());
            interfaceC4008j2 = c6170p.f61574a;
            C6144H c6144h = (C6144H) interfaceC4008j2.getValue();
            this.f61566d = f7;
            this.f61567e = 1;
            if (c6144h.c(this) == aVar) {
                return aVar;
            }
            str = f7;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f61566d;
            Sc.s.b(obj);
        }
        if (this.f61569g) {
            interfaceC4008j6 = c6170p.f61575b;
            ((Cb0.e) interfaceC4008j6.getValue()).f();
        }
        C6170p.d(c6170p, str);
        if (this.f61570h) {
            if (this.f61571i) {
                interfaceC4008j5 = c6170p.f61576c;
                ((qc0.b) interfaceC4008j5.getValue()).a();
            } else {
                interfaceC4008j4 = c6170p.f61576c;
                ((qc0.b) interfaceC4008j4.getValue()).b();
            }
        }
        interfaceC4008j3 = c6170p.f61574a;
        ((C6144H) interfaceC4008j3.getValue()).j();
        return Unit.f71690a;
    }
}
