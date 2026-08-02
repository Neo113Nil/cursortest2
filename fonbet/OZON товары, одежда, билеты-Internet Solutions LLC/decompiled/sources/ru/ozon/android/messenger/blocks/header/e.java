package ru.ozon.android.messenger.blocks.header;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.button.Icon;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f85269b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f85270c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f85271d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Icon f85272e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f85273f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f85274g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(float f7, float f11, float f12, Icon icon, String str, int i11) {
        super(2);
        this.f85269b = f7;
        this.f85270c = f11;
        this.f85271d = f12;
        this.f85272e = icon;
        this.f85273f = str;
        this.f85274g = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f85274g | 1);
        float f7 = this.f85270c;
        float f11 = this.f85271d;
        f.b(this.f85269b, f7, f11, this.f85272e, this.f85273f, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
