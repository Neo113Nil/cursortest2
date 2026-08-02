package com.vk.video.playlist.common.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.LazyThreadSafetyMode;
import xsna.iz3;
import xsna.msy;
import xsna.oab0;

/* compiled from: PlaylistComponent.kt */
/* loaded from: classes6.dex */
public interface PlaylistComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: PlaylistComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final PlaylistComponent$Companion$STUB$1 STUB = new PlaylistComponent() { // from class: com.vk.video.playlist.common.di.PlaylistComponent$Companion$STUB$1
            public final Object a = msy.a(LazyThreadSafetyMode.NONE, new iz3(21));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // com.vk.video.playlist.common.di.PlaylistComponent
            public final oab0 U() {
                return (oab0) this.a.getValue();
            }
        };
    }

    oab0 U();
}
