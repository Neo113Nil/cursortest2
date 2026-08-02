package io.sentry.util;

import io.sentry.AbstractC4779m;
import io.sentry.EnumC4788n3;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4813r1;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes3.dex */
public final class v implements InterfaceC4813r1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f52811a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f52812b;

    public v(Map map) {
        this.f52811a = map;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f52812b = arrayDeque;
        arrayDeque.addLast(map);
    }

    public final void A(ILogger iLogger, Date date) {
        try {
            e(AbstractC4779m.g(date));
        } catch (Exception e10) {
            iLogger.b(EnumC4788n3.ERROR, "Error when serializing Date", e10);
            l();
        }
    }

    public final void B(ILogger iLogger, Map map) {
        m();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                d((String) obj);
                j(iLogger, map.get(obj));
            }
        }
        t();
    }

    public final void C(ILogger iLogger, TimeZone timeZone) {
        try {
            e(timeZone.getID());
        } catch (Exception e10) {
            iLogger.b(EnumC4788n3.ERROR, "Error when serializing TimeZone", e10);
            l();
        }
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public v b(double d10) {
        y(Double.valueOf(d10));
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public v a(long j10) {
        y(Long.valueOf(j10));
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public v j(ILogger iLogger, Object obj) {
        if (obj == null) {
            l();
            return this;
        }
        if (obj instanceof Character) {
            e(Character.toString(((Character) obj).charValue()));
            return this;
        }
        if (obj instanceof String) {
            e((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            c(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Number) {
            i((Number) obj);
            return this;
        }
        if (obj instanceof Date) {
            A(iLogger, (Date) obj);
            return this;
        }
        if (obj instanceof TimeZone) {
            C(iLogger, (TimeZone) obj);
            return this;
        }
        if (obj instanceof G0) {
            ((G0) obj).serialize(this, iLogger);
            return this;
        }
        if (obj instanceof Collection) {
            z(iLogger, (Collection) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            z(iLogger, Arrays.asList((Object[]) obj));
            return this;
        }
        if (obj instanceof Map) {
            B(iLogger, (Map) obj);
            return this;
        }
        if (obj instanceof Locale) {
            e(obj.toString());
            return this;
        }
        if (obj instanceof AtomicIntegerArray) {
            z(iLogger, o.a((AtomicIntegerArray) obj));
            return this;
        }
        if (obj instanceof AtomicBoolean) {
            c(((AtomicBoolean) obj).get());
            return this;
        }
        if (obj instanceof URI) {
            e(obj.toString());
            return this;
        }
        if (obj instanceof InetAddress) {
            e(obj.toString());
            return this;
        }
        if (obj instanceof UUID) {
            e(obj.toString());
            return this;
        }
        if (obj instanceof Currency) {
            e(obj.toString());
            return this;
        }
        if (obj instanceof Calendar) {
            B(iLogger, o.d((Calendar) obj));
            return this;
        }
        if (obj.getClass().isEnum()) {
            e(obj.toString());
            return this;
        }
        iLogger.c(EnumC4788n3.WARNING, "Failed serializing unknown object.", obj);
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public v k(Boolean bool) {
        y(bool);
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public v i(Number number) {
        y(number);
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public v e(String str) {
        y(str);
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public v c(boolean z10) {
        y(Boolean.valueOf(z10));
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    public String f() {
        return null;
    }

    @Override // io.sentry.InterfaceC4813r1
    public InterfaceC4813r1 g(String str) {
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    public void h(String str) {
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public v p() {
        this.f52812b.add(new ArrayList());
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    public void q(boolean z10) {
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public v m() {
        this.f52812b.addLast(new HashMap());
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public v n() {
        t();
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public v t() {
        y(this.f52812b.removeLast());
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public v d(String str) {
        this.f52812b.add(str);
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public v l() {
        y(null);
        return this;
    }

    public final Map x() {
        Object peekLast = this.f52812b.peekLast();
        if (peekLast == null) {
            throw new IllegalStateException("Stack is empty.");
        }
        if (peekLast instanceof Map) {
            return (Map) peekLast;
        }
        throw new IllegalStateException("Stack element is not a Map.");
    }

    public final void y(Object obj) {
        Object peekLast = this.f52812b.peekLast();
        if (peekLast instanceof List) {
            ((List) peekLast).add(obj);
        } else {
            if (!(peekLast instanceof String)) {
                throw new IllegalStateException("Invalid stack state, expected array or string on top");
            }
            x().put((String) this.f52812b.removeLast(), obj);
        }
    }

    public final void z(ILogger iLogger, Collection collection) {
        p();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j(iLogger, it.next());
        }
        n();
    }
}
