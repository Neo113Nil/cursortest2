package n0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import n1.AbstractC8413f;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

/* renamed from: n0.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8384e extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7799Q f76170b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f76171c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f76172d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC8413f f76173e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8384e(AbstractC7799Q abstractC7799Q, long j11, long j12, AbstractC8413f abstractC8413f) {
        super(1);
        this.f76170b = abstractC7799Q;
        this.f76171c = j11;
        this.f76172d = j12;
        this.f76173e = abstractC8413f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8410c interfaceC8410c) {
        InterfaceC8410c interfaceC8410c2 = interfaceC8410c;
        interfaceC8410c2.F0();
        InterfaceC8412e.k0(interfaceC8410c2, this.f76170b, this.f76171c, this.f76172d, 0.0f, this.f76173e, 0, 104);
        return Unit.f71690a;
    }
}
