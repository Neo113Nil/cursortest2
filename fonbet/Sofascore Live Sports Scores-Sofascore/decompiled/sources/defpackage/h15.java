package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class h15 {
    public static final /* synthetic */ int a = 0;

    static {
        rik.x("DiagnosticsWrkr");
    }

    public static final void a(ccl cclVar, scl sclVar, bri briVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lcl lclVar = (lcl) it.next();
            qbl p = rha.p(lclVar);
            String str = lclVar.a;
            briVar.getClass();
            String str2 = p.a;
            int i = p.b;
            str2.getClass();
            ari ariVar = (ari) gz8.S(briVar.a, true, false, new pu9(str2, i, 3));
            Integer valueOf = ariVar != null ? Integer.valueOf(ariVar.c) : null;
            cclVar.getClass();
            str.getClass();
            String f0 = CollectionsKt.f0((List) gz8.S(cclVar.a, true, false, new cfi(str, 8)), BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62);
            sclVar.getClass();
            String f02 = CollectionsKt.f0((List) gz8.S(sclVar.a, true, false, new cfi(str, 20)), BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62);
            StringBuilder q = wt3.q("\n", str, "\t ");
            me4.o(valueOf, lclVar.c, "\t ", "\t ", q);
            q.append(lclVar.b.name());
            q.append("\t ");
            q.append(f0);
            q.append("\t ");
            q.append(f02);
            q.append('\t');
        }
    }
}
