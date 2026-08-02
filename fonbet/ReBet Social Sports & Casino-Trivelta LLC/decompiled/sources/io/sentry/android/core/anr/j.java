package io.sentry.android.core.anr;

import io.sentry.protocol.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class j {
    public static io.sentry.protocol.profiling.a a(d dVar) {
        List list = dVar.f50905a;
        io.sentry.protocol.profiling.a aVar = new io.sentry.protocol.profiling.a();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StackTraceElement[] stackTraceElementArr = ((i) it.next()).stack;
            ArrayList arrayList3 = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                String b10 = b(stackTraceElement);
                Integer num = (Integer) hashMap.get(b10);
                if (num == null) {
                    num = Integer.valueOf(arrayList.size());
                    arrayList.add(c(stackTraceElement));
                    hashMap.put(b10, num);
                }
                arrayList3.add(num);
            }
            String d10 = d(arrayList3);
            Integer num2 = (Integer) hashMap2.get(d10);
            if (num2 == null) {
                num2 = Integer.valueOf(arrayList2.size());
                arrayList2.add(new ArrayList(arrayList3));
                hashMap2.put(d10, num2);
            }
            io.sentry.protocol.profiling.b bVar = new io.sentry.protocol.profiling.b();
            bVar.f(r5.f50915a / 1000.0d);
            bVar.d(num2.intValue());
            bVar.e("0");
            aVar.e().add(bVar);
        }
        aVar.f(arrayList);
        aVar.g(arrayList2);
        io.sentry.protocol.profiling.c cVar = new io.sentry.protocol.profiling.c();
        cVar.c("main");
        cVar.d(5);
        aVar.h(Collections.singletonMap("0", cVar));
        return aVar;
    }

    public static String b(StackTraceElement stackTraceElement) {
        return stackTraceElement.getClassName() + "#" + stackTraceElement.getMethodName() + "#" + stackTraceElement.getFileName() + "#" + stackTraceElement.getLineNumber();
    }

    public static y c(StackTraceElement stackTraceElement) {
        y yVar = new y();
        yVar.y(stackTraceElement.getFileName());
        yVar.z(stackTraceElement.getMethodName());
        yVar.E(stackTraceElement.getClassName());
        yVar.C(stackTraceElement.getLineNumber() > 0 ? Integer.valueOf(stackTraceElement.getLineNumber()) : null);
        if (stackTraceElement.isNativeMethod()) {
            yVar.F(Boolean.TRUE);
        }
        return yVar;
    }

    public static String d(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(num);
        }
        return sb2.toString();
    }
}
