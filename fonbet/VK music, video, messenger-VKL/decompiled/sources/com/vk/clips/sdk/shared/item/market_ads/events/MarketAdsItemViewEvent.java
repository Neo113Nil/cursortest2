package com.vk.clips.sdk.shared.item.market_ads.events;

import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import java.util.ArrayList;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.ixp0;
import xsna.qoy;
import xsna.qr;
import xsna.urd0;
import xsna.wih0;
import xsna.wp50;
import xsna.zrp;

/* compiled from: MarketAdsItemViewEvent.kt */
/* loaded from: classes17.dex */
public interface MarketAdsItemViewEvent {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketAdsItemViewEvent.kt */
    public static final class OnItemViewFocusChanged implements MarketAdsItemViewEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OnItemViewFocusChanged[] $VALUES;
        public static final OnItemViewFocusChanged FOCUSED;
        public static final OnItemViewFocusChanged UNFOCUSED;

        static {
            OnItemViewFocusChanged onItemViewFocusChanged = new OnItemViewFocusChanged("FOCUSED", 0);
            FOCUSED = onItemViewFocusChanged;
            OnItemViewFocusChanged onItemViewFocusChanged2 = new OnItemViewFocusChanged("UNFOCUSED", 1);
            UNFOCUSED = onItemViewFocusChanged2;
            OnItemViewFocusChanged[] onItemViewFocusChangedArr = {onItemViewFocusChanged, onItemViewFocusChanged2};
            $VALUES = onItemViewFocusChangedArr;
            $ENTRIES = new asp(onItemViewFocusChangedArr);
        }

        public OnItemViewFocusChanged() {
            throw null;
        }

        public static OnItemViewFocusChanged valueOf(String str) {
            return (OnItemViewFocusChanged) Enum.valueOf(OnItemViewFocusChanged.class, str);
        }

        public static OnItemViewFocusChanged[] values() {
            return (OnItemViewFocusChanged[]) $VALUES.clone();
        }
    }

    /* compiled from: MarketAdsItemViewEvent.kt */
    public static final class a implements MarketAdsItemViewEvent {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1688579536;
        }

        public final String toString() {
            return "ActionButtonClicked";
        }
    }

    /* compiled from: MarketAdsItemViewEvent.kt */
    public static final class b implements MarketAdsItemViewEvent {
        public final ImageUrl b;
        public final wih0.b.a c;
        public final SdkActionLink d;
        public final String e;
        public final String f;
        public final String g;
        public final ArrayList h;
        public final wp50 i;

        public b(ImageUrl imageUrl, SdkActionLink sdkActionLink, String str, String str2, String str3, ArrayList arrayList, wp50 wp50Var, wih0.b.a aVar) {
            this.b = imageUrl;
            this.c = aVar;
            this.d = sdkActionLink;
            this.e = str;
            this.f = str2;
            this.g = str3;
            this.h = arrayList;
            this.i = wp50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c.equals(bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && this.h.equals(bVar.h) && epx.f(this.i, bVar.i);
        }

        public final int hashCode() {
            ImageUrl imageUrl = this.b;
            int hashCode = (this.c.hashCode() + ((imageUrl == null ? 0 : imageUrl.hashCode()) * 31)) * 31;
            SdkActionLink sdkActionLink = this.d;
            int a = urd0.a(urd0.a((hashCode + (sdkActionLink == null ? 0 : sdkActionLink.hashCode())) * 31, 31, this.e), 31, this.f);
            String str = this.g;
            int b = qoy.b(qoy.b(qr.a(this.h, (a + (str == null ? 0 : str.hashCode())) * 31, 31), 31, true), 31, false);
            wp50 wp50Var = this.i;
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
            sb.append(", uniqueKey=");
            sb.append(this.f);
            sb.append(", trackCode=");
            sb.append(this.g);
            sb.append(", cards=");
            sb.append(this.h);
            sb.append(", cardsClickable=true, itemVisible=false, myTargetFacade=");
            return iq.c(sb, this.i, ')');
        }
    }

    /* compiled from: MarketAdsItemViewEvent.kt */
    public static final class c implements MarketAdsItemViewEvent {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1586839997;
        }

        public final String toString() {
            return "OnAttachedToWindow";
        }
    }

    /* compiled from: MarketAdsItemViewEvent.kt */
    public static final class d implements MarketAdsItemViewEvent {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1821506426;
        }

        public final String toString() {
            return "OnDetachedFromWindow";
        }
    }

    /* compiled from: MarketAdsItemViewEvent.kt */
    public static final class e implements MarketAdsItemViewEvent {
        public final String b;
        public final SdkAdsChoices c;

        public e(SdkAdsChoices sdkAdsChoices, String str) {
            this.b = str;
            this.c = sdkAdsChoices;
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
            int hashCode = this.b.hashCode() * 31;
            SdkAdsChoices sdkAdsChoices = this.c;
            return hashCode + (sdkAdsChoices == null ? 0 : sdkAdsChoices.hashCode());
        }

        public final String toString() {
            return "OnMarketAdNotInterestedClicked(adUniqueKey=" + this.b + ", adsChoices=" + this.c + ')';
        }
    }

    /* compiled from: MarketAdsItemViewEvent.kt */
    public static final class f implements MarketAdsItemViewEvent {
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
            return "OnUIVisibilityConfigChanged(config=" + this.b + ')';
        }
    }

    /* compiled from: MarketAdsItemViewEvent.kt */
    public static final class g implements MarketAdsItemViewEvent {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -95107357;
        }

        public final String toString() {
            return "OwnerClicked";
        }
    }

    /* compiled from: MarketAdsItemViewEvent.kt */
    public static final class h implements MarketAdsItemViewEvent {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1462835132;
        }

        public final String toString() {
            return "Recycle";
        }
    }
}
