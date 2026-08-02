package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public abstract class t extends Fragment {

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f35434m = new LinkedHashSet();

    public boolean d0(s sVar) {
        return this.f35434m.add(sVar);
    }

    public void e0() {
        this.f35434m.clear();
    }
}
