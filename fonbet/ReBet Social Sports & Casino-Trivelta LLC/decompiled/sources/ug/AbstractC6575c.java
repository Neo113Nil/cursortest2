package ug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Logger;

/* renamed from: ug.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6575c extends Thread {

    /* renamed from: d, reason: collision with root package name */
    public static Logger f66641d = Logger.getLogger(AbstractC6575c.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final Integer f66642e = new Integer(1);

    /* renamed from: f, reason: collision with root package name */
    public static final Integer f66643f = new Integer(2);

    /* renamed from: a, reason: collision with root package name */
    public LinkedBlockingQueue f66644a;

    /* renamed from: b, reason: collision with root package name */
    public LinkedHashMap f66645b;

    /* renamed from: c, reason: collision with root package name */
    public a f66646c;

    /* renamed from: ug.c$a */
    public class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public long f66647a;

        /* renamed from: b, reason: collision with root package name */
        public long f66648b;

        public a(String str, long j10, long j11) {
            super(str);
            this.f66647a = j10;
            this.f66648b = j11;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(this.f66648b);
            } catch (Exception unused) {
            }
            while (true) {
                try {
                    ArrayList arrayList = new ArrayList();
                    synchronized (AbstractC6575c.this.f66645b) {
                        Iterator it = AbstractC6575c.this.f66645b.values().iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            try {
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                            if (!AbstractC6575c.this.c(next)) {
                                break;
                            }
                            arrayList.add(next);
                            it.remove();
                        }
                    }
                    if (arrayList.size() > 0) {
                        AbstractC6575c.this.b(arrayList);
                    }
                    Thread.sleep(this.f66647a);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    public AbstractC6575c(String str, long j10, long j11) {
        super(str + "-queue");
        this.f66644a = new LinkedBlockingQueue();
        this.f66645b = new LinkedHashMap(100, 0.75f, true);
        start();
        a aVar = new a(str + "-tracker", j10, j11);
        this.f66646c = aVar;
        aVar.start();
    }

    public abstract void b(ArrayList arrayList);

    public abstract boolean c(Object obj);

    public void d(Object obj) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("obj", obj);
            hashMap.put("opr", f66643f);
            this.f66644a.put(hashMap);
        } catch (Exception e10) {
            e10.printStackTrace();
            f66641d.warning("Error queueing in TimeOutListener - remove");
        }
    }

    public void e(Object obj) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("obj", obj);
            hashMap.put("opr", f66642e);
            this.f66644a.put(hashMap);
        } catch (Exception unused) {
            f66641d.warning("Error queueing in TimeOutListener - touch");
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                HashMap hashMap = (HashMap) this.f66644a.take();
                synchronized (this.f66645b) {
                    try {
                        if (((Integer) hashMap.get("opr")) == f66642e) {
                            this.f66645b.put(hashMap.get("obj"), hashMap.get("obj"));
                        } else {
                            this.f66645b.remove(hashMap.get("obj"));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public AbstractC6575c(String str, long j10) {
        this(str, j10, j10);
    }
}
