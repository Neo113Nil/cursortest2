package n0;

import Kk.C3532b;
import k1.C7455a;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import n1.C8408a;
import n1.C8416i;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

/* renamed from: n0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8388i extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f76189b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC7799Q f76190c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f76191d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f76192e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f76193f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f76194g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f76195h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C8416i f76196i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8388i(boolean z11, AbstractC7799Q abstractC7799Q, long j11, float f7, float f11, long j12, long j13, C8416i c8416i) {
        super(1);
        this.f76189b = z11;
        this.f76190c = abstractC7799Q;
        this.f76191d = j11;
        this.f76192e = f7;
        this.f76193f = f11;
        this.f76194g = j12;
        this.f76195h = j13;
        this.f76196i = c8416i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8410c interfaceC8410c) {
        long e11;
        InterfaceC8410c interfaceC8410c2 = interfaceC8410c;
        interfaceC8410c2.F0();
        if (this.f76189b) {
            InterfaceC8412e.I0(interfaceC8410c2, this.f76190c, 0L, 0L, this.f76191d, 0.0f, null, 246);
        } else {
            long j11 = this.f76191d;
            float d11 = C7455a.d(j11);
            float f7 = this.f76192e;
            if (d11 < f7) {
                float f11 = this.f76193f;
                float f12 = C7464j.f(interfaceC8410c2.i());
                float f13 = this.f76193f;
                float f14 = f12 - f13;
                float d12 = C7464j.d(interfaceC8410c2.i()) - f13;
                AbstractC7799Q abstractC7799Q = this.f76190c;
                long j12 = this.f76191d;
                C8408a.b w02 = interfaceC8410c2.w0();
                long e12 = w02.e();
                w02.a().save();
                try {
                    w02.f().b(f11, f11, f14, d12, 0);
                    InterfaceC8412e.I0(interfaceC8410c2, abstractC7799Q, 0L, 0L, j12, 0.0f, null, 246);
                } finally {
                    C3532b.b(w02, e12);
                }
            } else {
                e11 = C8385f.e(f7, j11);
                InterfaceC8412e.I0(interfaceC8410c2, this.f76190c, this.f76194g, this.f76195h, e11, 0.0f, this.f76196i, 208);
            }
        }
        return Unit.f71690a;
    }
}
