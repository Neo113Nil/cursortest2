package com.applovin.impl;

/* loaded from: classes3.dex */
public class r2 {
    private String a;
    private String b;
    private int c;
    private int d;

    public static class a {
        private String a;
        private String b;
        private int c;
        private int d;

        a() {
        }

        public r2 a() {
            return new r2(this.a, this.b, this.c, this.d);
        }

        public a b(int i) {
            this.c = i;
            return this;
        }

        public String toString() {
            return "LicenseVerificationObject.LicenseVerificationObjectBuilder(signedData=" + this.a + ", signature=" + this.b + ", responseCode=" + this.c + ", nonce=" + this.d + ")";
        }

        public a a(int i) {
            this.d = i;
            return this;
        }

        public a b(String str) {
            this.a = str;
            return this;
        }

        public a a(String str) {
            this.b = str;
            return this;
        }
    }

    r2(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    protected boolean a(Object obj) {
        return obj instanceof r2;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        if (!r2Var.a(this) || c() != r2Var.c() || b() != r2Var.b()) {
            return false;
        }
        String e = e();
        String e2 = r2Var.e();
        if (e != null ? !e.equals(e2) : e2 != null) {
            return false;
        }
        String d = d();
        String d2 = r2Var.d();
        return d != null ? d.equals(d2) : d2 == null;
    }

    public int hashCode() {
        int c = ((c() + 59) * 59) + b();
        String e = e();
        int hashCode = (c * 59) + (e == null ? 43 : e.hashCode());
        String d = d();
        return (hashCode * 59) + (d != null ? d.hashCode() : 43);
    }

    public String toString() {
        return "LicenseVerificationObject(signedData=" + e() + ", signature=" + d() + ", responseCode=" + c() + ", nonce=" + b() + ")";
    }

    public static a a() {
        return new a();
    }
}
