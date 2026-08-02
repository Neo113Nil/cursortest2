package com.huawei.hms.hatool;

import xsna.kjp;

/* loaded from: classes13.dex */
public class m1 {
    private static m1 b = new m1();
    private a a = new a();

    public class a {
        String a;
        String b;
        long c = 0;

        public a() {
        }

        public void a(long j) {
            m1.this.a.c = j;
        }

        public void b(String str) {
            m1.this.a.a = str;
        }

        public void a(String str) {
            m1.this.a.b = str;
        }
    }

    public static m1 d() {
        return b;
    }

    public long b() {
        return this.a.c;
    }

    public String c() {
        return this.a.a;
    }

    public String a() {
        return this.a.b;
    }

    public void a(String str, String str2) {
        long b2 = b();
        String c = w0.c(str, str2);
        if (c == null || c.isEmpty()) {
            v.e("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (b2 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            String c2 = kjp.c(16);
            String a2 = h0.a(c, c2);
            this.a.a(currentTimeMillis);
            this.a.b(c2);
            this.a.a(a2);
            return;
        }
        if (System.currentTimeMillis() - b2 > 43200000) {
            String c3 = kjp.c(16);
            String a3 = h0.a(c, c3);
            this.a.a(b2);
            this.a.b(c3);
            this.a.a(a3);
        }
    }
}
