package com.vk.profile.community.details.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.w1h;

/* compiled from: CommunityDetailsComponent.kt */
/* loaded from: classes.dex */
public interface CommunityDetailsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: CommunityDetailsComponent.kt */
    /* loaded from: classes5.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final CommunityDetailsComponent STUB = new CommunityDetailsComponent() { // from class: com.vk.profile.community.details.api.di.CommunityDetailsComponent$Companion$STUB$1
            public final w1h a = w1h.a.a.getSTUB();

            @Override // com.vk.profile.community.details.api.di.CommunityDetailsComponent
            public final w1h a() {
                return this.a;
            }
        };

        public final CommunityDetailsComponent getSTUB() {
            return STUB;
        }
    }

    w1h a();
}
