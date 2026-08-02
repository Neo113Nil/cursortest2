package v00;

import L3.m;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f101610b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(f fVar) {
        super(0);
        this.f101610b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = this.f101610b.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        new Thread(new m(context, 6)).start();
        return Unit.f71690a;
    }
}
