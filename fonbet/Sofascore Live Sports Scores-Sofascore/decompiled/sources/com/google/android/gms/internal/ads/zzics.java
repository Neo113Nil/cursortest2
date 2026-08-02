package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.zmo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzics extends zzico {
    public final Serializable a;

    public zzics(Boolean bool) {
        this.a = bool;
    }

    public static boolean o(zzics zzicsVar) {
        Serializable serializable = zzicsVar.a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.android.gms.internal.ads.zzico
    public final String c() {
        Serializable serializable = this.a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        a70.j("Unexpected value type: ".concat(String.valueOf(serializable.getClass())));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzics.class != obj.getClass()) {
            return false;
        }
        zzics zzicsVar = (zzics) obj;
        Serializable serializable = zzicsVar.a;
        Serializable serializable2 = this.a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (o(this) && o(zzicsVar)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? n().equals(zzicsVar.n()) : m().longValue() == zzicsVar.m().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : zzidf.a(c())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : zzidf.a(zzicsVar.c())) == 0;
        }
        double doubleValue = serializable2 instanceof Number ? m().doubleValue() : Double.parseDouble(c());
        double doubleValue2 = serializable instanceof Number ? zzicsVar.m().doubleValue() : Double.parseDouble(zzicsVar.c());
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.a;
        if (serializable == null) {
            return 31;
        }
        if (o(this)) {
            doubleToLongBits = m().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(m().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final Number m() {
        Serializable serializable = this.a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new zzicw((String) serializable);
        }
        a70.m("Primitive is neither a number nor a string");
        return null;
    }

    public final BigInteger n() {
        Serializable serializable = this.a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (o(this)) {
            return BigInteger.valueOf(m().longValue());
        }
        String c = c();
        zzidf.b(c);
        return new BigInteger(c);
    }

    public zzics(zmo zmoVar) {
        this.a = zmoVar;
    }

    public zzics(String str) {
        this.a = str;
    }
}
