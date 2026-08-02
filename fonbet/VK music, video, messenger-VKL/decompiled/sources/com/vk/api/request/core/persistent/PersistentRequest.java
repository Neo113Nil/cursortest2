package com.vk.api.request.core.persistent;

import com.vk.core.serialize.Serializer;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import xsna.epx;
import xsna.i9x;
import xsna.p4g;
import xsna.swe0;
import xsna.xz2;

/* compiled from: PersistentRequest.kt */
/* loaded from: classes15.dex */
public final class PersistentRequest extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PersistentRequest> CREATOR = new a();
    public final String b;
    public final Map<String, String> c;
    public final Method d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PersistentRequest> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PersistentRequest a(Serializer serializer) {
            Method method;
            try {
                String H = serializer.H();
                String[] g = serializer.g();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (g != null) {
                    i9x p = swe0.p(2, swe0.q(0, g.length));
                    int i = p.b;
                    int i2 = p.c;
                    int i3 = p.d;
                    if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                        while (true) {
                            linkedHashMap.put(g[i], g[i + 1]);
                            if (i == i2) {
                                break;
                            }
                            i += i3;
                        }
                    }
                }
                Serializer.c<PersistentRequest> cVar = PersistentRequest.CREATOR;
                String H2 = serializer.H();
                String H3 = serializer.H();
                if (H2 != null && H3 != null) {
                    method = Class.forName(H2).getDeclaredMethod(H3, JSONObject.class);
                    method.setAccessible(true);
                    return new PersistentRequest(H, linkedHashMap, method);
                }
                method = null;
                return new PersistentRequest(H, linkedHashMap, method);
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PersistentRequest[i];
        }
    }

    public PersistentRequest(String str, Map<String, String> map, Method method) {
        this.b = str;
        this.c = map;
        this.d = method;
        for (int i = 0; i < 4; i++) {
            this.c.remove(xz2.r[i]);
        }
    }

    public final Map<String, String> Ab() {
        return this.c;
    }

    public final Method Bb() {
        return this.d;
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
        if (!PersistentRequest.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        PersistentRequest persistentRequest = (PersistentRequest) obj;
        return epx.f(this.b, persistentRequest.b) && p4g.g(this.c, persistentRequest.c) && epx.f(this.d, persistentRequest.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Method method = this.d;
        return hashCode + (method != null ? method.hashCode() : 0);
    }

    public final String toString() {
        return "PersistentRequest(method='" + this.b + "', params=" + this.c + ", successCallback=" + this.d + ')';
    }

    public final String zb() {
        return this.b;
    }
}
