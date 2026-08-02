package ru.ozon.app.android.account.orders.clicktodeliverymodal.data;

import B90.C2616s;
import G.g;
import Pk0.h;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cscore.padding.VerticalPadding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jo\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lru/ozon/app/android/account/orders/clicktodeliverymodal/data/ClickToDeliveryModalDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "deliveries", "", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/data/DeliveryDTO;", "buttons", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "verticalPadding", "Lru/ozon/app/android/cscore/padding/VerticalPadding;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/cscore/padding/VerticalPadding;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getDeliveries", "()Ljava/util/List;", "getButtons", "getVerticalPadding", "()Lru/ozon/app/android/cscore/padding/VerticalPadding;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ClickToDeliveryModalDTO {
    public static final int $stable = 8;
    private final List<ButtonV3DTO> buttons;

    @NotNull
    private final List<DeliveryDTO> deliveries;
    private final TextDTO subtitle;
    private final TestInfo testInfo;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final VerticalPadding verticalPadding;

    public ClickToDeliveryModalDTO(@NotNull TextDTO title, TextDTO textDTO, @NotNull List<DeliveryDTO> deliveries, List<ButtonV3DTO> list, @NotNull VerticalPadding verticalPadding, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deliveries, "deliveries");
        Intrinsics.checkNotNullParameter(verticalPadding, "verticalPadding");
        this.title = title;
        this.subtitle = textDTO;
        this.deliveries = deliveries;
        this.buttons = list;
        this.verticalPadding = verticalPadding;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ ClickToDeliveryModalDTO copy$default(ClickToDeliveryModalDTO clickToDeliveryModalDTO, TextDTO textDTO, TextDTO textDTO2, List list, List list2, VerticalPadding verticalPadding, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = clickToDeliveryModalDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = clickToDeliveryModalDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = clickToDeliveryModalDTO.deliveries;
        }
        if ((i11 & 8) != 0) {
            list2 = clickToDeliveryModalDTO.buttons;
        }
        if ((i11 & 16) != 0) {
            verticalPadding = clickToDeliveryModalDTO.verticalPadding;
        }
        if ((i11 & 32) != 0) {
            map = clickToDeliveryModalDTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            testInfo = clickToDeliveryModalDTO.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        VerticalPadding verticalPadding2 = verticalPadding;
        List list3 = list;
        return clickToDeliveryModalDTO.copy(textDTO, textDTO2, list3, list2, verticalPadding2, map2, testInfo2);
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

    @NotNull
    public final List<DeliveryDTO> component3() {
        return this.deliveries;
    }

    public final List<ButtonV3DTO> component4() {
        return this.buttons;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final ClickToDeliveryModalDTO copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull List<DeliveryDTO> deliveries, List<ButtonV3DTO> buttons, @NotNull VerticalPadding verticalPadding, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deliveries, "deliveries");
        Intrinsics.checkNotNullParameter(verticalPadding, "verticalPadding");
        return new ClickToDeliveryModalDTO(title, subtitle, deliveries, buttons, verticalPadding, trackingInfo, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickToDeliveryModalDTO)) {
            return false;
        }
        ClickToDeliveryModalDTO clickToDeliveryModalDTO = (ClickToDeliveryModalDTO) other;
        return Intrinsics.d(this.title, clickToDeliveryModalDTO.title) && Intrinsics.d(this.subtitle, clickToDeliveryModalDTO.subtitle) && Intrinsics.d(this.deliveries, clickToDeliveryModalDTO.deliveries) && Intrinsics.d(this.buttons, clickToDeliveryModalDTO.buttons) && Intrinsics.d(this.verticalPadding, clickToDeliveryModalDTO.verticalPadding) && Intrinsics.d(this.trackingInfo, clickToDeliveryModalDTO.trackingInfo) && Intrinsics.d(this.testInfo, clickToDeliveryModalDTO.testInfo);
    }

    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final List<DeliveryDTO> getDeliveries() {
        return this.deliveries;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int b11 = g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.deliveries);
        List<ButtonV3DTO> list = this.buttons;
        int hashCode2 = (this.verticalPadding.hashCode() + ((b11 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode3 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<DeliveryDTO> list = this.deliveries;
        List<ButtonV3DTO> list2 = this.buttons;
        VerticalPadding verticalPadding = this.verticalPadding;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder g10 = D3.g.g("ClickToDeliveryModalDTO(title=", textDTO, ", subtitle=", textDTO2, ", deliveries=");
        C2616s.g(", buttons=", ", verticalPadding=", g10, list, list2);
        g10.append(verticalPadding);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(", testInfo=");
        return h.c(g10, testInfo, ")");
    }
}
