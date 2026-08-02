package com.vk.audience.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.ab4;
import xsna.db4;
import xsna.ia4;
import xsna.pwj0;

/* compiled from: AudienceResearchComponent.kt */
/* loaded from: classes.dex */
public interface AudienceResearchComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: AudienceResearchComponent.kt */
    /* loaded from: classes15.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final AudienceResearchComponent STUB = new AudienceResearchComponent() { // from class: com.vk.audience.api.di.AudienceResearchComponent$Companion$STUB$1
            public final ia4 a = ia4.a.a.getSTUB();
            public final db4 b = db4.a.a.getSTUB();
            public final ab4 c = ab4.a.a.getSTUB();

            @Override // com.vk.audience.api.di.AudienceResearchComponent
            public final db4 Z2() {
                return this.b;
            }

            @Override // com.vk.audience.api.di.AudienceResearchComponent
            public final ia4 b() {
                return this.a;
            }

            @Override // com.vk.audience.api.di.AudienceResearchComponent
            public final ab4 y7() {
                return this.c;
            }
        };

        public final AudienceResearchComponent getSTUB() {
            return STUB;
        }
    }

    db4 Z2();

    ia4 b();

    ab4 y7();
}
