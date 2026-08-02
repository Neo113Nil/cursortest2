package defpackage;

import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class re6 implements yff {
    public final /* synthetic */ int a;

    public /* synthetic */ re6(int i) {
        this.a = i;
    }

    @Override // defpackage.yff
    public final Object get() {
        switch (this.a) {
            case 0:
                return new wog(Executors.newSingleThreadExecutor(), 0);
            default:
                kif kifVar = new kif(5);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    yhk.s("Null flags");
                    return null;
                }
                hashMap.put(i7f.a, new cv0(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, 86400000L, set));
                if (set == null) {
                    yhk.s("Null flags");
                    return null;
                }
                hashMap.put(i7f.c, new cv0(1000L, 86400000L, set));
                if (set == null) {
                    yhk.s("Null flags");
                    return null;
                }
                Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(isg.b)));
                if (unmodifiableSet == null) {
                    yhk.s("Null flags");
                    return null;
                }
                hashMap.put(i7f.b, new cv0(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() >= i7f.values().length) {
                    new HashMap();
                    return new bv0(kifVar, hashMap);
                }
                a70.r("Not all priorities have been configured");
                return null;
        }
    }
}
