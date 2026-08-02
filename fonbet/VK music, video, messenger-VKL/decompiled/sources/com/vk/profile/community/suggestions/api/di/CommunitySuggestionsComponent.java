package com.vk.profile.community.suggestions.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.l3i;

/* compiled from: CommunitySuggestionsComponent.kt */
/* loaded from: classes5.dex */
public interface CommunitySuggestionsComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: CommunitySuggestionsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final CommunitySuggestionsComponent STUB = new CommunitySuggestionsComponent() { // from class: com.vk.profile.community.suggestions.api.di.CommunitySuggestionsComponent$Companion$STUB$1
            public final l3i a = l3i.a.a.getSTUB();

            @Override // com.vk.profile.community.suggestions.api.di.CommunitySuggestionsComponent
            public final l3i a() {
                return this.a;
            }
        };

        public final CommunitySuggestionsComponent getSTUB() {
            return STUB;
        }
    }

    l3i a();
}
