package io.sentry.config;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16295a;

    public b(ArrayList arrayList) {
        this.f16295a = arrayList;
    }

    @Override // io.sentry.config.d
    public final Map a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.f16295a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((d) it.next()).a());
        }
        return concurrentHashMap;
    }

    public final Boolean b(String str) {
        String property = getProperty(str);
        if (property != null) {
            return Boolean.valueOf(property);
        }
        return null;
    }

    public final List c(String str) {
        String property = getProperty(str);
        return property != null ? Arrays.asList(property.split(StringUtils.COMMA)) : Collections.EMPTY_LIST;
    }

    @Override // io.sentry.config.d
    public final String getProperty(String str) {
        Iterator it = this.f16295a.iterator();
        while (it.hasNext()) {
            String property = ((d) it.next()).getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}
