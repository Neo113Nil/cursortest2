package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Fc extends HashMap {

    /* renamed from: a, reason: collision with root package name */
    public int f12223a;

    public Fc() {
        this.f12223a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String put(String str, String str2) {
        if (!containsKey(str)) {
            if (str2 == null) {
                return null;
            }
            this.f12223a = str2.length() + str.length() + this.f12223a;
            return (String) super.put(str, str2);
        }
        if (str2 != null) {
            String str3 = (String) get(str);
            this.f12223a = (str2.length() - (str3 != null ? str3.length() : 0)) + this.f12223a;
            return (String) super.put(str, str2);
        }
        if (containsKey(str)) {
            String str4 = (String) get(str);
            this.f12223a -= str.length() + (str4 != null ? str4.length() : 0);
        }
        return (String) super.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            String str = (String) get(obj);
            this.f12223a -= ((String) obj).length() + (str == null ? 0 : str.length());
        }
        return (String) super.remove(obj);
    }

    public Fc(String str) {
        super(AbstractC0176gb.d(str));
        this.f12223a = 0;
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f12223a = str2.length() + (str3 == null ? 0 : str3.length()) + this.f12223a;
        }
    }
}
