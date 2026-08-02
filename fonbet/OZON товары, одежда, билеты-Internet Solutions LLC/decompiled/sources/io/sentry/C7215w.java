package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7215w implements InterfaceC7227z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Throwable, Object> f68650a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final W2 f68651b;

    public C7215w(@NotNull W2 w22) {
        this.f68651b = w22;
    }

    @Override // io.sentry.InterfaceC7227z
    public final C7230z2 d(@NotNull C7230z2 c7230z2, @NotNull E e11) {
        W2 w22 = this.f68651b;
        if (!w22.isEnableDeduplication()) {
            w22.getLogger().c(I2.DEBUG, "Event deduplication is disabled.", new Object[0]);
            return c7230z2;
        }
        Throwable O11 = c7230z2.O();
        if (O11 == null) {
            return c7230z2;
        }
        Map<Throwable, Object> map = this.f68650a;
        if (!map.containsKey(O11)) {
            ArrayList arrayList = new ArrayList();
            for (Throwable th2 = O11; th2.getCause() != null; th2 = th2.getCause()) {
                arrayList.add(th2.getCause());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (map.containsKey(it.next())) {
                }
            }
            map.put(O11, null);
            return c7230z2;
        }
        w22.getLogger().c(I2.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", c7230z2.G());
        return null;
    }
}
