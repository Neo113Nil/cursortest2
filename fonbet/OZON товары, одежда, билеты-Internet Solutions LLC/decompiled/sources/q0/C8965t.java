package q0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: q0.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8965t extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8956k f81356b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f81357c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f81358d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f81359e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f81360f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8965t(C8956k c8956k, Function0 function0, androidx.compose.ui.e eVar, Function1 function1, int i11) {
        super(2);
        this.f81356b = c8956k;
        this.f81357c = function0;
        this.f81358d = eVar;
        this.f81359e = (AbstractC7737t) function1;
        this.f81360f = i11;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f81360f | 1);
        androidx.compose.ui.e eVar = this.f81358d;
        ?? r32 = this.f81359e;
        C8969x.c(this.f81356b, this.f81357c, eVar, r32, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
