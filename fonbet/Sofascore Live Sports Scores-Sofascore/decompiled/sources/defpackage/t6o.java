package defpackage;

import android.os.Build;
import android.util.Base64;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.InstrumentationData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t6o {
    public final qrn b;
    public final pic c;
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public int d = 1;

    public t6o(mqn mqnVar, pic picVar) {
        this.b = mqnVar;
        this.c = picVar;
    }

    public static String a() {
        gen s = hen.s();
        String str = Build.MODEL;
        s.getClass();
        s.b();
        ((hen) s.b).v(str);
        String str2 = Build.MANUFACTURER;
        s.b();
        ((hen) s.b).u(str2);
        String str3 = Build.VERSION.RELEASE;
        s.b();
        ((hen) s.b).t(str3);
        return Base64.encodeToString(((hen) s.c()).b(), 0);
    }

    public static qen c(long j, long j2) {
        pen s = qen.s();
        s.f(j);
        s.g(j2);
        return (qen) s.c();
    }

    public final sen b(String str) {
        pic picVar = this.c;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) picVar.c;
        if (!concurrentHashMap.containsKey(str)) {
            int i = picVar.b;
            picVar.b = i + 1;
            concurrentHashMap.put(str, new u7o(i));
        }
        return ((u7o) concurrentHashMap.get(str)).a;
    }

    public final void d(InstrumentationData.Component component, InstrumentationData.Method method, Throwable th) {
        e(InstrumentationData.create(System.currentTimeMillis(), component, method, th, a()));
    }

    public final void e(InstrumentationData instrumentationData) {
        lda ldaVar = new lda(JavaScriptMessage$MsgChannel.adsLoader, JavaScriptMessage$MsgType.nativeInstrumentation, "*", instrumentationData, null);
        int i = this.d;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                return;
            }
            ((mqn) this.b).d(ldaVar);
        } else {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.a;
            if (concurrentLinkedQueue.size() > 6) {
                this.d = 3;
            } else {
                concurrentLinkedQueue.add(ldaVar);
            }
        }
    }
}
