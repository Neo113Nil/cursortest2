package B4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.core.Constants;

/* loaded from: classes2.dex */
public final class k implements i {

    /* renamed from: c, reason: collision with root package name */
    public final Map f732c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Map f733d;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final String f734d;

        /* renamed from: e, reason: collision with root package name */
        public static final Map f735e;

        /* renamed from: a, reason: collision with root package name */
        public boolean f736a = true;

        /* renamed from: b, reason: collision with root package name */
        public Map f737b = f735e;

        /* renamed from: c, reason: collision with root package name */
        public boolean f738c = true;

        static {
            String g10 = g();
            f734d = g10;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g10)) {
                hashMap.put(Constants.USER_AGENT_HEADER_KEY, Collections.singletonList(new b(g10)));
            }
            f735e = Collections.unmodifiableMap(hashMap);
        }

        public static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = property.charAt(i10);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb2.append(charAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public a a(String str, j jVar) {
            if (this.f738c && Constants.USER_AGENT_HEADER_KEY.equalsIgnoreCase(str)) {
                return h(str, jVar);
            }
            e();
            f(str).add(jVar);
            return this;
        }

        public a b(String str, String str2) {
            return a(str, new b(str2));
        }

        public k c() {
            this.f736a = true;
            return new k(this.f737b);
        }

        public final Map d() {
            HashMap hashMap = new HashMap(this.f737b.size());
            for (Map.Entry entry : this.f737b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            return hashMap;
        }

        public final void e() {
            if (this.f736a) {
                this.f736a = false;
                this.f737b = d();
            }
        }

        public final List f(String str) {
            List list = (List) this.f737b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f737b.put(str, arrayList);
            return arrayList;
        }

        public a h(String str, j jVar) {
            e();
            if (jVar == null) {
                this.f737b.remove(str);
            } else {
                List f10 = f(str);
                f10.clear();
                f10.add(jVar);
            }
            if (this.f738c && Constants.USER_AGENT_HEADER_KEY.equalsIgnoreCase(str)) {
                this.f738c = false;
            }
            return this;
        }
    }

    public static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        public final String f739a;

        public b(String str) {
            this.f739a = str;
        }

        @Override // B4.j
        public String a() {
            return this.f739a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f739a.equals(((b) obj).f739a);
            }
            return false;
        }

        public int hashCode() {
            return this.f739a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f739a + "'}";
        }
    }

    public k(Map map) {
        this.f732c = Collections.unmodifiableMap(map);
    }

    @Override // B4.i
    public Map a() {
        if (this.f733d == null) {
            synchronized (this) {
                try {
                    if (this.f733d == null) {
                        this.f733d = Collections.unmodifiableMap(c());
                    }
                } finally {
                }
            }
        }
        return this.f733d;
    }

    public final String b(List list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String a10 = ((j) list.get(i10)).a();
            if (!TextUtils.isEmpty(a10)) {
                sb2.append(a10);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f732c.entrySet()) {
            String b10 = b((List) entry.getValue());
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put(entry.getKey(), b10);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f732c.equals(((k) obj).f732c);
        }
        return false;
    }

    public int hashCode() {
        return this.f732c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f732c + '}';
    }
}
