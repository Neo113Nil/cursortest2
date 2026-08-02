package com.vk.im.edu.common.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.a6p;
import xsna.e7p;
import xsna.j6p;
import xsna.u6p;

/* compiled from: EduCommonComponent.kt */
/* loaded from: classes2.dex */
public interface EduCommonComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: EduCommonComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final EduCommonComponent$Companion$STUB$1 STUB = new EduCommonComponent() { // from class: com.vk.im.edu.common.api.di.EduCommonComponent$Companion$STUB$1
            public final u6p a = u6p.a.getSTUB();
            public final a6p b = a6p.a.a.getSTUB();
            public final e7p c = e7p.a.getSTUB();
            public final j6p d = j6p.a.a.getSTUB();

            @Override // com.vk.im.edu.common.api.di.EduCommonComponent
            public final e7p g2() {
                return this.c;
            }

            @Override // com.vk.im.edu.common.api.di.EduCommonComponent
            public final j6p hc() {
                return this.d;
            }

            @Override // com.vk.im.edu.common.api.di.EduCommonComponent
            public final u6p ue() {
                return this.a;
            }

            @Override // com.vk.im.edu.common.api.di.EduCommonComponent
            public final a6p x7() {
                return this.b;
            }
        };
    }

    e7p g2();

    j6p hc();

    u6p ue();

    a6p x7();
}
