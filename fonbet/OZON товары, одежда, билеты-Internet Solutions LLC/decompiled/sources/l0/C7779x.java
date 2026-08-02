package l0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: l0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7779x extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f72166b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f72167c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.q f72168d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.s f72169e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f72170f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f72171g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f72172h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f72173i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7779x(boolean z11, androidx.compose.ui.e eVar, androidx.compose.animation.q qVar, androidx.compose.animation.s sVar, String str, C4912a c4912a, int i11, int i12) {
        super(2);
        this.f72166b = z11;
        this.f72167c = eVar;
        this.f72168d = qVar;
        this.f72169e = sVar;
        this.f72170f = str;
        this.f72171g = c4912a;
        this.f72172h = i11;
        this.f72173i = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f72172h | 1);
        C4912a c4912a = this.f72171g;
        androidx.compose.animation.s sVar = this.f72169e;
        G.c(this.f72166b, this.f72167c, this.f72168d, sVar, this.f72170f, c4912a, interfaceC3967k, e11, this.f72173i);
        return Unit.f71690a;
    }
}
