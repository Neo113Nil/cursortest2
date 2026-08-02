package ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.data;

import G.g;
import Hj.C3143a;
import Ns.b;
import Tl.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003Ja\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/data/B2bFinanceCardDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "amount", "additionalAmount", "badgeList", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "buttonList", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAmount", "getAdditionalAmount", "getBadgeList", "()Ljava/util/List;", "getButtonList", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class B2bFinanceCardDTO {
    public static final int $stable = 8;
    private final TextDTO additionalAmount;

    @NotNull
    private final TextDTO amount;

    @NotNull
    private final List<BadgeDTO> badgeList;

    @NotNull
    private final List<ButtonV3DTO> buttonList;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public B2bFinanceCardDTO(@NotNull TextDTO title, @NotNull TextDTO amount, TextDTO textDTO, @NotNull List<BadgeDTO> badgeList, @NotNull List<ButtonV3DTO> buttonList, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(badgeList, "badgeList");
        Intrinsics.checkNotNullParameter(buttonList, "buttonList");
        this.title = title;
        this.amount = amount;
        this.additionalAmount = textDTO;
        this.badgeList = badgeList;
        this.buttonList = buttonList;
        this.trackingInfo = map;
    }

    public static /* synthetic */ B2bFinanceCardDTO copy$default(B2bFinanceCardDTO b2bFinanceCardDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, List list, List list2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = b2bFinanceCardDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = b2bFinanceCardDTO.amount;
        }
        if ((i11 & 4) != 0) {
            textDTO3 = b2bFinanceCardDTO.additionalAmount;
        }
        if ((i11 & 8) != 0) {
            list = b2bFinanceCardDTO.badgeList;
        }
        if ((i11 & 16) != 0) {
            list2 = b2bFinanceCardDTO.buttonList;
        }
        if ((i11 & 32) != 0) {
            map = b2bFinanceCardDTO.trackingInfo;
        }
        List list3 = list2;
        Map map2 = map;
        return b2bFinanceCardDTO.copy(textDTO, textDTO2, textDTO3, list, list3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getAdditionalAmount() {
        return this.additionalAmount;
    }

    @NotNull
    public final List<BadgeDTO> component4() {
        return this.badgeList;
    }

    @NotNull
    public final List<ButtonV3DTO> component5() {
        return this.buttonList;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final B2bFinanceCardDTO copy(@NotNull TextDTO title, @NotNull TextDTO amount, TextDTO additionalAmount, @NotNull List<BadgeDTO> badgeList, @NotNull List<ButtonV3DTO> buttonList, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(badgeList, "badgeList");
        Intrinsics.checkNotNullParameter(buttonList, "buttonList");
        return new B2bFinanceCardDTO(title, amount, additionalAmount, badgeList, buttonList, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2bFinanceCardDTO)) {
            return false;
        }
        B2bFinanceCardDTO b2bFinanceCardDTO = (B2bFinanceCardDTO) other;
        return Intrinsics.d(this.title, b2bFinanceCardDTO.title) && Intrinsics.d(this.amount, b2bFinanceCardDTO.amount) && Intrinsics.d(this.additionalAmount, b2bFinanceCardDTO.additionalAmount) && Intrinsics.d(this.badgeList, b2bFinanceCardDTO.badgeList) && Intrinsics.d(this.buttonList, b2bFinanceCardDTO.buttonList) && Intrinsics.d(this.trackingInfo, b2bFinanceCardDTO.trackingInfo);
    }

    public final TextDTO getAdditionalAmount() {
        return this.additionalAmount;
    }

    @NotNull
    public final TextDTO getAmount() {
        return this.amount;
    }

    @NotNull
    public final List<BadgeDTO> getBadgeList() {
        return this.badgeList;
    }

    @NotNull
    public final List<ButtonV3DTO> getButtonList() {
        return this.buttonList;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = b.a(this.amount, this.title.hashCode() * 31, 31);
        TextDTO textDTO = this.additionalAmount;
        int b11 = g.b(g.b((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.badgeList), 31, this.buttonList);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.amount;
        TextDTO textDTO3 = this.additionalAmount;
        List<BadgeDTO> list = this.badgeList;
        List<ButtonV3DTO> list2 = this.buttonList;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = D3.g.g("B2bFinanceCardDTO(title=", textDTO, ", amount=", textDTO2, ", additionalAmount=");
        a.e(g10, textDTO3, ", badgeList=", list, ", buttonList=");
        return C3143a.h(g10, list2, ", trackingInfo=", map, ")");
    }

    public B2bFinanceCardDTO(TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, List list, List list2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, textDTO3, (i11 & 8) != 0 ? K.f71697a : list, (i11 & 16) != 0 ? K.f71697a : list2, map);
    }
}
