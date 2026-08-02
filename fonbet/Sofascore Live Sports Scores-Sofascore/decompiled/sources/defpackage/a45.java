package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class a45 {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public en0 g;
    public int h;
    public long i;
    public final /* synthetic */ l45 j;

    public a45(l45 l45Var, String str) {
        str.getClass();
        this.j = l45Var;
        this.a = str;
        l45Var.getClass();
        this.b = new long[2];
        this.c = new ArrayList();
        this.d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.j.a.e(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.j.a.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final d45 a() {
        TimeZone timeZone = yol.a;
        if (!this.e) {
            return null;
        }
        l45 l45Var = this.j;
        if (!l45Var.l && (this.g != null || this.f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.b.clone();
        for (int i = 0; i < 2; i++) {
            try {
                cwh M = l45Var.b.M((uae) this.c.get(i));
                if (!l45Var.l) {
                    this.h++;
                    M = new x35(M, l45Var, this);
                }
                arrayList.add(M);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    wol.b((cwh) it.next());
                }
                try {
                    l45Var.M(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new d45(this.j, this.a, this.i, arrayList, jArr);
    }
}
