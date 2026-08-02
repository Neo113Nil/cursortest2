package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f86862b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f86863c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e.a f86864d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f86865e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f86866f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(ButtonV3DTO buttonV3DTO, boolean z11, e.a aVar, Function0 function0, int i11) {
        super(2);
        this.f86862b = buttonV3DTO;
        this.f86863c = z11;
        this.f86864d = aVar;
        this.f86865e = function0;
        this.f86866f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        g.a(this.f86862b, this.f86863c, this.f86864d, this.f86865e, interfaceC3967k, C2652m.e(this.f86866f | 1));
        return Unit.f71690a;
    }
}
