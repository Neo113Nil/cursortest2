package com.vk.music.fragment.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.fragments.FragmentImpl;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.aeg0;
import xsna.i80;
import xsna.lhg;
import xsna.s770;
import xsna.tb0;

/* loaded from: classes3.dex */
public abstract class DelegatingFragment extends FragmentImpl implements tb0 {
    public s770 N;

    @NonNull
    public abstract b eo();

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        if (this.N == null) {
            this.N = eo();
        }
        if (bundle != null && (bundle2 = bundle.getBundle("state")) != null) {
            i80[] i80VarArr = ((b) this.N).c;
            Bundle bundle3 = bundle2.getBundle("s0");
            if (bundle3 != null) {
                i80VarArr[0].u(bundle3);
            }
        }
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        b bVar = (b) this.N;
        return bVar.d.a(bVar);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        for (i80 i80Var : ((b) this.N).c) {
            i80Var.release();
        }
        this.N = null;
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((aeg0) getActivity()).yk(this);
        ((b) this.N).c[0].G1();
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        this.N.getClass();
        super.onPause();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.N.getClass();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        i80[] i80VarArr = ((b) this.N).c;
        Bundle bundle2 = new Bundle();
        for (int i = 0; i < i80VarArr.length; i++) {
            bundle2.putBundle(lhg.a(i, UcumUtils.UCUM_SECONDS), i80VarArr[i].e());
        }
        bundle.putBundle("state", bundle2);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((aeg0) getActivity()).Li(this);
    }
}
