package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.r1;
import com.vungle.ads.nativead.NativeVideoListener;
import defpackage.p2g;
import defpackage.w2g;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class e extends RelativeLayout {
    public final r1 a;
    public ImageView b;
    public NativeVideoListener c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, r1 r1Var) {
        super(context);
        context.getClass();
        r1Var.getClass();
        this.a = r1Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        addView(imageView);
    }

    public void a() {
        removeAllViews();
        try {
            p2g p2gVar = w2g.b;
            ImageView imageView = this.b;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
        ImageView imageView2 = this.b;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
    }

    @Nullable
    public final ImageView getImageView$vungle_ads_release() {
        return this.b;
    }

    @NotNull
    public final r1 getInternal() {
        return this.a;
    }

    @Nullable
    public final NativeVideoListener getNativeVideoListener() {
        return this.c;
    }

    public final void setImageView$vungle_ads_release(@Nullable ImageView imageView) {
        this.b = imageView;
    }

    public final void setNativeVideoListener(@Nullable NativeVideoListener nativeVideoListener) {
        this.c = nativeVideoListener;
    }

    public void a(Context context) {
        context.getClass();
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.a.b(this.b);
        requestLayout();
    }
}
