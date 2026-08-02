package com.vk.ecomm.storefrontservices.impl;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesRefSource;
import com.vk.ecomm.storefrontservices.impl.StorefrontServicesFragment;

/* compiled from: StorefrontServicesRouterImpl.kt */
/* loaded from: classes18.dex */
public final class a implements com.vk.ecomm.storefrontservices.api.a {
    @Override // com.vk.ecomm.storefrontservices.api.a
    public final void b(Context context, UserId userId, Integer num, String str, String str2, boolean z, StorefrontServicesRefSource storefrontServicesRefSource, boolean z2, String str3) {
        new StorefrontServicesFragment.a(new StorefrontServicesArgs(userId, num, str, str2, z), storefrontServicesRefSource, z2, str3).k(context);
    }
}
