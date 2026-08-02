package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ajh {
    public static final /* synthetic */ AtomicReference a = new AtomicReference(null);

    /* JADX WARN: Multi-variable type inference failed */
    public static final apf a(Context context) {
        apf apfVar;
        apf apfVar2;
        AtomicReference atomicReference = a;
        Object obj = atomicReference.get();
        apf apfVar3 = obj instanceof apf ? (apf) obj : null;
        if (apfVar3 != null) {
            return apfVar3;
        }
        apf apfVar4 = null;
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof apf) {
                apfVar = (apf) obj2;
                apfVar2 = apfVar4;
            } else {
                if (apfVar4 == null) {
                    Context applicationContext = context.getApplicationContext();
                    zih zihVar = obj2 instanceof zih ? (zih) obj2 : null;
                    if (zihVar != null) {
                        apfVar4 = zihVar.a(applicationContext);
                    } else {
                        zih zihVar2 = applicationContext instanceof zih ? (zih) applicationContext : null;
                        apfVar4 = zihVar2 != null ? zihVar2.a(applicationContext) : cjh.a.a(applicationContext);
                    }
                }
                apfVar = apfVar4;
                apfVar2 = apfVar;
            }
            while (!atomicReference.compareAndSet(obj2, apfVar)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            return apfVar;
            apfVar4 = apfVar2;
        }
    }
}
