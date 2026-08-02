package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final /* synthetic */ class a extends C7735q implements Function1<String, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        String p02 = str;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return Boolean.valueOf(((NativeBridgeConfigurator) this.receiver).C(p02));
    }
}
