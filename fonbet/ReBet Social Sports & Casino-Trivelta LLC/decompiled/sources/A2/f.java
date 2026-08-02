package A2;

import androidx.room.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final b f14e = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f15a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f16b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f17c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f18d;

    public static final class a {

        /* renamed from: h, reason: collision with root package name */
        public static final C0002a f19h = new C0002a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f20a;

        /* renamed from: b, reason: collision with root package name */
        public final String f21b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f22c;

        /* renamed from: d, reason: collision with root package name */
        public final int f23d;

        /* renamed from: e, reason: collision with root package name */
        public final String f24e;

        /* renamed from: f, reason: collision with root package name */
        public final int f25f;

        /* renamed from: g, reason: collision with root package name */
        public final int f26g;

        /* renamed from: A2.f$a$a, reason: collision with other inner class name */
        public static final class C0002a {
            public /* synthetic */ C0002a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < str.length()) {
                    char charAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i11++;
                    } else if (charAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                        return false;
                    }
                    i10++;
                    i12 = i13;
                }
                return i11 == 0;
            }

            public final boolean b(String current, String str) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (Intrinsics.areEqual(current, str)) {
                    return true;
                }
                if (!a(current)) {
                    return false;
                }
                String substring = current.substring(1, current.length() - 1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return Intrinsics.areEqual(StringsKt.trim((CharSequence) substring).toString(), str);
            }

            public C0002a() {
            }
        }

        public a(String name, String type, boolean z10, int i10, String str, int i11) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f20a = name;
            this.f21b = type;
            this.f22c = z10;
            this.f23d = i10;
            this.f24e = str;
            this.f25f = i11;
            this.f26g = a(type);
        }

        public final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "INT", false, 2, (Object) null)) {
                return 3;
            }
            if (StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CHAR", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CLOB", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "TEXT", false, 2, (Object) null)) {
                return 2;
            }
            if (StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "BLOB", false, 2, (Object) null)) {
                return 5;
            }
            return (StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "REAL", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "FLOA", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "DOUB", false, 2, (Object) null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f23d != ((a) obj).f23d) {
                return false;
            }
            a aVar = (a) obj;
            if (!Intrinsics.areEqual(this.f20a, aVar.f20a) || this.f22c != aVar.f22c) {
                return false;
            }
            if (this.f25f == 1 && aVar.f25f == 2 && (str3 = this.f24e) != null && !f19h.b(str3, aVar.f24e)) {
                return false;
            }
            if (this.f25f == 2 && aVar.f25f == 1 && (str2 = aVar.f24e) != null && !f19h.b(str2, this.f24e)) {
                return false;
            }
            int i10 = this.f25f;
            return (i10 == 0 || i10 != aVar.f25f || ((str = this.f24e) == null ? aVar.f24e == null : f19h.b(str, aVar.f24e))) && this.f26g == aVar.f26g;
        }

        public int hashCode() {
            return (((((this.f20a.hashCode() * 31) + this.f26g) * 31) + (this.f22c ? 1231 : 1237)) * 31) + this.f23d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Column{name='");
            sb2.append(this.f20a);
            sb2.append("', type='");
            sb2.append(this.f21b);
            sb2.append("', affinity='");
            sb2.append(this.f26g);
            sb2.append("', notNull=");
            sb2.append(this.f22c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f23d);
            sb2.append(", defaultValue='");
            String str = this.f24e;
            if (str == null) {
                str = "undefined";
            }
            sb2.append(str);
            sb2.append("'}");
            return sb2.toString();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(E2.g database, String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return g.f(database, tableName);
        }

        public b() {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f27a;

        /* renamed from: b, reason: collision with root package name */
        public final String f28b;

        /* renamed from: c, reason: collision with root package name */
        public final String f29c;

        /* renamed from: d, reason: collision with root package name */
        public final List f30d;

        /* renamed from: e, reason: collision with root package name */
        public final List f31e;

        public c(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
            Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
            Intrinsics.checkNotNullParameter(onDelete, "onDelete");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(columnNames, "columnNames");
            Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
            this.f27a = referenceTable;
            this.f28b = onDelete;
            this.f29c = onUpdate;
            this.f30d = columnNames;
            this.f31e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Intrinsics.areEqual(this.f27a, cVar.f27a) && Intrinsics.areEqual(this.f28b, cVar.f28b) && Intrinsics.areEqual(this.f29c, cVar.f29c) && Intrinsics.areEqual(this.f30d, cVar.f30d)) {
                return Intrinsics.areEqual(this.f31e, cVar.f31e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f27a.hashCode() * 31) + this.f28b.hashCode()) * 31) + this.f29c.hashCode()) * 31) + this.f30d.hashCode()) * 31) + this.f31e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f27a + "', onDelete='" + this.f28b + " +', onUpdate='" + this.f29c + "', columnNames=" + this.f30d + ", referenceColumnNames=" + this.f31e + '}';
        }
    }

    public static final class d implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final int f32a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33b;

        /* renamed from: c, reason: collision with root package name */
        public final String f34c;

        /* renamed from: d, reason: collision with root package name */
        public final String f35d;

        public d(int i10, int i11, String from, String to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            this.f32a = i10;
            this.f33b = i11;
            this.f34c = from;
            this.f35d = to;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i10 = this.f32a - other.f32a;
            return i10 == 0 ? this.f33b - other.f33b : i10;
        }

        public final String b() {
            return this.f34c;
        }

        public final int c() {
            return this.f32a;
        }

        public final String d() {
            return this.f35d;
        }
    }

    public static final class e {

        /* renamed from: e, reason: collision with root package name */
        public static final a f36e = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f37a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f38b;

        /* renamed from: c, reason: collision with root package name */
        public final List f39c;

        /* renamed from: d, reason: collision with root package name */
        public List f40d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public e(String name, boolean z10, List columns, List orders) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(orders, "orders");
            this.f37a = name;
            this.f38b = z10;
            this.f39c = columns;
            this.f40d = orders;
            List list = orders;
            if (list.isEmpty()) {
                int size = columns.size();
                list = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    list.add(n.ASC.name());
                }
            }
            this.f40d = (List) list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f38b == eVar.f38b && Intrinsics.areEqual(this.f39c, eVar.f39c) && Intrinsics.areEqual(this.f40d, eVar.f40d)) {
                return StringsKt.startsWith$default(this.f37a, "index_", false, 2, (Object) null) ? StringsKt.startsWith$default(eVar.f37a, "index_", false, 2, (Object) null) : Intrinsics.areEqual(this.f37a, eVar.f37a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((StringsKt.startsWith$default(this.f37a, "index_", false, 2, (Object) null) ? -1184239155 : this.f37a.hashCode()) * 31) + (this.f38b ? 1 : 0)) * 31) + this.f39c.hashCode()) * 31) + this.f40d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f37a + "', unique=" + this.f38b + ", columns=" + this.f39c + ", orders=" + this.f40d + "'}";
        }
    }

    public f(String name, Map columns, Set foreignKeys, Set set) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f15a = name;
        this.f16b = columns;
        this.f17c = foreignKeys;
        this.f18d = set;
    }

    public static final f a(E2.g gVar, String str) {
        return f14e.a(gVar, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!Intrinsics.areEqual(this.f15a, fVar.f15a) || !Intrinsics.areEqual(this.f16b, fVar.f16b) || !Intrinsics.areEqual(this.f17c, fVar.f17c)) {
            return false;
        }
        Set set2 = this.f18d;
        if (set2 == null || (set = fVar.f18d) == null) {
            return true;
        }
        return Intrinsics.areEqual(set2, set);
    }

    public int hashCode() {
        return (((this.f15a.hashCode() * 31) + this.f16b.hashCode()) * 31) + this.f17c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f15a + "', columns=" + this.f16b + ", foreignKeys=" + this.f17c + ", indices=" + this.f18d + '}';
    }
}
