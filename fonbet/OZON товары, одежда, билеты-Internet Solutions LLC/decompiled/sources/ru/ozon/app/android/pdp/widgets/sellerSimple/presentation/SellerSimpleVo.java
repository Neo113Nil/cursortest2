package ru.ozon.app.android.pdp.widgets.sellerSimple.presentation;

import D3.g;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerSimple/presentation/SellerSimpleVo;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "personType", "sellerName", "dateText", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "avatar", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/avatar/Avatar;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getPersonType", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSellerName", "getDateText", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "getAvatar", "()Lru/ozon/uni/atoms/data/avatar/Avatar;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SellerSimpleVo implements c {
    private final AtomAction action;
    private final Avatar avatar;
    private final TextDTO dateText;
    private final long id;
    private final TextDTO personType;
    private final TextDTO sellerName;
    private final t tokenizedEvent;

    public SellerSimpleVo(long j11, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, Avatar avatar, AtomAction atomAction, t tVar) {
        this.id = j11;
        this.personType = textDTO;
        this.sellerName = textDTO2;
        this.dateText = textDTO3;
        this.avatar = avatar;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerSimpleVo)) {
            return false;
        }
        SellerSimpleVo sellerSimpleVo = (SellerSimpleVo) other;
        return this.id == sellerSimpleVo.id && Intrinsics.d(this.personType, sellerSimpleVo.personType) && Intrinsics.d(this.sellerName, sellerSimpleVo.sellerName) && Intrinsics.d(this.dateText, sellerSimpleVo.dateText) && Intrinsics.d(this.avatar, sellerSimpleVo.avatar) && Intrinsics.d(this.action, sellerSimpleVo.action) && Intrinsics.d(this.tokenizedEvent, sellerSimpleVo.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final TextDTO getDateText() {
        return this.dateText;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TextDTO getPersonType() {
        return this.personType;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSellerName() {
        return this.sellerName;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.personType;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.sellerName;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        TextDTO textDTO3 = this.dateText;
        int hashCode4 = (hashCode3 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
        Avatar avatar = this.avatar;
        int hashCode5 = (hashCode4 + (avatar == null ? 0 : avatar.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode6 = (hashCode5 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode6 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.personType;
        TextDTO textDTO2 = this.sellerName;
        TextDTO textDTO3 = this.dateText;
        Avatar avatar = this.avatar;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = TY.a.b("SellerSimpleVo(id=", j11, ", personType=", textDTO);
        g.i(", sellerName=", ", dateText=", b11, textDTO2, textDTO3);
        b11.append(", avatar=");
        b11.append(avatar);
        b11.append(", action=");
        b11.append(atomAction);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
