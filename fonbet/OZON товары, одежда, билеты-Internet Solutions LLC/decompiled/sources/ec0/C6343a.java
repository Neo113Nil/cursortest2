package ec0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.nativeauth.data.models.b;

/* renamed from: ec0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6343a extends AbstractC7737t implements Function1<b.InterfaceC2133b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f62109b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6343a(h hVar) {
        super(1);
        this.f62109b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(b.InterfaceC2133b interfaceC2133b) {
        b.InterfaceC2133b hintButton = interfaceC2133b;
        Intrinsics.checkNotNullParameter(hintButton, "hintButton");
        h.u(this.f62109b).d1(hintButton);
        return Unit.f71690a;
    }
}
