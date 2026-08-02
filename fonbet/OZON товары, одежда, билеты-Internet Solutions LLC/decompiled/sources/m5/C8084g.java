package m5;

import B1.InterfaceC2547p;
import S0.InterfaceC3967k;
import coil.compose.AsyncImagePainter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: m5.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8084g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f74456b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f74457c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<AsyncImagePainter.State, AsyncImagePainter.State> f74458d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2547p.a.c f74459e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f74460f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8084g(Object obj, androidx.compose.ui.e eVar, Function1 function1, e1.d dVar, InterfaceC2547p.a.c cVar, int i11) {
        super(2);
        this.f74456b = obj;
        this.f74457c = eVar;
        this.f74458d = function1;
        this.f74459e = cVar;
        this.f74460f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int i11 = this.f74460f | 1;
        InterfaceC2547p.a.c cVar = this.f74459e;
        C8085h.a(this.f74456b, this.f74457c, cVar, interfaceC3967k, i11);
        return Unit.f71690a;
    }
}
