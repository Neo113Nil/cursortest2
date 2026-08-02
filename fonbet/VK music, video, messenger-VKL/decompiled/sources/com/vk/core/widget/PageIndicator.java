package com.vk.core.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import com.vk.design.ui.themehelper.R$styleable;
import xsna.ir;

/* loaded from: classes17.dex */
public class PageIndicator extends View {
    public static final /* synthetic */ int c = 0;

    @NonNull
    public final e b;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;
        public int c;
        public int d;
        public int e;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.b = 0;
                savedState.c = 0;
                savedState.d = 0;
                savedState.e = 0;
                savedState.b = parcel.readInt();
                savedState.c = parcel.readInt();
                savedState.d = parcel.readInt();
                savedState.e = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
        }
    }

    public class a extends Property<d.a, Integer> {
        @Override // android.util.Property
        public final Integer get(d.a aVar) {
            return Integer.valueOf(aVar.a);
        }

        @Override // android.util.Property
        public final void set(d.a aVar, Integer num) {
            d.a aVar2 = aVar;
            aVar2.a = num.intValue();
            d.this.invalidateSelf();
        }
    }

    public class b extends Property<d.a, Integer> {
        @Override // android.util.Property
        public final Integer get(d.a aVar) {
            return Integer.valueOf(aVar.a);
        }

        @Override // android.util.Property
        public final void set(d.a aVar, Integer num) {
            d.a aVar2 = aVar;
            aVar2.b = num.intValue();
            d.this.invalidateSelf();
        }
    }

    public class c extends Property<d.a, Integer> {
        @Override // android.util.Property
        public final Integer get(d.a aVar) {
            return Integer.valueOf(aVar.c);
        }

        @Override // android.util.Property
        public final void set(d.a aVar, Integer num) {
            d.a aVar2 = aVar;
            aVar2.c = num.intValue();
            d.this.invalidateSelf();
        }
    }

    public static class d extends e {
        public final Paint e;
        public final Path f;
        public final Path g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;
        public final int n;
        public int o;
        public int p;
        public int q;
        public final int r;
        public a[] s;
        public a t;
        public a u;

        public class a {
            public int a;
            public int b;
            public int c;

            public a(int i, int i2, int i3) {
                this.a = i;
                d.this.invalidateSelf();
                this.b = i2;
                d.this.invalidateSelf();
                this.c = i3;
                d.this.invalidateSelf();
            }
        }

        public d(@NonNull Context context, @NonNull AttributeSet attributeSet) {
            Paint paint = new Paint();
            this.e = paint;
            Resources resources = context.getResources();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.k);
            int i = PageIndicator.c;
            this.h = obtainStyledAttributes.getDimensionPixelSize(7, (int) TypedValue.applyDimension(1, 4, resources.getDisplayMetrics()));
            this.i = obtainStyledAttributes.getDimensionPixelSize(8, (int) TypedValue.applyDimension(1, 3, resources.getDisplayMetrics()));
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(17, (int) TypedValue.applyDimension(1, 5, resources.getDisplayMetrics()));
            this.j = dimensionPixelSize;
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(16, (int) TypedValue.applyDimension(1, 7, resources.getDisplayMetrics()));
            this.k = dimensionPixelSize2;
            this.l = obtainStyledAttributes.getDimensionPixelSize(14, (int) TypedValue.applyDimension(1, 11, resources.getDisplayMetrics()));
            this.m = obtainStyledAttributes.getDimensionPixelSize(15, (int) TypedValue.applyDimension(1, 9, resources.getDisplayMetrics()));
            this.n = obtainStyledAttributes.getInteger(5, 5);
            this.o = obtainStyledAttributes.getColor(2, -1);
            this.p = obtainStyledAttributes.getColor(1, 1728053247);
            obtainStyledAttributes.getInteger(3, 200);
            obtainStyledAttributes.getInteger(4, 0);
            this.r = obtainStyledAttributes.getDimensionPixelSize(19, 0);
            this.q = obtainStyledAttributes.getInteger(0, 255);
            float dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(11, 0);
            float dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            float dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(13, 0);
            int color = obtainStyledAttributes.getColor(10, 0);
            obtainStyledAttributes.recycle();
            Path path = new Path();
            this.g = path;
            float f = dimensionPixelSize;
            path.moveTo(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f2 = (-dimensionPixelSize2) / 2;
            path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
            float f3 = dimensionPixelSize2 / 2;
            path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
            path.close();
            Path path2 = new Path();
            this.f = path2;
            path2.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path2.lineTo(f, f2);
            path2.lineTo(f, f3);
            path2.close();
            e();
            paint.setAntiAlias(true);
            if (color != 0) {
                paint.setShadowLayer(dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5, color);
            }
        }

        @Override // com.vk.core.widget.PageIndicator.e
        public final void a(int i) {
            this.q = i;
            e();
            invalidateSelf();
        }

        @Override // com.vk.core.widget.PageIndicator.e
        public final void b(int i) {
            this.p = i;
            e();
            invalidateSelf();
        }

        @Override // com.vk.core.widget.PageIndicator.e
        public final void c(int i) {
            this.o = i;
            e();
            invalidateSelf();
        }

        @Override // com.vk.core.widget.PageIndicator.e
        public final void d(int i) {
            int i2;
            int i3 = 0;
            if (i <= 0) {
                i = 0;
            }
            this.c = i;
            int i4 = this.d;
            if (i4 <= 0) {
                i4 = 0;
            }
            if (i4 >= i) {
                i4 = i - 1;
            }
            int i5 = this.b;
            if (i5 < 0) {
                i5 = 0;
            }
            int i6 = this.n;
            this.a = i6;
            int i7 = i5 + i6;
            if (i7 > i) {
                i5 = i - i6;
                if (i5 <= 0) {
                    i5 = 0;
                }
            } else if (i4 > i7 - 1) {
                i5 = (i4 - i6) + 1;
            } else if (i4 < i5) {
                i5 = i4;
            }
            int min = Math.min(i6, i);
            int min2 = Math.min(i4 - i5, min - 1);
            while (i3 < min) {
                a aVar = this.s[i3];
                aVar.b = i3 == min2 ? this.h : this.i;
                aVar.a = i3 == min2 ? this.o : this.p;
                int i8 = 255;
                if (i3 != min2 && (i2 = this.q) != 0) {
                    i8 = i2;
                }
                aVar.c = i8;
                a aVar2 = this.t;
                int i9 = this.p;
                aVar2.a = i9;
                this.u.a = i9;
                i3++;
            }
            this.d = i4;
            this.b = i5;
            invalidateSelf();
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(@NonNull Canvas canvas) {
            canvas.save();
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getBounds().centerY());
            int i = this.b;
            int i2 = this.d;
            int i3 = this.n;
            Paint paint = this.e;
            if (i == i2 && i > 0 && this.c >= i3) {
                paint.setColor(this.u.a);
                canvas.drawPath(this.f, paint);
            }
            int i4 = this.c;
            int i5 = this.l;
            if (i4 < i3) {
                canvas.translate(((i3 - i4) * i5) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            int i6 = this.j;
            int i7 = this.m;
            canvas.translate(i6 + i7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            int min = Math.min(i3, this.c);
            for (int i8 = 0; i8 < min; i8++) {
                paint.setColor(this.s[i8].a);
                paint.setAlpha(this.s[i8].c);
                canvas.drawCircle(i5 * i8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.s[i8].b, paint);
            }
            int i9 = this.b;
            int i10 = this.d;
            if (i10 == (this.a + i9) - 1) {
                int i11 = this.c;
                if (i10 < i11 - 1 && i11 >= i3) {
                    canvas.translate(ir.b(i3, 1, i5, i7), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    paint.setColor(this.t.a);
                    canvas.drawPath(this.g, paint);
                }
            }
            canvas.restore();
        }

        public final void e() {
            a aVar;
            int i = this.n;
            this.s = new a[i];
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    this.t = new a(0, this.p, 255);
                    this.u = new a(0, this.p, 255);
                    return;
                }
                a[] aVarArr = this.s;
                if (i2 == 0) {
                    aVar = new a(this.o, this.h, 255);
                } else {
                    int i3 = this.p;
                    int i4 = this.q;
                    aVar = new a(i3, this.i, i4 != 0 ? i4 : 255);
                }
                aVarArr[i2] = aVar;
                i2++;
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final int getMinimumHeight() {
            int[] iArr = {this.h * 2, this.i * 2, this.k};
            int i = PageIndicator.c;
            int i2 = Integer.MIN_VALUE;
            for (int i3 = 0; i3 < 3; i3++) {
                i2 = Math.max(i2, iArr[i3]);
            }
            return (this.r * 2) + i2;
        }

        @Override // android.graphics.drawable.Drawable
        public final int getMinimumWidth() {
            return (this.j * 2) + (this.m * 2) + ((this.n - 1) * this.l);
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
            this.e.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
            this.e.setColorFilter(colorFilter);
        }
    }

    public static abstract class e extends Drawable {
        public int a = 0;
        public int b = 0;
        public int c = 0;
        public int d = 0;

        public abstract void a(int i);

        public abstract void b(int i);

        public abstract void c(int i);

        public abstract void d(int i);
    }

    static {
        new a(Integer.class, "color");
        new b(Integer.class, "size");
        new c(Integer.class, "alpha");
    }

    public PageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(1, null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.k);
        int i = 0;
        if (obtainStyledAttributes != null) {
            i = obtainStyledAttributes.getInt(18, 0);
            obtainStyledAttributes.recycle();
        }
        e dVar = i != 1 ? new d(context, attributeSet) : new f(context, attributeSet);
        setBackground(dVar);
        this.b = dVar;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(getSuggestedMinimumWidth(), getSuggestedMinimumHeight());
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.b;
        e eVar = this.b;
        eVar.a = i;
        eVar.b = savedState.c;
        int i2 = savedState.d;
        eVar.c = i2;
        eVar.d = savedState.e;
        setCountOfPages(i2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.b = 0;
        savedState.c = 0;
        savedState.d = 0;
        savedState.e = 0;
        e eVar = this.b;
        savedState.b = eVar.a;
        savedState.c = eVar.b;
        savedState.d = eVar.c;
        savedState.e = eVar.d;
        return savedState;
    }

    public void setAlphaNormal(int i) {
        this.b.a(i);
    }

    public void setColorNormal(int i) {
        this.b.b(i);
    }

    public void setColorSelected(int i) {
        this.b.c(i);
    }

    public void setCountOfPages(int i) {
        this.b.d(i);
    }

    public static class f extends e {
        public final int e;
        public final Paint f = new Paint();
        public final int g;
        public final Drawable h;
        public final Drawable i;

        public f(@NonNull Context context, @NonNull AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.k);
            this.h = obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(9);
            this.i = drawable;
            this.e = obtainStyledAttributes.getDimensionPixelSize(19, 0);
            this.g = drawable.getIntrinsicHeight() / 2;
            obtainStyledAttributes.recycle();
        }

        @Override // com.vk.core.widget.PageIndicator.e
        public final void d(int i) {
            this.c = i;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(@NonNull Canvas canvas) {
            canvas.save();
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getBounds().centerY());
            for (int i = 0; i < this.c; i++) {
                int i2 = this.d;
                int i3 = this.g;
                Drawable drawable = this.h;
                if (i == i2) {
                    Drawable drawable2 = this.i;
                    drawable2.setBounds(drawable.getIntrinsicWidth() * i, -i3, drawable2.getIntrinsicWidth() * (i + 1), i3);
                    drawable2.draw(canvas);
                } else {
                    drawable.setBounds(drawable.getIntrinsicWidth() * i, -i3, drawable.getIntrinsicWidth() * (i + 1), i3);
                    drawable.draw(canvas);
                }
            }
            canvas.restore();
        }

        @Override // android.graphics.drawable.Drawable
        public final int getIntrinsicHeight() {
            return this.h.getIntrinsicHeight() + this.e;
        }

        @Override // android.graphics.drawable.Drawable
        public final int getIntrinsicWidth() {
            return this.h.getIntrinsicWidth() * this.c;
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
            this.f.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
            this.f.setColorFilter(colorFilter);
        }

        @Override // com.vk.core.widget.PageIndicator.e
        public final void a(int i) {
        }

        @Override // com.vk.core.widget.PageIndicator.e
        public final void b(int i) {
        }

        @Override // com.vk.core.widget.PageIndicator.e
        public final void c(int i) {
        }
    }
}
