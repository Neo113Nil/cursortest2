package com.vk.stickers.settings;

import android.os.Bundle;
import android.view.View;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stickers.settings.b;
import com.vk.stickers.settings.f;
import xsna.ao50;
import xsna.ba40;
import xsna.d80;
import xsna.gm50;
import xsna.kcl0;
import xsna.km50;
import xsna.mk50;
import xsna.oz50;
import xsna.pod0;
import xsna.r820;
import xsna.t6g0;
import xsna.u3r0;
import xsna.vk50;
import xsna.w8i;
import xsna.xn50;
import xsna.zq70;

/* compiled from: StickerSettingsFragment.kt */
/* loaded from: classes6.dex */
public final class StickerSettingsFragment extends MviImplFragment<StickerSettingsFeature, j, b> implements w8i {
    public static final /* synthetic */ int R = 0;
    public i Q;

    /* compiled from: StickerSettingsFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(StickerSettingsFragment.class, null, null);
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        i iVar = new i(requireContext(), getViewLifecycleOwner(), new r820(this, 27));
        this.Q = iVar;
        return new mk50.c(iVar.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        j jVar = (j) ao50Var;
        i iVar = this.Q;
        if (iVar == null) {
            iVar = null;
        }
        iVar.getClass();
        gm50.a.b(iVar, jVar.a, new ba40(iVar, 29));
        gm50.a.b(iVar, jVar.b, new pod0(iVar, 9));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xn50.a.c(this, b.C1802b.b);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        t6g0 t6g0Var = t6g0.b;
        kcl0 d = t6g0.d();
        return new StickerSettingsFeature(requireContext(), new e(f.b.b), new com.vk.stickers.settings.a(new zq70(), new u3r0(), d, new d80(d)), new StickerSettingsRouter(requireContext()));
    }
}
