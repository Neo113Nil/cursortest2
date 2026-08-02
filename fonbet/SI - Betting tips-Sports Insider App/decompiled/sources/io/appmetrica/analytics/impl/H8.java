package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class H8 {

    /* renamed from: a, reason: collision with root package name */
    public final Dc f12306a;

    /* renamed from: b, reason: collision with root package name */
    public final Dc f12307b;

    public H8() {
        this(new V7(), new L9(), new C0035b());
    }

    public H8(V7 v72, L9 l92, C0035b c0035b) {
        Dc dc2 = new Dc(v72);
        this.f12306a = dc2;
        dc2.a(I8.NONE, v72);
        dc2.a(I8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, l92);
        dc2.a(I8.AES_VALUE_ENCRYPTION, c0035b);
        this.f12307b = new Dc(v72);
    }
}
