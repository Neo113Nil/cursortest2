package com.vk.core.fragments.impl.support;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import xsna.ni90;
import xsna.vbs;

/* compiled from: ParentSupportFragment.kt */
/* loaded from: classes.dex */
public class ParentSupportFragment extends n implements ni90<Fragment> {
    public final void En(Parcelable parcelable) {
        super.setInitialSavedState((Fragment.SavedState) parcelable);
    }

    public final void Fn(vbs vbsVar, String str) {
        if (vbsVar == null) {
            vbsVar = null;
        }
        if (vbsVar != null) {
            Td(vbsVar.a, str);
        }
    }
}
