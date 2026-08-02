package com.playtika.pras.sdk.network;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.RetryPolicy;
import com.android.volley.toolbox.BaseHttpStack;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.NoCache;

/* loaded from: classes3.dex */
public class NetworkApi implements INetworkApi {
    private static final int DEFAULT_TIMEOUT = 30000;
    private static NetworkApi _instance;
    private RequestQueue queue;

    private NetworkApi() {
    }

    public static synchronized NetworkApi getInstance() {
        NetworkApi networkApi;
        synchronized (NetworkApi.class) {
            if (_instance == null) {
                _instance = new NetworkApi();
            }
            networkApi = _instance;
        }
        return networkApi;
    }

    private RequestQueue getQueue() {
        if (this.queue == null) {
            RequestQueue requestQueue = new RequestQueue(new NoCache(), new BasicNetwork((BaseHttpStack) new HurlStack()));
            this.queue = requestQueue;
            requestQueue.start();
        }
        return this.queue;
    }

    public <T> void addRequest(Request<T> request) {
        addRequest(request, 30000);
    }

    @Override // com.playtika.pras.sdk.network.INetworkApi
    public void cancelRequest(String str) {
        getQueue().cancelAll(str);
    }

    @Override // com.playtika.pras.sdk.network.INetworkApi
    public void destroy() {
        RequestQueue requestQueue = this.queue;
        if (requestQueue != null) {
            requestQueue.stop();
            this.queue = null;
        }
    }

    public <T> void addRequest(Request<T> request, int i) {
        addRequest(request, i, 1);
    }

    public <T> void addRequest(Request<T> request, int i, int i2) {
        request.setRetryPolicy(new DefaultRetryPolicy(i, i2, 1.0f));
        getQueue().add(request);
    }

    public <T> void addRequest(Request<T> request, RetryPolicy retryPolicy) {
        request.setRetryPolicy(retryPolicy);
        getQueue().add(request);
    }
}
