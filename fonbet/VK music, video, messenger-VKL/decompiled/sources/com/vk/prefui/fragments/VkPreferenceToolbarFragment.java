package com.vk.prefui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.f4m;
import xsna.gko;
import xsna.rme0;
import xsna.tlo0;
import xsna.too0;
import xsna.tq;

/* compiled from: VkPreferenceToolbarFragment.kt */
/* loaded from: classes5.dex */
public abstract class VkPreferenceToolbarFragment extends MaterialPreferenceFragment implements too0 {
    public static final /* synthetic */ int l0 = 0;

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        Context context;
        RecyclerView recyclerView = this.O;
        if (recyclerView == null || (context = recyclerView.getContext()) == null) {
            return;
        }
        context.setTheme(dhr0.C().c);
    }

    public int ho() {
        return 0;
    }

    public abstract int io();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.prefui.fragments.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.vk_toolbar_fragment_hidable, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.appkit_content);
        f4m.t(ho(), viewGroup2);
        viewGroup2.addView(onCreateView);
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.top_bar);
        vkTopBar.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_back_24), tq.h(tlo0.Companion, R.string.close), new rme0(this, 23), null, null, 56));
        tlo0.f fVar = new tlo0.f(io());
        VkTopBar.Middle.Text.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(fVar, null, null, null, null, 30), cVar, objArr2, objArr, 14));
        return inflate;
    }
}
