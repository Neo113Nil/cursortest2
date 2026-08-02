package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class u4d {
    public final p4d a;
    public final AtomicLong b = new AtomicLong(524288);
    public final AtomicLong c = new AtomicLong(67108864);
    public final AtomicLong d = new AtomicLong();
    public final AtomicLong e = new AtomicLong(0);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicReference g = new AtomicReference();

    public u4d(p4d p4dVar) {
        this.a = p4dVar;
    }

    public abstract bo3 a();
}
