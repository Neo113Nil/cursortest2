package ru.ozon.android.composerCommonViewKit.header.presentation;

import B0.A0;
import B0.C2454a;
import D3.h;
import Kk.C3532b;
import Ns.b;
import TY.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b\f\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b<\u0010\u001dR\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b=\u0010\u001dR\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b>\u0010\u001dR\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b?\u0010\u001d¨\u0006@"}, d2 = {"Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "isTopRounded", "", "backgroundColor", "LWZ/t;", "tokenizedEvent", "", "topIslandCornerRadius", "", "leftMargin", "topMargin", "rightMargin", "bottomMargin", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;ZLjava/lang/String;LWZ/t;FIIII)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "()Z", "isTopRounded$annotations", "()V", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "F", "getTopIslandCornerRadius", "()F", "I", "getLeftMargin", "getTopMargin", "getRightMargin", "getBottomMargin", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class HeaderVO implements c {
    private final AtomAction action;
    private final String backgroundColor;
    private final BadgeDTO badge;
    private final int bottomMargin;
    private final long id;
    private final boolean isTopRounded;
    private final int leftMargin;
    private final int rightMargin;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;
    private final float topIslandCornerRadius;
    private final int topMargin;

    public HeaderVO(long j11, @NotNull TextDTO title, TextDTO textDTO, BadgeDTO badgeDTO, AtomAction atomAction, boolean z11, String str, t tVar, float f7, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.subtitle = textDTO;
        this.badge = badgeDTO;
        this.action = atomAction;
        this.isTopRounded = z11;
        this.backgroundColor = str;
        this.tokenizedEvent = tVar;
        this.topIslandCornerRadius = f7;
        this.leftMargin = i11;
        this.topMargin = i12;
        this.rightMargin = i13;
        this.bottomMargin = i14;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderVO)) {
            return false;
        }
        HeaderVO headerVO = (HeaderVO) other;
        return this.id == headerVO.id && Intrinsics.d(this.title, headerVO.title) && Intrinsics.d(this.subtitle, headerVO.subtitle) && Intrinsics.d(this.badge, headerVO.badge) && Intrinsics.d(this.action, headerVO.action) && this.isTopRounded == headerVO.isTopRounded && Intrinsics.d(this.backgroundColor, headerVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, headerVO.tokenizedEvent) && Float.compare(this.topIslandCornerRadius, headerVO.topIslandCornerRadius) == 0 && this.leftMargin == headerVO.leftMargin && this.topMargin == headerVO.topMargin && this.rightMargin == headerVO.rightMargin && this.bottomMargin == headerVO.bottomMargin;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final int getBottomMargin() {
        return this.bottomMargin;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getLeftMargin() {
        return this.leftMargin;
    }

    public final int getRightMargin() {
        return this.rightMargin;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final float getTopIslandCornerRadius() {
        return this.topIslandCornerRadius;
    }

    public final int getTopMargin() {
        return this.topMargin;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int a12 = C3532b.a((hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.isTopRounded);
        String str = this.backgroundColor;
        int hashCode3 = (a12 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return Integer.hashCode(this.bottomMargin) + C2454a.a(this.rightMargin, C2454a.a(this.topMargin, C2454a.a(this.leftMargin, Pk0.b.a(this.topIslandCornerRadius, (hashCode3 + (tVar != null ? tVar.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        BadgeDTO badgeDTO = this.badge;
        AtomAction atomAction = this.action;
        boolean z11 = this.isTopRounded;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        float f7 = this.topIslandCornerRadius;
        int i11 = this.leftMargin;
        int i12 = this.topMargin;
        int i13 = this.rightMargin;
        int i14 = this.bottomMargin;
        StringBuilder b11 = a.b("HeaderVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", badge=");
        b11.append(badgeDTO);
        b11.append(", action=");
        b11.append(atomAction);
        b11.append(", isTopRounded=");
        b11.append(z11);
        Bi.a.f(b11, ", backgroundColor=", str, ", tokenizedEvent=", tVar);
        b11.append(", topIslandCornerRadius=");
        b11.append(f7);
        b11.append(", leftMargin=");
        b11.append(i11);
        A0.c(i12, i13, ", topMargin=", ", rightMargin=", b11);
        return h.b(b11, ", bottomMargin=", i14, ")");
    }
}
