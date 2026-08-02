package fg;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: fg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C6561a {

    /* renamed from: a, reason: collision with root package name */
    private final String f63413a;

    /* renamed from: b, reason: collision with root package name */
    private final C6561a[] f63414b;

    /* renamed from: fg.a$a, reason: collision with other inner class name */
    public static class C1021a extends C6561a implements e {

        /* renamed from: c, reason: collision with root package name */
        protected Serializable f63415c;

        public C1021a(@NonNull Serializable serializable) {
            Serializable serializable2;
            if (serializable instanceof String) {
                String str = (String) serializable;
                int length = str.length();
                serializable2 = str;
                if (length > 1) {
                    char charAt = str.charAt(0);
                    serializable2 = str;
                    if (charAt == '\"') {
                        char charAt2 = str.charAt(str.length() - 1);
                        serializable2 = str;
                        if (charAt2 == '\"') {
                            serializable2 = str.substring(1, str.length() - 1);
                        }
                    }
                }
            } else {
                boolean z11 = serializable instanceof Number;
                serializable2 = serializable;
                if (z11) {
                    serializable2 = Float.valueOf(((Number) serializable).floatValue());
                }
            }
            this.f63415c = serializable2;
        }

        @Override // fg.C6561a.e
        public final Object a() {
            Object obj = this.f63415c;
            if (obj instanceof org.maplibre.android.style.layers.c) {
                throw new IllegalArgumentException("PropertyValue are not allowed as an expression literal, use value instead.");
            }
            return obj instanceof C1021a ? ((C1021a) obj).a() : obj;
        }

        @Override // fg.C6561a
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            Serializable serializable = ((C1021a) obj).f63415c;
            Serializable serializable2 = this.f63415c;
            return serializable2 != null ? serializable2.equals(serializable) : serializable == null;
        }

        @Override // fg.C6561a
        @NonNull
        public final Object[] f() {
            return new Object[]{"literal", this.f63415c};
        }

        @Override // fg.C6561a
        public final int hashCode() {
            int hashCode = super.hashCode() * 31;
            Serializable serializable = this.f63415c;
            return hashCode + (serializable != null ? serializable.hashCode() : 0);
        }

        @Override // fg.C6561a
        public String toString() {
            Serializable serializable = this.f63415c;
            if (!(serializable instanceof String)) {
                return serializable.toString();
            }
            return "\"" + serializable + "\"";
        }
    }

    /* renamed from: fg.a$b */
    private static class b extends C1021a {
        @Override // fg.C6561a.C1021a, fg.C6561a
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            return Arrays.equals((Object[]) this.f63415c, (Object[]) ((b) obj).f63415c);
        }

        @Override // fg.C6561a.C1021a, fg.C6561a
        @NonNull
        public final String toString() {
            Object[] objArr = (Object[]) this.f63415c;
            StringBuilder sb2 = new StringBuilder("[");
            for (int i11 = 0; i11 < objArr.length; i11++) {
                Object obj = objArr[i11];
                if (obj instanceof String) {
                    sb2.append("\"");
                    sb2.append(obj);
                    sb2.append("\"");
                } else {
                    sb2.append(obj);
                }
                if (i11 != objArr.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* renamed from: fg.a$c */
    public static class c extends C6561a {
    }

    /* renamed from: fg.a$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private Integer f63416a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f63417b;

        d(Integer num, Integer num2) {
            this.f63416a = num;
            this.f63417b = num2;
        }

        @NonNull
        static C6561a[] a(d... dVarArr) {
            C6561a[] c6561aArr = new C6561a[dVarArr.length * 2];
            for (int i11 = 0; i11 < dVarArr.length; i11++) {
                d dVar = dVarArr[i11];
                C6561a d11 = C6561a.d(dVar.f63416a);
                C6561a d12 = C6561a.d(dVar.f63417b);
                int i12 = i11 * 2;
                c6561aArr[i12] = d11;
                c6561aArr[i12 + 1] = d12;
            }
            return c6561aArr;
        }
    }

    /* renamed from: fg.a$e */
    private interface e {
        Object a();
    }

    C6561a() {
        this.f63413a = null;
        this.f63414b = null;
    }

    public static C6561a b(@NonNull String str) {
        return new C6561a("get", new C1021a(str));
    }

    public static C6561a c(@NonNull c cVar, @NonNull C6561a c6561a, d... dVarArr) {
        C6561a[] a11 = d.a(dVarArr);
        C6561a[] c6561aArr = {cVar, c6561a};
        C6561a[] c6561aArr2 = new C6561a[a11.length + 2];
        System.arraycopy(c6561aArr, 0, c6561aArr2, 0, 2);
        System.arraycopy(a11, 0, c6561aArr2, 2, a11.length);
        return new C6561a("interpolate", c6561aArr2);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.Object[]] */
    public static C6561a d(@NonNull Integer num) {
        if (!num.getClass().isArray()) {
            return new C1021a(num);
        }
        int length = Array.getLength(num);
        ?? r32 = new Object[length];
        for (int i11 = 0; i11 < length; i11++) {
            r32[i11] = Array.get(num, i11);
        }
        return new C6561a("literal", new b(r32));
    }

    public static d e(@NonNull Integer num, @NonNull Integer num2) {
        return new d(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6561a)) {
            return false;
        }
        C6561a c6561a = (C6561a) obj;
        String str = c6561a.f63413a;
        String str2 = this.f63413a;
        if (str2 == null ? str == null : str2.equals(str)) {
            return Arrays.deepEquals(this.f63414b, c6561a.f63414b);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public Object[] f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f63413a);
        C6561a[] c6561aArr = this.f63414b;
        if (c6561aArr != 0) {
            for (c cVar : c6561aArr) {
                if (cVar instanceof e) {
                    arrayList.add(((e) cVar).a());
                } else {
                    arrayList.add(cVar.f());
                }
            }
        }
        return arrayList.toArray();
    }

    public int hashCode() {
        String str = this.f63413a;
        return Arrays.hashCode(this.f63414b) + ((str != null ? str.hashCode() : 0) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[\"");
        sb2.append(this.f63413a);
        sb2.append("\"");
        C6561a[] c6561aArr = this.f63414b;
        if (c6561aArr != null) {
            for (C6561a c6561a : c6561aArr) {
                sb2.append(", ");
                sb2.append(c6561a.toString());
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public C6561a(@NonNull String str, C6561a... c6561aArr) {
        this.f63413a = str;
        this.f63414b = c6561aArr;
    }
}
