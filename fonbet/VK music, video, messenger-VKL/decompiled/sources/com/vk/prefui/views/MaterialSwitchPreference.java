package com.vk.prefui.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.SwitchPreferenceCompat;
import com.vk.prefui.R$styleable;
import com.vkontakte.android.R;
import xsna.tyc0;

/* loaded from: classes5.dex */
public class MaterialSwitchPreference extends SwitchPreferenceCompat {
    public final a Y;
    public boolean Z;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Boolean valueOf = Boolean.valueOf(z);
            MaterialSwitchPreference materialSwitchPreference = MaterialSwitchPreference.this;
            if (materialSwitchPreference.a(valueOf)) {
                materialSwitchPreference.O(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public MaterialSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y = new a();
        this.Z = true;
        R(context, attributeSet);
        this.I = R.layout.switch_preference_widget;
    }

    public final void R(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
            try {
                this.Z = obtainStyledAttributes.getBoolean(0, true);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void s(tyc0 tyc0Var) {
        super.s(tyc0Var);
        KeyEvent.Callback findViewById = tyc0Var.itemView.findViewById(R.id.switchWidget);
        if (findViewById != null && (findViewById instanceof Checkable)) {
            boolean z = findViewById instanceof SwitchCompat;
            if (z) {
                ((SwitchCompat) findViewById).setOnCheckedChangeListener(null);
            }
            ((Checkable) findViewById).setChecked(this.Q);
            if (z) {
                SwitchCompat switchCompat = (SwitchCompat) findViewById;
                switchCompat.setTextOn("");
                switchCompat.setTextOff("");
                switchCompat.setOnCheckedChangeListener(this.Y);
            }
        }
        View findViewById2 = tyc0Var.itemView.findViewById(android.R.id.title);
        if (findViewById2 == null || !(findViewById2 instanceof TextView)) {
            return;
        }
        ((TextView) findViewById2).setSingleLine(this.Z);
    }

    @TargetApi(21)
    public MaterialSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Y = new a();
        this.Z = true;
        R(context, attributeSet);
    }

    public MaterialSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y = new a();
        this.Z = true;
        R(context, attributeSet);
        this.I = R.layout.switch_preference_widget;
    }

    public MaterialSwitchPreference(Context context) {
        super(context);
        this.Y = new a();
        this.Z = true;
        this.I = R.layout.switch_preference_widget;
    }
}
