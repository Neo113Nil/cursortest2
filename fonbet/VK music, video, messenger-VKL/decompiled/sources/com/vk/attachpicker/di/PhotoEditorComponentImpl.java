package com.vk.attachpicker.di;

import com.vk.attachpicker.stat.data.PhotoParamsDatabase;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.gallerypicker.di.PhotoEditorComponent;
import com.vk.movika.sdk.android.defaultplayer.interactive.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.da50;
import xsna.e7a0;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g760;
import xsna.g8m;
import xsna.hpf0;
import xsna.io60;
import xsna.nwy;
import xsna.pwj0;
import xsna.q010;
import xsna.qcy;

/* compiled from: PhotoEditorComponentImpl.kt */
/* loaded from: classes15.dex */
public final class PhotoEditorComponentImpl implements PhotoEditorComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final AppContextDiComponent a;
    public final nwy b = new nwy(new da50(this, 9));
    public final nwy c = new nwy(new io60(this, 8));
    public final nwy d = new nwy(new b(27));

    /* compiled from: PhotoEditorComponentImpl.kt */
    public static final class a implements c8m<PhotoEditorComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new PhotoEditorComponentImpl((AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PhotoEditorComponentImpl.class, "photoParamsDatabase", "getPhotoParamsDatabase()Lcom/vk/attachpicker/stat/data/PhotoParamsDatabase;", 0);
        hpf0 hpf0Var = fpf0.a;
        e = new qcy[]{propertyReference1Impl, fp.c(0, PhotoEditorComponentImpl.class, "paramsStorage", "getParamsStorage$impl_release()Lcom/vk/attachpicker/stat/data/PhotoParamsStorage;", hpf0Var), ep.a(0, PhotoEditorComponentImpl.class, "newEditorScreenFactory", "getNewEditorScreenFactory()Lcom/vk/gallerypicker/screen/NewEditorScreenFactory;", hpf0Var)};
    }

    public PhotoEditorComponentImpl(AppContextDiComponent appContextDiComponent) {
        this.a = appContextDiComponent;
    }

    @Override // com.vk.gallerypicker.di.PhotoEditorComponent
    public final e7a0 Ab() {
        return new e7a0(new q010(this, 13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PhotoParamsDatabase Df() {
        qcy<Object> qcyVar = e[0];
        return (PhotoParamsDatabase) this.b.c();
    }

    @Override // com.vk.gallerypicker.di.PhotoEditorComponent
    public final g760 k4() {
        qcy<Object> qcyVar = e[2];
        return (g760) this.d.c();
    }
}
