package com.vk.libvideo.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.di.VideoAutologinComponent$Companion$STUB$1;
import xsna.pwj0;
import xsna.qo5;
import xsna.ro5;

/* compiled from: VideoAutologinComponent.kt */
/* loaded from: classes2.dex */
public interface VideoAutologinComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoAutologinComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoAutologinComponent STUB = new VideoAutologinComponent() { // from class: com.vk.libvideo.api.di.VideoAutologinComponent$Companion$STUB$1
            public final qo5 a = qo5.a.a.getSTUB();
            public final a b = new a();

            /* compiled from: VideoAutologinComponent.kt */
            public static final class a implements ro5 {
            }

            @Override // com.vk.libvideo.api.di.VideoAutologinComponent
            public final qo5 S6() {
                return this.a;
            }

            @Override // com.vk.libvideo.api.di.VideoAutologinComponent
            public final a u7() {
                return this.b;
            }
        };

        public final VideoAutologinComponent getSTUB() {
            return STUB;
        }
    }

    qo5 S6();

    VideoAutologinComponent$Companion$STUB$1.a u7();
}
