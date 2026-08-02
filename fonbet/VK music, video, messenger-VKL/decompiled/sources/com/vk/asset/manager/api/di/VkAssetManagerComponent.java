package com.vk.asset.manager.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.aos0;
import xsna.gbu0;
import xsna.pwj0;
import xsna.xx40;

/* compiled from: VkAssetManagerComponent.kt */
/* loaded from: classes15.dex */
public interface VkAssetManagerComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VkAssetManagerComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VkAssetManagerComponent STUB = new VkAssetManagerComponent() { // from class: com.vk.asset.manager.api.di.VkAssetManagerComponent$Companion$STUB$1
            public final a a = new a();

            @Override // com.vk.asset.manager.api.di.VkAssetManagerComponent
            public final gbu0 Se() {
                return this.a;
            }

            /* compiled from: VkAssetManagerComponent.kt */
            public static final class a implements gbu0 {
                @Override // xsna.gbu0
                public final void a(String str, aos0 aos0Var, xx40 xx40Var) {
                }
            }
        };

        public final VkAssetManagerComponent getSTUB() {
            return STUB;
        }
    }

    gbu0 Se();
}
