package org.spongycastle.asn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* renamed from: org.spongycastle.asn1.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5931i extends AbstractC5940s {
    private byte[] time;

    public C5931i(String str) {
        this.time = Aj.h.e(str);
        try {
            m();
        } catch (ParseException e10) {
            throw new IllegalArgumentException("invalid date string: " + e10.getMessage());
        }
    }

    public static C5931i n(Object obj) {
        if (obj == null || (obj instanceof C5931i)) {
            return (C5931i) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (C5931i) AbstractC5940s.g((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
        }
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (abstractC5940s instanceof C5931i) {
            return Aj.a.a(this.time, ((C5931i) abstractC5940s).time);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        c5939q.g(24, this.time);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        int length = this.time.length;
        return z0.a(length) + 1 + length;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s, org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        return Aj.a.q(this.time);
    }

    public final String k() {
        String str;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = "-";
        } else {
            str = "+";
        }
        int i10 = rawOffset / 3600000;
        int i11 = (rawOffset - (3600000 * i10)) / 60000;
        try {
            if (timeZone.useDaylightTime() && timeZone.inDaylightTime(m())) {
                i10 += str.equals("+") ? 1 : -1;
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str + l(i10) + ":" + l(i11);
    }

    public final String l(int i10) {
        if (i10 >= 10) {
            return Integer.toString(i10);
        }
        return "0" + i10;
    }

    public Date m() {
        SimpleDateFormat simpleDateFormat;
        char charAt;
        String b10 = Aj.h.b(this.time);
        if (b10.endsWith("Z")) {
            simpleDateFormat = p() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : new SimpleDateFormat("yyyyMMddHHmmss'Z'");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (b10.indexOf(45) > 0 || b10.indexOf(43) > 0) {
            b10 = o();
            simpleDateFormat = p() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : new SimpleDateFormat("yyyyMMddHHmmssz");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else {
            simpleDateFormat = p() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : new SimpleDateFormat("yyyyMMddHHmmss");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (p()) {
            String substring = b10.substring(14);
            int i10 = 1;
            while (i10 < substring.length() && '0' <= (charAt = substring.charAt(i10)) && charAt <= '9') {
                i10++;
            }
            int i11 = i10 - 1;
            if (i11 > 3) {
                b10 = b10.substring(0, 14) + (substring.substring(0, 4) + substring.substring(i10));
            } else if (i11 == 1) {
                b10 = b10.substring(0, 14) + (substring.substring(0, i10) + "00" + substring.substring(i10));
            } else if (i11 == 2) {
                b10 = b10.substring(0, 14) + (substring.substring(0, i10) + "0" + substring.substring(i10));
            }
        }
        return simpleDateFormat.parse(b10);
    }

    public String o() {
        String b10 = Aj.h.b(this.time);
        if (b10.charAt(b10.length() - 1) == 'Z') {
            return b10.substring(0, b10.length() - 1) + "GMT+00:00";
        }
        int length = b10.length();
        int i10 = length - 5;
        char charAt = b10.charAt(i10);
        if (charAt == '-' || charAt == '+') {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b10.substring(0, i10));
            sb2.append("GMT");
            int i11 = length - 2;
            sb2.append(b10.substring(i10, i11));
            sb2.append(":");
            sb2.append(b10.substring(i11));
            return sb2.toString();
        }
        int length2 = b10.length() - 3;
        char charAt2 = b10.charAt(length2);
        if (charAt2 != '-' && charAt2 != '+') {
            return b10 + k();
        }
        return b10.substring(0, length2) + "GMT" + b10.substring(length2) + ":00";
    }

    public final boolean p() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.time;
            if (i10 == bArr.length) {
                return false;
            }
            if (bArr[i10] == 46 && i10 == 14) {
                return true;
            }
            i10++;
        }
    }

    public C5931i(byte[] bArr) {
        this.time = bArr;
    }
}
