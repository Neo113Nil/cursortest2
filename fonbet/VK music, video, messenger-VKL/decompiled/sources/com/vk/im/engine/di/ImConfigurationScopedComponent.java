package com.vk.im.engine.di;

import android.util.Size;
import com.vk.di.component.DiScopedComponent;
import xsna.acw;
import xsna.f1w;
import xsna.h1w;
import xsna.uuf0;

/* compiled from: ImConfigurationScopedComponent.kt */
/* loaded from: classes2.dex */
public interface ImConfigurationScopedComponent extends DiScopedComponent<acw> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImConfigurationScopedComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImConfigurationScopedComponent$Companion$STUB$1 STUB = new ImConfigurationScopedComponent() { // from class: com.vk.im.engine.di.ImConfigurationScopedComponent$Companion$STUB$1
            public final h1w a;

            /* compiled from: ImConfigurationScopedComponent.kt */
            public static final class a implements uuf0 {
                @Override // xsna.uuf0
                public final boolean a() {
                    return false;
                }

                @Override // xsna.uuf0
                public final boolean b() {
                    return false;
                }
            }

            {
                new Size(0, 0);
                this.a = new h1w();
            }

            @Override // com.vk.im.engine.di.ImConfigurationScopedComponent
            public final f1w b0() {
                return this.a;
            }
        };
    }

    f1w b0();
}
