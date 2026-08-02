package com.vk.ecomm.avito.api;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: AvitoIntegrationDelegate.kt */
/* loaded from: classes18.dex */
public interface a {
    public static final C0916a Z6 = C0916a.a;

    /* compiled from: AvitoIntegrationDelegate.kt */
    /* renamed from: com.vk.ecomm.avito.api.a$a, reason: collision with other inner class name */
    public static final class C0916a {
        public static final /* synthetic */ C0916a a = new C0916a();
        private static final a STUB = new C0917a();

        public final a getSTUB() {
            return STUB;
        }

        /* compiled from: AvitoIntegrationDelegate.kt */
        /* renamed from: com.vk.ecomm.avito.api.a$a$a, reason: collision with other inner class name */
        public static final class C0917a implements a {
            @Override // com.vk.ecomm.avito.api.a
            public final void a(Context context, UserId userId, Integer num, gzs<s3q0> gzsVar) {
            }
        }
    }

    default void a(Context context, UserId userId, Integer num, gzs<s3q0> gzsVar) {
    }
}
