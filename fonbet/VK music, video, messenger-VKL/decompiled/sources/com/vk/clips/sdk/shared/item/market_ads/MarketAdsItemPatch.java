package com.vk.clips.sdk.shared.item.market_ads;

import xsna.asp;
import xsna.cut0;
import xsna.epx;
import xsna.hr00;
import xsna.iq;
import xsna.ixp0;
import xsna.wp50;
import xsna.xl50;
import xsna.zrp;

/* compiled from: MarketAdsItemPatch.kt */
/* loaded from: classes17.dex */
public interface MarketAdsItemPatch extends xl50 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketAdsItemPatch.kt */
    public static final class UpdateMarketAdFocused implements MarketAdsItemPatch {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UpdateMarketAdFocused[] $VALUES;
        public static final UpdateMarketAdFocused FOCUSED;
        public static final UpdateMarketAdFocused UNFOCUSED;

        static {
            UpdateMarketAdFocused updateMarketAdFocused = new UpdateMarketAdFocused("FOCUSED", 0);
            FOCUSED = updateMarketAdFocused;
            UpdateMarketAdFocused updateMarketAdFocused2 = new UpdateMarketAdFocused("UNFOCUSED", 1);
            UNFOCUSED = updateMarketAdFocused2;
            UpdateMarketAdFocused[] updateMarketAdFocusedArr = {updateMarketAdFocused, updateMarketAdFocused2};
            $VALUES = updateMarketAdFocusedArr;
            $ENTRIES = new asp(updateMarketAdFocusedArr);
        }

        public UpdateMarketAdFocused() {
            throw null;
        }

        public static UpdateMarketAdFocused valueOf(String str) {
            return (UpdateMarketAdFocused) Enum.valueOf(UpdateMarketAdFocused.class, str);
        }

        public static UpdateMarketAdFocused[] values() {
            return (UpdateMarketAdFocused[]) $VALUES.clone();
        }
    }

    /* compiled from: MarketAdsItemPatch.kt */
    public interface a extends MarketAdsItemPatch {

        /* compiled from: MarketAdsItemPatch.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemPatch$a$a, reason: collision with other inner class name */
        public static final class C0678a implements a {
            public static final C0678a b = new C0678a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0678a);
            }

            public final int hashCode() {
                return 1997973460;
            }

            public final String toString() {
                return "Activated";
            }
        }

        /* compiled from: MarketAdsItemPatch.kt */
        public static final class b implements a {
            public final cut0 b;
            public final cut0 c;

            public b(cut0 cut0Var, cut0 cut0Var2) {
                this.b = cut0Var;
                this.c = cut0Var2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "ColorsLoaded(activeBackgroundColor=" + this.b + ", activeTextColor=" + this.c + ')';
            }
        }
    }

    /* compiled from: MarketAdsItemPatch.kt */
    public interface b extends MarketAdsItemPatch {

        /* compiled from: MarketAdsItemPatch.kt */
        public interface a extends b {

            /* compiled from: MarketAdsItemPatch.kt */
            /* renamed from: com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemPatch$b$a$a, reason: collision with other inner class name */
            public static final class C0679a implements a {
                public final hr00 b;
                public final ixp0 c;
                public final wp50 d;

                public C0679a(hr00 hr00Var, ixp0 ixp0Var, wp50 wp50Var) {
                    this.b = hr00Var;
                    this.c = ixp0Var;
                    this.d = wp50Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0679a)) {
                        return false;
                    }
                    C0679a c0679a = (C0679a) obj;
                    return epx.f(this.b, c0679a.b) && epx.f(this.c, c0679a.c) && epx.f(this.d, c0679a.d);
                }

                public final int hashCode() {
                    int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
                    wp50 wp50Var = this.d;
                    return hashCode + (wp50Var == null ? 0 : wp50Var.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Full(adsState=");
                    sb.append(this.b);
                    sb.append(", uiVisibilityConfig=");
                    sb.append(this.c);
                    sb.append(", myTargetFacade=");
                    return iq.c(sb, this.d, ')');
                }
            }

            /* compiled from: MarketAdsItemPatch.kt */
            /* renamed from: com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemPatch$b$a$b, reason: collision with other inner class name */
            public static final class C0680b implements a {
                public final hr00 b;

                public C0680b(hr00 hr00Var) {
                    this.b = hr00Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0680b) && epx.f(this.b, ((C0680b) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "Payload(adsState=" + this.b + ')';
                }
            }
        }

        /* compiled from: MarketAdsItemPatch.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemPatch$b$b, reason: collision with other inner class name */
        public static final class C0681b implements b {
            public static final C0681b b = new C0681b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0681b);
            }

            public final int hashCode() {
                return 557960840;
            }

            public final String toString() {
                return "Unbind";
            }
        }
    }

    /* compiled from: MarketAdsItemPatch.kt */
    public interface c extends MarketAdsItemPatch {

        /* compiled from: MarketAdsItemPatch.kt */
        public static final class a implements c {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1185841992;
            }

            public final String toString() {
                return "Collapse";
            }
        }

        /* compiled from: MarketAdsItemPatch.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1568839435;
            }

            public final String toString() {
                return "Expand";
            }
        }
    }

    /* compiled from: MarketAdsItemPatch.kt */
    public static final class d implements MarketAdsItemPatch {
        public final ixp0 b;

        public d(ixp0 ixp0Var) {
            this.b = ixp0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateUIVisibilityConfig(config=" + this.b + ')';
        }
    }
}
