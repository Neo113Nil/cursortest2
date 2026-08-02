package com.vk.media.playback.di;

import android.content.Context;
import com.vk.di.component.DiUnscopedComponent;
import xsna.cv10;

/* compiled from: MediaPlaybackComponent.kt */
/* loaded from: classes3.dex */
public interface MediaPlaybackComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: MediaPlaybackComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MediaPlaybackComponent STUB = new MediaPlaybackComponent() { // from class: com.vk.media.playback.di.MediaPlaybackComponent$Companion$STUB$1
            @Override // com.vk.media.playback.di.MediaPlaybackComponent
            public final cv10 Yb(Context context, String str) {
                return cv10.a.a.getSTUB();
            }
        };

        public final MediaPlaybackComponent getSTUB() {
            return STUB;
        }
    }

    cv10 Yb(Context context, String str);
}
