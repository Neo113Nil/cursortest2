package com.vk.video.bugreport.api.di;

import android.content.Context;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.video.bugreport.api.dto.VideoTechBugreportData;
import xsna.ljt0;

/* compiled from: VideoTechBugreportComponent.kt */
/* loaded from: classes5.dex */
public interface VideoTechBugreportComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoTechBugreportComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoTechBugreportComponent STUB = new VideoTechBugreportComponent() { // from class: com.vk.video.bugreport.api.di.VideoTechBugreportComponent$Companion$STUB$1
            public final a a = new a();

            @Override // com.vk.video.bugreport.api.di.VideoTechBugreportComponent
            public final ljt0 getReporter() {
                return this.a;
            }

            /* compiled from: VideoTechBugreportComponent.kt */
            public static final class a implements ljt0 {
                @Override // xsna.ljt0
                public final void a(Context context, VideoTechBugreportData videoTechBugreportData, String str, Long l) {
                }
            }
        };

        public final VideoTechBugreportComponent getSTUB() {
            return STUB;
        }
    }

    ljt0 getReporter();
}
