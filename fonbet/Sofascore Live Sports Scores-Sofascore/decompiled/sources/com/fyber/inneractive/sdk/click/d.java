package com.fyber.inneractive.sdk.click;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.k1;
import com.fyber.inneractive.sdk.util.l1;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d extends a {
    public boolean a = false;

    @Override // com.fyber.inneractive.sdk.click.a
    public final b a(Context context, Uri uri, List list) {
        Uri uri2;
        Uri uri3;
        Uri uri4;
        if (!a(uri, (r) null)) {
            return null;
        }
        PriorityQueue priorityQueue = new PriorityQueue();
        String queryParameter = uri.getQueryParameter("primaryUrl");
        List<String> queryParameters = uri.getQueryParameters("primaryTrackingUrl");
        k1 k1Var = k1.Primary;
        try {
            uri2 = Uri.parse(queryParameter);
        } catch (Exception unused) {
            uri2 = null;
        }
        if (uri2 != null) {
            priorityQueue.offer(new l1(k1Var, uri2, queryParameters));
        }
        String queryParameter2 = uri.getQueryParameter("fallbackUrl");
        List<String> queryParameters2 = uri.getQueryParameters("fallbackTrackingUrl");
        k1 k1Var2 = k1.FallBack;
        try {
            uri3 = Uri.parse(queryParameter2);
        } catch (Exception unused2) {
            uri3 = null;
        }
        if (uri3 != null) {
            priorityQueue.offer(new l1(k1Var2, uri3, queryParameters2));
        }
        if (priorityQueue.size() <= 0) {
            String uri5 = uri.toString();
            q qVar = q.DEEP_LINK;
            if (list != null) {
                list.add(new j(uri5, false, qVar, null));
            }
            return r.a(uri.toString(), "FyberDeepLink", "fyberDeepLink is not valid");
        }
        while (true) {
            l1 l1Var = (l1) priorityQueue.poll();
            if (l1Var == null) {
                uri4 = null;
                break;
            }
            uri4 = l1Var.b;
            String scheme = uri4.getScheme();
            q a = a.a(uri4, (TextUtils.isEmpty(scheme) || !scheme.toLowerCase(Locale.US).startsWith("http")) ? q.OPEN_IN_EXTERNAL_APPLICATION : q.OPENED_IN_EXTERNAL_BROWSER);
            boolean a2 = h0.a(context, new Intent("android.intent.action.VIEW", uri4));
            String uri6 = uri4.toString();
            if (list != null) {
                list.add(new j(uri6, a2, a, null));
            }
            if (a2) {
                for (String str : l1Var.c) {
                    if (!TextUtils.isEmpty(str)) {
                        IAlog.d("%s %s", "SMART_LINK", str);
                        z0.b(str);
                    }
                }
            }
            if (!a2) {
                uri4 = null;
            }
            if (uri4 != null) {
                break;
            }
        }
        if (uri4 != null) {
            return new b(uri.toString(), a.a(uri4, q.OPEN_IN_EXTERNAL_APPLICATION), "FyberDeepLink", null);
        }
        return r.a(uri.toString(), "FyberDeepLink", "tryHandleDeepLinkWithExternalApp has failed");
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(Uri uri, r rVar) {
        return "smartlink".equalsIgnoreCase(uri.getScheme()) && !this.a;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void a() {
        this.a = true;
    }
}
