package com.vk.qr.rustore.api;

import androidx.fragment.app.Fragment;
import com.vk.di.component.DiUnscopedComponent;
import xsna.b7m;
import xsna.e7m;

/* compiled from: VkRustoreQrComponent.kt */
/* loaded from: classes.dex */
public interface VkRustoreQrComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: VkRustoreQrComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VkRustoreQrComponent STUB = new VkRustoreQrComponent() { // from class: com.vk.qr.rustore.api.VkRustoreQrComponent$Companion$STUB$1
            @Override // com.vk.qr.rustore.api.VkRustoreQrComponent
            public final Fragment y1() {
                throw new IllegalStateException("Модуль :sdk:sak:qr-rustore:impl не подключен");
            }
        };
        public static final a b = new a();

        /* compiled from: VkRustoreQrComponent.kt */
        public static final class a implements b7m<VkRustoreQrComponent> {
            @Override // xsna.b7m
            public final DiUnscopedComponent a(e7m e7mVar) {
                return Companion.a.getSTUB();
            }
        }

        public final VkRustoreQrComponent getSTUB() {
            return STUB;
        }
    }

    Fragment y1();
}
