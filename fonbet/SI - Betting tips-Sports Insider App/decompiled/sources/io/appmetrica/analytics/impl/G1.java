package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.internal.AppMetricaService;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class G1 {

    /* renamed from: a, reason: collision with root package name */
    public final SafePackageManager f12251a = new SafePackageManager();

    public final Intent a(Context context) {
        Bundle bundle;
        C0055bj c0055bj;
        C0040b4.l().f13390u.getClass();
        Intent data = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme(G7.f12256b).authority(context.getPackageName()).path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Bf.f12059c).build());
        ApplicationInfo applicationInfo = this.f12251a.getApplicationInfo(context, context.getPackageName(), 128);
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            bundle = new Bundle();
        }
        Intent putExtras = data.putExtras(bundle);
        C0040b4 l6 = C0040b4.l();
        synchronized (l6) {
            try {
                if (l6.f13385o == null) {
                    C0055bj c0055bj2 = new C0055bj();
                    l6.f13385o = c0055bj2;
                    l6.f13379h.a(c0055bj2);
                }
                c0055bj = l6.f13385o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ScreenInfo b10 = c0055bj.b(context);
        return putExtras.putExtra("screen_size", b10 != null ? AbstractC0176gb.a(b10) : null);
    }
}
