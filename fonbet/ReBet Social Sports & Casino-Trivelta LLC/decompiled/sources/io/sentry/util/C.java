package io.sentry.util;

import io.sentry.EnumC4877z3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f52786a = new ConcurrentHashMap();

    public static List a(EnumC4877z3 enumC4877z3) {
        ArrayList arrayList = new ArrayList();
        EnumC4877z3 enumC4877z32 = EnumC4877z3.AGENT;
        if (enumC4877z32 == enumC4877z3 || EnumC4877z3.AGENTLESS_SPRING == enumC4877z3) {
            arrayList.add("auto.http.spring_jakarta.webmvc");
            arrayList.add("auto.http.spring.webmvc");
            arrayList.add("auto.http.spring7.webmvc");
            arrayList.add("auto.spring_jakarta.webflux");
            arrayList.add("auto.spring.webflux");
            arrayList.add("auto.spring7.webflux");
            arrayList.add("auto.db.jdbc");
            arrayList.add("auto.http.spring_jakarta.webclient");
            arrayList.add("auto.http.spring.webclient");
            arrayList.add("auto.http.spring7.webclient");
            arrayList.add("auto.http.spring_jakarta.restclient");
            arrayList.add("auto.http.spring.restclient");
            arrayList.add("auto.http.spring7.restclient");
            arrayList.add("auto.http.spring_jakarta.resttemplate");
            arrayList.add("auto.http.spring.resttemplate");
            arrayList.add("auto.http.spring7.resttemplate");
            arrayList.add("auto.http.openfeign");
            arrayList.add("auto.http.ktor-client");
            arrayList.add("auto.queue.spring_jakarta.kafka.producer");
            arrayList.add("auto.queue.spring_jakarta.kafka.consumer");
            arrayList.add("auto.queue.kafka.producer");
            arrayList.add("auto.queue.kafka.consumer");
        }
        if (enumC4877z32 == enumC4877z3) {
            arrayList.add("auto.graphql.graphql");
            arrayList.add("auto.graphql.graphql22");
        }
        return arrayList;
    }

    public static boolean b(List list, String str) {
        if (str != null && list != null && !list.isEmpty()) {
            Map map = f52786a;
            if (map.containsKey(str)) {
                return ((Boolean) map.get(str)).booleanValue();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((io.sentry.H) it.next()).a().equalsIgnoreCase(str)) {
                    f52786a.put(str, Boolean.TRUE);
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((io.sentry.H) it2.next()).b(str)) {
                    f52786a.put(str, Boolean.TRUE);
                    return true;
                }
                continue;
            }
            f52786a.put(str, Boolean.FALSE);
        }
        return false;
    }
}
