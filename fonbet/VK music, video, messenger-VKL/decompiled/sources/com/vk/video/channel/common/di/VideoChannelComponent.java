package com.vk.video.channel.common.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.LazyThreadSafetyMode;
import xsna.msy;
import xsna.ta50;
import xsna.xas0;

/* compiled from: VideoChannelComponent.kt */
/* loaded from: classes5.dex */
public interface VideoChannelComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoChannelComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoChannelComponent STUB = new VideoChannelComponent() { // from class: com.vk.video.channel.common.di.VideoChannelComponent$Companion$STUB$1
            public final Object a = msy.a(LazyThreadSafetyMode.NONE, new ta50(15));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // com.vk.video.channel.common.di.VideoChannelComponent
            public final xas0 h4() {
                return (xas0) this.a.getValue();
            }

            @Override // com.vk.video.channel.common.di.VideoChannelComponent
            public final b nf() {
                return new b();
            }

            @Override // com.vk.video.channel.common.di.VideoChannelComponent
            public final a p8() {
                return new a();
            }
        };

        public final VideoChannelComponent getSTUB() {
            return STUB;
        }
    }

    xas0 h4();

    b nf();

    a p8();
}
