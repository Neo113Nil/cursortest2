package com.vk.video.recast.di;

import com.vk.di.component.DiScopedComponent;
import xsna.c8m;
import xsna.g8m;
import xsna.pwj0;
import xsna.x8f0;

/* compiled from: RecastDiComponent.kt */
/* loaded from: classes6.dex */
public interface RecastDiComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: RecastDiComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final RecastDiComponent STUB = new RecastDiComponent() { // from class: com.vk.video.recast.di.RecastDiComponent$Companion$STUB$1
            public final x8f0 a = x8f0.a.getSTUB();

            @Override // com.vk.video.recast.di.RecastDiComponent
            public final x8f0 T6() {
                return this.a;
            }
        };

        public final RecastDiComponent getSTUB() {
            return STUB;
        }
    }

    /* compiled from: RecastDiComponent.kt */
    public static final class a implements c8m<RecastDiComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return RecastDiComponent.Companion.getSTUB();
        }
    }

    x8f0 T6();
}
