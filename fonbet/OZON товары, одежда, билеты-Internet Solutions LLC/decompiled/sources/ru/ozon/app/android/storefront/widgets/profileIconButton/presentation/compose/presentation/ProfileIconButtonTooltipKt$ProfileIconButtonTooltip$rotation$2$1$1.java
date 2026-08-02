package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.G;
import m0.V;
import ru.ozon.composer.compose.widget.scrollable.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/V$b;", "", "", "invoke", "(Lm0/V$b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2$1$1 extends AbstractC7737t implements Function1<V.b<Float>, Unit> {
    public static final ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2$1$1 INSTANCE = new ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2$1$1();

    ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(V.b<Float> bVar) {
        invoke2(bVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(V.b<Float> keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.d();
        keyframes.e(m.f94768d);
        keyframes.f(0, Float.valueOf(10.0f)).c(G.a());
        keyframes.f(600, Float.valueOf(-2.0f)).c(G.a());
        keyframes.f(m.f94768d, Float.valueOf(0.0f));
    }
}
