package com.vk.clips.viewer.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.s2f;

/* compiled from: ClipsViewerAdapterComponent.kt */
/* loaded from: classes17.dex */
public interface ClipsViewerAdapterComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ClipsViewerAdapterComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ClipsViewerAdapterComponent STUB = new ClipsViewerAdapterComponent() { // from class: com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent$Companion$STUB$1
            @Override // com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent
            public final s2f e0() {
                throw new UnsupportedOperationException("called videoFileAdapter on STUB");
            }
        };

        public final ClipsViewerAdapterComponent getSTUB() {
            return STUB;
        }
    }

    s2f e0();
}
