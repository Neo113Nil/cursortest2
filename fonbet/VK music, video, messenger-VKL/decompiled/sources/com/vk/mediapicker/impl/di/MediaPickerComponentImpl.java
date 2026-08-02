package com.vk.mediapicker.impl.di;

import android.content.Context;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.mediapicker.api.di.MediaPickerComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.cty;
import xsna.e7m;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.mt10;
import xsna.ou10;
import xsna.qcy;
import xsna.se0;

/* compiled from: MediaPickerComponentImpl.kt */
/* loaded from: classes3.dex */
public final class MediaPickerComponentImpl implements MediaPickerComponent {
    public static final /* synthetic */ qcy<Object>[] d = {new PropertyReference1Impl(MediaPickerComponentImpl.class, "mediaPickerRouter", "getMediaPickerRouter()Lcom/vk/mediapicker/api/router/MediaPickerRouter;", 0), fp.c(0, MediaPickerComponentImpl.class, "mediaPickerFacade", "getMediaPickerFacade()Lcom/vk/mediapicker/api/MediaPickerFacade;", fpf0.a)};
    public final Context a;
    public final ewy b = new ewy(new se0(22));
    public final ewy c = new ewy(new cty(this, 7));

    /* compiled from: MediaPickerComponentImpl.kt */
    public static final class a implements b7m<MediaPickerComponent> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MediaPickerComponentImpl(this.a);
        }
    }

    public MediaPickerComponentImpl(Context context) {
        this.a = context;
    }

    @Override // com.vk.mediapicker.api.di.MediaPickerComponent
    public final mt10 Be() {
        qcy<Object> qcyVar = d[1];
        return (mt10) this.c.c();
    }

    @Override // com.vk.mediapicker.api.di.MediaPickerComponent
    public final ou10 Xc() {
        qcy<Object> qcyVar = d[0];
        return (ou10) this.b.c();
    }
}
