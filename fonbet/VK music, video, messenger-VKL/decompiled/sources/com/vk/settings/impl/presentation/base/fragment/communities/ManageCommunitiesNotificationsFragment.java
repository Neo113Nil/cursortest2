package com.vk.settings.impl.presentation.base.fragment.communities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.vk.mvi.androidx.MviImplFragment;
import kotlin.LazyThreadSafetyMode;
import xsna.ao50;
import xsna.b25;
import xsna.kh00;
import xsna.km50;
import xsna.lh00;
import xsna.mk50;
import xsna.msy;
import xsna.n5i;
import xsna.omf;
import xsna.qg00;
import xsna.tg00;
import xsna.vk50;
import xsna.w8i;
import xsna.wg00;

/* compiled from: ManageCommunitiesNotificationsFragment.kt */
/* loaded from: classes5.dex */
public final class ManageCommunitiesNotificationsFragment extends MviImplFragment<tg00, lh00, qg00> implements w8i {
    public static final /* synthetic */ int S = 0;
    public kh00 Q;
    public final Object R = msy.a(LazyThreadSafetyMode.NONE, new n5i(this, 28));

    @Override // xsna.xn50
    public final mk50 Fl() {
        kh00 kh00Var = new kh00(requireContext(), getViewLifecycleOwner());
        this.Q = kh00Var;
        return new mk50.c(kh00Var.c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        lh00 lh00Var = (lh00) ao50Var;
        kh00 kh00Var = this.Q;
        if (kh00Var != null) {
            kh00Var.f(lh00Var, new wg00(1, getFeature(), tg00.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0));
        }
        getFeature().g.a(new omf(this, 28), getViewLifecycleOwner());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        qg00.g gVar = qg00.g.b;
        if (i == 1 && i2 == -1) {
            getFeature().C(gVar);
        } else if (i == 2 && i2 == -1) {
            getFeature().C(gVar);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Q = null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new tg00((b25) this.R.getValue());
    }
}
