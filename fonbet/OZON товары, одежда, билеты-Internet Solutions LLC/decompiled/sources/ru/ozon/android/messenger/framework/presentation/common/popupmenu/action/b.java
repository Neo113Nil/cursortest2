package ru.ozon.android.messenger.framework.presentation.common.popupmenu.action;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.c;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f90806b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c.a f90807c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    b(Function2<? super AtomAction, ? super Map<String, MessengerTrackingInfo>, Unit> function2, c.a aVar) {
        super(0);
        this.f90806b = (AbstractC7737t) function2;
        this.f90807c = aVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AtomActionDTO atomActionDTO;
        Map map;
        Map map2;
        c.a aVar = this.f90807c;
        atomActionDTO = aVar.f90810c;
        map = aVar.f90812e;
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(atomActionDTO, h.b(map));
        map2 = aVar.f90812e;
        this.f90806b.invoke(atomAction, map2);
        return Unit.f71690a;
    }
}
