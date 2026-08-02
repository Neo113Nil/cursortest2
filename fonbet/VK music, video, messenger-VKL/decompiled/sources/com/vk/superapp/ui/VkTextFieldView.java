package com.vk.superapp.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.brm0;
import xsna.en9;
import xsna.f4m;
import xsna.gzs;
import xsna.hnj;
import xsna.iah0;
import xsna.izs;
import xsna.krv0;
import xsna.rbe;
import xsna.s3q0;

/* compiled from: VkTextFieldView.kt */
/* loaded from: classes6.dex */
public final class VkTextFieldView extends LinearLayout {
    public static final int i = iah0.a(12);
    public static final int j = iah0.a(44);
    public final TextView b;
    public final EditText c;
    public final ImageView d;
    public final ImageView e;
    public final FrameLayout f;
    public izs<? super View, s3q0> g;
    public boolean h;

    public VkTextFieldView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.vk_text_field_view, (ViewGroup) this, true);
        EditText editText = (EditText) findViewById(R.id.text_field_edittext);
        this.c = editText;
        TextView textView = (TextView) findViewById(R.id.text_field_caption);
        this.b = textView;
        this.d = (ImageView) findViewById(R.id.text_field_left_icon);
        ImageView imageView = (ImageView) findViewById(R.id.text_field_right_icon);
        this.e = imageView;
        this.f = (FrameLayout) findViewById(R.id.text_field_container);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(0);
            string = string == null ? "" : string;
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string2 = obtainStyledAttributes.getString(4);
            string2 = string2 == null ? "" : string2;
            Drawable drawable = obtainStyledAttributes.getDrawable(9);
            int color = obtainStyledAttributes.getColor(11, -1);
            int i2 = obtainStyledAttributes.getInt(6, 0);
            int i3 = obtainStyledAttributes.getInt(7, -1);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(10, -1);
            int i4 = obtainStyledAttributes.getInt(5, 0);
            int i5 = obtainStyledAttributes.getInt(8, 0);
            boolean z = obtainStyledAttributes.getBoolean(3, false);
            String string3 = obtainStyledAttributes.getString(12);
            String str = string3 == null ? "" : string3;
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            obtainStyledAttributes.recycle();
            textView.setText(string);
            if (resourceId != -1) {
                textView.setTextAppearance(context, resourceId);
            }
            if (z) {
                f4m.j(textView);
            }
            editText.setHint(string2);
            ArrayList arrayList = new ArrayList();
            if (i3 != -1) {
                arrayList.add(new InputFilter.LengthFilter(i3));
            }
            editText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
            editText.setTextSize(16.0f);
            editText.setImeOptions(i4);
            if (i5 != 0) {
                editText.getNextFocusForwardId();
            }
            if (dimensionPixelSize != -1) {
                imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            }
            if (i2 == 0) {
                editText.setFocusable(false);
            } else if (i2 == 8192) {
                editText.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
                i2 |= 2;
            }
            if (dimensionPixelSize2 != 0) {
                setHeight(dimensionPixelSize2);
            }
            Typeface typeface = editText.getTypeface();
            editText.setInputType(i2);
            editText.setTypeface(typeface);
            imageView.setOnClickListener(new rbe(this, 10));
            a(drawable, Integer.valueOf(color));
            setValue(str);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(Drawable drawable, Integer num) {
        if (drawable != null) {
            drawable.mutate();
            if (num != null) {
                drawable.setTint(num.intValue());
            }
        }
        int i2 = drawable != null ? j : i;
        EditText editText = this.c;
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), i2, editText.getPaddingBottom());
        this.e.setImageDrawable(drawable);
    }

    public final int getCursorPosition() {
        return this.c.getSelectionStart();
    }

    public final View getKeyboardTargetView() {
        return this.c;
    }

    public final String getValue() {
        return this.c.getText().toString();
    }

    public final String getValueWithoutSpaces() {
        return brm0.y(this.c.getText().toString(), " ", "");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.h;
    }

    public final void setCaption(int i2) {
        this.b.setText(i2);
    }

    public final void setDistinctValue(String str) {
        EditText editText = this.c;
        if (str.equals(editText.getText().toString())) {
            return;
        }
        editText.setText(str);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f.setAlpha(z ? 1.0f : 0.4f);
        int i2 = z ? R.attr.vk_ui_text_secondary : R.attr.vk_ui_text_primary;
        EditText editText = this.c;
        editText.setHintTextColor(krv0.m(i2, editText.getContext()));
        editText.setFocusable(z);
        editText.setFocusableInTouchMode(z);
        editText.setClickable(z);
    }

    public final void setHeight(int i2) {
        FrameLayout frameLayout = this.f;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = i2;
        frameLayout.setLayoutParams(layoutParams);
    }

    public final void setHint(int i2) {
        this.c.setHint(i2);
    }

    public final void setIconClickListener(izs<? super View, s3q0> izsVar) {
        this.g = izsVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.h = true;
    }

    public final void setOnFieldClickListener(gzs<s3q0> gzsVar) {
        this.c.setOnClickListener(new en9(gzsVar, 13));
    }

    public final void setSelection(int i2) {
        this.c.setSelection(i2);
    }

    public final void setValue(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
