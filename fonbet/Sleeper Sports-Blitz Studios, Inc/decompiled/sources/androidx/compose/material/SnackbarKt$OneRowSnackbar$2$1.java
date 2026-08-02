package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Snackbar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SnackbarKt$OneRowSnackbar$2$1 implements MeasurePolicy {
    final /* synthetic */ String $actionTag;
    final /* synthetic */ String $textTag;

    SnackbarKt$OneRowSnackbar$2$1(String str, String str2) {
        this.$actionTag = str;
        this.$textTag = str2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo367measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        float f;
        float f2;
        int i;
        float f3;
        int max;
        float f4;
        MeasureScope measureScope2 = measureScope;
        String str = this.$actionTag;
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Measurable measurable = list.get(i3);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), str)) {
                long j2 = j;
                final Placeable mo7457measureBRTryo0 = measurable.mo7457measureBRTryo0(j2);
                int m8751getMaxWidthimpl = Constraints.m8751getMaxWidthimpl(j2) - mo7457measureBRTryo0.getWidth();
                f = SnackbarKt.TextEndExtraSpacing;
                int coerceAtLeast = RangesKt.coerceAtLeast(m8751getMaxWidthimpl - measureScope2.mo738roundToPx0680j_4(f), Constraints.m8753getMinWidthimpl(j2));
                String str2 = this.$textTag;
                int size2 = list2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Measurable measurable2 = list.get(i4);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), str2)) {
                        final Placeable mo7457measureBRTryo02 = measurable2.mo7457measureBRTryo0(Constraints.m8741copyZbe2FdA$default(j2, 0, coerceAtLeast, 0, 0, 9, null));
                        int i5 = mo7457measureBRTryo02.get(AlignmentLineKt.getFirstBaseline());
                        int i6 = mo7457measureBRTryo02.get(AlignmentLineKt.getLastBaseline());
                        boolean z = true;
                        boolean z2 = (i5 == Integer.MIN_VALUE || i6 == Integer.MIN_VALUE) ? false : true;
                        if (i5 != i6 && z2) {
                            z = false;
                        }
                        final int m8751getMaxWidthimpl2 = Constraints.m8751getMaxWidthimpl(j) - mo7457measureBRTryo0.getWidth();
                        if (z) {
                            f4 = SnackbarKt.SnackbarMinHeightOneLine;
                            max = Math.max(measureScope2.mo738roundToPx0680j_4(f4), mo7457measureBRTryo0.getHeight());
                            i = (max - mo7457measureBRTryo02.getHeight()) / 2;
                            int i7 = mo7457measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                            if (i7 != Integer.MIN_VALUE) {
                                i2 = (i5 + i) - i7;
                            }
                        } else {
                            f2 = SnackbarKt.HeightToFirstLine;
                            i = measureScope2.mo738roundToPx0680j_4(f2) - i5;
                            f3 = SnackbarKt.SnackbarMinHeightTwoLines;
                            max = Math.max(measureScope2.mo738roundToPx0680j_4(f3), mo7457measureBRTryo02.getHeight() + i);
                            i2 = (max - mo7457measureBRTryo0.getHeight()) / 2;
                        }
                        final int i8 = i2;
                        final int i9 = i;
                        return MeasureScope.layout$default(measureScope2, Constraints.m8751getMaxWidthimpl(j), max, null, new Function1() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit measure_3p2s80s$lambda$3;
                                measure_3p2s80s$lambda$3 = SnackbarKt$OneRowSnackbar$2$1.measure_3p2s80s$lambda$3(Placeable.this, i9, mo7457measureBRTryo0, m8751getMaxWidthimpl2, i8, (Placeable.PlacementScope) obj);
                                return measure_3p2s80s$lambda$3;
                            }
                        }, 4, null);
                    }
                    i4++;
                    measureScope2 = measureScope;
                    j2 = j;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i3++;
            measureScope2 = measureScope;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$3(Placeable placeable, int i, Placeable placeable2, int i2, int i3, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2, i3, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
