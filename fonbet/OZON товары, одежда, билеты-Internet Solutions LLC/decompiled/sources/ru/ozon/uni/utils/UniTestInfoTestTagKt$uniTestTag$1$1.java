package ru.ozon.uni.utils;

import androidx.compose.ui.platform.C5242e1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/e1;", "", "invoke", "(Landroidx/compose/ui/platform/e1;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class UniTestInfoTestTagKt$uniTestTag$1$1 extends AbstractC7737t implements Function1<C5242e1, Unit> {
    final /* synthetic */ TestInfo $testInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniTestInfoTestTagKt$uniTestTag$1$1(TestInfo testInfo) {
        super(1);
        this.$testInfo = testInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C5242e1 c5242e1) {
        invoke2(c5242e1);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C5242e1 UniTestInfoTagElement) {
        Intrinsics.checkNotNullParameter(UniTestInfoTagElement, "$this$UniTestInfoTagElement");
        UniTestInfoTagElement.getClass();
        UniTestInfoTagElement.a().b(this.$testInfo.getAutomatizationId(), "testInfo.automatizationId");
    }
}
