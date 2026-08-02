package com.vk.api.sdk;

import java.util.concurrent.TimeUnit;
import okhttp3.o;
import xsna.k6r0;

/* compiled from: VKOkHttpProvider.kt */
/* loaded from: classes.dex */
public abstract class b {

    /* compiled from: VKOkHttpProvider.kt */
    /* loaded from: classes15.dex */
    public static final class a extends b {
        @Override // com.vk.api.sdk.b
        public final o a() {
            o.a aVar = new o.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar.c(20L, timeUnit);
            aVar.e(30L, timeUnit);
            aVar.g(20L, timeUnit);
            aVar.h = true;
            aVar.i = true;
            int i = k6r0.a;
            throw new RuntimeException("please call VK.initialize first!");
        }
    }

    public abstract o a();
}
