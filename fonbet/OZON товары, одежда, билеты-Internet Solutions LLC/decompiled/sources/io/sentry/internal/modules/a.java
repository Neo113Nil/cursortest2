package io.sentry.internal.modules;

import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a extends d {

    /* renamed from: e, reason: collision with root package name */
    private final List<b> f68003e;

    public a(@NotNull List<b> list, @NotNull ILogger iLogger) {
        super(iLogger);
        this.f68003e = list;
    }

    @Override // io.sentry.internal.modules.d
    protected final Map<String, String> b() {
        TreeMap treeMap = new TreeMap();
        Iterator<b> it = this.f68003e.iterator();
        while (it.hasNext()) {
            Map<String, String> a11 = it.next().a();
            if (a11 != null) {
                treeMap.putAll(a11);
            }
        }
        return treeMap;
    }
}
