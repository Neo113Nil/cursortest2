package ld0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class w extends AbstractC7737t implements Function1<Ic0.b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f73238b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Jb0.i f73239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(x xVar, Jb0.i iVar) {
        super(1);
        this.f73238b = xVar;
        this.f73239c = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Ic0.b bVar) {
        Ic0.b it = bVar;
        Intrinsics.checkNotNullParameter(it, "it");
        x.I(this.f73238b, this.f73239c);
        return Unit.f71690a;
    }
}
