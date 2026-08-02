package com.vk.clips.sdk.shared.item.market_ads;

import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import java.util.ArrayList;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.iq;
import xsna.ixp0;
import xsna.kj50;
import xsna.qoy;
import xsna.qr;
import xsna.shy;
import xsna.urd0;
import xsna.wih0;
import xsna.wp50;
import xsna.zrp;

/* compiled from: MarketAdsItemAction.kt */
/* loaded from: classes17.dex */
public interface MarketAdsItemAction extends kj50 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketAdsItemAction.kt */
    public static final class HandleItemViewFocusChanged implements MarketAdsItemAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HandleItemViewFocusChanged[] $VALUES;
        public static final HandleItemViewFocusChanged FOCUSED;
        public static final HandleItemViewFocusChanged UNFOCUSED;

        static {
            HandleItemViewFocusChanged handleItemViewFocusChanged = new HandleItemViewFocusChanged("FOCUSED", 0);
            FOCUSED = handleItemViewFocusChanged;
            HandleItemViewFocusChanged handleItemViewFocusChanged2 = new HandleItemViewFocusChanged("UNFOCUSED", 1);
            UNFOCUSED = handleItemViewFocusChanged2;
            HandleItemViewFocusChanged[] handleItemViewFocusChangedArr = {handleItemViewFocusChanged, handleItemViewFocusChanged2};
            $VALUES = handleItemViewFocusChangedArr;
            $ENTRIES = new asp(handleItemViewFocusChangedArr);
        }

        public HandleItemViewFocusChanged() {
            throw null;
        }

        public static HandleItemViewFocusChanged valueOf(String str) {
            return (HandleItemViewFocusChanged) Enum.valueOf(HandleItemViewFocusChanged.class, str);
        }

        public static HandleItemViewFocusChanged[] values() {
            return (HandleItemViewFocusChanged[]) $VALUES.clone();
        }
    }

    /* compiled from: MarketAdsItemAction.kt */
    public interface a extends MarketAdsItemAction {

        /* compiled from: MarketAdsItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemAction$a$a, reason: collision with other inner class name */
        public static final class C0676a implements a {
            public final ImageUrl b;
            public final wih0.b.a c;
            public final SdkActionLink d;
            public final String e;
            public final ixp0 f;
            public final String g;
            public final String h;
            public final ArrayList i;
            public final int j;
            public final wp50 k;

            public C0676a(ImageUrl imageUrl, wih0.b.a aVar, SdkActionLink sdkActionLink, String str, ixp0 ixp0Var, String str2, String str3, ArrayList arrayList, int i, wp50 wp50Var) {
                this.b = imageUrl;
                this.c = aVar;
                this.d = sdkActionLink;
                this.e = str;
                this.f = ixp0Var;
                this.g = str2;
                this.h = str3;
                this.i = arrayList;
                this.j = i;
                this.k = wp50Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0676a)) {
                    return false;
                }
                C0676a c0676a = (C0676a) obj;
                return epx.f(this.b, c0676a.b) && this.c.equals(c0676a.c) && epx.f(this.d, c0676a.d) && epx.f(this.e, c0676a.e) && this.f.equals(c0676a.f) && epx.f(this.g, c0676a.g) && epx.f(this.h, c0676a.h) && this.i.equals(c0676a.i) && this.j == c0676a.j && epx.f(this.k, c0676a.k);
            }

            public final int hashCode() {
                ImageUrl imageUrl = this.b;
                int hashCode = (this.c.hashCode() + ((imageUrl == null ? 0 : imageUrl.hashCode()) * 31)) * 31;
                SdkActionLink sdkActionLink = this.d;
                int a = urd0.a((this.f.hashCode() + urd0.a((hashCode + (sdkActionLink == null ? 0 : sdkActionLink.hashCode())) * 31, 31, this.e)) * 31, 31, this.g);
                String str = this.h;
                int b = qoy.b(qoy.b(shy.a(this.j, qr.a(this.i, (a + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, true), 31, false);
                wp50 wp50Var = this.k;
                return b + (wp50Var != null ? wp50Var.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Bind(image=");
                sb.append(this.b);
                sb.append(", adInfo=");
                sb.append(this.c);
                sb.append(", actionLink=");
                sb.append(this.d);
                sb.append(", description=");
                sb.append(this.e);
                sb.append(", uiVisibilityConfig=");
                sb.append(this.f);
                sb.append(", itemUniqueKey=");
                sb.append(this.g);
                sb.append(", trackCode=");
                sb.append(this.h);
                sb.append(", cards=");
                sb.append(this.i);
                sb.append(", contentTopMargin=");
                sb.append(this.j);
                sb.append(", cardsClickable=true, itemVisible=false, myTargetFacade=");
                return iq.c(sb, this.k, ')');
            }
        }

        /* compiled from: MarketAdsItemAction.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -867863756;
            }

            public final String toString() {
                return "Unbind";
            }
        }
    }

    /* compiled from: MarketAdsItemAction.kt */
    public interface b extends MarketAdsItemAction {

        /* compiled from: MarketAdsItemAction.kt */
        public static final class a implements b {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -279108469;
            }

            public final String toString() {
                return "HandleCollapseClicked";
            }
        }

        /* compiled from: MarketAdsItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemAction$b$b, reason: collision with other inner class name */
        public static final class C0677b implements b {
            public static final C0677b b = new C0677b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0677b);
            }

            public final int hashCode() {
                return -1613777602;
            }

            public final String toString() {
                return "HandleExpandClicked";
            }
        }

        /* compiled from: MarketAdsItemAction.kt */
        public static final class c implements b {
            public final String b;

            public c(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("HandleHashtagClicked(hashtag="), this.b, ')');
            }
        }
    }

    /* compiled from: MarketAdsItemAction.kt */
    public interface c extends MarketAdsItemAction {

        /* compiled from: MarketAdsItemAction.kt */
        public static final class a implements c {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1023919493;
            }

            public final String toString() {
                return "HandleLongPress";
            }
        }

        /* compiled from: MarketAdsItemAction.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -584832871;
            }

            public final String toString() {
                return "HandleSingleTap";
            }
        }
    }

    /* compiled from: MarketAdsItemAction.kt */
    public static final class d implements MarketAdsItemAction {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1326466054;
        }

        public final String toString() {
            return "HandleAdvertisementViewClicked";
        }
    }

    /* compiled from: MarketAdsItemAction.kt */
    public static final class e implements MarketAdsItemAction {
        public final SdkAdsChoices b;
        public final String c;

        public e(SdkAdsChoices sdkAdsChoices, String str) {
            this.b = sdkAdsChoices;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            SdkAdsChoices sdkAdsChoices = this.b;
            return this.c.hashCode() + ((sdkAdsChoices == null ? 0 : sdkAdsChoices.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HandleNotInterestedClicked(adsChoices=");
            sb.append(this.b);
            sb.append(", adUniqueKey=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: MarketAdsItemAction.kt */
    public static final class f implements MarketAdsItemAction {
        public final ixp0 b;

        public f(ixp0 ixp0Var) {
            this.b = ixp0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "HandleOnUIVisibilityConfigChanged(config=" + this.b + ')';
        }
    }

    /* compiled from: MarketAdsItemAction.kt */
    public static final class g implements MarketAdsItemAction {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 272093068;
        }

        public final String toString() {
            return "HandleOwnerViewClicked";
        }
    }
}
