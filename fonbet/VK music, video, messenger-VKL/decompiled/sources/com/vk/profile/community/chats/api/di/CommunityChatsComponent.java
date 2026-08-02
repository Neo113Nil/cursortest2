package com.vk.profile.community.chats.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.ivg;
import xsna.pwj0;

/* compiled from: CommunityChatsComponent.kt */
/* loaded from: classes.dex */
public interface CommunityChatsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: CommunityChatsComponent.kt */
    /* loaded from: classes5.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final CommunityChatsComponent STUB = new CommunityChatsComponent() { // from class: com.vk.profile.community.chats.api.di.CommunityChatsComponent$Companion$STUB$1
            public final ivg a = ivg.a.a.getSTUB();

            @Override // com.vk.profile.community.chats.api.di.CommunityChatsComponent
            public final ivg a() {
                return this.a;
            }
        };

        public final CommunityChatsComponent getSTUB() {
            return STUB;
        }
    }

    ivg a();
}
