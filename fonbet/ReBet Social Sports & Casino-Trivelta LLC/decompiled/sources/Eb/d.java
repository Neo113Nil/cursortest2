package Eb;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static volatile d f3031b;

    /* renamed from: a, reason: collision with root package name */
    public final Set f3032a = new HashSet();

    public static d a() {
        d dVar;
        d dVar2 = f3031b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f3031b;
                if (dVar == null) {
                    dVar = new d();
                    f3031b = dVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public Set b() {
        Set unmodifiableSet;
        synchronized (this.f3032a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f3032a);
        }
        return unmodifiableSet;
    }
}
