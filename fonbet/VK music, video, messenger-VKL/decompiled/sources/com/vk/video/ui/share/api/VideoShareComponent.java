package com.vk.video.ui.share.api;

import com.vk.di.component.DiScopedComponent;
import kotlin.LazyThreadSafetyMode;
import xsna.ko60;
import xsna.kud0;
import xsna.msy;
import xsna.pwj0;

/* compiled from: VideoShareComponent.kt */
/* loaded from: classes7.dex */
public interface VideoShareComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoShareComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoShareComponent STUB = new VideoShareComponent() { // from class: com.vk.video.ui.share.api.VideoShareComponent$Companion$STUB$1
            public final Object a;
            public final Object b;

            {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                this.a = msy.a(lazyThreadSafetyMode, new kud0(12));
                this.b = msy.a(lazyThreadSafetyMode, new ko60(11));
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // com.vk.video.ui.share.api.VideoShareComponent
            public final b S() {
                return (b) this.b.getValue();
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // com.vk.video.ui.share.api.VideoShareComponent
            public final a p0() {
                return (a) this.a.getValue();
            }
        };

        public final VideoShareComponent getSTUB() {
            return STUB;
        }
    }

    b S();

    a p0();
}
