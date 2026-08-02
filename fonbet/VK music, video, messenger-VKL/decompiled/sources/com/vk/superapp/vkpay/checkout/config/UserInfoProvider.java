package com.vk.superapp.vkpay.checkout.config;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;

/* compiled from: UserInfoProvider.kt */
/* loaded from: classes6.dex */
public interface UserInfoProvider extends Serializer.StreamParcelable {
    UserId getUserId();

    String qb();
}
