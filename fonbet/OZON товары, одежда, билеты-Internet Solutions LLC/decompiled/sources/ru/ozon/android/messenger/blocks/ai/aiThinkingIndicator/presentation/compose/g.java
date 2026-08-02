package ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.compose;

import S0.InterfaceC3978p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import m0.O;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function0<e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O.a f84093b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<TextDTO> f84094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(O.a aVar, InterfaceC3978p0 interfaceC3978p0) {
        super(0);
        this.f84093b = aVar;
        this.f84094c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final e invoke() {
        return new e(((Number) this.f84093b.getValue()).floatValue(), this.f84094c.getValue());
    }
}
