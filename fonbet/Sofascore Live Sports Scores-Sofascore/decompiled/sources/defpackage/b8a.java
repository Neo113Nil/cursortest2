package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b8a {
    public static final Logger d = Logger.getLogger(b8a.class.getName());
    public static final b8a e = new b8a();
    public final ConcurrentSkipListMap a;
    public final ConcurrentHashMap b;
    public final ConcurrentHashMap c;

    public b8a() {
        new ConcurrentSkipListMap();
        this.a = new ConcurrentSkipListMap();
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
