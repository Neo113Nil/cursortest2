package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.hz;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class hw {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private List<Field> f2434;

    /* renamed from: ｋ, reason: contains not printable characters */
    private d f2435;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private hz f2436;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Field m7868(Class cls, final String str) {
        d dVar = new d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.hw.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.hw.d
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final boolean mo7872(Field field) {
                return field.getType().getName().toLowerCase().startsWith(str.toLowerCase());
            }
        };
        synchronized (hw.class) {
            if (this.f2434 == null) {
                this.f2434 = new ArrayList();
            }
            this.f2434.clear();
            m7866(cls, dVar, this.f2434);
            if (this.f2434.isEmpty()) {
                return null;
            }
            return this.f2434.get(0);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final <T> Field m7869(Class cls, Class<T> cls2) {
        Field m7871;
        synchronized (ke.class) {
            if (this.f2436 == null) {
                this.f2436 = new hz();
            }
            this.f2436.m7889(cls2);
            m7871 = m7871(cls, this.f2436);
        }
        return m7871;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Field m7871(Class cls, hz hzVar) {
        synchronized (ke.class) {
            if (this.f2434 == null) {
                this.f2434 = new ArrayList();
            }
            this.f2434.clear();
            m7863(cls, hzVar, this.f2434);
            if (this.f2434.isEmpty()) {
                return null;
            }
            return this.f2434.get(0);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List<Field> m7870(Class cls, hz hzVar) {
        ArrayList arrayList = new ArrayList();
        m7863(cls, hzVar, arrayList);
        return arrayList;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m7863(Class cls, hz hzVar, List<Field> list) {
        synchronized (hw.class) {
            if (this.f2435 == null) {
                this.f2435 = new d(this);
            }
            this.f2435.m7874(hzVar);
            m7866(cls, this.f2435, list);
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static hz.d m7864() {
        return new hz.d();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Field[] m7867(Class cls, boolean z, int i, List<String> list) {
        while (cls != null && !kk.m8432(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArr = new Field[0];
        if (cls != null) {
            Field[] fieldArr2 = new Field[0];
            Field[] fieldArr3 = new Field[0];
            try {
                fieldArr2 = cls.getDeclaredFields();
            } catch (Error unused) {
            }
            try {
                fieldArr3 = cls.getFields();
            } catch (Error unused2) {
            }
            fieldArr = kk.m8439(fieldArr2, fieldArr3);
            if (!z) {
                return fieldArr;
            }
            Class superclass = cls.getSuperclass();
            for (int i2 = 0; superclass != null && i2 != i; i2++) {
                try {
                    fieldArr = kk.m8439(fieldArr, superclass.getDeclaredFields());
                } catch (Error unused3) {
                }
                try {
                    fieldArr = kk.m8439(fieldArr, superclass.getFields());
                } catch (Error unused4) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return fieldArr;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m7866(Class cls, d dVar, List<Field> list) {
        for (Field field : m7865(cls, dVar.m7873())) {
            if (dVar.mo7872(field)) {
                field.setAccessible(true);
                list.add(field);
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Field[] m7865(Class cls, hz hzVar) {
        if (hzVar != null && hzVar.m7876()) {
            return m7867(cls, hzVar.m7876(), hzVar.m7878(), null);
        }
        try {
            return cls.getDeclaredFields();
        } catch (Error unused) {
            return cls.getFields();
        }
    }

    class d {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private int f2438;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private hz f2439;

        private d() {
        }

        /* synthetic */ d(hw hwVar) {
            this();
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final void m7874(hz hzVar) {
            this.f2439 = hzVar;
            this.f2438 = hzVar.m7885();
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final hz m7873() {
            return this.f2439;
        }

        /* renamed from: ﻐ */
        public boolean mo7872(Field field) {
            boolean isAssignableFrom;
            if (this.f2439 == null || (field.getModifiers() & this.f2439.m7877()) != this.f2439.m7877() || (field.getModifiers() & this.f2439.m7880()) != 0 || this.f2439.m7887().contains(field.getType())) {
                return false;
            }
            if (this.f2439.m7886()) {
                isAssignableFrom = field.getType().equals(this.f2439.m7888());
            } else {
                isAssignableFrom = this.f2439.m7888().isAssignableFrom(field.getType());
            }
            if (isAssignableFrom) {
                int i = this.f2438;
                if (i == 0) {
                    return true;
                }
                this.f2438 = i - 1;
            }
            return false;
        }
    }
}
