package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class udp extends map {
    public static final sdp d = new sdp();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public /* synthetic */ udp(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r5 = (Enum) field2.get(null);
                String name = r5.name();
                String str = r5.toString();
                pap papVar = (pap) field2.getAnnotation(pap.class);
                if (papVar != null) {
                    name = papVar.zza();
                    for (String str2 : papVar.zzb()) {
                        this.a.put(str2, r5);
                    }
                }
                this.a.put(name, r5);
                this.b.put(str, r5);
                this.c.put(r5, name);
            }
        } catch (IllegalAccessException e) {
            a70.j(e);
            throw null;
        }
    }

    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ Object read(e7n e7nVar) {
        if (e7nVar.Q0() == 9) {
            e7nVar.j0();
            return null;
        }
        String f0 = e7nVar.f0();
        Enum r0 = (Enum) this.a.get(f0);
        return r0 != null ? r0 : (Enum) this.b.get(f0);
    }

    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ void write(f7n f7nVar, Object obj) {
        Enum r2 = (Enum) obj;
        f7nVar.H(r2 == null ? null : (String) this.c.get(r2));
    }
}
