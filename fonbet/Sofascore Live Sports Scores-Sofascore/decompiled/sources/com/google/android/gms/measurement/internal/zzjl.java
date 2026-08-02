package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.U3;
import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjl {
    public static final zzjl c = new zzjl(100);
    public final EnumMap a;
    public final int b;

    public zzjl(int i) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.a = enumMap;
        zzjk zzjkVar = zzjk.AD_STORAGE;
        zzji zzjiVar = zzji.UNINITIALIZED;
        enumMap.put((EnumMap) zzjkVar, (zzjk) zzjiVar);
        enumMap.put((EnumMap) zzjk.ANALYTICS_STORAGE, (zzjk) zzjiVar);
        this.b = i;
    }

    public static String a(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? NativeAdContent.ViewTag.OTHER : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static zzjl b(int i, Bundle bundle) {
        if (bundle == null) {
            return new zzjl(i);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.a) {
            enumMap.put((EnumMap) zzjkVar, (zzjk) d(bundle.getString(zzjkVar.a)));
        }
        return new zzjl(enumMap, i);
    }

    public static zzjl c(int i, String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArr = zzjj.STORAGE.a;
        for (int i2 = 0; i2 < zzjkVarArr.length; i2++) {
            String str2 = str == null ? "" : str;
            zzjk zzjkVar = zzjkVarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put((EnumMap) zzjkVar, (zzjk) e(str2.charAt(i3)));
            } else {
                enumMap.put((EnumMap) zzjkVar, (zzjk) zzji.UNINITIALIZED);
            }
        }
        return new zzjl(enumMap, i);
    }

    public static zzji d(String str) {
        zzji zzjiVar = zzji.UNINITIALIZED;
        return str == null ? zzjiVar : str.equals("granted") ? zzji.GRANTED : str.equals("denied") ? zzji.DENIED : zzjiVar;
    }

    public static zzji e(char c2) {
        return c2 != '+' ? c2 != '0' ? c2 != '1' ? zzji.UNINITIALIZED : zzji.GRANTED : zzji.DENIED : zzji.POLICY;
    }

    public static char h(zzji zzjiVar) {
        if (zzjiVar == null) {
            return '-';
        }
        int ordinal = zzjiVar.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjl) {
            zzjl zzjlVar = (zzjl) obj;
            zzjk[] zzjkVarArr = zzjj.STORAGE.a;
            int length = zzjkVarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    zzjk zzjkVar = zzjkVarArr[i];
                    if (this.a.get(zzjkVar) != zzjlVar.a.get(zzjkVar)) {
                        break;
                    }
                    i++;
                } else if (this.b == zzjlVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zzjk zzjkVar : zzjj.STORAGE.a) {
            zzji zzjiVar = (zzji) this.a.get(zzjkVar);
            char c2 = '-';
            if (zzjiVar != null && (ordinal = zzjiVar.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c2 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c2 = '1';
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (zzjk zzjkVar : zzjj.STORAGE.a) {
            sb.append(h((zzji) this.a.get(zzjkVar)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int i = this.b * 17;
        while (it.hasNext()) {
            i = (i * 31) + ((zzji) it.next()).hashCode();
        }
        return i;
    }

    public final boolean i(zzjk zzjkVar) {
        return ((zzji) this.a.get(zzjkVar)) != zzji.DENIED;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzjl j(zzjl zzjlVar) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.a) {
            zzji zzjiVar = (zzji) this.a.get(zzjkVar);
            zzji zzjiVar2 = (zzji) zzjlVar.a.get(zzjkVar);
            if (zzjiVar != null) {
                if (zzjiVar2 != null) {
                    zzji zzjiVar3 = zzji.UNINITIALIZED;
                    if (zzjiVar != zzjiVar3) {
                        if (zzjiVar2 != zzjiVar3) {
                            zzji zzjiVar4 = zzji.POLICY;
                            if (zzjiVar != zzjiVar4) {
                                if (zzjiVar2 != zzjiVar4) {
                                    zzji zzjiVar5 = zzji.DENIED;
                                    zzjiVar = (zzjiVar == zzjiVar5 || zzjiVar2 == zzjiVar5) ? zzjiVar5 : zzji.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (zzjiVar == null) {
                    enumMap.put((EnumMap) zzjkVar, (zzjk) zzjiVar);
                }
            }
            zzjiVar = zzjiVar2;
            if (zzjiVar == null) {
            }
        }
        return new zzjl(enumMap, 100);
    }

    public final zzjl k(zzjl zzjlVar) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.a) {
            zzji zzjiVar = (zzji) this.a.get(zzjkVar);
            if (zzjiVar == zzji.UNINITIALIZED) {
                zzjiVar = (zzji) zzjlVar.a.get(zzjkVar);
            }
            if (zzjiVar != null) {
                enumMap.put((EnumMap) zzjkVar, (zzjk) zzjiVar);
            }
        }
        return new zzjl(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (zzjk zzjkVar : zzjj.STORAGE.a) {
            sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            sb.append(zzjkVar.a);
            sb.append(U3.j.b);
            zzji zzjiVar = (zzji) this.a.get(zzjkVar);
            if (zzjiVar == null) {
                zzjiVar = zzji.UNINITIALIZED;
            }
            sb.append(zzjiVar);
        }
        return sb.toString();
    }

    public zzjl(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
