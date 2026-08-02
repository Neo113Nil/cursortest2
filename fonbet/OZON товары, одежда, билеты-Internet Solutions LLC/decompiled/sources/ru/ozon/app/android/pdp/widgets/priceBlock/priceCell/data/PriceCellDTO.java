package ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.data;

import B0.A0;
import B3.p;
import B90.C2619v;
import C.o0;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0002ABB\u0095\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010*J\u0017\u00108\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003J´\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0014HÖ\u0001J\t\u0010@\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#¨\u0006C"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "counterBadge", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO$CounterBadge;", "disclosure", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO$Disclosure;", "innerBackgroundColor", "", "outerBackgroundColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "animationTimer", "", "animationTrackingInfo", "tabGroupId", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO$CounterBadge;Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO$Disclosure;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getCounterBadge", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO$CounterBadge;", "getDisclosure", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO$Disclosure;", "getInnerBackgroundColor", "()Ljava/lang/String;", "getOuterBackgroundColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getAnimationTimer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAnimationTrackingInfo", "getTabGroupId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO$CounterBadge;Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO$Disclosure;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;)Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO;", "equals", "", "other", "hashCode", "toString", "CounterBadge", "Disclosure", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceCellDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final Integer animationTimer;
    private final Map<String, TokenizedTrackingInfo> animationTrackingInfo;
    private final CounterBadge counterBadge;
    private final Disclosure disclosure;
    private final Icon icon;
    private final String innerBackgroundColor;
    private final String outerBackgroundColor;
    private final TextAtom subtitle;
    private final String tabGroupId;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO$CounterBadge;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "textColor", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getTextColor", "getBackgroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CounterBadge {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final String textColor;

        @NotNull
        private final String value;

        public CounterBadge(@NotNull String value, String str, String str2) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.textColor = str;
            this.backgroundColor = str2;
        }

        public static /* synthetic */ CounterBadge copy$default(CounterBadge counterBadge, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = counterBadge.value;
            }
            if ((i11 & 2) != 0) {
                str2 = counterBadge.textColor;
            }
            if ((i11 & 4) != 0) {
                str3 = counterBadge.backgroundColor;
            }
            return counterBadge.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CounterBadge copy(@NotNull String value, String textColor, String backgroundColor) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new CounterBadge(value, textColor, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CounterBadge)) {
                return false;
            }
            CounterBadge counterBadge = (CounterBadge) other;
            return Intrinsics.d(this.value, counterBadge.value) && Intrinsics.d(this.textColor, counterBadge.textColor) && Intrinsics.d(this.backgroundColor, counterBadge.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = this.value.hashCode() * 31;
            String str = this.textColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.value;
            String str2 = this.textColor;
            return o0.c(C3660k.d("CounterBadge(value=", str, ", textColor=", str2, ", backgroundColor="), this.backgroundColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO$Disclosure;", "", "tintColor", "", "<init>", "(Ljava/lang/String;)V", "getTintColor", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Disclosure {
        public static final int $stable = 0;
        private final String tintColor;

        public Disclosure(String str) {
            this.tintColor = str;
        }

        public static /* synthetic */ Disclosure copy$default(Disclosure disclosure, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = disclosure.tintColor;
            }
            return disclosure.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        @NotNull
        public final Disclosure copy(String tintColor) {
            return new Disclosure(tintColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Disclosure) && Intrinsics.d(this.tintColor, ((Disclosure) other).tintColor);
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            String str = this.tintColor;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Disclosure(tintColor=", this.tintColor, ")");
        }
    }

    public PriceCellDTO(Icon icon, @NotNull TextAtom title, TextAtom textAtom, CounterBadge counterBadge, Disclosure disclosure, String str, String str2, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, Integer num, Map<String, TokenizedTrackingInfo> map2, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.icon = icon;
        this.title = title;
        this.subtitle = textAtom;
        this.counterBadge = counterBadge;
        this.disclosure = disclosure;
        this.innerBackgroundColor = str;
        this.outerBackgroundColor = str2;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.animationTimer = num;
        this.animationTrackingInfo = map2;
        this.tabGroupId = str3;
    }

    public static /* synthetic */ PriceCellDTO copy$default(PriceCellDTO priceCellDTO, Icon icon, TextAtom textAtom, TextAtom textAtom2, CounterBadge counterBadge, Disclosure disclosure, String str, String str2, AtomActionDTO atomActionDTO, Map map, Integer num, Map map2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            icon = priceCellDTO.icon;
        }
        if ((i11 & 2) != 0) {
            textAtom = priceCellDTO.title;
        }
        if ((i11 & 4) != 0) {
            textAtom2 = priceCellDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            counterBadge = priceCellDTO.counterBadge;
        }
        if ((i11 & 16) != 0) {
            disclosure = priceCellDTO.disclosure;
        }
        if ((i11 & 32) != 0) {
            str = priceCellDTO.innerBackgroundColor;
        }
        if ((i11 & 64) != 0) {
            str2 = priceCellDTO.outerBackgroundColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            atomActionDTO = priceCellDTO.action;
        }
        if ((i11 & 256) != 0) {
            map = priceCellDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            num = priceCellDTO.animationTimer;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            map2 = priceCellDTO.animationTrackingInfo;
        }
        if ((i11 & 2048) != 0) {
            str3 = priceCellDTO.tabGroupId;
        }
        Map map3 = map2;
        String str4 = str3;
        Map map4 = map;
        Integer num2 = num;
        String str5 = str2;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Disclosure disclosure2 = disclosure;
        String str6 = str;
        return priceCellDTO.copy(icon, textAtom, textAtom2, counterBadge, disclosure2, str6, str5, atomActionDTO2, map4, num2, map3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getAnimationTimer() {
        return this.animationTimer;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.animationTrackingInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final CounterBadge getCounterBadge() {
        return this.counterBadge;
    }

    /* renamed from: component5, reason: from getter */
    public final Disclosure getDisclosure() {
        return this.disclosure;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInnerBackgroundColor() {
        return this.innerBackgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOuterBackgroundColor() {
        return this.outerBackgroundColor;
    }

    /* renamed from: component8, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final PriceCellDTO copy(Icon icon, @NotNull TextAtom title, TextAtom subtitle, CounterBadge counterBadge, Disclosure disclosure, String innerBackgroundColor, String outerBackgroundColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, Integer animationTimer, Map<String, TokenizedTrackingInfo> animationTrackingInfo, String tabGroupId) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new PriceCellDTO(icon, title, subtitle, counterBadge, disclosure, innerBackgroundColor, outerBackgroundColor, action, trackingInfo, animationTimer, animationTrackingInfo, tabGroupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceCellDTO)) {
            return false;
        }
        PriceCellDTO priceCellDTO = (PriceCellDTO) other;
        return Intrinsics.d(this.icon, priceCellDTO.icon) && Intrinsics.d(this.title, priceCellDTO.title) && Intrinsics.d(this.subtitle, priceCellDTO.subtitle) && Intrinsics.d(this.counterBadge, priceCellDTO.counterBadge) && Intrinsics.d(this.disclosure, priceCellDTO.disclosure) && Intrinsics.d(this.innerBackgroundColor, priceCellDTO.innerBackgroundColor) && Intrinsics.d(this.outerBackgroundColor, priceCellDTO.outerBackgroundColor) && Intrinsics.d(this.action, priceCellDTO.action) && Intrinsics.d(this.trackingInfo, priceCellDTO.trackingInfo) && Intrinsics.d(this.animationTimer, priceCellDTO.animationTimer) && Intrinsics.d(this.animationTrackingInfo, priceCellDTO.animationTrackingInfo) && Intrinsics.d(this.tabGroupId, priceCellDTO.tabGroupId);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Integer getAnimationTimer() {
        return this.animationTimer;
    }

    public final Map<String, TokenizedTrackingInfo> getAnimationTrackingInfo() {
        return this.animationTrackingInfo;
    }

    public final CounterBadge getCounterBadge() {
        return this.counterBadge;
    }

    public final Disclosure getDisclosure() {
        return this.disclosure;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final String getInnerBackgroundColor() {
        return this.innerBackgroundColor;
    }

    public final String getOuterBackgroundColor() {
        return this.outerBackgroundColor;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Icon icon = this.icon;
        int b11 = C2619v.b((icon == null ? 0 : icon.hashCode()) * 31, 31, this.title);
        TextAtom textAtom = this.subtitle;
        int hashCode = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        CounterBadge counterBadge = this.counterBadge;
        int hashCode2 = (hashCode + (counterBadge == null ? 0 : counterBadge.hashCode())) * 31;
        Disclosure disclosure = this.disclosure;
        int hashCode3 = (hashCode2 + (disclosure == null ? 0 : disclosure.hashCode())) * 31;
        String str = this.innerBackgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.outerBackgroundColor;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.animationTimer;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.animationTrackingInfo;
        int hashCode9 = (hashCode8 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str3 = this.tabGroupId;
        return hashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Icon icon = this.icon;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        CounterBadge counterBadge = this.counterBadge;
        Disclosure disclosure = this.disclosure;
        String str = this.innerBackgroundColor;
        String str2 = this.outerBackgroundColor;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Integer num = this.animationTimer;
        Map<String, TokenizedTrackingInfo> map2 = this.animationTrackingInfo;
        String str3 = this.tabGroupId;
        StringBuilder sb2 = new StringBuilder("PriceCellDTO(icon=");
        sb2.append(icon);
        sb2.append(", title=");
        sb2.append(textAtom);
        sb2.append(", subtitle=");
        sb2.append(textAtom2);
        sb2.append(", counterBadge=");
        sb2.append(counterBadge);
        sb2.append(", disclosure=");
        sb2.append(disclosure);
        sb2.append(", innerBackgroundColor=");
        sb2.append(str);
        sb2.append(", outerBackgroundColor=");
        p.c(str2, ", action=", ", trackingInfo=", sb2, atomActionDTO);
        sb2.append(map);
        sb2.append(", animationTimer=");
        sb2.append(num);
        sb2.append(", animationTrackingInfo=");
        sb2.append(map2);
        sb2.append(", tabGroupId=");
        sb2.append(str3);
        sb2.append(")");
        return sb2.toString();
    }
}
