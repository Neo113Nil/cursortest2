package Pi;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public String f9178a;

    /* renamed from: b, reason: collision with root package name */
    public int f9179b;

    /* renamed from: c, reason: collision with root package name */
    public char f9180c;

    /* renamed from: d, reason: collision with root package name */
    public StringBuffer f9181d;

    public d(String str) {
        this(str, ',');
    }

    public boolean a() {
        return this.f9179b != this.f9178a.length();
    }

    public String b() {
        if (this.f9179b == this.f9178a.length()) {
            return null;
        }
        int i10 = this.f9179b + 1;
        this.f9181d.setLength(0);
        boolean z10 = false;
        boolean z11 = false;
        while (i10 != this.f9178a.length()) {
            char charAt = this.f9178a.charAt(i10);
            if (charAt == '\"') {
                if (!z10) {
                    z11 = !z11;
                }
                this.f9181d.append(charAt);
            } else if (z10 || z11) {
                this.f9181d.append(charAt);
            } else {
                if (charAt == '\\') {
                    this.f9181d.append(charAt);
                    z10 = true;
                } else {
                    if (charAt == this.f9180c) {
                        break;
                    }
                    this.f9181d.append(charAt);
                }
                i10++;
            }
            z10 = false;
            i10++;
        }
        this.f9179b = i10;
        return this.f9181d.toString();
    }

    public d(String str, char c10) {
        this.f9181d = new StringBuffer();
        this.f9178a = str;
        this.f9179b = -1;
        this.f9180c = c10;
    }
}
