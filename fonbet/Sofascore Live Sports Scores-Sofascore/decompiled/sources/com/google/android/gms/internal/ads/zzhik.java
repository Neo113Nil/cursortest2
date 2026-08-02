package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhik {
    public static final zzhik b = new zzhik("ASSUME_AES_GCM");
    public static final zzhik c = new zzhik("ASSUME_XCHACHA20POLY1305");
    public static final zzhik d = new zzhik("ASSUME_CHACHA20POLY1305");
    public static final zzhik e = new zzhik("ASSUME_AES_CTR_HMAC");
    public static final zzhik f = new zzhik("ASSUME_AES_EAX");
    public static final zzhik g = new zzhik("ASSUME_AES_GCM_SIV");
    public final String a;

    public zzhik(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
