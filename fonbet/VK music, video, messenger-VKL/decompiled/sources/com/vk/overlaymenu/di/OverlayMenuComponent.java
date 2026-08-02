package com.vk.overlaymenu.di;

import android.app.Activity;
import android.app.Application;
import com.vk.di.component.DiScopedComponent;
import xsna.b4j0;
import xsna.l370;
import xsna.och0;
import xsna.pwj0;
import xsna.u290;
import xsna.w290;
import xsna.y290;

/* compiled from: OverlayMenuComponent.kt */
/* loaded from: classes4.dex */
public interface OverlayMenuComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: OverlayMenuComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final OverlayMenuComponent STUB = new OverlayMenuComponent() { // from class: com.vk.overlaymenu.di.OverlayMenuComponent$Companion$STUB$1
            public final a a = new a();

            @Override // com.vk.overlaymenu.di.OverlayMenuComponent
            public final w290 Z5() {
                return this.a;
            }

            /* compiled from: OverlayMenuComponent.kt */
            public static final class a implements w290 {
                public final C1450a a = new C1450a();

                @Override // xsna.w290
                public final u290 getConfig() {
                    return this.a;
                }

                @Override // xsna.w290
                public final boolean isInitialized() {
                    return false;
                }

                @Override // xsna.w290
                public final void reset() {
                }

                /* compiled from: OverlayMenuComponent.kt */
                /* renamed from: com.vk.overlaymenu.di.OverlayMenuComponent$Companion$STUB$1$a$a, reason: collision with other inner class name */
                public static final class C1450a implements u290 {
                    public boolean b;

                    @Override // xsna.u290
                    public final boolean c() {
                        return false;
                    }

                    @Override // xsna.u290
                    public final boolean getEnabled() {
                        return this.b;
                    }

                    @Override // xsna.u290
                    public final void setEnabled(boolean z) {
                        this.b = z;
                    }

                    @Override // xsna.u290
                    public final void a(och0 och0Var) {
                    }

                    @Override // xsna.u290
                    public final void b(boolean z) {
                    }
                }

                @Override // xsna.w290
                public final void update(boolean z) {
                }

                @Override // xsna.w290
                public final void a(Application application, b4j0 b4j0Var, y290 y290Var, l370 l370Var, Activity activity) {
                }
            }
        };

        public final OverlayMenuComponent getSTUB() {
            return STUB;
        }
    }

    w290 Z5();
}
