package ru.ozon.android.messenger.blocks.ai.header.presentation.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ai.header.AiHeaderDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
final class m extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<AtomActionDTO, Unit> f84173b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AiHeaderDTO.TitleSubtitle f84174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    m(Function1<? super AtomActionDTO, Unit> function1, AiHeaderDTO.TitleSubtitle titleSubtitle) {
        super(0);
        this.f84173b = function1;
        this.f84174c = titleSubtitle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f84173b.invoke(this.f84174c.getAction());
        return Unit.f71690a;
    }
}
