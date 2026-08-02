package ru.ozon.app.android.bank.widgets.starPoints.data;

import B4.V;
import G.g;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0003\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jv\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0003\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lru/ozon/app/android/bank/widgets/starPoints/data/StarPointsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "marginLeft", "", "marginRight", "icon", "", "iconTintColor", "backgroundColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getMarginLeft", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMarginRight", "getIcon", "()Ljava/lang/String;", "getIconTintColor", "getBackgroundColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/bank/widgets/starPoints/data/StarPointsDTO;", "equals", "", "other", "hashCode", "toString", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StarPointsDTO {
    private final AtomActionDTO action;
    private final String backgroundColor;

    @NotNull
    private final String icon;
    private final String iconTintColor;
    private final Integer marginLeft;
    private final Integer marginRight;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public StarPointsDTO(@i(name = "titleTextAtom") @NotNull TextAtom title, @i(name = "marginLeft") Integer num, @i(name = "marginRight") Integer num2, @i(name = "icon") @NotNull String icon, @i(name = "iconTintColor") String str, @i(name = "backgroundColor") String str2, @i(name = "action") AtomActionDTO atomActionDTO, @i(name = "trackingInfo") Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.title = title;
        this.marginLeft = num;
        this.marginRight = num2;
        this.icon = icon;
        this.iconTintColor = str;
        this.backgroundColor = str2;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ StarPointsDTO copy$default(StarPointsDTO starPointsDTO, TextAtom textAtom, Integer num, Integer num2, String str, String str2, String str3, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = starPointsDTO.title;
        }
        if ((i11 & 2) != 0) {
            num = starPointsDTO.marginLeft;
        }
        if ((i11 & 4) != 0) {
            num2 = starPointsDTO.marginRight;
        }
        if ((i11 & 8) != 0) {
            str = starPointsDTO.icon;
        }
        if ((i11 & 16) != 0) {
            str2 = starPointsDTO.iconTintColor;
        }
        if ((i11 & 32) != 0) {
            str3 = starPointsDTO.backgroundColor;
        }
        if ((i11 & 64) != 0) {
            atomActionDTO = starPointsDTO.action;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = starPointsDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        String str4 = str2;
        String str5 = str3;
        return starPointsDTO.copy(textAtom, num, num2, str, str4, str5, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMarginLeft() {
        return this.marginLeft;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getMarginRight() {
        return this.marginRight;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final StarPointsDTO copy(@i(name = "titleTextAtom") @NotNull TextAtom title, @i(name = "marginLeft") Integer marginLeft, @i(name = "marginRight") Integer marginRight, @i(name = "icon") @NotNull String icon, @i(name = "iconTintColor") String iconTintColor, @i(name = "backgroundColor") String backgroundColor, @i(name = "action") AtomActionDTO action, @i(name = "trackingInfo") Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new StarPointsDTO(title, marginLeft, marginRight, icon, iconTintColor, backgroundColor, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StarPointsDTO)) {
            return false;
        }
        StarPointsDTO starPointsDTO = (StarPointsDTO) other;
        return Intrinsics.d(this.title, starPointsDTO.title) && Intrinsics.d(this.marginLeft, starPointsDTO.marginLeft) && Intrinsics.d(this.marginRight, starPointsDTO.marginRight) && Intrinsics.d(this.icon, starPointsDTO.icon) && Intrinsics.d(this.iconTintColor, starPointsDTO.iconTintColor) && Intrinsics.d(this.backgroundColor, starPointsDTO.backgroundColor) && Intrinsics.d(this.action, starPointsDTO.action) && Intrinsics.d(this.trackingInfo, starPointsDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    public final Integer getMarginLeft() {
        return this.marginLeft;
    }

    public final Integer getMarginRight() {
        return this.marginRight;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        Integer num = this.marginLeft;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.marginRight;
        int a11 = g.a((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.icon);
        String str = this.iconTintColor;
        int hashCode3 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        Integer num = this.marginLeft;
        Integer num2 = this.marginRight;
        String str = this.icon;
        String str2 = this.iconTintColor;
        String str3 = this.backgroundColor;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("StarPointsDTO(title=");
        sb2.append(textAtom);
        sb2.append(", marginLeft=");
        sb2.append(num);
        sb2.append(", marginRight=");
        V.f(num2, ", icon=", str, ", iconTintColor=", sb2);
        a.h(sb2, str2, ", backgroundColor=", str3, ", action=");
        return D40.a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
    }

    public /* synthetic */ StarPointsDTO(TextAtom textAtom, Integer num, Integer num2, String str, String str2, String str3, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, num, num2, str, str2, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : atomActionDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : map);
    }
}
