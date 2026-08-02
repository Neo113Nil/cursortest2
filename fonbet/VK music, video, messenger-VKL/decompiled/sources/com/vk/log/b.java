package com.vk.log;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import xsna.izs;
import xsna.k200;
import xsna.rxc0;

/* compiled from: ExtraFileLogger.kt */
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: ExtraFileLogger.kt */
    public static final class a {
        public static /* synthetic */ void a(b bVar, L.LogType logType, String str, VKApiExecutionException vKApiExecutionException, k200.a aVar, int i) {
            if ((i & 4) != 0) {
                vKApiExecutionException = null;
            }
            VKApiExecutionException vKApiExecutionException2 = vKApiExecutionException;
            boolean z = (i & 8) == 0;
            izs<? super String, String> izsVar = aVar;
            if ((i & 16) != 0) {
                izsVar = new rxc0(1);
            }
            bVar.a(logType, str, vKApiExecutionException2, z, izsVar);
        }
    }

    void a(L.LogType logType, String str, Throwable th, boolean z, izs<? super String, String> izsVar);

    void release();
}
