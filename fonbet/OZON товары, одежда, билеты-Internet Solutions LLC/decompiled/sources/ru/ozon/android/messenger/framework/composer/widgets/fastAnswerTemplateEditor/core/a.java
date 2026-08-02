package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.core;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.r;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.t;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.composer.compose.widget.i<t> f86835b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(ru.ozon.composer.compose.widget.i<t> iVar) {
        super(2);
        this.f86835b = iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            r.b(this.f86835b.b(), null, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
