package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.a;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f87067b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f87068c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f87069d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlin.reflect.h<Unit> f87070e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(p pVar, ButtonV3DTO buttonV3DTO, InterfaceC3978p0 interfaceC3978p0, kotlin.reflect.h hVar) {
        super(0);
        this.f87067b = pVar;
        this.f87068c = buttonV3DTO;
        this.f87069d = interfaceC3978p0;
        this.f87070e = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC3978p0 interfaceC3978p0 = this.f87069d;
        if (!((n) interfaceC3978p0.getValue()).k() && ((n) interfaceC3978p0.getValue()).d() != null) {
            boolean j11 = ((n) interfaceC3978p0.getValue()).j();
            p pVar = this.f87067b;
            if (j11 && kotlin.text.h.K(((n) interfaceC3978p0.getValue()).c())) {
                pVar.g0(new a.c());
            } else {
                pVar.g0(new a.d(true));
                ButtonV3DTO buttonV3DTO = this.f87068c;
                CommonControlSettings common = buttonV3DTO.getCommon();
                AtomActionDTO action = common != null ? common.getAction() : null;
                AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, buttonV3DTO.getTrackingInfo()) : null;
                if (atomAction != null) {
                    ((Function1) this.f87070e).invoke(atomAction);
                }
            }
        }
        return Unit.f71690a;
    }
}
