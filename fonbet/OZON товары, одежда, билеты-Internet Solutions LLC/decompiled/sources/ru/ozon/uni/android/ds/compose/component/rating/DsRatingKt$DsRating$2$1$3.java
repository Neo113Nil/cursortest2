package ru.ozon.uni.android.ds.compose.component.rating;

import C1.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC1/l;", "", "invoke", "(LC1/l;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes8.dex */
final class DsRatingKt$DsRating$2$1$3 extends AbstractC7737t implements Function1<l, Unit> {
    final /* synthetic */ M<String> $dsTestTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsRatingKt$DsRating$2$1$3(M<String> m11) {
        super(1);
        this.$dsTestTag = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(l lVar) {
        invoke2(lVar);
        return Unit.f71690a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(l modifierLocalConsumer) {
        Intrinsics.checkNotNullParameter(modifierLocalConsumer, "$this$modifierLocalConsumer");
        this.$dsTestTag.f71787a = modifierLocalConsumer.G(AtomLocatorKt.getLocalDsTestTag());
    }
}
