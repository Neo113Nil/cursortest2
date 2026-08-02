package ru.ozon.android.messenger.blocks.ai.header;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function2<AtomAction, AtomActionDTO, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f84107b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(g gVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(2);
        this.f84107b = gVar;
        this.f84108c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(AtomAction atomAction, AtomActionDTO atomActionDTO) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomAction action = atomAction;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Intrinsics.checkNotNullParameter(action, "action");
        this.f84107b.getClass();
        AtomAction.SendAnalytics sendAnalytics = action instanceof AtomAction.SendAnalytics ? (AtomAction.SendAnalytics) action : null;
        ru.ozon.android.messenger.framework.core.d dVar = this.f84108c;
        if (sendAnalytics != null && (trackingInfo = sendAnalytics.getTrackingInfo()) != null) {
            Map<String, MessengerTrackingInfo> a11 = h.a(trackingInfo);
            Map<String, MessengerTrackingInfo> map = a11.isEmpty() ? null : a11;
            if (map != null) {
                dVar.c().m(map);
            }
        }
        dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(action, atomActionDTO2, 2));
        return Unit.f71690a;
    }
}
