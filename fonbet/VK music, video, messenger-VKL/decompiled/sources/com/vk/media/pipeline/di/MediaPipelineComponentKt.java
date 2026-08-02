package com.vk.media.pipeline.di;

import android.content.Context;
import android.net.Uri;
import com.vk.media.pipeline.PreviewExtractor;
import com.vk.media.pipeline.metrics.ComparableVideoFragmentInfo;
import com.vk.media.pipeline.metrics.MetricsCalculationConfig;
import com.vk.media.pipeline.model.timeline.Timeline;
import java.util.List;
import xsna.apk;
import xsna.av10;
import xsna.d80;
import xsna.f100;
import xsna.gat0;
import xsna.gpa0;
import xsna.hpa0;
import xsna.jpa0;
import xsna.opa0;
import xsna.qpa0;
import xsna.qts0;
import xsna.qva0;
import xsna.xsw;
import xsna.ykm0;

/* compiled from: MediaPipelineComponent.kt */
/* loaded from: classes3.dex */
public final class MediaPipelineComponentKt {
    public static final MediaPipelineComponentKt$COMPONENT_STUB$1 a = new MediaPipelineComponent() { // from class: com.vk.media.pipeline.di.MediaPipelineComponentKt$COMPONENT_STUB$1
        public final av10 a = new av10();

        {
            jpa0.a.getClass();
            opa0 opa0Var = jpa0.a.b;
        }

        @Override // com.vk.media.pipeline.di.MediaPipelineComponent
        public final gat0 A4() {
            return new b();
        }

        @Override // com.vk.media.pipeline.di.MediaPipelineComponent
        public final f100 Gd() {
            return this.a;
        }

        @Override // com.vk.media.pipeline.di.MediaPipelineComponent
        public final PreviewExtractor O9(Timeline timeline, apk apkVar) {
            return new com.vk.media.pipeline.di.a();
        }

        @Override // com.vk.media.pipeline.di.MediaPipelineComponent
        public final hpa0 p6(Context context) {
            return new a();
        }

        /* compiled from: MediaPipelineComponent.kt */
        public static final class a implements hpa0 {
            @Override // xsna.hpa0
            public final gpa0 build() {
                return new C1264a();
            }

            /* compiled from: MediaPipelineComponent.kt */
            /* renamed from: com.vk.media.pipeline.di.MediaPipelineComponentKt$COMPONENT_STUB$1$a$a, reason: collision with other inner class name */
            public static final class C1264a implements gpa0 {
                @Override // xsna.gpa0
                public final qva0 a(xsw xswVar) {
                    return null;
                }

                @Override // xsna.gpa0
                public final qpa0 c(ykm0 ykm0Var) {
                    return qpa0.a.a;
                }

                @Override // xsna.gpa0
                public final void cancel() {
                }

                @Override // xsna.gpa0
                public final void release() {
                }

                @Override // xsna.gpa0
                public final void b(Timeline timeline) {
                }
            }

            @Override // xsna.hpa0
            public final hpa0 c(Timeline timeline) {
                return this;
            }

            @Override // xsna.fyi
            public final Object d(d80 d80Var) {
                return this;
            }

            @Override // xsna.fyi
            public final Object g(apk apkVar) {
                return this;
            }

            @Override // xsna.hpa0
            public final hpa0 f(int i, String str) {
                return this;
            }
        }

        /* compiled from: MediaPipelineComponent.kt */
        public static final class b implements gat0 {
            @Override // xsna.gat0
            public final qts0 b(Context context, Uri uri, ComparableVideoFragmentInfo comparableVideoFragmentInfo) {
                return null;
            }

            @Override // xsna.gat0
            public final MetricsCalculationConfig c(Context context, Uri uri, List list) {
                return new MetricsCalculationConfig.CanNotBeCalculated("not implemented");
            }

            @Override // xsna.gat0
            public final void a(qts0 qts0Var, int i, int i2) {
            }
        }
    };
}
