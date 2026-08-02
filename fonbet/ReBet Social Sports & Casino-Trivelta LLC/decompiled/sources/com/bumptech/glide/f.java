package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final Map f29570a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f29571a = new HashMap();

        public f b() {
            return new f(this);
        }
    }

    public f(a aVar) {
        this.f29570a = Collections.unmodifiableMap(new HashMap(aVar.f29571a));
    }

    public boolean a(Class cls) {
        return this.f29570a.containsKey(cls);
    }
}
