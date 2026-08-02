package com.vk.qrcode;

import com.google.zxing.client.result.CalendarParsedResult;
import com.google.zxing.client.result.ParsedResult;
import java.util.Date;
import xsna.drm0;
import xsna.epx;
import xsna.ho8;
import xsna.q76;

/* compiled from: QRTypes.kt */
/* loaded from: classes5.dex */
public final class a extends q76 {
    public final C1752a c;

    /* compiled from: QRTypes.kt */
    /* renamed from: com.vk.qrcode.a$a, reason: collision with other inner class name */
    public static final class C1752a {
        public final String a;
        public final Date b;
        public final Date c;
        public final String d;

        public C1752a(String str, Date date, Date date2, String str2) {
            this.a = str;
            this.b = date;
            this.c = date2;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1752a)) {
                return false;
            }
            C1752a c1752a = (C1752a) obj;
            return epx.f(this.a, c1752a.a) && epx.f(this.b, c1752a.b) && epx.f(this.c, c1752a.c) && epx.f(this.d, c1752a.d);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Date date = this.b;
            int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
            Date date2 = this.c;
            int hashCode3 = (hashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
            String str2 = this.d;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EventPayload(title=");
            sb.append(this.a);
            sb.append(", start=");
            sb.append(this.b);
            sb.append(", end=");
            sb.append(this.c);
            sb.append(", location=");
            return ho8.a(sb, this.d, ')');
        }
    }

    public a(ParsedResult parsedResult) {
        super(parsedResult);
        CalendarParsedResult calendarParsedResult = (CalendarParsedResult) parsedResult;
        this.c = new C1752a(calendarParsedResult.getSummary(), calendarParsedResult.getStart(), calendarParsedResult.getEnd(), calendarParsedResult.getLocation());
    }

    @Override // xsna.q76
    public final <T> io.reactivex.rxjava3.core.q<T> a() {
        return null;
    }

    @Override // xsna.q76
    public final String g() {
        String str = this.c.a;
        return str == null ? new String() : str;
    }

    @Override // xsna.q76
    public final boolean i() {
        C1752a c1752a = this.c;
        String str = c1752a.a;
        return (str == null || drm0.N(str) || c1752a.b == null) ? false : true;
    }

    @Override // xsna.q76
    public final QRTypes$Type q() {
        return QRTypes$Type.EVENT;
    }
}
