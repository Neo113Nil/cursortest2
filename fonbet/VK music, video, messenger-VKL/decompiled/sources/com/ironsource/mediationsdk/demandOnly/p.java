package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes13.dex */
public interface p {

    public static class a implements p {
        private final String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.p
        public String value() {
            return this.a;
        }
    }

    public static final class b extends a {
        public b() {
            super("");
        }
    }

    String value();
}
