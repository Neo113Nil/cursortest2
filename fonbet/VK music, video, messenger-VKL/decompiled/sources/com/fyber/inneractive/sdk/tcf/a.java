package com.fyber.inneractive.sdk.tcf;

import defpackage.q0;
import java.util.ArrayList;
import xsna.tv4;

/* loaded from: classes12.dex */
public final class a {
    public String b;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public final b a = new b();
    public boolean c = false;

    public final void a() {
        b bVar = this.a;
        bVar.b += 78;
        this.d = bVar.a(12);
        this.e = this.a.a(12);
        this.a.b += 50;
        boolean[] zArr = new boolean[24];
        for (int i = 0; i < 24; i++) {
            zArr[i] = this.a.a();
        }
        boolean z = zArr[0];
        this.g = !z;
        this.a.b += 37;
        ArrayList arrayList = new ArrayList();
        int a = this.a.a(16);
        if (this.a.a()) {
            int a2 = this.a.a(12);
            for (int i2 = 0; i2 < a2; i2++) {
                boolean a3 = this.a.a();
                int a4 = this.a.a(16);
                if (a3) {
                    int a5 = this.a.a(16);
                    while (a4 <= a5) {
                        a4 = tv4.a(arrayList, a4, a4, 1);
                    }
                } else {
                    arrayList.add(Integer.valueOf(a4));
                }
            }
        } else {
            for (int i3 = 1; i3 <= a; i3++) {
                if (this.a.a()) {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
        }
        this.f = arrayList.contains(262);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GppTcf{mCmpVersion=");
        sb.append(this.e);
        sb.append(", mCmpId=");
        sb.append(this.d);
        sb.append(", mConsentStatus=");
        sb.append(this.f);
        sb.append(", mIsPurpose1Disabled=");
        return q0.a(sb, this.g, '}');
    }
}
