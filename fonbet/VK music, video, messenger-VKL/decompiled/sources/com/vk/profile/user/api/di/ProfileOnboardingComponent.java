package com.vk.profile.user.api.di;

import android.view.View;
import androidx.lifecycle.m;
import com.vk.di.component.DiUnscopedComponent;
import xsna.gzs;
import xsna.k0e0;

/* compiled from: ProfileOnboardingComponent.kt */
/* loaded from: classes5.dex */
public interface ProfileOnboardingComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: ProfileOnboardingComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ProfileOnboardingComponent STUB = new ProfileOnboardingComponent() { // from class: com.vk.profile.user.api.di.ProfileOnboardingComponent$Companion$STUB$1
            public final a a = new a();

            @Override // com.vk.profile.user.api.di.ProfileOnboardingComponent
            public final k0e0 Fe() {
                return this.a;
            }

            /* compiled from: ProfileOnboardingComponent.kt */
            public static final class a implements k0e0 {
                @Override // xsna.k0e0
                public final boolean b(m mVar, View view, gzs gzsVar) {
                    return false;
                }

                @Override // xsna.k0e0
                public final void a(m mVar, View view) {
                }
            }
        };

        public final ProfileOnboardingComponent getSTUB() {
            return STUB;
        }
    }

    k0e0 Fe();
}
