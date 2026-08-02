package com.vk.prefui.views;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.Preference;
import com.vk.prefui.views.LoadingPreference;
import xsna.bwt0;
import xsna.jtz;
import xsna.tyc0;

/* compiled from: LoadingPreference.kt */
/* loaded from: classes5.dex */
public final class LoadingPreference extends Preference {
    public final boolean Q;
    public boolean R;
    public final jtz S;

    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.jtz] */
    public LoadingPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.preferenceStyle);
        this.Q = true;
        this.S = new CompoundButton.OnCheckedChangeListener() { // from class: xsna.jtz
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Boolean valueOf = Boolean.valueOf(z);
                LoadingPreference loadingPreference = LoadingPreference.this;
                if (!loadingPreference.a(valueOf)) {
                    compoundButton.setChecked(!z);
                    return;
                }
                loadingPreference.C(z);
                loadingPreference.R = z;
                loadingPreference.o();
            }
        };
        this.I = com.vkontakte.android.R.layout.loading_preference_widget;
    }

    @Override // androidx.preference.Preference
    public final void B(View view) {
        A();
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(com.vkontakte.android.R.id.switch_button);
        if (switchCompat != null) {
            switchCompat.setChecked(!this.R);
        }
    }

    @Override // androidx.preference.Preference
    public final void s(tyc0 tyc0Var) {
        super.s(tyc0Var);
        ProgressBar progressBar = (ProgressBar) tyc0Var.itemView.findViewById(com.vkontakte.android.R.id.progress_bar);
        boolean z = this.Q;
        if (progressBar != null) {
            bwt0.p0(progressBar, z);
        }
        SwitchCompat switchCompat = (SwitchCompat) tyc0Var.itemView.findViewById(com.vkontakte.android.R.id.switch_button);
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(null);
            switchCompat.setChecked(this.R);
            bwt0.p0(switchCompat, !z);
            switchCompat.setOnCheckedChangeListener(this.S);
        }
    }

    @Override // androidx.preference.Preference
    public final Object v(TypedArray typedArray, int i) {
        boolean z = typedArray.getBoolean(i, false);
        this.R = z;
        C(z);
        return Boolean.valueOf(this.R);
    }

    @Override // androidx.preference.Preference
    public final void y(Object obj) {
        this.R = i(false);
    }
}
