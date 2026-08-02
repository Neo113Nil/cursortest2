package ru.ozon.app.android.ugc.core.widgets.singlereview.userLikes;

import Ns.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/userLikes/UserLikesVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "avatars", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getAvatars", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserLikesVO implements c {
    private final AtomAction action;
    private final List<IconDTO> avatars;
    private final IconDTO icon;
    private final long id;

    @NotNull
    private final TextDTO text;

    public UserLikesVO(long j11, List<IconDTO> list, @NotNull TextDTO text, IconDTO iconDTO, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = j11;
        this.avatars = list;
        this.text = text;
        this.icon = iconDTO;
        this.action = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserLikesVO)) {
            return false;
        }
        UserLikesVO userLikesVO = (UserLikesVO) other;
        return this.id == userLikesVO.id && Intrinsics.d(this.avatars, userLikesVO.avatars) && Intrinsics.d(this.text, userLikesVO.text) && Intrinsics.d(this.icon, userLikesVO.icon) && Intrinsics.d(this.action, userLikesVO.action);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final List<IconDTO> getAvatars() {
        return this.avatars;
    }

    public final IconDTO getIcon() {
        return this.icon;
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
    public final TextDTO getText() {
        return this.text;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        List<IconDTO> list = this.avatars;
        int a11 = b.a(this.text, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        IconDTO iconDTO = this.icon;
        int hashCode2 = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        AtomAction atomAction = this.action;
        return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<IconDTO> list = this.avatars;
        TextDTO textDTO = this.text;
        IconDTO iconDTO = this.icon;
        AtomAction atomAction = this.action;
        StringBuilder b11 = Lh.b.b(j11, "UserLikesVO(id=", ", avatars=", list);
        b11.append(", text=");
        b11.append(textDTO);
        b11.append(", icon=");
        b11.append(iconDTO);
        b11.append(", action=");
        b11.append(atomAction);
        b11.append(")");
        return b11.toString();
    }
}
