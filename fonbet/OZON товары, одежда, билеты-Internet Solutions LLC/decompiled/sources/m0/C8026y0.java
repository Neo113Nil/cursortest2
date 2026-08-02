package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m0.y0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8026y0 extends AbstractC7737t implements Function1<Long, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<C8000l<Object, Object>> f73911b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f73912c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC7992h<Object, Object> f73913d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C8006o<Object, Object> f73914e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<C8000l<Object, Object>, Unit> f73915f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8026y0(kotlin.jvm.internal.M<C8000l<Object, Object>> m11, float f7, InterfaceC7992h<Object, Object> interfaceC7992h, C8006o<Object, Object> c8006o, Function1<? super C8000l<Object, Object>, Unit> function1) {
        super(1);
        this.f73911b = m11;
        this.f73912c = f7;
        this.f73913d = interfaceC7992h;
        this.f73914e = c8006o;
        this.f73915f = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l11) {
        long longValue = l11.longValue();
        C8000l<Object, Object> c8000l = this.f73911b.f71787a;
        Intrinsics.f(c8000l);
        B0.h(c8000l, longValue, this.f73912c, this.f73913d, this.f73914e, this.f73915f);
        return Unit.f71690a;
    }
}
