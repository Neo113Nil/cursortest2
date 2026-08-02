package ru.ozon.app.android.storefront.widgets.megadraw.presentation;

import Lh.a;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.megadraw.data.CountBlockDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/storefront/widgets/megadraw/presentation/MegaDrawVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/storefront/widgets/megadraw/data/CountBlockDTO;", "countBlock", "Lru/ozon/app/android/storefront/widgets/megadraw/presentation/PrizeBlockVO;", "prizesBlock", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/storefront/widgets/megadraw/data/CountBlockDTO;Lru/ozon/app/android/storefront/widgets/megadraw/presentation/PrizeBlockVO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/storefront/widgets/megadraw/data/CountBlockDTO;", "getCountBlock", "()Lru/ozon/app/android/storefront/widgets/megadraw/data/CountBlockDTO;", "Lru/ozon/app/android/storefront/widgets/megadraw/presentation/PrizeBlockVO;", "getPrizesBlock", "()Lru/ozon/app/android/storefront/widgets/megadraw/presentation/PrizeBlockVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MegaDrawVO implements c {

    @NotNull
    private final AtomAction action;

    @NotNull
    private final CountBlockDTO countBlock;
    private final long id;

    @NotNull
    private final PrizeBlockVO prizesBlock;
    private final t tokenizedEvent;

    public MegaDrawVO(long j11, @NotNull AtomAction action, @NotNull CountBlockDTO countBlock, @NotNull PrizeBlockVO prizesBlock, t tVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(countBlock, "countBlock");
        Intrinsics.checkNotNullParameter(prizesBlock, "prizesBlock");
        this.id = j11;
        this.action = action;
        this.countBlock = countBlock;
        this.prizesBlock = prizesBlock;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MegaDrawVO)) {
            return false;
        }
        MegaDrawVO megaDrawVO = (MegaDrawVO) other;
        return this.id == megaDrawVO.id && Intrinsics.d(this.action, megaDrawVO.action) && Intrinsics.d(this.countBlock, megaDrawVO.countBlock) && Intrinsics.d(this.prizesBlock, megaDrawVO.prizesBlock) && Intrinsics.d(this.tokenizedEvent, megaDrawVO.tokenizedEvent);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final CountBlockDTO getCountBlock() {
        return this.countBlock;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final PrizeBlockVO getPrizesBlock() {
        return this.prizesBlock;
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
        int hashCode = (this.prizesBlock.hashCode() + ((this.countBlock.hashCode() + C4598rp.a(this.action, Long.hashCode(this.id) * 31, 31)) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        AtomAction atomAction = this.action;
        CountBlockDTO countBlockDTO = this.countBlock;
        PrizeBlockVO prizeBlockVO = this.prizesBlock;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("MegaDrawVO(id=");
        sb2.append(j11);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", countBlock=");
        sb2.append(countBlockDTO);
        sb2.append(", prizesBlock=");
        sb2.append(prizeBlockVO);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
