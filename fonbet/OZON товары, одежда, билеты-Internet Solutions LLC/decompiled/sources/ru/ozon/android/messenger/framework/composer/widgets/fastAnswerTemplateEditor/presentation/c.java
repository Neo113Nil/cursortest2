package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.composer.action.b;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.x;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f86867b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f86868c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<x, Unit> f86869d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b.a f86870e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f86871f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Function0 function0, ButtonV3DTO buttonV3DTO, Function1 function1, b.a aVar, InterfaceC3978p0 interfaceC3978p0) {
        super(0);
        this.f86867b = function0;
        this.f86868c = buttonV3DTO;
        this.f86869d = function1;
        this.f86870e = aVar;
        this.f86871f = interfaceC3978p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CommonControlSettings common;
        this.f86867b.invoke();
        if (!((i) this.f86871f.getValue()).c()) {
            ButtonV3DTO buttonV3DTO = this.f86868c;
            AtomActionDTO action = (buttonV3DTO == null || (common = buttonV3DTO.getCommon()) == null) ? null : common.getAction();
            this.f86869d.invoke(new x.b(true, action != null ? AtomActionMapperKt.toAtomAction(action, buttonV3DTO.getTrackingInfo()) : null, this.f86870e));
        }
        return Unit.f71690a;
    }
}
