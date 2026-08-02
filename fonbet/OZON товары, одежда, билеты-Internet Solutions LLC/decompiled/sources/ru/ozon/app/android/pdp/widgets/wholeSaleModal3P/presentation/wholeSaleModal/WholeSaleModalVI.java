package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleModal;

import B0.C2454a;
import B90.C2618u;
import C.o0;
import G.g;
import Kk.C3532b;
import Lh.a;
import N3.C3660k;
import Ns.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.data.DeliveryType;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001:\u0002-.BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b)\u0010(R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$TextInput;", "countTextInput", "regionTextInput", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$Tabs;", "deliveryTabs", "Lru/ozon/uni/atoms/data/text/TextDTO;", "deliveryText", "footerText", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "closeTokenizedEvent", "<init>", "(JLru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$TextInput;Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$TextInput;Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$Tabs;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$TextInput;", "getCountTextInput", "()Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$TextInput;", "getRegionTextInput", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$Tabs;", "getDeliveryTabs", "()Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$Tabs;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDeliveryText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getFooterText", "LWZ/t;", "getCloseTokenizedEvent", "()LWZ/t;", "TextInput", "Tabs", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class WholeSaleModalVI implements c {
    private final t closeTokenizedEvent;

    @NotNull
    private final TextInput countTextInput;

    @NotNull
    private final Tabs deliveryTabs;

    @NotNull
    private final TextDTO deliveryText;
    private final TextDTO footerText;
    private final long id;

    @NotNull
    private final TextInput regionTextInput;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$Tabs;", "", "", "messagePlaceholderKey", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/DeliveryType;", "trackingTypes", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/tabs/TabsDTO;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessagePlaceholderKey", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "getTabs", "()Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "Ljava/util/List;", "getTrackingTypes", "()Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tabs {

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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\t\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$TextInput;", "", "", "messagePlaceholderKey", HammersV3BodyDTO.PLACEHOLDER, "hint", "", "minCount", "", "isDigit", "", "maxLength", "errorRequiredText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZSLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessagePlaceholderKey", "getPlaceholder", "getHint", "Ljava/lang/Integer;", "getMinCount", "()Ljava/lang/Integer;", "Z", "()Z", "S", "getMaxLength", "()S", "getErrorRequiredText", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextInput {
        private final String errorRequiredText;
        private final String hint;
        private final boolean isDigit;
        private final short maxLength;

        @NotNull
        private final String messagePlaceholderKey;
        private final Integer minCount;

        @NotNull
        private final String placeholder;

        public TextInput(@NotNull String messagePlaceholderKey, @NotNull String placeholder, String str, Integer num, boolean z11, short s11, String str2) {
            Intrinsics.checkNotNullParameter(messagePlaceholderKey, "messagePlaceholderKey");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.messagePlaceholderKey = messagePlaceholderKey;
            this.placeholder = placeholder;
            this.hint = str;
            this.minCount = num;
            this.isDigit = z11;
            this.maxLength = s11;
            this.errorRequiredText = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextInput)) {
                return false;
            }
            TextInput textInput = (TextInput) other;
            return Intrinsics.d(this.messagePlaceholderKey, textInput.messagePlaceholderKey) && Intrinsics.d(this.placeholder, textInput.placeholder) && Intrinsics.d(this.hint, textInput.hint) && Intrinsics.d(this.minCount, textInput.minCount) && this.isDigit == textInput.isDigit && this.maxLength == textInput.maxLength && Intrinsics.d(this.errorRequiredText, textInput.errorRequiredText);
        }

        public final String getErrorRequiredText() {
            return this.errorRequiredText;
        }

        public final String getHint() {
            return this.hint;
        }

        public final short getMaxLength() {
            return this.maxLength;
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
            int hashCode2 = (Short.hashCode(this.maxLength) + C3532b.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.isDigit)) * 31;
            String str2 = this.errorRequiredText;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        /* renamed from: isDigit, reason: from getter */
        public final boolean getIsDigit() {
            return this.isDigit;
        }

        @NotNull
        public String toString() {
            String str = this.messagePlaceholderKey;
            String str2 = this.placeholder;
            String str3 = this.hint;
            Integer num = this.minCount;
            boolean z11 = this.isDigit;
            short s11 = this.maxLength;
            String str4 = this.errorRequiredText;
            StringBuilder d11 = C3660k.d("TextInput(messagePlaceholderKey=", str, ", placeholder=", str2, ", hint=");
            C2454a.f(num, str3, ", minCount=", ", isDigit=", d11);
            d11.append(z11);
            d11.append(", maxLength=");
            d11.append((int) s11);
            d11.append(", errorRequiredText=");
            return o0.c(d11, str4, ")");
        }
    }

    public WholeSaleModalVI(long j11, @NotNull TextInput countTextInput, @NotNull TextInput regionTextInput, @NotNull Tabs deliveryTabs, @NotNull TextDTO deliveryText, TextDTO textDTO, t tVar) {
        Intrinsics.checkNotNullParameter(countTextInput, "countTextInput");
        Intrinsics.checkNotNullParameter(regionTextInput, "regionTextInput");
        Intrinsics.checkNotNullParameter(deliveryTabs, "deliveryTabs");
        Intrinsics.checkNotNullParameter(deliveryText, "deliveryText");
        this.id = j11;
        this.countTextInput = countTextInput;
        this.regionTextInput = regionTextInput;
        this.deliveryTabs = deliveryTabs;
        this.deliveryText = deliveryText;
        this.footerText = textDTO;
        this.closeTokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WholeSaleModalVI)) {
            return false;
        }
        WholeSaleModalVI wholeSaleModalVI = (WholeSaleModalVI) other;
        return this.id == wholeSaleModalVI.id && Intrinsics.d(this.countTextInput, wholeSaleModalVI.countTextInput) && Intrinsics.d(this.regionTextInput, wholeSaleModalVI.regionTextInput) && Intrinsics.d(this.deliveryTabs, wholeSaleModalVI.deliveryTabs) && Intrinsics.d(this.deliveryText, wholeSaleModalVI.deliveryText) && Intrinsics.d(this.footerText, wholeSaleModalVI.footerText) && Intrinsics.d(this.closeTokenizedEvent, wholeSaleModalVI.closeTokenizedEvent);
    }

    public final t getCloseTokenizedEvent() {
        return this.closeTokenizedEvent;
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

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextInput getRegionTextInput() {
        return this.regionTextInput;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.deliveryText, (this.deliveryTabs.hashCode() + ((this.regionTextInput.hashCode() + ((this.countTextInput.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31)) * 31, 31);
        TextDTO textDTO = this.footerText;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        t tVar = this.closeTokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextInput textInput = this.countTextInput;
        TextInput textInput2 = this.regionTextInput;
        Tabs tabs = this.deliveryTabs;
        TextDTO textDTO = this.deliveryText;
        TextDTO textDTO2 = this.footerText;
        t tVar = this.closeTokenizedEvent;
        StringBuilder sb2 = new StringBuilder("WholeSaleModalVI(id=");
        sb2.append(j11);
        sb2.append(", countTextInput=");
        sb2.append(textInput);
        sb2.append(", regionTextInput=");
        sb2.append(textInput2);
        sb2.append(", deliveryTabs=");
        sb2.append(tabs);
        D3.g.i(", deliveryText=", ", footerText=", sb2, textDTO, textDTO2);
        return a.b(sb2, ", closeTokenizedEvent=", tVar, ")");
    }
}
