package com.ironsource;

/* loaded from: classes13.dex */
public final class F4 implements Te<String> {
    private final String a;
    private final String b;

    public F4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.ironsource.Te
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        String b = J9.b(this.b, this.a);
        if (b == null || b.length() == 0) {
            throw new IllegalArgumentException("Decryption failed");
        }
        return b;
    }
}
