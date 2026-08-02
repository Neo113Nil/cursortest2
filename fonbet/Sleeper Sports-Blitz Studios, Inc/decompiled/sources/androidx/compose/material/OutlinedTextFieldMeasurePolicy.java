package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.internal.LayoutUtilKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\u0019*\u00020\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00122\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\"\u0010\u001d\u001a\u00020\u0019*\u00020\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00122\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\"\u0010\u001e\u001a\u00020\u0019*\u00020\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00122\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\"\u0010 \u001a\u00020\u0019*\u00020\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00122\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J<\u0010!\u001a\u00020\u0019*\u00020\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00122\u0006\u0010\u001f\u001a\u00020\u00192\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190#H\u0002J<\u0010$\u001a\u00020\u0019*\u00020\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00122\u0006\u0010\u001c\u001a\u00020\u00192\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190#H\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "onLabelMeasured", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "<init>", "(Lkotlin/jvm/functions/Function1;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "height", "minIntrinsicWidth", "intrinsicWidth", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final Function1<Size, Unit> onLabelMeasured;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldMeasurePolicy(Function1<? super Size, Unit> function1, boolean z, float f, PaddingValues paddingValues) {
        this.onLabelMeasured = function1;
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo367measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Measurable measurable;
        Measurable measurable2;
        Measurable measurable3;
        long m5849getZeroNHjbRc;
        Measurable measurable4;
        int m2410calculateWidthO3s9Psw;
        int m2409calculateHeightO3s9Psw;
        final OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        MeasureScope measureScope2 = measureScope;
        int i = measureScope2.mo738roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.getBottom());
        long m8741copyZbe2FdA$default = Constraints.m8741copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i2);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Leading")) {
                break;
            }
            i2++;
        }
        Measurable measurable5 = measurable;
        Placeable mo7457measureBRTryo0 = measurable5 != null ? measurable5.mo7457measureBRTryo0(m8741copyZbe2FdA$default) : null;
        int widthOrZero = TextFieldImplKt.widthOrZero(mo7457measureBRTryo0);
        int size2 = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i3);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "Trailing")) {
                break;
            }
            i3++;
        }
        Measurable measurable6 = measurable2;
        Placeable mo7457measureBRTryo02 = measurable6 != null ? measurable6.mo7457measureBRTryo0(ConstraintsKt.m8771offsetNN6EwU$default(m8741copyZbe2FdA$default, -widthOrZero, 0, 2, null)) : null;
        int widthOrZero2 = widthOrZero + TextFieldImplKt.widthOrZero(mo7457measureBRTryo02);
        int i4 = measureScope2.mo738roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo1101calculateLeftPaddingu2uoSUM(measureScope2.getLayoutDirection())) + measureScope2.mo738roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo1102calculateRightPaddingu2uoSUM(measureScope2.getLayoutDirection()));
        int i5 = -widthOrZero2;
        int i6 = -i;
        long m8770offsetNN6EwU = ConstraintsKt.m8770offsetNN6EwU(m8741copyZbe2FdA$default, MathHelpersKt.lerp(i5 - i4, -i4, outlinedTextFieldMeasurePolicy.animationProgress), i6);
        int size3 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list.get(i7);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "Label")) {
                break;
            }
            i7++;
        }
        Measurable measurable7 = measurable3;
        final Placeable mo7457measureBRTryo03 = measurable7 != null ? measurable7.mo7457measureBRTryo0(m8770offsetNN6EwU) : null;
        if (mo7457measureBRTryo03 != null) {
            m5849getZeroNHjbRc = Size.m5831constructorimpl((Float.floatToRawIntBits(mo7457measureBRTryo03.getHeight()) & 4294967295L) | (Float.floatToRawIntBits(mo7457measureBRTryo03.getWidth()) << 32));
        } else {
            m5849getZeroNHjbRc = Size.INSTANCE.m5849getZeroNHjbRc();
        }
        outlinedTextFieldMeasurePolicy.onLabelMeasured.invoke(Size.m5828boximpl(m5849getZeroNHjbRc));
        long j2 = j;
        long m8741copyZbe2FdA$default2 = Constraints.m8741copyZbe2FdA$default(ConstraintsKt.m8770offsetNN6EwU(j2, i5, i6 - Math.max(TextFieldImplKt.heightOrZero(mo7457measureBRTryo03) / 2, measureScope2.mo738roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.getTop()))), 0, 0, 0, 0, 11, null);
        int size4 = list2.size();
        int i8 = 0;
        while (i8 < size4) {
            Measurable measurable8 = list.get(i8);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable8), "TextField")) {
                Placeable mo7457measureBRTryo04 = measurable8.mo7457measureBRTryo0(m8741copyZbe2FdA$default2);
                long m8741copyZbe2FdA$default3 = Constraints.m8741copyZbe2FdA$default(m8741copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                int size5 = list2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        measurable4 = null;
                        break;
                    }
                    measurable4 = list.get(i9);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "Hint")) {
                        break;
                    }
                    i9++;
                }
                Measurable measurable9 = measurable4;
                final Placeable mo7457measureBRTryo05 = measurable9 != null ? measurable9.mo7457measureBRTryo0(m8741copyZbe2FdA$default3) : null;
                m2410calculateWidthO3s9Psw = OutlinedTextFieldKt.m2410calculateWidthO3s9Psw(TextFieldImplKt.widthOrZero(mo7457measureBRTryo0), TextFieldImplKt.widthOrZero(mo7457measureBRTryo02), mo7457measureBRTryo04.getWidth(), TextFieldImplKt.widthOrZero(mo7457measureBRTryo03), TextFieldImplKt.widthOrZero(mo7457measureBRTryo05), outlinedTextFieldMeasurePolicy.animationProgress, j2, measureScope2.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                m2409calculateHeightO3s9Psw = OutlinedTextFieldKt.m2409calculateHeightO3s9Psw(TextFieldImplKt.heightOrZero(mo7457measureBRTryo0), TextFieldImplKt.heightOrZero(mo7457measureBRTryo02), mo7457measureBRTryo04.getHeight(), TextFieldImplKt.heightOrZero(mo7457measureBRTryo03), TextFieldImplKt.heightOrZero(mo7457measureBRTryo05), outlinedTextFieldMeasurePolicy.animationProgress, j, measureScope2.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                int size6 = list2.size();
                int i10 = 0;
                while (i10 < size6) {
                    Measurable measurable10 = list.get(i10);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable10), OutlinedTextFieldKt.BorderId)) {
                        final Placeable mo7457measureBRTryo06 = measurable10.mo7457measureBRTryo0(ConstraintsKt.Constraints(m2410calculateWidthO3s9Psw != Integer.MAX_VALUE ? m2410calculateWidthO3s9Psw : 0, m2410calculateWidthO3s9Psw, m2409calculateHeightO3s9Psw != Integer.MAX_VALUE ? m2409calculateHeightO3s9Psw : 0, m2409calculateHeightO3s9Psw));
                        final int i11 = m2409calculateHeightO3s9Psw;
                        final Placeable placeable = mo7457measureBRTryo02;
                        final Placeable placeable2 = mo7457measureBRTryo04;
                        final int i12 = m2410calculateWidthO3s9Psw;
                        final Placeable placeable3 = mo7457measureBRTryo0;
                        return MeasureScope.layout$default(measureScope, i12, i11, null, new Function1() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit measure_3p2s80s$lambda$7;
                                measure_3p2s80s$lambda$7 = OutlinedTextFieldMeasurePolicy.measure_3p2s80s$lambda$7(i11, i12, placeable3, placeable, placeable2, mo7457measureBRTryo03, mo7457measureBRTryo05, mo7457measureBRTryo06, outlinedTextFieldMeasurePolicy, measureScope, (Placeable.PlacementScope) obj);
                                return measure_3p2s80s$lambda$7;
                            }
                        }, 4, null);
                    }
                    i10++;
                    outlinedTextFieldMeasurePolicy = this;
                    m2410calculateWidthO3s9Psw = m2410calculateWidthO3s9Psw;
                    mo7457measureBRTryo04 = mo7457measureBRTryo04;
                    mo7457measureBRTryo02 = mo7457measureBRTryo02;
                    m2409calculateHeightO3s9Psw = m2409calculateHeightO3s9Psw;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i8++;
            outlinedTextFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            j2 = j;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$7(int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        OutlinedTextFieldKt.place(placementScope, i, i2, placeable, placeable2, placeable3, placeable4, placeable5, placeable6, outlinedTextFieldMeasurePolicy.animationProgress, outlinedTextFieldMeasurePolicy.singleLine, measureScope.getDensity(), measureScope.getLayoutDirection(), outlinedTextFieldMeasurePolicy.paddingValues);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new Function2() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int maxIntrinsicHeight;
                maxIntrinsicHeight = ((IntrinsicMeasurable) obj).maxIntrinsicHeight(((Integer) obj2).intValue());
                return Integer.valueOf(maxIntrinsicHeight);
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new Function2() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int minIntrinsicHeight;
                minIntrinsicHeight = ((IntrinsicMeasurable) obj).minIntrinsicHeight(((Integer) obj2).intValue());
                return Integer.valueOf(minIntrinsicHeight);
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(intrinsicMeasureScope, list, i, new Function2() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int maxIntrinsicWidth;
                maxIntrinsicWidth = ((IntrinsicMeasurable) obj).maxIntrinsicWidth(((Integer) obj2).intValue());
                return Integer.valueOf(maxIntrinsicWidth);
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(intrinsicMeasureScope, list, i, new Function2() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int minIntrinsicWidth;
                minIntrinsicWidth = ((IntrinsicMeasurable) obj).minIntrinsicWidth(((Integer) obj2).intValue());
                return Integer.valueOf(minIntrinsicWidth);
            }
        });
    }

    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int m2410calculateWidthO3s9Psw;
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable5 = list.get(i2);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), "TextField")) {
                int intValue = function2.invoke(intrinsicMeasurable5, Integer.valueOf(i)).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i3 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = list.get(i3);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Label")) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable2;
                int intValue2 = intrinsicMeasurable6 != null ? function2.invoke(intrinsicMeasurable6, Integer.valueOf(i)).intValue() : 0;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = list.get(i4);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable3;
                int intValue3 = intrinsicMeasurable7 != null ? function2.invoke(intrinsicMeasurable7, Integer.valueOf(i)).intValue() : 0;
                int size4 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = list.get(i5);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable4;
                int intValue4 = intrinsicMeasurable8 != null ? function2.invoke(intrinsicMeasurable8, Integer.valueOf(i)).intValue() : 0;
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = list.get(i6);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                m2410calculateWidthO3s9Psw = OutlinedTextFieldKt.m2410calculateWidthO3s9Psw(intValue4, intValue3, intValue, intValue2, intrinsicMeasurable10 != null ? function2.invoke(intrinsicMeasurable10, Integer.valueOf(i)).intValue() : 0, this.animationProgress, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m2410calculateWidthO3s9Psw;
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i2;
        int i3;
        IntrinsicMeasurable intrinsicMeasurable3;
        int i4;
        IntrinsicMeasurable intrinsicMeasurable4;
        int m2409calculateHeightO3s9Psw;
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        int i5 = 0;
        while (true) {
            intrinsicMeasurable = null;
            if (i5 >= size) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i5);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Leading")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable2;
        if (intrinsicMeasurable5 != null) {
            i2 = LayoutUtilKt.subtractConstraintSafely(i, intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE));
            i3 = function2.invoke(intrinsicMeasurable5, Integer.valueOf(i)).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i6);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable3;
        if (intrinsicMeasurable6 != null) {
            i2 = LayoutUtilKt.subtractConstraintSafely(i2, intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE));
            i4 = function2.invoke(intrinsicMeasurable6, Integer.valueOf(i)).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i7);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), "Label")) {
                break;
            }
            i7++;
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable4;
        int intValue = intrinsicMeasurable7 != null ? function2.invoke(intrinsicMeasurable7, Integer.valueOf(MathHelpersKt.lerp(i2, i, this.animationProgress))).intValue() : 0;
        int size4 = list2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            IntrinsicMeasurable intrinsicMeasurable8 = list.get(i8);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable8), "TextField")) {
                int intValue2 = function2.invoke(intrinsicMeasurable8, Integer.valueOf(i2)).intValue();
                int size5 = list2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = list.get(i9);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i9++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                m2409calculateHeightO3s9Psw = OutlinedTextFieldKt.m2409calculateHeightO3s9Psw(i3, i4, intValue2, intValue, intrinsicMeasurable10 != null ? function2.invoke(intrinsicMeasurable10, Integer.valueOf(i2)).intValue() : 0, this.animationProgress, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m2409calculateHeightO3s9Psw;
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
