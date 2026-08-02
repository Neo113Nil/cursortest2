package com.vk.im.ui.fragments;

import android.content.res.Configuration;
import com.vk.core.fragments.FragmentImpl;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.j8i;

/* compiled from: ImFragment.kt */
/* loaded from: classes.dex */
public class ImFragment extends FragmentImpl {
    public final io.reactivex.rxjava3.disposables.b N = new io.reactivex.rxjava3.disposables.b();
    public final LinkedHashSet O = new LinkedHashSet();

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            ((j8i) it.next()).K0(configuration);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LinkedHashSet linkedHashSet = this.O;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((j8i) it.next()).G0();
        }
        linkedHashSet.clear();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            ((j8i) it.next()).H0();
        }
        this.N.e();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        LinkedHashSet linkedHashSet = this.O;
        if (z) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((j8i) it.next()).W0();
            }
        } else {
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                ((j8i) it2.next()).V0();
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            ((j8i) it.next()).W0();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            ((j8i) it.next()).V0();
        }
    }
}
