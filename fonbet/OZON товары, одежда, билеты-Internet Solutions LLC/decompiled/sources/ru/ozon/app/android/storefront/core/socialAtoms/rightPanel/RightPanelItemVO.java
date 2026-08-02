package ru.ozon.app.android.storefront.core.socialAtoms.rightPanel;

import B90.C2618u;
import Ve.C4598rp;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;", "", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "text", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "", "iconGradient", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "getText", "()Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/util/List;", "getIconGradient", "()Ljava/util/List;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RightPanelItemVO {

    @NotNull
    private final AtomAction action;

    @NotNull
    private final Icon icon;
    private final List<String> iconGradient;
    private final SocialTextAtomDTO text;
    private final t tokenizedEvent;

    public RightPanelItemVO(@NotNull Icon icon, SocialTextAtomDTO socialTextAtomDTO, @NotNull AtomAction action, t tVar, List<String> list) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        this.icon = icon;
        this.text = socialTextAtomDTO;
        this.action = action;
        this.tokenizedEvent = tVar;
        this.iconGradient = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RightPanelItemVO)) {
            return false;
        }
        RightPanelItemVO rightPanelItemVO = (RightPanelItemVO) other;
        return Intrinsics.d(this.icon, rightPanelItemVO.icon) && Intrinsics.d(this.text, rightPanelItemVO.text) && Intrinsics.d(this.action, rightPanelItemVO.action) && Intrinsics.d(this.tokenizedEvent, rightPanelItemVO.tokenizedEvent) && Intrinsics.d(this.iconGradient, rightPanelItemVO.iconGradient);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    public final List<String> getIconGradient() {
        return this.iconGradient;
    }

    public final SocialTextAtomDTO getText() {
        return this.text;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        SocialTextAtomDTO socialTextAtomDTO = this.text;
        int a11 = C4598rp.a(this.action, (hashCode + (socialTextAtomDTO == null ? 0 : socialTextAtomDTO.hashCode())) * 31, 31);
        t tVar = this.tokenizedEvent;
        int hashCode2 = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        List<String> list = this.iconGradient;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Icon icon = this.icon;
        SocialTextAtomDTO socialTextAtomDTO = this.text;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        List<String> list = this.iconGradient;
        StringBuilder sb2 = new StringBuilder("RightPanelItemVO(icon=");
        sb2.append(icon);
        sb2.append(", text=");
        sb2.append(socialTextAtomDTO);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", iconGradient=");
        return C2618u.h(sb2, list, ")");
    }
}
