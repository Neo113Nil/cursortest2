package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.tyc0;
import xsna.ytp0;

/* loaded from: classes12.dex */
public class SwitchPreference extends TwoStatePreference {
    public final a V;
    public final String W;
    public final String X;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Boolean valueOf = Boolean.valueOf(z);
            SwitchPreference switchPreference = SwitchPreference.this;
            if (switchPreference.a(valueOf)) {
                switchPreference.O(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.V = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.l, i, i2);
        String string = obtainStyledAttributes.getString(7);
        this.R = string == null ? obtainStyledAttributes.getString(0) : string;
        if (this.Q) {
            o();
        }
        String string2 = obtainStyledAttributes.getString(6);
        this.S = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        if (!this.Q) {
            o();
        }
        String string3 = obtainStyledAttributes.getString(9);
        this.W = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        o();
        String string4 = obtainStyledAttributes.getString(8);
        this.X = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        o();
        this.U = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void B(@NonNull View view) {
        A();
        if (((AccessibilityManager) this.b.getSystemService("accessibility")).isEnabled()) {
            Q(view.findViewById(R.id.switch_widget));
            P(view.findViewById(R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Q);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.W);
            r4.setTextOff(this.X);
            r4.setOnCheckedChangeListener(this.V);
        }
    }

    @Override // androidx.preference.Preference
    public final void s(@NonNull tyc0 tyc0Var) {
        super.s(tyc0Var);
        Q(tyc0Var.V5(R.id.switch_widget));
        P(tyc0Var.V5(R.id.summary));
    }

    public SwitchPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ytp0.a(com.vkontakte.android.R.attr.switchPreferenceStyle, R.attr.switchPreferenceStyle, context));
    }

    public SwitchPreference(@NonNull Context context) {
        this(context, null);
    }
}
