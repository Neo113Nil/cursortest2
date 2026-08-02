package com.google.android.gms.internal.gtm;

import E0.C2942q;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes9.dex */
final class zzwm {
    static String zza(zzwk zzwkVar, String str) {
        StringBuilder e11 = C2942q.e("# ", str);
        zzd(zzwkVar, e11, 0);
        return e11.toString();
    }

    static final void zzb(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i11, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i11, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzxm.zza(zztd.zzo((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zztd) {
            sb2.append(": \"");
            sb2.append(zzxm.zza((zztd) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzuz) {
            sb2.append(" {");
            zzd((zzuz) obj, sb2, i11 + 2);
            sb2.append("\n");
            while (i12 < i11) {
                sb2.append(' ');
                i12++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i14 = i11 + 2;
        zzb(sb2, i14, "key", entry.getKey());
        zzb(sb2, i14, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
        sb2.append("\n");
        while (i12 < i11) {
            sb2.append(' ');
            i12++;
        }
        sb2.append("}");
    }

    private static final String zzc(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    private static void zzd(zzwk zzwkVar, StringBuilder sb2, int i11) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzwkVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb2, i11, zzc(concat), zzuz.zzai(method2, zzwkVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb2, i11, zzc(concat2), zzuz.zzai(method3, zzwkVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object zzai = zzuz.zzai(method4, zzwkVar, new Object[0]);
                    if (method5 == null) {
                        if (zzai instanceof Boolean) {
                            if (((Boolean) zzai).booleanValue()) {
                                zzb(sb2, i11, zzc(concat3), zzai);
                            }
                        } else if (zzai instanceof Integer) {
                            if (((Integer) zzai).intValue() != 0) {
                                zzb(sb2, i11, zzc(concat3), zzai);
                            }
                        } else if (zzai instanceof Float) {
                            if (((Float) zzai).floatValue() != 0.0f) {
                                zzb(sb2, i11, zzc(concat3), zzai);
                            }
                        } else if (!(zzai instanceof Double)) {
                            if (zzai instanceof String) {
                                equals = zzai.equals("");
                            } else if (zzai instanceof zztd) {
                                equals = zzai.equals(zztd.zzb);
                            } else if (!(zzai instanceof zzwk)) {
                                if ((zzai instanceof Enum) && ((Enum) zzai).ordinal() == 0) {
                                }
                                zzb(sb2, i11, zzc(concat3), zzai);
                            } else if (zzai != ((zzwk) zzai).zzar()) {
                                zzb(sb2, i11, zzc(concat3), zzai);
                            }
                            if (!equals) {
                                zzb(sb2, i11, zzc(concat3), zzai);
                            }
                        } else if (((Double) zzai).doubleValue() != 0.0d) {
                            zzb(sb2, i11, zzc(concat3), zzai);
                        }
                    } else if (((Boolean) zzuz.zzai(method5, zzwkVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i11, zzc(concat3), zzai);
                    }
                }
            }
        }
        if (zzwkVar instanceof zzuv) {
            Iterator<Map.Entry<zzuw, Object>> zzf = ((zzuv) zzwkVar).zza.zzf();
            while (zzf.hasNext()) {
                Map.Entry<zzuw, Object> next = zzf.next();
                int i12 = next.getKey().zzb;
                StringBuilder sb3 = new StringBuilder(13);
                sb3.append("[");
                sb3.append(i12);
                sb3.append("]");
                zzb(sb2, i11, sb3.toString(), next.getValue());
            }
        }
        zzxp zzxpVar = ((zzuz) zzwkVar).zzc;
        if (zzxpVar != null) {
            zzxpVar.zzg(sb2, i11);
        }
    }
}
