package com.vk.superapp.analytics;

import android.content.Context;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* compiled from: MaxMessengerAnalytics.kt */
/* loaded from: classes6.dex */
public interface MaxMessengerAnalytics {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MaxMessengerAnalytics.kt */
    public static final class MarketName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MarketName[] $VALUES;
        public static final MarketName OTHER;
        public static final MarketName RUSTORE;
        public static final MarketName RUSTORE_SEAMLESS;
        private final String value;

        static {
            MarketName marketName = new MarketName("RUSTORE", 0, "rustore");
            RUSTORE = marketName;
            MarketName marketName2 = new MarketName(NativeAdContent.ViewTag.OTHER, 1, "other");
            OTHER = marketName2;
            MarketName marketName3 = new MarketName("RUSTORE_SEAMLESS", 2, "rustore_seamless");
            RUSTORE_SEAMLESS = marketName3;
            MarketName[] marketNameArr = {marketName, marketName2, marketName3};
            $VALUES = marketNameArr;
            $ENTRIES = new asp(marketNameArr);
        }

        public MarketName(String str, int i, String str2) {
            this.value = str2;
        }

        public static MarketName valueOf(String str) {
            return (MarketName) Enum.valueOf(MarketName.class, str);
        }

        public static MarketName[] values() {
            return (MarketName[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    void a();

    void b();

    void c();

    void d(boolean z);

    void e();

    void f();

    void g();

    void h();

    void i();

    void j();

    String k(Context context);

    void l(MarketName marketName);

    void m(int i);

    void n();

    void o();

    void p();

    void q();

    /* compiled from: MaxMessengerAnalytics.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final MaxMessengerAnalytics getSTUB() {
            return new C1860a();
        }

        /* compiled from: MaxMessengerAnalytics.kt */
        /* renamed from: com.vk.superapp.analytics.MaxMessengerAnalytics$a$a, reason: collision with other inner class name */
        public static final class C1860a implements MaxMessengerAnalytics {
            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final String k(Context context) {
                return "";
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void a() {
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void b() {
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void c() {
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void e() {
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void f() {
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void g() {
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void h() {
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void i() {
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void j() {
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void n() {
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void o() {
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void p() {
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void q() {
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void d(boolean z) {
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void l(MarketName marketName) {
            }

            @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
            public final void m(int i) {
            }
        }
    }
}
