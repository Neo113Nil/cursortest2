package ru.ozon.android.messenger.blocks.header;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.header.ChatHeaderDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

/* loaded from: classes10.dex */
final class j extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a f85298b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IconDTO f85299c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ChatHeaderDTO.a f85300d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f85301e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f85302f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f85303g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f85304h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f85305i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(e.a aVar, IconDTO iconDTO, ChatHeaderDTO.a aVar2, float f7, float f11, long j11, long j12, int i11) {
        super(2);
        this.f85298b = aVar;
        this.f85299c = iconDTO;
        this.f85300d = aVar2;
        this.f85301e = f7;
        this.f85302f = f11;
        this.f85303g = j11;
        this.f85304h = j12;
        this.f85305i = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f85305i | 1);
        float f7 = this.f85301e;
        float f11 = this.f85302f;
        l.a(this.f85298b, this.f85299c, this.f85300d, f7, f11, this.f85303g, this.f85304h, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
