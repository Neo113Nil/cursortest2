package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class se3 extends RuntimeException {
    public final l0d a;
    public final l0d b;
    public final tzc c;
    public final int d;

    public se3(l0d l0dVar, l0d l0dVar2, tzc tzcVar, int i, Exception exc) {
        super(exc);
        this.a = l0dVar;
        this.b = l0dVar2;
        this.c = tzcVar;
        this.d = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.d);
        sb.append(":\n            |");
        w4h a = b5h.a(new re3(this, null));
        if (a.hasNext()) {
            Object next = a.next();
            if (a.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (a.hasNext()) {
                    arrayList.add(a.next());
                }
                list = arrayList;
            } else {
                list = a.c(next);
            }
        } else {
            list = km5.a;
        }
        sb.append(CollectionsKt.f0(CollectionsKt.M0(50, list), "\n", null, null, null, 62));
        sb.append("\n            ");
        return dii.d(sb.toString());
    }
}
