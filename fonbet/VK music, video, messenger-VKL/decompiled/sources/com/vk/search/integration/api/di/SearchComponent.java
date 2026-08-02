package com.vk.search.integration.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.kqh0;

/* compiled from: SearchComponent.kt */
/* loaded from: classes5.dex */
public interface SearchComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: SearchComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final SearchComponent STUB = new SearchComponent() { // from class: com.vk.search.integration.api.di.SearchComponent$Companion$STUB$1
            public final kqh0 a;

            {
                kqh0.a.getClass();
                this.a = (kqh0) kqh0.a.b.getValue();
            }

            @Override // com.vk.search.integration.api.di.SearchComponent
            public final kqh0 V3() {
                return this.a;
            }
        };

        public final SearchComponent getSTUB() {
            return STUB;
        }
    }

    kqh0 V3();
}
