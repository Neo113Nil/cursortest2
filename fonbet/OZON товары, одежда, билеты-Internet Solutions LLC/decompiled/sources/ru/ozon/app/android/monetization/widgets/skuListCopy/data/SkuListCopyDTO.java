package ru.ozon.app.android.monetization.widgets.skuListCopy.data;

import De.C2859b;
import Kk.c;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/monetization/widgets/skuListCopy/data/SkuListCopyDTO;", "", "skuItems", "", "Lru/ozon/app/android/monetization/widgets/skuListCopy/data/SkuListCopyDTO$SkuItem;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getSkuItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SkuItem", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SkuListCopyDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<SkuItem> skuItems;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/monetization/widgets/skuListCopy/data/SkuListCopyDTO$SkuItem;", "", "skuCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "skuButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "linkButton", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/TestInfo;)V", "getSkuCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSkuButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getLinkButton", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SkuItem {
        public static final int $stable = TestInfo.$stable | CellDTO.$stable;

        @NotNull
        private final ButtonV3DTO linkButton;

        @NotNull
        private final ButtonV3DTO skuButton;

        @NotNull
        private final CellDTO skuCell;
        private final TestInfo testInfo;

        public SkuItem(@NotNull CellDTO skuCell, @NotNull ButtonV3DTO skuButton, @NotNull ButtonV3DTO linkButton, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(skuCell, "skuCell");
            Intrinsics.checkNotNullParameter(skuButton, "skuButton");
            Intrinsics.checkNotNullParameter(linkButton, "linkButton");
            this.skuCell = skuCell;
            this.skuButton = skuButton;
            this.linkButton = linkButton;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ SkuItem copy$default(SkuItem skuItem, CellDTO cellDTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = skuItem.skuCell;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO = skuItem.skuButton;
            }
            if ((i11 & 4) != 0) {
                buttonV3DTO2 = skuItem.linkButton;
            }
            if ((i11 & 8) != 0) {
                testInfo = skuItem.testInfo;
            }
            return skuItem.copy(cellDTO, buttonV3DTO, buttonV3DTO2, testInfo);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getSkuCell() {
            return this.skuCell;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getSkuButton() {
            return this.skuButton;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ButtonV3DTO getLinkButton() {
            return this.linkButton;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final SkuItem copy(@NotNull CellDTO skuCell, @NotNull ButtonV3DTO skuButton, @NotNull ButtonV3DTO linkButton, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(skuCell, "skuCell");
            Intrinsics.checkNotNullParameter(skuButton, "skuButton");
            Intrinsics.checkNotNullParameter(linkButton, "linkButton");
            return new SkuItem(skuCell, skuButton, linkButton, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SkuItem)) {
                return false;
            }
            SkuItem skuItem = (SkuItem) other;
            return Intrinsics.d(this.skuCell, skuItem.skuCell) && Intrinsics.d(this.skuButton, skuItem.skuButton) && Intrinsics.d(this.linkButton, skuItem.linkButton) && Intrinsics.d(this.testInfo, skuItem.testInfo);
        }

        @NotNull
        public final ButtonV3DTO getLinkButton() {
            return this.linkButton;
        }

        @NotNull
        public final ButtonV3DTO getSkuButton() {
            return this.skuButton;
        }

        @NotNull
        public final CellDTO getSkuCell() {
            return this.skuCell;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public int hashCode() {
            int c11 = C2859b.c(this.linkButton, C2859b.c(this.skuButton, this.skuCell.hashCode() * 31, 31), 31);
            TestInfo testInfo = this.testInfo;
            return c11 + (testInfo == null ? 0 : testInfo.hashCode());
        }

        @NotNull
        public String toString() {
            return "SkuItem(skuCell=" + this.skuCell + ", skuButton=" + this.skuButton + ", linkButton=" + this.linkButton + ", testInfo=" + this.testInfo + ")";
        }
    }

    public SkuListCopyDTO(@NotNull List<SkuItem> skuItems, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(skuItems, "skuItems");
        this.skuItems = skuItems;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkuListCopyDTO copy$default(SkuListCopyDTO skuListCopyDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = skuListCopyDTO.skuItems;
        }
        if ((i11 & 2) != 0) {
            map = skuListCopyDTO.trackingInfo;
        }
        return skuListCopyDTO.copy(list, map);
    }

    @NotNull
    public final List<SkuItem> component1() {
        return this.skuItems;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final SkuListCopyDTO copy(@NotNull List<SkuItem> skuItems, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(skuItems, "skuItems");
        return new SkuListCopyDTO(skuItems, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkuListCopyDTO)) {
            return false;
        }
        SkuListCopyDTO skuListCopyDTO = (SkuListCopyDTO) other;
        return Intrinsics.d(this.skuItems, skuListCopyDTO.skuItems) && Intrinsics.d(this.trackingInfo, skuListCopyDTO.trackingInfo);
    }

    @NotNull
    public final List<SkuItem> getSkuItems() {
        return this.skuItems;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.skuItems.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("SkuListCopyDTO(skuItems=", ", trackingInfo=", ")", this.skuItems, this.trackingInfo);
    }
}
