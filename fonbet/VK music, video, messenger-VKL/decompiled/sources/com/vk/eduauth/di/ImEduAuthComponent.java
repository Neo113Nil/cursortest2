package com.vk.eduauth.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.x0w;

/* compiled from: ImEduAuthComponent.kt */
/* loaded from: classes18.dex */
public interface ImEduAuthComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImEduAuthComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImEduAuthComponent STUB = new ImEduAuthComponent() { // from class: com.vk.eduauth.di.ImEduAuthComponent$Companion$STUB$1
            public final x0w a = x0w.a.a.getSTUB();

            @Override // com.vk.eduauth.di.ImEduAuthComponent
            public final x0w w2() {
                return this.a;
            }
        };

        public final ImEduAuthComponent getSTUB() {
            return STUB;
        }
    }

    x0w w2();
}
