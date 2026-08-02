package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C0493t1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AppMetricaJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C0493t1 f15014a;

    public AppMetricaJsInterface(@NonNull C0493t1 c0493t1) {
        this.f15014a = c0493t1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f15014a.d(str, str2);
    }
}
