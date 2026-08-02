package ru.ozon.app.android.fresh.unsorted.widgets.infoDropDown.data;

import B4.V;
import B90.C2619v;
import HY.a;
import Kk.C3532b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003Jo\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/infoDropDown/data/InfoDropDownItemDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subTitle", "roundedCorners", "", "widgetTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "closeTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubTitle", "getRoundedCorners", "()Z", "getWidgetTrackingInfo", "()Ljava/util/Map;", "getTrackingInfo", "getCloseTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InfoDropDownItemDTO {
    public static final int $stable = 8;
    private final Map<String, TokenizedTrackingInfo> closeTrackingInfo;
    private final boolean roundedCorners;

    @NotNull
    private final TextAtom subTitle;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final Map<String, TokenizedTrackingInfo> widgetTrackingInfo;

    public InfoDropDownItemDTO(@NotNull TextAtom title, @NotNull TextAtom subTitle, boolean z11, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        this.title = title;
        this.subTitle = subTitle;
        this.roundedCorners = z11;
        this.widgetTrackingInfo = map;
        this.trackingInfo = map2;
        this.closeTrackingInfo = map3;
    }

    public static /* synthetic */ InfoDropDownItemDTO copy$default(InfoDropDownItemDTO infoDropDownItemDTO, TextAtom textAtom, TextAtom textAtom2, boolean z11, Map map, Map map2, Map map3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = infoDropDownItemDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = infoDropDownItemDTO.subTitle;
        }
        if ((i11 & 4) != 0) {
            z11 = infoDropDownItemDTO.roundedCorners;
        }
        if ((i11 & 8) != 0) {
            map = infoDropDownItemDTO.widgetTrackingInfo;
        }
        if ((i11 & 16) != 0) {
            map2 = infoDropDownItemDTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            map3 = infoDropDownItemDTO.closeTrackingInfo;
        }
        Map map4 = map2;
        Map map5 = map3;
        return infoDropDownItemDTO.copy(textAtom, textAtom2, z11, map, map4, map5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRoundedCorners() {
        return this.roundedCorners;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.widgetTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.closeTrackingInfo;
    }

    @NotNull
    public final InfoDropDownItemDTO copy(@NotNull TextAtom title, @NotNull TextAtom subTitle, boolean roundedCorners, Map<String, TokenizedTrackingInfo> widgetTrackingInfo, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> closeTrackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        return new InfoDropDownItemDTO(title, subTitle, roundedCorners, widgetTrackingInfo, trackingInfo, closeTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoDropDownItemDTO)) {
            return false;
        }
        InfoDropDownItemDTO infoDropDownItemDTO = (InfoDropDownItemDTO) other;
        return Intrinsics.d(this.title, infoDropDownItemDTO.title) && Intrinsics.d(this.subTitle, infoDropDownItemDTO.subTitle) && this.roundedCorners == infoDropDownItemDTO.roundedCorners && Intrinsics.d(this.widgetTrackingInfo, infoDropDownItemDTO.widgetTrackingInfo) && Intrinsics.d(this.trackingInfo, infoDropDownItemDTO.trackingInfo) && Intrinsics.d(this.closeTrackingInfo, infoDropDownItemDTO.closeTrackingInfo);
    }

    public final Map<String, TokenizedTrackingInfo> getCloseTrackingInfo() {
        return this.closeTrackingInfo;
    }

    public final boolean getRoundedCorners() {
        return this.roundedCorners;
    }

    @NotNull
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getWidgetTrackingInfo() {
        return this.widgetTrackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(C2619v.b(this.title.hashCode() * 31, 31, this.subTitle), 31, this.roundedCorners);
        Map<String, TokenizedTrackingInfo> map = this.widgetTrackingInfo;
        int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.closeTrackingInfo;
        return hashCode2 + (map3 != null ? map3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subTitle;
        boolean z11 = this.roundedCorners;
        Map<String, TokenizedTrackingInfo> map = this.widgetTrackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        Map<String, TokenizedTrackingInfo> map3 = this.closeTrackingInfo;
        StringBuilder a11 = a.a("InfoDropDownItemDTO(title=", textAtom, ", subTitle=", textAtom2, ", roundedCorners=");
        a11.append(z11);
        a11.append(", widgetTrackingInfo=");
        a11.append(map);
        a11.append(", trackingInfo=");
        return V.c(a11, map2, ", closeTrackingInfo=", map3, ")");
    }

    public /* synthetic */ InfoDropDownItemDTO(TextAtom textAtom, TextAtom textAtom2, boolean z11, Map map, Map map2, Map map3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, textAtom2, (i11 & 4) != 0 ? false : z11, map, map2, map3);
    }
}
