package com.vk.attachpicker.fragment.gallery;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.b470;
import xsna.bek0;
import xsna.dhr0;
import xsna.e3m;
import xsna.ebs;
import xsna.eqy;
import xsna.ey90;
import xsna.gz80;
import xsna.h090;
import xsna.kn4;
import xsna.pxo0;
import xsna.s8g0;
import xsna.sf4;
import xsna.y000;
import xsna.yx90;
import xsna.z3z;

/* compiled from: PermissionDelegate.kt */
/* loaded from: classes15.dex */
public final class h {
    public final FrameLayout a;
    public final y000 b;
    public final b c;
    public final Boolean d;
    public final WeakReference<Fragment> e;
    public final pxo0 f;
    public final s8g0 g;
    public final z3z h;

    /* compiled from: PermissionDelegate.kt */
    public interface a {
        void a();

        void b();

        void c();

        void d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0126, code lost:
    
        if (com.vk.toggle.b.A.a(com.vk.toggle.Features.Type.FEATURE_CORE_NO_PERMISSION_PHOTO_PICKER) == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(GalleryFragmentImpl galleryFragmentImpl, dhr0 dhr0Var, FrameLayout frameLayout, int i, y000 y000Var, b bVar, GalleryPickerSourceConfiguration galleryPickerSourceConfiguration, Boolean bool) {
        String[] strArr;
        ebs c;
        boolean z;
        boolean z2 = galleryPickerSourceConfiguration.i;
        this.a = frameLayout;
        this.b = y000Var;
        this.c = bVar;
        this.d = bool;
        this.e = new WeakReference<>(galleryFragmentImpl);
        this.f = new pxo0(100L);
        this.h = new z3z(galleryFragmentImpl.getViewLifecycleOwner());
        boolean a2 = gz80.a(33);
        if (gz80.a(34) && i == 222) {
            PermissionHelper.a.getClass();
            strArr = PermissionHelper.r;
        } else if (gz80.a(34) && i == 333) {
            PermissionHelper.a.getClass();
            strArr = PermissionHelper.s;
        } else if (gz80.a(29)) {
            PermissionHelper.a.getClass();
            strArr = PermissionHelper.q;
        } else {
            PermissionHelper.a.getClass();
            strArr = PermissionHelper.e;
        }
        String[] strArr2 = strArr;
        int i2 = (gz80.a(34) && i == 222) ? R.string.vk_permissions_storage_separate_photo : (gz80.a(34) && i == 333) ? R.string.vk_permissions_storage_separate_video : R.string.vk_permissions_storage;
        Context mo2getContext = galleryFragmentImpl.mo2getContext();
        if (mo2getContext == null) {
            dhr0Var.getClass();
            mo2getContext = dhr0.E();
        }
        if (z2) {
            dhr0.a.getClass();
            mo2getContext = dhr0.t(mo2getContext);
        }
        if (z2) {
            dhr0.a.getClass();
            c = new ebs(galleryFragmentImpl, Integer.valueOf(dhr0.u().c));
        } else {
            c = kn4.c(galleryFragmentImpl);
        }
        ey90 ey90Var = new ey90(e3m.f(R.attr.vk_ui_background_content, mo2getContext), e3m.f(R.attr.vk_ui_text_subhead, mo2getContext));
        yx90 yx90Var = new yx90(i2, 16, PermissionHelper.g, strArr2, false);
        d dVar = new d(0, bVar, a.class, "action", "action()V", 0);
        e eVar = new e(0, bVar, a.class, "denyAction", "denyAction()V", 0);
        f fVar = new f(0, bVar, a.class, "onPermissionsGranted", "onPermissionsGranted()V", 0);
        if (b470.c) {
            eqy<bek0> eqyVar = com.vk.toggle.d.a;
        }
        if (!a2) {
            z = false;
            this.g = new s8g0(c, frameLayout, ey90Var, yx90Var, dVar, eVar, null, fVar, new h090(z, new g(0, bVar, a.class, "onOtherPermission", "onOtherPermission()V", 0)), new sf4(15, this, galleryFragmentImpl));
        }
        z = true;
        this.g = new s8g0(c, frameLayout, ey90Var, yx90Var, dVar, eVar, null, fVar, new h090(z, new g(0, bVar, a.class, "onOtherPermission", "onOtherPermission()V", 0)), new sf4(15, this, galleryFragmentImpl));
    }

    public final FragmentActivity a() {
        Fragment fragment = this.e.get();
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }
}
