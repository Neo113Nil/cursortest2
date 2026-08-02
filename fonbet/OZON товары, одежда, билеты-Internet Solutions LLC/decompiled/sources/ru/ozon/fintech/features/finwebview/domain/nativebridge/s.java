package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

/* loaded from: classes3.dex */
final /* synthetic */ class s extends C7735q implements Function1<Boolean, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Boolean bool) {
        NativeBridgeConfigurator.s((NativeBridgeConfigurator) this.receiver, bool.booleanValue());
        return Boolean.TRUE;
    }
}
