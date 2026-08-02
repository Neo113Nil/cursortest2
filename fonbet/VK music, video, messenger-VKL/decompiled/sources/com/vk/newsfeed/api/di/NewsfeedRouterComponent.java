package com.vk.newsfeed.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.newsfeed.api.NewsfeedRouter;
import xsna.pwj0;

/* compiled from: NewsfeedRouterComponent.kt */
/* loaded from: classes3.dex */
public interface NewsfeedRouterComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: NewsfeedRouterComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final NewsfeedRouterComponent STUB = new NewsfeedRouterComponent() { // from class: com.vk.newsfeed.api.di.NewsfeedRouterComponent$Companion$STUB$1
            public final NewsfeedRouter a = NewsfeedRouter.c.a.getSTUB();

            @Override // com.vk.newsfeed.api.di.NewsfeedRouterComponent
            public final NewsfeedRouter l0() {
                return this.a;
            }
        };

        public final NewsfeedRouterComponent getSTUB() {
            return STUB;
        }
    }

    NewsfeedRouter l0();
}
