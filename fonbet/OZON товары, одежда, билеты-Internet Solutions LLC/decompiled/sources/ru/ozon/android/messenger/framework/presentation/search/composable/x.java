package ru.ozon.android.messenger.framework.presentation.search.composable;

import S0.InterfaceC3978p0;
import S0.M;
import S0.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class x extends AbstractC7737t implements Function1<N, M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<ru.ozon.android.messenger.framework.presentation.common.view.recycler.q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a>> f91708b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(InterfaceC3978p0<ru.ozon.android.messenger.framework.presentation.common.view.recycler.q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a>> interfaceC3978p0) {
        super(1);
        this.f91708b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N n11) {
        N DisposableEffect = n11;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new w(this.f91708b);
    }
}
