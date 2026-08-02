package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class m extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f86910b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<String, Unit> f86911c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f86912d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f86913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(i iVar, Function1 function1, Function0 function0, int i11) {
        super(2);
        this.f86910b = iVar;
        this.f86911c = function1;
        this.f86912d = function0;
        this.f86913e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f86913e | 1);
        Function0<Unit> function0 = this.f86912d;
        r.a(this.f86910b, this.f86911c, function0, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
