package com.appsflyer.internal;

import defpackage.p2g;
import defpackage.p62;
import defpackage.u2g;
import defpackage.w2g;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFj1vSDK implements AFi1bSDK {
    @Override // com.appsflyer.internal.AFi1bSDK
    @NotNull
    public final String AFKeystoreWrapper() {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            Field declaredField = p62.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            obj.getClass();
            u2gVar = (String) obj;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = "";
        }
        return (String) u2gVar;
    }
}
