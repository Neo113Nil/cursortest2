package com.vk.preview.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.movika.sdk.base.model.props.d;
import com.vk.movika.tools.controls.seekbar.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.gu0;
import xsna.hpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.r;
import xsna.rly;
import xsna.w4t;

/* compiled from: GalleryPickerPreviewComponentImpl.kt */
/* loaded from: classes5.dex */
public final class GalleryPickerPreviewComponentImpl implements GalleryPickerPreviewComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final nwy a = new nwy(new d(25));
    public final nwy b = new nwy(new n(21));
    public final nwy c = new nwy(new r(11));
    public final nwy d = new nwy(new gu0(16));

    /* compiled from: GalleryPickerPreviewComponentImpl.kt */
    public static final class a implements b7m<GalleryPickerPreviewComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new GalleryPickerPreviewComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(GalleryPickerPreviewComponentImpl.class, "galleryPickerPreviewFactory", "getGalleryPickerPreviewFactory()Lcom/vk/preview/presentation/GalleryPickerPreviewFactory;", 0);
        hpf0 hpf0Var = fpf0.a;
        e = new qcy[]{propertyReference1Impl, fp.c(0, GalleryPickerPreviewComponentImpl.class, "photoEditorPickerLargePreviewFactory", "getPhotoEditorPickerLargePreviewFactory()Lcom/vk/preview/presentation/LargeGalleryPickerPreviewFactory;", hpf0Var), ep.a(0, GalleryPickerPreviewComponentImpl.class, "storyGalleryPickerPreviewFactory", "getStoryGalleryPickerPreviewFactory()Lcom/vk/preview/presentation/GalleryPickerPreviewFactory;", hpf0Var), ep.a(0, GalleryPickerPreviewComponentImpl.class, "clipsTemplatesGalleryPickerPreviewFactory", "getClipsTemplatesGalleryPickerPreviewFactory()Lcom/vk/preview/presentation/GalleryPickerPreviewFactory;", hpf0Var)};
    }

    @Override // com.vk.preview.di.GalleryPickerPreviewComponent
    public final w4t f7() {
        qcy<Object> qcyVar = e[0];
        return (w4t) this.a.c();
    }

    @Override // com.vk.preview.di.GalleryPickerPreviewComponent
    public final rly k5() {
        qcy<Object> qcyVar = e[1];
        return (rly) this.b.c();
    }

    @Override // com.vk.preview.di.GalleryPickerPreviewComponent
    public final w4t ne() {
        qcy<Object> qcyVar = e[3];
        return (w4t) this.d.c();
    }

    @Override // com.vk.preview.di.GalleryPickerPreviewComponent
    public final w4t w6() {
        qcy<Object> qcyVar = e[2];
        return (w4t) this.c.c();
    }
}
