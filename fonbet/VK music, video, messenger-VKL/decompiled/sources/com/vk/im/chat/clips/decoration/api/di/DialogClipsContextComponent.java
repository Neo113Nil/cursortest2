package com.vk.im.chat.clips.decoration.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.qbm;

/* compiled from: DialogClipsContextComponent.kt */
/* loaded from: classes.dex */
public interface DialogClipsContextComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: DialogClipsContextComponent.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final DialogClipsContextComponent STUB = new DialogClipsContextComponent() { // from class: com.vk.im.chat.clips.decoration.api.di.DialogClipsContextComponent$Companion$STUB$1
            public final a a = new a();

            @Override // com.vk.im.chat.clips.decoration.api.di.DialogClipsContextComponent
            public final qbm z() {
                return this.a;
            }

            /* compiled from: DialogClipsContextComponent.kt */
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

        public final DialogClipsContextComponent getSTUB() {
            return STUB;
        }
    }

    qbm z();
}
