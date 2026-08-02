package com.vk.attachpicker.impl;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.vk.attachpicker.c;
import com.vk.attachpicker.impl.a;
import com.vk.attachpicker.impl.location.LocationFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.documents.api.di.DocumentsComponent;
import com.vk.gallerypicker.di.GalleryPickerComponent;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.superapp.di.SuperAppServicesComponent;
import com.vkontakte.android.R;
import java.util.HashMap;
import xsna.aeg0;
import xsna.cuz;
import xsna.dhr0;
import xsna.f44;
import xsna.fcn;
import xsna.fpf0;
import xsna.fvr;
import xsna.h2d0;
import xsna.m7m;
import xsna.ozl;
import xsna.s200;
import xsna.tb0;
import xsna.tvv;
import xsna.ww50;

/* compiled from: AttachBottomSheet.kt */
/* loaded from: classes15.dex */
public final class AttachBottomSheet extends FragmentImpl implements aeg0, LocationFragment.a, tvv, f44, h2d0, a.l, fcn {
    public com.vk.attachpicker.impl.a N;

    /* compiled from: AttachBottomSheet.kt */
    public static final class a extends Dialog {
        public final /* synthetic */ AttachBottomSheet b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ContextThemeWrapper contextThemeWrapper, int i, AttachBottomSheet attachBottomSheet) {
            super(contextThemeWrapper, i);
            this.b = attachBottomSheet;
        }

        @Override // android.app.Dialog
        public final void onBackPressed() {
            this.b.a0();
        }
    }

    @Override // com.vk.attachpicker.impl.a.l
    public final void Bm() {
        super.dismiss();
    }

    @Override // xsna.aeg0
    public final void Li(tb0 tb0Var) {
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.Li(tb0Var);
        }
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // com.vk.attachpicker.impl.location.LocationFragment.a
    public final void N() {
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.N();
        }
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.j34
    public final void V2(Intent intent) {
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.l(intent);
        }
    }

    @Override // com.vk.attachpicker.b.InterfaceC0381b
    public final com.vk.attachpicker.b Yd() {
        c cVar;
        com.vk.attachpicker.impl.a aVar = this.N;
        return (aVar == null || (cVar = aVar.b) == null) ? new c() : cVar;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar == null || !aVar.h()) {
            dismiss();
        }
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.fcn
    public final void b(boolean z) {
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d
    public final void dismiss() {
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final boolean eo() {
        com.vk.attachpicker.impl.a aVar = this.N;
        return (aVar == null || aVar.W == 0) ? false : true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void finish() {
        super.dismiss();
    }

    @Override // xsna.tvv
    public final boolean isIdle() {
        com.vk.attachpicker.impl.a aVar = this.N;
        return aVar != null && aVar.isIdle();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    @ozl
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.g(i, i2, intent);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.e(configuration.orientation);
            aVar.n(aVar.Z);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.N = new com.vk.attachpicker.impl.a(this, ((DocumentsComponent) m7m.d(this).mo408a(fpf0.a(DocumentsComponent.class))).P0(), ((GalleryPickerComponent) m7m.d(this).mo408a(fpf0.a(GalleryPickerComponent.class))).b2(), ((SuperAppServicesComponent) m7m.d(this).mo408a(fpf0.a(SuperAppServicesComponent.class))).nd(), (PhotosComponent) m7m.d(this).a(fpf0.a(PhotosComponent.class)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar == null) {
            return null;
        }
        Dialog dialog = this.s;
        return aVar.i(layoutInflater, viewGroup, bundle, dialog != null ? dialog.getWindow() : null);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.j();
        }
        ww50 v = s200.v(kn());
        if (v != null) {
            v.H(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.n(aVar.Z);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar != null) {
            bundle.putFloat("SLIDE_OFFSET", aVar.Z);
            bundle.putInt("BOTTOM_SHEET_STATE", aVar.j.N);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = this.s;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.attachpicker.impl.a$l, java.lang.Object] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar != null) {
            cuz.a(aVar.d0.kn()).d(aVar.m0);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ww50 v = s200.v(kn());
        if (v != null) {
            v.S(this);
        }
    }

    @Override // xsna.h2d0
    public final void qm(HashMap hashMap) {
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.qm(hashMap);
        }
    }

    @Override // xsna.d1m0
    public final void rh() {
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.m.setCurrentItem(aVar.K, false);
        }
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final String toString() {
        return "AttachBottomSheet";
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // xsna.aeg0
    public final void yk(tb0 tb0Var) {
        com.vk.attachpicker.impl.a aVar = this.N;
        if (aVar != null) {
            aVar.yk(tb0Var);
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        int i = dhr0.C().b ? R.style.AttachTransparentMilkTheme : R.style.AttachTransparentMilkDarkTheme;
        a aVar = new a(new ContextThemeWrapper(requireContext(), i), i, this);
        Window window = aVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            fvr.x(window, false);
            dhr0.s0(window);
        }
        return aVar;
    }
}
