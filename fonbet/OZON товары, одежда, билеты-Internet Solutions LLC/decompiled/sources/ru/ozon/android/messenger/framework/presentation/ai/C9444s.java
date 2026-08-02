package ru.ozon.android.messenger.framework.presentation.ai;

import S0.InterfaceC3978p0;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9444s extends AbstractC7737t implements Function0<Pair<? extends Z1.h, ? extends Z1.h>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Z1.h> f89676b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Z1.h> f89677c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9444s(InterfaceC3978p0<Z1.h> interfaceC3978p0, InterfaceC3978p0<Z1.h> interfaceC3978p02) {
        super(0);
        this.f89676b = interfaceC3978p0;
        this.f89677c = interfaceC3978p02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Pair<? extends Z1.h, ? extends Z1.h> invoke() {
        return new Pair<>(Z1.h.a(this.f89676b.getValue().d()), Z1.h.a(this.f89677c.getValue().d()));
    }
}
