package com.vk.clips.sdk.shared.item.static_ads.events;

import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.ixp0;
import xsna.urd0;
import xsna.wih0;
import xsna.wp50;
import xsna.zrp;

/* compiled from: StaticAdsItemViewEvent.kt */
/* loaded from: classes17.dex */
public interface StaticAdsItemViewEvent {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StaticAdsItemViewEvent.kt */
    public static final class OnItemViewFocusChanged implements StaticAdsItemViewEvent {
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

    /* compiled from: StaticAdsItemViewEvent.kt */
    public static final class a implements StaticAdsItemViewEvent {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1427651604;
        }

        public final String toString() {
            return "ActionButtonClicked";
        }
    }

    /* compiled from: StaticAdsItemViewEvent.kt */
    public static final class b implements StaticAdsItemViewEvent {
        public final ImageUrl b;
        public final wih0.d.a c;
        public final SdkActionLink d;
        public final String e;
        public final String f;
        public final String g;
        public final wp50 h;

        public b(ImageUrl imageUrl, SdkActionLink sdkActionLink, String str, String str2, String str3, wp50 wp50Var, wih0.d.a aVar) {
            this.b = imageUrl;
            this.c = aVar;
            this.d = sdkActionLink;
            this.e = str;
            this.f = str2;
            this.g = str3;
            this.h = wp50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            SdkActionLink sdkActionLink = this.d;
            int a = urd0.a(urd0.a((hashCode + (sdkActionLink == null ? 0 : sdkActionLink.hashCode())) * 31, 31, this.e), 31, this.f);
            String str = this.g;
            int hashCode2 = (a + (str == null ? 0 : str.hashCode())) * 31;
            wp50 wp50Var = this.h;
            return hashCode2 + (wp50Var != null ? wp50Var.hashCode() : 0);
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
            sb.append(", myTargetFacade=");
            return iq.c(sb, this.h, ')');
        }
    }

    /* compiled from: StaticAdsItemViewEvent.kt */
    public static final class c implements StaticAdsItemViewEvent {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -764350105;
        }

        public final String toString() {
            return "LinkCommunityWithSubscribeClicked";
        }
    }

    /* compiled from: StaticAdsItemViewEvent.kt */
    public static final class d implements StaticAdsItemViewEvent {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 440437593;
        }

        public final String toString() {
            return "OnAttachedToWindow";
        }
    }

    /* compiled from: StaticAdsItemViewEvent.kt */
    public static final class e implements StaticAdsItemViewEvent {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -359576042;
        }

        public final String toString() {
            return "OnDetachedFromWindow";
        }
    }

    /* compiled from: StaticAdsItemViewEvent.kt */
    public static final class f implements StaticAdsItemViewEvent {
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

    /* compiled from: StaticAdsItemViewEvent.kt */
    public static final class g implements StaticAdsItemViewEvent {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -101051622;
        }

        public final String toString() {
            return "OwnerViewClicked";
        }
    }

    /* compiled from: StaticAdsItemViewEvent.kt */
    public static final class h implements StaticAdsItemViewEvent {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 131172392;
        }

        public final String toString() {
            return "Recycle";
        }
    }

    /* compiled from: StaticAdsItemViewEvent.kt */
    public static final class i implements StaticAdsItemViewEvent {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1225928981;
        }

        public final String toString() {
            return "UnsubscribeBottomSheetConfirmClicked";
        }
    }
}
