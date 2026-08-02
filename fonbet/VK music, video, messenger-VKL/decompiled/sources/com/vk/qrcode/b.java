package com.vk.qrcode;

import com.google.zxing.client.result.GeoParsedResult;
import com.google.zxing.client.result.ParsedResult;
import xsna.ojp0;
import xsna.q76;

/* compiled from: QRTypes.kt */
/* loaded from: classes5.dex */
public final class b extends q76 {
    public final a c;

    /* compiled from: QRTypes.kt */
    public static final class a {
        public final double a;
        public final double b;

        public a(double d, double d2) {
            this.a = d;
            this.b = d2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.a, aVar.a) == 0 && Double.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GeoPayload(latitude=");
            sb.append(this.a);
            sb.append(", longitude=");
            return ojp0.a(sb, this.b, ')');
        }
    }

    public b(ParsedResult parsedResult) {
        super(parsedResult);
        GeoParsedResult geoParsedResult = (GeoParsedResult) parsedResult;
        this.c = new a(geoParsedResult.getLatitude(), geoParsedResult.getLongitude());
    }

    @Override // xsna.q76
    public final <T> io.reactivex.rxjava3.core.q<T> a() {
        return null;
    }

    @Override // xsna.q76
    public final boolean i() {
        a aVar = this.c;
        double d = aVar.a;
        if (-90.0d > d || d > 90.0d) {
            return false;
        }
        double d2 = aVar.b;
        return -180.0d <= d2 && d2 <= 180.0d;
    }

    @Override // xsna.q76
    public final QRTypes$Type q() {
        return QRTypes$Type.GEO;
    }
}
