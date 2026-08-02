package v10;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class i extends AbstractC7737t implements Function1<Bitmap, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Bitmap, Unit> f101674b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    i(Function1<? super Bitmap, Unit> function1) {
        super(1);
        this.f101674b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            this.f101674b.invoke(bitmap2);
        }
        return Unit.f71690a;
    }
}
