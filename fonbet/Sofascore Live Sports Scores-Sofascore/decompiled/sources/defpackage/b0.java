package defpackage;

import com.facebook.internal.k0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class b0 {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static final void a() {
        File[] listFiles;
        if (cw3.a.contains(b0.class)) {
            return;
        }
        try {
            if (k0.y()) {
                return;
            }
            File o = f6a.o();
            int i = 0;
            if (o == null) {
                listFiles = new File[0];
            } else {
                listFiles = o.listFiles(new dw3(7));
                if (listFiles == null) {
                    listFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                arrayList.add(b6a.v(file));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((e6a) next).a()) {
                    arrayList2.add(next);
                }
            }
            List H0 = CollectionsKt.H0(arrayList2, new z(0));
            JSONArray jSONArray = new JSONArray();
            v6a it2 = llf.j(0, Math.min(H0.size(), 5)).iterator();
            while (it2.c) {
                jSONArray.put(H0.get(it2.nextInt()));
            }
            f6a.E("anr_reports", jSONArray, new a0(H0, i));
        } catch (Throwable th) {
            cw3.a(b0.class, th);
        }
    }
}
