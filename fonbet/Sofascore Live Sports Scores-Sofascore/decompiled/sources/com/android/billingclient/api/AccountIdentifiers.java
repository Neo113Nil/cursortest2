package com.android.billingclient.api;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AccountIdentifiers {
    public final String a;
    public final String b;

    public AccountIdentifiers(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Nullable
    public String getObfuscatedAccountId() {
        return this.a;
    }

    @Nullable
    public String getObfuscatedProfileId() {
        return this.b;
    }
}
