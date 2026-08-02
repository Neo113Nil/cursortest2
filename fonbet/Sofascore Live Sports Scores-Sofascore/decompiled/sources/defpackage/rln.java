package defpackage;

import android.content.Context;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.zzfyp;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class rln implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ rln(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                try {
                    return zzfyp.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            case 1:
                return context.getSharedPreferences("google_sdk_flags", 0);
            case 2:
                return WebSettings.getDefaultUserAgent(context);
            default:
                try {
                    return yaa.S(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    return null;
                }
        }
    }
}
