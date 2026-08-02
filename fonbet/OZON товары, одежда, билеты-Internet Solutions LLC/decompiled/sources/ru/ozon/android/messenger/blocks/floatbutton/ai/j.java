package ru.ozon.android.messenger.blocks.floatbutton.ai;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
final class j extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function2<AtomAction, Map<String, TokenizedTrackingInfo>, Unit> f85186b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f85187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    j(Function2<? super AtomAction, ? super Map<String, TokenizedTrackingInfo>, Unit> function2, ButtonV3DTO buttonV3DTO) {
        super(1);
        this.f85186b = function2;
        this.f85187c = buttonV3DTO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction action = atomAction;
        Intrinsics.checkNotNullParameter(action, "action");
        this.f85186b.invoke(action, this.f85187c.getTrackingInfo());
        return Unit.f71690a;
    }
}
