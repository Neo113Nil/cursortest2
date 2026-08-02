package com.vk.profile.community.address.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.xqg;

/* compiled from: CommunityAddressComponent.kt */
/* loaded from: classes.dex */
public interface CommunityAddressComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: CommunityAddressComponent.kt */
    /* loaded from: classes5.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final CommunityAddressComponent STUB = new CommunityAddressComponent() { // from class: com.vk.profile.community.address.api.di.CommunityAddressComponent$Companion$STUB$1
            public final xqg a = xqg.a.a.getSTUB();

            @Override // com.vk.profile.community.address.api.di.CommunityAddressComponent
            public final xqg a() {
                return this.a;
            }
        };

        public final CommunityAddressComponent getSTUB() {
            return STUB;
        }
    }

    xqg a();
}
