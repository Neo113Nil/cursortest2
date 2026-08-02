package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface X6 {

    public static final class a implements X6 {
        private final Z6 a;

        public a(Z6 strategy) {
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            this.a = strategy;
        }

        @Override // com.ironsource.X6
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.X6
        public Z6 b() {
            return this.a;
        }

        public final Z6 c() {
            return this.a;
        }
    }

    String a();

    Z6 b();
}
