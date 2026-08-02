package com.vk.profile.community.subscription.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.b7h;
import xsna.c3i;
import xsna.c7h;
import xsna.n6h;
import xsna.o6h;
import xsna.y2i;

/* compiled from: CommunitySubscriptionComponent.kt */
/* loaded from: classes5.dex */
public interface CommunitySubscriptionComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: CommunitySubscriptionComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final CommunitySubscriptionComponent STUB = new CommunitySubscriptionComponent() { // from class: com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent$Companion$STUB$1
            public final n6h a = n6h.a.a.getSTUB();
            public final b7h b = b7h.a.a.getSTUB();
            public final c7h c = c7h.a.a.getSTUB();
            public final o6h d = o6h.a.a.getSTUB();
            public final c3i e = c3i.a.a.getSTUB();
            public final y2i f = y2i.a.a.getSTUB();

            @Override // com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent
            public final c7h D6() {
                return this.c;
            }

            @Override // com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent
            public final o6h E5() {
                return this.d;
            }

            @Override // com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent
            public final y2i a() {
                return this.f;
            }

            @Override // com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent
            public final c3i c7() {
                return this.e;
            }
        };

        public final CommunitySubscriptionComponent getSTUB() {
            return STUB;
        }
    }

    c7h D6();

    o6h E5();

    y2i a();

    c3i c7();
}
