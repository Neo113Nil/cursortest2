package ru.ozon.app.android.pdp.widgets.aspectsV4.info.infoSimpleText.presentation;

import Ns.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.aspectsV4.info.base.AspectV4InfoBaseVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/info/infoSimpleText/presentation/AspectV4TextInfoVO;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/info/base/AspectV4InfoBaseVO;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "<init>", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AspectV4TextInfoVO implements AspectV4InfoBaseVO {
    public static final int $stable = AtomAction.$stable;
    private final AtomAction atomAction;
    private final BadgeDTO badge;
    private final long id;

    @NotNull
    private final TextDTO text;

    public AspectV4TextInfoVO(long j11, BadgeDTO badgeDTO, @NotNull TextDTO text, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = j11;
        this.badge = badgeDTO;
        this.text = text;
        this.atomAction = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectV4TextInfoVO)) {
            return false;
        }
        AspectV4TextInfoVO aspectV4TextInfoVO = (AspectV4TextInfoVO) other;
        return this.id == aspectV4TextInfoVO.id && Intrinsics.d(this.badge, aspectV4TextInfoVO.badge) && Intrinsics.d(this.text, aspectV4TextInfoVO.text) && Intrinsics.d(this.atomAction, aspectV4TextInfoVO.atomAction);
    }

    public final AtomAction getAtomAction() {
        return this.atomAction;
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.info.base.AspectV4InfoBaseVO
    public BadgeDTO getBadge() {
        return this.badge;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return AspectV4InfoBaseVO.DefaultImpls.getScrollWidgetKey(this);
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return AspectV4InfoBaseVO.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        BadgeDTO badgeDTO = this.badge;
        int a11 = b.a(this.text, (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31);
        AtomAction atomAction = this.atomAction;
        return a11 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AspectV4TextInfoVO(id=" + this.id + ", badge=" + this.badge + ", text=" + this.text + ", atomAction=" + this.atomAction + ")";
    }
}
