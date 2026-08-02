package io.sentry;

import io.sentry.rrweb.a;
import io.sentry.rrweb.d;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.rrweb.g;
import io.sentry.rrweb.i;
import io.sentry.rrweb.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7194q1 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f68387a;

    /* renamed from: b, reason: collision with root package name */
    private List<? extends io.sentry.rrweb.b> f68388b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f68389c;

    /* renamed from: io.sentry.q1$a */
    /* loaded from: classes10.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f68390a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f68391b;

        static {
            int[] iArr = new int[io.sentry.rrweb.c.values().length];
            f68391b = iArr;
            try {
                iArr[io.sentry.rrweb.c.IncrementalSnapshot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68391b[io.sentry.rrweb.c.Meta.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68391b[io.sentry.rrweb.c.Custom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f68390a = iArr2;
            try {
                iArr2[d.b.MouseInteraction.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68390a[d.b.TouchMove.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: io.sentry.q1$b */
    public static final class b implements InterfaceC7174n0<C7194q1> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final C7194q1 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            C7194q1 c7194q1 = new C7194q1();
            interfaceC7131c1.beginObject();
            ArrayList arrayList = null;
            HashMap hashMap = null;
            Integer num = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals("segment_id")) {
                    num = interfaceC7131c1.A1();
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                }
            }
            interfaceC7131c1.endObject();
            interfaceC7131c1.setLenient(true);
            List list = (List) interfaceC7131c1.U1();
            interfaceC7131c1.setLenient(false);
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj instanceof Map) {
                        Map map = (Map) obj;
                        io.sentry.util.o oVar = new io.sentry.util.o(map);
                        for (Map.Entry entry : map.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (str.equals("type")) {
                                io.sentry.rrweb.c cVar = io.sentry.rrweb.c.values()[((Integer) value).intValue()];
                                int i11 = a.f68391b[cVar.ordinal()];
                                if (i11 == 1) {
                                    Map map2 = (Map) map.get("data");
                                    if (map2 == null) {
                                        map2 = Collections.EMPTY_MAP;
                                    }
                                    Integer num2 = (Integer) map2.get("source");
                                    if (num2 != null) {
                                        d.b bVar = d.b.values()[num2.intValue()];
                                        int i12 = a.f68390a[bVar.ordinal()];
                                        if (i12 == 1) {
                                            arrayList.add(e.a.b(oVar, iLogger));
                                        } else if (i12 != 2) {
                                            iLogger.c(I2.DEBUG, "Unsupported rrweb incremental snapshot type %s", bVar);
                                        } else {
                                            arrayList.add(f.a.b(oVar, iLogger));
                                        }
                                    }
                                } else if (i11 == 2) {
                                    arrayList.add(g.a.b(oVar, iLogger));
                                } else if (i11 != 3) {
                                    iLogger.c(I2.DEBUG, "Unsupported rrweb event type %s", cVar);
                                } else {
                                    Map map3 = (Map) map.get("data");
                                    if (map3 == null) {
                                        map3 = Collections.EMPTY_MAP;
                                    }
                                    String str2 = (String) map3.get("tag");
                                    if (str2 != null) {
                                        switch (str2) {
                                            case "performanceSpan":
                                                arrayList.add(i.a.b(oVar, iLogger));
                                                break;
                                            case "video":
                                                arrayList.add(j.a.b(oVar, iLogger));
                                                break;
                                            case "breadcrumb":
                                                arrayList.add(a.C1118a.b(oVar, iLogger));
                                                break;
                                            default:
                                                iLogger.c(I2.DEBUG, "Unsupported rrweb event type %s", cVar);
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            c7194q1.c(num);
            c7194q1.b(arrayList);
            c7194q1.d(hashMap);
            return c7194q1;
        }
    }

    public final List<? extends io.sentry.rrweb.b> a() {
        return this.f68388b;
    }

    public final void b(List<? extends io.sentry.rrweb.b> list) {
        this.f68388b = list;
    }

    public final void c(Integer num) {
        this.f68387a = num;
    }

    public final void d(Map<String, Object> map) {
        this.f68389c = (HashMap) map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7194q1.class == obj.getClass()) {
            C7194q1 c7194q1 = (C7194q1) obj;
            if (io.sentry.util.p.a(this.f68387a, c7194q1.f68387a) && io.sentry.util.p.a(this.f68388b, c7194q1.f68388b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68387a, this.f68388b});
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68387a != null) {
            c7212v0.g("segment_id");
            c7212v0.o(this.f68387a);
        }
        HashMap hashMap = this.f68389c;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                I1.w.e(this.f68389c, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
        c7212v0.j(true);
        if (this.f68387a != null) {
            c7212v0.f();
        }
        List<? extends io.sentry.rrweb.b> list = this.f68388b;
        if (list != null) {
            c7212v0.m(iLogger, list);
        }
        c7212v0.j(false);
    }
}
