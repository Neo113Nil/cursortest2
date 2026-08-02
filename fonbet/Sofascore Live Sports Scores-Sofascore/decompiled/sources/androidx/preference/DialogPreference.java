package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ironsource.U3;
import com.sofascore.results.R;
import defpackage.jjf;
import defpackage.r4a;
import defpackage.sw9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence M;
    public final String N;
    public final Drawable O;
    public final String P;
    public final String Q;
    public final int R;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jjf.c, i, 0);
        String string = obtainStyledAttributes.getString(9);
        string = string == null ? obtainStyledAttributes.getString(0) : string;
        this.M = string;
        if (string == null) {
            this.M = this.g;
        }
        String string2 = obtainStyledAttributes.getString(8);
        this.N = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.O = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = obtainStyledAttributes.getString(11);
        this.P = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        String string4 = obtainStyledAttributes.getString(10);
        this.Q = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        this.R = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void l() {
        DialogFragment multiSelectListPreferenceDialogFragmentCompat;
        PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) this.b.i;
        if (preferenceFragmentCompat != null) {
            for (Fragment fragment = preferenceFragmentCompat; fragment != null; fragment = fragment.getParentFragment()) {
            }
            preferenceFragmentCompat.getContext();
            preferenceFragmentCompat.getActivity();
            if (preferenceFragmentCompat.getParentFragmentManager().F("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            boolean z = this instanceof EditTextPreference;
            String str = this.k;
            if (z) {
                multiSelectListPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
                Bundle bundle = new Bundle(1);
                bundle.putString(U3.i.W, str);
                multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle);
            } else if (this instanceof ListPreference) {
                multiSelectListPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString(U3.i.W, str);
                multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle2);
            } else {
                if (!(this instanceof MultiSelectListPreference)) {
                    sw9.t(getClass().getSimpleName(), ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.", "Cannot display dialog for an unknown Preference type: ");
                    return;
                }
                multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString(U3.i.W, str);
                multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle3);
            }
            multiSelectListPreferenceDialogFragmentCompat.setTargetFragment(preferenceFragmentCompat, 0);
            multiSelectListPreferenceDialogFragmentCompat.p(preferenceFragmentCompat.getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, r4a.w(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
