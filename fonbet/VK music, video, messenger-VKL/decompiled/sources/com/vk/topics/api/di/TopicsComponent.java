package com.vk.topics.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.ji7;
import xsna.n9p0;
import xsna.pwj0;

/* compiled from: TopicsComponent.kt */
/* loaded from: classes11.dex */
public interface TopicsComponent extends DiScopedComponent<pwj0> {
    public static final /* synthetic */ Companion Companion = Companion.a;

    /* compiled from: TopicsComponent.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final TopicsComponent STUB = new TopicsComponent() { // from class: com.vk.topics.api.di.TopicsComponent$Companion$STUB$1
            public final n9p0 a = n9p0.a.a.getSTUB();
            public final ji7 b = ji7.a.getSTUB();

            @Override // com.vk.topics.api.di.TopicsComponent
            public final ji7 fe() {
                return this.b;
            }

            @Override // com.vk.topics.api.di.TopicsComponent
            public final n9p0 n8() {
                return this.a;
            }
        };

        public final TopicsComponent getSTUB() {
            return STUB;
        }
    }

    ji7 fe();

    n9p0 n8();
}
