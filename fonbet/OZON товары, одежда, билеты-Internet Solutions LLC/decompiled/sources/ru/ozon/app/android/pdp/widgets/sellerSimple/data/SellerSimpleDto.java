package ru.ozon.app.android.pdp.widgets.sellerSimple.data;

import HY.a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J]\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerSimple/data/SellerSimpleDto;", "", "personType", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "sellerName", "dateText", "avatar", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/avatar/Avatar;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getPersonType", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSellerName", "getDateText", "getAvatar", "()Lru/ozon/uni/atoms/data/avatar/Avatar;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SellerSimpleDto {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final Avatar avatar;
    private final TextAtom dateText;
    private final TextAtom personType;
    private final TextAtom sellerName;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SellerSimpleDto(TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, Avatar avatar, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        this.personType = textAtom;
        this.sellerName = textAtom2;
        this.dateText = textAtom3;
        this.avatar = avatar;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SellerSimpleDto copy$default(SellerSimpleDto sellerSimpleDto, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, Avatar avatar, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = sellerSimpleDto.personType;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = sellerSimpleDto.sellerName;
        }
        if ((i11 & 4) != 0) {
            textAtom3 = sellerSimpleDto.dateText;
        }
        if ((i11 & 8) != 0) {
            avatar = sellerSimpleDto.avatar;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = sellerSimpleDto.action;
        }
        if ((i11 & 32) != 0) {
            map = sellerSimpleDto.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        return sellerSimpleDto.copy(textAtom, textAtom2, textAtom3, avatar, atomActionDTO2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getPersonType() {
        return this.personType;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getSellerName() {
        return this.sellerName;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getDateText() {
        return this.dateText;
    }

    /* renamed from: component4, reason: from getter */
    public final Avatar getAvatar() {
        return this.avatar;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final SellerSimpleDto copy(TextAtom personType, TextAtom sellerName, TextAtom dateText, Avatar avatar, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new SellerSimpleDto(personType, sellerName, dateText, avatar, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerSimpleDto)) {
            return false;
        }
        SellerSimpleDto sellerSimpleDto = (SellerSimpleDto) other;
        return Intrinsics.d(this.personType, sellerSimpleDto.personType) && Intrinsics.d(this.sellerName, sellerSimpleDto.sellerName) && Intrinsics.d(this.dateText, sellerSimpleDto.dateText) && Intrinsics.d(this.avatar, sellerSimpleDto.avatar) && Intrinsics.d(this.action, sellerSimpleDto.action) && Intrinsics.d(this.trackingInfo, sellerSimpleDto.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final TextAtom getDateText() {
        return this.dateText;
    }

    public final TextAtom getPersonType() {
        return this.personType;
    }

    public final TextAtom getSellerName() {
        return this.sellerName;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextAtom textAtom = this.personType;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        TextAtom textAtom2 = this.sellerName;
        int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        TextAtom textAtom3 = this.dateText;
        int hashCode3 = (hashCode2 + (textAtom3 == null ? 0 : textAtom3.hashCode())) * 31;
        Avatar avatar = this.avatar;
        int hashCode4 = (hashCode3 + (avatar == null ? 0 : avatar.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.personType;
        TextAtom textAtom2 = this.sellerName;
        TextAtom textAtom3 = this.dateText;
        Avatar avatar = this.avatar;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = a.a("SellerSimpleDto(personType=", textAtom, ", sellerName=", textAtom2, ", dateText=");
        a11.append(textAtom3);
        a11.append(", avatar=");
        a11.append(avatar);
        a11.append(", action=");
        return D40.a.d(a11, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
