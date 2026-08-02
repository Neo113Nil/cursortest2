package androidx.preference;

import android.os.Bundle;
import defpackage.a70;
import defpackage.pyc;
import defpackage.sm;
import defpackage.wm;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public CharSequence[] A;
    public CharSequence[] B;
    public final HashSet y = new HashSet();
    public boolean z;

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.y;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.z = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.A = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.B = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) q();
        CharSequence[] charSequenceArr = multiSelectListPreference.S;
        CharSequence[] charSequenceArr2 = multiSelectListPreference.T;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            a70.r("MultiSelectListPreference requires an entries array and an entryValues array.");
            return;
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.U);
        this.z = false;
        this.A = multiSelectListPreference.S;
        this.B = charSequenceArr2;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.y));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.z);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.A);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.B);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void s(boolean z) {
        if (z && this.z) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) q();
            multiSelectListPreference.getClass();
            multiSelectListPreference.z(this.y);
        }
        this.z = false;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void t(wm wmVar) {
        int length = this.B.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.y.contains(this.B[i].toString());
        }
        CharSequence[] charSequenceArr = this.A;
        pyc pycVar = new pyc(this);
        sm smVar = wmVar.a;
        smVar.l = charSequenceArr;
        smVar.t = pycVar;
        smVar.p = zArr;
        smVar.q = true;
    }
}
