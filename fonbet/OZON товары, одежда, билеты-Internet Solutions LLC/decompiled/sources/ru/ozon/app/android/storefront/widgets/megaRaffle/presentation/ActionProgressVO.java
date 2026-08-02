package ru.ozon.app.android.storefront.widgets.megaRaffle.presentation;

import Ak.C2436a;
import G.g;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.megaRaffle.data.HeaderDTO;
import ru.ozon.app.android.storefront.widgets.megaRaffle.data.ProgressItemDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/storefront/widgets/megaRaffle/presentation/ActionProgressVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "background", "Lru/ozon/app/android/storefront/widgets/megaRaffle/data/HeaderDTO;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/storefront/widgets/megaRaffle/data/ProgressItemDTO;", "items", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/storefront/widgets/megaRaffle/data/HeaderDTO;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackground", "Lru/ozon/app/android/storefront/widgets/megaRaffle/data/HeaderDTO;", "getHeader", "()Lru/ozon/app/android/storefront/widgets/megaRaffle/data/HeaderDTO;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ActionProgressVO implements c {
    private final AtomAction action;
    private final String background;
    private final HeaderDTO header;
    private final long id;

    @NotNull
    private final List<ProgressItemDTO> items;
    private final t tokenizedEvent;

    public ActionProgressVO(long j11, String str, HeaderDTO headerDTO, @NotNull List<ProgressItemDTO> items, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.background = str;
        this.header = headerDTO;
        this.items = items;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionProgressVO)) {
            return false;
        }
        ActionProgressVO actionProgressVO = (ActionProgressVO) other;
        return this.id == actionProgressVO.id && Intrinsics.d(this.background, actionProgressVO.background) && Intrinsics.d(this.header, actionProgressVO.header) && Intrinsics.d(this.items, actionProgressVO.items) && Intrinsics.d(this.action, actionProgressVO.action) && Intrinsics.d(this.tokenizedEvent, actionProgressVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackground() {
        return this.background;
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ProgressItemDTO> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
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
        String str = this.background;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        HeaderDTO headerDTO = this.header;
        int b11 = g.b((hashCode2 + (headerDTO == null ? 0 : headerDTO.hashCode())) * 31, 31, this.items);
        AtomAction atomAction = this.action;
        int hashCode3 = (b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.background;
        HeaderDTO headerDTO = this.header;
        List<ProgressItemDTO> list = this.items;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "ActionProgressVO(id=", ", background=", str);
        c11.append(", header=");
        c11.append(headerDTO);
        c11.append(", items=");
        c11.append(list);
        Fj.c.e(tVar, ", action=", ", tokenizedEvent=", c11, atomAction);
        c11.append(")");
        return c11.toString();
    }
}
