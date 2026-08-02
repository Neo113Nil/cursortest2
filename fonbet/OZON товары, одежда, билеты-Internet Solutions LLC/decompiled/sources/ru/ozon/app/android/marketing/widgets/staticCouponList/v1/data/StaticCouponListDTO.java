package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data;

import Ak.C2436a;
import Bi.a;
import D40.d;
import El.C2971a;
import F3.G;
import G.g;
import HY.b;
import Kk.C3532b;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004*+,-BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JS\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006."}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO;", "", "bgImage", "", "fgImage", "counter", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Counter;", "coupon1", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon;", "coupon2", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "wordDeclension", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$WordDeclension;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Counter;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$WordDeclension;)V", "getBgImage", "()Ljava/lang/String;", "getFgImage", "getCounter", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Counter;", "getCoupon1", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon;", "getCoupon2", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getWordDeclension", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$WordDeclension;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Counter", "Coupon", "WordDeclension", "Background", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StaticCouponListDTO {
    public static final int $stable = 8;

    @NotNull
    private final String bgImage;

    @NotNull
    private final CommonControlSettings common;

    @NotNull
    private final Counter counter;
    private final Coupon coupon1;
    private final Coupon coupon2;

    @NotNull
    private final String fgImage;

    @NotNull
    private final WordDeclension wordDeclension;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003J¨\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u00032\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0006\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$¨\u0006>"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Counter;", "", "isEnabled", "", "bgColor", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;", "isTicker", "tickerTextColor", "", "tickerTextStyle", "serverTimestamp", "Lorg/joda/time/DateTime;", "dateStart", "dateEnd", "beforeStartText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "beforeEndText", "onReachDateEndText", "leftIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "staticText", "<init>", "(ZLru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "()Z", "getBgColor", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTickerTextColor", "()Ljava/lang/String;", "getTickerTextStyle", "getServerTimestamp", "()Lorg/joda/time/DateTime;", "getDateStart", "getDateEnd", "getBeforeStartText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBeforeEndText", "getOnReachDateEndText", "getLeftIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getStaticText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(ZLru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Counter;", "equals", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Counter {
        public static final int $stable = 8;
        private final TextDTO beforeEndText;
        private final TextDTO beforeStartText;
        private final Background bgColor;
        private final DateTime dateEnd;
        private final DateTime dateStart;
        private final boolean isEnabled;
        private final Boolean isTicker;
        private final IconDTO leftIcon;
        private final TextDTO onReachDateEndText;
        private final DateTime serverTimestamp;
        private final TextDTO staticText;
        private final String tickerTextColor;
        private final String tickerTextStyle;

        public Counter(boolean z11, Background background, Boolean bool, String str, String str2, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, IconDTO iconDTO, TextDTO textDTO4) {
            this.isEnabled = z11;
            this.bgColor = background;
            this.isTicker = bool;
            this.tickerTextColor = str;
            this.tickerTextStyle = str2;
            this.serverTimestamp = dateTime;
            this.dateStart = dateTime2;
            this.dateEnd = dateTime3;
            this.beforeStartText = textDTO;
            this.beforeEndText = textDTO2;
            this.onReachDateEndText = textDTO3;
            this.leftIcon = iconDTO;
            this.staticText = textDTO4;
        }

        public static /* synthetic */ Counter copy$default(Counter counter, boolean z11, Background background, Boolean bool, String str, String str2, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, IconDTO iconDTO, TextDTO textDTO4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = counter.isEnabled;
            }
            return counter.copy(z11, (i11 & 2) != 0 ? counter.bgColor : background, (i11 & 4) != 0 ? counter.isTicker : bool, (i11 & 8) != 0 ? counter.tickerTextColor : str, (i11 & 16) != 0 ? counter.tickerTextStyle : str2, (i11 & 32) != 0 ? counter.serverTimestamp : dateTime, (i11 & 64) != 0 ? counter.dateStart : dateTime2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counter.dateEnd : dateTime3, (i11 & 256) != 0 ? counter.beforeStartText : textDTO, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counter.beforeEndText : textDTO2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counter.onReachDateEndText : textDTO3, (i11 & 2048) != 0 ? counter.leftIcon : iconDTO, (i11 & 4096) != 0 ? counter.staticText : textDTO4);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component10, reason: from getter */
        public final TextDTO getBeforeEndText() {
            return this.beforeEndText;
        }

        /* renamed from: component11, reason: from getter */
        public final TextDTO getOnReachDateEndText() {
            return this.onReachDateEndText;
        }

        /* renamed from: component12, reason: from getter */
        public final IconDTO getLeftIcon() {
            return this.leftIcon;
        }

        /* renamed from: component13, reason: from getter */
        public final TextDTO getStaticText() {
            return this.staticText;
        }

        /* renamed from: component2, reason: from getter */
        public final Background getBgColor() {
            return this.bgColor;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsTicker() {
            return this.isTicker;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTickerTextColor() {
            return this.tickerTextColor;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTickerTextStyle() {
            return this.tickerTextStyle;
        }

        /* renamed from: component6, reason: from getter */
        public final DateTime getServerTimestamp() {
            return this.serverTimestamp;
        }

        /* renamed from: component7, reason: from getter */
        public final DateTime getDateStart() {
            return this.dateStart;
        }

        /* renamed from: component8, reason: from getter */
        public final DateTime getDateEnd() {
            return this.dateEnd;
        }

        /* renamed from: component9, reason: from getter */
        public final TextDTO getBeforeStartText() {
            return this.beforeStartText;
        }

        @NotNull
        public final Counter copy(boolean isEnabled, Background bgColor, Boolean isTicker, String tickerTextColor, String tickerTextStyle, DateTime serverTimestamp, DateTime dateStart, DateTime dateEnd, TextDTO beforeStartText, TextDTO beforeEndText, TextDTO onReachDateEndText, IconDTO leftIcon, TextDTO staticText) {
            return new Counter(isEnabled, bgColor, isTicker, tickerTextColor, tickerTextStyle, serverTimestamp, dateStart, dateEnd, beforeStartText, beforeEndText, onReachDateEndText, leftIcon, staticText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Counter)) {
                return false;
            }
            Counter counter = (Counter) other;
            return this.isEnabled == counter.isEnabled && Intrinsics.d(this.bgColor, counter.bgColor) && Intrinsics.d(this.isTicker, counter.isTicker) && Intrinsics.d(this.tickerTextColor, counter.tickerTextColor) && Intrinsics.d(this.tickerTextStyle, counter.tickerTextStyle) && Intrinsics.d(this.serverTimestamp, counter.serverTimestamp) && Intrinsics.d(this.dateStart, counter.dateStart) && Intrinsics.d(this.dateEnd, counter.dateEnd) && Intrinsics.d(this.beforeStartText, counter.beforeStartText) && Intrinsics.d(this.beforeEndText, counter.beforeEndText) && Intrinsics.d(this.onReachDateEndText, counter.onReachDateEndText) && Intrinsics.d(this.leftIcon, counter.leftIcon) && Intrinsics.d(this.staticText, counter.staticText);
        }

        public final TextDTO getBeforeEndText() {
            return this.beforeEndText;
        }

        public final TextDTO getBeforeStartText() {
            return this.beforeStartText;
        }

        public final Background getBgColor() {
            return this.bgColor;
        }

        public final DateTime getDateEnd() {
            return this.dateEnd;
        }

        public final DateTime getDateStart() {
            return this.dateStart;
        }

        public final IconDTO getLeftIcon() {
            return this.leftIcon;
        }

        public final TextDTO getOnReachDateEndText() {
            return this.onReachDateEndText;
        }

        public final DateTime getServerTimestamp() {
            return this.serverTimestamp;
        }

        public final TextDTO getStaticText() {
            return this.staticText;
        }

        public final String getTickerTextColor() {
            return this.tickerTextColor;
        }

        public final String getTickerTextStyle() {
            return this.tickerTextStyle;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.isEnabled) * 31;
            Background background = this.bgColor;
            int hashCode2 = (hashCode + (background == null ? 0 : background.hashCode())) * 31;
            Boolean bool = this.isTicker;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.tickerTextColor;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.tickerTextStyle;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            DateTime dateTime = this.serverTimestamp;
            int hashCode6 = (hashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
            DateTime dateTime2 = this.dateStart;
            int hashCode7 = (hashCode6 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
            DateTime dateTime3 = this.dateEnd;
            int hashCode8 = (hashCode7 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
            TextDTO textDTO = this.beforeStartText;
            int hashCode9 = (hashCode8 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.beforeEndText;
            int hashCode10 = (hashCode9 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            TextDTO textDTO3 = this.onReachDateEndText;
            int hashCode11 = (hashCode10 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
            IconDTO iconDTO = this.leftIcon;
            int hashCode12 = (hashCode11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            TextDTO textDTO4 = this.staticText;
            return hashCode12 + (textDTO4 != null ? textDTO4.hashCode() : 0);
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final Boolean isTicker() {
            return this.isTicker;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isEnabled;
            Background background = this.bgColor;
            Boolean bool = this.isTicker;
            String str = this.tickerTextColor;
            String str2 = this.tickerTextStyle;
            DateTime dateTime = this.serverTimestamp;
            DateTime dateTime2 = this.dateStart;
            DateTime dateTime3 = this.dateEnd;
            TextDTO textDTO = this.beforeStartText;
            TextDTO textDTO2 = this.beforeEndText;
            TextDTO textDTO3 = this.onReachDateEndText;
            IconDTO iconDTO = this.leftIcon;
            TextDTO textDTO4 = this.staticText;
            StringBuilder sb2 = new StringBuilder("Counter(isEnabled=");
            sb2.append(z11);
            sb2.append(", bgColor=");
            sb2.append(background);
            sb2.append(", isTicker=");
            b.c(bool, ", tickerTextColor=", str, ", tickerTextStyle=", sb2);
            sb2.append(str2);
            sb2.append(", serverTimestamp=");
            sb2.append(dateTime);
            sb2.append(", dateStart=");
            sb2.append(dateTime2);
            sb2.append(", dateEnd=");
            sb2.append(dateTime3);
            sb2.append(", beforeStartText=");
            d.e(", beforeEndText=", ", onReachDateEndText=", sb2, textDTO, textDTO2);
            G.f(sb2, textDTO3, ", leftIcon=", iconDTO, ", staticText=");
            return Tl.b.e(sb2, textDTO4, ")");
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u00011BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003Je\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon;", "", "bgColor", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "chevron", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "leftIcon", "isApplied", "", "appliedStub", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon$Stub;", "unAppliedStub", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;ZLru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon$Stub;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon$Stub;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getBgColor", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getChevron", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getLeftIcon", "()Z", "getAppliedStub", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon$Stub;", "getUnAppliedStub", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "Stub", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Coupon {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final Stub appliedStub;

        @NotNull
        private final Background bgColor;

        @NotNull
        private final IconDTO chevron;

        @NotNull
        private final CommonControlSettings common;
        private final boolean isApplied;
        private final IconDTO leftIcon;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final Stub unAppliedStub;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon$Stub;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "bgColor", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBgColor", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Stub {
            public static final int $stable = 0;

            @NotNull
            private final Background bgColor;
            private final CommonControlSettings common;

            @NotNull
            private final TextDTO text;

            public Stub(@NotNull TextDTO text, @NotNull Background bgColor, CommonControlSettings commonControlSettings) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(bgColor, "bgColor");
                this.text = text;
                this.bgColor = bgColor;
                this.common = commonControlSettings;
            }

            public static /* synthetic */ Stub copy$default(Stub stub, TextDTO textDTO, Background background, CommonControlSettings commonControlSettings, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = stub.text;
                }
                if ((i11 & 2) != 0) {
                    background = stub.bgColor;
                }
                if ((i11 & 4) != 0) {
                    commonControlSettings = stub.common;
                }
                return stub.copy(textDTO, background, commonControlSettings);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getText() {
                return this.text;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Background getBgColor() {
                return this.bgColor;
            }

            /* renamed from: component3, reason: from getter */
            public final CommonControlSettings getCommon() {
                return this.common;
            }

            @NotNull
            public final Stub copy(@NotNull TextDTO text, @NotNull Background bgColor, CommonControlSettings common) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(bgColor, "bgColor");
                return new Stub(text, bgColor, common);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Stub)) {
                    return false;
                }
                Stub stub = (Stub) other;
                return Intrinsics.d(this.text, stub.text) && Intrinsics.d(this.bgColor, stub.bgColor) && Intrinsics.d(this.common, stub.common);
            }

            @NotNull
            public final Background getBgColor() {
                return this.bgColor;
            }

            public final CommonControlSettings getCommon() {
                return this.common;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = (this.bgColor.hashCode() + (this.text.hashCode() * 31)) * 31;
                CommonControlSettings commonControlSettings = this.common;
                return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.text;
                Background background = this.bgColor;
                CommonControlSettings commonControlSettings = this.common;
                StringBuilder sb2 = new StringBuilder("Stub(text=");
                sb2.append(textDTO);
                sb2.append(", bgColor=");
                sb2.append(background);
                sb2.append(", common=");
                return Ak.b.g(sb2, commonControlSettings, ")");
            }
        }

        public Coupon(@NotNull Background bgColor, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull IconDTO chevron, IconDTO iconDTO, boolean z11, @NotNull Stub appliedStub, @NotNull Stub unAppliedStub, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(bgColor, "bgColor");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(chevron, "chevron");
            Intrinsics.checkNotNullParameter(appliedStub, "appliedStub");
            Intrinsics.checkNotNullParameter(unAppliedStub, "unAppliedStub");
            Intrinsics.checkNotNullParameter(common, "common");
            this.bgColor = bgColor;
            this.title = title;
            this.subtitle = subtitle;
            this.chevron = chevron;
            this.leftIcon = iconDTO;
            this.isApplied = z11;
            this.appliedStub = appliedStub;
            this.unAppliedStub = unAppliedStub;
            this.common = common;
        }

        public static /* synthetic */ Coupon copy$default(Coupon coupon, Background background, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, IconDTO iconDTO2, boolean z11, Stub stub, Stub stub2, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                background = coupon.bgColor;
            }
            if ((i11 & 2) != 0) {
                textDTO = coupon.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = coupon.subtitle;
            }
            if ((i11 & 8) != 0) {
                iconDTO = coupon.chevron;
            }
            if ((i11 & 16) != 0) {
                iconDTO2 = coupon.leftIcon;
            }
            if ((i11 & 32) != 0) {
                z11 = coupon.isApplied;
            }
            if ((i11 & 64) != 0) {
                stub = coupon.appliedStub;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                stub2 = coupon.unAppliedStub;
            }
            if ((i11 & 256) != 0) {
                commonControlSettings = coupon.common;
            }
            Stub stub3 = stub2;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            boolean z12 = z11;
            Stub stub4 = stub;
            IconDTO iconDTO3 = iconDTO2;
            TextDTO textDTO3 = textDTO2;
            return coupon.copy(background, textDTO, textDTO3, iconDTO, iconDTO3, z12, stub4, stub3, commonControlSettings2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Background getBgColor() {
            return this.bgColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final IconDTO getChevron() {
            return this.chevron;
        }

        /* renamed from: component5, reason: from getter */
        public final IconDTO getLeftIcon() {
            return this.leftIcon;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsApplied() {
            return this.isApplied;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final Stub getAppliedStub() {
            return this.appliedStub;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final Stub getUnAppliedStub() {
            return this.unAppliedStub;
        }

        @NotNull
        /* renamed from: component9, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final Coupon copy(@NotNull Background bgColor, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull IconDTO chevron, IconDTO leftIcon, boolean isApplied, @NotNull Stub appliedStub, @NotNull Stub unAppliedStub, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(bgColor, "bgColor");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(chevron, "chevron");
            Intrinsics.checkNotNullParameter(appliedStub, "appliedStub");
            Intrinsics.checkNotNullParameter(unAppliedStub, "unAppliedStub");
            Intrinsics.checkNotNullParameter(common, "common");
            return new Coupon(bgColor, title, subtitle, chevron, leftIcon, isApplied, appliedStub, unAppliedStub, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Coupon)) {
                return false;
            }
            Coupon coupon = (Coupon) other;
            return Intrinsics.d(this.bgColor, coupon.bgColor) && Intrinsics.d(this.title, coupon.title) && Intrinsics.d(this.subtitle, coupon.subtitle) && Intrinsics.d(this.chevron, coupon.chevron) && Intrinsics.d(this.leftIcon, coupon.leftIcon) && this.isApplied == coupon.isApplied && Intrinsics.d(this.appliedStub, coupon.appliedStub) && Intrinsics.d(this.unAppliedStub, coupon.unAppliedStub) && Intrinsics.d(this.common, coupon.common);
        }

        @NotNull
        public final Stub getAppliedStub() {
            return this.appliedStub;
        }

        @NotNull
        public final Background getBgColor() {
            return this.bgColor;
        }

        @NotNull
        public final IconDTO getChevron() {
            return this.chevron;
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final IconDTO getLeftIcon() {
            return this.leftIcon;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final Stub getUnAppliedStub() {
            return this.unAppliedStub;
        }

        public int hashCode() {
            int a11 = C2971a.a(this.chevron, Ns.b.a(this.subtitle, Ns.b.a(this.title, this.bgColor.hashCode() * 31, 31), 31), 31);
            IconDTO iconDTO = this.leftIcon;
            return this.common.hashCode() + ((this.unAppliedStub.hashCode() + ((this.appliedStub.hashCode() + C3532b.a((a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.isApplied)) * 31)) * 31);
        }

        public final boolean isApplied() {
            return this.isApplied;
        }

        @NotNull
        public String toString() {
            Background background = this.bgColor;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            IconDTO iconDTO = this.chevron;
            IconDTO iconDTO2 = this.leftIcon;
            boolean z11 = this.isApplied;
            Stub stub = this.appliedStub;
            Stub stub2 = this.unAppliedStub;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder sb2 = new StringBuilder("Coupon(bgColor=");
            sb2.append(background);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", subtitle=");
            G.f(sb2, textDTO2, ", chevron=", iconDTO, ", leftIcon=");
            sb2.append(iconDTO2);
            sb2.append(", isApplied=");
            sb2.append(z11);
            sb2.append(", appliedStub=");
            sb2.append(stub);
            sb2.append(", unAppliedStub=");
            sb2.append(stub2);
            sb2.append(", common=");
            return Ak.b.g(sb2, commonControlSettings, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$WordDeclension;", "", "day", "", "", "hour", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getDay", "()Ljava/util/List;", "getHour", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WordDeclension {
        public static final int $stable = 8;

        @NotNull
        private final List<String> day;

        @NotNull
        private final List<String> hour;

        public WordDeclension(@NotNull List<String> day, @NotNull List<String> hour) {
            Intrinsics.checkNotNullParameter(day, "day");
            Intrinsics.checkNotNullParameter(hour, "hour");
            this.day = day;
            this.hour = hour;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WordDeclension copy$default(WordDeclension wordDeclension, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = wordDeclension.day;
            }
            if ((i11 & 2) != 0) {
                list2 = wordDeclension.hour;
            }
            return wordDeclension.copy(list, list2);
        }

        @NotNull
        public final List<String> component1() {
            return this.day;
        }

        @NotNull
        public final List<String> component2() {
            return this.hour;
        }

        @NotNull
        public final WordDeclension copy(@NotNull List<String> day, @NotNull List<String> hour) {
            Intrinsics.checkNotNullParameter(day, "day");
            Intrinsics.checkNotNullParameter(hour, "hour");
            return new WordDeclension(day, hour);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WordDeclension)) {
                return false;
            }
            WordDeclension wordDeclension = (WordDeclension) other;
            return Intrinsics.d(this.day, wordDeclension.day) && Intrinsics.d(this.hour, wordDeclension.hour);
        }

        @NotNull
        public final List<String> getDay() {
            return this.day;
        }

        @NotNull
        public final List<String> getHour() {
            return this.hour;
        }

        public int hashCode() {
            return this.hour.hashCode() + (this.day.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2436a.b("WordDeclension(day=", this.day, ", hour=", ")", this.hour);
        }
    }

    public StaticCouponListDTO(@NotNull String bgImage, @NotNull String fgImage, @NotNull Counter counter, Coupon coupon, Coupon coupon2, @NotNull CommonControlSettings common, @NotNull WordDeclension wordDeclension) {
        Intrinsics.checkNotNullParameter(bgImage, "bgImage");
        Intrinsics.checkNotNullParameter(fgImage, "fgImage");
        Intrinsics.checkNotNullParameter(counter, "counter");
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(wordDeclension, "wordDeclension");
        this.bgImage = bgImage;
        this.fgImage = fgImage;
        this.counter = counter;
        this.coupon1 = coupon;
        this.coupon2 = coupon2;
        this.common = common;
        this.wordDeclension = wordDeclension;
    }

    public static /* synthetic */ StaticCouponListDTO copy$default(StaticCouponListDTO staticCouponListDTO, String str, String str2, Counter counter, Coupon coupon, Coupon coupon2, CommonControlSettings commonControlSettings, WordDeclension wordDeclension, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = staticCouponListDTO.bgImage;
        }
        if ((i11 & 2) != 0) {
            str2 = staticCouponListDTO.fgImage;
        }
        if ((i11 & 4) != 0) {
            counter = staticCouponListDTO.counter;
        }
        if ((i11 & 8) != 0) {
            coupon = staticCouponListDTO.coupon1;
        }
        if ((i11 & 16) != 0) {
            coupon2 = staticCouponListDTO.coupon2;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = staticCouponListDTO.common;
        }
        if ((i11 & 64) != 0) {
            wordDeclension = staticCouponListDTO.wordDeclension;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        WordDeclension wordDeclension2 = wordDeclension;
        Coupon coupon3 = coupon2;
        Counter counter2 = counter;
        return staticCouponListDTO.copy(str, str2, counter2, coupon, coupon3, commonControlSettings2, wordDeclension2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBgImage() {
        return this.bgImage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFgImage() {
        return this.fgImage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Counter getCounter() {
        return this.counter;
    }

    /* renamed from: component4, reason: from getter */
    public final Coupon getCoupon1() {
        return this.coupon1;
    }

    /* renamed from: component5, reason: from getter */
    public final Coupon getCoupon2() {
        return this.coupon2;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final WordDeclension getWordDeclension() {
        return this.wordDeclension;
    }

    @NotNull
    public final StaticCouponListDTO copy(@NotNull String bgImage, @NotNull String fgImage, @NotNull Counter counter, Coupon coupon1, Coupon coupon2, @NotNull CommonControlSettings common, @NotNull WordDeclension wordDeclension) {
        Intrinsics.checkNotNullParameter(bgImage, "bgImage");
        Intrinsics.checkNotNullParameter(fgImage, "fgImage");
        Intrinsics.checkNotNullParameter(counter, "counter");
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(wordDeclension, "wordDeclension");
        return new StaticCouponListDTO(bgImage, fgImage, counter, coupon1, coupon2, common, wordDeclension);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StaticCouponListDTO)) {
            return false;
        }
        StaticCouponListDTO staticCouponListDTO = (StaticCouponListDTO) other;
        return Intrinsics.d(this.bgImage, staticCouponListDTO.bgImage) && Intrinsics.d(this.fgImage, staticCouponListDTO.fgImage) && Intrinsics.d(this.counter, staticCouponListDTO.counter) && Intrinsics.d(this.coupon1, staticCouponListDTO.coupon1) && Intrinsics.d(this.coupon2, staticCouponListDTO.coupon2) && Intrinsics.d(this.common, staticCouponListDTO.common) && Intrinsics.d(this.wordDeclension, staticCouponListDTO.wordDeclension);
    }

    @NotNull
    public final String getBgImage() {
        return this.bgImage;
    }

    @NotNull
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final Counter getCounter() {
        return this.counter;
    }

    public final Coupon getCoupon1() {
        return this.coupon1;
    }

    public final Coupon getCoupon2() {
        return this.coupon2;
    }

    @NotNull
    public final String getFgImage() {
        return this.fgImage;
    }

    @NotNull
    public final WordDeclension getWordDeclension() {
        return this.wordDeclension;
    }

    public int hashCode() {
        int hashCode = (this.counter.hashCode() + g.a(this.bgImage.hashCode() * 31, 31, this.fgImage)) * 31;
        Coupon coupon = this.coupon1;
        int hashCode2 = (hashCode + (coupon == null ? 0 : coupon.hashCode())) * 31;
        Coupon coupon2 = this.coupon2;
        return this.wordDeclension.hashCode() + a.a(this.common, (hashCode2 + (coupon2 != null ? coupon2.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.bgImage;
        String str2 = this.fgImage;
        Counter counter = this.counter;
        Coupon coupon = this.coupon1;
        Coupon coupon2 = this.coupon2;
        CommonControlSettings commonControlSettings = this.common;
        WordDeclension wordDeclension = this.wordDeclension;
        StringBuilder d11 = C3660k.d("StaticCouponListDTO(bgImage=", str, ", fgImage=", str2, ", counter=");
        d11.append(counter);
        d11.append(", coupon1=");
        d11.append(coupon);
        d11.append(", coupon2=");
        d11.append(coupon2);
        d11.append(", common=");
        d11.append(commonControlSettings);
        d11.append(", wordDeclension=");
        d11.append(wordDeclension);
        d11.append(")");
        return d11.toString();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;", "", "backgroundColor", "", "gradientFromColor", "gradientToColor", "gradientType", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background$GradientType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background$GradientType;)V", "getBackgroundColor", "()Ljava/lang/String;", "getGradientFromColor", "getGradientToColor", "getGradientType", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background$GradientType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "GradientType", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Background {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final String gradientFromColor;
        private final String gradientToColor;

        @EnumNullFallback
        @NotNull
        private final GradientType gradientType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background$GradientType;", "", "<init>", "(Ljava/lang/String;I)V", "GRADIENT_DIRECTION_TOP_BOTTOM", "GRADIENT_DIRECTION_TOP_RIGHT_LEFT_BOTTOM", "GRADIENT_DIRECTION_RIGHT_LEFT", "GRADIENT_DIRECTION_BOTTOM_RIGHT_TOP_LEFT", "GRADIENT_DIRECTION_BOTTOM_TOP", "GRADIENT_DIRECTION_BOTTOM_LEFT_TOP_RIGHT", "GRADIENT_DIRECTION_LEFT_RIGHT", "GRADIENT_DIRECTION_TOP_LEFT_BOTTOM_RIGHT", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class GradientType {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ GradientType[] $VALUES;

            @i(name = "GRADIENT_DIRECTION_TOP_BOTTOM")
            public static final GradientType GRADIENT_DIRECTION_TOP_BOTTOM = new GradientType("GRADIENT_DIRECTION_TOP_BOTTOM", 0);

            @i(name = "GRADIENT_DIRECTION_TOP_RIGHT_LEFT_BOTTOM")
            public static final GradientType GRADIENT_DIRECTION_TOP_RIGHT_LEFT_BOTTOM = new GradientType("GRADIENT_DIRECTION_TOP_RIGHT_LEFT_BOTTOM", 1);

            @i(name = "GRADIENT_DIRECTION_RIGHT_LEFT")
            public static final GradientType GRADIENT_DIRECTION_RIGHT_LEFT = new GradientType("GRADIENT_DIRECTION_RIGHT_LEFT", 2);

            @i(name = "GRADIENT_DIRECTION_BOTTOM_RIGHT_TOP_LEFT")
            public static final GradientType GRADIENT_DIRECTION_BOTTOM_RIGHT_TOP_LEFT = new GradientType("GRADIENT_DIRECTION_BOTTOM_RIGHT_TOP_LEFT", 3);

            @i(name = "GRADIENT_DIRECTION_BOTTOM_TOP")
            public static final GradientType GRADIENT_DIRECTION_BOTTOM_TOP = new GradientType("GRADIENT_DIRECTION_BOTTOM_TOP", 4);

            @i(name = "GRADIENT_DIRECTION_BOTTOM_LEFT_TOP_RIGHT")
            public static final GradientType GRADIENT_DIRECTION_BOTTOM_LEFT_TOP_RIGHT = new GradientType("GRADIENT_DIRECTION_BOTTOM_LEFT_TOP_RIGHT", 5);

            @i(name = "GRADIENT_DIRECTION_LEFT_RIGHT")
            public static final GradientType GRADIENT_DIRECTION_LEFT_RIGHT = new GradientType("GRADIENT_DIRECTION_LEFT_RIGHT", 6);

            @i(name = "GRADIENT_DIRECTION_TOP_LEFT_BOTTOM_RIGHT")
            public static final GradientType GRADIENT_DIRECTION_TOP_LEFT_BOTTOM_RIGHT = new GradientType("GRADIENT_DIRECTION_TOP_LEFT_BOTTOM_RIGHT", 7);

            private static final /* synthetic */ GradientType[] $values() {
                return new GradientType[]{GRADIENT_DIRECTION_TOP_BOTTOM, GRADIENT_DIRECTION_TOP_RIGHT_LEFT_BOTTOM, GRADIENT_DIRECTION_RIGHT_LEFT, GRADIENT_DIRECTION_BOTTOM_RIGHT_TOP_LEFT, GRADIENT_DIRECTION_BOTTOM_TOP, GRADIENT_DIRECTION_BOTTOM_LEFT_TOP_RIGHT, GRADIENT_DIRECTION_LEFT_RIGHT, GRADIENT_DIRECTION_TOP_LEFT_BOTTOM_RIGHT};
            }

            static {
                GradientType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private GradientType(String str, int i11) {
            }

            public static GradientType valueOf(String str) {
                return (GradientType) Enum.valueOf(GradientType.class, str);
            }

            public static GradientType[] values() {
                return (GradientType[]) $VALUES.clone();
            }
        }

        public Background(String str, String str2, String str3, @NotNull GradientType gradientType) {
            Intrinsics.checkNotNullParameter(gradientType, "gradientType");
            this.backgroundColor = str;
            this.gradientFromColor = str2;
            this.gradientToColor = str3;
            this.gradientType = gradientType;
        }

        public static /* synthetic */ Background copy$default(Background background, String str, String str2, String str3, GradientType gradientType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = background.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = background.gradientFromColor;
            }
            if ((i11 & 4) != 0) {
                str3 = background.gradientToColor;
            }
            if ((i11 & 8) != 0) {
                gradientType = background.gradientType;
            }
            return background.copy(str, str2, str3, gradientType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getGradientFromColor() {
            return this.gradientFromColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getGradientToColor() {
            return this.gradientToColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final GradientType getGradientType() {
            return this.gradientType;
        }

        @NotNull
        public final Background copy(String backgroundColor, String gradientFromColor, String gradientToColor, @NotNull GradientType gradientType) {
            Intrinsics.checkNotNullParameter(gradientType, "gradientType");
            return new Background(backgroundColor, gradientFromColor, gradientToColor, gradientType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Background)) {
                return false;
            }
            Background background = (Background) other;
            return Intrinsics.d(this.backgroundColor, background.backgroundColor) && Intrinsics.d(this.gradientFromColor, background.gradientFromColor) && Intrinsics.d(this.gradientToColor, background.gradientToColor) && this.gradientType == background.gradientType;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getGradientFromColor() {
            return this.gradientFromColor;
        }

        public final String getGradientToColor() {
            return this.gradientToColor;
        }

        @NotNull
        public final GradientType getGradientType() {
            return this.gradientType;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.gradientFromColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.gradientToColor;
            return this.gradientType.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            String str2 = this.gradientFromColor;
            String str3 = this.gradientToColor;
            GradientType gradientType = this.gradientType;
            StringBuilder d11 = C3660k.d("Background(backgroundColor=", str, ", gradientFromColor=", str2, ", gradientToColor=");
            d11.append(str3);
            d11.append(", gradientType=");
            d11.append(gradientType);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ Background(String str, String str2, String str3, GradientType gradientType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i11 & 8) != 0 ? GradientType.GRADIENT_DIRECTION_TOP_BOTTOM : gradientType);
        }
    }
}
