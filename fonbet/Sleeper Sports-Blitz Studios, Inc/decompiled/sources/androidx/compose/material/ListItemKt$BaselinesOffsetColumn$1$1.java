package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: ListItem.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ListItemKt$BaselinesOffsetColumn$1$1 implements MeasurePolicy {
    final /* synthetic */ List<Dp> $offsets;

    ListItemKt$BaselinesOffsetColumn$1$1(List<Dp> list) {
        this.$offsets = list;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo367measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int i;
        long m8741copyZbe2FdA$default = Constraints.m8741copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 3, null);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(list.get(i2).mo7457measureBRTryo0(m8741copyZbe2FdA$default));
        }
        final ArrayList arrayList2 = arrayList;
        int i3 = 0;
        ArrayList arrayList3 = arrayList2;
        int size2 = arrayList3.size();
        for (int i4 = 0; i4 < size2; i4++) {
            i3 = Integer.valueOf(Math.max(i3.intValue(), ((Placeable) arrayList2.get(i4)).getWidth()));
        }
        int intValue = i3.intValue();
        final int[] iArr = new int[arrayList2.size()];
        List<Dp> list2 = this.$offsets;
        int size3 = arrayList3.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size3; i6++) {
            Placeable placeable = (Placeable) arrayList2.get(i6);
            if (i6 > 0) {
                int i7 = i6 - 1;
                i = ((Placeable) arrayList2.get(i7)).getHeight() - ((Placeable) arrayList2.get(i7)).get(AlignmentLineKt.getLastBaseline());
            } else {
                i = 0;
            }
            int max = Math.max(0, (measureScope.mo738roundToPx0680j_4(list2.get(i6).m8812unboximpl()) - placeable.get(AlignmentLineKt.getFirstBaseline())) - i);
            iArr[i6] = max + i5;
            i5 += max + placeable.getHeight();
        }
        return MeasureScope.layout$default(measureScope, intValue, i5, null, new Function1() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measure_3p2s80s$lambda$4;
                measure_3p2s80s$lambda$4 = ListItemKt$BaselinesOffsetColumn$1$1.measure_3p2s80s$lambda$4(arrayList2, iArr, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$4;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$4(List list, int[] iArr, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i), 0, iArr[i], 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
