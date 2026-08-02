package coil.compose;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: SubcomposeAsyncImage.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2 implements MeasurePolicy {
    public static final SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2 INSTANCE = new SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2();

    SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(Placeable.PlacementScope placementScope) {
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo367measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        return MeasureScope.layout$default(measureScope, Constraints.m8753getMinWidthimpl(j), Constraints.m8752getMinHeightimpl(j), null, new Function1() { // from class: coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measure_3p2s80s$lambda$0;
                measure_3p2s80s$lambda$0 = SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2.measure_3p2s80s$lambda$0((Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            }
        }, 4, null);
    }
}
