package ru.ozon.android.messenger.blocks.ai.aiEmptyState;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.reflect.h;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f83940b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f83941c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a f83942d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(androidx.compose.ui.e eVar, ru.ozon.android.messenger.framework.core.d dVar, ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a aVar) {
        super(2);
        this.f83940b = eVar;
        this.f83941c = dVar;
        this.f83942d = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e j11 = T.j(a0.e(this.f83940b, 1.0f), 0.0f, 0.0f, 0.0f, 32, 7);
            ru.ozon.android.messenger.framework.core.d dVar = this.f83941c;
            Object c11 = dVar.c();
            interfaceC3967k2.o(361565299);
            boolean F11 = interfaceC3967k2.F(c11);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                Object bVar = new b(1, c11, ru.ozon.android.messenger.framework.navigation.controller.a.class, "handleViewEvent", "handleViewEvent(Ljava/util/Map;)V", 0);
                interfaceC3967k2.x(bVar);
                C11 = bVar;
            }
            h hVar = (h) C11;
            interfaceC3967k2.k();
            interfaceC3967k2.o(361567740);
            ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a aVar = this.f83942d;
            boolean F12 = interfaceC3967k2.F(aVar) | interfaceC3967k2.F(dVar);
            Object C12 = interfaceC3967k2.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new c(aVar, dVar);
                interfaceC3967k2.x(C12);
            }
            interfaceC3967k2.k();
            ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.compose.d.a(this.f83942d, j11, (Function0) C12, (Function1) hVar, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
