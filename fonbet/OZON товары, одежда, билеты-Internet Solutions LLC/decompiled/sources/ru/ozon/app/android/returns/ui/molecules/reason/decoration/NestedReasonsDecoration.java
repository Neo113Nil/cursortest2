package ru.ozon.app.android.returns.ui.molecules.reason.decoration;

import Nh.a;
import Sc.o;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.reason.NestedReasonsAdapter;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.ReasonRow;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\b*\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0013\u001a\u00020\b*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0015\u001a\u00020\b*\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/reason/decoration/NestedReasonsDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "marginTop", "marginStart", "<init>", "(II)V", "Landroid/graphics/Rect;", "", "setInputPaddings", "(Landroid/graphics/Rect;)V", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow$CellRow;", "currentVO", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "nextVO", "position", "setCellPaddings", "(Landroid/graphics/Rect;Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow$CellRow;Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;I)V", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow$PickedImagesRow;", "setPickedImagesPaddings", "(Landroid/graphics/Rect;Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow$PickedImagesRow;Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;I)V", "setDefaultMargins", "(Landroid/graphics/Rect;Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;I)V", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "I", "Companion", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NestedReasonsDecoration extends RecyclerView.n {
    private final int marginStart;
    private final int marginTop;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int BETWEEN_SPACING = ResourceExtKt.toPx(8);
    private static final int MARGIN = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/reason/decoration/NestedReasonsDecoration$Companion;", "", "<init>", "()V", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ NestedReasonsDecoration(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? MARGIN : i11, (i13 & 2) != 0 ? MARGIN : i12);
    }

    private final void setCellPaddings(Rect rect, ReasonRow.CellRow cellRow, ReasonRow reasonRow, int i11) {
        CellDTO.Settings settings = cellRow.getCell().getSettings();
        if ((settings != null ? settings.getBackgroundColor() : null) == null) {
            return;
        }
        setDefaultMargins(rect, cellRow, reasonRow, i11);
    }

    private final void setDefaultMargins(Rect rect, ReasonRow reasonRow, ReasonRow reasonRow2, int i11) {
        if (i11 == 0) {
            rect.top = this.marginTop;
        }
        rect.left = this.marginStart;
        int i12 = MARGIN;
        rect.right = i12;
        if (reasonRow2 == null) {
            rect.bottom = i12;
        } else {
            rect.bottom = (reasonRow.getClass().equals(reasonRow2.getClass()) || (reasonRow2 instanceof ReasonRow.InputRow)) ? 0 : BETWEEN_SPACING;
        }
    }

    private final void setInputPaddings(Rect rect) {
        rect.top = 0;
        rect.left = this.marginStart;
        rect.right = MARGIN;
        rect.bottom = BETWEEN_SPACING;
    }

    private final void setPickedImagesPaddings(Rect rect, ReasonRow.PickedImagesRow pickedImagesRow, ReasonRow reasonRow, int i11) {
        setDefaultMargins(rect, pickedImagesRow, reasonRow, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        ReasonRow itemVO;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        int a11 = a.a(parent, "parent", state, "state", view);
        if (a11 == -1) {
            return;
        }
        RecyclerView.g adapter = parent.getAdapter();
        NestedReasonsAdapter nestedReasonsAdapter = adapter instanceof NestedReasonsAdapter ? (NestedReasonsAdapter) adapter : null;
        if (nestedReasonsAdapter == null || (itemVO = nestedReasonsAdapter.getItemVO(a11)) == null) {
            return;
        }
        ReasonRow itemVO2 = nestedReasonsAdapter.getItemVO(a11 + 1);
        if (itemVO instanceof ReasonRow.InputRow) {
            setInputPaddings(outRect);
        } else if (itemVO instanceof ReasonRow.CellRow) {
            setCellPaddings(outRect, (ReasonRow.CellRow) itemVO, itemVO2, a11);
        } else {
            if (!(itemVO instanceof ReasonRow.PickedImagesRow)) {
                throw new o();
            }
            setPickedImagesPaddings(outRect, (ReasonRow.PickedImagesRow) itemVO, itemVO2, a11);
        }
    }

    public NestedReasonsDecoration(int i11, int i12) {
        this.marginTop = i11;
        this.marginStart = i12;
    }
}
