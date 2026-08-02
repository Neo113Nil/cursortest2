package bo.app;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeImageUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q4 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeViewBounds f25940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f25941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f25942c;

    public q4(BrazeViewBounds brazeViewBounds, ImageView imageView, Bitmap bitmap) {
        this.f25940a = brazeViewBounds;
        this.f25941b = imageView;
        this.f25942c = bitmap;
    }

    public static final void a(Bitmap bitmap, ImageView imageView) {
        BrazeImageUtils.resizeImageViewToBitmapDimensions(bitmap, imageView);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Intrinsics.checkNotNullParameter(v10, "v");
        if (this.f25940a == BrazeViewBounds.BASE_CARD_VIEW) {
            final ImageView imageView = this.f25941b;
            final Bitmap bitmap = this.f25942c;
            imageView.post(new Runnable() { // from class: c3.G9
                @Override // java.lang.Runnable
                public final void run() {
                    bo.app.q4.a(bitmap, imageView);
                }
            });
        }
        v10.removeOnLayoutChangeListener(this);
    }
}
