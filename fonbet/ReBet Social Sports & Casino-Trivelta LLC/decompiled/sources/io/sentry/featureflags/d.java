package io.sentry.featureflags;

import io.sentry.InterfaceC4765j0;
import io.sentry.protocol.C4805g;
import io.sentry.protocol.C4806h;
import io.sentry.util.C4843a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public Map f52076a = null;

    /* renamed from: b, reason: collision with root package name */
    public final C4843a f52077b = new C4843a();

    public static b a() {
        return new d();
    }

    @Override // io.sentry.featureflags.b
    public void clear() {
        InterfaceC4765j0 d10 = this.f52077b.d();
        try {
            this.f52076a = null;
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.featureflags.b
    public C4806h l() {
        InterfaceC4765j0 d10 = this.f52077b.d();
        try {
            Map map = this.f52076a;
            if (map != null && !map.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f52076a.size());
                for (Map.Entry entry : this.f52076a.entrySet()) {
                    arrayList.add(new C4805g((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                C4806h c4806h = new C4806h(arrayList);
                if (d10 != null) {
                    d10.close();
                }
                return c4806h;
            }
            if (d10 != null) {
                d10.close();
            }
            return null;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.featureflags.b
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public b m141clone() {
        return a();
    }
}
