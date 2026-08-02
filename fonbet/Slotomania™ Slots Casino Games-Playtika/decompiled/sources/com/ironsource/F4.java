package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class F4 implements Te<String> {
    private final String a;
    private final String b;

    public F4(String encryptedResponse, String descriptionKey) {
        Intrinsics.checkNotNullParameter(encryptedResponse, "encryptedResponse");
        Intrinsics.checkNotNullParameter(descriptionKey, "descriptionKey");
        this.a = encryptedResponse;
        this.b = descriptionKey;
    }

    @Override // com.ironsource.Te
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        String value = I9.b(this.b, this.a);
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("Decryption failed");
        }
        Intrinsics.checkNotNullExpressionValue(value, "value");
        return value;
    }
}
