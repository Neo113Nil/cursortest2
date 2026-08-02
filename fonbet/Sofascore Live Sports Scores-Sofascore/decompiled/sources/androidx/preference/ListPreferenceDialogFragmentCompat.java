package androidx.preference;

import android.os.Bundle;
import defpackage.a70;
import defpackage.rcb;
import defpackage.sm;
import defpackage.wm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public CharSequence[] A;
    public int y;
    public CharSequence[] z;

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.y = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.z = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.A = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) q();
        CharSequence[] charSequenceArr = listPreference.S;
        CharSequence[] charSequenceArr2 = listPreference.T;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            a70.r("ListPreference requires an entries array and an entryValues array.");
            return;
        }
        this.y = listPreference.z(listPreference.U);
        this.z = listPreference.S;
        this.A = charSequenceArr2;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.y);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.z);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.A);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void s(boolean z) {
        int i;
        if (!z || (i = this.y) < 0) {
            return;
        }
        String charSequence = this.A[i].toString();
        ListPreference listPreference = (ListPreference) q();
        listPreference.getClass();
        listPreference.A(charSequence);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void t(wm wmVar) {
        CharSequence[] charSequenceArr = this.z;
        int i = this.y;
        rcb rcbVar = new rcb(this, 0);
        sm smVar = wmVar.a;
        smVar.l = charSequenceArr;
        smVar.n = rcbVar;
        smVar.s = i;
        smVar.r = true;
        smVar.g = null;
        smVar.h = null;
    }
}
