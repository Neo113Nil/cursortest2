package ru.ozon.app.android.storefront.widgets.naviBlocksV5.presentation;

import Ak.C2436a;
import Lh.a;
import Pk0.b;
import WZ.t;
import Z1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniColorToken;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b*\u0010)R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/NaviBlocksV5VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "LZ1/h;", "horizontalMargin", "blockMargin", "Lru/ozon/uni/core/models/UniColorToken;", "backgroundColor", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/BlockV5VO;", "leftBlock", "rightBlock", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JFFLru/ozon/uni/core/models/UniColorToken;Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/BlockV5VO;Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/BlockV5VO;LWZ/t;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "F", "getHorizontalMargin-D9Ej5fM", "()F", "getBlockMargin-D9Ej5fM", "Lru/ozon/uni/core/models/UniColorToken;", "getBackgroundColor", "()Lru/ozon/uni/core/models/UniColorToken;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/BlockV5VO;", "getLeftBlock", "()Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/BlockV5VO;", "getRightBlock", "LWZ/t;", "getViewEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NaviBlocksV5VO implements c {

    @NotNull
    private final UniColorToken backgroundColor;
    private final float blockMargin;
    private final float horizontalMargin;
    private final long id;

    @NotNull
    private final BlockV5VO leftBlock;

    @NotNull
    private final BlockV5VO rightBlock;
    private final t viewEvent;

    public /* synthetic */ NaviBlocksV5VO(long j11, float f7, float f11, UniColorToken uniColorToken, BlockV5VO blockV5VO, BlockV5VO blockV5VO2, t tVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, f7, f11, uniColorToken, blockV5VO, blockV5VO2, tVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NaviBlocksV5VO)) {
            return false;
        }
        NaviBlocksV5VO naviBlocksV5VO = (NaviBlocksV5VO) other;
        return this.id == naviBlocksV5VO.id && h.b(this.horizontalMargin, naviBlocksV5VO.horizontalMargin) && h.b(this.blockMargin, naviBlocksV5VO.blockMargin) && Intrinsics.d(this.backgroundColor, naviBlocksV5VO.backgroundColor) && Intrinsics.d(this.leftBlock, naviBlocksV5VO.leftBlock) && Intrinsics.d(this.rightBlock, naviBlocksV5VO.rightBlock) && Intrinsics.d(this.viewEvent, naviBlocksV5VO.viewEvent);
    }

    @NotNull
    public final UniColorToken getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getBlockMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBlockMargin() {
        return this.blockMargin;
    }

    /* renamed from: getHorizontalMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHorizontalMargin() {
        return this.horizontalMargin;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final BlockV5VO getLeftBlock() {
        return this.leftBlock;
    }

    @NotNull
    public final BlockV5VO getRightBlock() {
        return this.rightBlock;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.rightBlock.hashCode() + ((this.leftBlock.hashCode() + ((this.backgroundColor.hashCode() + b.a(this.blockMargin, b.a(this.horizontalMargin, Long.hashCode(this.id) * 31, 31), 31)) * 31)) * 31)) * 31;
        t tVar = this.viewEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String c11 = h.c(this.horizontalMargin);
        String c12 = h.c(this.blockMargin);
        UniColorToken uniColorToken = this.backgroundColor;
        BlockV5VO blockV5VO = this.leftBlock;
        BlockV5VO blockV5VO2 = this.rightBlock;
        t tVar = this.viewEvent;
        StringBuilder c13 = C2436a.c(j11, "NaviBlocksV5VO(id=", ", horizontalMargin=", c11);
        c13.append(", blockMargin=");
        c13.append(c12);
        c13.append(", backgroundColor=");
        c13.append(uniColorToken);
        c13.append(", leftBlock=");
        c13.append(blockV5VO);
        c13.append(", rightBlock=");
        c13.append(blockV5VO2);
        return a.b(c13, ", viewEvent=", tVar, ")");
    }

    private NaviBlocksV5VO(long j11, float f7, float f11, UniColorToken backgroundColor, BlockV5VO leftBlock, BlockV5VO rightBlock, t tVar) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(leftBlock, "leftBlock");
        Intrinsics.checkNotNullParameter(rightBlock, "rightBlock");
        this.id = j11;
        this.horizontalMargin = f7;
        this.blockMargin = f11;
        this.backgroundColor = backgroundColor;
        this.leftBlock = leftBlock;
        this.rightBlock = rightBlock;
        this.viewEvent = tVar;
    }
}
