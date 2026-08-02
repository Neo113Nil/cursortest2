package ab;

import com.google.crypto.tink.k;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C1928a f15111a;

    /* renamed from: b, reason: collision with root package name */
    public final List f15112b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f15113c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f15114a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public C1928a f15115b = C1928a.f15108b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f15116c = null;

        public b a(k kVar, int i10, String str, String str2) {
            ArrayList arrayList = this.f15114a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new C0320c(kVar, i10, str, str2));
            return this;
        }

        public c b() {
            if (this.f15114a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f15116c;
            if (num != null && !c(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            c cVar = new c(this.f15115b, Collections.unmodifiableList(this.f15114a), this.f15116c);
            this.f15114a = null;
            return cVar;
        }

        public final boolean c(int i10) {
            Iterator it = this.f15114a.iterator();
            while (it.hasNext()) {
                if (((C0320c) it.next()).a() == i10) {
                    return true;
                }
            }
            return false;
        }

        public b d(C1928a c1928a) {
            if (this.f15114a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.f15115b = c1928a;
            return this;
        }

        public b e(int i10) {
            if (this.f15114a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f15116c = Integer.valueOf(i10);
            return this;
        }
    }

    /* renamed from: ab.c$c, reason: collision with other inner class name */
    public static final class C0320c {

        /* renamed from: a, reason: collision with root package name */
        public final k f15117a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15118b;

        /* renamed from: c, reason: collision with root package name */
        public final String f15119c;

        /* renamed from: d, reason: collision with root package name */
        public final String f15120d;

        public int a() {
            return this.f15118b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0320c)) {
                return false;
            }
            C0320c c0320c = (C0320c) obj;
            return this.f15117a == c0320c.f15117a && this.f15118b == c0320c.f15118b && this.f15119c.equals(c0320c.f15119c) && this.f15120d.equals(c0320c.f15120d);
        }

        public int hashCode() {
            return Objects.hash(this.f15117a, Integer.valueOf(this.f15118b), this.f15119c, this.f15120d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f15117a, Integer.valueOf(this.f15118b), this.f15119c, this.f15120d);
        }

        public C0320c(k kVar, int i10, String str, String str2) {
            this.f15117a = kVar;
            this.f15118b = i10;
            this.f15119c = str;
            this.f15120d = str2;
        }
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f15111a.equals(cVar.f15111a) && this.f15112b.equals(cVar.f15112b) && Objects.equals(this.f15113c, cVar.f15113c);
    }

    public int hashCode() {
        return Objects.hash(this.f15111a, this.f15112b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f15111a, this.f15112b, this.f15113c);
    }

    public c(C1928a c1928a, List list, Integer num) {
        this.f15111a = c1928a;
        this.f15112b = list;
        this.f15113c = num;
    }
}
