package com.vk.im.chat.clips.decoration.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.acw;
import xsna.qbm;

/* compiled from: DialogClipsContextScopedComponent.kt */
/* loaded from: classes2.dex */
public interface DialogClipsContextScopedComponent extends DiScopedComponent<acw> {
    public static final Companion Companion = Companion.a;

    /* compiled from: DialogClipsContextScopedComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final DialogClipsContextScopedComponent STUB = new DialogClipsContextScopedComponent() { // from class: com.vk.im.chat.clips.decoration.api.di.DialogClipsContextScopedComponent$Companion$STUB$1
            public final a a = new a();

            @Override // com.vk.im.chat.clips.decoration.api.di.DialogClipsContextScopedComponent
            public final qbm z() {
                return this.a;
            }

            /* compiled from: DialogClipsContextScopedComponent.kt */
            public static final class a implements qbm {
                @Override // xsna.qbm
                public final String c(long j) {
                    return null;
                }

                @Override // xsna.qbm
                public final void a(long j) {
                }

                @Override // xsna.qbm
                public final void b(long j) {
                }
            }
        };

        public final DialogClipsContextScopedComponent getSTUB() {
            return STUB;
        }
    }

    qbm z();
}
