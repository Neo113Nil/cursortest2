package com.vk.profile.community.catalog.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.gog;
import xsna.pwj0;

/* compiled from: CommunitiesCatalogComponent.kt */
/* loaded from: classes5.dex */
public interface CommunitiesCatalogComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: CommunitiesCatalogComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final CommunitiesCatalogComponent STUB = new CommunitiesCatalogComponent() { // from class: com.vk.profile.community.catalog.api.di.CommunitiesCatalogComponent$Companion$STUB$1
            public final gog a = gog.a.a.getSTUB();

            @Override // com.vk.profile.community.catalog.api.di.CommunitiesCatalogComponent
            public final gog a() {
                return this.a;
            }
        };

        public final CommunitiesCatalogComponent getSTUB() {
            return STUB;
        }
    }

    gog a();
}
