package com.vk.libvideo.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.di.WarmupComponent$Companion$STUB$1;
import xsna.bbx0;
import xsna.c8m;
import xsna.g8m;
import xsna.pwj0;

/* compiled from: WarmupComponent.kt */
/* loaded from: classes2.dex */
public interface WarmupComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: WarmupComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static final a b = new a();
        private static final WarmupComponent STUB = new WarmupComponent() { // from class: com.vk.libvideo.api.di.WarmupComponent$Companion$STUB$1
            public final a a = new a();

            /* compiled from: WarmupComponent.kt */
            public static final class a implements bbx0 {
            }

            @Override // com.vk.libvideo.api.di.WarmupComponent
            public final a Qe() {
                return this.a;
            }
        };

        /* compiled from: WarmupComponent.kt */
        public static final class a implements c8m<WarmupComponent, pwj0> {
            @Override // xsna.c8m
            public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
                return Companion.a.getSTUB();
            }
        }

        public final WarmupComponent getSTUB() {
            return STUB;
        }
    }

    WarmupComponent$Companion$STUB$1.a Qe();
}
