package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carousel;

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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carousel/CarouselNaviBlockVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/RoundedCornerVO;", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "position", "frameDuration", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameVO;", "frames", "<init>", "(JLjava/util/List;Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getRoundedCorners", "()Ljava/util/List;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "getPosition", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "getFrameDuration", "getFrames", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CarouselNaviBlockVO implements c {
    private final long frameDuration;

    @NotNull
    private final List<FrameVO> frames;
    private final long id;

    @NotNull
    private final NaviBlockPositionVO position;

    @NotNull
    private final List<RoundedCornerVO> roundedCorners;

    /* JADX WARN: Multi-variable type inference failed */
    public CarouselNaviBlockVO(long j11, @NotNull List<? extends RoundedCornerVO> roundedCorners, @NotNull NaviBlockPositionVO position, long j12, @NotNull List<FrameVO> frames) {
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(frames, "frames");
        this.id = j11;
        this.roundedCorners = roundedCorners;
        this.position = position;
        this.frameDuration = j12;
        this.frames = frames;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselNaviBlockVO)) {
            return false;
        }
        CarouselNaviBlockVO carouselNaviBlockVO = (CarouselNaviBlockVO) other;
        return this.id == carouselNaviBlockVO.id && Intrinsics.d(this.roundedCorners, carouselNaviBlockVO.roundedCorners) && this.position == carouselNaviBlockVO.position && this.frameDuration == carouselNaviBlockVO.frameDuration && Intrinsics.d(this.frames, carouselNaviBlockVO.frames);
    }

    public final long getFrameDuration() {
        return this.frameDuration;
    }

    @NotNull
    public final List<FrameVO> getFrames() {
        return this.frames;
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
        return this.frames.hashCode() + Pk0.c.a((this.position.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.roundedCorners)) * 31, 31, this.frameDuration);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<RoundedCornerVO> list = this.roundedCorners;
        NaviBlockPositionVO naviBlockPositionVO = this.position;
        long j12 = this.frameDuration;
        List<FrameVO> list2 = this.frames;
        StringBuilder b11 = b.b(j11, "CarouselNaviBlockVO(id=", ", roundedCorners=", list);
        b11.append(", position=");
        b11.append(naviBlockPositionVO);
        b11.append(", frameDuration=");
        b11.append(j12);
        b11.append(", frames=");
        b11.append(list2);
        b11.append(")");
        return b11.toString();
    }
}
