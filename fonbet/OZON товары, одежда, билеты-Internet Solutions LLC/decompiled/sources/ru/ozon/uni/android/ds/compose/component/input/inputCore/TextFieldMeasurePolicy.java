package ru.ozon.uni.android.ds.compose.component.input.inputCore;

import B1.InterfaceC2552v;
import B1.InterfaceC2553w;
import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import Z1.b;
import Z1.c;
import androidx.compose.ui.layout.a;
import hd.C6915b;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0011\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JK\u0010\u0015\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001e\u001a\u00020\u001b*\u00020\u00172\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010 J)\u0010\"\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010 J)\u0010#\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&¨\u0006'"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/input/inputCore/TextFieldMeasurePolicy;", "LB1/V;", "", "animationProgress", "Lu0/x;", "paddingValues", "Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;", "labelPosition", "<init>", "(FLu0/x;Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;)V", "", "LB1/v;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "intrinsicWidth", "(Ljava/util/List;ILkotlin/jvm/functions/Function2;)I", "LB1/w;", "width", "intrinsicHeight", "(LB1/w;Ljava/util/List;ILru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;Lkotlin/jvm/functions/Function2;)I", "LB1/Y;", "LB1/U;", "LZ1/b;", "constraints", "LB1/W;", "measure-3p2s80s", "(LB1/Y;Ljava/util/List;J)LB1/W;", "measure", "maxIntrinsicHeight", "(LB1/w;Ljava/util/List;I)I", "minIntrinsicHeight", "maxIntrinsicWidth", "minIntrinsicWidth", "F", "Lu0/x;", "Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldMeasurePolicy implements V {
    private final float animationProgress;

    @NotNull
    private final DsInputLabelPosition labelPosition;

    @NotNull
    private final InterfaceC9914x paddingValues;

    public TextFieldMeasurePolicy(float f7, @NotNull InterfaceC9914x paddingValues, @NotNull DsInputLabelPosition labelPosition) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        this.animationProgress = f7;
        this.paddingValues = paddingValues;
        this.labelPosition = labelPosition;
    }

    private final int intrinsicHeight(InterfaceC2553w interfaceC2553w, List<? extends InterfaceC2552v> list, int i11, DsInputLabelPosition dsInputLabelPosition, Function2<? super InterfaceC2552v, ? super Integer, Integer> function2) {
        InterfaceC2552v interfaceC2552v;
        InterfaceC2552v interfaceC2552v2;
        int m1750calculateHeightWeOhcdQ;
        int size = list.size();
        boolean z11 = false;
        int i12 = 0;
        while (true) {
            interfaceC2552v = null;
            if (i12 >= size) {
                interfaceC2552v2 = null;
                break;
            }
            interfaceC2552v2 = list.get(i12);
            if (Intrinsics.d(TextFieldImplKt.getLayoutId(interfaceC2552v2), "Label")) {
                break;
            }
            i12++;
        }
        InterfaceC2552v interfaceC2552v3 = interfaceC2552v2;
        int intValue = interfaceC2552v3 != null ? function2.invoke(interfaceC2552v3, Integer.valueOf(i11)).intValue() : 0;
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC2552v interfaceC2552v4 = list.get(i13);
            if (Intrinsics.d(TextFieldImplKt.getLayoutId(interfaceC2552v4), "TextField")) {
                int intValue2 = function2.invoke(interfaceC2552v4, Integer.valueOf(i11)).intValue();
                int size3 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size3) {
                        break;
                    }
                    InterfaceC2552v interfaceC2552v5 = list.get(i14);
                    if (Intrinsics.d(TextFieldImplKt.getLayoutId(interfaceC2552v5), "Hint")) {
                        interfaceC2552v = interfaceC2552v5;
                        break;
                    }
                    i14++;
                }
                InterfaceC2552v interfaceC2552v6 = interfaceC2552v;
                int intValue3 = interfaceC2552v6 != null ? function2.invoke(interfaceC2552v6, Integer.valueOf(i11)).intValue() : 0;
                if (intValue > 0 && dsInputLabelPosition == DsInputLabelPosition.INSIDE_TOP) {
                    z11 = true;
                }
                m1750calculateHeightWeOhcdQ = TextFieldMeasurePolicyKt.m1750calculateHeightWeOhcdQ(intValue2, z11, intValue, intValue3, TextFieldImplKt.getZeroConstraints(), interfaceC2553w.g(), this.paddingValues);
                return m1750calculateHeightWeOhcdQ;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(List<? extends InterfaceC2552v> measurables, int height, Function2<? super InterfaceC2552v, ? super Integer, Integer> intrinsicMeasurer) {
        InterfaceC2552v interfaceC2552v;
        InterfaceC2552v interfaceC2552v2;
        int m1751calculateWidthhBUhpc;
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC2552v interfaceC2552v3 = measurables.get(i11);
            if (Intrinsics.d(TextFieldImplKt.getLayoutId(interfaceC2552v3), "TextField")) {
                int intValue = intrinsicMeasurer.invoke(interfaceC2552v3, Integer.valueOf(height)).intValue();
                int size2 = measurables.size();
                int i12 = 0;
                while (true) {
                    interfaceC2552v = null;
                    if (i12 >= size2) {
                        interfaceC2552v2 = null;
                        break;
                    }
                    interfaceC2552v2 = measurables.get(i12);
                    if (Intrinsics.d(TextFieldImplKt.getLayoutId(interfaceC2552v2), "Label")) {
                        break;
                    }
                    i12++;
                }
                InterfaceC2552v interfaceC2552v4 = interfaceC2552v2;
                int intValue2 = interfaceC2552v4 != null ? intrinsicMeasurer.invoke(interfaceC2552v4, Integer.valueOf(height)).intValue() : 0;
                int size3 = measurables.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        break;
                    }
                    InterfaceC2552v interfaceC2552v5 = measurables.get(i13);
                    if (Intrinsics.d(TextFieldImplKt.getLayoutId(interfaceC2552v5), "Hint")) {
                        interfaceC2552v = interfaceC2552v5;
                        break;
                    }
                    i13++;
                }
                InterfaceC2552v interfaceC2552v6 = interfaceC2552v;
                m1751calculateWidthhBUhpc = TextFieldMeasurePolicyKt.m1751calculateWidthhBUhpc(intValue, intValue2, interfaceC2552v6 != null ? intrinsicMeasurer.invoke(interfaceC2552v6, Integer.valueOf(height)).intValue() : 0, TextFieldImplKt.getZeroConstraints());
                return m1751calculateWidthhBUhpc;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // B1.V
    public int maxIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> measurables, int i11) {
        Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(interfaceC2553w, measurables, i11, this.labelPosition, TextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    @Override // B1.V
    public int maxIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> measurables, int i11) {
        Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicWidth(measurables, i11, TextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public W mo2measure3p2s80s(@NotNull Y measure, @NotNull List<? extends U> measurables, long j11) {
        U u11;
        m0 m0Var;
        U u12;
        int m1751calculateWidthhBUhpc;
        int m1750calculateHeightWeOhcdQ;
        W z02;
        TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int Y02 = measure.Y0(textFieldMeasurePolicy.paddingValues.d());
        int Y03 = measure.Y0(textFieldMeasurePolicy.paddingValues.a());
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        int Y04 = measure.Y0(dsSpacings.m1847getDp2D9Ej5fM());
        int Y05 = measure.Y0(dsSpacings.m1854getDp4D9Ej5fM());
        int size = measurables.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                u11 = null;
                break;
            }
            u11 = measurables.get(i11);
            if (Intrinsics.d(a.a(u11), "Label")) {
                break;
            }
            i11++;
        }
        U u13 = u11;
        if (u13 != null) {
            m0Var = u13.a0(b.c(0, textFieldMeasurePolicy.labelPosition == DsInputLabelPosition.INSIDE_LEFT ? C6915b.c((b.k(j11) - Y05) / 2.0f) : b.k(j11), 0, 0, 8, j11));
        } else {
            m0Var = null;
        }
        int l02 = m0Var != null ? m0Var.l0() : 0;
        long l11 = c.l(0, m0Var != null ? ((-Y03) - Y04) - l02 : (-Y02) - Y03, 1, b.c(0, (m0Var == null || textFieldMeasurePolicy.labelPosition != DsInputLabelPosition.INSIDE_LEFT) ? b.k(j11) : (b.k(j11) - Y05) - m0Var.u0(), 0, 0, 9, j11));
        int size2 = measurables.size();
        int i12 = 0;
        while (i12 < size2) {
            U u14 = measurables.get(i12);
            if (Intrinsics.d(a.a(u14), "TextField")) {
                m0 a02 = u14.a0(l11);
                long c11 = b.c(0, 0, 0, 0, 14, l11);
                int size3 = measurables.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        u12 = null;
                        break;
                    }
                    u12 = measurables.get(i13);
                    if (Intrinsics.d(a.a(u12), "Hint")) {
                        break;
                    }
                    i13++;
                }
                U u15 = u12;
                m0 a03 = u15 != null ? u15.a0(c11) : null;
                m1751calculateWidthhBUhpc = TextFieldMeasurePolicyKt.m1751calculateWidthhBUhpc(a02.u0(), TextFieldImplKt.getWidthOrZero(m0Var), TextFieldImplKt.getWidthOrZero(a03), j11);
                int i14 = l02;
                m1750calculateHeightWeOhcdQ = TextFieldMeasurePolicyKt.m1750calculateHeightWeOhcdQ(a02.l0(), m0Var != null && textFieldMeasurePolicy.labelPosition == DsInputLabelPosition.INSIDE_TOP, i14, TextFieldImplKt.getHeightOrZero(a03), j11, measure.g(), textFieldMeasurePolicy.paddingValues);
                z02 = measure.z0(m1751calculateWidthhBUhpc, m1750calculateHeightWeOhcdQ, kotlin.collections.U.c(), new TextFieldMeasurePolicy$measure$1(m0Var, textFieldMeasurePolicy, a02, m1750calculateHeightWeOhcdQ, a03, Y05, Y02, i14, Y04));
                return z02;
            }
            i12++;
            textFieldMeasurePolicy = this;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // B1.V
    public int minIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> measurables, int i11) {
        Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(interfaceC2553w, measurables, i11, this.labelPosition, TextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    @Override // B1.V
    public int minIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> measurables, int i11) {
        Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicWidth(measurables, i11, TextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }
}
