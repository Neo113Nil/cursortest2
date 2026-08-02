package ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data;

import Ds.C2880a;
import G.g;
import Kk.C3532b;
import Ul.C4070a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data.AspectsV4DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4SizeSubWidgetObject;", "", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4SizeSubWidgetObject$Size;", "sizeVariants", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$LayoutType;", "layoutType", "", "selectedColor", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "widgetTrackingInfo", "<init>", "(Ljava/util/List;Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$LayoutType;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSizeVariants", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$LayoutType;", "getLayoutType", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$LayoutType;", "Ljava/lang/String;", "getSelectedColor", "Ljava/util/Map;", "getWidgetTrackingInfo", "()Ljava/util/Map;", "Size", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AspectsV4SizeSubWidgetObject {

    @NotNull
    private final AspectsV4DTO.LayoutType layoutType;

    @NotNull
    private final String selectedColor;

    @NotNull
    private final List<Size> sizeVariants;
    private final Map<String, TokenizedTrackingInfo> widgetTrackingInfo;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\t\u0010\u001eR%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4SizeSubWidgetObject$Size;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "subtext", "", "refreshDeeplink", "", "isSelected", "isOutOfStock", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;ZZLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtext", "Ljava/lang/String;", "getRefreshDeeplink", "Z", "()Z", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Size {
        private final boolean isOutOfStock;
        private final boolean isSelected;

        @NotNull
        private final String refreshDeeplink;
        private final TextDTO subtext;

        @NotNull
        private final TextDTO text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Size(@NotNull TextDTO text, TextDTO textDTO, @NotNull String refreshDeeplink, boolean z11, boolean z12, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(refreshDeeplink, "refreshDeeplink");
            this.text = text;
            this.subtext = textDTO;
            this.refreshDeeplink = refreshDeeplink;
            this.isSelected = z11;
            this.isOutOfStock = z12;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Size)) {
                return false;
            }
            Size size = (Size) other;
            return Intrinsics.d(this.text, size.text) && Intrinsics.d(this.subtext, size.subtext) && Intrinsics.d(this.refreshDeeplink, size.refreshDeeplink) && this.isSelected == size.isSelected && this.isOutOfStock == size.isOutOfStock && Intrinsics.d(this.trackingInfo, size.trackingInfo);
        }

        @NotNull
        public final String getRefreshDeeplink() {
            return this.refreshDeeplink;
        }

        public final TextDTO getSubtext() {
            return this.subtext;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            TextDTO textDTO = this.subtext;
            int a11 = C3532b.a(C3532b.a(g.a((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.refreshDeeplink), 31, this.isSelected), 31, this.isOutOfStock);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map != null ? map.hashCode() : 0);
        }

        /* renamed from: isOutOfStock, reason: from getter */
        public final boolean getIsOutOfStock() {
            return this.isOutOfStock;
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            TextDTO textDTO2 = this.subtext;
            String str = this.refreshDeeplink;
            boolean z11 = this.isSelected;
            boolean z12 = this.isOutOfStock;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder g10 = D3.g.g("Size(text=", textDTO, ", subtext=", textDTO2, ", refreshDeeplink=");
            C2880a.c(str, ", isSelected=", ", isOutOfStock=", g10, z11);
            g10.append(z12);
            g10.append(", trackingInfo=");
            g10.append(map);
            g10.append(")");
            return g10.toString();
        }
    }

    public AspectsV4SizeSubWidgetObject(@NotNull List<Size> sizeVariants, @NotNull AspectsV4DTO.LayoutType layoutType, @NotNull String selectedColor, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(sizeVariants, "sizeVariants");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        Intrinsics.checkNotNullParameter(selectedColor, "selectedColor");
        this.sizeVariants = sizeVariants;
        this.layoutType = layoutType;
        this.selectedColor = selectedColor;
        this.widgetTrackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectsV4SizeSubWidgetObject)) {
            return false;
        }
        AspectsV4SizeSubWidgetObject aspectsV4SizeSubWidgetObject = (AspectsV4SizeSubWidgetObject) other;
        return Intrinsics.d(this.sizeVariants, aspectsV4SizeSubWidgetObject.sizeVariants) && this.layoutType == aspectsV4SizeSubWidgetObject.layoutType && Intrinsics.d(this.selectedColor, aspectsV4SizeSubWidgetObject.selectedColor) && Intrinsics.d(this.widgetTrackingInfo, aspectsV4SizeSubWidgetObject.widgetTrackingInfo);
    }

    @NotNull
    public final AspectsV4DTO.LayoutType getLayoutType() {
        return this.layoutType;
    }

    @NotNull
    public final String getSelectedColor() {
        return this.selectedColor;
    }

    @NotNull
    public final List<Size> getSizeVariants() {
        return this.sizeVariants;
    }

    public final Map<String, TokenizedTrackingInfo> getWidgetTrackingInfo() {
        return this.widgetTrackingInfo;
    }

    public int hashCode() {
        int a11 = g.a((this.layoutType.hashCode() + (this.sizeVariants.hashCode() * 31)) * 31, 31, this.selectedColor);
        Map<String, TokenizedTrackingInfo> map = this.widgetTrackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        List<Size> list = this.sizeVariants;
        AspectsV4DTO.LayoutType layoutType = this.layoutType;
        String str = this.selectedColor;
        Map<String, TokenizedTrackingInfo> map = this.widgetTrackingInfo;
        StringBuilder sb2 = new StringBuilder("AspectsV4SizeSubWidgetObject(sizeVariants=");
        sb2.append(list);
        sb2.append(", layoutType=");
        sb2.append(layoutType);
        sb2.append(", selectedColor=");
        return C4070a.a(sb2, str, ", widgetTrackingInfo=", map, ")");
    }
}
