package com.vk.photo.editor.markup.view.tools.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.photo.editor.markup.R$styleable;
import com.vk.photo.editor.markup.view.tools.PaintBackgroundView;
import com.vkontakte.android.R;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import xsna.fyt0;
import xsna.iut0;
import xsna.n8g;
import xsna.y8g;

/* compiled from: ColorButton.kt */
/* loaded from: classes4.dex */
public final class ColorButton extends FrameLayout {
    public final PaintBackgroundView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public ButtonMode f;
    public y8g g;

    /* compiled from: ColorButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonMode.values().length];
            try {
                iArr[ButtonMode.Select.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonMode.Open.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ColorButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = ButtonMode.Select;
        this.g = y8g.a.a;
        LayoutInflater.from(context).inflate(R.layout.internal_color_button, (ViewGroup) this, true);
        this.b = (PaintBackgroundView) findViewById(R.id.color);
        this.c = (ImageView) findViewById(R.id.image_selected_inside_border);
        this.e = (ImageView) findViewById(R.id.image_outside_border);
        this.d = (ImageView) findViewById(R.id.image_selected_outside_border);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        setMode(ButtonMode.values()[obtainStyledAttributes.getInteger(0, 0)]);
        obtainStyledAttributes.recycle();
        a();
    }

    public final void a() {
        Paint paint = this.b.getPaint();
        y8g y8gVar = this.g;
        getWidth();
        getHeight();
        if (y8gVar instanceof y8g.c) {
            paint.setColor(((y8g.c) y8gVar).a);
        } else {
            if (y8gVar instanceof y8g.b) {
                throw null;
            }
            paint.setColor(0);
            paint.setShader(null);
        }
        setSelected(isSelected());
        b();
    }

    public final void b() {
        int i = a.$EnumSwitchMapping$0[this.f.ordinal()];
        if (i == 1) {
            setContentDescription(getResources().getString(R.string.color_button_hex_accessibility_description, String.format("%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & this.g.a())}, 1))));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iut0.t(this, getResources().getString(R.string.color_selected_button_hex_accessibility_description, String.format("%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & this.g.a())}, 1))));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        int i = a.$EnumSwitchMapping$0[this.f.ordinal()];
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 2) {
            return "android.widget.Button";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final y8g getCurrentColor() {
        return this.g;
    }

    public final ButtonMode getMode() {
        return this.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(isClickable());
        if (this.f == ButtonMode.Select) {
            accessibilityNodeInfo.setSelected(isSelected());
        }
    }

    public final void setCurrentColor(y8g y8gVar) {
        this.g = y8gVar;
        a();
    }

    public final void setMode(ButtonMode buttonMode) {
        this.f = buttonMode;
        b();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        ImageView imageView = this.c;
        imageView.clearColorFilter();
        ImageView imageView2 = this.e;
        ImageView imageView3 = this.d;
        if (!z) {
            fyt0.h(imageView);
            fyt0.h(imageView3);
            imageView2.setVisibility(0);
        } else {
            imageView.setVisibility(0);
            imageView3.setVisibility(0);
            fyt0.h(imageView2);
            imageView.setColorFilter(new PorterDuffColorFilter(n8g.e(this.g.a(), -1) <= 1.5d ? -16777216 : -1, PorterDuff.Mode.MULTIPLY));
        }
    }
}
