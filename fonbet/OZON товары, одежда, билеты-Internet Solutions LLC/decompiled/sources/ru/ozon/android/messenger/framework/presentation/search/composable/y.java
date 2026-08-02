package ru.ozon.android.messenger.framework.presentation.search.composable;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class y extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.e f91709b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<ru.ozon.android.messenger.framework.presentation.common.view.recycler.q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a>> f91710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ru.ozon.android.messenger.framework.presentation.models.e eVar, InterfaceC3978p0<ru.ozon.android.messenger.framework.presentation.common.view.recycler.q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a>> interfaceC3978p0) {
        super(0);
        this.f91709b = eVar;
        this.f91710c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ru.ozon.android.messenger.framework.presentation.common.view.recycler.q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a> value = this.f91710c.getValue();
        if (value != null) {
            value.trackView(this.f91709b.b());
        }
        return Unit.f71690a;
    }
}
