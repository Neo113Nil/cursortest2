package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.sofascore.results.R;
import defpackage.r4a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean U;

    public PreferenceScreen(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, r4a.w(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle), 0);
        this.U = true;
    }

    @Override // androidx.preference.Preference
    public final void l() {
        PreferenceFragmentCompat preferenceFragmentCompat;
        if (this.l != null || this.m != null || this.O.size() == 0 || (preferenceFragmentCompat = (PreferenceFragmentCompat) this.b.j) == null) {
            return;
        }
        for (Fragment fragment = preferenceFragmentCompat; fragment != null; fragment = fragment.getParentFragment()) {
        }
        preferenceFragmentCompat.getContext();
        preferenceFragmentCompat.getActivity();
    }
}
