package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.data;

import B0.C2454a;
import B90.C2618u;
import C.o0;
import D40.d;
import G.g;
import N3.C3660k;
import Ns.b;
import Ul.C4070a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u000201BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Ji\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO;", "", "sendButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "countTextInput", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO$TextInput;", "regionTextInput", "deliveryTabs", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO$Tabs;", "deliveryText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "footerText", "messageTemplate", "", "closeTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO$TextInput;Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO$TextInput;Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO$Tabs;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/util/Map;)V", "getSendButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getCountTextInput", "()Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO$TextInput;", "getRegionTextInput", "getDeliveryTabs", "()Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO$Tabs;", "getDeliveryText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getFooterText", "getMessageTemplate", "()Ljava/lang/String;", "getCloseTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "TextInput", "Tabs", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class WholeSaleModalDTO {
    public static final int $stable = 8;
    private final Map<String, TokenizedTrackingInfo> closeTrackingInfo;

    @NotNull
    private final TextInput countTextInput;

    @NotNull
    private final Tabs deliveryTabs;

    @NotNull
    private final TextDTO deliveryText;
    private final TextDTO footerText;

    @NotNull
    private final String messageTemplate;

    @NotNull
    private final TextInput regionTextInput;

    @NotNull
    private final ButtonV3DTO sendButton;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO$Tabs;", "", "messagePlaceholderKey", "", DynamicElementDTO.TABS, "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "trackingTypes", "", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/DeliveryType;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/tabs/TabsDTO;Ljava/util/List;)V", "getMessagePlaceholderKey", "()Ljava/lang/String;", "getTabs", "()Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "getTrackingTypes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tabs {
        public static final int $stable = 8;

        @NotNull
        private final String messagePlaceholderKey;

        @NotNull
        private final TabsDTO tabs;

        @NotNull
        private final List<DeliveryType> trackingTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public Tabs(@NotNull String messagePlaceholderKey, @NotNull TabsDTO tabs, @NotNull List<? extends DeliveryType> trackingTypes) {
            Intrinsics.checkNotNullParameter(messagePlaceholderKey, "messagePlaceholderKey");
            Intrinsics.checkNotNullParameter(tabs, "tabs");
            Intrinsics.checkNotNullParameter(trackingTypes, "trackingTypes");
            this.messagePlaceholderKey = messagePlaceholderKey;
            this.tabs = tabs;
            this.trackingTypes = trackingTypes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Tabs copy$default(Tabs tabs, String str, TabsDTO tabsDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tabs.messagePlaceholderKey;
            }
            if ((i11 & 2) != 0) {
                tabsDTO = tabs.tabs;
            }
            if ((i11 & 4) != 0) {
                list = tabs.trackingTypes;
            }
            return tabs.copy(str, tabsDTO, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessagePlaceholderKey() {
            return this.messagePlaceholderKey;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TabsDTO getTabs() {
            return this.tabs;
        }

        @NotNull
        public final List<DeliveryType> component3() {
            return this.trackingTypes;
        }

        @NotNull
        public final Tabs copy(@NotNull String messagePlaceholderKey, @NotNull TabsDTO tabs, @NotNull List<? extends DeliveryType> trackingTypes) {
            Intrinsics.checkNotNullParameter(messagePlaceholderKey, "messagePlaceholderKey");
            Intrinsics.checkNotNullParameter(tabs, "tabs");
            Intrinsics.checkNotNullParameter(trackingTypes, "trackingTypes");
            return new Tabs(messagePlaceholderKey, tabs, trackingTypes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tabs)) {
                return false;
            }
            Tabs tabs = (Tabs) other;
            return Intrinsics.d(this.messagePlaceholderKey, tabs.messagePlaceholderKey) && Intrinsics.d(this.tabs, tabs.tabs) && Intrinsics.d(this.trackingTypes, tabs.trackingTypes);
        }

        @NotNull
        public final String getMessagePlaceholderKey() {
            return this.messagePlaceholderKey;
        }

        @NotNull
        public final TabsDTO getTabs() {
            return this.tabs;
        }

        @NotNull
        public final List<DeliveryType> getTrackingTypes() {
            return this.trackingTypes;
        }

        public int hashCode() {
            return this.trackingTypes.hashCode() + ((this.tabs.hashCode() + (this.messagePlaceholderKey.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.messagePlaceholderKey;
            TabsDTO tabsDTO = this.tabs;
            List<DeliveryType> list = this.trackingTypes;
            StringBuilder sb2 = new StringBuilder("Tabs(messagePlaceholderKey=");
            sb2.append(str);
            sb2.append(", tabs=");
            sb2.append(tabsDTO);
            sb2.append(", trackingTypes=");
            return C2618u.h(sb2, list, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JF\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO$TextInput;", "", "messagePlaceholderKey", "", HammersV3BodyDTO.PLACEHOLDER, "hint", "minCount", "", "errorRequiredText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getMessagePlaceholderKey", "()Ljava/lang/String;", "getPlaceholder", "getHint", "getMinCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorRequiredText", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO$TextInput;", "equals", "", "other", "hashCode", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextInput {
        public static final int $stable = 0;
        private final String errorRequiredText;
        private final String hint;

        @NotNull
        private final String messagePlaceholderKey;
        private final Integer minCount;

        @NotNull
        private final String placeholder;

        public TextInput(@NotNull String messagePlaceholderKey, @NotNull String placeholder, String str, Integer num, String str2) {
            Intrinsics.checkNotNullParameter(messagePlaceholderKey, "messagePlaceholderKey");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.messagePlaceholderKey = messagePlaceholderKey;
            this.placeholder = placeholder;
            this.hint = str;
            this.minCount = num;
            this.errorRequiredText = str2;
        }

        public static /* synthetic */ TextInput copy$default(TextInput textInput, String str, String str2, String str3, Integer num, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textInput.messagePlaceholderKey;
            }
            if ((i11 & 2) != 0) {
                str2 = textInput.placeholder;
            }
            if ((i11 & 4) != 0) {
                str3 = textInput.hint;
            }
            if ((i11 & 8) != 0) {
                num = textInput.minCount;
            }
            if ((i11 & 16) != 0) {
                str4 = textInput.errorRequiredText;
            }
            String str5 = str4;
            String str6 = str3;
            return textInput.copy(str, str2, str6, num, str5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessagePlaceholderKey() {
            return this.messagePlaceholderKey;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getMinCount() {
            return this.minCount;
        }

        /* renamed from: component5, reason: from getter */
        public final String getErrorRequiredText() {
            return this.errorRequiredText;
        }

        @NotNull
        public final TextInput copy(@NotNull String messagePlaceholderKey, @NotNull String placeholder, String hint, Integer minCount, String errorRequiredText) {
            Intrinsics.checkNotNullParameter(messagePlaceholderKey, "messagePlaceholderKey");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            return new TextInput(messagePlaceholderKey, placeholder, hint, minCount, errorRequiredText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextInput)) {
                return false;
            }
            TextInput textInput = (TextInput) other;
            return Intrinsics.d(this.messagePlaceholderKey, textInput.messagePlaceholderKey) && Intrinsics.d(this.placeholder, textInput.placeholder) && Intrinsics.d(this.hint, textInput.hint) && Intrinsics.d(this.minCount, textInput.minCount) && Intrinsics.d(this.errorRequiredText, textInput.errorRequiredText);
        }

        public final String getErrorRequiredText() {
            return this.errorRequiredText;
        }

        public final String getHint() {
            return this.hint;
        }

        @NotNull
        public final String getMessagePlaceholderKey() {
            return this.messagePlaceholderKey;
        }

        public final Integer getMinCount() {
            return this.minCount;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public int hashCode() {
            int a11 = g.a(this.messagePlaceholderKey.hashCode() * 31, 31, this.placeholder);
            String str = this.hint;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.minCount;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.errorRequiredText;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.messagePlaceholderKey;
            String str2 = this.placeholder;
            String str3 = this.hint;
            Integer num = this.minCount;
            String str4 = this.errorRequiredText;
            StringBuilder d11 = C3660k.d("TextInput(messagePlaceholderKey=", str, ", placeholder=", str2, ", hint=");
            C2454a.f(num, str3, ", minCount=", ", errorRequiredText=", d11);
            return o0.c(d11, str4, ")");
        }
    }

    public WholeSaleModalDTO(@NotNull ButtonV3DTO sendButton, @NotNull TextInput countTextInput, @NotNull TextInput regionTextInput, @NotNull Tabs deliveryTabs, @NotNull TextDTO deliveryText, TextDTO textDTO, @NotNull String messageTemplate, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        Intrinsics.checkNotNullParameter(countTextInput, "countTextInput");
        Intrinsics.checkNotNullParameter(regionTextInput, "regionTextInput");
        Intrinsics.checkNotNullParameter(deliveryTabs, "deliveryTabs");
        Intrinsics.checkNotNullParameter(deliveryText, "deliveryText");
        Intrinsics.checkNotNullParameter(messageTemplate, "messageTemplate");
        this.sendButton = sendButton;
        this.countTextInput = countTextInput;
        this.regionTextInput = regionTextInput;
        this.deliveryTabs = deliveryTabs;
        this.deliveryText = deliveryText;
        this.footerText = textDTO;
        this.messageTemplate = messageTemplate;
        this.closeTrackingInfo = map;
    }

    public static /* synthetic */ WholeSaleModalDTO copy$default(WholeSaleModalDTO wholeSaleModalDTO, ButtonV3DTO buttonV3DTO, TextInput textInput, TextInput textInput2, Tabs tabs, TextDTO textDTO, TextDTO textDTO2, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonV3DTO = wholeSaleModalDTO.sendButton;
        }
        if ((i11 & 2) != 0) {
            textInput = wholeSaleModalDTO.countTextInput;
        }
        if ((i11 & 4) != 0) {
            textInput2 = wholeSaleModalDTO.regionTextInput;
        }
        if ((i11 & 8) != 0) {
            tabs = wholeSaleModalDTO.deliveryTabs;
        }
        if ((i11 & 16) != 0) {
            textDTO = wholeSaleModalDTO.deliveryText;
        }
        if ((i11 & 32) != 0) {
            textDTO2 = wholeSaleModalDTO.footerText;
        }
        if ((i11 & 64) != 0) {
            str = wholeSaleModalDTO.messageTemplate;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = wholeSaleModalDTO.closeTrackingInfo;
        }
        String str2 = str;
        Map map2 = map;
        TextDTO textDTO3 = textDTO;
        TextDTO textDTO4 = textDTO2;
        return wholeSaleModalDTO.copy(buttonV3DTO, textInput, textInput2, tabs, textDTO3, textDTO4, str2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getSendButton() {
        return this.sendButton;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextInput getCountTextInput() {
        return this.countTextInput;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextInput getRegionTextInput() {
        return this.regionTextInput;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Tabs getDeliveryTabs() {
        return this.deliveryTabs;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextDTO getDeliveryText() {
        return this.deliveryText;
    }

    /* renamed from: component6, reason: from getter */
    public final TextDTO getFooterText() {
        return this.footerText;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getMessageTemplate() {
        return this.messageTemplate;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.closeTrackingInfo;
    }

    @NotNull
    public final WholeSaleModalDTO copy(@NotNull ButtonV3DTO sendButton, @NotNull TextInput countTextInput, @NotNull TextInput regionTextInput, @NotNull Tabs deliveryTabs, @NotNull TextDTO deliveryText, TextDTO footerText, @NotNull String messageTemplate, Map<String, TokenizedTrackingInfo> closeTrackingInfo) {
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        Intrinsics.checkNotNullParameter(countTextInput, "countTextInput");
        Intrinsics.checkNotNullParameter(regionTextInput, "regionTextInput");
        Intrinsics.checkNotNullParameter(deliveryTabs, "deliveryTabs");
        Intrinsics.checkNotNullParameter(deliveryText, "deliveryText");
        Intrinsics.checkNotNullParameter(messageTemplate, "messageTemplate");
        return new WholeSaleModalDTO(sendButton, countTextInput, regionTextInput, deliveryTabs, deliveryText, footerText, messageTemplate, closeTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WholeSaleModalDTO)) {
            return false;
        }
        WholeSaleModalDTO wholeSaleModalDTO = (WholeSaleModalDTO) other;
        return Intrinsics.d(this.sendButton, wholeSaleModalDTO.sendButton) && Intrinsics.d(this.countTextInput, wholeSaleModalDTO.countTextInput) && Intrinsics.d(this.regionTextInput, wholeSaleModalDTO.regionTextInput) && Intrinsics.d(this.deliveryTabs, wholeSaleModalDTO.deliveryTabs) && Intrinsics.d(this.deliveryText, wholeSaleModalDTO.deliveryText) && Intrinsics.d(this.footerText, wholeSaleModalDTO.footerText) && Intrinsics.d(this.messageTemplate, wholeSaleModalDTO.messageTemplate) && Intrinsics.d(this.closeTrackingInfo, wholeSaleModalDTO.closeTrackingInfo);
    }

    public final Map<String, TokenizedTrackingInfo> getCloseTrackingInfo() {
        return this.closeTrackingInfo;
    }

    @NotNull
    public final TextInput getCountTextInput() {
        return this.countTextInput;
    }

    @NotNull
    public final Tabs getDeliveryTabs() {
        return this.deliveryTabs;
    }

    @NotNull
    public final TextDTO getDeliveryText() {
        return this.deliveryText;
    }

    public final TextDTO getFooterText() {
        return this.footerText;
    }

    @NotNull
    public final String getMessageTemplate() {
        return this.messageTemplate;
    }

    @NotNull
    public final TextInput getRegionTextInput() {
        return this.regionTextInput;
    }

    @NotNull
    public final ButtonV3DTO getSendButton() {
        return this.sendButton;
    }

    public int hashCode() {
        int a11 = b.a(this.deliveryText, (this.deliveryTabs.hashCode() + ((this.regionTextInput.hashCode() + ((this.countTextInput.hashCode() + (this.sendButton.hashCode() * 31)) * 31)) * 31)) * 31, 31);
        TextDTO textDTO = this.footerText;
        int a12 = g.a((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.messageTemplate);
        Map<String, TokenizedTrackingInfo> map = this.closeTrackingInfo;
        return a12 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ButtonV3DTO buttonV3DTO = this.sendButton;
        TextInput textInput = this.countTextInput;
        TextInput textInput2 = this.regionTextInput;
        Tabs tabs = this.deliveryTabs;
        TextDTO textDTO = this.deliveryText;
        TextDTO textDTO2 = this.footerText;
        String str = this.messageTemplate;
        Map<String, TokenizedTrackingInfo> map = this.closeTrackingInfo;
        StringBuilder sb2 = new StringBuilder("WholeSaleModalDTO(sendButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", countTextInput=");
        sb2.append(textInput);
        sb2.append(", regionTextInput=");
        sb2.append(textInput2);
        sb2.append(", deliveryTabs=");
        sb2.append(tabs);
        sb2.append(", deliveryText=");
        d.e(", footerText=", ", messageTemplate=", sb2, textDTO, textDTO2);
        return C4070a.a(sb2, str, ", closeTrackingInfo=", map, ")");
    }
}
