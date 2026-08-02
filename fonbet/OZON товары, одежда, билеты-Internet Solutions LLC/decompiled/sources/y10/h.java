package y10;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class h extends AbstractC7737t implements Function1<Bitmap, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f105922b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f105923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, long j11) {
        super(1);
        this.f105922b = iVar;
        this.f105923c = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        long j11;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        Bitmap bitmap2 = bitmap;
        Intrinsics.checkNotNullParameter(bitmap2, "bitmap");
        i iVar = this.f105922b;
        j11 = iVar.f105934k;
        if (j11 == this.f105923c) {
            imageView = iVar.f105929f;
            imageView.setImageBitmap(bitmap2);
            imageView2 = iVar.f105929f;
            imageView2.setVisibility(0);
            imageView3 = iVar.f105929f;
            imageView3.addOnLayoutChangeListener(new g(iVar));
        }
        return Unit.f71690a;
    }
}
