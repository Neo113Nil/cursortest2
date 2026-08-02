package com.vk.libvideo.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.a0w0;
import xsna.pwj0;

/* compiled from: VkVideoLiveSDKComponent.kt */
/* loaded from: classes2.dex */
public interface VkVideoLiveSDKComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VkVideoLiveSDKComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VkVideoLiveSDKComponent STUB = new VkVideoLiveSDKComponent() { // from class: com.vk.libvideo.api.di.VkVideoLiveSDKComponent$Companion$STUB$1
            public final a0w0 a = a0w0.a.getSTUB();

            @Override // com.vk.libvideo.api.di.VkVideoLiveSDKComponent
            public final a0w0 F0() {
                return this.a;
            }
        };

        public final VkVideoLiveSDKComponent getSTUB() {
            return STUB;
        }
    }

    a0w0 F0();
}
