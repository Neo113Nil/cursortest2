package Yh;

import Ph.M;
import Sh.C1573k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class a extends AbstractCoroutineContextElement implements M {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f14262c;

    /* renamed from: a, reason: collision with root package name */
    public static final a f14260a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f14261b = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final List f14263d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static final Map f14264e = new LinkedHashMap();

    public a() {
        super(M.f9041T2);
    }

    public final boolean Y1(Throwable th2) {
        synchronized (f14261b) {
            if (!f14262c) {
                return false;
            }
            if (f14260a.Z1(th2)) {
                return true;
            }
            f14263d.add(th2);
            return false;
        }
    }

    public final boolean Z1(Throwable th2) {
        Iterator it = f14264e.values().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(th2);
            z10 = true;
        }
        return z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) || (obj instanceof b);
    }

    @Override // Ph.M
    public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        if (Y1(th2)) {
            throw C1573k.f10795a;
        }
    }
}
