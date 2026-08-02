package com.vk.newsfeed.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.gd60;
import xsna.pwj0;

/* compiled from: NewsFeedBridgeComponent.kt */
/* loaded from: classes.dex */
public interface NewsFeedBridgeComponent extends DiScopedComponent<pwj0> {
    public static final /* synthetic */ Companion Companion = Companion.a;

    /* compiled from: NewsFeedBridgeComponent.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final NewsFeedBridgeComponent STUB = new NewsFeedBridgeComponent() { // from class: com.vk.newsfeed.api.di.NewsFeedBridgeComponent$Companion$STUB$1
            public final gd60 a = gd60.a.getSTUB();

            @Override // com.vk.newsfeed.api.di.NewsFeedBridgeComponent
            public final gd60 Ad() {
                return this.a;
            }
        };

        public final NewsFeedBridgeComponent getSTUB() {
            return STUB;
        }
    }

    gd60 Ad();
}
