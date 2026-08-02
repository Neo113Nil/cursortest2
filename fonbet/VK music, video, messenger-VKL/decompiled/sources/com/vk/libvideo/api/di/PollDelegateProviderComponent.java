package com.vk.libvideo.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;

/* compiled from: PollDelegateProviderComponent.kt */
/* loaded from: classes2.dex */
public interface PollDelegateProviderComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: PollDelegateProviderComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final PollDelegateProviderComponent STUB = new PollDelegateProviderComponent() { // from class: com.vk.libvideo.api.di.PollDelegateProviderComponent$Companion$STUB$1
            @Override // com.vk.libvideo.api.di.PollDelegateProviderComponent
            public final a ld() {
                return new a();
            }
        };

        public final PollDelegateProviderComponent getSTUB() {
            return STUB;
        }
    }

    a ld();
}
