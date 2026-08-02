package com.vk.clips.interests.api.di;

import com.vk.clips.interests.api.ClipsInterestsStatusProvider;
import com.vk.di.component.DiScopedComponent;
import xsna.hhe;
import xsna.pge;
import xsna.pwj0;
import xsna.uge;

/* compiled from: ClipsInterestsComponent.kt */
/* loaded from: classes16.dex */
public interface ClipsInterestsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ClipsInterestsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ClipsInterestsComponent STUB = new ClipsInterestsComponent() { // from class: com.vk.clips.interests.api.di.ClipsInterestsComponent$Companion$STUB$1
            @Override // com.vk.clips.interests.api.di.ClipsInterestsComponent
            public final hhe Rd() {
                throw new UnsupportedOperationException("called interestsNavigatorProvider on STUB");
            }

            @Override // com.vk.clips.interests.api.di.ClipsInterestsComponent
            public final pge Re() {
                throw new UnsupportedOperationException("called interestsInteractor on STUB");
            }

            @Override // com.vk.clips.interests.api.di.ClipsInterestsComponent
            public final uge e() {
                throw new UnsupportedOperationException("called launcher on STUB");
            }

            @Override // com.vk.clips.interests.api.di.ClipsInterestsComponent
            public final ClipsInterestsStatusProvider n5() {
                throw new UnsupportedOperationException("called interestsStatusProvider on STUB");
            }
        };

        public final ClipsInterestsComponent getSTUB() {
            return STUB;
        }
    }

    hhe Rd();

    pge Re();

    uge e();

    ClipsInterestsStatusProvider n5();
}
