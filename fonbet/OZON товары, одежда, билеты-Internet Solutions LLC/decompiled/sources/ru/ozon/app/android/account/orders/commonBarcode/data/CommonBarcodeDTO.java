package ru.ozon.app.android.account.orders.commonBarcode.data;

import Bk.C2638a;
import G.g;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jt\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\r\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u0006."}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcode/data/CommonBarcodeDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "code", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "description", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "isFullWidth", "", "subtitleTextStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Boolean;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getCode", "getTrackingInfo", "()Ljava/util/Map;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSubtitleTextStyle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/app/android/account/orders/commonBarcode/data/CommonBarcodeDTO;", "equals", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CommonBarcodeDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final String code;
    private final TextAtom description;
    private final Boolean isFullWidth;

    @NotNull
    private final String subtitle;
    private final String subtitleTextStyle;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CommonBarcodeDTO(@NotNull String title, @NotNull String subtitle, @NotNull String code, Map<String, TokenizedTrackingInfo> map, AtomActionDTO atomActionDTO, TextAtom textAtom, Boolean bool, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(code, "code");
        this.title = title;
        this.subtitle = subtitle;
        this.code = code;
        this.trackingInfo = map;
        this.action = atomActionDTO;
        this.description = textAtom;
        this.isFullWidth = bool;
        this.subtitleTextStyle = str;
    }

    public static /* synthetic */ CommonBarcodeDTO copy$default(CommonBarcodeDTO commonBarcodeDTO, String str, String str2, String str3, Map map, AtomActionDTO atomActionDTO, TextAtom textAtom, Boolean bool, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = commonBarcodeDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = commonBarcodeDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            str3 = commonBarcodeDTO.code;
        }
        if ((i11 & 8) != 0) {
            map = commonBarcodeDTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = commonBarcodeDTO.action;
        }
        if ((i11 & 32) != 0) {
            textAtom = commonBarcodeDTO.description;
        }
        if ((i11 & 64) != 0) {
            bool = commonBarcodeDTO.isFullWidth;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str4 = commonBarcodeDTO.subtitleTextStyle;
        }
        Boolean bool2 = bool;
        String str5 = str4;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        TextAtom textAtom2 = textAtom;
        return commonBarcodeDTO.copy(str, str2, str3, map, atomActionDTO2, textAtom2, bool2, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final TextAtom getDescription() {
        return this.description;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsFullWidth() {
        return this.isFullWidth;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSubtitleTextStyle() {
        return this.subtitleTextStyle;
    }

    @NotNull
    public final CommonBarcodeDTO copy(@NotNull String title, @NotNull String subtitle, @NotNull String code, Map<String, TokenizedTrackingInfo> trackingInfo, AtomActionDTO action, TextAtom description, Boolean isFullWidth, String subtitleTextStyle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(code, "code");
        return new CommonBarcodeDTO(title, subtitle, code, trackingInfo, action, description, isFullWidth, subtitleTextStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonBarcodeDTO)) {
            return false;
        }
        CommonBarcodeDTO commonBarcodeDTO = (CommonBarcodeDTO) other;
        return Intrinsics.d(this.title, commonBarcodeDTO.title) && Intrinsics.d(this.subtitle, commonBarcodeDTO.subtitle) && Intrinsics.d(this.code, commonBarcodeDTO.code) && Intrinsics.d(this.trackingInfo, commonBarcodeDTO.trackingInfo) && Intrinsics.d(this.action, commonBarcodeDTO.action) && Intrinsics.d(this.description, commonBarcodeDTO.description) && Intrinsics.d(this.isFullWidth, commonBarcodeDTO.isFullWidth) && Intrinsics.d(this.subtitleTextStyle, commonBarcodeDTO.subtitleTextStyle);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleTextStyle() {
        return this.subtitleTextStyle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.title.hashCode() * 31, 31, this.subtitle), 31, this.code);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        TextAtom textAtom = this.description;
        int hashCode3 = (hashCode2 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Boolean bool = this.isFullWidth;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.subtitleTextStyle;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final Boolean isFullWidth() {
        return this.isFullWidth;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.code;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        AtomActionDTO atomActionDTO = this.action;
        TextAtom textAtom = this.description;
        Boolean bool = this.isFullWidth;
        String str4 = this.subtitleTextStyle;
        StringBuilder d11 = C3660k.d("CommonBarcodeDTO(title=", str, ", subtitle=", str2, ", code=");
        C2638a.e(d11, str3, ", trackingInfo=", map, ", action=");
        d11.append(atomActionDTO);
        d11.append(", description=");
        d11.append(textAtom);
        d11.append(", isFullWidth=");
        d11.append(bool);
        d11.append(", subtitleTextStyle=");
        d11.append(str4);
        d11.append(")");
        return d11.toString();
    }
}
