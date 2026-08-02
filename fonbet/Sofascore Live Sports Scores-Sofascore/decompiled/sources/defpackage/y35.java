package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y35 {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public en0 g;
    public int h;
    public final /* synthetic */ j45 i;

    public y35(j45 j45Var, String str) {
        this.i = j45Var;
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

    public final c45 a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            j45 j45Var = this.i;
            if (i >= size) {
                this.h++;
                return new c45(j45Var, this);
            }
            if (!j45Var.q.k((uae) arrayList.get(i))) {
                try {
                    j45Var.t(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
