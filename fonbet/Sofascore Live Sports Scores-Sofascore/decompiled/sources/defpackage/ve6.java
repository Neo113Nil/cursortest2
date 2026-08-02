package defpackage;

import com.google.android.gms.internal.ads.zzfm;
import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ve6 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ ve6(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new ue6(runnable, 0));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) serializable).getAndIncrement());
                return newThread;
            default:
                String str = zzfm.a;
                return new Thread(runnable, (String) serializable);
        }
    }
}
