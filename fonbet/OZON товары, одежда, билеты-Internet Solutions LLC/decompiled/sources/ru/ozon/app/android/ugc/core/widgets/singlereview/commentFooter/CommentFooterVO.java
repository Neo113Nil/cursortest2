package ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter;

import De.C2859b;
import El.C2971a;
import Kk.C3532b;
import Ns.b;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0019R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b\u0010\u00103R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/CommentFooterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "avatarIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "backgroundColor", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "commentsButton", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "", "isInItems", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;ZLWZ/t;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAvatarIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getCommentsButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommentFooterVO implements c {

    @NotNull
    private final IconDTO avatarIcon;
    private final String backgroundColor;

    @NotNull
    private final AtomAction clickAction;

    @NotNull
    private final ButtonV3DTO commentsButton;

    @NotNull
    private final CornerRadius cornerRadius;
    private final long id;
    private final boolean isInItems;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    public CommentFooterVO(long j11, @NotNull IconDTO avatarIcon, @NotNull TextDTO title, String str, @NotNull ButtonV3DTO commentsButton, @NotNull AtomAction clickAction, boolean z11, t tVar, @NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(avatarIcon, "avatarIcon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(commentsButton, "commentsButton");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        this.id = j11;
        this.avatarIcon = avatarIcon;
        this.title = title;
        this.backgroundColor = str;
        this.commentsButton = commentsButton;
        this.clickAction = clickAction;
        this.isInItems = z11;
        this.tokenizedEvent = tVar;
        this.cornerRadius = cornerRadius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentFooterVO)) {
            return false;
        }
        CommentFooterVO commentFooterVO = (CommentFooterVO) other;
        return this.id == commentFooterVO.id && Intrinsics.d(this.avatarIcon, commentFooterVO.avatarIcon) && Intrinsics.d(this.title, commentFooterVO.title) && Intrinsics.d(this.backgroundColor, commentFooterVO.backgroundColor) && Intrinsics.d(this.commentsButton, commentFooterVO.commentsButton) && Intrinsics.d(this.clickAction, commentFooterVO.clickAction) && this.isInItems == commentFooterVO.isInItems && Intrinsics.d(this.tokenizedEvent, commentFooterVO.tokenizedEvent) && this.cornerRadius == commentFooterVO.cornerRadius;
    }

    @NotNull
    public final IconDTO getAvatarIcon() {
        return this.avatarIcon;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final AtomAction getClickAction() {
        return this.clickAction;
    }

    @NotNull
    public final ButtonV3DTO getCommentsButton() {
        return this.commentsButton;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, C2971a.a(this.avatarIcon, Long.hashCode(this.id) * 31, 31), 31);
        String str = this.backgroundColor;
        int a12 = C3532b.a(C4598rp.a(this.clickAction, C2859b.c(this.commentsButton, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.isInItems);
        t tVar = this.tokenizedEvent;
        return this.cornerRadius.hashCode() + ((a12 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    /* renamed from: isInItems, reason: from getter */
    public final boolean getIsInItems() {
        return this.isInItems;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.avatarIcon;
        TextDTO textDTO = this.title;
        String str = this.backgroundColor;
        ButtonV3DTO buttonV3DTO = this.commentsButton;
        AtomAction atomAction = this.clickAction;
        boolean z11 = this.isInItems;
        t tVar = this.tokenizedEvent;
        CornerRadius cornerRadius = this.cornerRadius;
        StringBuilder b11 = D40.c.b("CommentFooterVO(id=", j11, ", avatarIcon=", iconDTO);
        b11.append(", title=");
        b11.append(textDTO);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", commentsButton=");
        b11.append(buttonV3DTO);
        b11.append(", clickAction=");
        b11.append(atomAction);
        C2971a.d(b11, ", isInItems=", z11, ", tokenizedEvent=", tVar);
        b11.append(", cornerRadius=");
        b11.append(cornerRadius);
        b11.append(")");
        return b11.toString();
    }
}
