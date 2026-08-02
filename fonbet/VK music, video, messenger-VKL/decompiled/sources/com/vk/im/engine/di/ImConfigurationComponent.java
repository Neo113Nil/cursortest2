package com.vk.im.engine.di;

import android.util.Size;
import com.vk.di.component.DiScopedComponent;
import xsna.f1w;
import xsna.h1w;
import xsna.pwj0;
import xsna.uuf0;

/* compiled from: ImConfigurationComponent.kt */
/* loaded from: classes.dex */
public interface ImConfigurationComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImConfigurationComponent.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImConfigurationComponent$Companion$STUB$1 STUB = new ImConfigurationComponent() { // from class: com.vk.im.engine.di.ImConfigurationComponent$Companion$STUB$1
            public final a a;
            public final h1w b;

            /* compiled from: ImConfigurationComponent.kt */
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
                a aVar = new a();
                new Size(0, 0);
                this.a = aVar;
                this.b = new h1w();
            }

            @Override // com.vk.im.engine.di.ImConfigurationComponent
            public final f1w b0() {
                return this.b;
            }

            @Override // com.vk.im.engine.di.ImConfigurationComponent
            public final uuf0 q6() {
                return this.a;
            }
        };
    }

    f1w b0();

    uuf0 q6();
}
