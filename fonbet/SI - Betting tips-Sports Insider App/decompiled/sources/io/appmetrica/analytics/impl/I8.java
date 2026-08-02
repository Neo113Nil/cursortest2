package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public enum I8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f12379a;

    I8(int i5) {
        this.f12379a = i5;
    }

    public static I8 a(Integer num) {
        if (num != null) {
            for (I8 i82 : values()) {
                if (i82.f12379a == num.intValue()) {
                    return i82;
                }
            }
        }
        return NONE;
    }
}
