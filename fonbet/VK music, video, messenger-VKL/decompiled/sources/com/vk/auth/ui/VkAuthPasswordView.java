package com.vk.auth.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.vk.auth.common.R$styleable;
import com.vk.auth.ui.VkAuthPasswordView;
import com.vk.core.view.VkCheckableButton;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.e3m;
import xsna.f4m;
import xsna.gqe0;
import xsna.hnj;
import xsna.iut0;
import xsna.izs;
import xsna.krv0;
import xsna.m33;
import xsna.naj;
import xsna.rcu0;
import xsna.scu0;

/* compiled from: VkAuthPasswordView.kt */
/* loaded from: classes15.dex */
public class VkAuthPasswordView extends FrameLayout {
    public static final int i = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 44);
    public final LinkedHashSet b;
    public final EditText c;
    public final VkCheckableButton d;
    public final AppCompatImageButton e;
    public final LinearLayout f;
    public final ColorDrawable g;
    public final Drawable h;

    public VkAuthPasswordView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        Drawable drawable;
        Drawable drawable2;
        ColorStateList valueOf = ColorStateList.valueOf(krv0.m(R.attr.vk_ui_icon_secondary, getContext()));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.b = linkedHashSet;
        this.g = new ColorDrawable();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(6, R.id.vk_password);
            String string = obtainStyledAttributes.getString(5);
            Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
            this.h = drawable3;
            int resourceId2 = obtainStyledAttributes.getResourceId(8, R.layout.vk_auth_password_edittext);
            int resourceId3 = obtainStyledAttributes.getResourceId(2, R.id.vk_action_button);
            Drawable drawable4 = obtainStyledAttributes.getDrawable(3);
            String string2 = obtainStyledAttributes.getString(1);
            String string3 = obtainStyledAttributes.getString(10);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(9, i);
            int i2 = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
            EditText editText = (EditText) LayoutInflater.from(getContext()).inflate(resourceId2, (ViewGroup) this, false);
            this.c = editText;
            editText.setId(resourceId);
            editText.setHint(string);
            if (i2 != 0) {
                editText.setImeOptions(i2);
            }
            if (drawable3 != null) {
                editText.setBackground(drawable3);
            }
            addView(editText);
            VkCheckableButton vkCheckableButton = new VkCheckableButton(getContext(), null, 6);
            this.d = vkCheckableButton;
            vkCheckableButton.setOnClickListener(new naj(this, 9));
            Context context2 = getContext();
            e3m.a aVar = e3m.a;
            Drawable a = m33.a(R.drawable.vk_auth_password_toggle, context2);
            if (a == null || (drawable = a.mutate()) == null) {
                drawable = null;
            } else {
                drawable.setTintList(valueOf);
            }
            if (drawable != null) {
                vkCheckableButton.setImageDrawable(drawable);
            } else {
                f4m.j(vkCheckableButton);
            }
            vkCheckableButton.setContentDescription(string3);
            vkCheckableButton.setBackground(null);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
            vkCheckableButton.setScaleType(scaleType);
            vkCheckableButton.setId(R.id.vk_toggle_button);
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null);
            this.e = appCompatImageButton;
            appCompatImageButton.setId(resourceId3);
            if (drawable4 == null || (drawable2 = drawable4.mutate()) == null) {
                drawable2 = null;
            } else {
                drawable2.setTintList(valueOf);
            }
            if (drawable2 != null) {
                appCompatImageButton.setImageDrawable(drawable2);
            } else {
                f4m.j(appCompatImageButton);
            }
            appCompatImageButton.setContentDescription(string2);
            appCompatImageButton.setBackground(null);
            appCompatImageButton.setScaleType(scaleType);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.addView(vkCheckableButton, dimensionPixelSize, dimensionPixelSize);
            linearLayout.addView(appCompatImageButton, dimensionPixelSize, dimensionPixelSize);
            this.f = linearLayout;
            addView(linearLayout, new FrameLayout.LayoutParams(-2, -2, 8388629));
            setToggleVisible(false);
            vkCheckableButton.setChecked(!(editText.getTransformationMethod() instanceof PasswordTransformationMethod));
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.qcu0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    int i3 = VkAuthPasswordView.i;
                    VkAuthPasswordView.this.setToggleVisible(z);
                }
            });
            editText.addTextChangedListener(new rcu0(this));
            iut0.q(editText, new scu0(this));
            linkedHashSet.add(new gqe0(this, 28));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(boolean z) {
        EditText editText = this.c;
        int selectionEnd = editText.getSelectionEnd();
        if (editText.getTransformationMethod() instanceof PasswordTransformationMethod) {
            editText.setTransformationMethod(null);
        } else {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            editText.setSelection(selectionEnd);
        }
        if (z) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((izs) it.next()).invoke(Boolean.valueOf(this.d.e));
            }
        }
    }

    public final EditText getEditText() {
        return this.c;
    }

    public final String getPassword() {
        return this.c.getText().toString();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = this.f.getMeasuredWidth();
        ColorDrawable colorDrawable = this.g;
        colorDrawable.setBounds(0, 0, measuredWidth, 1);
        this.c.setCompoundDrawablesRelative(null, null, colorDrawable, null);
    }

    public final void setPasswordBackgroundId(Integer num) {
        Drawable drawable;
        if (num == null || (drawable = m33.a(num.intValue(), getContext())) == null) {
            drawable = this.h;
        }
        if (drawable != null) {
            this.c.setBackground(drawable);
        }
    }

    public final void setPasswordEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        this.c.setOnEditorActionListener(onEditorActionListener);
    }

    public final void setPasswordTransformationEnabled(boolean z) {
        VkCheckableButton vkCheckableButton = this.d;
        vkCheckableButton.setChecked(!z);
        vkCheckableButton.jumpDrawablesToCurrentState();
        if (z == (this.c.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            a(false);
        }
    }

    public final void setToggleVisible(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }
}
