package ru.ozon.id.nativeauth.crossApp;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.nativeauth.crossApp.dto.ModalCrossAppResponseDTO;
import vd0.InterfaceC10308a;

/* loaded from: classes3.dex */
final class a extends AbstractC7737t implements Function1<InterfaceC10308a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CrossAppAuthActivity f97218b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ModalCrossAppResponseDTO.ModalDTO f97219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(CrossAppAuthActivity crossAppAuthActivity, ModalCrossAppResponseDTO.ModalDTO modalDTO) {
        super(1);
        this.f97218b = crossAppAuthActivity;
        this.f97219c = modalDTO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC10308a interfaceC10308a) {
        InterfaceC10308a it = interfaceC10308a;
        Intrinsics.checkNotNullParameter(it, "it");
        CrossAppAuthActivity.K(this.f97218b).x(this.f97219c.getCrossAppButton().getAction().getLink());
        return Unit.f71690a;
    }
}
