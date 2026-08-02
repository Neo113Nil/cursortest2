package com.huawei.agconnect.core.service.auth;

/* loaded from: classes13.dex */
public interface Token {
    long getExpiration();

    long getIssuedAt();

    long getNotBefore();

    String getTokenString();
}
