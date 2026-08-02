package io.sentry;

import com.google.firebase.datatransport.TransportRegistrar;
import java.util.concurrent.ConcurrentHashMap;
import n8.InterfaceC8452b;

/* renamed from: io.sentry.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7137e implements n8.e {
    public static void b(ConcurrentHashMap concurrentHashMap, String str, C7212v0 c7212v0, String str2, ILogger iLogger) {
        Object obj = concurrentHashMap.get(str);
        c7212v0.g(str2);
        c7212v0.m(iLogger, obj);
    }

    @Override // n8.e
    public Object a(InterfaceC8452b interfaceC8452b) {
        Q6.i lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(interfaceC8452b);
        return lambda$getComponents$0;
    }
}
