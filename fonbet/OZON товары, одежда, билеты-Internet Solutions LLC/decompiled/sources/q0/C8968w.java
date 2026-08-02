package q0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: q0.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8968w extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8956k f81366b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f81367c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f81368d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C8950e f81369e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f81370f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f81371g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8968w(C8956k c8956k, Function0 function0, androidx.compose.ui.e eVar, C8950e c8950e, Function1 function1, int i11) {
        super(2);
        this.f81366b = c8956k;
        this.f81367c = function0;
        this.f81368d = eVar;
        this.f81369e = c8950e;
        this.f81370f = (AbstractC7737t) function1;
        this.f81371g = i11;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f81371g | 1);
        ?? r42 = this.f81370f;
        androidx.compose.ui.e eVar = this.f81368d;
        C8969x.d(this.f81366b, this.f81367c, eVar, this.f81369e, r42, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
