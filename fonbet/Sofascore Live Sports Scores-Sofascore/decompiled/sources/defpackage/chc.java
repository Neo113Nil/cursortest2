package defpackage;

import java.io.Serializable;
import java.time.Duration;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class chc {
    public AbstractCollection a;
    public Serializable b;
    public Serializable c;
    public Serializable d;

    public chc(Node node) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = new ArrayList();
        try {
            String b = elg.b(node, "id");
            if (b != null) {
                Integer.parseInt(b);
            }
        } catch (Exception unused) {
        }
        NodeList a = elg.a(node, "./UniversalAdId");
        new ArrayList();
        for (int i = 0; i < a.getLength(); i++) {
            ArrayList arrayList = (ArrayList) this.d;
            Node item = a.item(i);
            ykg ykgVar = new ykg();
            ykgVar.a = elg.b(item, "idRegistry");
            ykgVar.b = elg.b(item, "idValue");
            String trim = item.getTextContent().trim();
            if (trim.length() > 0) {
                ykgVar.b = trim;
            }
            arrayList.add(ykgVar);
        }
    }

    public g5d a(Duration duration) {
        g5d g5dVar;
        AtomicInteger atomicInteger = (AtomicInteger) this.d;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.a;
        if (duration == null || atomicInteger.get() == 2) {
            g5dVar = (g5d) linkedBlockingQueue.poll();
        } else {
            long nanos = duration.toNanos();
            if (nanos < 1) {
                g5dVar = null;
                while (atomicInteger.get() != 0 && (g5dVar = (g5d) linkedBlockingQueue.poll(3650L, TimeUnit.DAYS)) == null) {
                }
            } else {
                g5dVar = (g5d) linkedBlockingQueue.poll(nanos, TimeUnit.NANOSECONDS);
            }
        }
        if (g5dVar == null || g5dVar == avb.n) {
            return null;
        }
        return g5dVar;
    }

    public void b() {
        if (((AtomicInteger) this.d).compareAndSet(1, 0)) {
            ((LinkedBlockingQueue) this.a).offer(avb.n);
        }
    }

    public chc() {
        this(Integer.MAX_VALUE);
    }

    public chc(int i) {
        this.a = new LinkedBlockingQueue(i <= 0 ? Integer.MAX_VALUE : i);
        this.b = new AtomicLong(0L);
        this.c = new AtomicLong(0L);
        this.d = new AtomicInteger(1);
    }
}
