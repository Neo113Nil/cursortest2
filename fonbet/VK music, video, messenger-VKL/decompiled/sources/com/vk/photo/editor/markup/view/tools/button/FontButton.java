package com.vk.photo.editor.markup.view.tools.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.photo.editor.markup.R$styleable;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.fyt0;
import xsna.iut0;
import xsna.jio0;

/* compiled from: FontButton.kt */
/* loaded from: classes4.dex */
public final class FontButton extends FrameLayout {
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public ButtonMode g;
    public jio0.a h;
    public boolean i;

    /* compiled from: FontButton.kt */
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

    public FontButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Typeface typeface;
        this.g = ButtonMode.Select;
        LayoutInflater.from(context).inflate(R.layout.internal_font_button, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.text);
        this.b = textView;
        this.c = (ImageView) findViewById(R.id.image_selected_inside_border);
        this.e = (ImageView) findViewById(R.id.image_outside_border);
        this.f = (ImageView) findViewById(R.id.image_inside_border);
        this.d = (ImageView) findViewById(R.id.image_selected_outside_border);
        jio0.a aVar = this.h;
        textView.setTypeface((aVar == null || (typeface = aVar.b) == null) ? Typeface.DEFAULT : typeface);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c, 0, 0);
        this.g = ButtonMode.values()[obtainStyledAttributes.getInteger(0, 0)];
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        int i = a.$EnumSwitchMapping$0[this.g.ordinal()];
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 2) {
            return "android.widget.Button";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final jio0.a getFontInfo() {
        return this.h;
    }

    public final ButtonMode getMode() {
        return this.g;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(isClickable());
        if (this.g == ButtonMode.Select) {
            accessibilityNodeInfo.setSelected(isSelected());
        }
    }

    public final void setBordersHided(boolean z) {
        this.i = z;
        ImageView imageView = this.f;
        if (!z) {
            setSelected(isSelected());
            imageView.setVisibility(0);
        } else {
            fyt0.h(this.c);
            fyt0.h(this.d);
            fyt0.h(this.e);
            fyt0.h(imageView);
        }
    }

    public final void setFontInfo(jio0.a aVar) {
        Typeface typeface;
        this.h = aVar;
        if (aVar == null || (typeface = aVar.b) == null) {
            typeface = Typeface.DEFAULT;
        }
        this.b.setTypeface(typeface);
        jio0.a aVar2 = this.h;
        String str = aVar2 != null ? aVar2.a : null;
        String string = str != null ? getResources().getString(R.string.font_button_typography_accessibility_description, str) : getResources().getString(R.string.font_button_typography_accessibility_default_description);
        int i = a.$EnumSwitchMapping$0[this.g.ordinal()];
        if (i == 1) {
            setContentDescription(string);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iut0.t(this, string);
        }
    }

    public final void setMode(ButtonMode buttonMode) {
        this.g = buttonMode;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (this.i) {
            return;
        }
        ImageView imageView = this.c;
        imageView.clearColorFilter();
        ImageView imageView2 = this.e;
        ImageView imageView3 = this.d;
        if (z) {
            imageView.setVisibility(0);
            imageView3.setVisibility(0);
            fyt0.h(imageView2);
        } else {
            fyt0.h(imageView);
            fyt0.h(imageView3);
            imageView2.setVisibility(0);
        }
    }
}
