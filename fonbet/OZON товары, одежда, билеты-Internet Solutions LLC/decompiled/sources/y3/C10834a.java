package y3;

import D3.r;
import D3.v;
import android.net.Uri;
import com.google.common.collect.AbstractC5880y;
import j3.C7275q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import m3.C8057J;
import q3.c;
import z3.e;
import z3.g;
import z3.h;
import z3.i;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10834a extends v<h> {

    /* renamed from: y3.a$a, reason: collision with other inner class name */
    public static final class C2290a extends v.a<h> {
        public C2290a(c.a aVar) {
            super(aVar, new i());
        }

        @Override // D3.w
        public final C2290a a(long j11) {
            d(j11);
            return this;
        }

        @Override // D3.w
        public final C2290a b(ExecutorService executorService) {
            c(executorService);
            return this;
        }

        public final C10834a e(C7275q c7275q) {
            return new C10834a(c7275q, this.f5748b, this.f5747a, this.f5749c, this.f5750d, this.f5751e);
        }
    }

    private static void j(e eVar, e.C2323e c2323e, HashSet hashSet, ArrayList arrayList) {
        long j11 = eVar.f107026h + c2323e.f107091e;
        String str = eVar.f107123a;
        String str2 = c2323e.f107093g;
        if (str2 != null) {
            Uri d11 = C8057J.d(str, str2);
            if (hashSet.add(d11)) {
                arrayList.add(new v.c(j11, v.d(d11)));
            }
        }
        arrayList.add(new v.c(j11, new p3.i(C8057J.d(str, c2323e.f107087a), c2323e.f107095i, c2323e.f107096j)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // D3.v
    protected final ArrayList f(c cVar, r rVar, boolean z11) throws IOException, InterruptedException {
        C10834a c10834a = this;
        boolean z12 = z11;
        h hVar = (h) rVar;
        ArrayList arrayList = new ArrayList();
        if (hVar instanceof g) {
            List<Uri> list = ((g) hVar).f107104d;
            for (int i11 = 0; i11 < list.size(); i11++) {
                arrayList.add(v.d(list.get(i11)));
            }
        } else {
            arrayList.add(v.d(Uri.parse(hVar.f107123a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p3.i iVar = (p3.i) it.next();
            arrayList2.add(new v.c(0L, iVar));
            try {
                e eVar = (e) c10834a.e(cVar, iVar, z12);
                AbstractC5880y abstractC5880y = eVar.f107036r;
                long j11 = z12 ? 0L : c10834a.f5735a;
                long j12 = z12 ? -9223372036854775807L : c10834a.f5736b;
                e.C2323e c2323e = null;
                for (int i12 = 0; i12 < abstractC5880y.size(); i12++) {
                    e.C2323e c2323e2 = (e.C2323e) abstractC5880y.get(i12);
                    long j13 = eVar.f107026h + c2323e2.f107091e;
                    if (j13 + c2323e2.f107089c > j11) {
                        if (j12 == -9223372036854775807L || j13 < j11 + j12) {
                            e.C2323e c2323e3 = c2323e2.f107088b;
                            if (c2323e3 != null && c2323e3 != c2323e) {
                                j(eVar, c2323e3, hashSet, arrayList2);
                                c2323e = c2323e3;
                            }
                            j(eVar, c2323e2, hashSet, arrayList2);
                        }
                    }
                }
            } catch (IOException e11) {
                if (!z11) {
                    throw e11;
                }
            }
            c10834a = this;
            z12 = z11;
        }
        return arrayList2;
    }
}
