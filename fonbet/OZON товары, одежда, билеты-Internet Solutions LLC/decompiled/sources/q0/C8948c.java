package q0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: q0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8948c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8960o f81297b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f81298c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f81299d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e.a f81300e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f81301f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f81302g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f81303h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f81304i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8948c(C8960o c8960o, Function0 function0, Function1 function1, e.a aVar, boolean z11, C4912a c4912a, int i11, int i12) {
        super(2);
        this.f81297b = c8960o;
        this.f81298c = function0;
        this.f81299d = (AbstractC7737t) function1;
        this.f81300e = aVar;
        this.f81301f = z11;
        this.f81302g = c4912a;
        this.f81303h = i11;
        this.f81304i = i12;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f81303h | 1);
        C4912a c4912a = this.f81302g;
        ?? r22 = this.f81299d;
        e.a aVar = this.f81300e;
        C8949d.b(this.f81297b, this.f81298c, r22, aVar, this.f81301f, c4912a, interfaceC3967k, e11, this.f81304i);
        return Unit.f71690a;
    }
}
