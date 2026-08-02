package d2;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: d2.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6052j extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f61052b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f61053c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f61054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6052j(androidx.compose.ui.e eVar, C4912a c4912a, int i11) {
        super(2);
        this.f61052b = eVar;
        this.f61053c = c4912a;
        this.f61054d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f61054d | 1);
        C4912a c4912a = this.f61053c;
        C6053k.b(this.f61052b, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
