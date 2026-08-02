package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsToggle;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsToggle/FreshPremiumPointsToggleDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsToggle/FreshPremiumPointsToggleDTO$Header;", "switcherTab", "Lru/ozon/uni/atoms/data/tabs/Tabs;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsToggle/FreshPremiumPointsToggleDTO$Header;Lru/ozon/uni/atoms/data/tabs/Tabs;Ljava/util/Map;)V", "getHeader", "()Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsToggle/FreshPremiumPointsToggleDTO$Header;", "getSwitcherTab", "()Lru/ozon/uni/atoms/data/tabs/Tabs;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Header", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshPremiumPointsToggleDTO {
    public static final int $stable = 8;

    @NotNull
    private final Header header;

    @NotNull
    private final Tabs switcherTab;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsToggle/FreshPremiumPointsToggleDTO$Header;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        public static final int $stable = IconButtonV3DTO.$stable;
        private final IconButtonV3DTO button;

        @NotNull
        private final TextDTO title;

        public Header(@NotNull TextDTO title, IconButtonV3DTO iconButtonV3DTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.button = iconButtonV3DTO;
        }

        public static /* synthetic */ Header copy$default(Header header, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = header.title;
            }
            if ((i11 & 2) != 0) {
                iconButtonV3DTO = header.button;
            }
            return header.copy(textDTO, iconButtonV3DTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final IconButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        public final Header copy(@NotNull TextDTO title, IconButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Header(title, button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.button, header.button);
        }

        public final IconButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            IconButtonV3DTO iconButtonV3DTO = this.button;
            return hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "Header(title=" + this.title + ", button=" + this.button + ")";
        }
    }

    public FreshPremiumPointsToggleDTO(@NotNull Header header, @NotNull Tabs switcherTab, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(switcherTab, "switcherTab");
        this.header = header;
        this.switcherTab = switcherTab;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FreshPremiumPointsToggleDTO copy$default(FreshPremiumPointsToggleDTO freshPremiumPointsToggleDTO, Header header, Tabs tabs, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            header = freshPremiumPointsToggleDTO.header;
        }
        if ((i11 & 2) != 0) {
            tabs = freshPremiumPointsToggleDTO.switcherTab;
        }
        if ((i11 & 4) != 0) {
            map = freshPremiumPointsToggleDTO.trackingInfo;
        }
        return freshPremiumPointsToggleDTO.copy(header, tabs, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Tabs getSwitcherTab() {
        return this.switcherTab;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final FreshPremiumPointsToggleDTO copy(@NotNull Header header, @NotNull Tabs switcherTab, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(switcherTab, "switcherTab");
        return new FreshPremiumPointsToggleDTO(header, switcherTab, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshPremiumPointsToggleDTO)) {
            return false;
        }
        FreshPremiumPointsToggleDTO freshPremiumPointsToggleDTO = (FreshPremiumPointsToggleDTO) other;
        return Intrinsics.d(this.header, freshPremiumPointsToggleDTO.header) && Intrinsics.d(this.switcherTab, freshPremiumPointsToggleDTO.switcherTab) && Intrinsics.d(this.trackingInfo, freshPremiumPointsToggleDTO.trackingInfo);
    }

    @NotNull
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    public final Tabs getSwitcherTab() {
        return this.switcherTab;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.switcherTab.hashCode() + (this.header.hashCode() * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        Header header = this.header;
        Tabs tabs = this.switcherTab;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("FreshPremiumPointsToggleDTO(header=");
        sb2.append(header);
        sb2.append(", switcherTab=");
        sb2.append(tabs);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
