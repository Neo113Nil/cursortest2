package com.vk.im.chat.clips.decoration.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.acw;
import xsna.zod;

/* compiled from: ImChatClipsDecorationScopedComponent.kt */
/* loaded from: classes2.dex */
public interface ImChatClipsDecorationScopedComponent extends DiScopedComponent<acw> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImChatClipsDecorationScopedComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImChatClipsDecorationScopedComponent STUB = new ImChatClipsDecorationScopedComponent() { // from class: com.vk.im.chat.clips.decoration.api.di.ImChatClipsDecorationScopedComponent$Companion$STUB$1
            @Override // com.vk.im.chat.clips.decoration.api.di.ImChatClipsDecorationScopedComponent
            public final zod Rc() {
                return zod.a.getSTUB();
            }
        };

        public final ImChatClipsDecorationScopedComponent getSTUB() {
            return STUB;
        }
    }

    zod Rc();
}
