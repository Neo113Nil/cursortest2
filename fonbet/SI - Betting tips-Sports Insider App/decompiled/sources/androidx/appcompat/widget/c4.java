package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f721a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f722b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f723c;

    public c4(Context context, TypedArray typedArray) {
        this.f721a = context;
        this.f722b = typedArray;
    }

    public static c4 e(Context context, AttributeSet attributeSet, int[] iArr) {
        return new c4(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static c4 f(Context context, AttributeSet attributeSet, int[] iArr, int i5, int i10) {
        return new c4(context, context.obtainStyledAttributes(attributeSet, iArr, i5, i10));
    }

    public final ColorStateList a(int i5) {
        int resourceId;
        ColorStateList c2;
        TypedArray typedArray = this.f722b;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0 || (c2 = d0.c.c(this.f721a, resourceId)) == null) ? typedArray.getColorStateList(i5) : c2;
    }

    public final Drawable b(int i5) {
        int resourceId;
        TypedArray typedArray = this.f722b;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0) ? typedArray.getDrawable(i5) : h8.b.n(this.f721a, resourceId);
    }

    public final Drawable c(int i5) {
        int resourceId;
        Drawable g10;
        if (!this.f722b.hasValue(i5) || (resourceId = this.f722b.getResourceId(i5, 0)) == 0) {
            return null;
        }
        b0 a7 = b0.a();
        Context context = this.f721a;
        synchronized (a7) {
            g10 = a7.f703a.g(context, resourceId, true);
        }
        return g10;
    }

    public final Typeface d(int i5, int i10, d1 d1Var) {
        int resourceId = this.f722b.getResourceId(i5, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f723c == null) {
            this.f723c = new TypedValue();
        }
        TypedValue typedValue = this.f723c;
        ThreadLocal threadLocal = f0.l.f9293a;
        Context context = this.f721a;
        if (context.isRestricted()) {
            return null;
        }
        return f0.l.c(context, resourceId, typedValue, i10, d1Var, true, false);
    }

    public final void g() {
        this.f722b.recycle();
    }
}
