package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Double f5049a;

    public g(Double d10) {
        if (d10 == null) {
            this.f5049a = Double.valueOf(Double.NaN);
        } else {
            this.f5049a = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean c() {
        Double d10 = this.f5049a;
        boolean z5 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z5 = true;
        }
        return Boolean.valueOf(z5);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double d() {
        return this.f5049a;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f5049a.equals(((g) obj).f5049a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n f(String str, com.google.firebase.messaging.x xVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new q(h());
        }
        throw new IllegalArgumentException(h() + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String h() {
        Double d10 = this.f5049a;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(d10.doubleValue());
        BigDecimal bigDecimal = valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String format = decimalFormat.format(bigDecimal);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    public final int hashCode() {
        return this.f5049a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n i() {
        return new g(this.f5049a);
    }

    public final String toString() {
        return h();
    }
}
