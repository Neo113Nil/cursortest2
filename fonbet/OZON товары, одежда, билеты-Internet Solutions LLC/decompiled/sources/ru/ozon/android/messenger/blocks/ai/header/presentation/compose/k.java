package ru.ozon.android.messenger.blocks.ai.header.presentation.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
final class k extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function2<AtomAction, AtomActionDTO, Unit> f84167b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IconButtonV3DTO f84168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    k(Function2<? super AtomAction, ? super AtomActionDTO, Unit> function2, IconButtonV3DTO iconButtonV3DTO) {
        super(1);
        this.f84167b = function2;
        this.f84168c = iconButtonV3DTO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction action = atomAction;
        Intrinsics.checkNotNullParameter(action, "action");
        CommonControlSettings common = this.f84168c.getCommon();
        this.f84167b.invoke(action, common != null ? common.getAction() : null);
        return Unit.f71690a;
    }
}
