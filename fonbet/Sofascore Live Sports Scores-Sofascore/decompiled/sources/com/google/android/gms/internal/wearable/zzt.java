package com.google.android.gms.internal.wearable;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import defpackage.a70;
import defpackage.cp4;
import defpackage.fc6;
import defpackage.zrn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzt {
    public static zzab a(Object obj, ArrayList arrayList) {
        zrn zrnVar;
        zzw n = zzab.n();
        n.k(1);
        if (obj == null) {
            n.k(14);
            return (zzab) n.j();
        }
        zzz s = zzaa.s();
        if (obj instanceof String) {
            n.k(2);
            s.i();
            ((zzaa) s.b).u((String) obj);
        } else if (obj instanceof Integer) {
            n.k(6);
            int intValue = ((Integer) obj).intValue();
            s.i();
            ((zzaa) s.b).y(intValue);
        } else if (obj instanceof Long) {
            n.k(5);
            long longValue = ((Long) obj).longValue();
            s.i();
            ((zzaa) s.b).x(longValue);
        } else if (obj instanceof Double) {
            n.k(3);
            double doubleValue = ((Double) obj).doubleValue();
            s.i();
            ((zzaa) s.b).v(doubleValue);
        } else if (obj instanceof Float) {
            n.k(4);
            float floatValue = ((Float) obj).floatValue();
            s.i();
            ((zzaa) s.b).w(floatValue);
        } else if (obj instanceof Boolean) {
            n.k(8);
            boolean booleanValue = ((Boolean) obj).booleanValue();
            s.i();
            ((zzaa) s.b).A(booleanValue);
        } else if (obj instanceof Byte) {
            n.k(7);
            byte byteValue = ((Byte) obj).byteValue();
            s.i();
            ((zzaa) s.b).z(byteValue);
        } else {
            int i = 0;
            if (obj instanceof byte[]) {
                n.k(1);
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                zrn zrnVar2 = zzcg.b;
                try {
                    if (length == 0) {
                        zrnVar = zzcg.b;
                    } else {
                        zzcg.r(0, length, bArr.length);
                        byte[] bArr2 = new byte[length];
                        System.arraycopy(bArr, 0, bArr2, 0, length);
                        zrnVar = new zrn(bArr2);
                    }
                    s.i();
                    ((zzaa) s.b).t(zrnVar);
                } catch (zzdv e) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                }
            } else if (obj instanceof String[]) {
                n.k(11);
                List asList = Arrays.asList((String[]) obj);
                s.i();
                ((zzaa) s.b).o(asList);
            } else if (obj instanceof long[]) {
                n.k(12);
                long[] jArr = (long[]) obj;
                ArrayList arrayList2 = new ArrayList(jArr.length);
                while (i < jArr.length) {
                    arrayList2.add(Long.valueOf(jArr[i]));
                    i++;
                }
                s.i();
                ((zzaa) s.b).p(arrayList2);
            } else if (obj instanceof float[]) {
                n.k(15);
                float[] fArr = (float[]) obj;
                ArrayList arrayList3 = new ArrayList(fArr.length);
                while (i < fArr.length) {
                    arrayList3.add(Float.valueOf(fArr[i]));
                    i++;
                }
                s.i();
                ((zzaa) s.b).q(arrayList3);
            } else if (obj instanceof Asset) {
                n.k(13);
                arrayList.add((Asset) obj);
                s.i();
                ((zzaa) s.b).r(arrayList.size() - 1);
            } else if (obj instanceof DataMap) {
                n.k(9);
                HashMap hashMap = ((DataMap) obj).a;
                TreeSet treeSet = new TreeSet(hashMap.keySet());
                zzac[] zzacVarArr = new zzac[treeSet.size()];
                Iterator it = treeSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    zzv n2 = zzac.n();
                    n2.i();
                    ((zzac) n2.b).o(str);
                    zzab a = a(hashMap.get(str), arrayList);
                    n2.i();
                    ((zzac) n2.b).p(a);
                    zzacVarArr[i] = (zzac) n2.j();
                    i++;
                }
                List asList2 = Arrays.asList(zzacVarArr);
                s.i();
                ((zzaa) s.b).B(asList2);
            } else {
                if (!(obj instanceof ArrayList)) {
                    cp4.h("newFieldValueFromValue: unexpected value ".concat(obj.getClass().getSimpleName()));
                    return null;
                }
                n.k(10);
                ArrayList arrayList4 = (ArrayList) obj;
                int size = arrayList4.size();
                int i2 = 14;
                Object obj2 = null;
                while (i < size) {
                    Object obj3 = arrayList4.get(i);
                    zzab a2 = a(obj3, arrayList);
                    if (a2.p() != 14 && a2.p() != 2 && a2.p() != 6 && a2.p() != 9) {
                        a70.p("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ".concat(String.valueOf(obj3.getClass())));
                        return null;
                    }
                    if (i2 == 14) {
                        if (a2.p() != 14) {
                            i2 = a2.p();
                            obj2 = obj3;
                            s.i();
                            ((zzaa) s.b).n(a2);
                            i++;
                        } else {
                            i2 = 14;
                        }
                    }
                    if (a2.p() != i2) {
                        String valueOf = String.valueOf(obj2.getClass());
                        String valueOf2 = String.valueOf(obj3.getClass());
                        a70.p(fc6.o(new StringBuilder(valueOf.length() + 80 + valueOf2.length()), "ArrayList elements must all be of the sameclass, but this one contains a ", valueOf, " and a ", valueOf2));
                        return null;
                    }
                    s.i();
                    ((zzaa) s.b).n(a2);
                    i++;
                }
            }
        }
        n.i();
        ((zzab) n.b).o((zzaa) s.j());
        return (zzab) n.j();
    }
}
