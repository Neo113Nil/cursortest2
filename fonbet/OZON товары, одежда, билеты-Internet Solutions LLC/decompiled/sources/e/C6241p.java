package e;

import Ae.InterfaceC2395h;
import S0.InterfaceC3967k;
import androidx.activity.C5035b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: e.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6241p extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f61720b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC2395h<C5035b>, kotlin.coroutines.d<Unit>, Object> f61721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6241p(boolean z11, Function2 function2, int i11) {
        super(2);
        this.f61720b = z11;
        this.f61721c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        C6243r.a(this.f61720b, this.f61721c, interfaceC3967k, 1);
        return Unit.f71690a;
    }
}
