package ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data;

import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u000e\u0010\n\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001f\u0010\b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001f\u0010\t\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001f\u0010\n\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;", "", "", "curtainDeeplink", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "openTokenizedEvent", "miniCloseSwipeEvent", "miniCloseTapEvent", "openFullEvent", "closeFullEvent", "<init>", "(Ljava/lang/String;LWZ/t;LWZ/t;LWZ/t;LWZ/t;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurtainDeeplink", "LWZ/t;", "getOpenTokenizedEvent", "()LWZ/t;", "getMiniCloseSwipeEvent", "getMiniCloseTapEvent", "getOpenFullEvent", "getCloseFullEvent", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TileRelatedProductsCurtainVO {
    private final t closeFullEvent;

    @NotNull
    private final String curtainDeeplink;
    private final t miniCloseSwipeEvent;
    private final t miniCloseTapEvent;
    private final t openFullEvent;
    private final t openTokenizedEvent;

    public TileRelatedProductsCurtainVO(@NotNull String curtainDeeplink, t tVar, t tVar2, t tVar3, t tVar4, t tVar5) {
        Intrinsics.checkNotNullParameter(curtainDeeplink, "curtainDeeplink");
        this.curtainDeeplink = curtainDeeplink;
        this.openTokenizedEvent = tVar;
        this.miniCloseSwipeEvent = tVar2;
        this.miniCloseTapEvent = tVar3;
        this.openFullEvent = tVar4;
        this.closeFullEvent = tVar5;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileRelatedProductsCurtainVO)) {
            return false;
        }
        TileRelatedProductsCurtainVO tileRelatedProductsCurtainVO = (TileRelatedProductsCurtainVO) other;
        return Intrinsics.d(this.curtainDeeplink, tileRelatedProductsCurtainVO.curtainDeeplink) && Intrinsics.d(this.openTokenizedEvent, tileRelatedProductsCurtainVO.openTokenizedEvent) && Intrinsics.d(this.miniCloseSwipeEvent, tileRelatedProductsCurtainVO.miniCloseSwipeEvent) && Intrinsics.d(this.miniCloseTapEvent, tileRelatedProductsCurtainVO.miniCloseTapEvent) && Intrinsics.d(this.openFullEvent, tileRelatedProductsCurtainVO.openFullEvent) && Intrinsics.d(this.closeFullEvent, tileRelatedProductsCurtainVO.closeFullEvent);
    }

    public final t getCloseFullEvent() {
        return this.closeFullEvent;
    }

    @NotNull
    public final String getCurtainDeeplink() {
        return this.curtainDeeplink;
    }

    public final t getMiniCloseSwipeEvent() {
        return this.miniCloseSwipeEvent;
    }

    public final t getMiniCloseTapEvent() {
        return this.miniCloseTapEvent;
    }

    public final t getOpenFullEvent() {
        return this.openFullEvent;
    }

    public final t getOpenTokenizedEvent() {
        return this.openTokenizedEvent;
    }

    public int hashCode() {
        int hashCode = this.curtainDeeplink.hashCode() * 31;
        t tVar = this.openTokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.miniCloseSwipeEvent;
        int hashCode3 = (hashCode2 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        t tVar3 = this.miniCloseTapEvent;
        int hashCode4 = (hashCode3 + (tVar3 == null ? 0 : tVar3.hashCode())) * 31;
        t tVar4 = this.openFullEvent;
        int hashCode5 = (hashCode4 + (tVar4 == null ? 0 : tVar4.hashCode())) * 31;
        t tVar5 = this.closeFullEvent;
        return hashCode5 + (tVar5 != null ? tVar5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TileRelatedProductsCurtainVO(curtainDeeplink=" + this.curtainDeeplink + ", openTokenizedEvent=" + this.openTokenizedEvent + ", miniCloseSwipeEvent=" + this.miniCloseSwipeEvent + ", miniCloseTapEvent=" + this.miniCloseTapEvent + ", openFullEvent=" + this.openFullEvent + ", closeFullEvent=" + this.closeFullEvent + ")";
    }
}
