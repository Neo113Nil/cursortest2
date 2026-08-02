package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import gf.p;
import gf.q;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFj1hSDK implements AFj1iSDK {
    @Override // com.appsflyer.internal.AFj1iSDK
    @NotNull
    public final String getMediationNetwork() {
        Object h10;
        try {
            gf.o oVar = q.f10031a;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.checkNotNull(obj, "");
            h10 = (String) obj;
        } catch (Throwable th2) {
            gf.o oVar2 = q.f10031a;
            h10 = h8.b.h(th2);
        }
        return (String) (h10 instanceof p ? "" : h10);
    }
}
