package com.google.android.gms.internal.measurement;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.twilio.voice.EventKeys;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;

/* loaded from: classes2.dex */
final class zzno {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zznm zznmVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzc(zznmVar, sb2, 0);
        return sb2.toString();
    }

    public static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zzd(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            zzlh zzlhVar = zzlh.zzb;
            sb2.append(zzog.zza(new zzlg(((String) obj).getBytes(zzmp.zza))));
            sb2.append(Typography.quote);
            return;
        }
        if (obj instanceof zzlh) {
            sb2.append(": \"");
            sb2.append(zzog.zza((zzlh) obj));
            sb2.append(Typography.quote);
            return;
        }
        if (obj instanceof zzmf) {
            sb2.append(" {");
            zzc((zzmf) obj, sb2, i10 + 2);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            zzd(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb2, i12, "key", entry.getKey());
        zzb(sb2, i12, EventKeys.VALUE_KEY, entry.getValue());
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        zzd(i10, sb2);
        sb2.append("}");
    }

    private static void zzc(zznm zznmVar, StringBuilder sb2, int i10) {
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zznmVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i10, substring.substring(0, substring.length() - 4), zzmf.zzcr(method2, zznmVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i10, substring.substring(0, substring.length() - 3), zzmf.zzcr(method, zznmVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzcr = zzmf.zzcr(method4, zznmVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zzmf.zzcr(method5, zznmVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb2, i10, substring, zzcr);
                    } else if (zzcr instanceof Boolean) {
                        if (!((Boolean) zzcr).booleanValue()) {
                        }
                        zzb(sb2, i10, substring, zzcr);
                    } else if (zzcr instanceof Integer) {
                        if (((Integer) zzcr).intValue() == 0) {
                        }
                        zzb(sb2, i10, substring, zzcr);
                    } else if (zzcr instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) zzcr).floatValue()) == 0) {
                        }
                        zzb(sb2, i10, substring, zzcr);
                    } else if (zzcr instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) zzcr).doubleValue()) == 0) {
                        }
                        zzb(sb2, i10, substring, zzcr);
                    } else {
                        if (zzcr instanceof String) {
                            equals = zzcr.equals("");
                        } else if (zzcr instanceof zzlh) {
                            equals = zzcr.equals(zzlh.zzb);
                        } else if (zzcr instanceof zznm) {
                            if (zzcr == ((zznm) zzcr).zzcE()) {
                            }
                            zzb(sb2, i10, substring, zzcr);
                        } else {
                            if ((zzcr instanceof Enum) && ((Enum) zzcr).ordinal() == 0) {
                            }
                            zzb(sb2, i10, substring, zzcr);
                        }
                        if (equals) {
                        }
                        zzb(sb2, i10, substring, zzcr);
                    }
                }
            }
            i11 = 3;
        }
        if (zznmVar instanceof zzmc) {
            Iterator zzc = ((zzmc) zznmVar).zzb.zzc();
            if (zzc.hasNext()) {
                throw null;
            }
        }
        zzoj zzojVar = ((zzmf) zznmVar).zzc;
        if (zzojVar != null) {
            zzojVar.zzj(sb2, i10);
        }
    }

    private static void zzd(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }
}
