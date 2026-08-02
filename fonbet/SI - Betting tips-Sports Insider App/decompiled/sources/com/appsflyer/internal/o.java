package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebMessage;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import com.google.firebase.messaging.x;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.impl.L0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.sentry.ILogger;
import io.sentry.android.core.n0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4182c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4184e;

    public /* synthetic */ o(int i5, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f4180a = i5;
        this.f4181b = obj;
        this.f4182c = obj2;
        this.f4183d = obj3;
        this.f4184e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5 = this.f4180a;
        Object obj = this.f4184e;
        Object obj2 = this.f4183d;
        Object obj3 = this.f4182c;
        Object obj4 = this.f4181b;
        switch (i5) {
            case 0:
                ((AFj1sSDK) obj4).getMediationNetwork((Context) obj3, (Runnable) obj2, (AFd1zSDK) obj);
                return;
            case 1:
                x xVar = (x) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                WebView webView = (WebView) obj2;
                WebMessage webMessage = (WebMessage) obj;
                xVar.getClass();
                try {
                    ((ba.d) xVar.f6183b).h(String.format("Posting message %s to web view %d", jSONObject.getString("type"), Integer.valueOf(System.identityHashCode(webView))));
                } catch (JSONException unused) {
                }
                webView.postWebMessage(webMessage, (Uri) xVar.f6185d);
                return;
            case 2:
                List list = (List) obj4;
                m3.j jVar = (m3.j) obj3;
                e3.c cVar = (e3.c) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((f3.h) it.next()).d(jVar.f20321a);
                }
                f3.j.b(cVar, workDatabase, list);
                return;
            case 3:
                F0.a((F0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 4:
                L0.a((L0) obj4, (String) obj3, (String) obj2, (PluginErrorDetails) obj);
                return;
            case 5:
                Window window = (Window) obj4;
                Window.Callback callback = (Window.Callback) obj3;
                Runnable runnable = (Runnable) obj2;
                n0 n0Var = (n0) obj;
                View peekDecorView = window.peekDecorView();
                if (peekDecorView != null) {
                    window.setCallback(callback);
                    io.sentry.android.core.internal.util.i.b(peekDecorView, runnable, n0Var);
                    return;
                }
                return;
            default:
                ILogger iLogger = (ILogger) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                try {
                    ((View) obj4).draw((Canvas) obj3);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
        }
    }
}
