package ru.ozon.android.messenger.blocks.ai.header.presentation.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
final class j extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function2<AtomAction, AtomActionDTO, Unit> f84165b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f84166c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    j(Function2<? super AtomAction, ? super AtomActionDTO, Unit> function2, ButtonV3DTO buttonV3DTO) {
        super(1);
        this.f84165b = function2;
        this.f84166c = buttonV3DTO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction action = atomAction;
        Intrinsics.checkNotNullParameter(action, "action");
        CommonControlSettings common = this.f84166c.getCommon();
        this.f84165b.invoke(action, common != null ? common.getAction() : null);
        return Unit.f71690a;
    }
}
