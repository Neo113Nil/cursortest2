package ru.ozon.android.messenger.blocks.chat.search;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a f84608b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TextDTO f84609c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TextDTO f84610d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ List<Icon> f84611e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f84612f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(e.a aVar, TextDTO textDTO, TextDTO textDTO2, List list, int i11) {
        super(2);
        this.f84608b = aVar;
        this.f84609c = textDTO;
        this.f84610d = textDTO2;
        this.f84611e = list;
        this.f84612f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f84612f | 1);
        TextDTO textDTO = this.f84610d;
        g.d(this.f84608b, this.f84609c, textDTO, this.f84611e, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
