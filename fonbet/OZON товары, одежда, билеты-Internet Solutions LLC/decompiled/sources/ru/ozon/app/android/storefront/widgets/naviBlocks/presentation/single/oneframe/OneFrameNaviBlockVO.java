package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.oneframe;

import G.g;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.NaviBlockPositionVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.RoundedCornerVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/oneframe/OneFrameNaviBlockVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/RoundedCornerVO;", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "position", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameVO;", "frame", "<init>", "(JLjava/util/List;Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getRoundedCorners", "()Ljava/util/List;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "getPosition", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameVO;", "getFrame", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameVO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OneFrameNaviBlockVO implements c {

    @NotNull
    private final FrameVO frame;
    private final long id;

    @NotNull
    private final NaviBlockPositionVO position;

    @NotNull
    private final List<RoundedCornerVO> roundedCorners;

    /* JADX WARN: Multi-variable type inference failed */
    public OneFrameNaviBlockVO(long j11, @NotNull List<? extends RoundedCornerVO> roundedCorners, @NotNull NaviBlockPositionVO position, @NotNull FrameVO frame) {
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(frame, "frame");
        this.id = j11;
        this.roundedCorners = roundedCorners;
        this.position = position;
        this.frame = frame;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneFrameNaviBlockVO)) {
            return false;
        }
        OneFrameNaviBlockVO oneFrameNaviBlockVO = (OneFrameNaviBlockVO) other;
        return this.id == oneFrameNaviBlockVO.id && Intrinsics.d(this.roundedCorners, oneFrameNaviBlockVO.roundedCorners) && this.position == oneFrameNaviBlockVO.position && Intrinsics.d(this.frame, oneFrameNaviBlockVO.frame);
    }

    @NotNull
    public final FrameVO getFrame() {
        return this.frame;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final NaviBlockPositionVO getPosition() {
        return this.position;
    }

    @NotNull
    public final List<RoundedCornerVO> getRoundedCorners() {
        return this.roundedCorners;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.frame.hashCode() + ((this.position.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.roundedCorners)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<RoundedCornerVO> list = this.roundedCorners;
        NaviBlockPositionVO naviBlockPositionVO = this.position;
        FrameVO frameVO = this.frame;
        StringBuilder b11 = b.b(j11, "OneFrameNaviBlockVO(id=", ", roundedCorners=", list);
        b11.append(", position=");
        b11.append(naviBlockPositionVO);
        b11.append(", frame=");
        b11.append(frameVO);
        b11.append(")");
        return b11.toString();
    }
}
