package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.氵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1005 extends AbstractC0475 {
    static {
        StringFog.decrypt("/zXfJdCMdVDLJNkK15k=\n", "mFCrY7n+BiQ=\n");
        StringFog.decrypt("TZ9pPGSYT0lPn281VJh6bluEYDl1jw==\n", "Lu0MXRD9HCw=\n");
        StringFog.decrypt("eqFMTZjutHlp\n", "HcQ4AvqE0Ro=\n");
        StringFog.decrypt("q7UT9KP12824ow==\n", "zNBnu8Gfvq4=\n");
        StringFog.decrypt("1cvf4hhoJVPG6MLIFmY=\n", "sq6rrXoCQDA=\n");
        StringFog.decrypt("t7W8nrA8kxGkhqm9pzM=\n", "0NDI0dJW9nI=\n");
        StringFog.decrypt("JU0wyFfQmps2bi3iWd6M\n", "QihEhzW6//g=\n");
        StringFog.decrypt("zyVzAgar/BXcFmYhEaTq\n", "qEAHTWTBmXY=\n");
        StringFog.decrypt("f9kETs/Zn+Jc2Qhe2uuf9XHSDQ==\n", "GLxqK72464c=\n");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static ArrayList m602(ArrayList arrayList) {
        Object m295;
        C0832 c0832;
        Class<?> cls;
        int size = arrayList.size();
        Class<?> cls2 = null;
        cls2 = null;
        Object m2952 = null;
        if (size == 2) {
            if (arrayList.get(0) instanceof Class) {
                cls2 = (Class) AbstractC0475.m295(arrayList, 0, Class.class);
                m295 = null;
            } else {
                m295 = AbstractC0475.m295(arrayList, 0, Object.class);
                if (m295 != null) {
                    cls2 = m295.getClass();
                }
            }
            c0832 = (C0832) AbstractC0475.m295(arrayList, 1, C0832.class);
        } else if (size != 3) {
            c0832 = null;
            m295 = null;
        } else {
            if (arrayList.get(0) instanceof Class) {
                cls = (Class) AbstractC0475.m295(arrayList, 0, Class.class);
                if (arrayList.get(1) instanceof C0832) {
                    c0832 = (C0832) AbstractC0475.m295(arrayList, 1, C0832.class);
                } else {
                    m2952 = AbstractC0475.m295(arrayList, 1, Object.class);
                    c0832 = (C0832) AbstractC0475.m295(arrayList, 2, C0832.class);
                }
            } else {
                m2952 = AbstractC0475.m295(arrayList, 0, Object.class);
                cls = m2952.getClass();
                c0832 = (C0832) AbstractC0475.m295(arrayList, 1, C0832.class);
            }
            Object obj = m2952;
            cls2 = cls;
            m295 = obj;
        }
        C1050 c1050 = C0267.m139().f487;
        c1050.getClass();
        ArrayList arrayList2 = new ArrayList();
        try {
            C0805 c0805 = C0267.m139().f488;
            ArrayList arrayList3 = new ArrayList();
            c0805.m464(cls2, c0832, arrayList3);
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Field) it.next()).get(m295));
            }
            return arrayList2;
        } catch (Throwable unused) {
            AbstractC0420.m243(c1050.f3337, StringFog.decrypt("kIKmX3oV2YGhhL1ebxU=\n", "1fDUMAg1vuQ=\n") + c0832.f2646 + StringFog.decrypt("HippfeRbrh5RMzA=\n", "Pl4QDYF7yGw=\n") + cls2 + StringFog.decrypt("Fugwl99j\n", "Notc9qwQS94=\n"));
            return arrayList2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #0 {all -> 0x00b7, blocks: (B:10:0x00a6, B:12:0x00b2), top: B:9:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m603(ArrayList arrayList) {
        Object obj;
        Class<?> cls;
        C0832 c0832;
        Object obj2;
        C1050 c1050;
        int size = arrayList.size();
        try {
            if (size != 2) {
                if (size != 3) {
                    if (size != 4) {
                        obj2 = null;
                        cls = null;
                        obj = null;
                        c0832 = null;
                    } else {
                        cls = (Class) AbstractC0475.m295(arrayList, 0, Class.class);
                        obj = AbstractC0475.m295(arrayList, 1, Object.class);
                        c0832 = (C0832) AbstractC0475.m295(arrayList, 2, C0832.class);
                        obj2 = AbstractC0475.m295(arrayList, 3, Object.class);
                    }
                } else if (arrayList.get(0) instanceof Class) {
                    cls = (Class) AbstractC0475.m295(arrayList, 0, Class.class);
                    if (arrayList.get(1) instanceof C0832) {
                        c0832 = (C0832) AbstractC0475.m295(arrayList, 1, C0832.class);
                        obj2 = AbstractC0475.m295(arrayList, 2, Object.class);
                        obj = null;
                    } else {
                        obj = AbstractC0475.m295(arrayList, 1, Object.class);
                        c0832 = (C0832) AbstractC0475.m295(arrayList, 2, C0832.class);
                    }
                } else {
                    obj = AbstractC0475.m295(arrayList, 0, Object.class);
                    cls = obj.getClass();
                    c0832 = (C0832) AbstractC0475.m295(arrayList, 1, C0832.class);
                    obj2 = AbstractC0475.m295(arrayList, 2, Object.class);
                }
                c1050 = C0267.m139().f487;
                c1050.getClass();
                Field m462 = C0267.m139().f488.m462(cls, c0832);
                return m462 == null ? m462.get(obj) : obj2;
            }
            if (arrayList.get(0) instanceof Class) {
                cls = (Class) AbstractC0475.m295(arrayList, 0, Class.class);
                obj = null;
            } else {
                Object m295 = AbstractC0475.m295(arrayList, 0, Object.class);
                if (m295 != null) {
                    obj = m295;
                    cls = m295.getClass();
                } else {
                    obj = m295;
                    cls = null;
                }
            }
            c0832 = (C0832) AbstractC0475.m295(arrayList, 1, C0832.class);
            Field m4622 = C0267.m139().f488.m462(cls, c0832);
            if (m4622 == null) {
            }
        } catch (Throwable unused) {
            AbstractC0420.m243(c1050.f3337, StringFog.decrypt("aEkOQp8bIHlZTxVDihs=\n", "LTt8Le07Rxw=\n") + c0832.f2646 + StringFog.decrypt("58uWFZl50dOo0s8=\n", "x7/vZfxZt6E=\n") + cls + StringFog.decrypt("hEHs9l6u\n", "pCKAly3dfyw=\n"));
            return null;
        }
        obj2 = null;
        c1050 = C0267.m139().f487;
        c1050.getClass();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m604(ArrayList arrayList) {
        int i = 0;
        if (arrayList.get(0) instanceof Class) {
            Class cls = (Class) AbstractC0475.m295(arrayList, 0, Class.class);
            String str = (String) AbstractC0475.m295(arrayList, 1, String.class);
            C0267.m139().f487.getClass();
            return C1050.m621((Object) null, cls, str);
        }
        Object m295 = AbstractC0475.m295(arrayList, 0, Object.class);
        if (arrayList.get(1) instanceof List) {
            JSONArray jSONArray = new JSONArray((Collection) AbstractC0475.m295(arrayList, 1, List.class));
            C0267.m139().f487.getClass();
            while (i < jSONArray.length()) {
                String m621 = C1050.m621(m295, m295.getClass(), jSONArray.optString(i));
                if (m621 != null) {
                    return m621;
                }
                i++;
            }
            return null;
        }
        if (!(arrayList.get(1) instanceof JSONArray)) {
            String str2 = (String) AbstractC0475.m295(arrayList, 1, String.class);
            C0267.m139().f487.getClass();
            return C1050.m621(m295, m295.getClass(), str2);
        }
        JSONArray jSONArray2 = (JSONArray) AbstractC0475.m295(arrayList, 1, JSONArray.class);
        C0267.m139().f487.getClass();
        if (jSONArray2 != null) {
            while (i < jSONArray2.length()) {
                String m6212 = C1050.m621(m295, m295.getClass(), jSONArray2.optString(i));
                if (m6212 != null) {
                    return m6212;
                }
                i++;
            }
        }
        return null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Object m606(C1102 c1102, C0950 c0950, ArrayList arrayList) {
        InterfaceC0264 interfaceC0264;
        Object m295 = AbstractC0475.m295(arrayList, 0, Object.class);
        C1137 c1137 = (C1137) AbstractC0475.m295(arrayList, 1, C1137.class);
        List m296 = AbstractC0475.m296(arrayList, 2);
        if (c1137 != null) {
            interfaceC0264 = C0267.m139().f487.m626(m295, c1137.f3548.m661(new C1038(c1137, c0950, c1102, m296), null, c1137.f3546, c1137.f3545));
        } else {
            interfaceC0264 = null;
        }
        if (interfaceC0264 != null) {
            return ((C1179) interfaceC0264).m665();
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m609(C1102 c1102, C0950 c0950, ArrayList arrayList) {
        Object m295 = AbstractC0475.m295(arrayList, 0, Object.class);
        C1137 c1137 = (C1137) AbstractC0475.m295(arrayList, 1, C1137.class);
        List m296 = AbstractC0475.m296(arrayList, 2);
        if (c1137 == null) {
            return null;
        }
        C1091 m661 = c1137.f3548.m661(new C1006(c1137, c0950, c1102, m296), null, c1137.f3546, c1137.f3545);
        C1050 c1050 = C0267.m139().f487;
        c1050.getClass();
        C1087 c1087 = new C1087(m661);
        c1087.f3391 = true;
        c1050.m625(m295, c1087, 0, (C1179) null);
        return new ArrayList(c1087.f3389);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static String m607(ArrayList arrayList) {
        Object m295 = AbstractC0475.m295(arrayList, 0, Object.class);
        List list = (List) AbstractC0475.m295(arrayList, 1, List.class);
        int intValue = ((Integer) AbstractC0475.m295(arrayList, 2, Integer.class)).intValue();
        C0267.m139().f487.getClass();
        return new C0427(list, intValue).m258(m295);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C1177 m608(ArrayList arrayList) {
        return new C1177((List) AbstractC0475.m295(arrayList, 0, List.class), ((Integer) AbstractC0475.m295(arrayList, 1, Integer.class)).intValue());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static ArrayList m605(C1102 c1102, C0950 c0950, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = m609(c1102, c0950, arrayList).iterator();
        while (it.hasNext()) {
            InterfaceC0264 interfaceC0264 = (InterfaceC0264) it.next();
            if (interfaceC0264 != null) {
                arrayList2.add(((C1179) interfaceC0264).m665());
            }
        }
        return arrayList2;
    }
}
