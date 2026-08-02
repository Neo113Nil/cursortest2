package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b45 {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public en0 g;
    public int h;
    public final /* synthetic */ m45 i;

    public b45(m45 m45Var, String str) {
        this.i = m45Var;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.a.e(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.a.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final e45 a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            m45 m45Var = this.i;
            if (i >= size) {
                this.h++;
                return new e45(m45Var, this);
            }
            if (!m45Var.p.k((uae) arrayList.get(i))) {
                try {
                    m45Var.t(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
