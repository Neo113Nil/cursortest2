package com.vk.media.pipeline.di;

import android.content.Context;
import com.vk.media.pipeline.PreviewExtractor;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vkontakte.android.task.di.components.clips.MediaPipelineComponentVkApp;
import xsna.apk;
import xsna.gat0;
import xsna.gzs;
import xsna.hpa0;
import xsna.ipa0;
import xsna.jpa0;
import xsna.jq10;
import xsna.qcy;
import xsna.xu10;
import xsna.y3d0;

/* compiled from: MediaPipelineComponentBase.kt */
/* loaded from: classes3.dex */
public abstract class MediaPipelineComponentBase implements MediaPipelineComponent {
    @Override // com.vk.media.pipeline.di.MediaPipelineComponent
    public final gat0 A4() {
        MediaPipelineComponentVkApp mediaPipelineComponentVkApp = (MediaPipelineComponentVkApp) this;
        qcy<Object> qcyVar = MediaPipelineComponentVkApp.d[2];
        return new com.vk.media.pipeline.metrics.a((xu10) ((gzs) mediaPipelineComponentVkApp.c.c()).invoke(), mediaPipelineComponentVkApp.Gd(), new jq10(mediaPipelineComponentVkApp.Gd()));
    }

    @Override // com.vk.media.pipeline.di.MediaPipelineComponent
    public final PreviewExtractor O9(Timeline timeline, apk apkVar) {
        return new y3d0(timeline, apkVar, ((MediaPipelineComponentVkApp) this).Gd());
    }

    @Override // com.vk.media.pipeline.di.MediaPipelineComponent
    public final hpa0 p6(Context context) {
        MediaPipelineComponentVkApp mediaPipelineComponentVkApp = (MediaPipelineComponentVkApp) this;
        qcy<Object>[] qcyVarArr = MediaPipelineComponentVkApp.d;
        qcy<Object> qcyVar = qcyVarArr[2];
        xu10 xu10Var = (xu10) ((gzs) mediaPipelineComponentVkApp.c.c()).invoke();
        qcy<Object> qcyVar2 = qcyVarArr[1];
        return new ipa0(context, xu10Var, (jpa0) mediaPipelineComponentVkApp.b.c(), mediaPipelineComponentVkApp.Gd());
    }
}
