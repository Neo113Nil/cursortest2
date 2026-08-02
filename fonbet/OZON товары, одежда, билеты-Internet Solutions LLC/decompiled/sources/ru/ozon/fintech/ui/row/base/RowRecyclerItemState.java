package ru.ozon.fintech.ui.row.base;

import C.D;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.common.MidDecorator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u0006\u0010\u001a\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/ui/row/base/RowRecyclerItemState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "recyclerItemId", "", "spacingInternal", "", "leftOffsetInternal", "rightOffsetInternal", "topOffsetInternal", "bottomOffsetInternal", "midOrientation", "Lru/ozon/fintech/ui/common/MidDecorator$ORIENTATION;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/fintech/ui/common/MidDecorator$ORIENTATION;)V", "getRecyclerItemId", "()Ljava/lang/String;", "getSpacingInternal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLeftOffsetInternal", "getRightOffsetInternal", "getTopOffsetInternal", "getBottomOffsetInternal", "getMidOrientation", "()Lru/ozon/fintech/ui/common/MidDecorator$ORIENTATION;", "provideId", "toMidDecorator", "Lru/ozon/fintech/ui/common/MidDecorator;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RowRecyclerItemState implements RecyclerItem {
    private final Integer bottomOffsetInternal;
    private final Integer leftOffsetInternal;

    @NotNull
    private final MidDecorator.ORIENTATION midOrientation;

    @NotNull
    private final String recyclerItemId;
    private final Integer rightOffsetInternal;
    private final Integer spacingInternal;
    private final Integer topOffsetInternal;

    public RowRecyclerItemState(@NotNull String recyclerItemId, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, @NotNull MidDecorator.ORIENTATION midOrientation) {
        Intrinsics.checkNotNullParameter(recyclerItemId, "recyclerItemId");
        Intrinsics.checkNotNullParameter(midOrientation, "midOrientation");
        this.recyclerItemId = recyclerItemId;
        this.spacingInternal = num;
        this.leftOffsetInternal = num2;
        this.rightOffsetInternal = num3;
        this.topOffsetInternal = num4;
        this.bottomOffsetInternal = num5;
        this.midOrientation = midOrientation;
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    public final Integer getBottomOffsetInternal() {
        return this.bottomOffsetInternal;
    }

    public final Integer getLeftOffsetInternal() {
        return this.leftOffsetInternal;
    }

    @NotNull
    public final MidDecorator.ORIENTATION getMidOrientation() {
        return this.midOrientation;
    }

    @NotNull
    public final String getRecyclerItemId() {
        return this.recyclerItemId;
    }

    public final Integer getRightOffsetInternal() {
        return this.rightOffsetInternal;
    }

    public final Integer getSpacingInternal() {
        return this.spacingInternal;
    }

    public final Integer getTopOffsetInternal() {
        return this.topOffsetInternal;
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.recyclerItemId;
    }

    @NotNull
    public final MidDecorator toMidDecorator() {
        Integer num = this.spacingInternal;
        int d11 = D.d(num != null ? num.intValue() : 0);
        Integer num2 = this.leftOffsetInternal;
        int d12 = D.d(num2 != null ? num2.intValue() : 0);
        Integer num3 = this.rightOffsetInternal;
        int d13 = D.d(num3 != null ? num3.intValue() : 0);
        Integer num4 = this.topOffsetInternal;
        int d14 = D.d(num4 != null ? num4.intValue() : 0);
        Integer num5 = this.bottomOffsetInternal;
        return new MidDecorator(d11, d12, d13, d14, D.d(num5 != null ? num5.intValue() : 0), this.midOrientation);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
