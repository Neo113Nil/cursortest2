package kc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.common.disclaimer.DisclaimerDTO;

/* renamed from: kc0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final /* synthetic */ class C7647e extends C7735q implements Function1<DisclaimerDTO.DisclaimerButtonDTO, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DisclaimerDTO.DisclaimerButtonDTO disclaimerButtonDTO) {
        DisclaimerDTO.DisclaimerButtonDTO p02 = disclaimerButtonDTO;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((C7629C) this.receiver).F1(p02);
        return Unit.f71690a;
    }
}
