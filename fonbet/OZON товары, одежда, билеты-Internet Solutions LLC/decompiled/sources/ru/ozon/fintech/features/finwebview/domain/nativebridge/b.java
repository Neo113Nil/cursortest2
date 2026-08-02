package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import E30.e;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class b implements e.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBridgeConfigurator f95616a;

    b(NativeBridgeConfigurator nativeBridgeConfigurator) {
        this.f95616a = nativeBridgeConfigurator;
    }

    @Override // E30.e.a
    public final void a(int i11, int i12, Intent intent) {
        boolean z11;
        NativeBridgeConfigurator nativeBridgeConfigurator = this.f95616a;
        z11 = nativeBridgeConfigurator.f95544c0;
        nativeBridgeConfigurator.P(i11, i12, intent, z11);
    }
}
