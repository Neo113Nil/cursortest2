package org.joda.time;

import B0.A0;
import Kk.C3531a;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.tz.FixedDateTimeZone;

/* loaded from: classes6.dex */
public abstract class DateTimeZone implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final DateTimeZone f78989a = UTCDateTimeZone.f79049e;

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference<org.joda.time.tz.c> f78990b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference<org.joda.time.tz.b> f78991c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReference<DateTimeZone> f78992d = new AtomicReference<>();
    private static final long serialVersionUID = 5546345482340108586L;
    private final String iID;

    /* loaded from: classes10.dex */
    private static final class Stub implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;

        /* renamed from: a, reason: collision with root package name */
        private transient String f78993a;

        Stub(String str) {
            this.f78993a = str;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            this.f78993a = objectInputStream.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return DateTimeZone.d(this.f78993a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.f78993a);
        }
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final Map<String, String> f78994a;

        /* renamed from: b, reason: collision with root package name */
        static final org.joda.time.format.b f78995b;

        static {
            HashMap hashMap = new HashMap();
            hashMap.put("GMT", "UTC");
            hashMap.put("WET", "WET");
            hashMap.put("CET", "CET");
            hashMap.put("MET", "CET");
            hashMap.put("ECT", "CET");
            hashMap.put("EET", "EET");
            hashMap.put("MIT", "Pacific/Apia");
            hashMap.put("HST", "Pacific/Honolulu");
            hashMap.put("AST", "America/Anchorage");
            hashMap.put("PST", "America/Los_Angeles");
            hashMap.put("MST", "America/Denver");
            hashMap.put("PNT", "America/Phoenix");
            hashMap.put("CST", "America/Chicago");
            hashMap.put("EST", "America/New_York");
            hashMap.put("IET", "America/Indiana/Indianapolis");
            hashMap.put("PRT", "America/Puerto_Rico");
            hashMap.put("CNT", "America/St_Johns");
            hashMap.put("AGT", "America/Argentina/Buenos_Aires");
            hashMap.put("BET", "America/Sao_Paulo");
            hashMap.put("ART", "Africa/Cairo");
            hashMap.put("CAT", "Africa/Harare");
            hashMap.put("EAT", "Africa/Addis_Ababa");
            hashMap.put("NET", "Asia/Yerevan");
            hashMap.put("PLT", "Asia/Karachi");
            hashMap.put("IST", "Asia/Kolkata");
            hashMap.put("BST", "Asia/Dhaka");
            hashMap.put("VST", "Asia/Ho_Chi_Minh");
            hashMap.put("CTT", "Asia/Shanghai");
            hashMap.put("JST", "Asia/Tokyo");
            hashMap.put("ACT", "Australia/Darwin");
            hashMap.put("AET", "Australia/Sydney");
            hashMap.put("SST", "Pacific/Guadalcanal");
            hashMap.put("NST", "Pacific/Auckland");
            f78994a = Collections.unmodifiableMap(hashMap);
            f78995b = new DateTimeFormatterBuilder().appendTimeZoneOffset(null, true, 2, 4).toFormatter().l(new BaseChronology() { // from class: org.joda.time.DateTimeZone$LazyInit$1
                private static final long serialVersionUID = -3128740902654445468L;

                @Override // org.joda.time.a
                public final a W() {
                    return this;
                }

                @Override // org.joda.time.a
                public final a X(DateTimeZone dateTimeZone) {
                    return this;
                }

                @Override // org.joda.time.a
                public final String toString() {
                    return DateTimeZone$LazyInit$1.class.getName();
                }

                @Override // org.joda.time.a
                public final DateTimeZone y() {
                    return null;
                }
            });
        }
    }

    protected DateTimeZone(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        this.iID = str;
    }

    private static String C(int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i11 >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i11 = -i11;
        }
        int i12 = i11 / 3600000;
        org.joda.time.format.h.b(stringBuffer, i12, 2);
        int i13 = i11 - (i12 * 3600000);
        int i14 = i13 / 60000;
        stringBuffer.append(':');
        org.joda.time.format.h.b(stringBuffer, i14, 2);
        int i15 = i13 - (i14 * 60000);
        if (i15 == 0) {
            return stringBuffer.toString();
        }
        int i16 = i15 / 1000;
        stringBuffer.append(':');
        org.joda.time.format.h.b(stringBuffer, i16, 2);
        int i17 = i15 - (i16 * 1000);
        if (i17 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        org.joda.time.format.h.b(stringBuffer, i17, 3);
        return stringBuffer.toString();
    }

    public static void D(DateTimeZone dateTimeZone) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        if (dateTimeZone == null) {
            throw new IllegalArgumentException("The datetime zone must not be null");
        }
        f78992d.set(dateTimeZone);
    }

    public static void E(Ue.b bVar) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        F(bVar);
        f78990b.set(bVar);
    }

    private static void F(org.joda.time.tz.c cVar) {
        Set<String> b11 = cVar.b();
        if (b11 == null || b11.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!b11.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        DateTimeZone dateTimeZone = f78989a;
        DateTimeZone a11 = cVar.a("UTC");
        ((UTCDateTimeZone) dateTimeZone).getClass();
        if (!(a11 instanceof UTCDateTimeZone)) {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        }
    }

    @FromString
    public static DateTimeZone d(String str) {
        if (str == null) {
            return g();
        }
        boolean equals = str.equals("UTC");
        DateTimeZone dateTimeZone = f78989a;
        if (equals) {
            return dateTimeZone;
        }
        DateTimeZone a11 = s().a(str);
        if (a11 != null) {
            return a11;
        }
        if (str.equals("UT") || str.equals("GMT") || str.equals("Z")) {
            return dateTimeZone;
        }
        String substring = (str.startsWith("UTC+") || str.startsWith("UTC-") || str.startsWith("GMT+") || str.startsWith("GMT-")) ? str.substring(3) : (str.startsWith("UT+") || str.startsWith("UT-")) ? str.substring(2) : str;
        if (!substring.startsWith("+") && !substring.startsWith("-")) {
            throw new IllegalArgumentException(A0.b("The datetime zone id '", str, "' is not recognised"));
        }
        int i11 = -((int) a.f78995b.f(substring));
        if (i11 == 0) {
            return dateTimeZone;
        }
        return i11 == 0 ? dateTimeZone : new FixedDateTimeZone(C(i11), null, i11, i11);
    }

    public static DateTimeZone e(int i11) {
        if (i11 < -86399999 || i11 > 86399999) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Millis out of range: "));
        }
        return i11 == 0 ? f78989a : new FixedDateTimeZone(C(i11), null, i11, i11);
    }

    public static DateTimeZone f(TimeZone timeZone) {
        char charAt;
        if (timeZone == null) {
            return g();
        }
        String id2 = timeZone.getID();
        if (id2 == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        }
        boolean equals = id2.equals("UTC");
        DateTimeZone dateTimeZone = f78989a;
        if (!equals) {
            String str = a.f78994a.get(id2);
            org.joda.time.tz.c s11 = s();
            DateTimeZone a11 = str != null ? s11.a(str) : null;
            if (a11 == null) {
                a11 = s11.a(id2);
            }
            if (a11 != null) {
                return a11;
            }
            if (str != null || (!id2.startsWith("GMT+") && !id2.startsWith("GMT-"))) {
                throw new IllegalArgumentException(A0.b("The datetime zone id '", id2, "' is not recognised"));
            }
            String substring = id2.substring(3);
            if (substring.length() > 2 && (charAt = substring.charAt(1)) > '9' && Character.isDigit(charAt)) {
                StringBuilder sb2 = new StringBuilder(substring);
                for (int i11 = 0; i11 < sb2.length(); i11++) {
                    int digit = Character.digit(sb2.charAt(i11), 10);
                    if (digit >= 0) {
                        sb2.setCharAt(i11, (char) (digit + 48));
                    }
                }
                substring = sb2.toString();
            }
            int i12 = -((int) a.f78995b.f(substring));
            if (i12 != 0) {
                return i12 == 0 ? dateTimeZone : new FixedDateTimeZone(C(i12), null, i12, i12);
            }
        }
        return dateTimeZone;
    }

    public static DateTimeZone g() {
        AtomicReference<DateTimeZone> atomicReference = f78992d;
        DateTimeZone dateTimeZone = atomicReference.get();
        if (dateTimeZone != null) {
            return dateTimeZone;
        }
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Timezone");
            if (property != null) {
                dateTimeZone = d(property);
            }
        } catch (RuntimeException unused) {
        }
        if (dateTimeZone == null) {
            try {
                dateTimeZone = f(TimeZone.getDefault());
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (dateTimeZone == null) {
            dateTimeZone = f78989a;
        }
        DateTimeZone dateTimeZone2 = dateTimeZone;
        while (!atomicReference.compareAndSet(null, dateTimeZone2)) {
            if (atomicReference.get() != null) {
                return atomicReference.get();
            }
        }
        return dateTimeZone2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [org.joda.time.tz.b] */
    public static org.joda.time.tz.b m() {
        AtomicReference<org.joda.time.tz.b> atomicReference = f78991c;
        org.joda.time.tz.b bVar = atomicReference.get();
        if (bVar != null) {
            return bVar;
        }
        org.joda.time.tz.a aVar = null;
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property != null) {
                try {
                    Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                    if (!org.joda.time.tz.b.class.isAssignableFrom(cls)) {
                        throw new IllegalArgumentException("System property referred to class that does not implement " + org.joda.time.tz.b.class);
                    }
                    aVar = (org.joda.time.tz.b) cls.asSubclass(org.joda.time.tz.b.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
        } catch (SecurityException unused) {
        }
        if (aVar == null) {
            aVar = new org.joda.time.tz.a();
        }
        return !C3531a.d(atomicReference, aVar) ? atomicReference.get() : aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:3|(2:4|5)|(3:7|8|(6:10|11|12|(3:15|(3:17|18|19)(1:21)|13)|22|23)(2:24|25))|30|31|(6:38|39|12|(1:13)|22|23)|33|34|11|12|(1:13)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        r1.printStackTrace();
        r1 = new org.joda.time.tz.d();
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.joda.time.tz.c s() {
        org.joda.time.tz.c dVar;
        org.joda.time.tz.c eVar;
        String property;
        AtomicReference<org.joda.time.tz.c> atomicReference = f78990b;
        org.joda.time.tz.c cVar = atomicReference.get();
        if (cVar != null) {
            return cVar;
        }
        try {
            property = System.getProperty("org.joda.time.DateTimeZone.Provider");
        } catch (SecurityException unused) {
        }
        if (property != null) {
            try {
                Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                if (!org.joda.time.tz.c.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("System property referred to class that does not implement " + org.joda.time.tz.c.class);
                }
                dVar = (org.joda.time.tz.c) cls.asSubclass(org.joda.time.tz.c.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                F(dVar);
                eVar = dVar;
                while (!atomicReference.compareAndSet(null, eVar)) {
                    if (atomicReference.get() != null) {
                        return atomicReference.get();
                    }
                }
                return eVar;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
        String property2 = System.getProperty("org.joda.time.DateTimeZone.Folder");
        if (property2 != null) {
            try {
                eVar = new org.joda.time.tz.e(new File(property2));
                F(eVar);
                while (!atomicReference.compareAndSet(null, eVar)) {
                }
                return eVar;
            } catch (Exception e12) {
                throw new RuntimeException(e12);
            }
        }
        dVar = new org.joda.time.tz.e();
        F(dVar);
        eVar = dVar;
        while (!atomicReference.compareAndSet(null, eVar)) {
        }
        return eVar;
    }

    public abstract long A(long j11);

    public abstract long B(long j11);

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r2 != (r6 != r0 ? r6 : Long.MAX_VALUE)) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j11, long j12) {
        int n11 = n(j12);
        long j13 = j11 - n11;
        if (n(j13) == n11) {
            return j13;
        }
        int n12 = n(j11);
        long j14 = j11 - n12;
        int n13 = n(j14);
        if (n12 != n13 && n12 < 0) {
            long A11 = A(j14);
            if (A11 == j14) {
                A11 = Long.MAX_VALUE;
            }
            long j15 = j11 - n13;
            long A12 = A(j15);
        }
        n12 = n13;
        long j16 = n12;
        long j17 = j11 - j16;
        if ((j11 ^ j17) >= 0 || (j11 ^ j16) >= 0) {
            return j17;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }

    public final long b(long j11) {
        long n11 = n(j11);
        long j12 = j11 + n11;
        if ((j11 ^ j12) >= 0 || (j11 ^ n11) < 0) {
            return j12;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract boolean equals(Object obj);

    @ToString
    public final String h() {
        return this.iID;
    }

    public int hashCode() {
        return this.iID.hashCode() + 57;
    }

    public final long i(long j11, DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = g();
        }
        return dateTimeZone == this ? j11 : dateTimeZone.a(b(j11), j11);
    }

    public final String j(long j11, Locale locale) {
        String b11;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String l11 = l(j11);
        if (l11 == null) {
            return this.iID;
        }
        org.joda.time.tz.b m11 = m();
        if (m11 instanceof org.joda.time.tz.a) {
            b11 = ((org.joda.time.tz.a) m11).d(this.iID, l11, n(j11) == v(j11), locale);
        } else {
            b11 = m11.b(locale, this.iID, l11);
        }
        return b11 != null ? b11 : C(n(j11));
    }

    public abstract String l(long j11);

    public abstract int n(long j11);

    public int p(long j11) {
        int n11 = n(j11);
        long j12 = j11 - n11;
        int n12 = n(j12);
        if (n11 != n12) {
            if (n11 - n12 < 0) {
                long A11 = A(j12);
                if (A11 == j12) {
                    A11 = Long.MAX_VALUE;
                }
                long j13 = j11 - n12;
                long A12 = A(j13);
                if (A11 != (A12 != j13 ? A12 : Long.MAX_VALUE)) {
                    return n11;
                }
            }
        } else if (n11 >= 0) {
            long B11 = B(j12);
            if (B11 < j12) {
                int n13 = n(B11);
                if (j12 - B11 <= n13 - n11) {
                    return n13;
                }
            }
        }
        return n12;
    }

    public final String toString() {
        return this.iID;
    }

    public final String u(long j11, Locale locale) {
        String a11;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String l11 = l(j11);
        if (l11 == null) {
            return this.iID;
        }
        org.joda.time.tz.b m11 = m();
        if (m11 instanceof org.joda.time.tz.a) {
            a11 = ((org.joda.time.tz.a) m11).g(this.iID, l11, n(j11) == v(j11), locale);
        } else {
            a11 = m11.a(locale, this.iID, l11);
        }
        return a11 != null ? a11 : C(n(j11));
    }

    public abstract int v(long j11);

    protected Object writeReplace() throws ObjectStreamException {
        return new Stub(this.iID);
    }

    public abstract boolean y();
}
