package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final AdRevenue f12173a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12174b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0491t f12175c;

    /* renamed from: d, reason: collision with root package name */
    public final Xm f12176d;

    /* renamed from: e, reason: collision with root package name */
    public final Um f12177e;

    public E(AdRevenue adRevenue, boolean z5, C0162fn c0162fn, PublicLogger publicLogger) {
        this.f12173a = adRevenue;
        this.f12174b = z5;
        this.f12175c = c0162fn;
        this.f12176d = new Xm(100, "ad revenue strings", publicLogger);
        this.f12177e = new Um(30720, "ad revenue payload", publicLogger);
    }

    public final Pair a() {
        C0466s c0466s = new C0466s();
        int i5 = 0;
        for (Pair pair : kotlin.collections.u.f(new Pair(this.f12173a.adNetwork, new C0591x(c0466s)), new Pair(this.f12173a.adPlacementId, new C0616y(c0466s)), new Pair(this.f12173a.adPlacementName, new C0641z(c0466s)), new Pair(this.f12173a.adUnitId, new A(c0466s)), new Pair(this.f12173a.adUnitName, new B(c0466s)), new Pair(this.f12173a.precision, new C(c0466s)), new Pair(this.f12173a.currency.getCurrencyCode(), new D(c0466s)))) {
            String str = (String) pair.f19192a;
            Function1 function1 = (Function1) pair.f19193b;
            Xm xm = this.f12176d;
            xm.getClass();
            String a7 = xm.a(str);
            byte[] stringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] stringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(a7);
            function1.invoke(stringToBytesForProtobuf2);
            i5 += stringToBytesForProtobuf.length - stringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) F.f12210a.get(this.f12173a.adType);
        c0466s.f14601d = num != null ? num.intValue() : 0;
        r rVar = new r();
        BigDecimal bigDecimal = this.f12173a.adRevenue;
        BigInteger bigInteger = AbstractC0599x7.f14912a;
        int i10 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(AbstractC0599x7.f14912a) <= 0 && unscaledValue.compareTo(AbstractC0599x7.f14913b) >= 0) {
                break;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i10++;
        }
        Long valueOf = Long.valueOf(unscaledValue.longValue());
        Integer valueOf2 = Integer.valueOf(i10);
        long longValue = valueOf.longValue();
        int intValue = valueOf2.intValue();
        rVar.f14530a = longValue;
        rVar.f14531b = intValue;
        c0466s.f14599b = rVar;
        Map<String, String> map = this.f12173a.payload;
        String b10 = AbstractC0176gb.b(this.f12175c.a(map != null ? kotlin.collections.n0.j(map) : new LinkedHashMap()));
        Um um = this.f12177e;
        um.getClass();
        byte[] stringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(um.a(b10));
        c0466s.f14607k = stringToBytesForProtobuf3;
        int length = (StringUtils.stringToBytesForProtobuf(b10).length - stringToBytesForProtobuf3.length) + i5;
        if (this.f12174b) {
            c0466s.f14598a = "autocollected".getBytes(Charsets.UTF_8);
        }
        return new Pair(MessageNano.toByteArray(c0466s), Integer.valueOf(length));
    }
}
