package ru.ozon.android.messenger.utils;

import Sc.InterfaceC4008j;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
public final class q extends AbstractC7737t implements Function0<A0> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f91971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InterfaceC4008j interfaceC4008j) {
        super(0);
        this.f91971b = interfaceC4008j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final A0 invoke() {
        return ((B0) this.f91971b.getValue()).getViewModelStore();
    }
}
