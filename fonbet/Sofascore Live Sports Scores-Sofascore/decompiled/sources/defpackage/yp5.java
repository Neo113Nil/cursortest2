package defpackage;

import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yp5 {
    public static final Logger a = Logger.getLogger(yp5.class.getName());

    public static String a(String str, p4d p4dVar, u4d u4dVar, Object... objArr) {
        StringBuilder sb = new StringBuilder(str);
        if (p4dVar != null) {
            sb.append(", Connection: ");
            sb.append(((o6h) p4dVar.r.get()).q);
        }
        if (u4dVar != null) {
            sb.append(", Consumer: ");
            sb.append(u4dVar.hashCode());
        }
        if (objArr.length % 2 == 0) {
            for (int i = 0; i < objArr.length; i += 2) {
                sb.append(", ");
                sb.append(objArr[i]);
                sb.append(objArr[i + 1]);
            }
        }
        return sb.toString();
    }
}
