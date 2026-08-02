package defpackage;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ze5 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MultithreadedBundleWrapper c;
    public final /* synthetic */ AudienceNetworkAds.InitListener d;

    public ze5(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z) {
        this.a = context;
        this.b = z;
        this.c = multithreadedBundleWrapper;
        this.d = initListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        DynamicLoader dynamicLoader;
        AtomicBoolean atomicBoolean;
        int i;
        ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.a);
        synchronized (DynamicLoaderFactory.class) {
            DynamicLoader dynamicLoader2 = null;
            th = null;
            int i2 = 0;
            while (i2 < 3) {
                try {
                    dynamicLoader2 = DynamicLoaderFactory.doMakeLoader(this.a, false);
                    break;
                } finally {
                    if (i2 == i) {
                        try {
                        } catch (Throwable th2) {
                        }
                    }
                }
            }
            dynamicLoader = dynamicLoader2;
        }
        DynamicLoaderFactory.doCallInitialize(this.a, dynamicLoader, th, this.b, this.c, this.d);
        atomicBoolean = DynamicLoaderFactory.sInitializing;
        atomicBoolean.set(false);
    }
}
