package y10;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class e extends AbstractC7737t implements Function1<Bitmap, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f105916b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f105917c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f105918d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f105919e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(i iVar, long j11, int i11, int i12) {
        super(1);
        this.f105916b = iVar;
        this.f105917c = j11;
        this.f105918d = i11;
        this.f105919e = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        long j11;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        Bitmap bitmap2 = bitmap;
        Intrinsics.checkNotNullParameter(bitmap2, "bitmap");
        i iVar = this.f105916b;
        j11 = iVar.f105934k;
        if (j11 == this.f105917c) {
            imageView = iVar.f105929f;
            imageView.setLayoutParams(new CoordinatorLayout.f(this.f105918d, this.f105919e));
            imageView2 = iVar.f105929f;
            imageView2.setImageBitmap(bitmap2);
            imageView3 = iVar.f105929f;
            imageView3.setVisibility(0);
            imageView4 = iVar.f105929f;
            imageView4.addOnLayoutChangeListener(new d(iVar));
        }
        return Unit.f71690a;
    }
}
