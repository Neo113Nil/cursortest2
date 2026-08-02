package com.vk.clips.viewer.vk;

import com.vk.di.component.DiScopedComponent;
import xsna.byg0;
import xsna.pwj0;

/* compiled from: ClipsViewerSideControlsConfigComponent.kt */
/* loaded from: classes17.dex */
public interface ClipsViewerSideControlsConfigComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ClipsViewerSideControlsConfigComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ClipsViewerSideControlsConfigComponent STUB = new ClipsViewerSideControlsConfigComponent() { // from class: com.vk.clips.viewer.vk.ClipsViewerSideControlsConfigComponent$Companion$STUB$1
            @Override // com.vk.clips.viewer.vk.ClipsViewerSideControlsConfigComponent
            public final byg0 getConfig() {
                return null;
            }
        };

        public final ClipsViewerSideControlsConfigComponent getSTUB() {
            return STUB;
        }
    }

    byg0 getConfig();
}
