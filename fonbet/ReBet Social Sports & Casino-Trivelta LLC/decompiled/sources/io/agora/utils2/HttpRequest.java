package io.agora.utils2;

import io.agora.base.internal.CalledByNative;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class HttpRequest {
    private HashMap<String, String> headers = new HashMap<>();
    private Proxy httpProxy;
    private HttpAsyncTask httpTask;

    @CalledByNative
    public HttpRequest(long j10, String str, int i10) {
        this.httpTask = null;
        this.httpProxy = null;
        if (!str.isEmpty()) {
            this.httpProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i10));
        }
        this.httpTask = new HttpAsyncTask(j10);
    }

    @CalledByNative
    public void addHeader(String str, String str2) {
        this.headers.put(str, str2);
    }

    @CalledByNative
    public boolean send(String str, String str2, String str3, String str4, String str5, byte[] bArr, int i10) {
        HttpAsyncTaskParam httpAsyncTaskParam = new HttpAsyncTaskParam();
        httpAsyncTaskParam.fullUrl = str;
        httpAsyncTaskParam.method = str2;
        httpAsyncTaskParam.user = str3;
        httpAsyncTaskParam.pass = str4;
        httpAsyncTaskParam.agent = str5;
        httpAsyncTaskParam.body = bArr;
        httpAsyncTaskParam.httpProxy = this.httpProxy;
        httpAsyncTaskParam.headers = this.headers;
        httpAsyncTaskParam.timeout_millsec = i10;
        this.httpTask.execute(httpAsyncTaskParam);
        return true;
    }
}
