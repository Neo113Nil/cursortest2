package w6;

import C.o0;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f103591a;

    /* renamed from: b, reason: collision with root package name */
    private final String f103592b;

    /* renamed from: c, reason: collision with root package name */
    private final String f103593c;

    public b(String str, String str2, String str3) {
        this.f103591a = str;
        this.f103592b = str2;
        this.f103593c = str3;
    }

    public final String a() {
        return this.f103593c;
    }

    public final String b() {
        return this.f103591a;
    }

    public final String c() {
        return this.f103592b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HostInfoResponse{mSessionId='");
        sb2.append(this.f103591a);
        sb2.append("', mWalletId='");
        sb2.append(this.f103592b);
        sb2.append("', mDeviceId='");
        return o0.c(sb2, this.f103593c, "'}");
    }
}
