package ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet;

import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u000e\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001f\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001f\u0010\b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001f\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;", "", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "open", "miniCloseSwipe", "miniCloseTap", "openFull", "closeFull", "reopenFull", "<init>", "(LWZ/t;LWZ/t;LWZ/t;LWZ/t;LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getOpen", "()LWZ/t;", "getMiniCloseSwipe", "getMiniCloseTap", "getOpenFull", "getCloseFull", "getReopenFull", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CurtainTrackingInfoVO {
    private final t closeFull;
    private final t miniCloseSwipe;
    private final t miniCloseTap;
    private final t open;
    private final t openFull;
    private final t reopenFull;

    public CurtainTrackingInfoVO(t tVar, t tVar2, t tVar3, t tVar4, t tVar5, t tVar6) {
        this.open = tVar;
        this.miniCloseSwipe = tVar2;
        this.miniCloseTap = tVar3;
        this.openFull = tVar4;
        this.closeFull = tVar5;
        this.reopenFull = tVar6;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainTrackingInfoVO)) {
            return false;
        }
        CurtainTrackingInfoVO curtainTrackingInfoVO = (CurtainTrackingInfoVO) other;
        return Intrinsics.d(this.open, curtainTrackingInfoVO.open) && Intrinsics.d(this.miniCloseSwipe, curtainTrackingInfoVO.miniCloseSwipe) && Intrinsics.d(this.miniCloseTap, curtainTrackingInfoVO.miniCloseTap) && Intrinsics.d(this.openFull, curtainTrackingInfoVO.openFull) && Intrinsics.d(this.closeFull, curtainTrackingInfoVO.closeFull) && Intrinsics.d(this.reopenFull, curtainTrackingInfoVO.reopenFull);
    }

    public final t getCloseFull() {
        return this.closeFull;
    }

    public final t getMiniCloseSwipe() {
        return this.miniCloseSwipe;
    }

    public final t getMiniCloseTap() {
        return this.miniCloseTap;
    }

    public final t getOpen() {
        return this.open;
    }

    public final t getOpenFull() {
        return this.openFull;
    }

    public final t getReopenFull() {
        return this.reopenFull;
    }

    public int hashCode() {
        t tVar = this.open;
        int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
        t tVar2 = this.miniCloseSwipe;
        int hashCode2 = (hashCode + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        t tVar3 = this.miniCloseTap;
        int hashCode3 = (hashCode2 + (tVar3 == null ? 0 : tVar3.hashCode())) * 31;
        t tVar4 = this.openFull;
        int hashCode4 = (hashCode3 + (tVar4 == null ? 0 : tVar4.hashCode())) * 31;
        t tVar5 = this.closeFull;
        int hashCode5 = (hashCode4 + (tVar5 == null ? 0 : tVar5.hashCode())) * 31;
        t tVar6 = this.reopenFull;
        return hashCode5 + (tVar6 != null ? tVar6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CurtainTrackingInfoVO(open=" + this.open + ", miniCloseSwipe=" + this.miniCloseSwipe + ", miniCloseTap=" + this.miniCloseTap + ", openFull=" + this.openFull + ", closeFull=" + this.closeFull + ", reopenFull=" + this.reopenFull + ")";
    }
}
