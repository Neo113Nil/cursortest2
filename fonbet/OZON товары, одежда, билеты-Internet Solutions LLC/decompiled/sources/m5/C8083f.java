package m5;

import B1.InterfaceC2547p;
import S0.InterfaceC3967k;
import coil.compose.AsyncImagePainter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: m5.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8083f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f74451b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f74452c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<AsyncImagePainter.State.Loading, Unit> f74453d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<AsyncImagePainter.State.Success, Unit> f74454e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC2547p.a.b f74455f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8083f(String str, androidx.compose.ui.e eVar, Function1 function1, Function1 function12, e1.d dVar, InterfaceC2547p.a.b bVar, int i11) {
        super(2);
        this.f74451b = str;
        this.f74452c = eVar;
        this.f74453d = function1;
        this.f74454e = function12;
        this.f74455f = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        InterfaceC2547p.a.b bVar = this.f74455f;
        C8085h.b(this.f74451b, this.f74452c, this.f74453d, this.f74454e, bVar, interfaceC3967k, 49);
        return Unit.f71690a;
    }
}
