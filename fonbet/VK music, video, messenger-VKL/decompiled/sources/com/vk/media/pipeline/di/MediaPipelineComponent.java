package com.vk.media.pipeline.di;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import com.vk.media.pipeline.PreviewExtractor;
import com.vk.media.pipeline.model.timeline.Timeline;
import xsna.apk;
import xsna.f100;
import xsna.gat0;
import xsna.hpa0;
import xsna.pwj0;

/* compiled from: MediaPipelineComponent.kt */
/* loaded from: classes3.dex */
public interface MediaPipelineComponent extends DiScopedComponent<pwj0> {
    public static final a Companion = a.a;

    /* compiled from: MediaPipelineComponent.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final MediaPipelineComponent STUB = MediaPipelineComponentKt.a;

        public final MediaPipelineComponent getSTUB() {
            return STUB;
        }
    }

    gat0 A4();

    f100 Gd();

    PreviewExtractor O9(Timeline timeline, apk apkVar);

    hpa0 p6(Context context);
}
