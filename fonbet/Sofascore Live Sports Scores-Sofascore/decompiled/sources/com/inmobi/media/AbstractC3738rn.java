package com.inmobi.media;

import defpackage.i6c;
import defpackage.vg6;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.rn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3738rn {
    public static final void a(String str) {
        try {
            int i = vg6.r0;
            if (str == null || str.length() == 0) {
                return;
            }
            String str2 = null;
            try {
                HashSet hashSet = i6c.a;
                Field declaredField = i6c.class.getDeclaredField("VERSION");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                String str3 = obj instanceof String ? (String) obj : null;
                if (str3 != null) {
                    if (!StringsKt.R(str3)) {
                        str2 = str3;
                    }
                }
            } catch (Throwable unused) {
            }
            if (str2 == null) {
                throw new Ig(8800);
            }
            C3501ij b = b(str2);
            if (b == null) {
                throw new Ig(8802);
            }
            C3501ij b2 = b(str);
            if (b2 == null) {
                throw new Ig(8803);
            }
            int i2 = b.a;
            int i3 = b2.a;
            if (i2 >= i3) {
                if (i2 != i3 || b.b > b2.b) {
                    throw new Ig(8804);
                }
            }
        } catch (ClassNotFoundException unused2) {
            throw new Ig(8800);
        }
    }

    public static final C3501ij b(String str) {
        List split$default;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 3, 2, null);
        if (split$default.size() < 2) {
            return null;
        }
        int c = c((String) split$default.get(0));
        int c2 = c((String) split$default.get(1));
        int c3 = split$default.size() >= 3 ? c((String) split$default.get(2)) : 0;
        if (c < 0 || c2 < 0) {
            return null;
        }
        return new C3501ij(c, c2, c3);
    }

    public static final int c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!Character.isDigit(str.charAt(i))) {
                str = str.substring(0, i);
                break;
            }
            i++;
        }
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }
}
