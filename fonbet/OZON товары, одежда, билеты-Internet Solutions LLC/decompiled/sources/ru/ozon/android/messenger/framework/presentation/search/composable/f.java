package ru.ozon.android.messenger.framework.presentation.search.composable;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f91657b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<C7807Z> f91658c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f91659d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f91660e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f91661f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f91662g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C5179b.k f91663h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f91664i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(androidx.compose.ui.e eVar, List list, float f7, int i11, int i12, float f11, C5179b.k kVar, int i13) {
        super(2);
        C4912a c4912a = C9519a.f91646a;
        this.f91657b = eVar;
        this.f91658c = list;
        this.f91659d = f7;
        this.f91660e = i11;
        this.f91661f = i12;
        this.f91662g = f11;
        this.f91663h = kVar;
        this.f91664i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        int e11 = C2652m.e(this.f91664i | 1);
        C4912a c4912a = C9519a.f91646a;
        j.c(this.f91657b, this.f91658c, this.f91659d, this.f91660e, this.f91661f, this.f91662g, this.f91663h, interfaceC3967k2, e11);
        return Unit.f71690a;
    }
}
