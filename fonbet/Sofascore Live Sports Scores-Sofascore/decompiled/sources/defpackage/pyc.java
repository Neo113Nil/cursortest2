package defpackage;

import android.content.DialogInterface;
import androidx.preference.MultiSelectListPreferenceDialogFragmentCompat;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pyc implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ MultiSelectListPreferenceDialogFragmentCompat a;

    public pyc(MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat) {
        this.a = multiSelectListPreferenceDialogFragmentCompat;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = this.a;
        HashSet hashSet = multiSelectListPreferenceDialogFragmentCompat.y;
        boolean z2 = multiSelectListPreferenceDialogFragmentCompat.z;
        if (z) {
            multiSelectListPreferenceDialogFragmentCompat.z = hashSet.add(multiSelectListPreferenceDialogFragmentCompat.B[i].toString()) | z2;
        } else {
            multiSelectListPreferenceDialogFragmentCompat.z = hashSet.remove(multiSelectListPreferenceDialogFragmentCompat.B[i].toString()) | z2;
        }
    }
}
