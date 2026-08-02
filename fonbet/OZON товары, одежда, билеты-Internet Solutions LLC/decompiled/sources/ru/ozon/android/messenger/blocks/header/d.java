package ru.ozon.android.messenger.blocks.header;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ IconDTO f85259b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a f85260c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Icon f85261d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f85262e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f85263f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f85264g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ float f85265h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ float f85266i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ long f85267j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f85268k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(IconDTO iconDTO, e.a aVar, Icon icon, String str, float f7, float f11, float f12, float f13, long j11, int i11) {
        super(2);
        this.f85259b = iconDTO;
        this.f85260c = aVar;
        this.f85261d = icon;
        this.f85262e = str;
        this.f85263f = f7;
        this.f85264g = f11;
        this.f85265h = f12;
        this.f85266i = f13;
        this.f85267j = j11;
        this.f85268k = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f85268k | 1);
        float f7 = this.f85264g;
        float f11 = this.f85265h;
        f.a(this.f85259b, this.f85260c, this.f85261d, this.f85262e, this.f85263f, f7, f11, this.f85266i, this.f85267j, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
