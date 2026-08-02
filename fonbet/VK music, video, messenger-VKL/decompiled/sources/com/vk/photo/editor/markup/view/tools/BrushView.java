package com.vk.photo.editor.markup.view.tools;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.vk.photo.editor.markup.R$styleable;
import xsna.asp;
import xsna.knj;
import xsna.n8g;
import xsna.zrp;

/* compiled from: BrushView.kt */
/* loaded from: classes4.dex */
public final class BrushView extends View {
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final boolean e;
    public a f;
    public final int g;
    public final int h;
    public final int i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BrushView.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Reset;
        public static final a Select;

        static {
            a aVar = new a("Select", 0);
            Select = aVar;
            a aVar2 = new a("Reset", 1);
            Reset = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public BrushView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = a.Reset;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(6, 0);
        this.e = obtainStyledAttributes.getBoolean(7, false);
        Drawable a2 = knj.a(resourceId, context);
        this.b = a2;
        Drawable a3 = knj.a(resourceId2, context);
        this.c = a3;
        Drawable a4 = knj.a(resourceId3, context);
        this.d = a4;
        int color = obtainStyledAttributes.getColor(2, n8g.l(-1, 102));
        this.g = color;
        this.h = obtainStyledAttributes.getColor(4, -1);
        int color2 = obtainStyledAttributes.getColor(5, n8g.l(-1, 102));
        this.i = color2;
        int color3 = obtainStyledAttributes.getColor(0, -1);
        b(a4, color2);
        b(a2, color);
        if (color3 != -1) {
            b(a3, color3);
        }
        obtainStyledAttributes.recycle();
    }

    public static void a(Drawable drawable, int i, int i2) {
        int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * (Math.min(drawable.getIntrinsicWidth(), i) / drawable.getIntrinsicWidth()));
        int i3 = (i2 / 2) - (intrinsicWidth / 2);
        int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * (Math.min(drawable.getIntrinsicHeight(), i) / drawable.getIntrinsicHeight()));
        int i4 = i - intrinsicHeight;
        drawable.setBounds(i3, i4, intrinsicWidth + i3, intrinsicHeight + i4);
    }

    public final void b(Drawable drawable, int i) {
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }
        invalidate();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.CheckBox";
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if ((!this.e || this.f != a.Reset) && (drawable = this.d) != null) {
            drawable.draw(canvas);
        }
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setSelected(this.f == a.Select);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.b;
        if (drawable != null) {
            a(drawable, i2, i);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            a(drawable2, i2, i);
        }
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            a(drawable3, i2, i);
        }
    }

    public final void setCapColor(int i) {
        this.f = a.Select;
        b(this.d, i);
        b(this.b, this.h);
    }
}
