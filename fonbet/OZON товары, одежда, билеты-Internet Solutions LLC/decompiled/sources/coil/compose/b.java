package coil.compose;

import B1.InterfaceC2547p;
import S0.InterfaceC3967k;
import coil.compose.AsyncImagePainter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f57261b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l5.g f57262c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f57263d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f57264e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<AsyncImagePainter.State, Unit> f57265f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e1.d f57266g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ InterfaceC2547p f57267h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f57268i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f57269j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    b(Object obj, l5.g gVar, androidx.compose.ui.e eVar, Function1 function1, Function1 function12, e1.d dVar, InterfaceC2547p interfaceC2547p, int i11, int i12) {
        super(2);
        this.f57261b = obj;
        this.f57262c = gVar;
        this.f57263d = eVar;
        this.f57264e = (AbstractC7737t) function1;
        this.f57265f = function12;
        this.f57266g = dVar;
        this.f57267h = interfaceC2547p;
        this.f57268i = i11;
        this.f57269j = i12;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int i11 = this.f57268i | 1;
        l5.g gVar = this.f57262c;
        ?? r32 = this.f57264e;
        Function1<AsyncImagePainter.State, Unit> function1 = this.f57265f;
        e1.d dVar = this.f57266g;
        InterfaceC2547p interfaceC2547p = this.f57267h;
        e.a(this.f57261b, gVar, this.f57263d, r32, function1, dVar, interfaceC2547p, interfaceC3967k, i11, this.f57269j);
        return Unit.f71690a;
    }
}
