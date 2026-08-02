package com.vk.musc.kidsmode.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import xsna.pwj0;
import xsna.xl40;

/* compiled from: MusicKidsModeComponent.kt */
/* loaded from: classes3.dex */
public interface MusicKidsModeComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: MusicKidsModeComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MusicKidsModeComponent STUB = new MusicKidsModeComponent() { // from class: com.vk.musc.kidsmode.api.di.MusicKidsModeComponent$Companion$STUB$1
            @Override // com.vk.musc.kidsmode.api.di.MusicKidsModeComponent
            public final KidsModeRestrictionRenderer T9() {
                return KidsModeRestrictionRenderer.a.a.getSTUB();
            }

            @Override // com.vk.musc.kidsmode.api.di.MusicKidsModeComponent
            public final xl40 n() {
                return xl40.a.getSTUB();
            }
        };

        public final MusicKidsModeComponent getSTUB() {
            return STUB;
        }
    }

    KidsModeRestrictionRenderer T9();

    xl40 n();
}
