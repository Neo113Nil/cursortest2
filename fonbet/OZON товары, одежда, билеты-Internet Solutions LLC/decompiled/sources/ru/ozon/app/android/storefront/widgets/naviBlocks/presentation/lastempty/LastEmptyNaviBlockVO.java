package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.lastempty;

import G.g;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.NaviBlockPositionVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.RoundedCornerVO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/lastempty/LastEmptyNaviBlockVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/RoundedCornerVO;", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "position", "<init>", "(JLjava/util/List;Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getRoundedCorners", "()Ljava/util/List;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "getPosition", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LastEmptyNaviBlockVO implements c {
    private final long id;

    @NotNull
    private final NaviBlockPositionVO position;

    @NotNull
    private final List<RoundedCornerVO> roundedCorners;

    /* JADX WARN: Multi-variable type inference failed */
    public LastEmptyNaviBlockVO(long j11, @NotNull List<? extends RoundedCornerVO> roundedCorners, @NotNull NaviBlockPositionVO position) {
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(position, "position");
        this.id = j11;
        this.roundedCorners = roundedCorners;
        this.position = position;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastEmptyNaviBlockVO)) {
            return false;
        }
        LastEmptyNaviBlockVO lastEmptyNaviBlockVO = (LastEmptyNaviBlockVO) other;
        return this.id == lastEmptyNaviBlockVO.id && Intrinsics.d(this.roundedCorners, lastEmptyNaviBlockVO.roundedCorners) && this.position == lastEmptyNaviBlockVO.position;
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
        return this.position.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.roundedCorners);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<RoundedCornerVO> list = this.roundedCorners;
        NaviBlockPositionVO naviBlockPositionVO = this.position;
        StringBuilder b11 = b.b(j11, "LastEmptyNaviBlockVO(id=", ", roundedCorners=", list);
        b11.append(", position=");
        b11.append(naviBlockPositionVO);
        b11.append(")");
        return b11.toString();
    }
}
