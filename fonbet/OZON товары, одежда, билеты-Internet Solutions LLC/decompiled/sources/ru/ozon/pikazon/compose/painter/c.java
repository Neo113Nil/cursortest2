package ru.ozon.pikazon.compose.painter;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pikazon.request.target.CustomTarget;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function1<CustomTarget.Result, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PikazonImagePainter f97667b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(PikazonImagePainter pikazonImagePainter) {
        super(1);
        this.f97667b = pikazonImagePainter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CustomTarget.Result result) {
        CustomTarget.Result result2 = result;
        Intrinsics.checkNotNullParameter(result2, "result");
        CustomTarget.Result.Success success = (CustomTarget.Result.Success) result2;
        Drawable drawable = (Drawable) success.getResource();
        PikazonImagePainter pikazonImagePainter = this.f97667b;
        pikazonImagePainter.n(new PikazonImagePainter.State.Success(PikazonImagePainter.f(pikazonImagePainter, drawable), success));
        return Unit.f71690a;
    }
}
