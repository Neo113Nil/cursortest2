package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ai.input.b;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.g0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9422g0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89604b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9422g0(C9414c0 c9414c0) {
        super(0);
        this.f89604b = c9414c0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f89604b.getController().v(new b.a(ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT));
        return Unit.f71690a;
    }
}
