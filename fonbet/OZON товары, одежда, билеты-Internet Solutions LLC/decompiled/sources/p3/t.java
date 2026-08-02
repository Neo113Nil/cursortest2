package p3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f80121a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f80122b;

    public final synchronized Map<String, String> a() {
        try {
            if (this.f80122b == null) {
                this.f80122b = Collections.unmodifiableMap(new HashMap(this.f80121a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f80122b;
    }
}
