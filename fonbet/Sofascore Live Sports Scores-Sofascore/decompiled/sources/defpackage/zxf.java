package defpackage;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URL;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zxf {
    public final kf0 a;
    public final CoroutineContext b;

    public zxf(kf0 kf0Var, CoroutineContext coroutineContext) {
        kf0Var.getClass();
        coroutineContext.getClass();
        this.a = kf0Var;
        this.b = coroutineContext;
    }

    public final URL a() {
        Uri.Builder appendPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        kf0 kf0Var = this.a;
        Uri.Builder appendPath2 = appendPath.appendPath(kf0Var.a).appendPath("settings");
        px pxVar = kf0Var.b;
        return new URL(appendPath2.appendQueryParameter("build_version", pxVar.c).appendQueryParameter("display_version", pxVar.b).build().toString());
    }
}
