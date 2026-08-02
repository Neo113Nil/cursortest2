package org.chromium.net.impl;

import internal.org.jni_zero.JNINamespace;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.chromium.net.Proxy;

@JNINamespace("cronet")
/* loaded from: classes10.dex */
final class ProxyCallbackRequestImpl extends Proxy.Callback.Request {
    private boolean mIsConsumed;
    private final long mProxyCallbackRequestAdapter;

    interface Natives {
        void cancel(long nativeProxyCallbackRequestAdapter);

        boolean proceed(long nativeProxyCallbackRequestAdapter, String[] extraHeaders);
    }

    ProxyCallbackRequestImpl(long proxyCallbackRequestAdapter) {
        this.mProxyCallbackRequestAdapter = proxyCallbackRequestAdapter;
    }

    @Override // org.chromium.net.Proxy.Callback.Request
    public void proceed(List<Map.Entry<String, String>> extraHeaders) {
        if (this.mIsConsumed) {
            throw new IllegalStateException("This request has already been consumed: either proceed or close has already been called");
        }
        Objects.requireNonNull(extraHeaders);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : extraHeaders) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        if (!ProxyCallbackRequestImplJni.get().proceed(this.mProxyCallbackRequestAdapter, (String[]) arrayList.toArray(new String[arrayList.size()]))) {
            throw new IllegalArgumentException("One of the headers is invalid");
        }
        this.mIsConsumed = true;
    }

    @Override // org.chromium.net.Proxy.Callback.Request, java.lang.AutoCloseable
    public void close() {
        if (this.mIsConsumed) {
            return;
        }
        ProxyCallbackRequestImplJni.get().cancel(this.mProxyCallbackRequestAdapter);
        this.mIsConsumed = true;
    }
}
