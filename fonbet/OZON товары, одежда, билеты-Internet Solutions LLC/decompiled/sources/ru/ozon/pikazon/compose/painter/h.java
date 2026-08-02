package ru.ozon.pikazon.compose.painter;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pikazon.request.target.CustomTarget;
import ze.u;

/* loaded from: classes7.dex */
final class h extends AbstractC7737t implements Function1<CustomTarget.Result, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u<CustomTarget.Result> f97683b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    h(u<? super CustomTarget.Result> uVar) {
        super(1);
        this.f97683b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CustomTarget.Result result) {
        CustomTarget.Result result2 = result;
        Intrinsics.checkNotNullParameter(result2, "result");
        this.f97683b.b(result2);
        return Unit.f71690a;
    }
}
