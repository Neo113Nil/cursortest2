package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class d45 implements Closeable {
    public final String a;
    public final long b;
    public final ArrayList c;
    public final /* synthetic */ l45 d;

    public d45(l45 l45Var, String str, long j, ArrayList arrayList, long[] jArr) {
        str.getClass();
        jArr.getClass();
        this.d = l45Var;
        this.a = str;
        this.b = j;
        this.c = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            wol.b((cwh) it.next());
        }
    }
}
