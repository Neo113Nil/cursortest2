package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.wg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4384wg {
    void a() throws C4257pe;

    default void a(boolean z, @NotNull Function0<? extends IronSourceError> function0) {
        function0.getClass();
        if (!z) {
            throw new C4257pe((IronSourceError) function0.invoke());
        }
    }
}
