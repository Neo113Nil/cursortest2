package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2696hQ extends WP {
    public static String[] A02 = {"aYZ348mE1NYrFcMBoebQMkiZFG78oX5w", "qZgy2fVZKkcRQxGeLIPji8yDZzfZsU0K", "FW", "4WpWxoGmbDHaVYPSEbV5W", "JuvmjYnKk99PR9XqbJ5bpADbGT7vNhdJ", "90qKQYWe37jbHMTFJzGbdEUnuOp61wed", "dYksIGNGyyMeZtC5mrM4so", "pL5NnltKvH9DFuMzl1s9TskXUqu4u7R4"};
    public final /* synthetic */ C2692hM A00;
    public final /* synthetic */ C2124Vm A01;

    public C2696hQ(C2692hM c2692hM, C2124Vm c2124Vm) {
        this.A00 = c2692hM;
        this.A01 = c2124Vm;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        C2013Rd c2013Rd;
        C2013Rd c2013Rd2;
        C2013Rd c2013Rd3;
        c2013Rd = this.A00.A01;
        if (c2013Rd.A06() != null) {
            c2013Rd2 = this.A00.A01;
            AdListener A06 = c2013Rd2.A06();
            c2013Rd3 = this.A00.A01;
            if (A02[2].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "zGBwvDJj20KV94Zd2N0fZ";
            strArr[6] = "5j2wCmqr0QfuHbPw5sx74i";
            A06.onError(c2013Rd3.A07(), XE.A00(this.A01));
        }
    }
}
