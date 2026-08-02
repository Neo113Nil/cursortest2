package kc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.nativeauth.data.models.b;

/* renamed from: kc0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7648f extends AbstractC7737t implements Function1<b.InterfaceC2133b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7645c f71330b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7648f(C7645c c7645c) {
        super(1);
        this.f71330b = c7645c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(b.InterfaceC2133b interfaceC2133b) {
        b.InterfaceC2133b hintButton = interfaceC2133b;
        Intrinsics.checkNotNullParameter(hintButton, "hintButton");
        this.f71330b.C().H1(hintButton);
        return Unit.f71690a;
    }
}
