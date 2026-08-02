package ru.ozon.app.android.marketing.widgets.sellerActionsLadder.presentation;

import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.seller.molecule.progressLadder.data.ProgressLadderDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsLadder/presentation/SellerActionsLadderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "progressLadder", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "getProgressLadder", "()Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerActionsLadderVO implements c {
    private final long id;

    @NotNull
    private final ProgressLadderDTO progressLadder;
    private final t tokenizedEvent;

    public SellerActionsLadderVO(long j11, @NotNull ProgressLadderDTO progressLadder, t tVar) {
        Intrinsics.checkNotNullParameter(progressLadder, "progressLadder");
        this.id = j11;
        this.progressLadder = progressLadder;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerActionsLadderVO)) {
            return false;
        }
        SellerActionsLadderVO sellerActionsLadderVO = (SellerActionsLadderVO) other;
        return this.id == sellerActionsLadderVO.id && Intrinsics.d(this.progressLadder, sellerActionsLadderVO.progressLadder) && Intrinsics.d(this.tokenizedEvent, sellerActionsLadderVO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ProgressLadderDTO getProgressLadder() {
        return this.progressLadder;
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
        int hashCode = (this.progressLadder.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ProgressLadderDTO progressLadderDTO = this.progressLadder;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("SellerActionsLadderVO(id=");
        sb2.append(j11);
        sb2.append(", progressLadder=");
        sb2.append(progressLadderDTO);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
