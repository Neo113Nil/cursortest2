package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.yk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0637yk {

    /* renamed from: a, reason: collision with root package name */
    public final C0017a7 f14961a;

    /* renamed from: b, reason: collision with root package name */
    public Y6 f14962b;

    /* renamed from: c, reason: collision with root package name */
    public S2 f14963c;

    /* renamed from: d, reason: collision with root package name */
    public T2 f14964d;

    /* renamed from: e, reason: collision with root package name */
    public C0478sb f14965e;

    /* renamed from: f, reason: collision with root package name */
    public C0503tb f14966f;

    /* renamed from: g, reason: collision with root package name */
    public C0490sn f14967g;

    /* renamed from: h, reason: collision with root package name */
    public C0515tn f14968h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f14969i = new LinkedHashMap();
    public final LinkedHashMap j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f14970k = new LinkedHashMap();

    public C0637yk(File file) {
        this.f14961a = new C0017a7(file);
    }

    public final IBinaryDataHelper a(Context context) {
        S2 s22 = this.f14963c;
        if (s22 != null) {
            return s22;
        }
        S2 s23 = new S2(new C0439ql(f(context)), "binary_data");
        this.f14963c = s23;
        return s23;
    }

    public final synchronized IBinaryDataHelper b(Context context) {
        T2 t22;
        t22 = this.f14964d;
        if (t22 == null) {
            t22 = new T2(a(context));
            this.f14964d = t22;
        }
        return t22;
    }

    public final synchronized IBinaryDataHelper c(Context context) {
        return a(context);
    }

    public final synchronized Ha d(Context context) {
        C0503tb c0503tb;
        try {
            c0503tb = this.f14966f;
            if (c0503tb == null) {
                C0478sb c0478sb = this.f14965e;
                if (c0478sb == null) {
                    c0478sb = new C0478sb(new C0439ql(f(context)));
                    this.f14965e = c0478sb;
                }
                c0503tb = new C0503tb(c0478sb);
                this.f14966f = c0503tb;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c0503tb;
    }

    public final synchronized Ha e(Context context) {
        C0478sb c0478sb;
        c0478sb = this.f14965e;
        if (c0478sb == null) {
            c0478sb = new C0478sb(new C0439ql(f(context)));
            this.f14965e = c0478sb;
        }
        return c0478sb;
    }

    public final synchronized Y6 f(Context context) {
        Y6 y62;
        try {
            y62 = this.f14962b;
            if (y62 == null) {
                C0017a7 c0017a7 = this.f14961a;
                String a7 = new Z6(c0017a7.f13348a, c0017a7.f13349b, true).a(context, new C0159fk());
                M6 m6 = AbstractC0572w5.f14822c;
                m6.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", InterfaceC0497t5.f14665a);
                hashMap.put("binary_data", AbstractC0447r5.f14544a);
                hashMap.put("temp_cache", AbstractC0565vn.f14806a);
                Iterator<ModuleServicesDatabase> it = C0353na.I.p().b().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        hashMap.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C0214hn c0214hn = m6.f12570c;
                W6 w62 = m6.f12568a;
                U6 u62 = w62.f13087e;
                V6 v62 = w62.f13088f;
                C0403pa c0403pa = new C0403pa(false);
                c0403pa.a(114, new C0185gk());
                Iterator<ModuleServicesDatabase> it2 = C0353na.I.p().b().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            c0403pa.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C0291kn c0291kn = new C0291kn("service database", hashMap);
                c0214hn.getClass();
                y62 = new Y6(context, a7, new C0239in(u62, v62, c0403pa, c0291kn), PublicLogger.getAnonymousInstance());
                this.f14962b = y62;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return y62;
    }

    public final synchronized Y6 c(Context context, Q4 q42) {
        Object obj;
        try {
            String str = new H4(q42).f12302a;
            LinkedHashMap linkedHashMap = this.f14969i;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                C0017a7 c0017a7 = this.f14961a;
                String a7 = new Z6(c0017a7.f13348a, c0017a7.f13349b, false).a(context, new H4(q42));
                M6 m6 = AbstractC0572w5.f14822c;
                m6.getClass();
                String str2 = q42.f12771b;
                if (str2 == null) {
                    str2 = "main";
                }
                String concat = "component-".concat(str2);
                C0214hn c0214hn = m6.f12570c;
                W6 w62 = m6.f12568a;
                O6 o62 = w62.f13083a;
                P6 p62 = w62.f13084b;
                C0403pa c0403pa = new C0403pa(false);
                c0403pa.a(112, new K4());
                C0291kn c0291kn = new C0291kn(concat, m6.f12569b.f14706a);
                c0214hn.getClass();
                obj = new Y6(context, a7, new C0239in(o62, p62, c0403pa, c0291kn), PublicLogger.getAnonymousInstance());
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Y6) obj;
    }

    public final synchronized IBinaryDataHelper a(Context context, Q4 q42) {
        Object obj;
        try {
            String str = new H4(q42).f12302a;
            LinkedHashMap linkedHashMap = this.f14970k;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new S2(new C0439ql(c(context, q42)), "binary_data");
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (IBinaryDataHelper) obj;
    }

    public final synchronized Ha b(Context context, Q4 q42) {
        Object obj;
        try {
            String str = new H4(q42).f12302a;
            LinkedHashMap linkedHashMap = this.j;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new C0478sb(new C0439ql(c(context, q42)));
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Ha) obj;
    }
}
