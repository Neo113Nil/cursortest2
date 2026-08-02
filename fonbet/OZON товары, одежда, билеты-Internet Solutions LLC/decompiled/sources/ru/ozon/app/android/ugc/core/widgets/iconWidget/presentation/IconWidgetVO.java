package ru.ozon.app.android.ugc.core.widgets.iconWidget.presentation;

import B0.C2454a;
import El.C2971a;
import GR.b;
import WZ.t;
import e1.InterfaceC6250b;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b \b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0081\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b0\u0010/R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b2\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u0010\u001dR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u001f\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010=\u001a\u0004\b\u0018\u0010>R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0019\u00105\u001a\u0004\b?\u0010\u001d¨\u0006@"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/IconWidgetVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "", "alignment", "", "backgroundColor", "Le1/b;", "composeAlignment", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "isSticky", "scrollColor", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;ILjava/lang/String;Le1/b;LWZ/t;Ljava/lang/Boolean;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "I", "getAlignment", "Ljava/lang/String;", "getBackgroundColor", "Le1/b;", "getComposeAlignment", "()Le1/b;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getScrollColor", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IconWidgetVO implements c {
    private final AtomAction action;
    private final int alignment;
    private final String backgroundColor;

    @NotNull
    private final Paddings bottomPadding;

    @NotNull
    private final InterfaceC6250b composeAlignment;

    @NotNull
    private final IconDTO icon;
    private final long id;
    private final Boolean isSticky;

    @NotNull
    private final Paddings leftPadding;

    @NotNull
    private final Paddings rightPadding;
    private final String scrollColor;
    private final t tokenizedEvent;

    @NotNull
    private final Paddings topPadding;

    public IconWidgetVO(long j11, @NotNull IconDTO icon, AtomAction atomAction, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding, int i11, String str, @NotNull InterfaceC6250b composeAlignment, t tVar, Boolean bool, String str2) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        Intrinsics.checkNotNullParameter(composeAlignment, "composeAlignment");
        this.id = j11;
        this.icon = icon;
        this.action = atomAction;
        this.topPadding = topPadding;
        this.bottomPadding = bottomPadding;
        this.leftPadding = leftPadding;
        this.rightPadding = rightPadding;
        this.alignment = i11;
        this.backgroundColor = str;
        this.composeAlignment = composeAlignment;
        this.tokenizedEvent = tVar;
        this.isSticky = bool;
        this.scrollColor = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconWidgetVO)) {
            return false;
        }
        IconWidgetVO iconWidgetVO = (IconWidgetVO) other;
        return this.id == iconWidgetVO.id && Intrinsics.d(this.icon, iconWidgetVO.icon) && Intrinsics.d(this.action, iconWidgetVO.action) && this.topPadding == iconWidgetVO.topPadding && this.bottomPadding == iconWidgetVO.bottomPadding && this.leftPadding == iconWidgetVO.leftPadding && this.rightPadding == iconWidgetVO.rightPadding && this.alignment == iconWidgetVO.alignment && Intrinsics.d(this.backgroundColor, iconWidgetVO.backgroundColor) && Intrinsics.d(this.composeAlignment, iconWidgetVO.composeAlignment) && Intrinsics.d(this.tokenizedEvent, iconWidgetVO.tokenizedEvent) && Intrinsics.d(this.isSticky, iconWidgetVO.isSticky) && Intrinsics.d(this.scrollColor, iconWidgetVO.scrollColor);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final int getAlignment() {
        return this.alignment;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final InterfaceC6250b getComposeAlignment() {
        return this.composeAlignment;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    public final String getScrollColor() {
        return this.scrollColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C2971a.a(this.icon, Long.hashCode(this.id) * 31, 31);
        AtomAction atomAction = this.action;
        int a12 = C2454a.a(this.alignment, b.b(this.rightPadding, b.b(this.leftPadding, b.b(this.bottomPadding, b.b(this.topPadding, (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str = this.backgroundColor;
        int hashCode = (this.composeAlignment.hashCode() + ((a12 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Boolean bool = this.isSticky;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.scrollColor;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: isSticky, reason: from getter */
    public final Boolean getIsSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.icon;
        AtomAction atomAction = this.action;
        Paddings paddings = this.topPadding;
        Paddings paddings2 = this.bottomPadding;
        Paddings paddings3 = this.leftPadding;
        Paddings paddings4 = this.rightPadding;
        int i11 = this.alignment;
        String str = this.backgroundColor;
        InterfaceC6250b interfaceC6250b = this.composeAlignment;
        t tVar = this.tokenizedEvent;
        Boolean bool = this.isSticky;
        String str2 = this.scrollColor;
        StringBuilder b11 = D40.c.b("IconWidgetVO(id=", j11, ", icon=", iconDTO);
        b11.append(", action=");
        b11.append(atomAction);
        b11.append(", topPadding=");
        b11.append(paddings);
        b11.append(", bottomPadding=");
        b11.append(paddings2);
        b11.append(", leftPadding=");
        b11.append(paddings3);
        b11.append(", rightPadding=");
        b11.append(paddings4);
        b11.append(", alignment=");
        b11.append(i11);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", composeAlignment=");
        b11.append(interfaceC6250b);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", isSticky=");
        b11.append(bool);
        return C6594f.a(", scrollColor=", str2, ")", b11);
    }
}
