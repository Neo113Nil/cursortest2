package y0;

import e1.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import r0.EnumC9142v;
import x0.InterfaceC10573B;

/* loaded from: classes8.dex */
final class I extends AbstractC7737t implements Function1<Integer, C10806m> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC10573B f105655b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f105656c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ F f105657d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f105658e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ EnumC9142v f105659f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ d.a f105660g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ d.b f105661h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f105662i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I(InterfaceC10573B interfaceC10573B, long j11, F f7, long j12, EnumC9142v enumC9142v, d.a aVar, d.b bVar, int i11) {
        super(1);
        this.f105655b = interfaceC10573B;
        this.f105656c = j11;
        this.f105657d = f7;
        this.f105658e = j12;
        this.f105659f = enumC9142v;
        this.f105660g = aVar;
        this.f105661h = bVar;
        this.f105662i = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C10806m invoke(Integer num) {
        C10806m b11;
        int intValue = num.intValue();
        InterfaceC10573B interfaceC10573B = this.f105655b;
        Z1.s layoutDirection = interfaceC10573B.getLayoutDirection();
        d.a aVar = this.f105660g;
        b11 = K.b(interfaceC10573B, intValue, this.f105656c, this.f105657d, this.f105658e, this.f105659f, aVar, this.f105661h, layoutDirection, this.f105662i);
        return b11;
    }
}
