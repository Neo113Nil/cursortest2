package net.time4j;

import com.plaid.internal.EnumC3631g;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import oi.AbstractC5909e;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;

/* renamed from: net.time4j.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5718k {

    /* renamed from: d, reason: collision with root package name */
    public static final SortedMap f58273d;

    /* renamed from: e, reason: collision with root package name */
    public static C5718k f58274e;

    /* renamed from: f, reason: collision with root package name */
    public static final InterfaceC5907c f58275f;

    /* renamed from: a, reason: collision with root package name */
    public final transient Locale f58276a;

    /* renamed from: b, reason: collision with root package name */
    public final transient String f58277b;

    /* renamed from: c, reason: collision with root package name */
    public final transient SortedMap f58278c;

    /* renamed from: net.time4j.k$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$format$TextWidth;

        static {
            int[] iArr = new int[net.time4j.format.v.values().length];
            $SwitchMap$net$time4j$format$TextWidth = iArr;
            try {
                iArr[net.time4j.format.v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$format$TextWidth[net.time4j.format.v.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: net.time4j.k$b */
    public static class b extends AbstractC5909e implements net.time4j.format.t, oi.z {
        private static final long serialVersionUID = 5589976208326940032L;

        /* renamed from: a, reason: collision with root package name */
        public final transient boolean f58279a;

        /* renamed from: b, reason: collision with root package name */
        public final transient C5718k f58280b;

        public b(boolean z10, Locale locale, String str) {
            this(z10, C5718k.r(locale, str));
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("Serialization proxy required.");
        }

        private Object writeReplace() {
            return new SPX(this, 7);
        }

        @Override // oi.z
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public oi.p d(oi.q qVar) {
            return null;
        }

        public Object B() {
            return this.f58280b.f58278c;
        }

        @Override // oi.p
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public String c() {
            if (this.f58279a) {
                return "pm";
            }
            return (String) this.f58280b.f58278c.get((G) this.f58280b.f58278c.lastKey());
        }

        @Override // oi.p
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public String d0() {
            if (this.f58279a) {
                return "am";
            }
            return (String) this.f58280b.f58278c.get((G) this.f58280b.f58278c.firstKey());
        }

        public Locale E() {
            return this.f58280b.f58276a;
        }

        @Override // oi.z
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public String e(oi.q qVar) {
            return c();
        }

        @Override // oi.z
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public String i(oi.q qVar) {
            return d0();
        }

        @Override // oi.z
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public String p(oi.q qVar) {
            G g10 = (G) qVar.j(G.f57585o);
            if (this.f58279a) {
                return C5718k.n(g10);
            }
            if (this.f58280b.p()) {
                Map q10 = C5718k.q(E(), y());
                String str = g10.v0() ? "midnight" : g10.w0(G.A0(12)) ? "noon" : null;
                if (str != null && q10.containsKey(C5718k.k(q10, net.time4j.format.v.ABBREVIATED, net.time4j.format.m.FORMAT, str))) {
                    return str;
                }
            }
            return (String) this.f58280b.f58278c.get(this.f58280b.o(g10));
        }

        public boolean I() {
            return this.f58279a;
        }

        @Override // net.time4j.format.t
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public String a0(CharSequence charSequence, ParsePosition parsePosition, InterfaceC5908d interfaceC5908d) {
            int index = parsePosition.getIndex();
            InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57809h;
            net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
            net.time4j.format.m mVar2 = (net.time4j.format.m) interfaceC5908d.b(interfaceC5907c, mVar);
            String K10 = K(charSequence, parsePosition, interfaceC5908d, mVar2);
            if (K10 != null || !((Boolean) interfaceC5908d.b(net.time4j.format.a.f57812k, Boolean.TRUE)).booleanValue()) {
                return K10;
            }
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            if (mVar2 == mVar) {
                mVar = net.time4j.format.m.STANDALONE;
            }
            return K(charSequence, parsePosition, interfaceC5908d, mVar);
        }

        public final String K(CharSequence charSequence, ParsePosition parsePosition, InterfaceC5908d interfaceC5908d, net.time4j.format.m mVar) {
            String str;
            Map map;
            String str2;
            String str3;
            String str4;
            String k10;
            net.time4j.format.m mVar2 = mVar;
            ArrayList arrayList = new ArrayList();
            String str5 = "pm";
            String str6 = "am";
            if (this.f58279a) {
                arrayList.add("am");
                arrayList.add("pm");
                arrayList.add("midnight");
                arrayList.add("noon");
            } else {
                arrayList.addAll(new LinkedHashSet(this.f58280b.f58278c.values()));
                if (this.f58280b.p()) {
                    arrayList.add("midnight");
                    arrayList.add("noon");
                }
            }
            Map q10 = this.f58280b.p() ? C5718k.q(E(), y()) : null;
            net.time4j.format.v vVar = (net.time4j.format.v) interfaceC5908d.b(net.time4j.format.a.f57808g, net.time4j.format.v.WIDE);
            boolean booleanValue = ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57810i, Boolean.TRUE)).booleanValue();
            boolean booleanValue2 = ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57811j, Boolean.FALSE)).booleanValue();
            int index = parsePosition.getIndex();
            int length = charSequence.length();
            Iterator it = arrayList.iterator();
            String str7 = null;
            int i10 = 0;
            while (it.hasNext()) {
                boolean z10 = booleanValue2;
                String str8 = (String) it.next();
                Iterator it2 = it;
                if (this.f58280b.p()) {
                    if (this.f58279a) {
                        k10 = C5718k.k(q10, vVar, mVar2, str8);
                        if (!q10.containsKey(k10)) {
                            if (str8.equals("midnight")) {
                                k10 = C5718k.k(q10, vVar, mVar2, str6);
                            } else if (str8.equals("noon")) {
                                k10 = C5718k.k(q10, vVar, mVar2, str5);
                            }
                        }
                    } else {
                        k10 = C5718k.k(q10, vVar, mVar2, str8);
                    }
                    str = q10.containsKey(k10) ? (String) q10.get(k10) : null;
                } else {
                    str = str8;
                }
                if (str != null) {
                    int length2 = str.length();
                    map = q10;
                    int i11 = index;
                    int i12 = 0;
                    boolean z11 = true;
                    while (z11 && i12 < length2) {
                        String str9 = str5;
                        int i13 = index + i12;
                        if (i13 >= length) {
                            str4 = str6;
                            z11 = false;
                        } else {
                            str4 = str6;
                            char charAt = charSequence.charAt(i13);
                            char charAt2 = str.charAt(i12);
                            boolean x10 = booleanValue ? x(charAt, charAt2) : charAt == charAt2;
                            if (x10) {
                                i11++;
                            }
                            z11 = x10;
                        }
                        i12++;
                        str5 = str9;
                        str6 = str4;
                    }
                    str2 = str5;
                    str3 = str6;
                    if (z10 || length2 == 1) {
                        length2 = i11 - index;
                        if (i10 >= length2) {
                            if (str7 != null && i10 == length2) {
                                if (!this.f58279a) {
                                    str7 = str7 + "|" + str8;
                                }
                                str7 = null;
                            }
                        }
                        str7 = str8;
                        i10 = length2;
                    } else if (z11) {
                        if (str7 != null) {
                            if (this.f58279a) {
                                i10 = length2;
                                str7 = null;
                            } else {
                                str7 = str7 + "|" + str8;
                                i10 = length2;
                            }
                        }
                        str7 = str8;
                        i10 = length2;
                    }
                } else {
                    map = q10;
                    str2 = str5;
                    str3 = str6;
                }
                mVar2 = mVar;
                it = it2;
                booleanValue2 = z10;
                q10 = map;
                str5 = str2;
                str6 = str3;
            }
            if (str7 == null) {
                parsePosition.setErrorIndex(index);
                return str7;
            }
            parsePosition.setIndex(index + i10);
            return str7;
        }

        @Override // oi.z
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public oi.q q(oi.q qVar, String str, boolean z10) {
            throw new IllegalArgumentException("Day period element cannot be set.");
        }

        @Override // oi.p
        public boolean Y() {
            return false;
        }

        @Override // net.time4j.format.t
        public void Z(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d) {
            net.time4j.format.v vVar = (net.time4j.format.v) interfaceC5908d.b(net.time4j.format.a.f57808g, net.time4j.format.v.WIDE);
            net.time4j.format.m mVar = (net.time4j.format.m) interfaceC5908d.b(net.time4j.format.a.f57809h, net.time4j.format.m.FORMAT);
            appendable.append(this.f58279a ? (String) this.f58280b.l(vVar, mVar).apply(oVar) : (String) this.f58280b.j(vVar, mVar).apply(oVar));
        }

        @Override // oi.AbstractC5909e, oi.p
        public char a() {
            return this.f58279a ? 'b' : 'B';
        }

        @Override // oi.p
        public boolean e0() {
            return true;
        }

        @Override // oi.p
        public Class getType() {
            return String.class;
        }

        @Override // oi.AbstractC5909e
        public oi.z r(oi.x xVar) {
            if (xVar.x(G.f57585o)) {
                return this;
            }
            return null;
        }

        @Override // oi.AbstractC5909e
        public boolean s(AbstractC5909e abstractC5909e) {
            return this.f58280b.equals(((b) abstractC5909e).f58280b);
        }

        @Override // oi.AbstractC5909e
        public String toString() {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(name());
            sb2.append('@');
            sb2.append(this.f58280b);
            return sb2.toString();
        }

        public final boolean x(char c10, char c11) {
            if (c10 >= 'a' && c10 <= 'z') {
                c10 = (char) (c10 - ' ');
            }
            if (c11 >= 'a' && c11 <= 'z') {
                c11 = (char) (c11 - ' ');
            }
            if (c10 >= 'A' && c10 <= 'Z') {
                return c10 == c11;
            }
            Locale E10 = E();
            return String.valueOf(c10).toUpperCase(E10).equals(String.valueOf(c11).toUpperCase(E10));
        }

        public String y() {
            return this.f58280b.f58277b;
        }

        @Override // oi.z
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public oi.p b(oi.q qVar) {
            return null;
        }

        public b(boolean z10, C5718k c5718k) {
            super(z10 ? "FIXED_DAY_PERIOD" : "APPROXIMATE_DAY_PERIOD");
            this.f58279a = z10;
            this.f58280b = c5718k;
        }

        @Override // oi.z
        public boolean isValid(oi.q qVar, String str) {
            return false;
        }
    }

    /* renamed from: net.time4j.k$c */
    public static class c implements oi.s {
        public static C5718k e(Locale locale, InterfaceC5908d interfaceC5908d) {
            return interfaceC5908d.c(C5718k.f58275f) ? (C5718k) interfaceC5908d.a(C5718k.f58275f) : C5718k.r(locale, (String) interfaceC5908d.b(net.time4j.format.a.f57803b, "iso8601"));
        }

        public static int f(oi.q qVar) {
            InterfaceC5703c interfaceC5703c = G.f57587q;
            if (qVar.f(interfaceC5703c)) {
                int intValue = ((Integer) qVar.j(interfaceC5703c)).intValue();
                if (intValue == 12) {
                    return 0;
                }
                return intValue;
            }
            K k10 = G.f57589s;
            if (qVar.f(k10)) {
                return ((Integer) qVar.j(k10)).intValue();
            }
            return -1;
        }

        @Override // oi.s
        public boolean a(oi.p pVar) {
            return pVar instanceof b;
        }

        @Override // oi.s
        public boolean b(Class cls) {
            return G.class.isAssignableFrom(cls);
        }

        @Override // oi.s
        public Set c(Locale locale, InterfaceC5908d interfaceC5908d) {
            C5718k e10 = e(locale, interfaceC5908d);
            HashSet hashSet = new HashSet();
            hashSet.add(new b(false, e10));
            if (!interfaceC5908d.c(C5718k.f58275f)) {
                hashSet.add(new b(true, e10));
            }
            return Collections.unmodifiableSet(hashSet);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x012c A[LOOP:0: B:12:0x003f->B:23:0x012c, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x011b A[EDGE_INSN: B:24:0x011b->B:25:0x011b BREAK  A[LOOP:0: B:12:0x003f->B:23:0x012c], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0116 A[SYNTHETIC] */
        @Override // oi.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public oi.q d(oi.q qVar, Locale locale, InterfaceC5908d interfaceC5908d) {
            EnumC5732z enumC5732z;
            EnumC5732z enumC5732z2;
            if (qVar.f(G.f57585o) || qVar.f(G.f57591u) || qVar.f(G.f57590t) || qVar.f(G.f57588r)) {
                return qVar;
            }
            C5718k e10 = e(locale, interfaceC5908d);
            int i10 = 0;
            b bVar = new b(false, e10);
            int i11 = 1;
            if (!qVar.f(bVar)) {
                b bVar2 = new b(true, e10);
                if (!qVar.f(bVar2)) {
                    return qVar;
                }
                String str = (String) qVar.j(bVar2);
                return ((str.equals("am") || str.equals("midnight")) ? qVar.y(G.f57586p, EnumC5732z.AM) : qVar.y(G.f57586p, EnumC5732z.PM)).y(bVar2, null);
            }
            String str2 = (String) qVar.j(bVar);
            int i12 = 0;
            EnumC5732z enumC5732z3 = null;
            while (true) {
                int indexOf = str2.indexOf(EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, i10);
                String substring = indexOf == -1 ? str2.substring(i10) : str2.substring(i10, indexOf);
                int i13 = indexOf + 1;
                i12 += i11;
                if (e10.p() && enumC5732z3 == null) {
                    if (substring.equals("midnight")) {
                        enumC5732z2 = EnumC5732z.AM;
                    } else if (substring.equals("noon")) {
                        enumC5732z2 = EnumC5732z.PM;
                    }
                    enumC5732z3 = enumC5732z2;
                    if (i13 > 0) {
                        break;
                    }
                    i10 = i13;
                    i11 = 1;
                }
                for (G g10 : e10.f58278c.keySet()) {
                    if (((String) e10.f58278c.get(g10)).equals(substring)) {
                        int f10 = f(qVar);
                        G m10 = e10.m(g10);
                        if (g10.q() >= 12) {
                            if (m10.r0(g10) || m10.w0(G.z0())) {
                                enumC5732z = EnumC5732z.PM;
                            } else {
                                if (f10 != -1) {
                                    enumC5732z = f10 + 12 >= g10.q() ? EnumC5732z.PM : EnumC5732z.AM;
                                }
                                enumC5732z = null;
                            }
                            if (enumC5732z != null) {
                                if (enumC5732z3 != null && enumC5732z3 != enumC5732z) {
                                    if (f10 != -1) {
                                        if (substring.startsWith("night")) {
                                            enumC5732z = f10 < 6 ? EnumC5732z.AM : EnumC5732z.PM;
                                        } else if (substring.startsWith("afternoon")) {
                                            enumC5732z = f10 < 6 ? EnumC5732z.PM : EnumC5732z.AM;
                                        }
                                    }
                                    enumC5732z3 = null;
                                }
                                enumC5732z3 = enumC5732z;
                            }
                        } else {
                            if (m10.r0(G.A0(12))) {
                                if (f10 != -1) {
                                    enumC5732z = f10 >= g10.q() ? EnumC5732z.AM : EnumC5732z.PM;
                                }
                                enumC5732z = null;
                            } else {
                                enumC5732z = EnumC5732z.AM;
                            }
                            if (enumC5732z != null) {
                            }
                        }
                    }
                }
                if (i13 > 0) {
                }
            }
            if (enumC5732z3 == null) {
                return qVar;
            }
            oi.q y10 = qVar.y(G.f57586p, enumC5732z3);
            return i12 > 1 ? y10.y(bVar, null) : y10;
        }
    }

    /* renamed from: net.time4j.k$d */
    public class d implements oi.t {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f58281a;

        /* renamed from: b, reason: collision with root package name */
        public final net.time4j.format.v f58282b;

        /* renamed from: c, reason: collision with root package name */
        public final net.time4j.format.m f58283c;

        public d(boolean z10, net.time4j.format.v vVar, net.time4j.format.m mVar) {
            if (vVar == null) {
                throw new NullPointerException("Missing text width.");
            }
            if (mVar == null) {
                throw new NullPointerException("Missing output context.");
            }
            this.f58281a = z10;
            this.f58282b = vVar;
            this.f58283c = mVar;
        }

        @Override // oi.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(oi.o oVar) {
            G g10 = (G) oVar.j(G.f57585o);
            C5718k c5718k = C5718k.this;
            Locale locale = c5718k.f58276a;
            if (this.f58281a) {
                String n10 = C5718k.n(g10);
                if (!c5718k.p()) {
                    return n10;
                }
                Map q10 = C5718k.q(locale, c5718k.f58277b);
                String k10 = C5718k.k(q10, this.f58282b, this.f58283c, n10);
                if (!q10.containsKey(k10)) {
                    if (n10.equals("midnight")) {
                        k10 = C5718k.k(q10, this.f58282b, this.f58283c, "am");
                    } else if (n10.equals("noon")) {
                        k10 = C5718k.k(q10, this.f58282b, this.f58283c, "pm");
                    }
                }
                if (q10.containsKey(k10)) {
                    return (String) q10.get(k10);
                }
            } else {
                if (!c5718k.p()) {
                    return (String) c5718k.f58278c.get(c5718k.o(g10));
                }
                Map q11 = C5718k.q(locale, c5718k.f58277b);
                if (g10.v0()) {
                    String k11 = C5718k.k(q11, this.f58282b, this.f58283c, "midnight");
                    if (q11.containsKey(k11)) {
                        return (String) q11.get(k11);
                    }
                } else if (g10.w0(G.A0(12))) {
                    String k12 = C5718k.k(q11, this.f58282b, this.f58283c, "noon");
                    if (q11.containsKey(k12)) {
                        return (String) q11.get(k12);
                    }
                }
                String k13 = C5718k.k(q11, this.f58282b, this.f58283c, (String) c5718k.f58278c.get(c5718k.o(g10)));
                if (q11.containsKey(k13)) {
                    return (String) q11.get(k13);
                }
            }
            EnumC5732z enumC5732z = (EnumC5732z) g10.j(G.f57586p);
            if (locale == null) {
                locale = Locale.ROOT;
            }
            return enumC5732z.a(locale);
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        treeMap.put(G.z0(), "am");
        treeMap.put(G.A0(12), "pm");
        SortedMap unmodifiableSortedMap = Collections.unmodifiableSortedMap(treeMap);
        f58273d = unmodifiableSortedMap;
        f58274e = new C5718k(Locale.ROOT, "iso8601", unmodifiableSortedMap);
        f58275f = net.time4j.format.a.e("CUSTOM_DAY_PERIOD", C5718k.class);
    }

    public C5718k(Locale locale, String str, SortedMap sortedMap) {
        this.f58276a = locale;
        this.f58277b = str;
        this.f58278c = Collections.unmodifiableSortedMap(sortedMap);
    }

    public static boolean a(String str) {
        return str.charAt(0) == 'T' && str.length() == 5 && Character.isDigit(str.charAt(1));
    }

    public static String k(Map map, net.time4j.format.v vVar, net.time4j.format.m mVar, String str) {
        if (vVar == net.time4j.format.v.SHORT) {
            vVar = net.time4j.format.v.ABBREVIATED;
        }
        String str2 = t(vVar, mVar) + str;
        if (!map.containsKey(str2)) {
            if (mVar == net.time4j.format.m.STANDALONE) {
                net.time4j.format.v vVar2 = net.time4j.format.v.ABBREVIATED;
                return vVar == vVar2 ? k(map, vVar, net.time4j.format.m.FORMAT, str) : k(map, vVar2, mVar, str);
            }
            net.time4j.format.v vVar3 = net.time4j.format.v.ABBREVIATED;
            if (vVar != vVar3) {
                return k(map, vVar3, mVar, str);
            }
        }
        return str2;
    }

    public static String n(G g10) {
        int intValue = ((Integer) g10.j(G.f57593w)).intValue();
        return (intValue == 0 || intValue == 1440) ? "midnight" : intValue < 720 ? "am" : intValue == 720 ? "noon" : "pm";
    }

    public static Map q(Locale locale, String str) {
        Map m10 = net.time4j.format.b.c(str, locale).m();
        return (str.equals("iso8601") || "true".equals(m10.get("hasDayPeriods"))) ? m10 : net.time4j.format.b.d(locale).m();
    }

    public static C5718k r(Locale locale, String str) {
        String language = locale.getLanguage();
        if (language.equals("nn")) {
            locale = new Locale("nb");
        }
        Map q10 = q(locale, str);
        TreeMap treeMap = new TreeMap();
        for (String str2 : q10.keySet()) {
            if (a(str2)) {
                int parseInt = Integer.parseInt(str2.substring(1, 3));
                int parseInt2 = Integer.parseInt(str2.substring(3, 5));
                G z02 = G.z0();
                if (parseInt != 24) {
                    if (parseInt < 0 || parseInt >= 24 || parseInt2 < 0 || parseInt2 >= 60) {
                        throw new IllegalStateException("Invalid time key: " + str2);
                    }
                    z02 = (G) z02.E((parseInt * 60) + parseInt2, EnumC5714g.f58144b);
                } else if (parseInt2 != 0) {
                    throw new IllegalStateException("Invalid time key: " + str2);
                }
                treeMap.put(z02, q10.get(str2));
            }
        }
        if (treeMap.isEmpty() || language.isEmpty()) {
            return f58274e;
        }
        Iterator it = treeMap.keySet().iterator();
        String str3 = "";
        while (it.hasNext()) {
            String str4 = (String) treeMap.get((G) it.next());
            if (str4.equals(str3)) {
                it.remove();
            } else {
                str3 = str4;
            }
        }
        return new C5718k(locale, str, treeMap);
    }

    public static C5718k s(Map map) {
        if (map.isEmpty()) {
            throw new IllegalArgumentException("Label map is empty.");
        }
        TreeMap treeMap = new TreeMap(map);
        for (G g10 : map.keySet()) {
            if (g10.q() == 24) {
                treeMap.put(G.z0(), map.get(g10));
                treeMap.remove(g10);
            } else if (((String) map.get(g10)).isEmpty()) {
                throw new IllegalArgumentException("Map has empty label: " + map);
            }
        }
        return new C5718k(null, "", treeMap);
    }

    public static String t(net.time4j.format.v vVar, net.time4j.format.m mVar) {
        int i10 = a.$SwitchMap$net$time4j$format$TextWidth[vVar.ordinal()];
        char c10 = i10 != 1 ? i10 != 2 ? 'a' : 'n' : 'w';
        if (mVar == net.time4j.format.m.STANDALONE) {
            c10 = Character.toUpperCase(c10);
        }
        return "P(" + c10 + ")_";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5718k) {
            C5718k c5718k = (C5718k) obj;
            Locale locale = this.f58276a;
            if (locale == null) {
                if (c5718k.f58276a != null) {
                    return false;
                }
            } else if (!locale.equals(c5718k.f58276a)) {
                return false;
            }
            if (this.f58278c.equals(c5718k.f58278c) && this.f58277b.equals(c5718k.f58277b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f58278c.hashCode();
    }

    public oi.t j(net.time4j.format.v vVar, net.time4j.format.m mVar) {
        return new d(false, vVar, mVar);
    }

    public oi.t l(net.time4j.format.v vVar, net.time4j.format.m mVar) {
        return new d(true, vVar, mVar);
    }

    public G m(G g10) {
        if (g10.q() == 24) {
            g10 = G.z0();
        }
        for (G g11 : this.f58278c.keySet()) {
            if (g10.s0(g11)) {
                return g11;
            }
        }
        return (G) this.f58278c.firstKey();
    }

    public G o(G g10) {
        if (g10.q() == 24) {
            g10 = G.z0();
        }
        G g11 = (G) this.f58278c.lastKey();
        for (G g12 : this.f58278c.keySet()) {
            if (g10.w0(g12)) {
                return g12;
            }
            if (g10.s0(g12)) {
                break;
            }
            g11 = g12;
        }
        return g11;
    }

    public final boolean p() {
        return this.f58276a != null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("DayPeriod[");
        if (p()) {
            sb2.append("locale=");
            sb2.append(this.f58276a);
            sb2.append(',');
            if (!this.f58277b.equals("iso8601")) {
                sb2.append(",calendar-type=");
                sb2.append(this.f58277b);
                sb2.append(',');
            }
        }
        sb2.append(this.f58278c);
        sb2.append(']');
        return sb2.toString();
    }
}
