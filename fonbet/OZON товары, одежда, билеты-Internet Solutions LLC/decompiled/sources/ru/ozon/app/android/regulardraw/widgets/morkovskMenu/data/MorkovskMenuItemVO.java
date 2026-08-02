package ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data;

import Tl.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuItemVO;", "", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuIconVO;", "icon", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuTextVO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "info", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuIconVO;Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuTextVO;Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuTextVO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuIconVO;", "getIcon", "()Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuIconVO;", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuTextVO;", "getTitle", "()Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuTextVO;", "getInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MorkovskMenuItemVO {
    private final AtomAction action;

    @NotNull
    private final MorkovskMenuIconVO icon;
    private final MorkovskMenuTextVO info;

    @NotNull
    private final MorkovskMenuTextVO title;
    private final t tokenizedEvent;

    public MorkovskMenuItemVO(@NotNull MorkovskMenuIconVO icon, @NotNull MorkovskMenuTextVO title, MorkovskMenuTextVO morkovskMenuTextVO, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.icon = icon;
        this.title = title;
        this.info = morkovskMenuTextVO;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MorkovskMenuItemVO)) {
            return false;
        }
        MorkovskMenuItemVO morkovskMenuItemVO = (MorkovskMenuItemVO) other;
        return Intrinsics.d(this.icon, morkovskMenuItemVO.icon) && Intrinsics.d(this.title, morkovskMenuItemVO.title) && Intrinsics.d(this.info, morkovskMenuItemVO.info) && Intrinsics.d(this.action, morkovskMenuItemVO.action) && Intrinsics.d(this.tokenizedEvent, morkovskMenuItemVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final MorkovskMenuIconVO getIcon() {
        return this.icon;
    }

    public final MorkovskMenuTextVO getInfo() {
        return this.info;
    }

    @NotNull
    public final MorkovskMenuTextVO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.title.hashCode() + (this.icon.hashCode() * 31)) * 31;
        MorkovskMenuTextVO morkovskMenuTextVO = this.info;
        int hashCode2 = (hashCode + (morkovskMenuTextVO == null ? 0 : morkovskMenuTextVO.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        MorkovskMenuIconVO morkovskMenuIconVO = this.icon;
        MorkovskMenuTextVO morkovskMenuTextVO = this.title;
        MorkovskMenuTextVO morkovskMenuTextVO2 = this.info;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("MorkovskMenuItemVO(icon=");
        sb2.append(morkovskMenuIconVO);
        sb2.append(", title=");
        sb2.append(morkovskMenuTextVO);
        sb2.append(", info=");
        sb2.append(morkovskMenuTextVO2);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", tokenizedEvent=");
        return b.d(sb2, tVar, ")");
    }
}
