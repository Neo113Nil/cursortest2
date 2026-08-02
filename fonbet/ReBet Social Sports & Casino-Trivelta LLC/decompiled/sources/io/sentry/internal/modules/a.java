package io.sentry.internal.modules;

import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: e, reason: collision with root package name */
    public final List f52118e;

    public a(List list, ILogger iLogger) {
        super(iLogger);
        this.f52118e = list;
    }

    @Override // io.sentry.internal.modules.d
    public Map b() {
        TreeMap treeMap = new TreeMap();
        Iterator it = this.f52118e.iterator();
        while (it.hasNext()) {
            Map a10 = ((b) it.next()).a();
            if (a10 != null) {
                treeMap.putAll(a10);
            }
        }
        return treeMap;
    }
}
