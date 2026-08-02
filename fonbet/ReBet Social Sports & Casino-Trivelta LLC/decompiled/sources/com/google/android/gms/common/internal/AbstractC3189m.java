package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3189m {

    /* renamed from: com.google.android.gms.common.internal.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List f32726a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f32727b;

        public /* synthetic */ a(Object obj, byte[] bArr) {
            AbstractC3191o.m(obj);
            this.f32727b = obj;
            this.f32726a = new ArrayList();
        }

        public a a(String str, Object obj) {
            AbstractC3191o.m(str);
            int length = str.length();
            String valueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(length + 1 + valueOf.length());
            sb2.append(str);
            sb2.append("=");
            sb2.append(valueOf);
            this.f32726a.add(sb2.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f32727b.getClass().getSimpleName());
            sb2.append('{');
            List list = this.f32726a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) list.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a d(Object obj) {
        return new a(obj, null);
    }
}
