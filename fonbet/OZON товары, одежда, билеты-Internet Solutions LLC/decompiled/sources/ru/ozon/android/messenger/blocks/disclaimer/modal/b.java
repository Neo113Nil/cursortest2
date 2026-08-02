package ru.ozon.android.messenger.blocks.disclaimer.modal;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.c;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<c.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f85060b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar) {
        super(1);
        this.f85060b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(c.a aVar) {
        c.a DisclaimerModalAdapter = aVar;
        Intrinsics.checkNotNullParameter(DisclaimerModalAdapter, "$this$DisclaimerModalAdapter");
        c cVar = this.f85060b;
        cVar.dismiss();
        Map<String, MessengerTrackingInfo> I11 = DisclaimerModalAdapter.I();
        ru.ozon.android.messenger.framework.navigation.controller.b bVar = cVar.f85061a;
        if (bVar == null) {
            Intrinsics.n("controller");
            throw null;
        }
        bVar.m(I11);
        ru.ozon.android.messenger.framework.navigation.action.a r02 = DisclaimerModalAdapter.r0();
        if (r02 != null) {
            ru.ozon.android.messenger.framework.navigation.controller.b bVar2 = cVar.f85061a;
            if (bVar2 == null) {
                Intrinsics.n("controller");
                throw null;
            }
            bVar2.q(r02);
        }
        return Unit.f71690a;
    }
}
