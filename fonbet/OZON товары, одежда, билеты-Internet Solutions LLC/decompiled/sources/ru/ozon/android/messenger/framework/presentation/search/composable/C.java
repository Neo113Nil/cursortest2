package ru.ozon.android.messenger.framework.presentation.search.composable;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class C extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f91641b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f91642c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.e f91643d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f91644e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(androidx.compose.ui.e eVar, ru.ozon.android.messenger.framework.core.d dVar, ru.ozon.android.messenger.framework.presentation.models.e eVar2, int i11) {
        super(2);
        this.f91641b = eVar;
        this.f91642c = dVar;
        this.f91643d = eVar2;
        this.f91644e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f91644e | 1);
        ru.ozon.android.messenger.framework.core.d dVar = this.f91642c;
        E.a(this.f91641b, dVar, this.f91643d, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
