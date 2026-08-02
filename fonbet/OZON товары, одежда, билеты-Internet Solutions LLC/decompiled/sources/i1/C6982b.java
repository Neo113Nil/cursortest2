package i1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7798P;
import l1.InterfaceC7825i0;
import l1.J0;
import l1.y0;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6982b extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f65674b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f65675c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f65676d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ J0 f65677e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f65678f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6982b(float f7, float f11, int i11, J0 j02, boolean z11) {
        super(1);
        this.f65674b = f7;
        this.f65675c = f11;
        this.f65676d = i11;
        this.f65677e = j02;
        this.f65678f = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        InterfaceC7825i0 interfaceC7825i02 = interfaceC7825i0;
        float v12 = interfaceC7825i02.v1(this.f65674b);
        float v13 = interfaceC7825i02.v1(this.f65675c);
        interfaceC7825i02.l((v12 <= 0.0f || v13 <= 0.0f) ? null : new C7798P(v12, this.f65676d, v13));
        J0 j02 = this.f65677e;
        if (j02 == null) {
            j02 = y0.a();
        }
        interfaceC7825i02.setShape(j02);
        interfaceC7825i02.x(this.f65678f);
        return Unit.f71690a;
    }
}
