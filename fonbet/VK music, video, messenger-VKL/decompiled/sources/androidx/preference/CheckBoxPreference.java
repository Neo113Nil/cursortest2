package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.tyc0;
import xsna.ytp0;

/* loaded from: classes12.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final a V;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Boolean valueOf = Boolean.valueOf(z);
            CheckBoxPreference checkBoxPreference = CheckBoxPreference.this;
            if (checkBoxPreference.a(valueOf)) {
                checkBoxPreference.O(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public CheckBoxPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    @Override // androidx.preference.Preference
    public final void B(@NonNull View view) {
        A();
        if (((AccessibilityManager) this.b.getSystemService("accessibility")).isEnabled()) {
            Q(view.findViewById(R.id.checkbox));
            P(view.findViewById(R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Q);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.V);
        }
    }

    @Override // androidx.preference.Preference
    public final void s(@NonNull tyc0 tyc0Var) {
        super.s(tyc0Var);
        Q(tyc0Var.V5(R.id.checkbox));
        P(tyc0Var.V5(R.id.summary));
    }

    public CheckBoxPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.V = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, i, i2);
        String string = obtainStyledAttributes.getString(5);
        this.R = string == null ? obtainStyledAttributes.getString(0) : string;
        if (this.Q) {
            o();
        }
        String string2 = obtainStyledAttributes.getString(4);
        this.S = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        if (!this.Q) {
            o();
        }
        this.U = obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ytp0.a(com.vkontakte.android.R.attr.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle, context));
    }

    public CheckBoxPreference(@NonNull Context context) {
        this(context, null);
    }
}
