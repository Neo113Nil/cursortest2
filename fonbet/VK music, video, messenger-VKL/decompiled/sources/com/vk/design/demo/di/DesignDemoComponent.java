package com.vk.design.demo.di;

import android.content.Context;
import com.vk.di.component.DiUnscopedComponent;
import xsna.s3m;

/* compiled from: DesignDemoComponent.kt */
/* loaded from: classes18.dex */
public interface DesignDemoComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: DesignDemoComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final DesignDemoComponent STUB = new DesignDemoComponent() { // from class: com.vk.design.demo.di.DesignDemoComponent$Companion$STUB$1
            public final a a = new a();

            @Override // com.vk.design.demo.di.DesignDemoComponent
            public final s3m f() {
                return this.a;
            }

            /* compiled from: DesignDemoComponent.kt */
            public static final class a implements s3m {
                @Override // xsna.s3m
                public final void a(Context context) {
                }
            }
        };

        public final DesignDemoComponent getSTUB() {
            return STUB;
        }
    }

    s3m f();
}
