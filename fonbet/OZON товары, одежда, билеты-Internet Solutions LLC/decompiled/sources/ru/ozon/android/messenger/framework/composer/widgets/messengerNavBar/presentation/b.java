package ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f87010b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h<Unit> f87011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(e eVar, h<Unit> hVar) {
        super(1);
        this.f87010b = eVar;
        this.f87011c = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction atomAction2;
        h<Unit> hVar;
        AtomAction it = atomAction;
        Intrinsics.checkNotNullParameter(it, "it");
        e eVar = this.f87010b;
        CommonControlSettings common = eVar.c().getCommon();
        AtomActionDTO action = common != null ? common.getAction() : null;
        if (action != null && (atomAction2 = AtomActionMapperKt.toAtomAction(action, eVar.c().getTrackingInfo())) != null && (hVar = this.f87011c) != null) {
            ((Function1) hVar).invoke(atomAction2);
        }
        return Unit.f71690a;
    }
}
