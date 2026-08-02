package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.ads.internal.util.a0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l extends FrameLayout {
    public ImageView a;
    public boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        context.getClass();
        a(context);
    }

    public final void a() {
        ImageView imageView;
        if (this.b) {
            return;
        }
        this.b = true;
        try {
            imageView = this.a;
        } catch (Exception e) {
            boolean z = u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("error msg: ");
            a.append(e.getLocalizedMessage());
            t.c("NativeAd", a.toString());
        }
        if (imageView == null) {
            Intrinsics.i("icon");
            throw null;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        ImageView imageView2 = this.a;
        if (imageView2 == null) {
            Intrinsics.i("icon");
            throw null;
        }
        imageView2.setImageDrawable(null);
        removeAllViews();
        if (getParent() != null) {
            ViewParent parent = getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(this);
        }
    }

    @NotNull
    public final ImageView getPrivacyIcon$vungle_ads_release() {
        ImageView imageView = this.a;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.i("icon");
        throw null;
    }

    public final void a(FrameLayout frameLayout, int i) {
        frameLayout.getClass();
        if (getParent() != null) {
            ViewParent parent = getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(this);
        }
        frameLayout.addView(this);
        Context context = getContext();
        context.getClass();
        int a = a0.a(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        if (i == 0) {
            layoutParams.gravity = 8388659;
        } else if (i == 1) {
            layoutParams.gravity = 8388661;
        } else if (i == 2) {
            layoutParams.gravity = 8388691;
        } else if (i != 3) {
            layoutParams.gravity = 8388661;
        } else {
            layoutParams.gravity = 8388693;
        }
        setLayoutParams(layoutParams);
        frameLayout.requestLayout();
    }

    public final void a(Context context) {
        this.a = new ImageView(context);
        int a = a0.a(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams);
            ImageView imageView2 = this.a;
            if (imageView2 != null) {
                addView(imageView2);
                return;
            } else {
                Intrinsics.i("icon");
                throw null;
            }
        }
        Intrinsics.i("icon");
        throw null;
    }
}
