package org.chromium.net.impl;

import Cm.RunnableC2781a;
import Ra.g;
import android.net.Network;
import android.net.http.HttpEngine;
import android.net.http.UrlRequest;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.C;
import org.chromium.net.y;

/* renamed from: org.chromium.net.impl.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8774m extends D {

    /* renamed from: a, reason: collision with root package name */
    private final HttpEngine f78935a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<y.a, g0> f78936b = Collections.synchronizedMap(new HashMap());

    public C8774m(HttpEngine httpEngine) {
        this.f78935a = httpEngine;
    }

    @Override // org.chromium.net.i
    public final C.a a(String str, C.b bVar, Va.a aVar) {
        return new b0(str, bVar, aVar, this);
    }

    @Override // org.chromium.net.impl.D
    public final org.chromium.net.k c(String str, C.b bVar, Va.a aVar, int i11, boolean z11, g.d dVar, long j11, String str2, ArrayList arrayList, org.chromium.net.A a11, Va.a aVar2, @NonNull String str3) {
        UrlRequest.Builder newUrlRequestBuilder;
        UrlRequest build;
        C8785y c8785y = new C8785y(bVar);
        newUrlRequestBuilder = this.f78935a.newUrlRequestBuilder(str, aVar, c8785y);
        newUrlRequestBuilder.setPriority(i11);
        if (z11) {
            newUrlRequestBuilder.setCacheDisabled(z11);
        }
        newUrlRequestBuilder.bindToNetwork(j11 == -1 ? null : Network.fromNetworkHandle(j11));
        newUrlRequestBuilder.setHttpMethod(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            newUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (a11 != null) {
            newUrlRequestBuilder.setUploadDataProvider(new C8780t(a11), aVar2);
        }
        build = newUrlRequestBuilder.build();
        C8786z c8786z = new C8786z(build, this, str, dVar);
        c8785y.d(c8786z);
        return c8786z;
    }

    final void d(org.chromium.net.y yVar, g0 g0Var) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f78936b) {
            arrayList.addAll(this.f78936b.values());
        }
        if (g0Var != null) {
            arrayList.add(g0Var);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g0 g0Var2 = (g0) it.next();
            try {
                g0Var2.a().execute(new RunnableC2781a(7, g0Var2, yVar));
            } catch (RejectedExecutionException e11) {
                Log.e("HttpEngineWrapper", "Exception posting task to executor", e11);
            }
        }
    }
}
