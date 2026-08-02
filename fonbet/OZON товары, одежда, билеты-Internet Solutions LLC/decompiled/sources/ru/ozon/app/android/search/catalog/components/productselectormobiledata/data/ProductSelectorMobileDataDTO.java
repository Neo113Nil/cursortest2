package ru.ozon.app.android.search.catalog.components.productselectormobiledata.data;

import B90.C2618u;
import G.g;
import N3.C3660k;
import Tl.b;
import Tz.C4055a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.SelectorInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 92\u00020\u0001:\u00029:Bw\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00100\u001a\u00020\u0011HÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u008d\u0001\u00102\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006;"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO;", "", "activeFilters", "", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO$ActiveFilters;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "clearButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "closeButton", "type", ProductSelectorMobileDataDTO.ALL_STEP_TYPE, "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorData;", ProductSelectorMobileDataDTO.STEP_TYPE, "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData;", "actionButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/lang/String;Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorData;Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;)V", "getActiveFilters", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getClearButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getCloseButton", "getType", "getSelectorData", "()Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorData;", "getSelectorStepData", "()Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData;", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "ActiveFilters", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductSelectorMobileDataDTO {

    @NotNull
    public static final String ALL_STEP_TYPE = "selectorData";

    @NotNull
    public static final String STEP_TYPE = "selectorStepData";

    @NotNull
    private final ButtonV3Atom.LargeButton actionButton;
    private final List<ActiveFilters> activeFilters;
    private final ButtonV3Atom.LargeBorderlessButton clearButton;

    @NotNull
    private final ButtonV3Atom.LargeBorderlessButton closeButton;
    private final SelectorInfo.SelectorData selectorData;
    private final SelectorInfo.SelectorStepData selectorStepData;
    private final String subtitle;
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final String type;
    public static final int $stable = 8;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO$ActiveFilters;", "", "key", "", "type", "values", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getKey", "()Ljava/lang/String;", "getType", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActiveFilters {
        public static final int $stable = 8;

        @NotNull
        private final String key;

        @NotNull
        private final String type;
        private final List<String> values;

        public ActiveFilters(@NotNull String key, @NotNull String type, List<String> list) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(type, "type");
            this.key = key;
            this.type = type;
            this.values = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActiveFilters copy$default(ActiveFilters activeFilters, String str, String str2, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = activeFilters.key;
            }
            if ((i11 & 2) != 0) {
                str2 = activeFilters.type;
            }
            if ((i11 & 4) != 0) {
                list = activeFilters.values;
            }
            return activeFilters.copy(str, str2, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final List<String> component3() {
            return this.values;
        }

        @NotNull
        public final ActiveFilters copy(@NotNull String key, @NotNull String type, List<String> values) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(type, "type");
            return new ActiveFilters(key, type, values);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActiveFilters)) {
                return false;
            }
            ActiveFilters activeFilters = (ActiveFilters) other;
            return Intrinsics.d(this.key, activeFilters.key) && Intrinsics.d(this.type, activeFilters.type) && Intrinsics.d(this.values, activeFilters.values);
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public final List<String> getValues() {
            return this.values;
        }

        public int hashCode() {
            int a11 = g.a(this.key.hashCode() * 31, 31, this.type);
            List<String> list = this.values;
            return a11 + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.key;
            String str2 = this.type;
            return C2618u.h(C3660k.d("ActiveFilters(key=", str, ", type=", str2, ", values="), this.values, ")");
        }
    }

    public ProductSelectorMobileDataDTO(List<ActiveFilters> list, String str, String str2, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, @NotNull ButtonV3Atom.LargeBorderlessButton closeButton, @NotNull String type, SelectorInfo.SelectorData selectorData, SelectorInfo.SelectorStepData selectorStepData, @NotNull ButtonV3Atom.LargeButton actionButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        this.activeFilters = list;
        this.title = str;
        this.subtitle = str2;
        this.clearButton = largeBorderlessButton;
        this.closeButton = closeButton;
        this.type = type;
        this.selectorData = selectorData;
        this.selectorStepData = selectorStepData;
        this.actionButton = actionButton;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ProductSelectorMobileDataDTO copy$default(ProductSelectorMobileDataDTO productSelectorMobileDataDTO, List list, String str, String str2, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton2, String str3, SelectorInfo.SelectorData selectorData, SelectorInfo.SelectorStepData selectorStepData, ButtonV3Atom.LargeButton largeButton, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = productSelectorMobileDataDTO.activeFilters;
        }
        if ((i11 & 2) != 0) {
            str = productSelectorMobileDataDTO.title;
        }
        if ((i11 & 4) != 0) {
            str2 = productSelectorMobileDataDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            largeBorderlessButton = productSelectorMobileDataDTO.clearButton;
        }
        if ((i11 & 16) != 0) {
            largeBorderlessButton2 = productSelectorMobileDataDTO.closeButton;
        }
        if ((i11 & 32) != 0) {
            str3 = productSelectorMobileDataDTO.type;
        }
        if ((i11 & 64) != 0) {
            selectorData = productSelectorMobileDataDTO.selectorData;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            selectorStepData = productSelectorMobileDataDTO.selectorStepData;
        }
        if ((i11 & 256) != 0) {
            largeButton = productSelectorMobileDataDTO.actionButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = productSelectorMobileDataDTO.trackingInfo;
        }
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        Map map2 = map;
        SelectorInfo.SelectorData selectorData2 = selectorData;
        SelectorInfo.SelectorStepData selectorStepData2 = selectorStepData;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton3 = largeBorderlessButton2;
        String str4 = str3;
        return productSelectorMobileDataDTO.copy(list, str, str2, largeBorderlessButton, largeBorderlessButton3, str4, selectorData2, selectorStepData2, largeButton2, map2);
    }

    public final List<ActiveFilters> component1() {
        return this.activeFilters;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeBorderlessButton getClearButton() {
        return this.clearButton;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.LargeBorderlessButton getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component7, reason: from getter */
    public final SelectorInfo.SelectorData getSelectorData() {
        return this.selectorData;
    }

    /* renamed from: component8, reason: from getter */
    public final SelectorInfo.SelectorStepData getSelectorStepData() {
        return this.selectorStepData;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final ButtonV3Atom.LargeButton getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final ProductSelectorMobileDataDTO copy(List<ActiveFilters> activeFilters, String title, String subtitle, ButtonV3Atom.LargeBorderlessButton clearButton, @NotNull ButtonV3Atom.LargeBorderlessButton closeButton, @NotNull String type, SelectorInfo.SelectorData selectorData, SelectorInfo.SelectorStepData selectorStepData, @NotNull ButtonV3Atom.LargeButton actionButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        return new ProductSelectorMobileDataDTO(activeFilters, title, subtitle, clearButton, closeButton, type, selectorData, selectorStepData, actionButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductSelectorMobileDataDTO)) {
            return false;
        }
        ProductSelectorMobileDataDTO productSelectorMobileDataDTO = (ProductSelectorMobileDataDTO) other;
        return Intrinsics.d(this.activeFilters, productSelectorMobileDataDTO.activeFilters) && Intrinsics.d(this.title, productSelectorMobileDataDTO.title) && Intrinsics.d(this.subtitle, productSelectorMobileDataDTO.subtitle) && Intrinsics.d(this.clearButton, productSelectorMobileDataDTO.clearButton) && Intrinsics.d(this.closeButton, productSelectorMobileDataDTO.closeButton) && Intrinsics.d(this.type, productSelectorMobileDataDTO.type) && Intrinsics.d(this.selectorData, productSelectorMobileDataDTO.selectorData) && Intrinsics.d(this.selectorStepData, productSelectorMobileDataDTO.selectorStepData) && Intrinsics.d(this.actionButton, productSelectorMobileDataDTO.actionButton) && Intrinsics.d(this.trackingInfo, productSelectorMobileDataDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getActionButton() {
        return this.actionButton;
    }

    public final List<ActiveFilters> getActiveFilters() {
        return this.activeFilters;
    }

    public final ButtonV3Atom.LargeBorderlessButton getClearButton() {
        return this.clearButton;
    }

    @NotNull
    public final ButtonV3Atom.LargeBorderlessButton getCloseButton() {
        return this.closeButton;
    }

    public final SelectorInfo.SelectorData getSelectorData() {
        return this.selectorData;
    }

    public final SelectorInfo.SelectorStepData getSelectorStepData() {
        return this.selectorStepData;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        List<ActiveFilters> list = this.activeFilters;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.clearButton;
        int a11 = g.a((this.closeButton.hashCode() + ((hashCode3 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31)) * 31, 31, this.type);
        SelectorInfo.SelectorData selectorData = this.selectorData;
        int hashCode4 = (a11 + (selectorData == null ? 0 : selectorData.hashCode())) * 31;
        SelectorInfo.SelectorStepData selectorStepData = this.selectorStepData;
        int a12 = b.a(this.actionButton, (hashCode4 + (selectorStepData == null ? 0 : selectorStepData.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a12 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ActiveFilters> list = this.activeFilters;
        String str = this.title;
        String str2 = this.subtitle;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.clearButton;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton2 = this.closeButton;
        String str3 = this.type;
        SelectorInfo.SelectorData selectorData = this.selectorData;
        SelectorInfo.SelectorStepData selectorStepData = this.selectorStepData;
        ButtonV3Atom.LargeButton largeButton = this.actionButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = C4055a.a("ProductSelectorMobileDataDTO(activeFilters=", ", title=", str, ", subtitle=", list);
        a11.append(str2);
        a11.append(", clearButton=");
        a11.append(largeBorderlessButton);
        a11.append(", closeButton=");
        a11.append(largeBorderlessButton2);
        a11.append(", type=");
        a11.append(str3);
        a11.append(", selectorData=");
        a11.append(selectorData);
        a11.append(", selectorStepData=");
        a11.append(selectorStepData);
        a11.append(", actionButton=");
        a11.append(largeButton);
        a11.append(", trackingInfo=");
        a11.append(map);
        a11.append(")");
        return a11.toString();
    }
}
