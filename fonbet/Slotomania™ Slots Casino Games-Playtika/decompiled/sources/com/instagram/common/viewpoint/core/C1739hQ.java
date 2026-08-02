package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1739hQ extends WP {
    public static String[] A02 = {"aYZ348mE1NYrFcMBoebQMkiZFG78oX5w", "qZgy2fVZKkcRQxGeLIPji8yDZzfZsU0K", "FW", "4WpWxoGmbDHaVYPSEbV5W", "JuvmjYnKk99PR9XqbJ5bpADbGT7vNhdJ", "90qKQYWe37jbHMTFJzGbdEUnuOp61wed", "dYksIGNGyyMeZtC5mrM4so", "pL5NnltKvH9DFuMzl1s9TskXUqu4u7R4"};
    public final /* synthetic */ C1735hM A00;
    public final /* synthetic */ C1167Vm A01;

    public C1739hQ(C1735hM c1735hM, C1167Vm c1167Vm) {
        this.A00 = c1735hM;
        this.A01 = c1167Vm;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        C1056Rd c1056Rd;
        C1056Rd c1056Rd2;
        C1056Rd c1056Rd3;
        c1056Rd = this.A00.A01;
        if (c1056Rd.A06() != null) {
            c1056Rd2 = this.A00.A01;
            AdListener A06 = c1056Rd2.A06();
            c1056Rd3 = this.A00.A01;
            if (A02[2].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "zGBwvDJj20KV94Zd2N0fZ";
            strArr[6] = "5j2wCmqr0QfuHbPw5sx74i";
            A06.onError(c1056Rd3.A07(), XE.A00(this.A01));
        }
    }
}
