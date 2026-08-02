package com.vk.libvideo.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.h0w0;
import xsna.pwj0;
import xsna.xzv0;

/* compiled from: VkVideoPromoComponent.kt */
/* loaded from: classes2.dex */
public interface VkVideoPromoComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VkVideoPromoComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VkVideoPromoComponent STUB = new VkVideoPromoComponent() { // from class: com.vk.libvideo.api.di.VkVideoPromoComponent$Companion$STUB$1
            @Override // com.vk.libvideo.api.di.VkVideoPromoComponent
            public final h0w0 Ka() {
                return h0w0.a.getSTUB();
            }

            @Override // com.vk.libvideo.api.di.VkVideoPromoComponent
            public final xzv0 d7() {
                return xzv0.a.a.getSTUB();
            }
        };

        public final VkVideoPromoComponent getSTUB() {
            return STUB;
        }
    }

    h0w0 Ka();

    xzv0 d7();
}
