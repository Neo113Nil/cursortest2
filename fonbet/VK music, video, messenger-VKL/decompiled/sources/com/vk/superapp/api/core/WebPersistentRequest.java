package com.vk.superapp.api.core;

import com.vk.core.serialize.Serializer;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.p4g;
import xsna.rdx0;
import xsna.tyx;

/* compiled from: WebPersistentRequest.kt */
/* loaded from: classes6.dex */
public final class WebPersistentRequest extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<WebPersistentRequest> CREATOR = new a();
    public final String b;
    public final Map<String, String> c;
    public final Method d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebPersistentRequest> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebPersistentRequest a(Serializer serializer) {
            Method method;
            try {
                String H = serializer.H();
                String[] g = serializer.g();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (g != null) {
                    int i = 0;
                    int b = tyx.b(0, g.length - 1, 2);
                    if (b >= 0) {
                        while (true) {
                            linkedHashMap.put(g[i], g[i + 1]);
                            if (i == b) {
                                break;
                            }
                            i += 2;
                        }
                    }
                }
                Serializer.c<WebPersistentRequest> cVar = WebPersistentRequest.CREATOR;
                String H2 = serializer.H();
                String H3 = serializer.H();
                if (H2 != null && H3 != null) {
                    method = Class.forName(H2).getDeclaredMethod(H3, JSONObject.class);
                    method.setAccessible(true);
                    return new WebPersistentRequest(H, linkedHashMap, method);
                }
                method = null;
                return new WebPersistentRequest(H, linkedHashMap, method);
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebPersistentRequest[i];
        }
    }

    public WebPersistentRequest(String str, Map<String, String> map, Method method) {
        this.b = str;
        this.c = map;
        this.d = method;
        map.remove("method");
        map.remove("v");
        map.remove(SharedKt.PARAM_ACCESS_TOKEN);
        map.remove("sig");
    }

    public final rdx0<JSONObject> Ab() {
        rdx0<JSONObject> rdx0Var = new rdx0<>(this.b);
        for (Map.Entry<String, String> entry : this.c.entrySet()) {
            rdx0Var.o(entry.getKey(), entry.getValue());
        }
        return rdx0Var;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        String str;
        String str2;
        serializer.j0(this.b);
        Map<String, String> map = this.c;
        Iterator<String> it = map.keySet().iterator();
        int size = map.size() * 2;
        String[] strArr = new String[size];
        int i = 0;
        String str3 = null;
        while (i < size) {
            if (i % 2 == 0) {
                str2 = it.next();
                str = str2;
            } else {
                str = str3;
                str2 = map.get(str3);
            }
            strArr[i] = str2;
            i++;
            str3 = str;
        }
        serializer.k0(strArr);
        Method method = this.d;
        if (method == null) {
            serializer.j0(null);
            serializer.j0(null);
        } else {
            serializer.j0(method.getDeclaringClass().getName());
            serializer.j0(method.getName());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!WebPersistentRequest.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        WebPersistentRequest webPersistentRequest = (WebPersistentRequest) obj;
        return epx.f(this.b, webPersistentRequest.b) && p4g.g(this.c, webPersistentRequest.c) && epx.f(this.d, webPersistentRequest.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Method method = this.d;
        return hashCode + (method != null ? method.hashCode() : 0);
    }

    public final String toString() {
        return "PersistentRequest(method='" + this.b + "', params=" + this.c + ", successCallback=" + this.d + ')';
    }

    public final Method zb() {
        return this.d;
    }
}
