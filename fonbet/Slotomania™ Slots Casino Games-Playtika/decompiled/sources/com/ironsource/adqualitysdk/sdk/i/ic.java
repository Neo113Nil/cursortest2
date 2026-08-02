package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class ic {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private dl f2472;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ic f2473;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static List<Method> m7923(Class cls, ie ieVar) {
        ArrayList arrayList = new ArrayList();
        m7926(cls, ieVar, arrayList);
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m7926(Class cls, ie ieVar, List<Method> list) {
        c cVar = new c((byte) 0);
        cVar.m7935(ieVar);
        m7924(cls, cVar, list);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m7924(Class cls, c cVar, List<Method> list) {
        List<Method> asList;
        ie m7934 = cVar.m7934();
        if (m7934 != null && m7934.m7876()) {
            asList = m7927(cls, m7934.m7876(), m7934.m7878());
        } else {
            asList = Arrays.asList(cls.getDeclaredMethods());
        }
        for (Method method : asList) {
            if (cVar.m7936(method)) {
                list.add(method);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static List<Method> m7927(Class cls, boolean z, int i) {
        Method[] methodArr = new Method[0];
        if (cls != null) {
            methodArr = kk.m8430(cls.getDeclaredMethods(), cls.getMethods());
            if (!z) {
                return Arrays.asList(methodArr);
            }
            Class superclass = cls.getSuperclass();
            for (int i2 = 0; superclass != null && i2 != i; i2++) {
                methodArr = kk.m8430(kk.m8430(methodArr, superclass.getDeclaredMethods()), superclass.getMethods());
                superclass = superclass.getSuperclass();
            }
        }
        return Arrays.asList(methodArr);
    }

    static class c {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private ie f2474;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private int f2475;

        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final void m7935(ie ieVar) {
            this.f2474 = ieVar;
            this.f2475 = ieVar.m7952();
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final ie m7934() {
            return this.f2474;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final boolean m7936(Method method) {
            boolean z;
            if (this.f2474 == null || (method.getModifiers() & this.f2474.m7877()) != this.f2474.m7877() || (method.getModifiers() & this.f2474.m7880()) != 0 || this.f2474.m7949().contains(method.getReturnType())) {
                return false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (this.f2474.m7947() != -1 && this.f2474.m7947() != parameterTypes.length) {
                return false;
            }
            List<Class> m7950 = this.f2474.m7950();
            if (m7950 != null) {
                if (m7950.size() != parameterTypes.length) {
                    return false;
                }
                for (int i = 0; i < m7950.size(); i++) {
                    if (!m7950.get(i).equals(parameterTypes[i])) {
                        return false;
                    }
                }
            }
            if (this.f2474.m7951() == null) {
                z = true;
            } else if (this.f2474.m7948()) {
                z = method.getReturnType().equals(this.f2474.m7951());
            } else {
                z = this.f2474.m7951().isAssignableFrom(method.getReturnType());
            }
            if (z) {
                int i2 = this.f2475;
                if (i2 == 0) {
                    return true;
                }
                this.f2475 = i2 - 1;
            }
            return false;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Method m7925(Class cls, ie ieVar) {
        ArrayList arrayList = new ArrayList();
        m7926(cls, ieVar, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Method) arrayList.get(0);
    }

    public ic() {
    }

    public ic(dl dlVar, ic icVar) {
        this.f2472 = dlVar;
        this.f2473 = icVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m7928() {
        return this.f2472.m7580();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final ic m7931() {
        return this.f2473;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m7932() {
        ArrayList arrayList = new ArrayList(this.f2472.m7581());
        ic icVar = this.f2473;
        if (icVar != null) {
            arrayList.addAll(icVar.m7932());
        }
        return arrayList;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final List<dm> m7930() {
        ArrayList arrayList = new ArrayList(this.f2472.m7578());
        ic icVar = this.f2473;
        if (icVar != null) {
            arrayList.addAll(icVar.m7930());
        }
        return arrayList;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final dh m7929(String str) {
        dh dhVar;
        ic icVar = this;
        do {
            dhVar = icVar.f2472.m7577().get(str);
            if (dhVar != null) {
                break;
            }
            icVar = icVar.f2473;
        } while (icVar != null);
        return dhVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final dz m7933(String str) {
        dz dzVar;
        ic icVar = this;
        do {
            dzVar = icVar.f2472.m7583().get(str);
            if (dzVar != null) {
                break;
            }
            icVar = icVar.f2473;
        } while (icVar != null);
        return dzVar;
    }
}
