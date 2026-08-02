package com.vk.restriction.di;

import com.vk.di.component.DiScopedComponent;
import xsna.hdt0;
import xsna.pwj0;

/* compiled from: VideoRestrictionManagerComponent.kt */
/* loaded from: classes11.dex */
public interface VideoRestrictionManagerComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoRestrictionManagerComponent.kt */
    /* loaded from: classes5.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoRestrictionManagerComponent STUB = new VideoRestrictionManagerComponent() { // from class: com.vk.restriction.di.VideoRestrictionManagerComponent$Companion$STUB$1
            @Override // com.vk.restriction.di.VideoRestrictionManagerComponent
            public final hdt0 n2() {
                return new a();
            }
        };

        public final VideoRestrictionManagerComponent getSTUB() {
            return STUB;
        }
    }

    hdt0 n2();
}
