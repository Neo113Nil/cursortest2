package com.vk.attachpicker.fragment.gallery;

import android.content.Context;
import com.vk.attachpicker.fragment.gallery.h;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.permission.PermissionHelper;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.stories.analytics.session.storage.permissions.CallReason;
import xsna.ab0;
import xsna.b470;
import xsna.h6g;
import xsna.hb0;
import xsna.im1;
import xsna.nf9;
import xsna.nha0;
import xsna.oha0;
import xsna.r3t;

/* compiled from: GalleryFragmentImpl.kt */
/* loaded from: classes15.dex */
public final class b implements h.a {
    public final /* synthetic */ GalleryFragmentImpl a;

    public b(GalleryFragmentImpl galleryFragmentImpl) {
        this.a = galleryFragmentImpl;
    }

    @Override // com.vk.attachpicker.fragment.gallery.h.a
    public final void a() {
        im1 im1Var = this.a.e0;
        if (im1Var != null) {
            im1Var.a();
        }
    }

    @Override // com.vk.attachpicker.fragment.gallery.h.a
    public final void b() {
        GalleryFragmentImpl galleryFragmentImpl = this.a;
        Context B = galleryFragmentImpl.B();
        if (B != null) {
            galleryFragmentImpl.S.h(B);
        }
    }

    @Override // com.vk.attachpicker.fragment.gallery.h.a
    public final void c() {
        nha0 nha0Var;
        GalleryFragmentImpl galleryFragmentImpl = this.a;
        hb0<nha0> hb0Var = galleryFragmentImpl.n0;
        if (hb0Var != null) {
            b470 b470Var = galleryFragmentImpl.o0;
            if (b470Var != null) {
                int i = b470Var.b.k;
                nha0Var = oha0.a(i != 222 ? i != 333 ? ab0.c.a : ab0.f.a : ab0.d.a);
            } else {
                nha0Var = null;
            }
            hb0Var.a(nha0Var);
        }
    }

    @Override // com.vk.attachpicker.fragment.gallery.h.a
    public final void d() {
        GalleryFragmentImpl galleryFragmentImpl = this.a;
        Context B = galleryFragmentImpl.B();
        if (B != null) {
            r3t r3tVar = galleryFragmentImpl.S;
            GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = r3tVar.e;
            if ((galleryPickerSourceConfiguration != null ? galleryPickerSourceConfiguration.d : null) == GalleryPickerSourceConfiguration.EntryPoint.STORY) {
                nf9 nf9Var = nf9.b;
                nf9.e().d().a(B, CallReason.SET_ACCESS, (r6 & 4) == 0, (r6 & 8) == 0);
                nf9.j(PermissionHelper.o(B) ? StoryPublishEvent.GALLERY_LIMITED_ACCESS_AUTHORIZED : StoryPublishEvent.GALLERY_ACCESS_AUTHORIZED, null, null, null, new h6g(r3tVar, 19), 30);
            }
        }
    }
}
