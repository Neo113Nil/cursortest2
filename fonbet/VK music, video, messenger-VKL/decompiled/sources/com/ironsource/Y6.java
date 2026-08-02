package com.ironsource;

/* loaded from: classes13.dex */
public interface Y6 {

    public static final class a implements Y6 {
        private final EnumC4222a7 a;

        public a(EnumC4222a7 enumC4222a7) {
            this.a = enumC4222a7;
        }

        @Override // com.ironsource.Y6
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.Y6
        public EnumC4222a7 b() {
            return this.a;
        }

        public final EnumC4222a7 c() {
            return this.a;
        }
    }

    String a();

    EnumC4222a7 b();
}
