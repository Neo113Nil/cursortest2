package ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose;

import S0.InterfaceC3978p0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.rateApp.presentation.RateAppVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "rating", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateAppComposableKt$RateAppComposable$3$1$1 extends AbstractC7737t implements Function1<Float, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ InterfaceC3978p0<Boolean> $isHiding$delegate;
    final /* synthetic */ RateAppVO $state;
    final /* synthetic */ String $storeName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RateAppComposableKt$RateAppComposable$3$1$1(RateAppVO rateAppVO, Function1<? super AtomAction, Unit> function1, String str, InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(1);
        this.$state = rateAppVO;
        this.$actionHandler = function1;
        this.$storeName = str;
        this.$isHiding$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke(f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7) {
        AtomAction ratingChangeAction = this.$state.getRatingChangeAction();
        AtomAction.ComposerAction composerAction = ratingChangeAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) ratingChangeAction : null;
        if (composerAction != null) {
            Function1<AtomAction, Unit> function1 = this.$actionHandler;
            String str = this.$storeName;
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$isHiding$delegate;
            RateAppComposeProperties.INSTANCE.setDismissed(true);
            RateAppComposableKt.RateAppComposable$lambda$2(interfaceC3978p0, true);
            Pair pair = new Pair("service_rating", String.valueOf((int) f7));
            Pair pair2 = new Pair("store", str);
            Map<String, String> params = composerAction.getParams();
            function1.invoke(AtomAction.ComposerAction.copy$default(composerAction, null, null, U.j(pair, pair2, new Pair("nps_id", String.valueOf(params != null ? params.get("nps_id") : null))), null, null, 27, null));
        }
    }
}
