package ru.ozon.app.android.travel.molecules.view.rowLinearLayout;

import B0.A0;
import Sc.C4005g;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.IndexedValue;
import kotlin.collections.O;
import kotlin.collections.P;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.rowLinearLayout.RowLinearLayout;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J(\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007*\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\tH\u0002J$\u0010\u0010\u001a\u00020\u0011*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J$\u0010\u0014\u001a\u00020\u0011*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J$\u0010\u0016\u001a\u00020\u0011*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearMeasureManager;", "", "<init>", "()V", "maxRowIndex", "", "measure", "Lkotlin/Pair;", "parent", "Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearLayout;", "widthMeasureSpec", "heightMeasureSpec", "measureRows", "buildRowsMap", "", "Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearLayout$RowInfo;", "measureRow", "", "rowInfo", "availableWidthForRows", "measureNonWeightedChildren", "availableWidth", "distributeRemainingToWeightedChildren", "computeRowDimensions", "throwIllegalLayoutParams", "", "layoutParams", "Landroid/view/ViewGroup$LayoutParams;", "Companion", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RowLinearMeasureManager {
    private int maxRowIndex = -1;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearMeasureManager$Companion;", "", "<init>", "()V", "UNSPECIFIED_AVAILABLE_WIDTH", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final Map<Integer, RowLinearLayout.RowInfo> buildRowsMap(RowLinearLayout rowLinearLayout) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.maxRowIndex = -1;
        int childCount = rowLinearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = rowLinearLayout.getChildAt(i11);
            Intrinsics.f(childAt);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                RowLinearLayout.LayoutParams layoutParams2 = layoutParams instanceof RowLinearLayout.LayoutParams ? (RowLinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 == null) {
                    throwIllegalLayoutParams(childAt.getLayoutParams());
                    throw new C4005g();
                }
                int row = layoutParams2.getRow();
                if (row < 0) {
                    throw new IllegalStateException("LayoutParams.row must be >= 0");
                }
                Integer valueOf = Integer.valueOf(row);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    RowLinearLayout.RowInfo rowInfo = new RowLinearLayout.RowInfo(null, 0, 0, 7, null);
                    linkedHashMap.put(valueOf, rowInfo);
                    obj = rowInfo;
                }
                ((RowLinearLayout.RowInfo) obj).getChildren().add(childAt);
                if (row > this.maxRowIndex) {
                    this.maxRowIndex = row;
                }
            }
        }
        return linkedHashMap;
    }

    private final void computeRowDimensions(RowLinearLayout.RowInfo rowInfo) {
        int i11 = 0;
        int i12 = 0;
        for (View view : rowInfo.getChildren()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.view.rowLinearLayout.RowLinearLayout.LayoutParams");
            RowLinearLayout.LayoutParams layoutParams2 = (RowLinearLayout.LayoutParams) layoutParams;
            i11 += view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
            int measuredHeight = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            if (measuredHeight > i12) {
                i12 = measuredHeight;
            }
        }
        rowInfo.setRowWidth(i11);
        rowInfo.setRowHeight(i12);
    }

    private final void distributeRemainingToWeightedChildren(RowLinearLayout rowLinearLayout, RowLinearLayout.RowInfo rowInfo, int i11, int i12) {
        int round;
        int i13 = 0;
        float f7 = 0.0f;
        for (View view : rowInfo.getChildren()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.view.rowLinearLayout.RowLinearLayout.LayoutParams");
            RowLinearLayout.LayoutParams layoutParams2 = (RowLinearLayout.LayoutParams) layoutParams;
            i13 += view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
            if (layoutParams2.getWeight() > 0.0f && ((ViewGroup.MarginLayoutParams) layoutParams2).width == 0) {
                f7 += layoutParams2.getWeight();
            }
        }
        int i14 = i11 - i13;
        if (i14 < 0) {
            i14 = 0;
        }
        if (f7 <= 0.0f || i14 <= 0) {
            return;
        }
        O a12 = C7714v.a1(rowInfo.getChildren());
        ArrayList arrayList = new ArrayList();
        Iterator it = a12.iterator();
        while (true) {
            P p11 = (P) it;
            if (!p11.hasNext()) {
                break;
            }
            Object next = p11.next();
            ViewGroup.LayoutParams layoutParams3 = ((View) ((IndexedValue) next).b()).getLayoutParams();
            Intrinsics.g(layoutParams3, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.view.rowLinearLayout.RowLinearLayout.LayoutParams");
            RowLinearLayout.LayoutParams layoutParams4 = (RowLinearLayout.LayoutParams) layoutParams3;
            if (layoutParams4.getWeight() > 0.0f && ((ViewGroup.MarginLayoutParams) layoutParams4).width == 0) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        int i15 = 0;
        int i16 = 0;
        while (it2.hasNext()) {
            int i17 = i15 + 1;
            View view2 = (View) ((IndexedValue) it2.next()).d();
            ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
            Intrinsics.g(layoutParams5, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.view.rowLinearLayout.RowLinearLayout.LayoutParams");
            RowLinearLayout.LayoutParams layoutParams6 = (RowLinearLayout.LayoutParams) layoutParams5;
            if (i15 == C7714v.P(arrayList)) {
                round = i14 - i16;
                if (round >= 0) {
                    i16 += round;
                    view2.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), ViewGroup.getChildMeasureSpec(i12, rowLinearLayout.getPaddingBottom() + rowLinearLayout.getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).height));
                    i15 = i17;
                }
                round = 0;
                i16 += round;
                view2.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), ViewGroup.getChildMeasureSpec(i12, rowLinearLayout.getPaddingBottom() + rowLinearLayout.getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).height));
                i15 = i17;
            } else {
                round = Math.round((layoutParams6.getWeight() / f7) * i14);
                if (round >= 0) {
                    i16 += round;
                    view2.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), ViewGroup.getChildMeasureSpec(i12, rowLinearLayout.getPaddingBottom() + rowLinearLayout.getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).height));
                    i15 = i17;
                }
                round = 0;
                i16 += round;
                view2.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), ViewGroup.getChildMeasureSpec(i12, rowLinearLayout.getPaddingBottom() + rowLinearLayout.getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).height));
                i15 = i17;
            }
        }
    }

    private final void measureNonWeightedChildren(RowLinearLayout rowLinearLayout, RowLinearLayout.RowInfo rowInfo, int i11, int i12) {
        int makeMeasureSpec;
        int paddingBottom = rowLinearLayout.getPaddingBottom() + rowLinearLayout.getPaddingTop();
        for (View view : rowInfo.getChildren()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.view.rowLinearLayout.RowLinearLayout.LayoutParams");
            RowLinearLayout.LayoutParams layoutParams2 = (RowLinearLayout.LayoutParams) layoutParams;
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + paddingBottom + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).height);
            if (layoutParams2.getWeight() <= 0.0f || ((ViewGroup.MarginLayoutParams) layoutParams2).width != 0) {
                int i13 = ((ViewGroup.MarginLayoutParams) layoutParams2).width;
                if (i13 == -2) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 >= 0 ? i11 : 0, LinearLayoutManager.INVALID_OFFSET);
                } else if (i13 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else if (i11 == 536870911) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                } else {
                    int i14 = i11 - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 >= 0 ? i14 : 0, 1073741824);
                }
                view.measure(makeMeasureSpec, childMeasureSpec);
            } else {
                view.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), childMeasureSpec);
            }
        }
    }

    private final void measureRow(RowLinearLayout rowLinearLayout, RowLinearLayout.RowInfo rowInfo, int i11, int i12) {
        measureNonWeightedChildren(rowLinearLayout, rowInfo, i11, i12);
        distributeRemainingToWeightedChildren(rowLinearLayout, rowInfo, i11, i12);
        computeRowDimensions(rowInfo);
    }

    private final Pair<Integer, Integer> measureRows(RowLinearLayout rowLinearLayout, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i12;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i18);
        int size2 = View.MeasureSpec.getSize(i18);
        int paddingRight = rowLinearLayout.getPaddingRight() + rowLinearLayout.getPaddingLeft();
        int paddingBottom = rowLinearLayout.getPaddingBottom() + rowLinearLayout.getPaddingTop();
        if (rowLinearLayout.getChildCount() == 0) {
            return new Pair<>(Integer.valueOf(View.resolveSizeAndState(paddingRight, i11, 0)), Integer.valueOf(View.resolveSizeAndState(paddingBottom, i18, 0)));
        }
        Map<Integer, RowLinearLayout.RowInfo> buildRowsMap = buildRowsMap(rowLinearLayout);
        if (mode == 0) {
            i13 = 536870911;
        } else {
            i13 = size - paddingRight;
            if (i13 < 0) {
                i13 = 0;
            }
        }
        int i19 = this.maxRowIndex;
        if (i19 >= 0) {
            int i21 = 0;
            i15 = 0;
            i16 = 0;
            int i22 = 0;
            while (true) {
                RowLinearLayout.RowInfo rowInfo = buildRowsMap.get(Integer.valueOf(i21));
                if (rowInfo != null) {
                    measureRow(rowLinearLayout, rowInfo, i13, i18);
                    i15 = Math.max(i15, rowInfo.getRowWidth());
                    i16 += rowInfo.getRowHeight();
                    i22++;
                }
                if (i21 == i19) {
                    break;
                }
                i21++;
                i18 = i12;
            }
            i14 = i22;
        } else {
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (i14 > 1) {
            i17 = rowLinearLayout.getRowSpacing() * (i14 - 1);
        } else {
            i17 = 0;
        }
        int i23 = i16 + i17 + paddingBottom;
        if (mode == Integer.MIN_VALUE) {
            int i24 = paddingRight + i15;
            if (i24 <= size) {
                size = i24;
            }
        } else if (mode != 1073741824) {
            size = paddingRight + i15;
        }
        if (mode2 == Integer.MIN_VALUE ? i23 <= size2 : mode2 != 1073741824) {
            size2 = i23;
        }
        rowLinearLayout.setMeasuredRows$molecules_prodGoogleAllVendorsRelease(buildRowsMap);
        rowLinearLayout.setMeasuredRowsMaxIndex$molecules_prodGoogleAllVendorsRelease(this.maxRowIndex);
        return new Pair<>(Integer.valueOf(size), Integer.valueOf(size2));
    }

    private final Void throwIllegalLayoutParams(ViewGroup.LayoutParams layoutParams) {
        throw new IllegalStateException(A0.b("Nested children must use RowLinearLayout.LayoutParams. Found: ", layoutParams != null ? layoutParams.getClass().getSimpleName() : null, ". Ensure child views are configured with the correct layout parameters.").toString());
    }

    @NotNull
    public final Pair<Integer, Integer> measure(@NotNull RowLinearLayout parent, int widthMeasureSpec, int heightMeasureSpec) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return measureRows(parent, widthMeasureSpec, heightMeasureSpec);
    }
}
