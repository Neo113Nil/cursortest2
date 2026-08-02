package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.a0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC2319a0 {
    String a();

    default void a(J9 adInstance, Map<String, String> loadParams) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
    }
}
