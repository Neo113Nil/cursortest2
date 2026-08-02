package com.vk.importcontacts.impl.presentation.details.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.FragmentImpl;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.dqw;
import xsna.fnj;
import xsna.iah0;
import xsna.l2i;
import xsna.mut0;
import xsna.nds;
import xsna.vds;
import xsna.zak0;

/* compiled from: ImportContactsDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class ImportContactsDetailsFragment extends FragmentImpl implements vds, nds {
    public static final /* synthetic */ int O = 0;
    public dqw N;

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        dqw dqwVar = this.N;
        if (dqwVar == null) {
            dqwVar = null;
        }
        dqwVar.getClass();
        int i = rect2.top;
        if (i > 0) {
            ((zak0) dqwVar.m).setValue(Integer.valueOf(i));
        }
        rect2.top = 0;
        return true;
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        Context requireContext = requireContext();
        Context mo2getContext = mo2getContext();
        HashSet hashSet = iah0.a;
        return requireContext.getColor(fnj.b(mo2getContext) ? R.color.vk_azure_A100 : R.color.vk_clear);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dqw dqwVar = new dqw(requireContext());
        dqwVar.setViewCompositionStrategy(mut0.c.a);
        dqwVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dqwVar.setOnAction(new l2i(this, 18));
        this.N = dqwVar;
        return dqwVar;
    }
}
