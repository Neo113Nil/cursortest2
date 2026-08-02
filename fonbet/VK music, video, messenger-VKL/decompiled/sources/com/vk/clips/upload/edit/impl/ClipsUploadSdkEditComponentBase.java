package com.vk.clips.upload.edit.impl;

import com.vk.clips.edit.editor.ClipsChoosePreviewActivity;
import com.vk.clips.upload.edit.api.ClipsUploadSdkEditComponent;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewParams;
import com.vk.media.filters.di.FiltersComponent;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.media.playback.di.MediaPlaybackComponent;
import com.vkontakte.android.task.di.components.clips.ClipsUploadSdkEditComponentVkApp;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.fpf0;
import xsna.gy;
import xsna.jqd;
import xsna.lpj;
import xsna.mld;
import xsna.nwy;
import xsna.pld;
import xsna.qcy;
import xsna.qld;
import xsna.ry0;
import xsna.xnf;

/* compiled from: ClipsUploadSdkEditComponentBase.kt */
/* loaded from: classes17.dex */
public abstract class ClipsUploadSdkEditComponentBase implements ClipsUploadSdkEditComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final FiltersComponent a;
    public final MediaPipelineComponent b;
    public final MediaPlaybackComponent c;
    public final nwy d = new nwy(new ry0(this, 22));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsUploadSdkEditComponentBase.class, "descriptionEditController", "getDescriptionEditController()Lcom/vk/clips/upload/edit/api/description/ClipsDescriptionEditProvider;", 0);
        fpf0.a.getClass();
        e = new qcy[]{propertyReference1Impl};
    }

    public ClipsUploadSdkEditComponentBase(FiltersComponent filtersComponent, MediaPipelineComponent mediaPipelineComponent, MediaPlaybackComponent mediaPlaybackComponent) {
        this.a = filtersComponent;
        this.b = mediaPipelineComponent;
        this.c = mediaPlaybackComponent;
    }

    public abstract xnf Df();

    @Override // com.vk.clips.upload.edit.api.ClipsUploadSdkEditComponent
    public final jqd F5() {
        qcy<Object> qcyVar = e[0];
        return (jqd) this.d.c();
    }

    @Override // com.vk.clips.upload.edit.api.ClipsUploadSdkEditComponent
    public final mld Fb(ClipsChoosePreviewParams clipsChoosePreviewParams, ClipsChoosePreviewActivity clipsChoosePreviewActivity, gy gyVar) {
        return new qld(new pld(this.a, this.b, this.c), clipsChoosePreviewParams, new lpj(clipsChoosePreviewActivity, Df().a()), ((ClipsUploadSdkEditComponentVkApp) this).k(), gyVar);
    }
}
