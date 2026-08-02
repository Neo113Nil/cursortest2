package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.sofascore.results.R;
import defpackage.c5f;
import defpackage.jjf;
import defpackage.vs2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final vs2 R;
    public final String S;
    public final String T;

    public SwitchPreferenceCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        this.R = new vs2(this, 2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jjf.m, R.attr.switchPreferenceCompatStyle, 0);
        String string = obtainStyledAttributes.getString(7);
        this.N = string == null ? obtainStyledAttributes.getString(0) : string;
        if (this.M) {
            g();
        }
        String string2 = obtainStyledAttributes.getString(6);
        this.O = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        if (!this.M) {
            g();
        }
        String string3 = obtainStyledAttributes.getString(9);
        this.S = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        g();
        String string4 = obtainStyledAttributes.getString(8);
        this.T = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        g();
        this.Q = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.M);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.S);
            switchCompat.setTextOff(this.T);
            switchCompat.setOnCheckedChangeListener(this.R);
        }
    }

    @Override // androidx.preference.Preference
    public final void k(c5f c5fVar) {
        super.k(c5fVar);
        B(c5fVar.a(R.id.switchWidget));
        A(c5fVar.a(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void r(View view) {
        super.r(view);
        if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            B(view.findViewById(R.id.switchWidget));
            A(view.findViewById(android.R.id.summary));
        }
    }
}
