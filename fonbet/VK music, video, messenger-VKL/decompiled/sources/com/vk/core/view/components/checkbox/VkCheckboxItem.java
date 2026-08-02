package com.vk.core.view.components.checkbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.checkbox.VkCheckbox;
import com.vkontakte.android.R;
import xsna.f4m;
import xsna.izs;
import xsna.ocz;
import xsna.oq;
import xsna.s3q0;
import xsna.tlo0;
import xsna.v01;

/* compiled from: VkCheckboxItem.kt */
/* loaded from: classes17.dex */
public final class VkCheckboxItem extends ConstraintLayout implements Checkable {
    public static final /* synthetic */ int x = 0;
    public VkCheckbox.Type t;
    public final VkCheckbox u;
    public final TextView v;
    public final TextView w;

    /* compiled from: VkCheckboxItem.kt */
    public interface a {
        void b(boolean z);
    }

    public VkCheckboxItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.CheckBox";
    }

    public final VkCheckbox.State getCheckedState() {
        return this.u.getCheckedState();
    }

    public final izs<VkCheckbox.State, s3q0> getCheckedStateChangeListener() {
        return this.u.getCheckedStateChangeListener();
    }

    public final String getSubtitle() {
        return this.w.getText().toString();
    }

    public final String getTitle() {
        return this.v.getText().toString();
    }

    public final VkCheckbox.Type getType() {
        return this.t;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.u.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.u.setChecked(z);
    }

    public final void setCheckedState(VkCheckbox.State state) {
        this.u.setCheckedState(state);
    }

    public final void setCheckedStateChangeListener(izs<? super VkCheckbox.State, s3q0> izsVar) {
        this.u.setCheckedStateChangeListener(izsVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.u.setEnabled(z);
        this.v.setAlpha(z ? 1.0f : 0.64f);
        this.w.setAlpha(z ? 1.0f : 0.64f);
    }

    public final void setListener(a aVar) {
        this.u.setOnCheckedChangeListener(new ocz(aVar, this));
    }

    public final void setSubtitle(tlo0 tlo0Var) {
        CharSequence a2 = tlo0Var != null ? tlo0Var.a(getContext()) : null;
        TextView textView = this.w;
        textView.setText(a2);
        f4m.E(textView, !(a2 == null || a2.length() == 0));
    }

    public final void setTitle(tlo0 tlo0Var) {
        this.v.setText(tlo0Var != null ? tlo0Var.a(getContext()) : null);
    }

    public final void setType(VkCheckbox.Type type) {
        this.t = type;
        this.u.setType(type);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.u.toggle();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkCheckboxItem(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        VkCheckbox.Type type = VkCheckbox.Type.Unknown;
        this.t = type;
        LayoutInflater.from(context).inflate(R.layout.ds_internal_checkbox_item, this);
        this.u = (VkCheckbox) findViewById(R.id.checkbox);
        this.v = (TextView) findViewById(R.id.title);
        this.w = (TextView) findViewById(R.id.subtitle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.j, 0, 0);
        int integer = obtainStyledAttributes.getInteger(0, -1);
        String string = obtainStyledAttributes.getString(2);
        String string2 = obtainStyledAttributes.getString(1);
        setTitle(string != null ? oq.d(tlo0.Companion, string) : null);
        setSubtitle(string2 != null ? oq.d(tlo0.Companion, string2) : null);
        setType(integer != -1 ? (VkCheckbox.Type) VkCheckbox.Type.h().get(integer + 1) : type);
        setFocusable(true);
        setScreenReaderFocusable(true);
        setOnClickListener(new v01(this, 12));
        obtainStyledAttributes.recycle();
    }
}
