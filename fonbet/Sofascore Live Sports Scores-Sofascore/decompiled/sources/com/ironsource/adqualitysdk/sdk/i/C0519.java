package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ە, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0519 extends AbstractC0475 {
    static {
        StringFog.decrypt("QlMD\n", "LDZ0aWgHjpU=\n");
        StringFog.decrypt("Q3TiFQ==\n", "IByDZ3sN7Dw=\n");
        StringFog.decrypt("nGzB7CKjeJuY\n", "/R6zjVv3Aes=\n");
        StringFog.decrypt("Nh+XpxasQAUqMJi2Hbds\n", "WX39wnXYCGQ=\n");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m341(C1102 c1102, ArrayList arrayList) {
        String str;
        int i = 0;
        Class cls = (Class) AbstractC0475.m295(arrayList, 0, Class.class);
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 1) {
            arrayList2 = (List) AbstractC0475.m295(arrayList, 1, List.class);
        }
        Constructor<?> constructor = null;
        List list = arrayList.size() > 2 ? (List) AbstractC0475.m295(arrayList, 2, List.class) : null;
        try {
            if (list != null) {
                Class<?>[] clsArr = new Class[list.size()];
                list.toArray(clsArr);
                String str2 = AbstractC0816.f2624;
                return cls.getConstructor(clsArr).newInstance(arrayList2.toArray());
            }
            String str3 = AbstractC0816.f2624;
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                Constructor<?> constructor2 = constructors[i];
                if (constructor2.getParameterTypes().length == arrayList2.size() && AbstractC0816.m507(constructor2.getParameterTypes(), arrayList2)) {
                    constructor = constructor2;
                    break;
                }
                i++;
            }
            return constructor.newInstance(arrayList2.toArray());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("qj7auS2aucqKLdy/Md361oo7iA==\n", "70yo1l+62rg=\n"));
            sb.append(cls.getName());
            sb.append(StringFog.decrypt("MAE/FZlIkOh3BXY=\n", "EHZWYfFo8Zo=\n"));
            sb.append(arrayList2);
            if (list != null) {
                str = StringFog.decrypt("3guVuwu9hkCNGZ6sCw==\n", "/mr73yve6iE=\n") + list;
            } else {
                str = "";
            }
            sb.append(str);
            throw new C0240(c1102, c1102.f3465, sb.toString(), e);
        }
    }
}
