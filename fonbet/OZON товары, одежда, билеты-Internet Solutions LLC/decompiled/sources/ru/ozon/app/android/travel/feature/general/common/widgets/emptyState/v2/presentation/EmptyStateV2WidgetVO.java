package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation;

import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.emptyState.v2.EmptyStateV2VO;
import ru.ozon.app.android.travel.molecules.view.quickFiltersRowList.QuickFiltersRowListVO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b\u000b\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010\u0011¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/presentation/EmptyStateV2WidgetVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;", "emptyState", "Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListVO;", "filtersBlock", "", "scaleToViewPortHeight", "isButtonsAtBottom", "", "backgroundColor", "<init>", "(JLru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListVO;ZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;", "getEmptyState", "()Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;", "Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListVO;", "getFiltersBlock", "()Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListVO;", "Z", "getScaleToViewPortHeight", "()Z", "Ljava/lang/String;", "getBackgroundColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EmptyStateV2WidgetVO implements c {
    public static final int $stable = QuickFiltersRowListVO.$stable | EmptyStateV2VO.$stable;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final EmptyStateV2VO emptyState;
    private final QuickFiltersRowListVO filtersBlock;
    private final long id;
    private final boolean isButtonsAtBottom;
    private final boolean scaleToViewPortHeight;

    public EmptyStateV2WidgetVO(long j11, @NotNull EmptyStateV2VO emptyState, QuickFiltersRowListVO quickFiltersRowListVO, boolean z11, boolean z12, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.emptyState = emptyState;
        this.filtersBlock = quickFiltersRowListVO;
        this.scaleToViewPortHeight = z11;
        this.isButtonsAtBottom = z12;
        this.backgroundColor = backgroundColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateV2WidgetVO)) {
            return false;
        }
        EmptyStateV2WidgetVO emptyStateV2WidgetVO = (EmptyStateV2WidgetVO) other;
        return this.id == emptyStateV2WidgetVO.id && Intrinsics.d(this.emptyState, emptyStateV2WidgetVO.emptyState) && Intrinsics.d(this.filtersBlock, emptyStateV2WidgetVO.filtersBlock) && this.scaleToViewPortHeight == emptyStateV2WidgetVO.scaleToViewPortHeight && this.isButtonsAtBottom == emptyStateV2WidgetVO.isButtonsAtBottom && Intrinsics.d(this.backgroundColor, emptyStateV2WidgetVO.backgroundColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final EmptyStateV2VO getEmptyState() {
        return this.emptyState;
    }

    public final QuickFiltersRowListVO getFiltersBlock() {
        return this.filtersBlock;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final boolean getScaleToViewPortHeight() {
        return this.scaleToViewPortHeight;
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
        int hashCode = (this.emptyState.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        QuickFiltersRowListVO quickFiltersRowListVO = this.filtersBlock;
        return this.backgroundColor.hashCode() + C3532b.a(C3532b.a((hashCode + (quickFiltersRowListVO == null ? 0 : quickFiltersRowListVO.hashCode())) * 31, 31, this.scaleToViewPortHeight), 31, this.isButtonsAtBottom);
    }

    /* renamed from: isButtonsAtBottom, reason: from getter */
    public final boolean getIsButtonsAtBottom() {
        return this.isButtonsAtBottom;
    }

    @NotNull
    public String toString() {
        return "EmptyStateV2WidgetVO(id=" + this.id + ", emptyState=" + this.emptyState + ", filtersBlock=" + this.filtersBlock + ", scaleToViewPortHeight=" + this.scaleToViewPortHeight + ", isButtonsAtBottom=" + this.isButtonsAtBottom + ", backgroundColor=" + this.backgroundColor + ")";
    }
}
