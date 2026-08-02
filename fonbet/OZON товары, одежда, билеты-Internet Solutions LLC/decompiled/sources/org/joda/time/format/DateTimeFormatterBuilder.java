package org.joda.time.format;

import Ij.C3261b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.field.MillisDurationField;

/* loaded from: classes6.dex */
public class DateTimeFormatterBuilder {
    private ArrayList<Object> iElementPairs = new ArrayList<>();
    private Object iFormatter;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes10.dex */
    static final class TimeZoneId implements org.joda.time.format.l, org.joda.time.format.j {
        private static final /* synthetic */ TimeZoneId[] $VALUES;
        private static final List<String> ALL_IDS;
        private static final List<String> BASE_GROUPED_IDS;
        private static final Map<String, List<String>> GROUPED_IDS;
        public static final TimeZoneId INSTANCE;
        static final int MAX_LENGTH;
        static final int MAX_PREFIX_LENGTH;

        static {
            TimeZoneId timeZoneId = new TimeZoneId("INSTANCE", 0);
            INSTANCE = timeZoneId;
            $VALUES = new TimeZoneId[]{timeZoneId};
            BASE_GROUPED_IDS = new ArrayList();
            ArrayList arrayList = new ArrayList(DateTimeZone.s().b());
            ALL_IDS = arrayList;
            Collections.sort(arrayList);
            GROUPED_IDS = new HashMap();
            Iterator it = arrayList.iterator();
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                int indexOf = str.indexOf(47);
                if (indexOf >= 0) {
                    indexOf = indexOf < str.length() ? indexOf + 1 : indexOf;
                    i12 = Math.max(i12, indexOf);
                    String substring = str.substring(0, indexOf + 1);
                    String substring2 = str.substring(indexOf);
                    Map<String, List<String>> map = GROUPED_IDS;
                    if (!map.containsKey(substring)) {
                        map.put(substring, new ArrayList());
                    }
                    map.get(substring).add(substring2);
                } else {
                    BASE_GROUPED_IDS.add(str);
                }
                i11 = Math.max(i11, str.length());
            }
            MAX_LENGTH = i11;
            MAX_PREFIX_LENGTH = i12;
        }

        private TimeZoneId() {
            throw null;
        }

        public static TimeZoneId valueOf(String str) {
            return (TimeZoneId) Enum.valueOf(TimeZoneId.class, str);
        }

        public static TimeZoneId[] values() {
            return (TimeZoneId[]) $VALUES.clone();
        }

        @Override // org.joda.time.format.j
        public final int a() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.j
        public final int b(org.joda.time.format.d dVar, String str, int i11) {
            String str2;
            int i12;
            String str3;
            List<String> list = BASE_GROUPED_IDS;
            int length = str.length();
            int min = Math.min(length, MAX_PREFIX_LENGTH + i11);
            int i13 = i11;
            while (true) {
                if (i13 >= min) {
                    str2 = "";
                    i12 = i11;
                    break;
                }
                if (str.charAt(i13) == '/') {
                    int i14 = i13 + 1;
                    str2 = str.subSequence(i11, i14).toString();
                    i12 = str2.length() + i11;
                    if (i13 < length - 1) {
                        StringBuilder e11 = C3261b.e(str2);
                        e11.append(str.charAt(i14));
                        str3 = e11.toString();
                    } else {
                        str3 = str2;
                    }
                    list = GROUPED_IDS.get(str3);
                    if (list == null) {
                        return ~i11;
                    }
                } else {
                    i13++;
                }
            }
            String str4 = null;
            for (int i15 = 0; i15 < list.size(); i15++) {
                String str5 = list.get(i15);
                if (DateTimeFormatterBuilder.csStartsWith(str, i12, str5) && (str4 == null || str5.length() > str4.length())) {
                    str4 = str5;
                }
            }
            if (str4 == null) {
                return ~i11;
            }
            dVar.r(DateTimeZone.d(str2.concat(str4)));
            return str4.length() + i12;
        }

        @Override // org.joda.time.format.l
        public final void d(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.l
        public final void e(Appendable appendable, long j11, org.joda.time.a aVar, int i11, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.h() : "");
        }

        @Override // org.joda.time.format.l
        public final int estimatePrintedLength() {
            return MAX_LENGTH;
        }
    }

    static class a implements org.joda.time.format.l, org.joda.time.format.j {

        /* renamed from: a, reason: collision with root package name */
        private final char f79234a;

        a(char c11) {
            this.f79234a = c11;
        }

        @Override // org.joda.time.format.j
        public final int a() {
            return 1;
        }

        @Override // org.joda.time.format.j
        public final int b(org.joda.time.format.d dVar, String str, int i11) {
            char upperCase;
            char upperCase2;
            if (i11 >= str.length()) {
                return ~i11;
            }
            char charAt = str.charAt(i11);
            char c11 = this.f79234a;
            return (charAt == c11 || (upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(c11)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i11 + 1 : ~i11;
        }

        @Override // org.joda.time.format.l
        public final void d(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
            sb2.append(this.f79234a);
        }

        @Override // org.joda.time.format.l
        public final void e(Appendable appendable, long j11, org.joda.time.a aVar, int i11, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.f79234a);
        }

        @Override // org.joda.time.format.l
        public final int estimatePrintedLength() {
            return 1;
        }
    }

    static class b implements org.joda.time.format.l, org.joda.time.format.j {

        /* renamed from: a, reason: collision with root package name */
        private final org.joda.time.format.l[] f79235a;

        /* renamed from: b, reason: collision with root package name */
        private final org.joda.time.format.j[] f79236b;

        /* renamed from: c, reason: collision with root package name */
        private final int f79237c;

        /* renamed from: d, reason: collision with root package name */
        private final int f79238d;

        b(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            for (int i11 = 0; i11 < size; i11 += 2) {
                Object obj = list.get(i11);
                if (obj instanceof b) {
                    org.joda.time.format.l[] lVarArr = ((b) obj).f79235a;
                    if (lVarArr != null) {
                        for (org.joda.time.format.l lVar : lVarArr) {
                            arrayList.add(lVar);
                        }
                    }
                } else {
                    arrayList.add(obj);
                }
                Object obj2 = list.get(i11 + 1);
                if (obj2 instanceof b) {
                    org.joda.time.format.j[] jVarArr = ((b) obj2).f79236b;
                    if (jVarArr != null) {
                        for (org.joda.time.format.j jVar : jVarArr) {
                            arrayList2.add(jVar);
                        }
                    }
                } else {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList.contains(null) || arrayList.isEmpty()) {
                this.f79235a = null;
                this.f79237c = 0;
            } else {
                int size2 = arrayList.size();
                this.f79235a = new org.joda.time.format.l[size2];
                int i12 = 0;
                for (int i13 = 0; i13 < size2; i13++) {
                    org.joda.time.format.l lVar2 = (org.joda.time.format.l) arrayList.get(i13);
                    i12 += lVar2.estimatePrintedLength();
                    this.f79235a[i13] = lVar2;
                }
                this.f79237c = i12;
            }
            if (arrayList2.contains(null) || arrayList2.isEmpty()) {
                this.f79236b = null;
                this.f79238d = 0;
                return;
            }
            int size3 = arrayList2.size();
            this.f79236b = new org.joda.time.format.j[size3];
            int i14 = 0;
            for (int i15 = 0; i15 < size3; i15++) {
                org.joda.time.format.j jVar2 = (org.joda.time.format.j) arrayList2.get(i15);
                i14 += jVar2.a();
                this.f79236b[i15] = jVar2;
            }
            this.f79238d = i14;
        }

        @Override // org.joda.time.format.j
        public final int a() {
            return this.f79238d;
        }

        @Override // org.joda.time.format.j
        public final int b(org.joda.time.format.d dVar, String str, int i11) {
            org.joda.time.format.j[] jVarArr = this.f79236b;
            if (jVarArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = jVarArr.length;
            for (int i12 = 0; i12 < length && i11 >= 0; i12++) {
                i11 = jVarArr[i12].b(dVar, str, i11);
            }
            return i11;
        }

        final boolean c() {
            return this.f79236b != null;
        }

        @Override // org.joda.time.format.l
        public final void d(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
            org.joda.time.format.l[] lVarArr = this.f79235a;
            if (lVarArr == null) {
                throw new UnsupportedOperationException();
            }
            if (locale == null) {
                locale = Locale.getDefault();
            }
            for (org.joda.time.format.l lVar : lVarArr) {
                lVar.d(sb2, eVar, locale);
            }
        }

        @Override // org.joda.time.format.l
        public final void e(Appendable appendable, long j11, org.joda.time.a aVar, int i11, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            org.joda.time.format.l[] lVarArr = this.f79235a;
            if (lVarArr == null) {
                throw new UnsupportedOperationException();
            }
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (org.joda.time.format.l lVar : lVarArr) {
                lVar.e(appendable, j11, aVar, i11, dateTimeZone, locale2);
            }
        }

        @Override // org.joda.time.format.l
        public final int estimatePrintedLength() {
            return this.f79237c;
        }

        final boolean f() {
            return this.f79235a != null;
        }
    }

    static class c extends g {
        @Override // org.joda.time.format.DateTimeFormatterBuilder.f, org.joda.time.format.j
        public final int b(org.joda.time.format.d dVar, String str, int i11) {
            int i12;
            char charAt;
            int b11 = super.b(dVar, str, i11);
            if (b11 < 0 || b11 == (i12 = this.f79245b + i11)) {
                return b11;
            }
            if (this.f79246c && ((charAt = str.charAt(i11)) == '-' || charAt == '+')) {
                i12++;
            }
            return b11 > i12 ? ~(i12 + 1) : b11 < i12 ? ~b11 : b11;
        }
    }

    static class d implements org.joda.time.format.l, org.joda.time.format.j {

        /* renamed from: a, reason: collision with root package name */
        private final DateTimeFieldType f79239a;

        /* renamed from: b, reason: collision with root package name */
        protected int f79240b;

        /* renamed from: c, reason: collision with root package name */
        protected int f79241c;

        protected d(DateTimeFieldType dateTimeFieldType, int i11, int i12) {
            this.f79239a = dateTimeFieldType;
            i12 = i12 > 18 ? 18 : i12;
            this.f79240b = i11;
            this.f79241c = i12;
        }

        @Override // org.joda.time.format.j
        public final int a() {
            return this.f79241c;
        }

        @Override // org.joda.time.format.j
        public final int b(org.joda.time.format.d dVar, String str, int i11) {
            org.joda.time.b O11 = this.f79239a.O(dVar.g());
            int min = Math.min(this.f79241c, str.length() - i11);
            long g10 = O11.n().g() * 10;
            long j11 = 0;
            int i12 = 0;
            while (i12 < min) {
                char charAt = str.charAt(i11 + i12);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i12++;
                g10 /= 10;
                j11 += (charAt - '0') * g10;
            }
            long j12 = j11 / 10;
            if (i12 != 0 && j12 <= 2147483647L) {
                dVar.o(new org.joda.time.field.e(DateTimeFieldType.V(), MillisDurationField.f79212a, O11.n()), (int) j12);
                return i11 + i12;
            }
            return ~i11;
        }

        protected final void c(Appendable appendable, long j11, org.joda.time.a aVar) throws IOException {
            long j12;
            org.joda.time.b O11 = this.f79239a.O(aVar);
            int i11 = this.f79240b;
            try {
                long G11 = O11.G(j11);
                if (G11 == 0) {
                    while (true) {
                        i11--;
                        if (i11 < 0) {
                            return;
                        } else {
                            appendable.append('0');
                        }
                    }
                } else {
                    long g10 = O11.n().g();
                    int i12 = this.f79241c;
                    while (true) {
                        switch (i12) {
                            case 1:
                                j12 = 10;
                                break;
                            case 2:
                                j12 = 100;
                                break;
                            case 3:
                                j12 = 1000;
                                break;
                            case 4:
                                j12 = 10000;
                                break;
                            case 5:
                                j12 = 100000;
                                break;
                            case 6:
                                j12 = 1000000;
                                break;
                            case 7:
                                j12 = 10000000;
                                break;
                            case 8:
                                j12 = 100000000;
                                break;
                            case 9:
                                j12 = 1000000000;
                                break;
                            case 10:
                                j12 = 10000000000L;
                                break;
                            case 11:
                                j12 = 100000000000L;
                                break;
                            case 12:
                                j12 = 1000000000000L;
                                break;
                            case 13:
                                j12 = 10000000000000L;
                                break;
                            case 14:
                                j12 = 100000000000000L;
                                break;
                            case 15:
                                j12 = 1000000000000000L;
                                break;
                            case 16:
                                j12 = 10000000000000000L;
                                break;
                            case 17:
                                j12 = 100000000000000000L;
                                break;
                            case 18:
                                j12 = 1000000000000000000L;
                                break;
                            default:
                                j12 = 1;
                                break;
                        }
                        if ((g10 * j12) / j12 == g10) {
                            long[] jArr = {(G11 * j12) / g10, i12};
                            long j13 = jArr[0];
                            int i13 = (int) jArr[1];
                            String num = (2147483647L & j13) == j13 ? Integer.toString((int) j13) : Long.toString(j13);
                            int length = num.length();
                            while (length < i13) {
                                appendable.append('0');
                                i11--;
                                i13--;
                            }
                            if (i11 < i13) {
                                while (i11 < i13 && length > 1 && num.charAt(length - 1) == '0') {
                                    i13--;
                                    length--;
                                }
                                if (length < num.length()) {
                                    for (int i14 = 0; i14 < length; i14++) {
                                        appendable.append(num.charAt(i14));
                                    }
                                    return;
                                }
                            }
                            appendable.append(num);
                            return;
                        }
                        i12--;
                    }
                }
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, i11);
            }
        }

        @Override // org.joda.time.format.l
        public final void d(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
            c(sb2, eVar.getChronology().Q(eVar, 0L), eVar.getChronology());
        }

        @Override // org.joda.time.format.l
        public final void e(Appendable appendable, long j11, org.joda.time.a aVar, int i11, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            c(appendable, j11, aVar);
        }

        @Override // org.joda.time.format.l
        public final int estimatePrintedLength() {
            return this.f79241c;
        }
    }

    static class e implements org.joda.time.format.j {

        /* renamed from: a, reason: collision with root package name */
        private final org.joda.time.format.j[] f79242a;

        /* renamed from: b, reason: collision with root package name */
        private final int f79243b;

        e(org.joda.time.format.j[] jVarArr) {
            int a11;
            this.f79242a = jVarArr;
            int length = jVarArr.length;
            int i11 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    this.f79243b = i11;
                    return;
                }
                org.joda.time.format.j jVar = jVarArr[length];
                if (jVar != null && (a11 = jVar.a()) > i11) {
                    i11 = a11;
                }
            }
        }

        @Override // org.joda.time.format.j
        public final int a() {
            return this.f79243b;
        }

        @Override // org.joda.time.format.j
        public final int b(org.joda.time.format.d dVar, String str, int i11) {
            int i12;
            int i13;
            org.joda.time.format.j[] jVarArr = this.f79242a;
            int length = jVarArr.length;
            Object p11 = dVar.p();
            boolean z11 = false;
            Object obj = null;
            int i14 = i11;
            int i15 = i14;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    break;
                }
                org.joda.time.format.j jVar = jVarArr[i16];
                if (jVar != null) {
                    int b11 = jVar.b(dVar, str, i11);
                    if (b11 >= i11) {
                        if (b11 <= i14) {
                            continue;
                        } else {
                            if (b11 >= str.length() || (i13 = i16 + 1) >= length || jVarArr[i13] == null) {
                                break;
                            }
                            obj = dVar.p();
                            i14 = b11;
                        }
                    } else if (b11 < 0 && (i12 = ~b11) > i15) {
                        i15 = i12;
                    }
                    dVar.l(p11);
                    i16++;
                } else {
                    if (i14 <= i11) {
                        return i11;
                    }
                    z11 = true;
                }
            }
            if (i14 <= i11 && (i14 != i11 || !z11)) {
                return ~i15;
            }
            if (obj != null) {
                dVar.l(obj);
            }
            return i14;
        }
    }

    static abstract class f implements org.joda.time.format.l, org.joda.time.format.j {

        /* renamed from: a, reason: collision with root package name */
        protected final DateTimeFieldType f79244a;

        /* renamed from: b, reason: collision with root package name */
        protected final int f79245b;

        /* renamed from: c, reason: collision with root package name */
        protected final boolean f79246c;

        f(DateTimeFieldType dateTimeFieldType, int i11, boolean z11) {
            this.f79244a = dateTimeFieldType;
            this.f79245b = i11;
            this.f79246c = z11;
        }

        @Override // org.joda.time.format.j
        public final int a() {
            return this.f79245b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
        
            if (r10 <= '9') goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
        
            r5 = r5 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int b(org.joda.time.format.d dVar, String str, int i11) {
            int i12;
            int i13;
            char charAt;
            int min = Math.min(this.f79245b, str.length() - i11);
            int i14 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i14 < min) {
                int i15 = i11 + i14;
                char charAt2 = str.charAt(i15);
                if (i14 != 0 || ((charAt2 != '-' && charAt2 != '+') || !this.f79246c)) {
                    break;
                }
                boolean z13 = charAt2 == '-';
                boolean z14 = charAt2 == '+';
                int i16 = i14 + 1;
                if (i16 >= min || (charAt = str.charAt(i15 + 1)) < '0' || charAt > '9') {
                    boolean z15 = z13;
                    z12 = z14;
                    z11 = z15;
                    break;
                }
                min = Math.min(min + 1, str.length() - i11);
                boolean z16 = z13;
                z12 = z14;
                z11 = z16;
                i14 = i16;
            }
            if (i14 == 0) {
                return ~i11;
            }
            if (i14 < 9) {
                int i17 = (z11 || z12) ? i11 + 1 : i11;
                int i18 = i17 + 1;
                try {
                    int charAt3 = str.charAt(i17) - '0';
                    i12 = i11 + i14;
                    while (i18 < i12) {
                        int i19 = (charAt3 << 3) + (charAt3 << 1);
                        int i21 = i18 + 1;
                        int charAt4 = (str.charAt(i18) + i19) - 48;
                        i18 = i21;
                        charAt3 = charAt4;
                    }
                    i13 = z11 ? -charAt3 : charAt3;
                } catch (StringIndexOutOfBoundsException unused) {
                    return ~i11;
                }
            } else if (z12) {
                i12 = i11 + i14;
                i13 = Integer.parseInt(str.subSequence(i11 + 1, i12).toString());
            } else {
                int i22 = i11 + i14;
                i13 = Integer.parseInt(str.subSequence(i11, i22).toString());
                i12 = i22;
            }
            dVar.m(this.f79244a, i13);
            return i12;
        }
    }

    static class g extends f {

        /* renamed from: d, reason: collision with root package name */
        protected final int f79247d;

        protected g(DateTimeFieldType dateTimeFieldType, int i11, boolean z11, int i12) {
            super(dateTimeFieldType, i11, z11);
            this.f79247d = i12;
        }

        @Override // org.joda.time.format.l
        public final void d(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
            DateTimeFieldType dateTimeFieldType = this.f79244a;
            boolean y11 = eVar.y(dateTimeFieldType);
            int i11 = this.f79247d;
            if (!y11) {
                DateTimeFormatterBuilder.appendUnknownString(sb2, i11);
                return;
            }
            try {
                org.joda.time.format.h.a(sb2, eVar.s0(dateTimeFieldType), i11);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(sb2, i11);
            }
        }

        @Override // org.joda.time.format.l
        public final void e(Appendable appendable, long j11, org.joda.time.a aVar, int i11, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int i12 = this.f79247d;
            try {
                org.joda.time.format.h.a(appendable, this.f79244a.O(aVar).d(j11), i12);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, i12);
            }
        }

        @Override // org.joda.time.format.l
        public final int estimatePrintedLength() {
            return this.f79245b;
        }
    }

    static class h implements org.joda.time.format.l, org.joda.time.format.j {

        /* renamed from: a, reason: collision with root package name */
        private final String f79248a;

        h(String str) {
            this.f79248a = str;
        }

        @Override // org.joda.time.format.j
        public final int a() {
            return this.f79248a.length();
        }

        @Override // org.joda.time.format.j
        public final int b(org.joda.time.format.d dVar, String str, int i11) {
            String str2 = this.f79248a;
            return DateTimeFormatterBuilder.csStartsWithIgnoreCase(str, i11, str2) ? str2.length() + i11 : ~i11;
        }

        @Override // org.joda.time.format.l
        public final void d(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
            sb2.append((CharSequence) this.f79248a);
        }

        @Override // org.joda.time.format.l
        public final void e(Appendable appendable, long j11, org.joda.time.a aVar, int i11, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.f79248a);
        }

        @Override // org.joda.time.format.l
        public final int estimatePrintedLength() {
            return this.f79248a.length();
        }
    }

    /* loaded from: classes10.dex */
    static class i implements org.joda.time.format.l, org.joda.time.format.j {

        /* renamed from: c, reason: collision with root package name */
        private static ConcurrentHashMap f79249c = new ConcurrentHashMap();

        /* renamed from: a, reason: collision with root package name */
        private final DateTimeFieldType f79250a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f79251b;

        i(DateTimeFieldType dateTimeFieldType, boolean z11) {
            this.f79250a = dateTimeFieldType;
            this.f79251b = z11;
        }

        @Override // org.joda.time.format.j
        public final int a() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.j
        public final int b(org.joda.time.format.d dVar, String str, int i11) {
            int intValue;
            Map map;
            Locale h11 = dVar.h();
            ConcurrentHashMap concurrentHashMap = f79249c;
            Map map2 = (Map) concurrentHashMap.get(h11);
            if (map2 == null) {
                map2 = new ConcurrentHashMap();
                concurrentHashMap.put(h11, map2);
            }
            DateTimeFieldType dateTimeFieldType = this.f79250a;
            Object[] objArr = (Object[]) map2.get(dateTimeFieldType);
            if (objArr == null) {
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(32);
                MutableDateTime.Property h12 = new MutableDateTime(0L, DateTimeZone.f78989a).h(dateTimeFieldType);
                int y11 = h12.e().y();
                int u11 = h12.e().u();
                if (u11 - y11 > 32) {
                    return ~i11;
                }
                intValue = h12.e().s(h11);
                while (y11 <= u11) {
                    h12.i(y11);
                    String a11 = h12.a(h11);
                    Boolean bool = Boolean.TRUE;
                    concurrentHashMap2.put(a11, bool);
                    concurrentHashMap2.put(h12.a(h11).toLowerCase(h11), bool);
                    concurrentHashMap2.put(h12.a(h11).toUpperCase(h11), bool);
                    concurrentHashMap2.put(h12.b(h11), bool);
                    concurrentHashMap2.put(h12.b(h11).toLowerCase(h11), bool);
                    concurrentHashMap2.put(h12.b(h11).toUpperCase(h11), bool);
                    y11++;
                }
                if ("en".equals(h11.getLanguage()) && dateTimeFieldType == DateTimeFieldType.M()) {
                    Boolean bool2 = Boolean.TRUE;
                    concurrentHashMap2.put("BCE", bool2);
                    concurrentHashMap2.put("bce", bool2);
                    concurrentHashMap2.put("CE", bool2);
                    concurrentHashMap2.put("ce", bool2);
                    intValue = 3;
                }
                map2.put(dateTimeFieldType, new Object[]{concurrentHashMap2, Integer.valueOf(intValue)});
                map = concurrentHashMap2;
            } else {
                Map map3 = (Map) objArr[0];
                intValue = ((Integer) objArr[1]).intValue();
                map = map3;
            }
            for (int min = Math.min(str.length(), intValue + i11); min > i11; min--) {
                String charSequence = str.subSequence(i11, min).toString();
                if (map.containsKey(charSequence)) {
                    dVar.n(dateTimeFieldType, charSequence, h11);
                    return min;
                }
            }
            return ~i11;
        }

        @Override // org.joda.time.format.l
        public final void d(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
            String str;
            try {
                DateTimeFieldType dateTimeFieldType = this.f79250a;
                if (eVar.y(dateTimeFieldType)) {
                    org.joda.time.b O11 = dateTimeFieldType.O(eVar.getChronology());
                    str = this.f79251b ? O11.g(eVar, locale) : O11.j(eVar, locale);
                } else {
                    str = "�";
                }
                sb2.append((CharSequence) str);
            } catch (RuntimeException unused) {
                sb2.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.l
        public final void e(Appendable appendable, long j11, org.joda.time.a aVar, int i11, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                org.joda.time.b O11 = this.f79250a.O(aVar);
                appendable.append(this.f79251b ? O11.f(j11, locale) : O11.i(j11, locale));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.l
        public final int estimatePrintedLength() {
            return this.f79251b ? 6 : 20;
        }
    }

    /* loaded from: classes10.dex */
    static class j implements org.joda.time.format.l, org.joda.time.format.j {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, DateTimeZone> f79252a;

        /* renamed from: b, reason: collision with root package name */
        private final int f79253b;

        j(int i11, Map<String, DateTimeZone> map) {
            this.f79253b = i11;
            this.f79252a = map;
        }

        @Override // org.joda.time.format.j
        public final int a() {
            return this.f79253b == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.j
        public final int b(org.joda.time.format.d dVar, String str, int i11) {
            Map<String, DateTimeZone> map = this.f79252a;
            if (map == null) {
                map = org.joda.time.c.b();
            }
            String str2 = null;
            for (String str3 : map.keySet()) {
                if (DateTimeFormatterBuilder.csStartsWith(str, i11, str3) && (str2 == null || str3.length() > str2.length())) {
                    str2 = str3;
                }
            }
            if (str2 == null) {
                return ~i11;
            }
            dVar.r(map.get(str2));
            return str2.length() + i11;
        }

        @Override // org.joda.time.format.l
        public final void d(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.l
        public final void e(Appendable appendable, long j11, org.joda.time.a aVar, int i11, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            long j12 = j11 - i11;
            String str = "";
            if (dateTimeZone != null) {
                int i12 = this.f79253b;
                if (i12 == 0) {
                    str = dateTimeZone.j(j12, locale);
                } else if (i12 == 1) {
                    str = dateTimeZone.u(j12, locale);
                }
            }
            appendable.append(str);
        }

        @Override // org.joda.time.format.l
        public final int estimatePrintedLength() {
            return this.f79253b == 1 ? 4 : 20;
        }
    }

    static class k implements org.joda.time.format.l, org.joda.time.format.j {

        /* renamed from: a, reason: collision with root package name */
        private final String f79254a;

        /* renamed from: b, reason: collision with root package name */
        private final String f79255b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f79256c;

        /* renamed from: d, reason: collision with root package name */
        private final int f79257d;

        /* renamed from: e, reason: collision with root package name */
        private final int f79258e;

        k(String str, String str2, boolean z11, int i11, int i12) {
            this.f79254a = str;
            this.f79255b = str2;
            this.f79256c = z11;
            if (i11 <= 0 || i12 < i11) {
                throw new IllegalArgumentException();
            }
            if (i11 > 4) {
                i11 = 4;
                i12 = 4;
            }
            this.f79257d = i11;
            this.f79258e = i12;
        }

        private static int c(int i11, int i12, String str) {
            int i13 = 0;
            for (int min = Math.min(str.length() - i11, i12); min > 0; min--) {
                char charAt = str.charAt(i11 + i13);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i13++;
            }
            return i13;
        }

        @Override // org.joda.time.format.j
        public final int a() {
            return estimatePrintedLength();
        }

        /* JADX WARN: Code restructure failed: missing block: B:88:0x007b, code lost:
        
            if (r8 <= '9') goto L43;
         */
        @Override // org.joda.time.format.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int b(org.joda.time.format.d dVar, String str, int i11) {
            boolean z11;
            int f7;
            int f11;
            int f12;
            char charAt;
            int length = str.length() - i11;
            boolean z12 = false;
            String str2 = this.f79255b;
            if (str2 != null) {
                if (str2.length() == 0) {
                    if (length <= 0 || ((charAt = str.charAt(i11)) != '-' && charAt != '+')) {
                        dVar.q(0);
                        return i11;
                    }
                } else if (DateTimeFormatterBuilder.csStartsWithIgnoreCase(str, i11, str2)) {
                    dVar.q(0);
                    return str2.length() + i11;
                }
            }
            if (length <= 1) {
                return ~i11;
            }
            char charAt2 = str.charAt(i11);
            if (charAt2 == '-') {
                z11 = true;
            } else {
                if (charAt2 != '+') {
                    return ~i11;
                }
                z11 = false;
            }
            int i12 = i11 + 1;
            if (c(i12, 2, str) >= 2 && (f7 = org.joda.time.format.h.f(i12, str)) <= 23) {
                int i13 = f7 * 3600000;
                int i14 = length - 3;
                int i15 = i11 + 3;
                if (i14 > 0) {
                    char charAt3 = str.charAt(i15);
                    if (charAt3 == ':') {
                        i14 = length - 4;
                        i15 = i11 + 4;
                        z12 = true;
                    } else if (charAt3 >= '0') {
                    }
                    int c11 = c(i15, 2, str);
                    if (c11 != 0 || z12) {
                        if (c11 >= 2 && (f11 = org.joda.time.format.h.f(i15, str)) <= 59) {
                            i13 += f11 * 60000;
                            int i16 = i14 - 2;
                            int i17 = i15 + 2;
                            if (i16 > 0) {
                                if (!z12) {
                                    i15 = i17;
                                } else if (str.charAt(i17) == ':') {
                                    i16 = i14 - 3;
                                    i15 += 3;
                                }
                                int c12 = c(i15, 2, str);
                                if (c12 != 0 || z12) {
                                    if (c12 >= 2 && (f12 = org.joda.time.format.h.f(i15, str)) <= 59) {
                                        i13 += f12 * 1000;
                                        int i18 = i15 + 2;
                                        if (i16 - 2 > 0) {
                                            if (!z12) {
                                                i15 = i18;
                                            } else if (str.charAt(i18) == '.' || str.charAt(i18) == ',') {
                                                i15 += 3;
                                            }
                                            int c13 = c(i15, 3, str);
                                            if (c13 != 0 || z12) {
                                                if (c13 < 1) {
                                                    return ~i15;
                                                }
                                                i18 = i15 + 1;
                                                i13 += (str.charAt(i15) - '0') * 100;
                                                if (c13 > 1) {
                                                    int i19 = i15 + 2;
                                                    i13 += (str.charAt(i18) - '0') * 10;
                                                    if (c13 > 2) {
                                                        i15 += 3;
                                                        i13 += str.charAt(i19) - '0';
                                                    } else {
                                                        i15 = i19;
                                                    }
                                                }
                                            }
                                        }
                                        i15 = i18;
                                    }
                                    return ~i15;
                                }
                            }
                            i15 = i17;
                        }
                        return ~i15;
                    }
                }
                if (z11) {
                    i13 = -i13;
                }
                dVar.q(Integer.valueOf(i13));
                return i15;
            }
            return ~i12;
        }

        @Override // org.joda.time.format.l
        public final void d(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.l
        public final void e(Appendable appendable, long j11, org.joda.time.a aVar, int i11, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            String str;
            if (dateTimeZone == null) {
                return;
            }
            if (i11 == 0 && (str = this.f79254a) != null) {
                appendable.append(str);
                return;
            }
            if (i11 >= 0) {
                appendable.append('+');
            } else {
                appendable.append('-');
                i11 = -i11;
            }
            int i12 = i11 / 3600000;
            org.joda.time.format.h.a(appendable, i12, 2);
            int i13 = this.f79258e;
            if (i13 == 1) {
                return;
            }
            int i14 = i11 - (i12 * 3600000);
            int i15 = this.f79257d;
            if (i14 != 0 || i15 > 1) {
                int i16 = i14 / 60000;
                boolean z11 = this.f79256c;
                if (z11) {
                    appendable.append(':');
                }
                org.joda.time.format.h.a(appendable, i16, 2);
                if (i13 == 2) {
                    return;
                }
                int i17 = i14 - (i16 * 60000);
                if (i17 != 0 || i15 > 2) {
                    int i18 = i17 / 1000;
                    if (z11) {
                        appendable.append(':');
                    }
                    org.joda.time.format.h.a(appendable, i18, 2);
                    if (i13 == 3) {
                        return;
                    }
                    int i19 = i17 - (i18 * 1000);
                    if (i19 != 0 || i15 > 3) {
                        if (z11) {
                            appendable.append('.');
                        }
                        org.joda.time.format.h.a(appendable, i19, 3);
                    }
                }
            }
        }

        @Override // org.joda.time.format.l
        public final int estimatePrintedLength() {
            int i11 = this.f79257d;
            int i12 = (i11 + 1) << 1;
            if (this.f79256c) {
                i12 += i11 - 1;
            }
            String str = this.f79254a;
            return (str == null || str.length() <= i12) ? i12 : str.length();
        }
    }

    /* loaded from: classes10.dex */
    static class l implements org.joda.time.format.l, org.joda.time.format.j {

        /* renamed from: a, reason: collision with root package name */
        private final DateTimeFieldType f79259a;

        /* renamed from: b, reason: collision with root package name */
        private final int f79260b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f79261c;

        l(DateTimeFieldType dateTimeFieldType, int i11, boolean z11) {
            this.f79259a = dateTimeFieldType;
            this.f79260b = i11;
            this.f79261c = z11;
        }

        @Override // org.joda.time.format.j
        public final int a() {
            return this.f79261c ? 4 : 2;
        }

        @Override // org.joda.time.format.j
        public final int b(org.joda.time.format.d dVar, String str, int i11) {
            int i12;
            int i13;
            int i14 = i11;
            int length = str.length() - i14;
            DateTimeFieldType dateTimeFieldType = this.f79259a;
            if (this.f79261c) {
                int i15 = 0;
                boolean z11 = false;
                boolean z12 = false;
                while (i15 < length) {
                    char charAt = str.charAt(i14 + i15);
                    if (i15 != 0 || (charAt != '-' && charAt != '+')) {
                        if (charAt < '0' || charAt > '9') {
                            break;
                        }
                        i15++;
                    } else {
                        z12 = charAt == '-';
                        if (z12) {
                            i15++;
                        } else {
                            i14++;
                            length--;
                        }
                        z11 = true;
                    }
                }
                if (i15 == 0) {
                    return ~i14;
                }
                if (z11 || i15 != 2) {
                    if (i15 >= 9) {
                        i12 = i15 + i14;
                        i13 = Integer.parseInt(str.subSequence(i14, i12).toString());
                    } else {
                        int i16 = z12 ? i14 + 1 : i14;
                        int i17 = i16 + 1;
                        try {
                            int charAt2 = str.charAt(i16) - '0';
                            i12 = i15 + i14;
                            while (i17 < i12) {
                                int charAt3 = (str.charAt(i17) + ((charAt2 << 3) + (charAt2 << 1))) - 48;
                                i17++;
                                charAt2 = charAt3;
                            }
                            i13 = z12 ? -charAt2 : charAt2;
                        } catch (StringIndexOutOfBoundsException unused) {
                            return ~i14;
                        }
                    }
                    dVar.m(dateTimeFieldType, i13);
                    return i12;
                }
            } else if (Math.min(2, length) < 2) {
                return ~i14;
            }
            char charAt4 = str.charAt(i14);
            if (charAt4 < '0' || charAt4 > '9') {
                return ~i14;
            }
            int i18 = charAt4 - '0';
            char charAt5 = str.charAt(i14 + 1);
            if (charAt5 < '0' || charAt5 > '9') {
                return ~i14;
            }
            int i19 = (((i18 << 3) + (i18 << 1)) + charAt5) - 48;
            int i21 = this.f79260b;
            int i22 = i21 - 50;
            int i23 = i22 >= 0 ? i22 % 100 : ((i21 - 49) % 100) + 99;
            dVar.m(dateTimeFieldType, ((i22 + (i19 < i23 ? 100 : 0)) - i23) + i19);
            return i14 + 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x0015  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        @Override // org.joda.time.format.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
            int i11;
            DateTimeFieldType dateTimeFieldType = this.f79259a;
            if (eVar.y(dateTimeFieldType)) {
                try {
                    int s02 = eVar.s0(dateTimeFieldType);
                    if (s02 < 0) {
                        s02 = -s02;
                    }
                    i11 = s02 % 100;
                } catch (RuntimeException unused) {
                }
                if (i11 < 0) {
                    org.joda.time.format.h.a(sb2, i11, 2);
                    return;
                } else {
                    sb2.append((char) 65533);
                    sb2.append((char) 65533);
                    return;
                }
            }
            i11 = -1;
            if (i11 < 0) {
            }
        }

        @Override // org.joda.time.format.l
        public final void e(Appendable appendable, long j11, org.joda.time.a aVar, int i11, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int i12;
            try {
                int d11 = this.f79259a.O(aVar).d(j11);
                if (d11 < 0) {
                    d11 = -d11;
                }
                i12 = d11 % 100;
            } catch (RuntimeException unused) {
                i12 = -1;
            }
            if (i12 >= 0) {
                org.joda.time.format.h.a(appendable, i12, 2);
            } else {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.l
        public final int estimatePrintedLength() {
            return 2;
        }
    }

    static class m extends f {
        @Override // org.joda.time.format.l
        public final void d(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
            DateTimeFieldType dateTimeFieldType = this.f79244a;
            if (!eVar.y(dateTimeFieldType)) {
                sb2.append((char) 65533);
                return;
            }
            try {
                org.joda.time.format.h.c(sb2, eVar.s0(dateTimeFieldType));
            } catch (RuntimeException unused) {
                sb2.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.l
        public final void e(Appendable appendable, long j11, org.joda.time.a aVar, int i11, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                org.joda.time.format.h.c(appendable, this.f79244a.O(aVar).d(j11));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.l
        public final int estimatePrintedLength() {
            return this.f79245b;
        }
    }

    private DateTimeFormatterBuilder append0(Object obj) {
        this.iFormatter = null;
        this.iElementPairs.add(obj);
        this.iElementPairs.add(obj);
        return this;
    }

    static void appendUnknownString(Appendable appendable, int i11) throws IOException {
        while (true) {
            i11--;
            if (i11 < 0) {
                return;
            } else {
                appendable.append((char) 65533);
            }
        }
    }

    private void checkParser(org.joda.time.format.c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private void checkPrinter(org.joda.time.format.f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    static boolean csStartsWith(CharSequence charSequence, int i11, String str) {
        int length = str.length();
        if (charSequence.length() - i11 < length) {
            return false;
        }
        for (int i12 = 0; i12 < length; i12++) {
            if (charSequence.charAt(i11 + i12) != str.charAt(i12)) {
                return false;
            }
        }
        return true;
    }

    static boolean csStartsWithIgnoreCase(CharSequence charSequence, int i11, String str) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i11 < length) {
            return false;
        }
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = charSequence.charAt(i11 + i12);
            char charAt2 = str.charAt(i12);
            if (charAt != charAt2 && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    private Object getFormatter() {
        Object obj = this.iFormatter;
        if (obj == null) {
            if (this.iElementPairs.size() == 2) {
                Object obj2 = this.iElementPairs.get(0);
                Object obj3 = this.iElementPairs.get(1);
                if (obj2 == null) {
                    obj = obj3;
                } else if (obj2 == obj3 || obj3 == null) {
                    obj = obj2;
                }
            }
            if (obj == null) {
                obj = new b(this.iElementPairs);
            }
            this.iFormatter = obj;
        }
        return obj;
    }

    private boolean isParser(Object obj) {
        if (!(obj instanceof org.joda.time.format.j)) {
            return false;
        }
        if (obj instanceof b) {
            return ((b) obj).c();
        }
        return true;
    }

    private boolean isPrinter(Object obj) {
        if (!(obj instanceof org.joda.time.format.l)) {
            return false;
        }
        if (obj instanceof b) {
            return ((b) obj).f();
        }
        return true;
    }

    public DateTimeFormatterBuilder append(org.joda.time.format.b bVar) {
        if (bVar != null) {
            return append0(bVar.c(), bVar.b());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public DateTimeFormatterBuilder appendCenturyOfEra(int i11, int i12) {
        return appendSignedDecimal(DateTimeFieldType.G(), i11, i12);
    }

    public DateTimeFormatterBuilder appendClockhourOfDay(int i11) {
        return appendDecimal(DateTimeFieldType.H(), i11, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfHalfday(int i11) {
        return appendDecimal(DateTimeFieldType.I(), i11, 2);
    }

    public DateTimeFormatterBuilder appendDayOfMonth(int i11) {
        return appendDecimal(DateTimeFieldType.J(), i11, 2);
    }

    public DateTimeFormatterBuilder appendDayOfWeek(int i11) {
        return appendDecimal(DateTimeFieldType.K(), i11, 1);
    }

    public DateTimeFormatterBuilder appendDayOfWeekShortText() {
        return appendShortText(DateTimeFieldType.K());
    }

    public DateTimeFormatterBuilder appendDayOfWeekText() {
        return appendText(DateTimeFieldType.K());
    }

    public DateTimeFormatterBuilder appendDayOfYear(int i11) {
        return appendDecimal(DateTimeFieldType.L(), i11, 3);
    }

    public DateTimeFormatterBuilder appendDecimal(DateTimeFieldType dateTimeFieldType, int i11, int i12) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i12 < i11) {
            i12 = i11;
        }
        if (i11 < 0 || i12 <= 0) {
            throw new IllegalArgumentException();
        }
        return i11 <= 1 ? append0(new m(dateTimeFieldType, i12, false)) : append0(new g(dateTimeFieldType, i12, false, i11));
    }

    public DateTimeFormatterBuilder appendEraText() {
        return appendText(DateTimeFieldType.M());
    }

    public DateTimeFormatterBuilder appendFixedDecimal(DateTimeFieldType dateTimeFieldType, int i11) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i11 > 0) {
            return append0(new c(dateTimeFieldType, i11, false, i11));
        }
        throw new IllegalArgumentException(Ej.b.a(i11, "Illegal number of digits: "));
    }

    public DateTimeFormatterBuilder appendFraction(DateTimeFieldType dateTimeFieldType, int i11, int i12) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i12 < i11) {
            i12 = i11;
        }
        if (i11 < 0 || i12 <= 0) {
            throw new IllegalArgumentException();
        }
        return append0(new d(dateTimeFieldType, i11, i12));
    }

    public DateTimeFormatterBuilder appendFractionOfHour(int i11, int i12) {
        return appendFraction(DateTimeFieldType.S(), i11, i12);
    }

    public DateTimeFormatterBuilder appendFractionOfMinute(int i11, int i12) {
        return appendFraction(DateTimeFieldType.W(), i11, i12);
    }

    public DateTimeFormatterBuilder appendFractionOfSecond(int i11, int i12) {
        return appendFraction(DateTimeFieldType.Z(), i11, i12);
    }

    public DateTimeFormatterBuilder appendHalfdayOfDayText() {
        return appendText(DateTimeFieldType.R());
    }

    public DateTimeFormatterBuilder appendHourOfDay(int i11) {
        return appendDecimal(DateTimeFieldType.S(), i11, 2);
    }

    public DateTimeFormatterBuilder appendHourOfHalfday(int i11) {
        return appendDecimal(DateTimeFieldType.T(), i11, 2);
    }

    public DateTimeFormatterBuilder appendLiteral(char c11) {
        return append0(new a(c11));
    }

    public DateTimeFormatterBuilder appendMinuteOfHour(int i11) {
        return appendDecimal(DateTimeFieldType.X(), i11, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYear(int i11) {
        return appendDecimal(DateTimeFieldType.Y(), i11, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYearShortText() {
        return appendShortText(DateTimeFieldType.Y());
    }

    public DateTimeFormatterBuilder appendMonthOfYearText() {
        return appendText(DateTimeFieldType.Y());
    }

    public DateTimeFormatterBuilder appendOptional(org.joda.time.format.c cVar) {
        checkParser(cVar);
        return append0(null, new e(new org.joda.time.format.j[]{org.joda.time.format.e.d(cVar), null}));
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        org.joda.time.format.a.a(this, str);
        return this;
    }

    public DateTimeFormatterBuilder appendSecondOfMinute(int i11) {
        return appendDecimal(DateTimeFieldType.a0(), i11, 2);
    }

    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new i(dateTimeFieldType, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendSignedDecimal(DateTimeFieldType dateTimeFieldType, int i11, int i12) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i12 < i11) {
            i12 = i11;
        }
        if (i11 < 0 || i12 <= 0) {
            throw new IllegalArgumentException();
        }
        return i11 <= 1 ? append0(new m(dateTimeFieldType, i12, true)) : append0(new g(dateTimeFieldType, i12, true, i11));
    }

    public DateTimeFormatterBuilder appendText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new i(dateTimeFieldType, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendTimeZoneId() {
        TimeZoneId timeZoneId = TimeZoneId.INSTANCE;
        return append0(timeZoneId, timeZoneId);
    }

    public DateTimeFormatterBuilder appendTimeZoneName() {
        return append0(new j(0, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, boolean z11, int i11, int i12) {
        return append0(new k(str, str, z11, i11, i12));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> map) {
        j jVar = new j(1, map);
        return append0(jVar, jVar);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i11, boolean z11) {
        return append0(new l(DateTimeFieldType.c0(), i11, z11));
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i11, boolean z11) {
        return append0(new l(DateTimeFieldType.e0(), i11, z11));
    }

    public DateTimeFormatterBuilder appendWeekOfWeekyear(int i11) {
        return appendDecimal(DateTimeFieldType.b0(), i11, 2);
    }

    public DateTimeFormatterBuilder appendWeekyear(int i11, int i12) {
        return appendSignedDecimal(DateTimeFieldType.c0(), i11, i12);
    }

    public DateTimeFormatterBuilder appendYear(int i11, int i12) {
        return appendSignedDecimal(DateTimeFieldType.e0(), i11, i12);
    }

    public DateTimeFormatterBuilder appendYearOfEra(int i11, int i12) {
        return appendDecimal(DateTimeFieldType.g0(), i11, i12);
    }

    public void clear() {
        this.iFormatter = null;
        this.iElementPairs.clear();
    }

    public org.joda.time.format.b toFormatter() {
        Object formatter = getFormatter();
        org.joda.time.format.l lVar = isPrinter(formatter) ? (org.joda.time.format.l) formatter : null;
        org.joda.time.format.j jVar = isParser(formatter) ? (org.joda.time.format.j) formatter : null;
        if (lVar == null && jVar == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new org.joda.time.format.b(lVar, jVar);
    }

    public org.joda.time.format.c toParser() {
        Object formatter = getFormatter();
        if (isParser(formatter)) {
            return org.joda.time.format.k.d((org.joda.time.format.j) formatter);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        int length = str.length();
        return length != 0 ? length != 1 ? append0(new h(str)) : append0(new a(str.charAt(0))) : this;
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, String str2, boolean z11, int i11, int i12) {
        return append0(new k(str, str2, z11, i11, i12));
    }

    public DateTimeFormatterBuilder append(org.joda.time.format.f fVar) {
        checkPrinter(fVar);
        return append0(org.joda.time.format.g.a(fVar), null);
    }

    private DateTimeFormatterBuilder append0(org.joda.time.format.l lVar, org.joda.time.format.j jVar) {
        this.iFormatter = null;
        this.iElementPairs.add(lVar);
        this.iElementPairs.add(jVar);
        return this;
    }

    public DateTimeFormatterBuilder append(org.joda.time.format.c cVar) {
        checkParser(cVar);
        return append0(null, org.joda.time.format.e.d(cVar));
    }

    public DateTimeFormatterBuilder append(org.joda.time.format.f fVar, org.joda.time.format.c[] cVarArr) {
        if (fVar != null) {
            checkPrinter(fVar);
        }
        if (cVarArr != null) {
            int length = cVarArr.length;
            int i11 = 0;
            if (length == 1) {
                if (cVarArr[0] != null) {
                    return append0(org.joda.time.format.g.a(fVar), org.joda.time.format.e.d(cVarArr[0]));
                }
                throw new IllegalArgumentException("No parser supplied");
            }
            org.joda.time.format.j[] jVarArr = new org.joda.time.format.j[length];
            while (i11 < length - 1) {
                org.joda.time.format.j d11 = org.joda.time.format.e.d(cVarArr[i11]);
                jVarArr[i11] = d11;
                if (d11 == null) {
                    throw new IllegalArgumentException("Incomplete parser array");
                }
                i11++;
            }
            jVarArr[i11] = org.joda.time.format.e.d(cVarArr[i11]);
            return append0(org.joda.time.format.g.a(fVar), new e(jVarArr));
        }
        throw new IllegalArgumentException("No parsers supplied");
    }
}
