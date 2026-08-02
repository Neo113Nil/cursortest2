package yl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yl0.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C10933r extends AbstractC7737t implements Function1<C10923h<Object>.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ IllegalStateException f106798b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10933r(IllegalStateException illegalStateException) {
        super(1);
        this.f106798b = illegalStateException;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C10923h<Object>.a aVar) {
        C10923h<Object>.a create = aVar;
        Intrinsics.checkNotNullParameter(create, "$this$create");
        create.a(this.f106798b);
        return Unit.f71690a;
    }
}
