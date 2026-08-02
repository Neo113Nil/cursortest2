package com.vk.ecomm.storefrontservices.api;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import kotlin.NotImplementedError;

/* compiled from: StorefrontServicesRouter.kt */
/* loaded from: classes18.dex */
public interface a {

    /* compiled from: StorefrontServicesRouter.kt */
    /* renamed from: com.vk.ecomm.storefrontservices.api.a$a, reason: collision with other inner class name */
    public static final class C1021a {
        public static final /* synthetic */ C1021a a = new C1021a();
        private static final a STUB = new C1022a();

        /* compiled from: StorefrontServicesRouter.kt */
        /* renamed from: com.vk.ecomm.storefrontservices.api.a$a$a, reason: collision with other inner class name */
        public static final class C1022a implements a {
            @Override // com.vk.ecomm.storefrontservices.api.a
            public final void b(Context context, UserId userId, Integer num, String str, String str2, boolean z, StorefrontServicesRefSource storefrontServicesRefSource, boolean z2, String str3) {
                throw new NotImplementedError("An operation is not implemented: Stub version");
            }
        }

        public final a getSTUB() {
            return STUB;
        }
    }

    static /* synthetic */ void a(a aVar, Context context, UserId userId, Integer num, String str, String str2, boolean z, StorefrontServicesRefSource storefrontServicesRefSource, String str3, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            storefrontServicesRefSource = null;
        }
        aVar.b(context, userId, num, str, str2, z, storefrontServicesRefSource, (i & 128) == 0, (i & 256) != 0 ? null : str3);
    }

    void b(Context context, UserId userId, Integer num, String str, String str2, boolean z, StorefrontServicesRefSource storefrontServicesRefSource, boolean z2, String str3);
}
