package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.k;
import n.AbstractC5596a;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17254a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f17255b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f17256c;

    public a0(Context context, TypedArray typedArray) {
        this.f17254a = context;
        this.f17255b = typedArray;
    }

    public static a0 t(Context context, int i10, int[] iArr) {
        return new a0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static a0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new a0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static a0 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new a0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f17255b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f17255b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList a10;
        return (!this.f17255b.hasValue(i10) || (resourceId = this.f17255b.getResourceId(i10, 0)) == 0 || (a10 = AbstractC5596a.a(this.f17254a, resourceId)) == null) ? this.f17255b.getColorStateList(i10) : a10;
    }

    public float d(int i10, float f10) {
        return this.f17255b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f17255b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f17255b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f17255b.hasValue(i10) || (resourceId = this.f17255b.getResourceId(i10, 0)) == 0) ? this.f17255b.getDrawable(i10) : AbstractC5596a.b(this.f17254a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f17255b.hasValue(i10) || (resourceId = this.f17255b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C2053h.b().d(this.f17254a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f17255b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, k.e eVar) {
        int resourceId = this.f17255b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f17256c == null) {
            this.f17256c = new TypedValue();
        }
        return androidx.core.content.res.k.i(this.f17254a, resourceId, this.f17256c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f17255b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f17255b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f17255b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f17255b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f17255b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f17255b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f17255b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f17255b;
    }

    public boolean s(int i10) {
        return this.f17255b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f17255b.peekValue(i10);
    }

    public void x() {
        this.f17255b.recycle();
    }
}
