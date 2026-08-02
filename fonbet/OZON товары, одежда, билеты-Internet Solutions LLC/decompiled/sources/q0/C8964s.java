package q0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: q0.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8964s extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f81350b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f81351c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C8950e f81352d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f81353e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f81354f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f81355g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8964s(String str, boolean z11, C8950e c8950e, androidx.compose.ui.e eVar, Function0 function0, int i11) {
        super(2);
        this.f81350b = str;
        this.f81351c = z11;
        this.f81352d = c8950e;
        this.f81353e = eVar;
        this.f81354f = (AbstractC7737t) function0;
        this.f81355g = i11;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f81355g | 1);
        ?? r42 = this.f81354f;
        androidx.compose.ui.e eVar = this.f81353e;
        C8969x.b(this.f81350b, this.f81351c, this.f81352d, eVar, r42, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
