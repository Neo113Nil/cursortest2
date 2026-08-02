package ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation;

import D3.g;
import El.C2971a;
import Ns.b;
import TY.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u0010\u0016R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "miniappTitle", "timeDeliveryTitle", "addressTitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "miniappIcon", "timeDeliveryIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "asyncData", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getMiniappTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTimeDeliveryTitle", "getAddressTitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getMiniappIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTimeDeliveryIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/String;", "getAsyncData", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshMiniappHeaderVO implements c {
    private final AtomAction action;

    @NotNull
    private final TextDTO addressTitle;
    private final String asyncData;
    private final long id;

    @NotNull
    private final IconDTO miniappIcon;

    @NotNull
    private final TextDTO miniappTitle;
    private final IconDTO timeDeliveryIcon;

    @NotNull
    private final TextDTO timeDeliveryTitle;
    private final t tokenizedEvent;

    public FreshMiniappHeaderVO(long j11, @NotNull TextDTO miniappTitle, @NotNull TextDTO timeDeliveryTitle, @NotNull TextDTO addressTitle, @NotNull IconDTO miniappIcon, IconDTO iconDTO, AtomAction atomAction, String str, t tVar) {
        Intrinsics.checkNotNullParameter(miniappTitle, "miniappTitle");
        Intrinsics.checkNotNullParameter(timeDeliveryTitle, "timeDeliveryTitle");
        Intrinsics.checkNotNullParameter(addressTitle, "addressTitle");
        Intrinsics.checkNotNullParameter(miniappIcon, "miniappIcon");
        this.id = j11;
        this.miniappTitle = miniappTitle;
        this.timeDeliveryTitle = timeDeliveryTitle;
        this.addressTitle = addressTitle;
        this.miniappIcon = miniappIcon;
        this.timeDeliveryIcon = iconDTO;
        this.action = atomAction;
        this.asyncData = str;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshMiniappHeaderVO)) {
            return false;
        }
        FreshMiniappHeaderVO freshMiniappHeaderVO = (FreshMiniappHeaderVO) other;
        return this.id == freshMiniappHeaderVO.id && Intrinsics.d(this.miniappTitle, freshMiniappHeaderVO.miniappTitle) && Intrinsics.d(this.timeDeliveryTitle, freshMiniappHeaderVO.timeDeliveryTitle) && Intrinsics.d(this.addressTitle, freshMiniappHeaderVO.addressTitle) && Intrinsics.d(this.miniappIcon, freshMiniappHeaderVO.miniappIcon) && Intrinsics.d(this.timeDeliveryIcon, freshMiniappHeaderVO.timeDeliveryIcon) && Intrinsics.d(this.action, freshMiniappHeaderVO.action) && Intrinsics.d(this.asyncData, freshMiniappHeaderVO.asyncData) && Intrinsics.d(this.tokenizedEvent, freshMiniappHeaderVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final TextDTO getAddressTitle() {
        return this.addressTitle;
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final IconDTO getMiniappIcon() {
        return this.miniappIcon;
    }

    @NotNull
    public final TextDTO getMiniappTitle() {
        return this.miniappTitle;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final IconDTO getTimeDeliveryIcon() {
        return this.timeDeliveryIcon;
    }

    @NotNull
    public final TextDTO getTimeDeliveryTitle() {
        return this.timeDeliveryTitle;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C2971a.a(this.miniappIcon, b.a(this.addressTitle, b.a(this.timeDeliveryTitle, b.a(this.miniappTitle, Long.hashCode(this.id) * 31, 31), 31), 31), 31);
        IconDTO iconDTO = this.timeDeliveryIcon;
        int hashCode = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        String str = this.asyncData;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.miniappTitle;
        TextDTO textDTO2 = this.timeDeliveryTitle;
        TextDTO textDTO3 = this.addressTitle;
        IconDTO iconDTO = this.miniappIcon;
        IconDTO iconDTO2 = this.timeDeliveryIcon;
        AtomAction atomAction = this.action;
        String str = this.asyncData;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("FreshMiniappHeaderVO(id=", j11, ", miniappTitle=", textDTO);
        g.i(", timeDeliveryTitle=", ", addressTitle=", b11, textDTO2, textDTO3);
        b11.append(", miniappIcon=");
        b11.append(iconDTO);
        b11.append(", timeDeliveryIcon=");
        b11.append(iconDTO2);
        b11.append(", action=");
        b11.append(atomAction);
        b11.append(", asyncData=");
        b11.append(str);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
