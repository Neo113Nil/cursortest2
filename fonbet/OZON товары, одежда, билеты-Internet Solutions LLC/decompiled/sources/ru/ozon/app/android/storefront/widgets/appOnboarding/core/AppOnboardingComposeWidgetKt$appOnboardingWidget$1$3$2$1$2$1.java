package ru.ozon.app.android.storefront.widgets.appOnboarding.core;

import Tg.b;
import WZ.d;
import WZ.e;
import WZ.g;
import WZ.l;
import WZ.t;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "page", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1$2$1 extends AbstractC7737t implements InterfaceC6511n<AtomActionDTO, Map<String, ? extends TokenizedTrackingInfo>, Integer, Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ i<AppOnboardingVI> $this_content;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1$2$1(Function1<? super b, Unit> function1, i<AppOnboardingVI> iVar, l lVar) {
        super(3);
        this.$actionHandler = function1;
        this.$this_content = iVar;
        this.$tokenizedAnalytics = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g invoke$lambda$1$lambda$0(int i11, UZ.a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, U.i(new Pair("route_id", Integer.valueOf(i11))), null, 2);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(AtomActionDTO atomActionDTO, Map<String, ? extends TokenizedTrackingInfo> map, Integer num) {
        invoke(atomActionDTO, (Map<String, TokenizedTrackingInfo>) map, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, final int i11) {
        t tokenizedEvent$default;
        Intrinsics.checkNotNullParameter(action, "action");
        this.$actionHandler.invoke(AtomActionMapperKt.toAtomAction(action, null));
        if (map == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(map, Long.valueOf(this.$this_content.b().getId()), null, 2, null)) == null) {
            return;
        }
        this.$tokenizedAnalytics.f(tokenizedEvent$default, new d(AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1$2$1$1$1.INSTANCE), new e() { // from class: ru.ozon.app.android.storefront.widgets.appOnboarding.core.a
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g invoke$lambda$1$lambda$0;
                invoke$lambda$1$lambda$0 = AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1$2$1.invoke$lambda$1$lambda$0(i11, (UZ.d) aVar, gVar);
                return invoke$lambda$1$lambda$0;
            }
        });
    }
}
