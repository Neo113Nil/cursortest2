package com.vk.attachpicker.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.gallerypicker.di.GalleryPickerComponent;
import com.vk.movika.sdk.base.model.props.c;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.k3t;
import xsna.nwy;
import xsna.qcy;
import xsna.z4t;

/* compiled from: GalleryPickerComponentImpl.kt */
/* loaded from: classes15.dex */
public final class GalleryPickerComponentImpl implements GalleryPickerComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new c(15));

    /* compiled from: GalleryPickerComponentImpl.kt */
    public static final class a implements b7m<GalleryPickerComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new GalleryPickerComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(GalleryPickerComponentImpl.class, "galleryFactory", "getGalleryFactory()Lcom/vk/gallerypicker/GalleryFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.gallerypicker.di.GalleryPickerComponent
    public final k3t b2() {
        qcy<Object> qcyVar = b[0];
        return (k3t) this.a.c();
    }

    @Override // com.vk.gallerypicker.di.GalleryPickerComponent
    public final z4t jf() {
        return new z4t();
    }
}
