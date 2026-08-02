package h1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4429y {

    /* renamed from: a, reason: collision with root package name */
    public final Map f47624a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Map f47625b;

    public synchronized void a(Map map) {
        this.f47625b = null;
        this.f47624a.clear();
        this.f47624a.putAll(map);
    }

    public synchronized Map b() {
        try {
            if (this.f47625b == null) {
                this.f47625b = Collections.unmodifiableMap(new HashMap(this.f47624a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47625b;
    }
}
