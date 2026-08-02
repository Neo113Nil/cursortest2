package com.vk.clips.sdk.screens.feed.decorator.api.di;

import com.vk.clips.sdk.shared.decoration.ClipsDecorationKey;
import com.vk.di.component.DiUnscopedComponent;
import xsna.c48;
import xsna.kpe;
import xsna.l7p0;
import xsna.x8l;

/* compiled from: ClipsDecorationComponent.kt */
/* loaded from: classes17.dex */
public interface ClipsDecorationComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: ClipsDecorationComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ClipsDecorationComponent STUB = new ClipsDecorationComponent() { // from class: com.vk.clips.sdk.screens.feed.decorator.api.di.ClipsDecorationComponent$Companion$STUB$1
            @Override // com.vk.clips.sdk.screens.feed.decorator.api.di.ClipsDecorationComponent
            public final c48 A8(ClipsDecorationKey clipsDecorationKey) {
                return c48.a.a.getSTUB();
            }

            @Override // com.vk.clips.sdk.screens.feed.decorator.api.di.ClipsDecorationComponent
            public final l7p0 N3(ClipsDecorationKey clipsDecorationKey) {
                return l7p0.a.a.getSTUB();
            }

            @Override // com.vk.clips.sdk.screens.feed.decorator.api.di.ClipsDecorationComponent
            public final kpe j8(ClipsDecorationKey clipsDecorationKey) {
                return kpe.a.a.getSTUB();
            }

            @Override // com.vk.clips.sdk.screens.feed.decorator.api.di.ClipsDecorationComponent
            public final x8l sb(ClipsDecorationKey clipsDecorationKey) {
                return x8l.a.a.getSTUB();
            }
        };

        public final ClipsDecorationComponent getSTUB() {
            return STUB;
        }
    }

    c48 A8(ClipsDecorationKey clipsDecorationKey);

    l7p0 N3(ClipsDecorationKey clipsDecorationKey);

    kpe j8(ClipsDecorationKey clipsDecorationKey);

    x8l sb(ClipsDecorationKey clipsDecorationKey);
}
