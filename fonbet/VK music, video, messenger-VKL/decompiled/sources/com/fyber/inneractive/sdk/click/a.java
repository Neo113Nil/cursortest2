package com.fyber.inneractive.sdk.click;

import android.content.Context;
import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class a {
    public static q a(Uri uri, q qVar) {
        if (uri != null) {
            String host = uri.getHost();
            String scheme = uri.getScheme();
            if ("market".equalsIgnoreCase(scheme) || (("http".equalsIgnoreCase(scheme) || HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) && ("play.google.com".equalsIgnoreCase(host) || "market.android.com".equalsIgnoreCase(host)))) {
                return q.OPEN_GOOGLE_STORE;
            }
        }
        return qVar;
    }

    public abstract b a(Context context, Uri uri, List list);

    public abstract void a();

    public abstract boolean a(Uri uri, r rVar);
}
