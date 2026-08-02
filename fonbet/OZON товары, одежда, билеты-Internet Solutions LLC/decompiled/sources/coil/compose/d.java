package coil.compose;

import B1.InterfaceC2547p;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f57272b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AsyncImagePainter f57273c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e1.d f57274d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2547p f57275e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f57276f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(androidx.compose.ui.e eVar, AsyncImagePainter asyncImagePainter, e1.d dVar, InterfaceC2547p interfaceC2547p, int i11) {
        super(2);
        this.f57272b = eVar;
        this.f57273c = asyncImagePainter;
        this.f57274d = dVar;
        this.f57275e = interfaceC2547p;
        this.f57276f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int i11 = this.f57276f | 1;
        AsyncImagePainter asyncImagePainter = this.f57273c;
        e1.d dVar = this.f57274d;
        InterfaceC2547p interfaceC2547p = this.f57275e;
        e.c(this.f57272b, asyncImagePainter, dVar, interfaceC2547p, interfaceC3967k, i11);
        return Unit.f71690a;
    }
}
