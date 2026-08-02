package com.vk.attachpicker.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.vk.attachpicker.b;
import com.vk.attachpicker.c;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.screen.p;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.bg0;
import xsna.dhr0;
import xsna.gz80;
import xsna.k7;
import xsna.yg1;
import xsna.zt10;

/* compiled from: MediaPickerFragmentImpl.kt */
/* loaded from: classes15.dex */
public final class MediaPickerFragmentImpl extends GalleryFragmentImpl {
    public static final /* synthetic */ int W0 = 0;
    public final k7 S0 = new k7(this, 22);
    public zt10 T0 = new a();
    public VkButton U0;
    public View V0;

    @Override // com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl
    public final p.d fo() {
        return this.S0;
    }

    @Override // com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl
    public final b lo() {
        return new c();
    }

    @Override // com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.picker_fragment_photo_video_attach, viewGroup, false);
    }

    @Override // com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.T0.c();
    }

    @Override // com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.toolbar_container);
        frameLayout.addView(Wj(requireContext()));
        this.U0 = (VkButton) view.findViewById(R.id.acv_bottom_panel_counter);
        this.V0 = view.findViewById(R.id.tv_bottom_panel_cancel);
        this.V0.setVisibility(0);
        this.U0.setVisibility(8);
        if (gz80.a(23) && dhr0.L()) {
            frameLayout.setSystemUiVisibility(frameLayout.getSystemUiVisibility() + 8192);
            kn().getWindow().setStatusBarColor(dhr0.t.c(R.attr.vk_ui_background_modal));
        }
        VkButton vkButton = this.U0;
        if (vkButton != null) {
            vkButton.setOnClickListener(new bg0(this, 6));
        }
        View view2 = this.V0;
        if (view2 != null) {
            view2.setOnClickListener(new yg1(this, 5));
        }
        this.T0.a();
    }

    public final void oo() {
        FragmentManager supportFragmentManager = kn().getSupportFragmentManager();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.q(this);
        aVar.k(false);
        supportFragmentManager.W();
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return dhr0.L() ? R.style.PickerPhotoVideoClips : R.style.PickerPhotoVideoClipsDark;
    }

    /* compiled from: MediaPickerFragmentImpl.kt */
    public static final class a implements zt10 {
        @Override // xsna.zt10
        public final void a() {
        }

        @Override // xsna.zt10
        public final void c() {
        }

        @Override // xsna.zt10
        public final void b(Intent intent) {
        }
    }
}
