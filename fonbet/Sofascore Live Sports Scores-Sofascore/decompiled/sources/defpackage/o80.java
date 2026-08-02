package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o80 implements Appendable {
    public final StringBuilder a;
    public final ArrayList b;
    public final ArrayList c;

    public o80() {
        this.a = new StringBuilder(16);
        this.b = new ArrayList();
        this.c = new ArrayList();
        new ArrayList();
    }

    public final void a(pwh pwhVar, int i, int i2) {
        this.c.add(new n80(pwhVar, i, i2, 8));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof q80;
        StringBuilder sb = this.a;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        q80 q80Var = (q80) charSequence;
        int length = sb.length();
        sb.append((CharSequence) q80Var.b, i, i2);
        List a = r80.a(q80Var, i, i2, null);
        if (a != null) {
            int size = a.size();
            for (int i3 = 0; i3 < size; i3++) {
                p80 p80Var = (p80) a.get(i3);
                this.c.add(new n80(p80Var.a, p80Var.d, p80Var.b + length, p80Var.c + length));
            }
        }
        return this;
    }

    public final void b(q80 q80Var) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append(q80Var.b);
        List list = q80Var.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                p80 p80Var = (p80) list.get(i);
                this.c.add(new n80(p80Var.a, p80Var.d, p80Var.b + length, p80Var.c + length));
            }
        }
    }

    public final void c(CharSequence charSequence) {
        if (charSequence instanceof q80) {
            b((q80) charSequence);
        } else {
            this.a.append(charSequence);
        }
    }

    public final void d(String str) {
        this.a.append(str);
    }

    public final void e() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            s3a.c("Nothing to pop.");
        }
        ((n80) arrayList.remove(arrayList.size() - 1)).c = this.a.length();
    }

    public final void f(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            s3a.c(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            e();
        }
    }

    public final int g(pwh pwhVar) {
        n80 n80Var = new n80(pwhVar, this.a.length(), 0, 12);
        this.b.add(n80Var);
        this.c.add(n80Var);
        return r5.size() - 1;
    }

    public final q80 h() {
        StringBuilder sb = this.a;
        String sb2 = sb.toString();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((n80) arrayList.get(i)).a(sb.length()));
        }
        return new q80(sb2, arrayList2);
    }

    public o80(q80 q80Var) {
        this();
        b(q80Var);
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.a.append(c);
        return this;
    }
}
