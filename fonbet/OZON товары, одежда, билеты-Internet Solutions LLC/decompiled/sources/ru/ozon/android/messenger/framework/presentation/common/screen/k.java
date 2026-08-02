package ru.ozon.android.messenger.framework.presentation.common.screen;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.navigation.action.g;
import ru.ozon.android.messenger.framework.presentation.models.k;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
final class k extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f91130b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k.a f91131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(j jVar, k.a aVar) {
        super(1);
        this.f91130b = jVar;
        this.f91131c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r4 == null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Unit invoke(AtomAction atomAction) {
        Map c11;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomAction action = atomAction;
        Intrinsics.checkNotNullParameter(action, "action");
        if ((action instanceof AtomAction.Click) || (action instanceof AtomAction.Move)) {
            j jVar = this.f91130b;
            ru.ozon.android.messenger.framework.navigation.controller.a aVar = jVar.f91128a;
            if (aVar == null) {
                Intrinsics.n("controller");
                throw null;
            }
            Integer b11 = this.f91131c.b();
            if (b11 != null) {
                c11 = U.i(new Pair(g.b.LOADING_TTL.a(), Integer.valueOf(b11.intValue())));
            }
            c11 = U.c();
            aVar.q(new ru.ozon.android.messenger.framework.navigation.action.a(null, action, c11, 1));
            if ((action instanceof AtomAction.SendAnalytics) && (trackingInfo = ((AtomAction.SendAnalytics) action).getTrackingInfo()) != null) {
                Map<String, MessengerTrackingInfo> a11 = ru.ozon.android.messenger.framework.analytics.h.a(trackingInfo);
                ru.ozon.android.messenger.framework.navigation.controller.a aVar2 = jVar.f91128a;
                if (aVar2 == null) {
                    Intrinsics.n("controller");
                    throw null;
                }
                aVar2.m(a11);
            }
            jVar.dismiss();
        }
        return Unit.f71690a;
    }
}
