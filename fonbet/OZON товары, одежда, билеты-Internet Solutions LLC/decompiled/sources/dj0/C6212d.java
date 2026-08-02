package dj0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: dj0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6212d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f61654b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Set<InterfaceC6209a> f61655c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f61656d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f61657e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6212d(androidx.compose.ui.e eVar, Set set, C4912a c4912a, int i11) {
        super(2);
        this.f61654b = eVar;
        this.f61655c = set;
        this.f61656d = c4912a;
        this.f61657e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f61657e | 1);
        C4912a c4912a = this.f61656d;
        e.b(this.f61654b, this.f61655c, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
