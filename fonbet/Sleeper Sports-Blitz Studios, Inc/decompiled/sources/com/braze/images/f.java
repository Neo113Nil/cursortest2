package com.braze.images;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeImageUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class f implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeViewBounds f552a;
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ Bitmap c;

    public f(BrazeViewBounds brazeViewBounds, ImageView imageView, Bitmap bitmap) {
        this.f552a = brazeViewBounds;
        this.b = imageView;
        this.c = bitmap;
    }

    public static final void a(Bitmap bitmap, ImageView imageView) {
        BrazeImageUtils.resizeImageViewToBitmapDimensions(bitmap, imageView);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (this.f552a == BrazeViewBounds.BASE_CARD_VIEW) {
            final ImageView imageView = this.b;
            final Bitmap bitmap = this.c;
            imageView.post(new Runnable() { // from class: com.braze.images.f$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    f.a(bitmap, imageView);
                }
            });
        }
        v.removeOnLayoutChangeListener(this);
    }
}
