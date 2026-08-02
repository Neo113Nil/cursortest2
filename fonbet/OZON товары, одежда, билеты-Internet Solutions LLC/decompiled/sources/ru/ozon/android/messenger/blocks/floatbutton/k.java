package ru.ozon.android.messenger.blocks.floatbutton;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class k extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a f85233b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IconDTO f85234c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f85235d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Integer f85236e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ TextDTO f85237f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f85238g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f85239h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f85240i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(e.a aVar, IconDTO iconDTO, String str, Integer num, TextDTO textDTO, Function0 function0, Function0 function02, int i11) {
        super(2);
        this.f85233b = aVar;
        this.f85234c = iconDTO;
        this.f85235d = str;
        this.f85236e = num;
        this.f85237f = textDTO;
        this.f85238g = function0;
        this.f85239h = function02;
        this.f85240i = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f85240i | 1);
        Integer num2 = this.f85236e;
        TextDTO textDTO = this.f85237f;
        l.a(this.f85233b, this.f85234c, this.f85235d, num2, textDTO, this.f85238g, this.f85239h, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
