package com.vk.superapp.local.storage.js.bridge.api.di;

import com.vk.di.component.DiScopedComponent;
import java.util.List;
import xsna.ox8;
import xsna.pp20;
import xsna.pwj0;
import xsna.z4y;

/* compiled from: LocalStorageComponent.kt */
/* loaded from: classes6.dex */
public interface LocalStorageComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: LocalStorageComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final LocalStorageComponent STUB = new LocalStorageComponent() { // from class: com.vk.superapp.local.storage.js.bridge.api.di.LocalStorageComponent$Companion$STUB$1
            public final a a = new a();

            /* compiled from: LocalStorageComponent.kt */
            public static final class a implements pp20 {
                @Override // xsna.pp20
                public final Object b(long j, List list, z4y.b bVar) {
                    return ox8.c.a;
                }

                @Override // xsna.pp20
                public final Object c(long j, List list, z4y.a aVar) {
                    return ox8.c.a;
                }

                @Override // xsna.pp20
                public final Object d(long j, String str, String str2, z4y.e eVar) {
                    return ox8.c.a;
                }

                @Override // xsna.pp20
                public final Object e(long j, z4y.c cVar) {
                    return ox8.c.a;
                }

                @Override // xsna.pp20
                public final Object f(long j, String str, z4y.d dVar) {
                    return ox8.c.a;
                }
            }

            @Override // com.vk.superapp.local.storage.js.bridge.api.di.LocalStorageComponent
            public final pp20 R6() {
                return this.a;
            }
        };

        public final LocalStorageComponent getSTUB() {
            return STUB;
        }
    }

    pp20 R6();
}
