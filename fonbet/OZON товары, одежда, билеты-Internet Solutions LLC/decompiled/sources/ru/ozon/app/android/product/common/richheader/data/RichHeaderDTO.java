package ru.ozon.app.android.product.common.richheader.data;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0084\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00069"}, d2 = {"Lru/ozon/app/android/product/common/richheader/data/RichHeaderDTO;", "", "image", "", "heightRatio", "", "avatar", "Lru/ozon/uni/atoms/data/avatar/Avatar;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Lru/ozon/uni/atoms/data/avatar/Avatar;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/data/badge/Badge;)V", "getImage", "()Ljava/lang/String;", "getHeightRatio", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getAvatar", "()Lru/ozon/uni/atoms/data/avatar/Avatar;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Float;Lru/ozon/uni/atoms/data/avatar/Avatar;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/data/badge/Badge;)Lru/ozon/app/android/product/common/richheader/data/RichHeaderDTO;", "equals", "", "other", "hashCode", "", "toString", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RichHeaderDTO {
    private final AtomActionDTO action;
    private final Avatar avatar;
    private final Badge badge;
    private final Float heightRatio;

    @NotNull
    private final String image;
    private final TextAtom subtitle;
    private final TestInfo testInfo;
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public RichHeaderDTO(@NotNull String image, Float f7, Avatar avatar, TextAtom textAtom, TextAtom textAtom2, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, Badge badge) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.image = image;
        this.heightRatio = f7;
        this.avatar = avatar;
        this.title = textAtom;
        this.subtitle = textAtom2;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.badge = badge;
    }

    public static /* synthetic */ RichHeaderDTO copy$default(RichHeaderDTO richHeaderDTO, String str, Float f7, Avatar avatar, TextAtom textAtom, TextAtom textAtom2, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, Badge badge, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = richHeaderDTO.image;
        }
        if ((i11 & 2) != 0) {
            f7 = richHeaderDTO.heightRatio;
        }
        if ((i11 & 4) != 0) {
            avatar = richHeaderDTO.avatar;
        }
        if ((i11 & 8) != 0) {
            textAtom = richHeaderDTO.title;
        }
        if ((i11 & 16) != 0) {
            textAtom2 = richHeaderDTO.subtitle;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = richHeaderDTO.action;
        }
        if ((i11 & 64) != 0) {
            map = richHeaderDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            testInfo = richHeaderDTO.testInfo;
        }
        if ((i11 & 256) != 0) {
            badge = richHeaderDTO.badge;
        }
        TestInfo testInfo2 = testInfo;
        Badge badge2 = badge;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        TextAtom textAtom3 = textAtom2;
        Avatar avatar2 = avatar;
        return richHeaderDTO.copy(str, f7, avatar2, textAtom, textAtom3, atomActionDTO2, map2, testInfo2, badge2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final Float getHeightRatio() {
        return this.heightRatio;
    }

    /* renamed from: component3, reason: from getter */
    public final Avatar getAvatar() {
        return this.avatar;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    @NotNull
    public final RichHeaderDTO copy(@NotNull String image, Float heightRatio, Avatar avatar, TextAtom title, TextAtom subtitle, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, Badge badge) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new RichHeaderDTO(image, heightRatio, avatar, title, subtitle, action, trackingInfo, testInfo, badge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichHeaderDTO)) {
            return false;
        }
        RichHeaderDTO richHeaderDTO = (RichHeaderDTO) other;
        return Intrinsics.d(this.image, richHeaderDTO.image) && Intrinsics.d(this.heightRatio, richHeaderDTO.heightRatio) && Intrinsics.d(this.avatar, richHeaderDTO.avatar) && Intrinsics.d(this.title, richHeaderDTO.title) && Intrinsics.d(this.subtitle, richHeaderDTO.subtitle) && Intrinsics.d(this.action, richHeaderDTO.action) && Intrinsics.d(this.trackingInfo, richHeaderDTO.trackingInfo) && Intrinsics.d(this.testInfo, richHeaderDTO.testInfo) && Intrinsics.d(this.badge, richHeaderDTO.badge);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final Badge getBadge() {
        return this.badge;
    }

    public final Float getHeightRatio() {
        return this.heightRatio;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        Float f7 = this.heightRatio;
        int hashCode2 = (hashCode + (f7 == null ? 0 : f7.hashCode())) * 31;
        Avatar avatar = this.avatar;
        int hashCode3 = (hashCode2 + (avatar == null ? 0 : avatar.hashCode())) * 31;
        TextAtom textAtom = this.title;
        int hashCode4 = (hashCode3 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.subtitle;
        int hashCode5 = (hashCode4 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode8 = (hashCode7 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Badge badge = this.badge;
        return hashCode8 + (badge != null ? badge.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RichHeaderDTO(image=" + this.image + ", heightRatio=" + this.heightRatio + ", avatar=" + this.avatar + ", title=" + this.title + ", subtitle=" + this.subtitle + ", action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", testInfo=" + this.testInfo + ", badge=" + this.badge + ")";
    }
}
