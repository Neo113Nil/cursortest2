package ru.ozon.app.android.marketing.widgets.bigPromoCheckout.data;

import D3.g;
import Tl.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001(BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/data/BigPromoCheckoutDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "backgroundColor", "", "timerBadge", "Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/data/BigPromoCheckoutDTO$TimerBadgeDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/data/BigPromoCheckoutDTO$TimerBadgeDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getTimerBadge", "()Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/data/BigPromoCheckoutDTO$TimerBadgeDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "TimerBadgeDTO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BigPromoCheckoutDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final IconDTO icon;
    private final TextDTO subtitle;
    private final TimerBadgeDTO timerBadge;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/data/BigPromoCheckoutDTO$TimerBadgeDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "secondsLeft", "", "timerStyle", "onExpiredText", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/Long;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getSecondsLeft", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTimerStyle", "getOnExpiredText", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/Long;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/data/BigPromoCheckoutDTO$TimerBadgeDTO;", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerBadgeDTO {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final TextDTO onExpiredText;
        private final Long secondsLeft;
        private final TextDTO text;
        private final TextDTO timerStyle;

        public TimerBadgeDTO(TextDTO textDTO, String str, Long l11, TextDTO textDTO2, TextDTO textDTO3) {
            this.text = textDTO;
            this.backgroundColor = str;
            this.secondsLeft = l11;
            this.timerStyle = textDTO2;
            this.onExpiredText = textDTO3;
        }

        public static /* synthetic */ TimerBadgeDTO copy$default(TimerBadgeDTO timerBadgeDTO, TextDTO textDTO, String str, Long l11, TextDTO textDTO2, TextDTO textDTO3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = timerBadgeDTO.text;
            }
            if ((i11 & 2) != 0) {
                str = timerBadgeDTO.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                l11 = timerBadgeDTO.secondsLeft;
            }
            if ((i11 & 8) != 0) {
                textDTO2 = timerBadgeDTO.timerStyle;
            }
            if ((i11 & 16) != 0) {
                textDTO3 = timerBadgeDTO.onExpiredText;
            }
            TextDTO textDTO4 = textDTO3;
            Long l12 = l11;
            return timerBadgeDTO.copy(textDTO, str, l12, textDTO2, textDTO4);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final Long getSecondsLeft() {
            return this.secondsLeft;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getTimerStyle() {
            return this.timerStyle;
        }

        /* renamed from: component5, reason: from getter */
        public final TextDTO getOnExpiredText() {
            return this.onExpiredText;
        }

        @NotNull
        public final TimerBadgeDTO copy(TextDTO text, String backgroundColor, Long secondsLeft, TextDTO timerStyle, TextDTO onExpiredText) {
            return new TimerBadgeDTO(text, backgroundColor, secondsLeft, timerStyle, onExpiredText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerBadgeDTO)) {
                return false;
            }
            TimerBadgeDTO timerBadgeDTO = (TimerBadgeDTO) other;
            return Intrinsics.d(this.text, timerBadgeDTO.text) && Intrinsics.d(this.backgroundColor, timerBadgeDTO.backgroundColor) && Intrinsics.d(this.secondsLeft, timerBadgeDTO.secondsLeft) && Intrinsics.d(this.timerStyle, timerBadgeDTO.timerStyle) && Intrinsics.d(this.onExpiredText, timerBadgeDTO.onExpiredText);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final TextDTO getOnExpiredText() {
            return this.onExpiredText;
        }

        public final Long getSecondsLeft() {
            return this.secondsLeft;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public final TextDTO getTimerStyle() {
            return this.timerStyle;
        }

        public int hashCode() {
            TextDTO textDTO = this.text;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l11 = this.secondsLeft;
            int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
            TextDTO textDTO2 = this.timerStyle;
            int hashCode4 = (hashCode3 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            TextDTO textDTO3 = this.onExpiredText;
            return hashCode4 + (textDTO3 != null ? textDTO3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            String str = this.backgroundColor;
            Long l11 = this.secondsLeft;
            TextDTO textDTO2 = this.timerStyle;
            TextDTO textDTO3 = this.onExpiredText;
            StringBuilder f7 = g.f("TimerBadgeDTO(text=", textDTO, ", backgroundColor=", str, ", secondsLeft=");
            f7.append(l11);
            f7.append(", timerStyle=");
            f7.append(textDTO2);
            f7.append(", onExpiredText=");
            return b.e(f7, textDTO3, ")");
        }
    }

    public BigPromoCheckoutDTO(@NotNull TextDTO title, TextDTO textDTO, IconDTO iconDTO, String str, TimerBadgeDTO timerBadgeDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = textDTO;
        this.icon = iconDTO;
        this.backgroundColor = str;
        this.timerBadge = timerBadgeDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ BigPromoCheckoutDTO copy$default(BigPromoCheckoutDTO bigPromoCheckoutDTO, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, String str, TimerBadgeDTO timerBadgeDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = bigPromoCheckoutDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = bigPromoCheckoutDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            iconDTO = bigPromoCheckoutDTO.icon;
        }
        if ((i11 & 8) != 0) {
            str = bigPromoCheckoutDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            timerBadgeDTO = bigPromoCheckoutDTO.timerBadge;
        }
        if ((i11 & 32) != 0) {
            map = bigPromoCheckoutDTO.trackingInfo;
        }
        TimerBadgeDTO timerBadgeDTO2 = timerBadgeDTO;
        Map map2 = map;
        return bigPromoCheckoutDTO.copy(textDTO, textDTO2, iconDTO, str, timerBadgeDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final TimerBadgeDTO getTimerBadge() {
        return this.timerBadge;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final BigPromoCheckoutDTO copy(@NotNull TextDTO title, TextDTO subtitle, IconDTO icon, String backgroundColor, TimerBadgeDTO timerBadge, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new BigPromoCheckoutDTO(title, subtitle, icon, backgroundColor, timerBadge, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BigPromoCheckoutDTO)) {
            return false;
        }
        BigPromoCheckoutDTO bigPromoCheckoutDTO = (BigPromoCheckoutDTO) other;
        return Intrinsics.d(this.title, bigPromoCheckoutDTO.title) && Intrinsics.d(this.subtitle, bigPromoCheckoutDTO.subtitle) && Intrinsics.d(this.icon, bigPromoCheckoutDTO.icon) && Intrinsics.d(this.backgroundColor, bigPromoCheckoutDTO.backgroundColor) && Intrinsics.d(this.timerBadge, bigPromoCheckoutDTO.timerBadge) && Intrinsics.d(this.trackingInfo, bigPromoCheckoutDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TimerBadgeDTO getTimerBadge() {
        return this.timerBadge;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        IconDTO iconDTO = this.icon;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        TimerBadgeDTO timerBadgeDTO = this.timerBadge;
        int hashCode5 = (hashCode4 + (timerBadgeDTO == null ? 0 : timerBadgeDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        IconDTO iconDTO = this.icon;
        String str = this.backgroundColor;
        TimerBadgeDTO timerBadgeDTO = this.timerBadge;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = g.g("BigPromoCheckoutDTO(title=", textDTO, ", subtitle=", textDTO2, ", icon=");
        g10.append(iconDTO);
        g10.append(", backgroundColor=");
        g10.append(str);
        g10.append(", timerBadge=");
        g10.append(timerBadgeDTO);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(")");
        return g10.toString();
    }
}
