package gd0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import zc0.C11092g;

/* renamed from: gd0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6717a extends AbstractC7737t implements Function1<C11092g.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f64255b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6717a(e eVar) {
        super(1);
        this.f64255b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C11092g.a aVar) {
        C11092g.a it = aVar;
        Intrinsics.checkNotNullParameter(it, "it");
        e.t(this.f64255b).k0(it);
        return Unit.f71690a;
    }
}
