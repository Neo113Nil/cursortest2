package coil.compose;

import B1.InterfaceC2547p;
import S0.InterfaceC3967k;
import coil.compose.AsyncImagePainter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f57252b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l5.g f57253c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f57254d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<AsyncImagePainter.State.Loading, Unit> f57255e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<AsyncImagePainter.State.Success, Unit> f57256f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e1.d f57257g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ InterfaceC2547p.a.b f57258h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f57259i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f57260j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(String str, l5.g gVar, androidx.compose.ui.e eVar, Function1 function1, Function1 function12, e1.d dVar, InterfaceC2547p.a.b bVar, int i11, int i12) {
        super(2);
        this.f57252b = str;
        this.f57253c = gVar;
        this.f57254d = eVar;
        this.f57255e = function1;
        this.f57256f = function12;
        this.f57257g = dVar;
        this.f57258h = bVar;
        this.f57259i = i11;
        this.f57260j = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int i11 = this.f57259i | 1;
        l5.g gVar = this.f57253c;
        e1.d dVar = this.f57257g;
        InterfaceC2547p.a.b bVar = this.f57258h;
        e.b(this.f57252b, gVar, this.f57254d, this.f57255e, this.f57256f, dVar, bVar, interfaceC3967k, i11, this.f57260j);
        return Unit.f71690a;
    }
}
