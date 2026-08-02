package Ai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import zi.InterfaceC7015a;

/* loaded from: classes5.dex */
public class f implements ILoggerFactory {

    /* renamed from: a, reason: collision with root package name */
    public boolean f477a = false;

    /* renamed from: b, reason: collision with root package name */
    public final Map f478b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f479c = new LinkedBlockingQueue();

    @Override // org.slf4j.ILoggerFactory
    public synchronized InterfaceC7015a a(String str) {
        e eVar;
        eVar = (e) this.f478b.get(str);
        if (eVar == null) {
            eVar = new e(str, this.f479c, this.f477a);
            this.f478b.put(str, eVar);
        }
        return eVar;
    }

    public void b() {
        this.f478b.clear();
        this.f479c.clear();
    }

    public LinkedBlockingQueue c() {
        return this.f479c;
    }

    public List d() {
        return new ArrayList(this.f478b.values());
    }

    public void e() {
        this.f477a = true;
    }
}
