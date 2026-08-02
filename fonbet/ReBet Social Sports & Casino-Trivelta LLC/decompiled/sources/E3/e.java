package E3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f2990c = new e("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    public final List f2991a;

    /* renamed from: b, reason: collision with root package name */
    public f f2992b;

    public e(String... strArr) {
        this.f2991a = Arrays.asList(strArr);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f2991a.add(str);
        return eVar;
    }

    public final boolean b() {
        return ((String) this.f2991a.get(r0.size() - 1)).equals("**");
    }

    public boolean c(String str, int i10) {
        if (i10 >= this.f2991a.size()) {
            return false;
        }
        boolean z10 = i10 == this.f2991a.size() - 1;
        String str2 = (String) this.f2991a.get(i10);
        if (!str2.equals("**")) {
            return (z10 || (i10 == this.f2991a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z10 && ((String) this.f2991a.get(i10 + 1)).equals(str)) {
            return i10 == this.f2991a.size() + (-2) || (i10 == this.f2991a.size() + (-3) && b());
        }
        if (z10) {
            return true;
        }
        int i11 = i10 + 1;
        if (i11 < this.f2991a.size() - 1) {
            return false;
        }
        return ((String) this.f2991a.get(i11)).equals(str);
    }

    public f d() {
        return this.f2992b;
    }

    public int e(String str, int i10) {
        if (f(str)) {
            return 0;
        }
        if (((String) this.f2991a.get(i10)).equals("**")) {
            return (i10 != this.f2991a.size() - 1 && ((String) this.f2991a.get(i10 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f2991a.equals(eVar.f2991a)) {
                return false;
            }
            f fVar = this.f2992b;
            f fVar2 = eVar.f2992b;
            if (fVar != null) {
                return fVar.equals(fVar2);
            }
            if (fVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(String str) {
        return "__container".equals(str);
    }

    public boolean g(String str, int i10) {
        if (f(str)) {
            return true;
        }
        if (i10 >= this.f2991a.size()) {
            return false;
        }
        return ((String) this.f2991a.get(i10)).equals(str) || ((String) this.f2991a.get(i10)).equals("**") || ((String) this.f2991a.get(i10)).equals("*");
    }

    public boolean h(String str, int i10) {
        return "__container".equals(str) || i10 < this.f2991a.size() - 1 || ((String) this.f2991a.get(i10)).equals("**");
    }

    public int hashCode() {
        int hashCode = this.f2991a.hashCode() * 31;
        f fVar = this.f2992b;
        return hashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.f2992b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f2991a);
        sb2.append(",resolved=");
        sb2.append(this.f2992b != null);
        sb2.append('}');
        return sb2.toString();
    }

    public e(e eVar) {
        this.f2991a = new ArrayList(eVar.f2991a);
        this.f2992b = eVar.f2992b;
    }
}
