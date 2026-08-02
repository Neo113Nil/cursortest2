package ru.ozon.android.messenger.framework.presentation.ai;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ai.input.b;

/* loaded from: classes10.dex */
final class B0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89225b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Map<String, String> f89226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B0(C9414c0 c9414c0, Map<String, String> map) {
        super(0);
        this.f89225b = c9414c0;
        this.f89226c = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C9414c0 c9414c0 = this.f89225b;
        c9414c0.getController().v(new b.a(ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING_EMPTY));
        c9414c0.f89506i.X(this.f89226c, new A0(null, c9414c0));
        return Unit.f71690a;
    }
}
