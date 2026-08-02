package com.vk.libvideo.offline.settings.api.di;

import com.vk.di.component.DiScopedComponent;
import kotlin.LazyThreadSafetyMode;
import xsna.i0t0;
import xsna.j0t0;
import xsna.lu2;
import xsna.msy;
import xsna.pwj0;
import xsna.sw1;

/* compiled from: VideoOfflineSettingsComponent.kt */
/* loaded from: classes.dex */
public interface VideoOfflineSettingsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoOfflineSettingsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoOfflineSettingsComponent$Companion$STUB$1 STUB = new VideoOfflineSettingsComponent() { // from class: com.vk.libvideo.offline.settings.api.di.VideoOfflineSettingsComponent$Companion$STUB$1
            public final Object a;
            public final Object b;

            {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                this.a = msy.a(lazyThreadSafetyMode, new sw1(19));
                this.b = msy.a(lazyThreadSafetyMode, new lu2(13));
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // com.vk.libvideo.offline.settings.api.di.VideoOfflineSettingsComponent
            public final i0t0 ce() {
                return (i0t0) this.b.getValue();
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // com.vk.libvideo.offline.settings.api.di.VideoOfflineSettingsComponent
            public final j0t0 re() {
                return (j0t0) this.a.getValue();
            }
        };
    }

    i0t0 ce();

    j0t0 re();
}
