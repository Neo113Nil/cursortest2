package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f764a;

    /* renamed from: b, reason: collision with root package name */
    public a4 f765b;

    /* renamed from: c, reason: collision with root package name */
    public int f766c = 0;

    public h0(ImageView imageView) {
        this.f764a = imageView;
    }

    public final void a() {
        a4 a4Var;
        ImageView imageView = this.f764a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            z1.a(drawable);
        }
        if (drawable == null || (a4Var = this.f765b) == null) {
            return;
        }
        b0.e(drawable, a4Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i5) {
        int resourceId;
        ImageView imageView = this.f764a;
        Context context = imageView.getContext();
        int[] iArr = i.a.f10835f;
        c4 f6 = c4.f(context, attributeSet, iArr, i5, 0);
        TypedArray typedArray = f6.f722b;
        androidx.core.view.z0.n(imageView, imageView.getContext(), iArr, attributeSet, f6.f722b, i5);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = h8.b.n(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                z1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(f6.a(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(z1.c(typedArray.getInt(3, -1), null));
            }
            f6.g();
        } catch (Throwable th2) {
            f6.g();
            throw th2;
        }
    }

    public final void c(int i5) {
        ImageView imageView = this.f764a;
        if (i5 != 0) {
            Drawable n9 = h8.b.n(imageView.getContext(), i5);
            if (n9 != null) {
                z1.a(n9);
            }
            imageView.setImageDrawable(n9);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
