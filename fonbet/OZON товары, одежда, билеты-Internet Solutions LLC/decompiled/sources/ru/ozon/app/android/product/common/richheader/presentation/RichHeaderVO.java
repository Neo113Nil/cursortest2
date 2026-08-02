package ru.ozon.app.android.product.common.richheader.presentation;

import Ak.C2436a;
import Bl.C2639a;
import G.g;
import Pk0.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b<\u0010=R\"\u0010>\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lru/ozon/app/android/product/common/richheader/presentation/RichHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "image", "", "heightRatio", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "avatar", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "advBadge", "<init>", "(JLjava/lang/String;FLru/ozon/uni/atoms/data/avatar/Avatar;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getImage", "F", "getHeightRatio", "()F", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "getAvatar", "()Lru/ozon/uni/atoms/data/avatar/Avatar;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAdvBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "additionalBottomPadding", "I", "getAdditionalBottomPadding", "setAdditionalBottomPadding", "(I)V", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RichHeaderVO implements c {
    private final AtomActionDTO action;
    private int additionalBottomPadding;
    private final BadgeDTO advBadge;
    private final Avatar avatar;
    private final float heightRatio;
    private final long id;

    @NotNull
    private final String image;
    private final TextAtom subtitle;
    private final TestInfo testInfo;
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public RichHeaderVO(long j11, @NotNull String image, float f7, Avatar avatar, TextAtom textAtom, TextAtom textAtom2, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.id = j11;
        this.image = image;
        this.heightRatio = f7;
        this.avatar = avatar;
        this.title = textAtom;
        this.subtitle = textAtom2;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.advBadge = badgeDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichHeaderVO)) {
            return false;
        }
        RichHeaderVO richHeaderVO = (RichHeaderVO) other;
        return this.id == richHeaderVO.id && Intrinsics.d(this.image, richHeaderVO.image) && Float.compare(this.heightRatio, richHeaderVO.heightRatio) == 0 && Intrinsics.d(this.avatar, richHeaderVO.avatar) && Intrinsics.d(this.title, richHeaderVO.title) && Intrinsics.d(this.subtitle, richHeaderVO.subtitle) && Intrinsics.d(this.action, richHeaderVO.action) && Intrinsics.d(this.trackingInfo, richHeaderVO.trackingInfo) && Intrinsics.d(this.testInfo, richHeaderVO.testInfo) && Intrinsics.d(this.advBadge, richHeaderVO.advBadge);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final int getAdditionalBottomPadding() {
        return this.additionalBottomPadding;
    }

    public final BadgeDTO getAdvBadge() {
        return this.advBadge;
    }

    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final float getHeightRatio() {
        return this.heightRatio;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.heightRatio, g.a(Long.hashCode(this.id) * 31, 31, this.image), 31);
        Avatar avatar = this.avatar;
        int hashCode = (a11 + (avatar == null ? 0 : avatar.hashCode())) * 31;
        TextAtom textAtom = this.title;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.subtitle;
        int hashCode3 = (hashCode2 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        BadgeDTO badgeDTO = this.advBadge;
        return hashCode6 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    public final void setAdditionalBottomPadding(int i11) {
        this.additionalBottomPadding = i11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.image;
        float f7 = this.heightRatio;
        Avatar avatar = this.avatar;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        BadgeDTO badgeDTO = this.advBadge;
        StringBuilder c11 = C2436a.c(j11, "RichHeaderVO(id=", ", image=", str);
        c11.append(", heightRatio=");
        c11.append(f7);
        c11.append(", avatar=");
        c11.append(avatar);
        C2639a.e(", title=", ", subtitle=", c11, textAtom, textAtom2);
        c11.append(", action=");
        c11.append(atomActionDTO);
        c11.append(", trackingInfo=");
        c11.append(map);
        c11.append(", testInfo=");
        c11.append(testInfo);
        c11.append(", advBadge=");
        c11.append(badgeDTO);
        c11.append(")");
        return c11.toString();
    }
}
