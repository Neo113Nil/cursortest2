package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ti9 {
    public final /* synthetic */ int a;
    public final HashMap b;
    public Map c;

    public ti9(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new HashMap();
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }

    public final synchronized Map a() {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    Map map = this.c;
                    if (map == null) {
                        map = Collections.unmodifiableMap(new HashMap(this.b));
                        this.c = map;
                    }
                    return map;
                default:
                    Map map2 = this.c;
                    if (map2 == null) {
                        map2 = Collections.unmodifiableMap(new HashMap(this.b));
                        this.c = map2;
                    }
                    return map2;
            }
        }
    }
}
