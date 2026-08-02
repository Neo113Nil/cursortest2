package com.vk.translate.api.di;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.Peer;
import xsna.a1w;
import xsna.pnp0;
import xsna.pwj0;

/* compiled from: TranslateComponent.kt */
/* loaded from: classes6.dex */
public interface TranslateComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: TranslateComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final TranslateComponent STUB = new TranslateComponent() { // from class: com.vk.translate.api.di.TranslateComponent$Companion$STUB$1
            public final a a = new a();

            @Override // com.vk.translate.api.di.TranslateComponent
            public final pnp0 Q6() {
                return this.a;
            }

            /* compiled from: TranslateComponent.kt */
            public static final class a implements pnp0 {
                @Override // xsna.pnp0
                public final void a(a1w a1wVar, FragmentManager fragmentManager) {
                }

                @Override // xsna.pnp0
                public final void b(a1w a1wVar, Peer peer, int i, String str, FragmentManager fragmentManager, Context context) {
                }
            }
        };

        public final TranslateComponent getSTUB() {
            return STUB;
        }
    }

    pnp0 Q6();
}
