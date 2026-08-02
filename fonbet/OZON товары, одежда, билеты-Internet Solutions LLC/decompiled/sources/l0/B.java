package l0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class B extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f72002b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a f72003c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.q f72004d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.s f72005e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f72006f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f72007g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f72008h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f72009i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(boolean z11, e.a aVar, androidx.compose.animation.q qVar, androidx.compose.animation.s sVar, String str, C4912a c4912a, int i11, int i12) {
        super(2);
        this.f72002b = z11;
        this.f72003c = aVar;
        this.f72004d = qVar;
        this.f72005e = sVar;
        this.f72006f = str;
        this.f72007g = c4912a;
        this.f72008h = i11;
        this.f72009i = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f72008h | 1);
        C4912a c4912a = this.f72007g;
        androidx.compose.animation.q qVar = this.f72004d;
        androidx.compose.animation.s sVar = this.f72005e;
        G.b(this.f72002b, this.f72003c, qVar, sVar, this.f72006f, c4912a, interfaceC3967k, e11, this.f72009i);
        return Unit.f71690a;
    }
}
