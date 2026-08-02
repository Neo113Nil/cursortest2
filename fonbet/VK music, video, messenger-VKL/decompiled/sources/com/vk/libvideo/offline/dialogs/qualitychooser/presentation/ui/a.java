package com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.e;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.ao50;
import xsna.ap30;
import xsna.ape0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.dw20;
import xsna.gm50;
import xsna.jgj;
import xsna.k7y;
import xsna.km50;
import xsna.lw20;
import xsna.mk50;
import xsna.msy;
import xsna.n7w;
import xsna.tdm;
import xsna.tl50;
import xsna.ts90;
import xsna.vb5;
import xsna.vk50;

/* compiled from: QualityChooserBottomSheet.kt */
/* loaded from: classes3.dex */
public final class a extends tl50<com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.b, QualityChooserViewState, com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.a> {
    public static final /* synthetic */ int p1 = 0;
    public boolean i1;
    public tdm j1;
    public vb5 k1;
    public RecyclerView l1;
    public VkButton m1;
    public n7w n1;
    public final Object o1 = msy.a(LazyThreadSafetyMode.NONE, new k7y(this, 29));

    /* compiled from: QualityChooserBottomSheet.kt */
    /* renamed from: com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a$a, reason: collision with other inner class name */
    public static final class C1242a extends dw20.b {
        public final vb5 e;
        public final tdm f;
        public final boolean g;

        public C1242a(Context context, vb5 vb5Var, boolean z, tdm tdmVar, boolean z2) {
            super(context, null);
            this.e = vb5Var;
            this.f = tdmVar;
            this.g = z2;
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            E(true);
            if (z) {
                dhr0.a.getClass();
                u0(dhr0.u().c);
            }
            F0(true);
            x(cn70.b(12));
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            a aVar = new a();
            aVar.k1 = this.e;
            aVar.j1 = this.f;
            aVar.i1 = this.g;
            return aVar;
        }
    }

    @Override // xsna.xn50
    @SuppressLint({"InflateParams"})
    public final mk50 Fl() {
        View inflate = LayoutInflater.from(this.A0 == -1 ? requireContext() : new ContextThemeWrapper(requireContext(), this.A0)).inflate(R.layout.offline_quality_chooser, (ViewGroup) null);
        this.e0 = new jgj(inflate, 0, 0, 14);
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        QualityChooserViewState qualityChooserViewState = (QualityChooserViewState) ao50Var;
        this.l1 = (RecyclerView) view.findViewById(R.id.quality_list);
        this.m1 = (VkButton) view.findViewById(R.id.download_button);
        View findViewById = view.findViewById(R.id.quality_chooser_toolbar_settings);
        if (findViewById != null) {
            bwt0.i0(findViewById, new ape0(this, 0));
        }
        gm50.a.b(this, qualityChooserViewState.a, new lw20(this, 23));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.b) vk50Var).g.a(new ap30(this, 12), this);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.l1 = null;
        this.m1 = null;
        this.n1 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        dismiss();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        tdm tdmVar = this.j1;
        if (tdmVar == null) {
            tdmVar = null;
        }
        return new com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.b(tdmVar, new e(), this.i1);
    }
}
