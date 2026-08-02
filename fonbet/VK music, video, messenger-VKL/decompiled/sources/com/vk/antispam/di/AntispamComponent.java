package com.vk.antispam.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.cw2;

/* compiled from: AntispamComponent.kt */
/* loaded from: classes14.dex */
public interface AntispamComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: AntispamComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final AntispamComponent STUB = new AntispamComponent() { // from class: com.vk.antispam.di.AntispamComponent$Companion$STUB$1
            public final cw2 a = cw2.a.a.getSTUB();

            @Override // com.vk.antispam.di.AntispamComponent
            public final cw2 ae() {
                return this.a;
            }
        };

        public final AntispamComponent getSTUB() {
            return STUB;
        }
    }

    cw2 ae();
}
