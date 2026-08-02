package ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter;

import De.C2859b;
import El.C2971a;
import Ih.a;
import Kk.C3532b;
import Ns.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b&\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b\u000e\u0010.R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/CommentFooterDO;", "", "", "uuid", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "avatarIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "backgroundColor", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "commentsButton", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "clickAction", "", "isInItems", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLjava/util/Map;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAvatarIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getCommentsButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Z", "()Z", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommentFooterDO {

    @NotNull
    private final IconDTO avatarIcon;
    private final String backgroundColor;

    @NotNull
    private final AtomActionDTO clickAction;

    @NotNull
    private final ButtonV3DTO commentsButton;
    private final CornerRadius cornerRadius;
    private final boolean isInItems;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final String uuid;

    public CommentFooterDO(@NotNull String uuid, @NotNull IconDTO avatarIcon, @NotNull TextDTO title, String str, @NotNull ButtonV3DTO commentsButton, @NotNull AtomActionDTO clickAction, boolean z11, Map<String, TokenizedTrackingInfo> map, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(avatarIcon, "avatarIcon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(commentsButton, "commentsButton");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        this.uuid = uuid;
        this.avatarIcon = avatarIcon;
        this.title = title;
        this.backgroundColor = str;
        this.commentsButton = commentsButton;
        this.clickAction = clickAction;
        this.isInItems = z11;
        this.trackingInfo = map;
        this.cornerRadius = cornerRadius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentFooterDO)) {
            return false;
        }
        CommentFooterDO commentFooterDO = (CommentFooterDO) other;
        return Intrinsics.d(this.uuid, commentFooterDO.uuid) && Intrinsics.d(this.avatarIcon, commentFooterDO.avatarIcon) && Intrinsics.d(this.title, commentFooterDO.title) && Intrinsics.d(this.backgroundColor, commentFooterDO.backgroundColor) && Intrinsics.d(this.commentsButton, commentFooterDO.commentsButton) && Intrinsics.d(this.clickAction, commentFooterDO.clickAction) && this.isInItems == commentFooterDO.isInItems && Intrinsics.d(this.trackingInfo, commentFooterDO.trackingInfo) && this.cornerRadius == commentFooterDO.cornerRadius;
    }

    @NotNull
    public final IconDTO getAvatarIcon() {
        return this.avatarIcon;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    @NotNull
    public final ButtonV3DTO getCommentsButton() {
        return this.commentsButton;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int a11 = b.a(this.title, C2971a.a(this.avatarIcon, this.uuid.hashCode() * 31, 31), 31);
        String str = this.backgroundColor;
        int a12 = C3532b.a(a.b(this.clickAction, C2859b.c(this.commentsButton, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.isInItems);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode = (a12 + (map == null ? 0 : map.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        return hashCode + (cornerRadius != null ? cornerRadius.hashCode() : 0);
    }

    /* renamed from: isInItems, reason: from getter */
    public final boolean getIsInItems() {
        return this.isInItems;
    }

    @NotNull
    public String toString() {
        return "CommentFooterDO(uuid=" + this.uuid + ", avatarIcon=" + this.avatarIcon + ", title=" + this.title + ", backgroundColor=" + this.backgroundColor + ", commentsButton=" + this.commentsButton + ", clickAction=" + this.clickAction + ", isInItems=" + this.isInItems + ", trackingInfo=" + this.trackingInfo + ", cornerRadius=" + this.cornerRadius + ")";
    }
}
