package com.vk.catalog.mvi.legacy.api;

import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.Map;
import xsna.h8a;
import xsna.jgp;

/* compiled from: CatalogLegacyBlockRegister.kt */
/* loaded from: classes.dex */
public interface a {
    public static final C0474a a = C0474a.a;

    Map<CatalogBlockVariant, h8a> a();

    void b(CatalogBlockVariant catalogBlockVariant, h8a h8aVar);

    /* compiled from: CatalogLegacyBlockRegister.kt */
    /* renamed from: com.vk.catalog.mvi.legacy.api.a$a, reason: collision with other inner class name */
    /* loaded from: classes16.dex */
    public static final class C0474a {
        public static final /* synthetic */ C0474a a = new C0474a();
        private static final a STUB = new C0475a();

        public final a getSTUB() {
            return STUB;
        }

        /* compiled from: CatalogLegacyBlockRegister.kt */
        /* renamed from: com.vk.catalog.mvi.legacy.api.a$a$a, reason: collision with other inner class name */
        public static final class C0475a implements a {
            @Override // com.vk.catalog.mvi.legacy.api.a
            public final Map<CatalogBlockVariant, h8a> a() {
                return jgp.b;
            }

            @Override // com.vk.catalog.mvi.legacy.api.a
            public final void b(CatalogBlockVariant catalogBlockVariant, h8a h8aVar) {
            }
        }
    }
}
