package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.cm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class da extends cw {
    /* renamed from: ｋ, reason: contains not printable characters */
    public static cm.d m7421(List<Object> list) {
        return new cm.d((List) m7365(list, 0, List.class), ((Integer) m7365(list, 1, Integer.class)).intValue());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m7423(List<Object> list) {
        Object obj;
        Class<?> cls;
        hz hzVar;
        Object obj2;
        Object obj3;
        Class<?> cls2;
        hz hzVar2;
        Object obj4;
        int size = list.size();
        Object obj5 = null;
        Class<?> cls3 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls = (Class) m7365(list, 0, Class.class);
                obj = null;
            } else {
                Object obj6 = m7365(list, 0, Object.class);
                if (obj6 != null) {
                    obj = obj6;
                    cls = obj6.getClass();
                } else {
                    obj = obj6;
                    cls = null;
                }
            }
            hzVar = (hz) m7365(list, 1, hz.class);
            cls3 = cls;
            obj2 = obj;
            obj3 = null;
        } else if (size == 3) {
            if (list.get(0) instanceof Class) {
                cls2 = (Class) m7365(list, 0, Class.class);
                if (list.get(1) instanceof hz) {
                    hzVar2 = (hz) m7365(list, 1, hz.class);
                    obj4 = m7365(list, 2, Object.class);
                } else {
                    Object obj7 = m7365(list, 1, Object.class);
                    hzVar = (hz) m7365(list, 2, hz.class);
                    obj3 = null;
                    cls3 = cls2;
                    obj2 = obj7;
                }
            } else {
                obj5 = m7365(list, 0, Object.class);
                cls2 = obj5.getClass();
                hzVar2 = (hz) m7365(list, 1, hz.class);
                obj4 = m7365(list, 2, Object.class);
            }
            Object obj8 = obj5;
            cls3 = cls2;
            obj2 = obj8;
            obj3 = obj4;
            hzVar = hzVar2;
        } else if (size != 4) {
            hzVar = null;
            obj2 = null;
            obj3 = null;
        } else {
            cls3 = (Class) m7365(list, 0, Class.class);
            obj2 = m7365(list, 1, Object.class);
            hz hzVar3 = (hz) m7365(list, 2, hz.class);
            obj3 = m7365(list, 3, Object.class);
            hzVar = hzVar3;
        }
        id.m7937().m7939();
        return ih.m8033(cls3, obj2, hzVar, obj3);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static List<Object> m7422(List<Object> list) {
        Object obj;
        hz hzVar;
        Class<?> cls;
        int size = list.size();
        Class<?> cls2 = null;
        cls2 = null;
        Object obj2 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls2 = (Class) m7365(list, 0, Class.class);
                obj = null;
            } else {
                obj = m7365(list, 0, Object.class);
                if (obj != null) {
                    cls2 = obj.getClass();
                }
            }
            hzVar = (hz) m7365(list, 1, hz.class);
        } else if (size != 3) {
            hzVar = null;
            obj = null;
        } else {
            if (list.get(0) instanceof Class) {
                cls = (Class) m7365(list, 0, Class.class);
                if (list.get(1) instanceof hz) {
                    hzVar = (hz) m7365(list, 1, hz.class);
                } else {
                    obj2 = m7365(list, 1, Object.class);
                    hzVar = (hz) m7365(list, 2, hz.class);
                }
            } else {
                obj2 = m7365(list, 0, Object.class);
                cls = obj2.getClass();
                hzVar = (hz) m7365(list, 1, hz.class);
            }
            Object obj3 = obj2;
            cls2 = cls;
            obj = obj3;
        }
        id.m7937().m7939();
        return ih.m8041(cls2, obj, hzVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final <T> Cif<T> m7424(final ee eeVar, final cl clVar, List<Object> list) {
        Object obj = m7365(list, 0, Object.class);
        final cm cmVar = (cm) m7365(list, 1, cm.class);
        final List<Object> list2 = m7364(list, 2);
        if (cmVar == null) {
            return null;
        }
        return id.m7937().m7939().m8047(obj, cmVar.m7263(new ii() { // from class: com.ironsource.adqualitysdk.sdk.i.da.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ii
            /* renamed from: ﻐ */
            public final boolean mo7428(Cif cif) {
                return cm.this.m7264().m7306(cif, eeVar, clVar, list2);
            }
        }));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Object m7427(ee eeVar, cl clVar, List<Object> list) {
        Cif m7424 = m7424(eeVar, clVar, list);
        if (m7424 != null) {
            return m7424.mo7966();
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final List<Cif> m7425(final ee eeVar, final cl clVar, List<Object> list) {
        Object obj = m7365(list, 0, Object.class);
        final cm cmVar = (cm) m7365(list, 1, cm.class);
        final List<Object> list2 = m7364(list, 2);
        if (cmVar == null) {
            return null;
        }
        return id.m7937().m7939().m8045(obj, cmVar.m7263(new ii() { // from class: com.ironsource.adqualitysdk.sdk.i.da.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ii
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final boolean mo7428(Cif cif) {
                return cm.this.m7264().m7306(cif, eeVar, clVar, list2);
            }
        }));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List<Object> m7426(ee eeVar, cl clVar, List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Cif cif : m7425(eeVar, clVar, list)) {
            if (cif != null) {
                arrayList.add(cif.mo7966());
            }
        }
        return arrayList;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String m7419(List<Object> list) {
        if (list.get(0) instanceof Class) {
            return id.m7937().m7939().m8046((Class) m7365(list, 0, Class.class), (String) m7365(list, 1, String.class));
        }
        Object obj = m7365(list, 0, Object.class);
        if (list.get(1) instanceof List) {
            return id.m7937().m7939().m8050(obj, new JSONArray((Collection) m7365(list, 1, List.class)));
        }
        if (list.get(1) instanceof JSONArray) {
            return id.m7937().m7939().m8050(obj, (JSONArray) m7365(list, 1, JSONArray.class));
        }
        return id.m7937().m7939().m8049(obj, (String) m7365(list, 1, String.class));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static String m7420(List<Object> list) {
        Object obj = m7365(list, 0, Object.class);
        List list2 = (List) m7365(list, 1, List.class);
        int intValue = ((Integer) m7365(list, 2, Integer.class)).intValue();
        id.m7937().m7939();
        return ih.m8035(obj, (List<String>) list2, intValue);
    }
}
