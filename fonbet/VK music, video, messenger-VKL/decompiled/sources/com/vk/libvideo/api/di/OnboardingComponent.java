package com.vk.libvideo.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.di.OnboardingComponent;
import com.vk.libvideo.api.di.OnboardingComponent$Companion$STUB$1;
import xsna.be80;
import xsna.cd80;
import xsna.ih80;
import xsna.izs;
import xsna.pwj0;

/* compiled from: OnboardingComponent.kt */
/* loaded from: classes2.dex */
public interface OnboardingComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: OnboardingComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static final a b = new a();
        private static final OnboardingComponent STUB = new OnboardingComponent() { // from class: com.vk.libvideo.api.di.OnboardingComponent$Companion$STUB$1
            public final a a = new a();
            public final b b = new b();

            /* compiled from: OnboardingComponent.kt */
            public static final class a implements be80 {
            }

            /* compiled from: OnboardingComponent.kt */
            public static final class b implements ih80 {
                @Override // xsna.ih80
                public final void a(izs izsVar) {
                    izsVar.invoke(OnboardingComponent.Companion.b);
                }
            }

            @Override // com.vk.libvideo.api.di.OnboardingComponent
            public final a Yd() {
                return this.a;
            }

            @Override // com.vk.libvideo.api.di.OnboardingComponent
            public final b uc() {
                return this.b;
            }
        };

        /* compiled from: OnboardingComponent.kt */
        public static final class a implements cd80 {
        }

        public final OnboardingComponent getSTUB() {
            return STUB;
        }
    }

    OnboardingComponent$Companion$STUB$1.a Yd();

    OnboardingComponent$Companion$STUB$1.b uc();
}
