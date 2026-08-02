package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class M3 extends P5 {
    public HashMap q;

    /* renamed from: r, reason: collision with root package name */
    public Xm f12561r;

    /* renamed from: s, reason: collision with root package name */
    public Um f12562s;

    /* renamed from: t, reason: collision with root package name */
    public Um f12563t;

    /* renamed from: u, reason: collision with root package name */
    public Z2 f12564u;

    /* renamed from: v, reason: collision with root package name */
    public Xm f12565v;

    public M3(@NonNull PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
    }

    public static P5 b(String str, String str2) {
        P5 p52 = new P5("", 0);
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        p52.f12730d = 5376;
        p52.a(str, str2);
        return p52;
    }

    public static P5 n() {
        P5 p52 = new P5("", 0);
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        p52.f12730d = 5632;
        return p52;
    }

    public static P5 o() {
        P5 p52 = new P5("", 0);
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        p52.f12730d = 40961;
        return p52;
    }

    public final void a(String str, String str2, L3 l32) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.q.remove(l32);
        } else {
            this.q.put(l32, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.q.values().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += ((Integer) it.next()).intValue();
        }
        this.f12733g = i5;
    }

    @Override // io.appmetrica.analytics.impl.P5
    @NonNull
    public final void c(String str) {
        Xm xm = this.f12565v;
        xm.getClass();
        this.f12734h = xm.a(str);
    }

    public final String d(String str) {
        Xm xm = this.f12561r;
        xm.getClass();
        String a7 = xm.a(str);
        a(str, a7, L3.NAME);
        return a7;
    }

    public final String e(String str) {
        Um um = this.f12562s;
        um.getClass();
        String a7 = um.a(str);
        a(str, a7, L3.VALUE);
        return a7;
    }

    public final M3 f(@NonNull String str) {
        Um um = this.f12563t;
        um.getClass();
        String a7 = um.a(str);
        a(str, a7, L3.VALUE);
        this.f12728b = a7;
        return this;
    }

    @NonNull
    public final HashMap<L3, Integer> p() {
        return this.q;
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(String str) {
        this.f12727a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(String str) {
        this.f12728b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        a(bArr);
    }

    public M3(String str, int i5, @NonNull PublicLogger publicLogger) {
        this("", str, i5, publicLogger);
    }

    public M3(String str, String str2, int i5, @NonNull PublicLogger publicLogger) {
        this(str, str2, i5, 0, publicLogger);
    }

    public M3(String str, String str2, int i5, int i10, @NonNull PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
        this.f12728b = e(str);
        this.f12727a = d(str2);
        setType(i5);
        setCustomType(i10);
    }

    public final M3 a(@NonNull HashMap<L3, Integer> hashMap) {
        this.q = hashMap;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.f12561r = new Xm(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "event name", publicLogger);
        this.f12562s = new Um(245760, "event value", publicLogger);
        this.f12563t = new Um(1024000, "event extended value", publicLogger);
        this.f12564u = new Z2(245760, "event value bytes", publicLogger);
        this.f12565v = new Xm(200, "user profile id", publicLogger);
    }

    public M3(byte[] bArr, String str, int i5, @NonNull PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.f12727a = d(str);
        setType(i5);
    }

    public final void a(byte[] bArr) {
        Z2 z22 = this.f12564u;
        z22.getClass();
        byte[] a7 = z22.a(bArr);
        L3 l32 = L3.VALUE;
        if (bArr.length != a7.length) {
            this.q.put(l32, Integer.valueOf(bArr.length - a7.length));
        } else {
            this.q.remove(l32);
        }
        Iterator it = this.q.values().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += ((Integer) it.next()).intValue();
        }
        this.f12733g = i5;
        super.setValueBytes(a7);
    }

    public static P5 a(@NonNull C0240io c0240io) {
        P5 o3 = o();
        o3.setValue(new String(Base64.encode(MessageNano.toByteArray(c0240io), 0)));
        return o3;
    }

    public static M3 a(PublicLogger publicLogger, Oi oi2) {
        int i5;
        M3 m32 = new M3(publicLogger);
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        m32.f12730d = 40976;
        Mi mi = new Mi();
        mi.f12605b = oi2.f12695a.currency.getCurrencyCode().getBytes();
        mi.f12609f = oi2.f12695a.priceMicros;
        mi.f12606c = StringUtils.stringToBytesForProtobuf(new Xm(200, "revenue productID", oi2.f12699e).a(oi2.f12695a.productID));
        mi.f12604a = ((Integer) WrapUtils.getOrDefault(oi2.f12695a.quantity, 1)).intValue();
        Um um = oi2.f12696b;
        String str = oi2.f12695a.payload;
        um.getClass();
        mi.f12607d = StringUtils.stringToBytesForProtobuf(um.a(str));
        if (lo.a(oi2.f12695a.receipt)) {
            Hi hi2 = new Hi();
            String str2 = (String) oi2.f12697c.a(oi2.f12695a.receipt.data);
            i5 = !StringUtils.equalsNullSafety(oi2.f12695a.receipt.data, str2) ? oi2.f12695a.receipt.data.length() : 0;
            String str3 = (String) oi2.f12698d.a(oi2.f12695a.receipt.signature);
            hi2.f12322a = StringUtils.stringToBytesForProtobuf(str2);
            hi2.f12323b = StringUtils.stringToBytesForProtobuf(str3);
            mi.f12608e = hi2;
        } else {
            i5 = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(mi), Integer.valueOf(i5));
        m32.f12728b = m32.e(new String(Base64.encode((byte[]) pair.first, 0)));
        m32.f12733g = ((Integer) pair.second).intValue();
        return m32;
    }

    public static M3 a(PublicLogger publicLogger, E e7) {
        M3 m32 = new M3(publicLogger);
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        m32.f12730d = 40977;
        kotlin.Pair a7 = e7.a();
        m32.f12728b = m32.e(new String(Base64.encode((byte[]) a7.f19192a, 0)));
        m32.f12733g = ((Integer) a7.f19193b).intValue();
        return m32;
    }
}
