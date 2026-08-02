package ru.ozon.android.messenger.framework.presentation.ai;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import fd.InterfaceC6512o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.core.initialization.d;
import v0.InterfaceC10165e;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9451y extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f89698b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f89699c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f89700d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d.a.C1558a f89701e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89702f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.logger.b f89703g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ v0.I f89704h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ c1.w f89705i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Function0 f89706j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f89707k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9451y(List list, List list2, boolean z11, d.a.C1558a c1558a, ru.ozon.android.messenger.framework.core.d dVar, ru.ozon.android.messenger.framework.logger.b bVar, v0.I i11, c1.w wVar, Function0 function0, InterfaceC3978p0 interfaceC3978p0) {
        super(4);
        this.f89698b = list;
        this.f89699c = list2;
        this.f89700d = z11;
        this.f89701e = c1558a;
        this.f89702f = dVar;
        this.f89703g = bVar;
        this.f89704h = i11;
        this.f89705i = wVar;
        this.f89706j = function0;
        this.f89707k = interfaceC3978p0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    @Override // fd.InterfaceC6512o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
        int i11;
        float f7;
        Object C11;
        InterfaceC10165e interfaceC10165e2 = interfaceC10165e;
        int intValue = num.intValue();
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i11 = (interfaceC3967k2.n(interfaceC10165e2) ? 4 : 2) | intValue2;
        } else {
            i11 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i11 |= interfaceC3967k2.r(intValue) ? 32 : 16;
        }
        if ((i11 & 147) == 146 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) this.f89698b.get(intValue);
            interfaceC3967k2.o(2101918224);
            int P11 = C7714v.P(this.f89699c);
            if (this.f89700d && intValue == P11 && !Z.b(qVar)) {
                Intrinsics.checkNotNullParameter(qVar, "<this>");
                List<ru.ozon.android.messenger.framework.presentation.models.u> b11 = qVar.b();
                if (!(b11 instanceof Collection) || !b11.isEmpty()) {
                    Iterator<T> it = b11.iterator();
                    while (it.hasNext()) {
                        if (((ru.ozon.android.messenger.framework.presentation.models.u) it.next()).c() instanceof ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c) {
                        }
                    }
                }
                f7 = ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.compose.c.b();
                androidx.compose.ui.e h11 = androidx.compose.foundation.layout.a0.h(androidx.compose.foundation.layout.a0.e(androidx.compose.ui.e.f40358c0, 1.0f), f7, 0.0f, 2);
                interfaceC3967k2.o(1591839508);
                C11 = interfaceC3967k2.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = new C9448v(this.f89707k);
                    interfaceC3967k2.x(C11);
                }
                interfaceC3967k2.k();
                N.c(h11, qVar, this.f89701e, this.f89702f, this.f89703g, this.f89704h, this.f89705i, (Function1) C11, this.f89706j, interfaceC3967k2, 14155776);
                interfaceC3967k2.k();
            }
            f7 = 0;
            androidx.compose.ui.e h112 = androidx.compose.foundation.layout.a0.h(androidx.compose.foundation.layout.a0.e(androidx.compose.ui.e.f40358c0, 1.0f), f7, 0.0f, 2);
            interfaceC3967k2.o(1591839508);
            C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            interfaceC3967k2.k();
            N.c(h112, qVar, this.f89701e, this.f89702f, this.f89703g, this.f89704h, this.f89705i, (Function1) C11, this.f89706j, interfaceC3967k2, 14155776);
            interfaceC3967k2.k();
        }
        return Unit.f71690a;
    }
}
