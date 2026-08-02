package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1979lb implements InterfaceC0859Jj {
    public static String[] A01 = {"5dk9XJP2wGzKf", "t9Sqq8YLjeTrFPP9jF9lF", "ZSSLQReFK2RnB4Tl20", "6LiPtiUXCvNXZPkDmbiLO", "ML1syn76y5DaiFADQPhnbgz9k8Qidn9e", "l6QdmjZcy6MGH", "", "GeXYkzAGCbUHzEIcx9bq6WN7r3"};
    public static final C1979lb A02 = new C1979lb();
    public final List<C2205pT> A00;

    public C1979lb() {
        this.A00 = Collections.emptyList();
    }

    public C1979lb(C2205pT c2205pT) {
        this.A00 = Collections.singletonList(c2205pT);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0859Jj
    public final List<C2205pT> A7X(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0859Jj
    public final long A83(int i) {
        AbstractC04793y.A07(i == 0);
        if (A01[5].length() != 13) {
            throw new RuntimeException();
        }
        A01[7] = "BSEyCnkUJKVAglTMpAGc69o360";
        return 0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0859Jj
    public final int A84() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0859Jj
    public final int A8a(long j) {
        return j < 0 ? 0 : -1;
    }
}
