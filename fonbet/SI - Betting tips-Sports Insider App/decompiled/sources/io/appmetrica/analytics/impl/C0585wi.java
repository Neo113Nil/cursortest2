package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.wi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585wi {

    /* renamed from: a, reason: collision with root package name */
    public final F4 f14844a;

    /* renamed from: b, reason: collision with root package name */
    public final Sn f14845b;

    /* renamed from: c, reason: collision with root package name */
    public final C0635yi f14846c;

    /* renamed from: d, reason: collision with root package name */
    public final C0393p0 f14847d;

    /* renamed from: e, reason: collision with root package name */
    public Pl f14848e;

    /* renamed from: f, reason: collision with root package name */
    public final Yj f14849f;

    public C0585wi(C0393p0 c0393p0, Sn sn, F4 f42, Yj yj) {
        this(c0393p0, sn, f42, yj, new C0635yi(c0393p0, yj));
    }

    public final void a(C0559vh c0559vh) {
        Fh fh2 = c0559vh.f14798e;
        Pl pl = this.f14848e;
        if (pl != null) {
            fh2.f12301b.setUuid(((Ol) pl).g());
        } else {
            fh2.getClass();
        }
        this.f14846c.a(c0559vh);
    }

    public final void b(String str) {
        Bf bf2 = this.f14844a.f12300a;
        synchronized (bf2) {
            bf2.f12060a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public C0585wi(C0393p0 c0393p0, Sn sn, F4 f42, Yj yj, C0635yi c0635yi) {
        this.f14847d = c0393p0;
        this.f14844a = f42;
        this.f14845b = sn;
        this.f14849f = yj;
        this.f14846c = c0635yi;
    }

    public final void a(Ol ol) {
        this.f14848e = ol;
        this.f14844a.f12301b.setUuid(ol.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (lo.a(bool)) {
            this.f14844a.f12301b.setLocationTracking(bool.booleanValue());
        }
        if (lo.a(bool2)) {
            this.f14844a.f12301b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (lo.a(bool3)) {
            this.f14844a.f12301b.setAdvIdentifiersTracking(bool3.booleanValue(), bool4.booleanValue());
        }
        P5 a7 = P5.a();
        F4 f42 = this.f14844a;
        a(a(a7, f42), f42, 1, (Map) null);
    }

    public final void a(P5 p52, Fh fh2, int i5, Map map) {
        String str;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        this.f14847d.b();
        if (!lo.a(map)) {
            p52.setValue(AbstractC0176gb.b(map));
            a(p52, fh2);
        }
        Bf bf2 = new Bf(fh2.f12300a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh2.f12301b);
        D8 d82 = fh2.f12226c;
        synchronized (fh2) {
            str = fh2.f12229f;
        }
        a(new C0559vh(p52, false, i5, null, new Fh(bf2, counterConfiguration, d82, str)));
    }

    public static P5 a(P5 p52, Fh fh2) {
        if (AbstractC0576w9.f14825a.contains(Integer.valueOf(p52.f12730d))) {
            p52.f12729c = fh2.d();
        }
        return p52;
    }

    public final void a(List list) {
        Bf bf2 = this.f14844a.f12300a;
        synchronized (bf2) {
            bf2.f12060a.put("PROCESS_CFG_CUSTOM_HOSTS", lo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap hashMap) {
        Bf bf2 = this.f14844a.f12300a;
        synchronized (bf2) {
            bf2.f12060a.put("PROCESS_CFG_CLIDS", AbstractC0176gb.b(hashMap));
        }
    }

    public final void a(String str) {
        Bf bf2 = this.f14844a.f12300a;
        synchronized (bf2) {
            bf2.f12060a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final C0559vh a(Qn qn, Fh fh2) {
        String str;
        String str2;
        this.f14847d.b();
        Sn sn = this.f14845b;
        sn.getClass();
        Gn gn = qn.f12784a;
        if (gn == null) {
            str = "";
        } else {
            str = (String) WrapUtils.getOrDefault(gn.f12286a, "");
        }
        byte[] fromModel = sn.f12891a.fromModel(qn);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(fh2.f12301b.getApiKey());
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(fromModel, str, 5891, orCreatePublicLogger);
        m32.f12729c = fh2.d();
        HashMap hashMap = m32.q;
        Bf bf2 = new Bf(fh2.f12300a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh2.f12301b);
        D8 d82 = fh2.f12226c;
        synchronized (fh2) {
            str2 = fh2.f12229f;
        }
        return new C0559vh(m32, true, 1, hashMap, new Fh(bf2, counterConfiguration, d82, str2));
    }
}
