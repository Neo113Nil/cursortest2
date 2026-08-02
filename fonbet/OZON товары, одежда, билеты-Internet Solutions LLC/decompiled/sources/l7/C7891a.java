package l7;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.c;
import i7.C7017a;
import n7.C8448a;
import s7.C9619n;
import s7.C9621p;

/* renamed from: l7.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7891a extends AppCompatCheckBox {

    /* renamed from: h, reason: collision with root package name */
    private static final int[][] f72933h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f72934e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f72935f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f72936g;

    public C7891a(Context context, AttributeSet attributeSet) {
        super(B7.a.a(context, attributeSet, ru.ozon.app.android.R.attr.checkboxStyle, ru.ozon.app.android.R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, ru.ozon.app.android.R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray e11 = C9619n.e(context2, attributeSet, C7017a.f65959y, ru.ozon.app.android.R.attr.checkboxStyle, ru.ozon.app.android.R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        if (e11.hasValue(0)) {
            c.c(this, v7.c.a(context2, e11, 0));
        }
        this.f72935f = e11.getBoolean(2, false);
        this.f72936g = e11.getBoolean(1, true);
        e11.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f72935f && c.b(this) == null) {
            this.f72935f = true;
            if (this.f72934e == null) {
                int b11 = C8448a.b(ru.ozon.app.android.R.attr.colorControlActivated, this);
                int b12 = C8448a.b(ru.ozon.app.android.R.attr.colorSurface, this);
                int b13 = C8448a.b(ru.ozon.app.android.R.attr.colorOnSurface, this);
                this.f72934e = new ColorStateList(f72933h, new int[]{C8448a.d(1.0f, b12, b11), C8448a.d(0.54f, b12, b13), C8448a.d(0.38f, b12, b13), C8448a.d(0.38f, b12, b13)});
            }
            c.c(this, this.f72934e);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable a11;
        if (!this.f72936g || !TextUtils.isEmpty(getText()) || (a11 = c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a11.getIntrinsicWidth()) / 2) * (C9621p.d(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a11.getBounds();
            androidx.core.graphics.drawable.a.g(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }
}
