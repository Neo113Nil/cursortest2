package ru.ozon.android.messenger.framework.presentation.ai;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class C extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a f89227b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.e f89228c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89229d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.logger.b f89230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(e.a aVar, ru.ozon.android.messenger.framework.presentation.models.e eVar, ru.ozon.android.messenger.framework.core.d dVar, ru.ozon.android.messenger.framework.logger.b bVar, int i11) {
        super(2);
        this.f89227b = aVar;
        this.f89228c = eVar;
        this.f89229d = dVar;
        this.f89230e = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        ru.ozon.android.messenger.framework.core.d dVar = this.f89229d;
        N.b(this.f89227b, this.f89228c, dVar, this.f89230e, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
