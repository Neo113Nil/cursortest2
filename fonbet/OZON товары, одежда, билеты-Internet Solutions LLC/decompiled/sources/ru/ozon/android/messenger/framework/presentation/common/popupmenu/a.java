package ru.ozon.android.messenger.framework.presentation.common.popupmenu;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function2<AtomAction, Map<String, ? extends MessengerTrackingInfo>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f90794b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f90795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(f fVar, Function0<Unit> function0) {
        super(2);
        this.f90794b = fVar;
        this.f90795c = function0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000d, code lost:
    
        r1 = r0.f90899b;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Unit invoke(AtomAction atomAction, Map<String, ? extends MessengerTrackingInfo> map) {
        ru.ozon.android.messenger.framework.navigation.controller.a aVar;
        ru.ozon.android.messenger.framework.analytics.i iVar;
        AtomAction atomAction2 = atomAction;
        Map<String, ? extends MessengerTrackingInfo> map2 = map;
        Intrinsics.checkNotNullParameter(atomAction2, "atomAction");
        f fVar = this.f90794b;
        if (map2 != null && iVar != null) {
            ru.ozon.android.messenger.framework.analytics.h.e(iVar, map2);
        }
        aVar = fVar.f90898a;
        aVar.q(ru.ozon.android.messenger.framework.navigation.action.b.e(atomAction2, null, 3));
        ((d) this.f90795c).invoke();
        return Unit.f71690a;
    }
}
