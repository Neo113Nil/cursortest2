package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: m0.w0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8022w0 extends AbstractC7737t implements Function1<Long, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<C8000l<Object, Object>> f73895b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f73896c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC7992h<Object, Object> f73897d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f73898e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C8006o<Object, Object> f73899f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f73900g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function1<C8000l<Object, Object>, Unit> f73901h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8022w0(kotlin.jvm.internal.M<C8000l<Object, Object>> m11, Object obj, InterfaceC7992h<Object, Object> interfaceC7992h, Object obj2, C8006o<Object, Object> c8006o, float f7, Function1<? super C8000l<Object, Object>, Unit> function1) {
        super(1);
        this.f73895b = m11;
        this.f73896c = obj;
        this.f73897d = interfaceC7992h;
        this.f73898e = obj2;
        this.f73899f = c8006o;
        this.f73900g = f7;
        this.f73901h = function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, m0.l] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, m0.t] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l11) {
        long longValue = l11.longValue();
        InterfaceC7992h<Object, Object> interfaceC7992h = this.f73897d;
        U0<Object, Object> d11 = interfaceC7992h.d();
        Object f7 = interfaceC7992h.f();
        C8020v0 c8020v0 = new C8020v0(this.f73899f);
        ?? c8000l = new C8000l(this.f73896c, d11, this.f73898e, longValue, f7, longValue, c8020v0);
        B0.h(c8000l, longValue, this.f73900g, this.f73897d, this.f73899f, this.f73901h);
        this.f73895b.f71787a = c8000l;
        return Unit.f71690a;
    }
}
