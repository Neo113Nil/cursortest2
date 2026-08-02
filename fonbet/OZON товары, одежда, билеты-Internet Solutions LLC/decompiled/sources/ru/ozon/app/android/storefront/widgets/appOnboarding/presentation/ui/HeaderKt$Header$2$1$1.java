package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class HeaderKt$Header$2$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function2<AtomActionDTO, Map<String, TokenizedTrackingInfo>, Unit> $onSkipClick;
    final /* synthetic */ AppOnboardingVI.Header $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HeaderKt$Header$2$1$1(Function2<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, Unit> function2, AppOnboardingVI.Header header) {
        super(0);
        this.$onSkipClick = function2;
        this.$state = header;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSkipClick.invoke(this.$state.getTitle().getAction(), this.$state.getTitle().getTrackingInfo());
    }
}
